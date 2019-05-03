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
		/*System.out.print("Enter no.of hero:");
		int hero=in.nextInt();
		System.out.print("Enter no.of heroine:");
		int heroine=in.nextInt();
		System.out.print("Enter no.of villain:");
		int villain=in.nextInt();
		System.out.print("Enter no.of comedian:");
		int comedian=in.nextInt();
		System.out.print("Enter no.of others :");
		int general=in.nextInt();1*/
		System.out.print("Enter no.of scene:");
		int scene=in.nextInt();
		String type=null;
		for(int i=1;i<=scene;i++)
		{
			System.out.print("\n1.Sad\n2.Happy\n3.Comedy\n4.Mass\n5.Romantic\nSelect the scene type:");
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
			System.out.print("Enter no.of dialogue:");
		    int dialogue=in.nextInt();
		    System.out.println("\n\n\t\tScene "+i+"\n Scene type:"+type);
		    director.casting();
		    director.action(type,dialogue);
		   director.cut();	    
		}
		 
	}
}