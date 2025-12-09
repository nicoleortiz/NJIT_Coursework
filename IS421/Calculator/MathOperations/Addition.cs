namespace MathOperations
{
    public static class Addition
    {
        static public int Sum(int augend, int addEnd)
        {
            return augend + addEnd;
        }

        static public double Sum(double augend, double addEnd)
        {
            return augend + addEnd;
        }

        static public double Sum(double[] dArray)
        {
            double result = 0;

            foreach (var x in dArray)
            {
                result = Sum(result, x);
            }

            return result;
        }

        static public int Sum(int[] dArray)
        {
            int result = 0;

            foreach (var x in dArray)
            {
                result = Sum(result, x);
            }

            return result;
        }
    }
}