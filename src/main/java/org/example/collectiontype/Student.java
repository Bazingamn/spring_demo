package org.example.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student {
    private String[] courses;
    private List<String> list;
    private Map<String, String> map;
    private Set<String> set;

    private List<Course> listcourse;

    public void setListcourse(List<Course> listcourse) {
        this.listcourse = listcourse;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courses=" + Arrays.toString(courses) +
                ",\n list=" + list +
                ",\n map=" + map +
                ",\n set=" + set +
                ",\n listcourse=" + listcourse +
                '}';
    }
}
