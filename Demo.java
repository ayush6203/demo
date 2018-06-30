/*finding number of word in a string using string tokenizer*/
import java.util.*;

class Demo
{
public static void main(String... sss)
 {
  int count=0;
  Scanner inn=new Scanner(System.in);
  String ss=inn.nextLine();
  System.out.println("aappki phli entry :- " + ss);
  String args=inn.nextLine();
  System.out.println("aapki doosri entry :- " + args);

   StringTokenizer st=new StringTokenizer(ss," ");
  
  while(st.hasMoreTokens())
  {
     if(st.nextToken().equals(args))
     count++;
  }
  
  System.out.println("aapne "+ count + " baar "+ args + " bola h");
  
 }
}
