package org.jfqqqq.test.pojo.yml_test;

import org.jfqqqq.test.pojo.cmd_args_test.Arg;

import java.util.Arrays;
import java.util.List;

public class YmlPojo extends Arg {
    private String[] sports;
    private List<String> foods;
    private List<Idol> idols;
    private Teacher[] teachers;

    public String[] getSports() {
        return sports;
    }

    public void setSports(String[] sports) {
        this.sports = sports;
    }

    public List<String> getFoods() {
        return foods;
    }

    public void setFoods(List<String> foods) {
        this.foods = foods;
    }

    public List<Idol> getIdols() {
        return idols;
    }

    public void setIdols(List<Idol> idols) {
        this.idols = idols;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }

    @Override
    public String toString() {
        String toString = super.toString();
        return toString + "YmlPojo{" +
                "sports=" + Arrays.toString(sports) +
                ", foods=" + foods +
                ", idols=" + idols +
                ", teachers=" + Arrays.toString(teachers) +
                '}';
    }
}
