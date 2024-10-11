package com.pluralsight;

    class Human
    {

        private int age = 11;
        private String name = "Mordecai";

        public Human()
        {
            age = 25;
            name = "morde";
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

        public class Demo {

            public static void main(String a[]) {

                Human obj = new Human();
//            obj.age = 11;
//            obj.name = "Mordecai";

                System.out.println(obj.getName() + " : " + obj.getAge());

            }


        }







