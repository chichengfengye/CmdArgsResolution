package org.jfqqqq.test;

import org.jfqqqq.test.pojo.yml_test.YmlPojo;
import org.jfqqqq.test.util.YmlLoader;

public class YmlLoadTest {
    public static void main(String[] args) {
        String path = "F:\\CmdArgsResolution\\src\\main\\resources\\configs\\config.yml";
        YmlPojo ymlPojo = YmlLoader.loadFile(path, YmlPojo.class);
        System.out.println(ymlPojo);
    }
}
