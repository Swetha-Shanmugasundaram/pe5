package com.stackroute.five;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class MainTestTest {

    MainTest mt;
    @Before
    public void setUp() throws Exception {
        mt = new MainTest();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void afterComparision() {
         Student s1 = new Student(1,"Swetha",18);
         Student s2= new Student(2, "Ajaymad", 98 );
        Student s3= new Student(3, "Ashwini", 23 );
        Student s4= new Student(4, "Santhosh", 45 );
        Student s5= new Student(5, "Ankitha", 22 );

        ArrayList al=new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

//        ArrayList al2= new ArrayList();
//        al2.add(s2);
//        al2.add(s4);
//        al2.add(s3);
//        al2.add(s5);
//        al2.add(s1);

        String str="[Student{id=2, name='Ajaymad', age=98}, Student{id=4, name='Santhosh', age=45}, Student{id=3, name='Ashwini', age=23}, Student{id=5, name='Ankitha', age=22}, Student{id=1, name='Swetha', age=18}]";




        assertEquals(str,mt.afterComparision(al).toString() );
//        System.out.println(mt.afterComparision(al).toString());

    }
}