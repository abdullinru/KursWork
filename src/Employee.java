public class Employee {
    private String name;
    private int otdel;
    private double salary;

    private int id;

    public Employee(String name, int otdel, double salary) {
        this.name = name;
        this.otdel = otdel;
        this.salary = salary;
        this.id = ++schetcik;
    }

    public String getName() {
        return name;
    }

    public int getOtdel() {
        return otdel;
    }

    public double getSalary() {
        return salary;
    }

    public int setId() {
        return id;
    }

    public void setOtdel(int otdel) {
        this.otdel = otdel;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Сотрудник id: " + id +
                ", ФИО: " + name +
                ", Отдел: " + otdel +
                ", Зарплата: " + salary;
    }
    static int schetcik = 0;
}



