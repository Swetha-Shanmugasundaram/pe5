package com.stackroute.five;

import java.util.Collections;
import java.util.List;

public class MainTest {
    public List afterComparision(List student){
        StudentSorter so = new StudentSorter();
        Collections.sort(student,so);
        return student;
    }
}
