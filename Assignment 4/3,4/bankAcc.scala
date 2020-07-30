class Account(num:Int, bal:Double) {
  val accnum = num
  var balance = bal

  def transfer(a:Account, amt:Double): Unit = {
    a.balance += amt
    balance -= amt
  }

  override def toString="["+accnum+":"+balance+"]"
}
object bankAcc extends App {
  var a=new Account(001, 10000)
  var b=new Account(002, 15000)
  var c=new Account(003, -5000)
  var d=new Account(004, -2000)

  //q3
  b.transfer(a,1000)
  println(a.balance)
  println(b.balance)

  //q4.1
  var accounts:List[Account] = List(a,b,c,d)
  val neg=accounts.filter(_.balance<0)
  println(neg)

  //q4.2
  val sum=accounts.map(x=>x.balance).reduce((i,j)=>i+j)
  println(sum)

  //q4.3
  val interest=accounts.map(x=>if(x.balance>=0)x.balance*1.05
  else x.balance*1.1)
  println(interest)
}