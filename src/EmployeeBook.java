public class EmployeeBook {
    private Employee[] employee;

    public EmployeeBook(Employee[] employee) {
        this.employee = employee;
    }

    public void addNewSotrud(String  name, int otdel, double salary) {
        int index = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                index = i;
                break;
            }
        }
        employee[index] = new Employee(name, otdel, salary);
    }
    public void delSotrud(String name) {
        int index = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getName() == name) {
                index = i;
                break;
            }
        }
        employee[index] = null;
    }
    public void delSotrud(int id) {
        int index = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getId() == id) {
                index = i;
                break;
            }
        }
        employee[index] = null;
    }

    public void changeSotrud(String name, int newOtdel, double newSalary) {
        int index = 0;
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            if (employee[i].getName() == name) {
                index = i;
                break;
            }
        }
        employee[index].setSalary(newSalary);
        employee[index].setOtdel(newOtdel);
    }

    public void printVseOtdely() {
        for (int i = 1; i < 6; i++) {
            printOtdel(i);

        }
    }

    public void sotrudZpMore(double salary) {
        System.out.println("Информация по струдникам с зарплатой больше, чем " + salary + " рублей");
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (value.getSalary() > salary) {
                System.out.println("Сотрудник id: " + value.getId() +
                        ", ФИО: " + value.getName() +
                        ", Зарплата: " + value.getSalary());
            }
        }
    }

    public void sotrudZpLess (double salary) {
        System.out.println("Информация по струдникам с зарплатой меньше, чем " + salary + " рублей");
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (value.getSalary() < salary) {
                System.out.println("Сотрудник id: " + value.getId() +
                        ", ФИО: " + value.getName() +
                        ", Зарплата: " + value.getSalary());
            }
        }
    }

    public Employee[] bazaSotrudnikovOtdela(int otdel) {
        int count = 0;
        Employee[] sotrudOtdela = new Employee[employee.length];
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            if (otdel == value.getOtdel()) {
                sotrudOtdela[count] = value;
                count++;
            }
        }
        return sotrudOtdela;
    }
    public void sotrudMinZpOtdel(int otdel) {
        System.out.println("Отдел № " + otdel);
        EmployeeBook book1 = new EmployeeBook(bazaSotrudnikovOtdela(otdel));
        book1.findSotrudMinZp();
    }

    public void sotrudMaxZpOtdel(int otdel) {
        System.out.println("Отдел № " + otdel);
        EmployeeBook book1 = new EmployeeBook(bazaSotrudnikovOtdela(otdel));
        book1.findSotrudMaxZp();
    }

    public void sumSalaryOtdel(int otdel) {
        System.out.println("Отдел № " + otdel);
        EmployeeBook book1 = new EmployeeBook(bazaSotrudnikovOtdela(otdel));
        book1.sumSalary();
    }

    public void sredneeSalaryOtdel(int otdel) {
        System.out.println("Отдел № " + otdel);
        EmployeeBook book1 = new EmployeeBook(bazaSotrudnikovOtdela(otdel));
        book1.sredneeSalary();
    }

    public void indexSalaryOtdel(int otdel, int procent) {
        System.out.println("Отдел № " + otdel);
        EmployeeBook book1 = new EmployeeBook(bazaSotrudnikovOtdela(otdel));
        book1.indexSalary(procent);
    }

    public void printOtdel(int otdel) {
        System.out.println("Отдел № " + otdel);
        EmployeeBook book1 = new EmployeeBook(bazaSotrudnikovOtdela(otdel));
        for (Employee value : book1.employee) {
            if (value == null) {
                continue;
            }
            System.out.println("Сотрудник id: " + value.getId() +
                    ", ФИО: " + value.getName() +
                    ", Зарплата: " + value.getSalary());
        }
    }

    public void indexSalary (int procent) {
        System.out.println("Увеличение зарплаты на " + procent + " процентов");
        for (int i = 0; i < employee.length; i++) {
            if (employee[i] == null) {
                continue;
            }
            double newSalary = employee[i].getSalary() * (1 + (procent*1.0)/100);
            employee[i].setSalary(newSalary);
        }

    }

    public void print() {
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            System.out.println(value);

        }
    }
    public void printFIO() {
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            System.out.println(value.getName());

        }
    }
    public void sumSalary() {
        double sum = 0;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            sum += value.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты сотрудникам = " + sum);
    }

    public void findSotrudMinZp() {
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
    public  void findSotrudMaxZp() {
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
    public void sredneeSalary() {
        double sum = 0;
        int count = 0;
        for (Employee value : employee) {
            if (value == null) {
                continue;
            }
            sum += value.getSalary();
            count++;
        }
        System.out.println("Среднее значение зарплат по сотрудникам = " + sum/ count);
    }

}
