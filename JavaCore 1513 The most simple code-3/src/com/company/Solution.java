package com.company;

/*
1513. The most simple code-3
Simplify the code:
- remove everything that will be generated automatically during compilation
- remove all class inheritance, which will be added automatically at compilation anyway
- remove all the constructors that are created and added automatically.

Requirements:
1. The Car class should not have explicitly implemented constructors without parameters.
2. The Machine class should not have explicitly implemented constructors without parameters.
3. The Car class must be a descendant of the Machine class.
4. The code should not have explicit inheritance from Object (extends Object).
5. The Car class should not explicitly inherit the Runnable interface.

 */

public class Solution {
    public static void main(String[] args) {
    }

    public interface Runnable {

    }

    public class Machine implements Runnable {
//        public Machine()
//        {
//            super();
//        }
    }

    public class Car extends Machine { //implements Runnable {
//        public Car() {
//            super();
//        }
    }
}
