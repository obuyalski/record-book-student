package com.company.items;

/**
 * Created by Олег on 12.10.2016.
 */
public class Subject {
        private String name;
        private int hours;
        //если что сюда дату пихать еще

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHours() {
            return hours;
        }

        public void setHours(int hours) {
            this.hours = hours;
        }


        public String toString() {
            return "Subject{" +
                    "name='" + name + '\'' +
                    ", hours=" + hours +
                    '}';
        }
}
