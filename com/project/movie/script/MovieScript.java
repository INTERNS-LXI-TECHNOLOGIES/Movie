package com.project.movie.script;
import com.project.movie.cast.*;
import com.project.movie.dialogue.*;
import java.util.*;
import java.io.*;
import javax.sound.sampled.*;

public class MovieScript
{
	
	private Dialogue dialogue =new Dialogue();
	private ArrayList<String> comic=new ArrayList<String>();
	private ArrayList<String> action=new ArrayList<String>();
	private ArrayList<String> romantic=new ArrayList<String>();
	private Scriptwritter writter;
	private String director="Rafi";
	private List <Cast>castList = new ArrayList<>();
	public static final String name="CoNtRa";

	private List<Seen>seenList;


	public void setDetails()
	{
		writter=new Scriptwritter();
		writter.setName("Aju Varghese");
		System.out.println("\n\n"+"Film name     :"+"*"+name+"*"+"\n\nDirector Name :"+director);
		System.out.println("\n"+"Script written By :"+writter.getName());
	 
		createCast((Cast)new Hero(),"Mammooty","Raju");
		createCast((Cast)new Heroin(),"Nayans","Ammu");

		createCast((Cast)new Comedian(),"HariSree","Chathan");
		createCast((Cast)new Comedian(),"Kochan","Kunjoottan");
		createCast((Cast)new Comedian(),"Mukesh","Kunjumon");

		createCast((Cast)new Villan(),"Siddique","Gilbert Jack");
		createCast((Cast)new Villan(),"Manoj K Jayan","Maathan");


	}
	
	public void createCast(Cast created, String actorName, String roleName)
	{
		
		Cast c = created;
		created.setActorName(actorName);
		created.setRoleName(roleName);
		castList.add(c);
        System.out.println("\n"+created.getActorName()+" Playing Role as   "+c.getRoleName());

	}
    public void createDialogue() throws ArrayIndexOutOfBoundsException
    {
    	int x =0;
    	

    	try{
    	for(int i = 1;i<4;i++){
    	String fileName=null;
    	File file=new File("Prop.properties");
    	Properties prop=new Properties();
    	prop.load(new FileInputStream("Prop.properties"));
    --------------
    	String a= prop.getProperty("file"+i);
    	File f=new File(a);
    	FileReader fr= new FileReader(f);
    	BufferedReader br= new BufferedReader(fr);
    	String line;
    	//System.out.println(a);
        Iterator<String> itr=dialogue.iterator(); 
    	while((itr.hasNext()))
    	{
    		//String[]sp=line.split("$");
	if(i==1)
	{
		if(x==10)
		{
			System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
			x=0;
		
	}
	this.comic.add(line);
/*    	System.out.println(x+dialogue.getComic()[x]+"mmmmm");
*/    	}
       else if(i==2)
       {
       	if(x==10){
       		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
    			x=0;
    		}
    		this.action.add(line);
    	/*System.out.println(x+line+"zzzzzzzzzz");
    	System.out.println( dialogue.getAction()[x]+"%%%%%%%%%%%%%%");
     */  }
    	else if(i==3)
    	{
    		if(x==10){
    				System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		try
		{
		Thread.sleep(1000);
		}
		catch(Exception e)
		{
		}
    			x=0;
    		}
    	this.romantic.add(line);
   // 	System.out.println(x+dialogue.getRomantic()[x]+"000000000000");
       }

    	x++;
    	

        this.dialogue.setComic(this.comic);
        this.dialogue.setAction(this.action);
        this.dialogue.setRomantic(this.romantic);
  
 	}
      
     }
}
     catch(FileNotFoundException e)
        {
        	e.printStackTrace();
        }
        catch(IOException e)
         {
    		e.printStackTrace();
           }
           display();
         }
       public void display()
           {
           	int count=1;
           	do{
           		try{
            System.out.println("\n\n\t\t*******Sceene :"+count+"*******");
            Thread.sleep(2000);
            for(int k=0;k<=((int)(Math.random()*9+1));k++)
            {
       	int j=((int)(Math.random()*3+2));
            System.out.println("\n\n"+"   "+castList.get(j).getRoleName()+"   : "+dialogue.getComic());
          	  Thread.sleep(1000);
           	int n=((int)(Math.random()*2));
            System.out.println("\n\n"+"   "+castList.get(n).getRoleName()+"  : "+dialogue.getRomantic());
               Thread.sleep(1000);
           	int l=((int)(Math.random()*2+5));
            System.out.println("\n\n"+"   "+castList.get(l).getRoleName()+"   : "+dialogue.getAction());
                Thread.sleep(1000);
          	} 

          }

          catch(Exception e)
          {

          }


           	count++;
           }
           	while (count<=7);


System.out.println("\t\t\t\t\t\t\t    The End ..."+"\n\t\t\t\t\t\t\t ############");
}

}	