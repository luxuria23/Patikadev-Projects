package Java.JavaHomeworks;



public class Employee {
    //variables
    String name;
    int salary;
    int workHours;
    int hireYear;

    //test
    public static void main(String[] args) {
        Employee kemal = new Employee("kemal", 2000, 45, 1985);
        kemal.printInfo();
    }

    //constructor
    public Employee(String name, int salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    //Calculate taxes
    public double tax() {        
        double tax = 0;
        if (this.salary>1000) {
            tax = this.salary / 100.0 * 3;
        }
        return tax;
    }

    //bonus work hour
    public double bonus(){
        double bonus = 0;
        if (workHours > 40) {
            bonus = (workHours - 40) * 30;
        }
        return bonus;
    }

    //raise salary depends on hireYear
    public double raiseSalary(){
        double increaseOfSalary = 0;
        if (2021 - this.hireYear < 10) {
            increaseOfSalary = this.salary / 100.0 * 5;
        }else if (2021 - this.hireYear < 20){
            increaseOfSalary = this.salary / 100.0 * 10;
        }else{
            increaseOfSalary = this.salary / 100.0 * 15;
        }
        return increaseOfSalary;
    }

    //printing information
    public void printInfo(){
        double tax = tax();
        double bonus = bonus();
        double raiseSalary = raiseSalary();

        System.out.print(
        "Adi :" + this.name +
        "\nMaasi :" + this.salary +
        "\nCalisma Saati: " + this.workHours +
        "\nVergi :" + tax +
        "\nBonus :" + bonus +
        "\nMaas artisi :" + raiseSalary +
        "\nVergi ve bonuslar ile birlikte maaş" + (this.salary + bonus - tax) +
        "\nToplam maaş :" + (this.salary + raiseSalary)
        );
    }
}
