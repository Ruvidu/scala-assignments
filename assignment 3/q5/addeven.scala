import io.StdIn._
object addeven extends App{

	def iseven(n:Int):Boolean = n match{
	case 0 => true
	case _ => isodd(n-1)
	}

	def isodd(n:Int):Boolean = !(iseven(n))


	def sum(x:Int):Int=x match{
	case 0 => 0
	case x if (iseven(x)==true) => x+sum(x-1)
	case _ => 0+sum(x-1)

	}


	
	
	print("enter number:");
	var input=readInt();
	println(sum(input));
}