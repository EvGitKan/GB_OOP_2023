package task3;

public class Worker extends Employee {

    @Override
    public double calculateSalary() {
        return salary;
    }

    public Worker(String surname, String name, double salary, int age) {
        super(surname, name, salary, age);
    }

    @Override
    public String toString() {
        return String.format("%s %s; Рабочий; Среднемесячная ЗП - %.2f; Возраст - %d лет", surName, name, calculateSalary(), age);
    }
}
