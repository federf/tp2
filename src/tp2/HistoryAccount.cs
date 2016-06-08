using System;
using System.Collections.Generic;
using System.Diagnostics.Contracts;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace SavingsAccount
{
    public class HistoryAccount
    {
        SimpleSavingsAccount account;   //almacena el estado actual de la cuenta
        List<double> amounts;           //almacena el historial de depositos/extracciones
        List<bool> actions;             //para el caso de los depositos, almacena si fue un cheque o no. Su valor es indistinto cuando se trata de extracciones.

        public HistoryAccount()
        {
            account = new SimpleSavingsAccount();
            amounts = new List<double>();
            actions = new List<bool>();
        }

        public double Balance()
        {
            return account.Balance();
        }

        public double TaxesDiscount()
        {
            return account.TaxesDiscount();
        }

        public void Deposit(double amount, bool bankcheck)
        {
            account.Deposit(amount, bankcheck);
            amounts.Add(amount);
            actions.Add(bankcheck);
        }
        
        public void Withdraw(int amount)
        {
            account.Withdraw(-amount);
            amounts.Add(-amount);   //los valores negativos representan extracciones.
            actions.Add(false);     //este valor es irrelevante, ya que no es un deposito.
        }

        [ContractInvariantMethod]
        public void repOK()
        {
            //TODO: Imlemente el invariante de esta clase.
        }
    }
}
