 class Employee {
     private String name;
     private double salary;

     public Employee(String name, double salary) {
         this.name = name;
         this.salary = salary;
     }

     public String getName() {
         return name;
     }

     public double getSalary() {
         return salary;
     }
 }


 class EmployeeRepository {
     public void saveToDatabase(Employee employee) {
         System.out.println("Сохранение " + employee.getName() + " в базу данных.");
     }
 }

 class BonusCalculator {
     public double calculateBonus(Employee employee) {
         return employee.getSalary() * 0.1;
     }
 }

 class PayslipPrinter {
     public void printPayslip(Employee employee) {
         System.out.println("Расчетный листок для " + employee.getName());
     }
 }

  class Main {
     public static void main(String[] args) {
         Employee employee = new Employee("Иван", 50000);

         EmployeeRepository repository = new EmployeeRepository();
         repository.saveToDatabase(employee);

         BonusCalculator calculator = new BonusCalculator();
         System.out.println("Бонус: " + calculator.calculateBonus(employee));

         PayslipPrinter printer = new PayslipPrinter();
         printer.printPayslip(employee);
     }
 }
