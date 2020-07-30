
class Rational(x:Int, y:Int) {
  def num=x
  def den=y
  def neg=new Rational(-this.num, this.den)

  def sub(r:Rational)=new Rational(this.num*r.den - this.den*r.num, this.den*r.den)

  override def toString=num+"/"+den
}
object ratio extends App{
    val x=new Rational(3,4)
    val y=new Rational(5,8)
    val z=new Rational(2,7)

    println(x.neg)//q1
    println(x.sub(y).sub(z))//q2

}