package com.lxisoft.movie;
import com.lxisoft.filmcrew.*;
public class Movie
{
private String name="Lucifer";

public String getName()
{
return name;
}

Producer producer=new Producer();
ScriptWriter writer=new ScriptWriter();
Director director=new Director();

public void playMovie()
{
	
System.out.println(" ");
System.out.println("             "+getName()+"             ");
System.out.println(" ");
System.out.println(" Story Writen By :"+writer.getName());
System.out.println(" Produced by     :"+producer.getName());
System.out.println(" Directed by     :"+director.getName());
System.out.println(" ");
director.cast();
System.out.println(" ");

}
}