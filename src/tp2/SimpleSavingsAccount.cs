using System;
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
            
            if(amount>0){
            	balance=balance+amount;
            	if(bankcheck){
            	if(amount<1000){
            		taxesDiscount=taxesDiscount+(amount*0.012);
            	}else{
            		if(amount>=1000 || amount<10000){
            			taxesDiscount=taxesDiscount+(amount*0.02);
            		}else{
            			taxesDiscount=taxesDiscount+(amount*0.03);
            		}
            	}
            	taxesDiscount=taxesDiscount
            }	
            }
            
           
        }
        public void Withdraw(int amount)
        {
            balance -= amount;
        }
    }
}
