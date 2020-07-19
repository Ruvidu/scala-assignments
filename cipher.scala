object as4 extends App{

val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
val E=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size);
val D=(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key)%a.size);




val cipher=(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a));
val ct=cipher(E,"RUVIDU",4,alphabet);
val pt=cipher(D,ct,4,alphabet);

println(pt);
println(ct);



}