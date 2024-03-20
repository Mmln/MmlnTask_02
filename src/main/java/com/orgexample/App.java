package com.orgexample;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "MmlnTask_02 started..." );

//        Fraction fr = new Fraction(2,3);
//        Uttils utt = new Uttils();
//        Fractionable num = utt.cache(fr);

        Fraction fr = new Fraction(2,3);
        Fractionable num = new Utils().cache(fr);

        System.out.print("Должно ... =");
        num.doubleValue();
        System.out.print("Не должно ... =");
        num.doubleValue();
        System.out.print("Не должно ... =");
        num.doubleValue();
        System.out.println("Делаем Num=5 ... =");
        num.setNum(5);
        System.out.print("Должно ... =");
        num.doubleValue();
        System.out.print("Не должно ... =");
        num.doubleValue();

        System.out.println( "MmlnTask_02 finshed..." );
    }
}
