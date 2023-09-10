package task3;

public abstract class Employee implements Comparable<Employee> {
    /**
     * Имя
     */
    protected String name;
    /**
     * Фамилия
     */
    protected String surName;
    /**
     * Ставка зп
     */
    protected double salary;
    /**
     * Возраст
     */
    protected int age;


    public abstract double calculateSalary();

    public Employee(String name, String surName, double salary, int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%s %s", surName, name);
    }

    @Override
    public int compareTo(Employee o) {
        return this.age - o.age;
    }

}
