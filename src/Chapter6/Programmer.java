package Chapter6;

// Parent class

class  Employee{
    float salary = 40000;
    float dashainbonus= 40000;
}

//Child class

class Programmer extends  Employee {
    int bonus =10000;


    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary is: " + p.salary);
        System.out.println("Bonus of Programmer is : " + p.bonus);
        System.out.println("DashainBonus of programmer is : " + p.dashainbonus);

        float totalSalary = p.salary+ p.bonus+ p.dashainbonus;
        System.out.println("The total salary of empolyee is " + totalSalary);
    }
}
