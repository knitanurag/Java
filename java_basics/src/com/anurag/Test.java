package com.anurag;

class Test
{
    static int a = 1;
    static int b = 2;
 
    Test func(Test obj)
    {
        Test obj3 = new Test();
        obj3 = obj;
        obj3.a = obj.a++ + ++obj.b;
        obj.b = obj.b;
        return obj3;
    }
 
    public static void main(String[] args)
    {
    	a = a++ + ++b;
    	System.out.println(a);
    	System.out.println(b);
        Test obj1 = new Test();
        Test obj2 = obj1.func(obj1);
 
        System.out.println("obj1.a = " + obj1.a + "  obj1.b = " + obj1.b);
        System.out.println("obj2.a = " + obj2.a + "  obj1.b = " + obj2.b);
 
    }
}