/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class Bank {
    public int getRateOfInterest() {
        return 0;
    }
}

public class SBI extends Bank {
    public int getRateOfInterest() {
        return 8;
    }
}

public class ICICI extends Bank {
    public int getRateOfInterest() {
        return 7;
    }
}

public class AXIS extends Bank {
    public int getRateOfInterest() {
        return 9;
    }
}

public class Main {
    public static void main(String[] args) {
        Bank sbi = new SBI();
        Bank icici = new ICICI();
        Bank axis = new AXIS();

        int sbiInterest = sbi.getRateOfInterest();
        int iciciInterest = icici.getRateOfInterest();
        int axisInterest = axis.getRateOfInterest();

        System.out.println("SBI interest rate: " + sbiInterest + "%");
        System.out.println("ICICI interest rate: " + iciciInterest + "%");
        System.out.println("AXIS interest rate: " + axisInterest + "%");
    }
}
