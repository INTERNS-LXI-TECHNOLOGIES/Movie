import java.io.*;
import  java.util.*;
public class Movie
{
	int scene;
	int songNumber;
	Random rand=new Random();
	ArrayList<String> sceneslist=new ArrayList<String>();
	 String scenes[]={"sad","happy","comedy","mass","romantic"};
	 Director director=new Director(); 
	 ScriptWriter scriptWriter=new ScriptWriter();
	
	public void playMovie(){
		Scanner in =new Scanner(System.in);
        songNumber=rand.nextInt(2)+3;
		display();	    
	    scene=rand.nextInt(5)+5;
		System.out.println("Movie has "+scene+" Scene");
		String type=null;
		System.out.print("\n1.Sad\n2.Happy\n3.Comedy\n4.Mass\n5.Romantic\nSelect the Movie type:");
		int choice=in.nextInt();
		
		switch(choice)
		    {
		    	case 1:type="sad";Sceneslist(choice,type);break;
		    	case 2:type="happy";Sceneslist(choice,type);break;
		    	case 3:type="comedy";Sceneslist(choice,type);break;
		    	case 4:type="mass";Sceneslist(choice,type);break;
		    	case 5:type="romantic";Sceneslist(choice,type);break;
		    	default: System.out.print("Error!!");break;
		    }
		    System.out.println(sceneslist);
		director.casting();
		for(int i=1;i<=scene;i++)
		   {int y=i-1;
		    int dialogue=rand.nextInt(5)+5;
		    System.out.println("\n\n------------------------------------------------Scene "+i+"--------------------------------------------------\nScene type:"+sceneslist.get(y)+"\t\t\t\t\t\t\t\tNo.of Dialogue="+dialogue);
		    songNumber=director.action(sceneslist.get(y),dialogue,songNumber);
		      System.out.println("\n--------------------------------------------------------------------------------------------------------\n"); 
            }
		   
		 director.cut();	  
	}
	  public void Sceneslist( int choice,String type)
	  {
       int hx;
	   for(int k=0;k<(scene/2);k++)
	          {
              sceneslist.add(type);
              }
	        int m= scene-(scene/2);
           for(int k=0;k<m-1;k++)
               {do{
          	    hx=rand.nextInt(scenes.length);
          	}while(hx==(choice-1));
            	sceneslist.add(scenes[hx]);
               }
           Collections.shuffle(sceneslist);
            sceneslist.add(type);
         
	  }  
	  public void display()
	  {
	  	String movieName=scriptWriter.getScriptName();
		System.out.println("Movie name:"+movieName);
         String directorName=director.getName();
		System.out.println("Directed by "+directorName);
         Producer producer=new Producer();
        String producerName=producer.getName();
		System.out.println("Produced by "+producerName);
		String scriptWriterName=scriptWriter.getName();
		System.out.println("Story written by "+scriptWriterName);
	  }               
}