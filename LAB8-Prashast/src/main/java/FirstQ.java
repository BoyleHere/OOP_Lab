/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
interface sales{
    void salescalculator();
}
class hardware implements sales{
    String category;
    String manufacturer;
    int Sales;
    
    hardware(String c, String m, int sales){
        this.category=c;
        this.manufacturer = m;
        this.Sales=sales;
    }
    
    @Override
    public void salescalculator(){
        System.out.println(Sales);
    }
}

class software implements sales{
    String type;
    String os;
    int sales;
    software(String type, String os, int sales){
        this.type=type;
        this.os=os;
        this.sales=sales;
    }
    
    @Override
    public void salescalculator(){
        System.out.println(sales);
    }
}