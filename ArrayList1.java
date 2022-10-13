//ArrayList example 1
import java.util.*;
class ArrayList1
{
public static void main(String[] args)
{
List<String> li=new ArrayList<String>();
li.add("KM");
li.add("GM");
li.add("RB");
li.add("SM");

Iterator itr=li.iterator();

while(itr.hasNext())
{
System.out.println(itr.next());
  }
}
}