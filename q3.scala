object que3{
    def main(args:Array[String]):Unit = {
      val account1 = new Account("110", 20, 1000)
      val account2 = new Account("220", 25, 900)

      println("Before Transfer")
      println(account1)
      println(account2)

      println()
      account1.transfer(account2, 100)

      println("After Transfer")
      println(account1)
      println(account2)
    }

}



class Account(id:String,n: Int, b: Double){
   val nic:String=id
   val accnumber: Int = n
   var  balance: Double = b
   override def toString = "[" + nic + ":" + accnumber + ":" + balance + "]"

  def transfer(a:Account,b:Double) = {
    this.balance=this.balance-b
    a.balance=a.balance+b
  }

}