import java.util.Scanner;

class QuadraticEquation {
    private double a,b,c;
    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA (){
        return this.a;
    }

    public double getB (){
        return this.b;
    }

    public double getC (){
        return this.c;
    }

    public double getDiscriminant(){
        return (this.b * this.b)-4 * this.a * this.c;
    }

    public double getRoot1(){
        double delta = this.getDiscriminant();
        if (delta >= 0){
            double r1 = (-this.b+Math.pow(delta, 0.5))/(2*this.a);
            return r1;
        } else {
            return 0;
        }

    }

    public double getRoot2(){
        double delta = this.getDiscriminant();
        if (delta >= 0){
            double r2 = (-this.b-Math.pow(delta, 0.5))/(2*this.a);
            return r2;
        } else {
            return 0;
        }
    }
}

public class SolveQuadraticEquation{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        QuadraticEquation equation1 = new QuadraticEquation(a, b, c);
        double delta = equation1.getDiscriminant();
        if (delta < 0){
            System.out.println("The equation has no real roots");
        } else if (delta == 0){
            System.out.println("The equation has 1 root "+equation1.getRoot1());
        } else {
            System.out.println("The equation as 2 roots "+equation1.getRoot1()+" and "+equation1.getRoot2());
        }
    }
}


