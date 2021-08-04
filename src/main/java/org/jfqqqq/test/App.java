package org.jfqqqq.test;

import org.jfqqqq.test.pojo.Arg;
import org.jfqqqq.test.util.ParseUtil;

//import java.util.Arrays;

public class App {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args)); 输出为： [-age, 18, -say, hello, -height, 180]

        Arg arg = ParseUtil.parse(args);
        System.out.println(arg);
    }
}
