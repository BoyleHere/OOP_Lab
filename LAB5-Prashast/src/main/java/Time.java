public class Time {
    
    private int hr,min,sec;
    
    public Time()
    {
        this.hr=0;
        this.min=0;
        this.sec=0;
    }
    
    public Time(int hr,int min,int sec)
    {
        this.hr=hr;
        this.min=min;
        this.sec=sec;
    }
    
    public void display()
    {
         System.out.printf("%02d:%02d:%02d%n",hr,min,sec);
    }
    
    public Time add(Time other)
    {
        Time sum=new Time();
        
        sum.sec=this.sec+other.sec;
        sum.min=this.min+other.min+sum.sec/60;
        sum.hr=this.hr+other.hr+sum.min/60;

        sum.min %= 60;
        sum.hr %= 60;
        
        return sum;
    }
    
    public static void main(String[] args)
    {
        Time t1=new Time(1,20,15);
        Time t2=new Time(2,30,35);
        
        System.out.print("Time 1 is : ");
        t1.display();
        
        System.out.print("Time 2 is : ");
        t2.display();
        
        System.out.print("Sum of Time 1 and Time 2 is : ");
        Time sum = t1.add(t2);
        sum.display();
        
        
    }
    
}
