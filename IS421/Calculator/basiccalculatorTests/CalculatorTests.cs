using Microsoft.VisualStudio.TestTools.UnitTesting;

namespace basiccalculator.Tests
{
    [TestClass()]
    public class CalculatorTests
    {
        [TestMethod()]
        public void AddTest()
        {
            Assert.AreEqual(3, Calculator.Add(1, 2));
        }

        public void AddTest2()
        {
            int[] arrayList = { 1, 2, 3 };
            Assert.AreEqual(6, Calculator.Add(arrayList));
        }

        [TestMethod()]
        public void SubtractTest()
        {
            Assert.AreEqual(-1, Calculator.Subtract(1, 2));
        }

        [TestMethod()]
        public void MultiplyTest()
        {
            Assert.AreEqual(30, Calculator.Multiply(5, 6));
        }

        [TestMethod()]
        public void DivideTest()
        {
            Assert.AreEqual(9, Calculator.Divide(99, 11));
        }

        [TestMethod()]
        public void ExponentTest()
        {
            Assert.AreEqual(27, Calculator.Exponent(3, 3));
        }

        [TestMethod()]
        public void RootTest()
        {
            Assert.AreEqual(3, Calculator.Root(9, 2));
        }

        [TestMethod()]
        public void LogTest()
        {
            Assert.AreEqual(3, Calculator.Log(8, 2));
        }
    }
}