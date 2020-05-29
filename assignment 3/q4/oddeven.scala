import io.StdIn._
object oddeven extends App{

	def iseven(n:Int):Boolean = n match{
	case 0 => true
	case _ => isodd(n-1)
	}

	def isodd(n:Int):Boolean = !(iseven(n))
	
	
	print("enter number:");
	var input=readInt();
	println(iseven(input));
}