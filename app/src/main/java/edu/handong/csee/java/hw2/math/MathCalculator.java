package edu.handong.csee.java.hw2.math;

/**
 * This is MathCalculator.
 */

public class MathCalculator {
    private String name;

 /**
  * This is setName.
  * @param x This is string
    This for setting private name of MathCalculator
  */   

    public void setName(String x){
        name=x;
    }
/**
 * This is getName
 * @return  This is for returning string name.
 */
    public String getName(){
        return name;
        }
/**
 * This is getMax.
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting a Max by comparing a and b.
 */
        
    public int getMax(int a, int b){
        int Max;
        if(a>=b)
            Max=a;
        else    
            Max=b;
        
            return Max;
        }
/**
 * This is getMin.
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting Min by comparing a and b.
 */
    public int getMin(int a, int b){
        int Min;
        if(a>=b)
            Min=b;
        else
            Min=a;
        return Min;
    }
/**
 * This is getAbs.
 * @param a This is integer.
 * @return This is for getting absolute value.
 */
    public int getAbs(int a){
        int Abs;
        if(a<0)
            Abs= -a;
        else
            Abs= a;
        return Abs;
    }
/**
 * This is getSum
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting sum of a and b.
 */
    public int getSum(int a, int b){
        int Sum;
        Sum= a+b;
        return Sum;
    }
/**
 * This is getDiff.
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting difference of a and b
 */
    public int getDiff(int a, int b){
        int Diff;
        Diff=a-b;
        return Diff;
    }
/**
 * This is getProduct
 * @param a THis is integer
 * @param b This is integer
 * @return This is for getting product of a and b.
 */
    public int getProduct(int a, int b){
        int Product;
        Product= a*b;
        return Product;
    }
/**
 * This getQuotient.
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting quotient.
 */
    public int getQuotient(int a, int b){
        int Quotient;
        Quotient = a/b;
        return Quotient;
    }
/**
 * This is getRemainder
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting remainder.
 */    
    public int getRemainder(int a, int b){
        int Remainder;
        Remainder =a%b;
        return Remainder;
    }
/**
 * This is getPower.
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting Power. ex) a=4, b=3 Power= 4*4*4=64
*/    
    public int getPower(int a, int b){
        int Power=a;
        if(b==0){
            Power=1;
        }
        else{
        for(int i=0; i<b-1; i++)
            Power= Power*a;
        }
        return Power;

    }
/**
 * This is getFactorial.
 * @param a This is integer.
 * @return This is for getting factorial. ex) a=4 factorial= 4*3*2*1=24
 */
    public int getFactorial(int a){
        int Factorial=a;
        if(a==0){
            Factorial=1;
        }
        else{
        for(int i=a-1;i>0;i--)
            Factorial=Factorial*i;
        }
        return Factorial;
    }
/**
 * This is getGcd.
 * @param a This is integer.
 * @param b This is integer.
 * @return This is for getting the greatest common divisor.
 */
    public int getGcd(int a, int b){
        int Gcd=0;
        int Max;
        Max=getMax(a,b);
        for(int i=1; i<=Max;i++){
            if((a%i==0)&&(b%i==0)){
                Gcd=i;
            }
        }
        return Gcd;
        
    }
/**
 * This is getLcm.
 * @param a This is integer
 * @param b This is integer
 * @return This is for getting the least common multiple.
 */
    public int getLcm(int a, int b){
        int Lcm;
        
        Lcm= a*b/getGcd(a,b);
        return Lcm;
    }
/**
 * This is getSquare.
 * @param a This is integer
 * @return This is for getting square ex) a=5 square=5*5=25
 */
    public int getSquare(int a){
        int Square=a*a;
        return Square;
    }
}
