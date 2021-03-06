﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SavingsAccount
{
    public class SimpleSavingsAccount
    {
        double balance;
        double taxesDiscount;
        public SimpleSavingsAccount()
        {
            balance = 0;
            taxesDiscount = 0;
        }

        public SimpleSavingsAccount(double b, double t)
        {
            if(b>0 && t > 0)
            {
                balance = b;
                taxesDiscount = t;
            }else
            {
                balance = 0;
                taxesDiscount = 0;
            }
            
        }

        public double Balance()
        {
            return balance;
        }

        public double TaxesDiscount()
        {
            return taxesDiscount;
        }

        public void Deposit(double amount,bool bankcheck)
        {
            /*TODO: implementar la siguiente funcionalidad.
                cuando lo que se deposita es un cheque (bankcheck ==true), 
                hay ciertos descuentos que se deben realizar, dependiendo del monto.
                Si amount<1000, el descuento es del 1.2%
                Si amount>=1000 y amount<10000, el descuento es del 2%
                Si  amount>=10000, el descuento es del 3%
                TODOS los descuentos se deben ir acumulando en taxesDiscount.
            */
            balance += amount;
            if (amount > 0)
            {
                if (bankcheck)
                {
                    if (amount < 1000)
                    {
                        taxesDiscount += amount * (0.012);
                    }else
                    {
                        if(amount < 10000)
                        {
                            taxesDiscount += amount * (0.02);
                        }
                        else
                        {
                            taxesDiscount += amount * (0.03);
                        }
                    }
                }
            }
           
        }
        public void Withdraw(int amount)
        {
            if(amount>0 && amount <= balance)
            {
                balance -= amount;
            }
            
        }
    }
}
