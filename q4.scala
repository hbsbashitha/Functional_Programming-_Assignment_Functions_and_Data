object que4{
    def main(args:Array[String]):Unit = {
        val account1 = new Account("100", 1, -1000)
        val account2 = new Account("200", 2, 500)
        val account3 = new Account("300", 3, -20)
        val account4 = new Account("400", 4, 1200)
        val account5 = new Account("500", 5, 10000)
        

        var bank:List[Account] = List(account1, account2, account3, account4, account5)

        println("Overdraft Account List")
        overdraft(bank).foreach(i => println(i))
        println()

        println("Sum of All Accounts: Rs " + Totalbalance(bank))
        println()

        println("Sum of All Accounts(After Interest): Rs " + Totalbalance(interest(bank)))
        println()
    }

    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)

    val Totalbalance = (b:List[Account]) => b.reduce((x, y) => new Account("", 0, x.balance + y.balance)).balance

    val interest = (b:List[Account]) => b.map(x => if(x.balance >=0) new Account(x.nic, x.accnumber, x.balance + x.balance * 0.005) else new Account(x.nic, x.accnumber, x.balance + x.balance * 0.01))
}

class Account(id:String, n:Int, b:Double){
  val nic:String = id
  val accnumber:Int = n
  var balance:Double = b

  def withdraw(a:Double) = this.balance -= a

  def deposit(a:Double) = this.balance += a

  def transfer(a:Account, b:Double):Unit = {
    this.withdraw(b)
    a.deposit(b)
  }

  override def toString = "[" + this.nic + ":" + this.accnumber + ":" + this.balance + "]"
}