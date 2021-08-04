package org.jfqqqq.test;

import org.jfqqqq.test.pojo.cmd_args_test.Arg;
import org.jfqqqq.test.util.CmdArgsParseUtil;

//import java.util.Arrays;

public class CmdArgsLoadTest {
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(args)); 输出为： [-age, 18, -say, hello, -height, 180]

        Arg arg = CmdArgsParseUtil.parse(args);
        System.out.println(arg);
    }
}
