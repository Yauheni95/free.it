package by.freee.it.lesson15.task5;

public class Student {
    private String name;
    private String surname;
    private Class class1;

    public Student(String name, String surname, Class class1) {
        this.name = name;
        this.surname = surname;
        this.class1 = class1;
    }

    public Class getClass1() {
        return class1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", class=" + class1 +
                '}';
    }

    enum Class {
        A("Class A"),
        B("Class B"),
        C("Class C");
        private String code;

        Class(String code) {
            this.code = code;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        @Override
        public String toString() {
            return "Class{" +
                    "code='" + code + '\'' +
                    '}';
        }
    }
}
