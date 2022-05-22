public class Main {
    public static void main(String[] args) {
        Employee[] bazaSotrudnikov = new Employee[10];
        bazaSotrudnikov[0] = new Employee("Иванов Иван Иванович", 1, 10000);
        bazaSotrudnikov[1] = new Employee("Петров Петр Петрович", 2, 50000);
        bazaSotrudnikov[2] = new Employee("Сергеев Сергей Сергеевич", 3, 45000);
        bazaSotrudnikov[3] = new Employee("Александров Александр Александрович", 4, 75000);
        bazaSotrudnikov[4] = new Employee("Максимов Максим Максимович", 5, 35000);
        bazaSotrudnikov[5] = new Employee("Абдуллин Руслан Мансурович", 4, 100000);
        print (bazaSotrudnikov);
        printFIO(bazaSotrudnikov);
        findSotrudMaxZp(bazaSotrudnikov);
        findSotrudMinZp(bazaSotrudnikov);
        sredneeSalary(bazaSotrudnikov);
        sumSalary(bazaSotrudnikov);
    }

    public static void print(Employee[] employee) {
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            System.out.println(value);

        }
    }
    public static void printFIO(Employee[] employee) {
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            System.out.println(value.getName());

        }
    }
    public static void sumSalary(Employee[] employee) {
        double sum = 0;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            sum += value.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты сотрудникам = " + sum);
    }

    public static void findSotrudMinZp(Employee[] employee) {
        double min = Double.MAX_VALUE;
        Employee minSalary = employee[0];
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getSalary() < min) {
                min = employee[i].getSalary();
                minSalary = employee[i];
            }
        }
        System.out.println("Сотрудник с минимальной зарплатой: " + minSalary.getName());

    }
    public static void findSotrudMaxZp(Employee[] employee) {
        double max = 0;
        Employee maxSalary = employee[0];
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (value.getSalary() > max) {
                max = value.getSalary();
                maxSalary = value;
            }
        }
        System.out.println("Сотрудник с максимальной зарплатой: " + maxSalary.getName());
    }
    public static void sredneeSalary(Employee[] employee) {
        double sum = 0;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            sum += value.getSalary();
        }
        System.out.println("Среднее значение заралат по сотрудникам = " + sum/ employee.length);
    }


}