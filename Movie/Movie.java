import java.io.*;
import  java.util.*;
public class Movie
{
	public void playMovie(){
		Scanner in =new Scanner(System.in);
		ScriptWriter scriptWriter=new ScriptWriter();
		String movieName=scriptWriter.getScriptName();
		System.out.println("Movie name:"+movieName);
        Director director=new Director();
        String directorName=director.getName();
		System.out.println("Directed by "+directorName);
        Producer producer=new Producer();
        String producerName=producer.getName();
		System.out.println("Produced by "+producerName);
		String scriptWriterName=scriptWriter.getName();
		System.out.println("Story written by "+scriptWriterName);
	    Random rand=new Random();
	    int scene=rand.nextInt(5)+5;
		System.out.println("Movie has "+scene+" Scene");
		String type=null;
		System.out.print("\n1.Sad\n2.Happy\n3.Comedy\n4.Mass\n5.Romantic\nSelect the Movie type:");
		int choice=in.nextInt();
		switch(choice)
		    {
		    	case 1:type="sad";break;
		    	case 2:type="happy";break;
		    	case 3:type="comedy";break;
		    	case 4:type="mass";break;
		    	case 5:type="romantic";break;
		    	default: System.out.print("Error!!");break;
		    }
		director.casting();
		for(int i=1;i<=scene;i++)
		   {
		    int dialogue=rand.nextInt(5)+5;
		    System.out.println("\n\n\t\tScene "+i+"\n Scene type:"+type+"\t\tNo.of Dialogue="+dialogue);
		    director.action(type,dialogue);
		    director.cut();	    
		   }
		 
	}
}