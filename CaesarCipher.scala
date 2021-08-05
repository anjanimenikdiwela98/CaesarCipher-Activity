import scala.io.StdIn.readInt
import scala.io.StdIn.readLine
object CaesarCipher extends App{
  
  val Alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
  val Encrypt = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)+key)%a.size)
  val Decrypt = (c:Char, key:Int, a:String)=> a((a.indexOf(c.toUpper)-key)%a.size)
  val Cipher = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  println("Enter a text: ")
  val s = readLine()
  println("Enter a shift number: ")
  val key = readInt()
  val ct = Cipher(Encrypt,s,key,Alphabet)
  val pt = Cipher(Decrypt,ct,key,Alphabet)
  println("The Encrypted text : "+ct)
  println("The Decrypted text : "+pt)

}
