public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aryan", 1,200);
        int check = (int) ((Math.random() * 10)) % 2;
        if (check == 0) {
            e1.attendance = false;
        } else {
            e1.attendance = true;
        }
        if (e1.attendance) {
            System.out.println("Employee is present");
            e1.workHour = 8;
        } else {
            System.out.println("Employee is absent");
        }
        Main m1 = new Main();
        System.out.println(m1.calculateSalary(e1));


    }
    double calculateSalary(Employee e){
        return e.workHour*e.wagePerHour;
    }
}