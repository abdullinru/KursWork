public class Main {
    public static void main(String[] args) {
        Employee[] bazaSotrudnikov = new Employee[10];
        bazaSotrudnikov[0] = new Employee("Иванов Иван Иванович", 1, 10000);
        bazaSotrudnikov[1] = new Employee("Петров Петр Петрович", 2, 50000);
        bazaSotrudnikov[2] = new Employee("Сергеев Сергей Сергеевич", 3, 45000);
        bazaSotrudnikov[3] = new Employee("Александров Александр Александрович", 4, 75000);
        bazaSotrudnikov[4] = new Employee("Максимов Максим Максимович", 5, 35000);
        bazaSotrudnikov[5] = new Employee("Абдуллин Руслан Мансурович", 4, 100000);

        EmployeeBook book = new EmployeeBook(bazaSotrudnikov);
        book.print();
        book.printFIO();
        book.printOtdel(4);

        book.findSotrudMaxZp();
        book.findSotrudMinZp();
        book.sumSalary();
        book.sredneeSalary();
        book.indexSalary(10);
        System.out.println();

        book.print();
        System.out.println();
        book.sotrudZpLess(60000);
        book.sotrudZpMore(100000);
        System.out.println();

        book.sredneeSalaryOtdel(4);
        book.sumSalaryOtdel(4);
        book.indexSalaryOtdel(4, 15);
        book.sotrudMaxZpOtdel(4);
        book.sotrudMinZpOtdel(4);
        book.addNewSotrud("Сергеев сергей сергеевич", 4, 100000);
        book.delSotrud(3);
        book.printVseOtdely();
        book.changeSotrud("Абдуллин Руслан Мансурович", 3, 200000);
        book.printVseOtdely();

//        print (bazaSotrudnikov);
//        printFIO(bazaSotrudnikov);
//        findSotrudMaxZp(bazaSotrudnikov);
//        findSotrudMinZp(bazaSotrudnikov);
//        sredneeSalary(bazaSotrudnikov);
//        sumSalary(bazaSotrudnikov);
//        indexSalary(bazaSotrudnikov,15);
//        print(bazaSotrudnikov);
//
//        sotrudZpLess(bazaSotrudnikov, 70000);
//        sotrudZpMore(bazaSotrudnikov, 100000);
//
//        sotrudMinZpOtdel(bazaSotrudnikov, 4);
//        sotrudMaxZpOtdel(bazaSotrudnikov, 4);
//        sumSalaryOtdel(bazaSotrudnikov, 4);
//        sredneeSalaryOtdel(bazaSotrudnikov, 4);
//        indexSalaryOtdel(bazaSotrudnikov,4, 5);
//        printOtdel(bazaSotrudnikov, 4);
    }





}