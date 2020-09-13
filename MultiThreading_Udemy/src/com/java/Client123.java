package com.java;

 interface I1 {
    default void i1()
    {
        System.out.println("I1 in "+I1.class);
    }
}


 interface I2 extends  I1{
    default void i1()
    {
        System.out.println("I1 in "+ I2.class);
    }
    default void i2()
    {
        System.out.println("I2 in "+ I2.class);
    }
}



 interface I3 extends  I2{

    default void i2()
    {
        System.out.println("I2 in "+ I3.class);
    }
    default void i3()
    {
        System.out.println("I3 in "+ I3.class);
    }
}




public class Client123 implements  I1,I2,I3{

   
    public void i1()
    {
        System.out.println("I1 in "+Client123.class);
    }
    public static void main(String[] args) {
        Client123 c =new  Client123();
        c.i1(); // override default method child class get precedence
        c.i2();
        c.i3();
    }
}