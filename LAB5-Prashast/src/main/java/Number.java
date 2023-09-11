public class Number {
    
    private double num;
    
    public Number(double num)
    {
        this.num=num;
    }
    
    public boolean isZero()
    {
        return num == 0;
    }
    
    public boolean isPositive()
    {
        return num > 0;
    }
    
    public boolean isNegative()
    {
        return num < 0;
    }
    
    public boolean isOdd()
    {
        return num %2 != 0;
    }
    
    public boolean isEven()
    {
         return num %2 == 0;
    }
    
    public boolean isPrime()
    {
        if(num <= 1){
            return false;
        }
        
        for(int i=2;i * i <= num;i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }
    
    public boolean isArmstrong()
    {
        int n=(int)num;
        int original=n;
        int sum=0;
        
        while(n>0){
            int digit = n%10;
            sum += (int) Math.pow(digit, 3);
            n /= 10;
        }
        
        return sum == original;
    }
    
    public static void main(String[] args)
    {
        
        Number n1=new Number(0);
        Number n2=new Number(10);
        Number n3=new Number(-9);
        Number n4=new Number(3);
        Number n5=new Number(153);
        
        System.out.println("Is Zero : "+n1.isZero());
        System.out.println("Is Positive : "+n2.isPositive());
        System.out.println("Is Negative : "+n3.isNegative());
        System.out.println("Is Odd : "+n4.isOdd());
        System.out.println("Is Even : "+n2.isEven());
        System.out.println("Is Prime : "+n4.isPrime());
        System.out.println("Is Armstrong : "+n5.isArmstrong());
       
    }
            
    
}
