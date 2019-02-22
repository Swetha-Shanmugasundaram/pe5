package com.stackroute.five;

import java.util.Comparator;

public class StudentSorter implements Comparator {

    @Override
    public int compare(Object o, Object t1) {
        if (((Student)(o)).getAge()>((Student)(t1)).getAge()){
            return -1;
        }
        else if (((Student)(o)).getAge()==((Student)(t1)).getAge()){
            if (((Student)(o)).getName().compareTo(((Student)(t1)).getName())>0){
                return -1;
            }
            else if(((Student)(o)).getName().compareTo(((Student)(t1)).getName())==0){
                if (((Student)(o)).getId()>(((Student)(t1)).getId())){
                    return -1;
                }
                else {
                    return 1;
                }

            }
            else {
                return 1;
            }
        }
        else {
            return 1;
        }
    }
}
