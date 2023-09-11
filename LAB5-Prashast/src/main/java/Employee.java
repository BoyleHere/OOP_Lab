public class Employee {
    
    private String Employee_name,city;
    private int basic_salary,dearness_allowance,house_rent;
    
    void getData(String Employee_name,String city,int basic_salary,int dearness_allowance,int house_rent)
    {
        this.Employee_name=Employee_name;
        this.city=city;
        this.basic_salary=basic_salary;
        this.dearness_allowance=dearness_allowance;
        this.house_rent=house_rent;
    }
    
    public double calculate()
    {
        double Total = basic_salary + (basic_salary * dearness_allowance/100) + (basic_salary * house_rent/100);
        return Total;
    }
    
    public void display()
    {
        double Salary =  calculate();
        System.out.println("Employee name : "+Employee_name);
        System.out.println("City : "+city);
        System.out.println("Total Salary : "+Salary);
    }
    
        public static void main(String[] args)
        {
            Employee e = new Employee();
            e.getData("Prashast Saxena", "Delhi", 50000, 20, 10);
            e.display();
            
        }
    
}
