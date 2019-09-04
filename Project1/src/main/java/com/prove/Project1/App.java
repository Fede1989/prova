package com.prove.Project1;


public class App 
{
    public static void main( String[] args )
    {
    	Person p=new Person();
    	p.wearingShirt();
    	
       System.out.println(p.getShirt()+"\n"+ p.getTrousers());
    }
}
