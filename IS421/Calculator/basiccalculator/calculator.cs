using MathOperations;

namespace basiccalculator
{
    public class Calculator
    {
        static void Main(string[] args)
        {
            //Console.WriteLine("Hello World!");
        }

        static public dynamic Add(dynamic augend, dynamic addend)
        {
            var result = Addition.Sum(augend, addend);
            return result;
        }

        static public dynamic Add(dynamic dArray)
        {
            return Addition.Sum(dArray);
        }

        public dynamic Subtract(dynamic minuend, dynamic subtrahend)
        {
            return Subtraction.Difference(minuend, subtrahend);
        }

        public double Multiply(double multiplier, double multiplicand)
        {
            return Multiplication.Product(multiplier, multiplicand);
        }

        static public double Divide(double dividend, double divisor)
        {
            return Division.Quotient(dividend, divisor);
        }

        static public double Exponent(double bbase, double exponent)
        {
            return Exponentiation.Power(bbase, exponent);
        }

        static public double Root(double radicand, double degree)
        {
            return Roots.Root(radicand, degree);
        }

        static public double Log(double antilog, double bbase)
        {
            return Logarithms.Logarithm(antilog, bbase);
        }
    }
}