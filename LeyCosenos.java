/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Esmeralda
 */
import java.lang.Math;

public class LeyCosenos {
    //Atributos
    //A. Constantes
    //B. Variables
    private double a = 0.0;
    private double c = 0.0;
    private double b = 0.0;
    private double alpha = 0.0;
    private double beta = 0.0;
    private double gamma = 0.0;
    
    //Métodos
    //A. Constructores
    public LeyCosenos()
    {
        a = 0.0;
        c = 0.0;
        b = 0.0;
        alpha = 0.0;
        beta = 0.0;
        gamma = 0.0;
    }
        public LeyCosenos(double a2, double b2, double c2, double al, double be, double g)
    {
        a = a2;
        c = c2;
        b = b2;
        alpha = al;
        beta = be;
        gamma = g;
    }
    //B. Propiedades get/set
        public double getA()
        {
            return a;
        }
        public void setA(double a2)
        {
            a = a2;
        }
        public double getB()
        {
            return b;
        }
        public void setB(double b2)
        {
            b = b2;
        }
        public double getC()
        {
            return c;
        }
        public void setC(double c2)
        {
            c = c2;
        }
        public double getAlpha()
        {
            return alpha;
        }
        public void setAlpha(double al)
        {
            alpha = al;
        }
        public double getBeta()
        {
            return beta;
        }
        public void setBeta(double be)
        {
            beta = be;
        }
        public double getGamma()
        {
            return gamma;
        }
        public void setGamma(double g)
        {
            gamma = g;
        }
    //C. Operaciones
        public double CalcularA()
        {
            a = Math.sqrt(Math.pow(b,2)+ Math.pow(c,2)- 2*b*c*Math.cos(alpha));
            return a;
        }
        
        public double CalcularB()
        {
            b = Math.sqrt(Math.pow(a,2)+ Math.pow(c,2)- 2*a*c*Math.cos(beta));
            return b;
        }
        
        public double CalcularC()
        {
            c = Math.sqrt(Math.pow(a,2)+ Math.pow(b,2)- 2*a*b*Math.cos(gamma));
            return c;
        }
        
        public double CalcularAlpha()
        {
            alpha = Math.acos((Math.pow(b,2)+ Math.pow(c,2)-Math.pow(a, 2))/(2*b*c));
            return alpha;
        }
        
        public double CalcularBeta()
        {
            beta = Math.acos((Math.pow(a,2)+ Math.pow(c,2)-Math.pow(b, 2))/(2*a*c));
            return beta;
        }
         
        public double CalcularGamma()
        {
            gamma = Math.acos((Math.pow(a,2)+ Math.pow(b,2)-Math.pow(c, 2))/(2*a*b));
            return gamma;
        }
        
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
