import java.util.*;
import java.io.*;
public class ScriptWriter
{
private String name="Anurag";

Scanner scan=new Scanner(System.in);

public void setName(String name)
{
this.name=name;
}
public String getName()
{
return name;
}

public void script()throws Exception
{
	
File f=new File("hero.txt");
FileReader fr=new FileReader(f);
BufferedReader br=new BufferedReader(fr);

File s=new File("villain.txt");
FileReader fR=new FileReader(s);
BufferedReader bR=new BufferedReader(fR);

String b=null;
String c=null;

ArrayList<String> hero=new ArrayList<String>();
ArrayList<String>villain=new ArrayList<String>();

while((b=br.readLine())!=null)
{
  	
hero.add(b);
}

while((c=bR.readLine())!=null)
{
villain.add(c);
}	
	
/*int i;	
for(i=0;i<2;i++)
{
System.out.println("Hero :"+hero.get(i));
System.out.println("Villain :"+villain.get(i));
}	
for(i=0;i<3;i++)
{
if(i==2)
{
  System.out.println("Hero :"+hero.get(i));
}
} */

int i;	
for(i=0;i<3;i++)
{
	int dialogue1=(int)(Math.random()*hero.size());
int dialogue2=(int)(Math.random()*villain.size());
System.out.println( "Hero :"+hero.get(dialogue1));
System.out.println("Villain :"+villain.get(	dialogue2));
}	
	
}


}