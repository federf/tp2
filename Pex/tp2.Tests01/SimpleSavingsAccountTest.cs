// <copyright file="SimpleSavingsAccountTest.cs">Copyright ©  2016</copyright>
using System;
using Microsoft.Pex.Framework;
using Microsoft.Pex.Framework.Validation;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using SavingsAccount;

namespace SavingsAccount.Tests
{
    /// <summary>Esta clase contiene pruebas unitarias parametrizadas para SimpleSavingsAccount</summary>
    [PexClass(typeof(SimpleSavingsAccount))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(InvalidOperationException))]
    [PexAllowedExceptionFromTypeUnderTest(typeof(ArgumentException), AcceptExceptionSubtypes = true)]
    [TestClass]
    public partial class SimpleSavingsAccountTest
    {
        /// <summary>Código auxiliar de prueba para Balance()</summary>
        [PexMethod]
        public double BalanceTest([PexAssumeUnderTest]SimpleSavingsAccount target)
        {
            double result = target.Balance();
            PexAssert.IsNotNull(result);
            PexAssert.IsTrue(result >= 0);
            return result;
            // TODO: agregar aserciones a método SimpleSavingsAccountTest.BalanceTest(SimpleSavingsAccount)
        }

        /// <summary>Código auxiliar de prueba para .ctor()</summary>
        [PexMethod]
        public SimpleSavingsAccount ConstructorTest()
        {
            SimpleSavingsAccount target = new SimpleSavingsAccount();
            PexAssert.IsNotNull(target);
            return target;
            // TODO: agregar aserciones a método SimpleSavingsAccountTest.ConstructorTest()
        }

        /// <summary>Código auxiliar de prueba para .ctor(Double, Double)</summary>
        [PexMethod]
        public SimpleSavingsAccount ConstructorTest01(double b, double t)
        {
            SimpleSavingsAccount target = new SimpleSavingsAccount(b, t);
            PexAssert.IsNotNull(target);
            if(b>0 && t > 0)
            {
                double v = (target.Balance() - b);
                PexAssert.IsTrue(v >= -0.0001 && v <= 0.0001);
                v = (target.TaxesDiscount() - t);
                PexAssert.IsTrue(v >= -0.0001 && v <= 0.0001);
            }else
            {
                PexAssert.IsTrue(target.Balance() == 0);
                PexAssert.IsTrue(target.TaxesDiscount() == 0);
            }
            
            return target;
            // TODO: agregar aserciones a método SimpleSavingsAccountTest.ConstructorTest01(Double, Double)
        }

        /// <summary>Código auxiliar de prueba para Deposit(Double, Boolean)</summary>
        [PexMethod]
        public void DepositTest(
            [PexAssumeUnderTest]SimpleSavingsAccount target,
            double amount,
            bool bankcheck
        )
        {
            PexAssume.IsNotNull(target);
            PexAssume.IsNotNull(amount);
            PexAssume.IsNotNull(bankcheck);
            PexAssume.IsTrue(amount>=0);
            double oldBalance = target.Balance();
            double oldTaxes = target.TaxesDiscount();
            double v;
            target.Deposit(amount, bankcheck);
            PexAssert.IsTrue(oldBalance + amount == target.Balance());
            if (bankcheck && amount > 0)
            {
                PexAssert.IsTrue(oldTaxes < target.TaxesDiscount());
                if (amount < 1000)
                {
                    v = (target.TaxesDiscount() - oldTaxes) - (amount * (0.012));
                }
                else if (amount < 10000)
                {
                    v = (target.TaxesDiscount() - oldTaxes) - (amount * (0.02));
                }
                else
                {
                    v = (target.TaxesDiscount() - oldTaxes) - (amount * (0.03));
                }
                PexAssert.IsTrue(v >= -0.0001 && v <= 0.0001);
            }
                // TODO: agregar aserciones a método SimpleSavingsAccountTest.DepositTest(SimpleSavingsAccount, Double, Boolean)
        }

        /// <summary>Código auxiliar de prueba para TaxesDiscount()</summary>
        [PexMethod]
        public double TaxesDiscountTest([PexAssumeUnderTest]SimpleSavingsAccount target)
        {
            double result = target.TaxesDiscount();
            PexAssert.IsNotNull(result);
            PexAssert.IsTrue(result >= 0);
            return result;
            // TODO: agregar aserciones a método SimpleSavingsAccountTest.TaxesDiscountTest(SimpleSavingsAccount)
        }

        /// <summary>Código auxiliar de prueba para Withdraw(Int32)</summary>
        [PexMethod]
        public void WithdrawTest([PexAssumeUnderTest]SimpleSavingsAccount target, int amount)
        {
            double oldBalance = target.Balance();
            target.Withdraw(amount);
            if(amount>0 && amount <= oldBalance)
            {
                PexAssert.IsTrue(target.Balance() >= 0);
                PexAssert.IsTrue(oldBalance - amount == target.Balance());
            }
            else
            {
                PexAssert.IsTrue(oldBalance == target.Balance());
            }
            
            // TODO: agregar aserciones a método SimpleSavingsAccountTest.WithdrawTest(SimpleSavingsAccount, Int32)
        }
    }
}
