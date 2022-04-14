
fun main() {
    var j=CurrentAccount("564873","Kcb",7000)
    j.deposit(100.0)
    j.withdraw(800.00)
    var n=SavingsAccount("564873","Kcb",7000,9)
   println( n.withdrawals)




}
//Create a classCurrentAccount with the following attributes:account
//number, account name, balance. It has the following functions:
//a.deposit(amount: Double) - Increments the balance bythe
//amount deposited
//b.withdraw(amount: Double) - Decrements the balanceby the
//amount withdrawn
//c.details() - Prints out the account number and balanceand
//name in this format: “Account number x with balance y is
//operated by z”
class CurrentAccount(var accountNumber:String, var accountName:String, var balance:Int){
   fun play(accountNumber:String, balance:Int,accountName:String){
        println("$accountNumber:accountNumber $balance balance")

    }

    fun deposit(amount:Double) {
        var money=balance +amount
        println(money)
        money++
    }
    fun withdraw(amount: Double){
        var moneyy=balance - amount
        println(moneyy)
        moneyy--
    }

}
//Create another classSavingsAccount. It has the samefunctions and
//attributes as the current account except for one attribute,
//withdrawals: Int. Withdrawals is a counter variablethat is used to
//keep track of how many withdrawals have been made from the account
//in a year. The only other difference is that the savings account
//withdraw() method first checks if the number of withdrawalsis less
//than 4 for it to allow one to withdraw money from the account. It also
//increments the withdrawals attribute after a successful withdrawal
class SavingsAccount(var accountNumber: String,var accountName: String,var balance: Int,var withdrawals:Int)
fun withdrawal(Withdrawalss: Int){

    var total=withdrawals-withdrawalss



    total++

}

