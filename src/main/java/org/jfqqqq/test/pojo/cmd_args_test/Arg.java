package org.jfqqqq.test.pojo.cmd_args_test;

public class Arg {
    private Integer age;
    private String say;
    private Integer height;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Arg{" +
                "age=" + age +
                ", say='" + say + '\'' +
                ", height=" + height +
                '}';
    }
}
