import io.StdIn._
object Prime extends App{
	def gcd(x:Int,y:Int):Int=y match{
	case 0 => x
	case y if (y>x) => gcd(y,x)
	case _ => gcd(y,x%y)
	}

	def checkprime(p:Int,n:Int=2):Boolean=n match{
	case x if (x==p)=>true
	case x if gcd(p,x)>1=>false
	case x =>checkprime(p,x+1)
	}
	
	print("enter number:");
	var input=readInt();
	println(checkprime(input));
}