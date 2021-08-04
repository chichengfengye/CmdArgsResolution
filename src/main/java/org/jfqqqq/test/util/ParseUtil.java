package org.jfqqqq.test.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.commons.cli.*;
import org.jfqqqq.test.pojo.Arg;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class ParseUtil {
    private static ObjectMapper objectMapper = new ObjectMapper();

    public static Arg parse(String[] args) {
        CommandLineParser parser = new DefaultParser();
        //获取字段
        Field[] declaredFields = Arg.class.getDeclaredFields();
        //使用字段创建options，options是parse需要的参数
        Options options = new Options();
        for (Field declaredField : declaredFields) {
            String name = declaredField.getName();
            Option option = Option.builder(name).argName(name)
                    .desc(name)
                    .hasArg(true)
                    .type(declaredField.getType())
                    .build();
            options.addOption(option);
        }
        try {
            CommandLine cl = parser.parse(options, args);
            Arg arg = new Arg();
            for (Field declaredField : declaredFields) {
                String optionValue = cl.getOptionValue(declaredField.getName());
                Class<?> type = declaredField.getType();
                declaredField.setAccessible(true);
                Object value = changeType(type, optionValue);
                declaredField.set(arg, value);
            }
            return arg;
        } catch (ParseException | IllegalAccessException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static <T>T changeType(Class<T> clazz, String value) {
        Class<? extends String> aClass = value.getClass();
        try {
            Constructor<T> declaredConstructor = clazz.getDeclaredConstructor(aClass);
            T instance = declaredConstructor.newInstance(value);
            return instance;
        } catch (NoSuchMethodException e) {
            System.out.println("没有string类型的构造函数...无法完成转换...");
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

}
