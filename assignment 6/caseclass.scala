import java.io._

case class Point(a:Int,b:Int){
	def x:Int = a
	def y:Int = b

	def add(c:Point) = Point(c.x+x,c.y+y)

	def move(dx:Int,dy:Int) = Point(x+dx,y+dy)

	def distance(c:Point) = math.sqrt(math.pow(y-c.y,2)+math.pow(x-c.x,2))

	def invert() = Point(b,a)
}

object caseclass{
	def main(args: Array[String]): Unit ={
		val p1=Point(3,4)
		val p2=Point(2,2)

	/*	println(p1.add(p2))
		println(p1.move(2,2))
		println(p1.distance(p2))
		println(p1.invert())
	
	 */
	}
}