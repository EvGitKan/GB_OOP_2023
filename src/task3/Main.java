package task3;

import java.util.*;

public class Main {
    private static Random random = new Random();

    public static Employee generateEmployee() {
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        int salaryIndex = random.nextInt(500, 900);
        int countWorkHours = random.nextInt(40, 180);
        int ageWorker = random.nextInt(18, 60);
        boolean typeEmployee = random.nextBoolean();
        return typeEmployee ?
                new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * 168, ageWorker) :
                new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salaryIndex * countWorkHours, ageWorker) {
                };
    }

    public static List<Employee> generateEmployees(int counter) {
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < counter; i++) {
            employees.add(generateEmployee());
        }
        return employees;
    }

    public static void main(String[] args) {
        List<Employee> newEmployees = generateEmployees(12);
        newEmployees.sort(Employee::compareTo);
        for (Employee employee : newEmployees) {
            System.out.println(employee);
        }
    }
}
