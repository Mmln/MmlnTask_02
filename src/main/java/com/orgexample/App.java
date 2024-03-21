package com.orgexample;

public class App
{
    public static void main( String[] args )
    {
        System.out.println( "MmlnTask_02 started..." );

        Object fr;
        fr = new Fraction(2,3).getProxy();
        Fractionable num = new Utils().cache((Fractionable)fr);

        System.out.println("Point 00 cached value may be {-1=null, 0=false, 1=true}, then Utils().cache was called, now cached is = " + FractionableInvHandler.isCached());
        System.out.println( "" );

        System.out.print("Point 01 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 02 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 03 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 04 call setNum(5), cached=" + FractionableInvHandler.isCached() + ", then ");
        num.setNum(5);
        System.out.print("Point 05 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 06 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 07 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 08 call setDenum(10), cached=" + FractionableInvHandler.isCached() + ", then ");
        num.setDenum(10);
        System.out.print("Point 09 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 10 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();
        System.out.print("Point 11 before calling num.doubleValue(), cached = " + FractionableInvHandler.isCached() + " then ");
        num.doubleValue();

        System.out.println( "" );
        System.out.println( "MmlnTask_02 finshed..." );
    }
}
