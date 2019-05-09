package com.lxisoft.movie;
import com.lxisoft.filmcrew.*;
import java.io.*;
import java.util.*;
public class Movie
{
private String name="Lucifer";

public String getName()
{
return name;
}

Scanner scan=new Scanner(System.in);

Producer producer=new Producer();
ScriptWriter writer=new ScriptWriter();
Director director=new Director();
String type;

public void playMovie()throws Exception
{
	int choice;
System.out.println(" ");
System.out.println("             "+getName()+"             ");
System.out.println(" ");
System.out.println(" Story Writen By :"+writer.getName());
System.out.println(" Produced by     :"+producer.getName());
System.out.println(" Directed by     :"+director.getName());
System.out.println(" ");
director.cast();
System.out.println(" ");

do
{
	System.out.println("1.Mass scene");
	System.out.println("2.Romantic scene");
	System.out.println("3.Sad scene");
	System.out.println("4.Comedy scene");
	System.out.println(" ");
	 System.out.print("Enter your choice:");
	 choice=scan.nextInt();
	 System.out.println(" ");
			    
				
				 switch(choice)
			  {
				  case 1:type="mass";
				  writer.script(type);
				  break;
                  case 2:type="romantic";
				  writer.script(type);
				  break;
				  case 3:type="sad";
				  writer.script(type);
				  break;
				  case 4:type="comedy";
				  writer.script(type);
				  break;
				  default:System.out.println("Invalid choice made...please try again...!!!");
			
			  }
}while(choice>4);
}
}