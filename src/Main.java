public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Aryan", 1,200);
        int check = (int) ((Math.random() * 10)) % 3;
        if (check == 0) {
            e1.attendance = 0;
        } else if(check == 1){
            e1.attendance = 1;
        }else{
            e1.attendance = 2;
        }
        switch(e1.attendance){
            case 1:
                System.out.println("Employee is present");
                e1.workHour = 8;
                break;
            case 2:
                System.out.println("Employee is absent");
                break;
            default:
                System.out.println("Employee is part time");
                e1.workHour = 4;
        }
        Main m1 = new Main();
        System.out.println(m1.calculateSalary(e1));


    }
    double calculateSalary(Employee e){
        return e.workHour*e.wagePerHour;
    }
}