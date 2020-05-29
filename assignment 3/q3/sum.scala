import io.StdIn._
object sum extends App{
	
	def sum(x:Int):Int={
	if (x<=1) x
	else x+sum(x-1)
	}


	print("enter number:");
	var input=readInt();
	println(sum(input));
}