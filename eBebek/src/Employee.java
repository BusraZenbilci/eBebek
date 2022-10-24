/*
** author: Büşra Zenbilci
*/

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;


    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }


    public double tax() {

        if (salary > 1000) {
            return (getSalary() * 3) / 100;
        } else return 0;

    }

    public double bonus() {
        if (workHours > 40) {
            return (getWorkHours() - 40) * 30;
        } else return 0;
    }

    public double raiseSalary() {

        int calismaSüresi = (2021 - hireYear);

        if (calismaSüresi < 10 && calismaSüresi > 0) {
            return (getSalary() * 5) / 100;
        } else if (calismaSüresi > 9 && calismaSüresi < 20) {
            return (getSalary() * 10) / 100;
        } else if (calismaSüresi > 20) {
            return (getSalary() * 15) / 100;
        } else
            return 0;

    }


    public double vergiVeBonuslarlaMaas() {
        return salary + bonus() - tax();
    }

    public double sonMaas() {
        return salary + bonus() + raiseSalary() - tax();
    }

    @Override
    public String toString() {
        return
                "Adı : " + name + "\n" +
                        "Maaşı : " + salary + "\n" +
                        "Çalışma saati : " + workHours + "\n" +
                        "Başlangıç yılı : " + hireYear + "\n" +
                        "Vergi : " + tax() + "\n" +
                        "Bonus : " + bonus() + "\n" +
                        "Maas artisi : " + raiseSalary() + "\n" +
                        "Vergi ve bonuslar ile birlikte maaş : " + vergiVeBonuslarlaMaas() + "\n" +
                        "Toplam Maaş : " + sonMaas();

    }

    public static void main(String[] args) {
        Employee employee = new Employee(
                "kemal",
                2000.0,
                45,
                1985);

        System.out.println(employee);

    }
}
