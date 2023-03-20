package Array;

import Constructor.Constructor;

import java.util.Arrays;

public class array {


    public static void main(String[] args) {

//        Int Array
//        int a[] = new int[5];
//        a[0]=10;
//        a[1]=20;
//        a[2]=30;
//        a[3]=40;
//        a[4]=50;
//        System.out.println("A= "+a[0]+"\nA= "+a[1]+"\nA= "+a[2]+"\nA= "+a[3]+"\nA= "+a[4]);


//    }


//        String Array

//        String[] name = new String[4];
//        name[0] = "Test1";
//        name[1] = "Test2";
//        name[2] = "Test3";
//        name[3] = "Test4";
//
//        for (int i=0; i<name.length; i++){
//            System.out.println("name= " + name[i]);
//        }

//        Object Array

        Object StudentD[] = new Object[10];
        StudentD[0] = 1;
        StudentD[1] = "Tester Test";
        StudentD[2] = 'M';
        StudentD[3] = 85.87;
        StudentD[4] = true;
        StudentD[5] = 123456789L;
        StudentD[6] = "6";
        StudentD[7] = "7";
        StudentD[8] = "8";
        StudentD[9] = "9";
        for (int i = 0; i<StudentD.length; i++){
            System.out.println("StudentD= " + StudentD[i]);

        }

    }
}
