class Emplyee {
    double baseSalary;
    double calculateSalary() {
        return baseSalary;
    }
}

class SalesEmployee extends Emplyee {
    double bonus;
        @Override
    double calculateSalary() {
        return super.calculateSalary() + bonus;
    }
}
class MainEmp {
    public static void main(String[] args) {
        SalesEmployee se = new SalesEmployee();
        se.baseSalary = 45000.0;
        se.bonus=12000.00;
        System.out.println(se.calculateSalary());
    }
}