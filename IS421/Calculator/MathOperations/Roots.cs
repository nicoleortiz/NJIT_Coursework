using System;

namespace MathOperations
{
    public static class Roots
    {
        static public double Root(double radicand, double degree)
        {
            return Math.Pow(radicand, (1.0 / degree));
        }
    }
}