package com.project.movie.script;
import com.project.movie.cast.*;
import com.project.movie.dialogue.*;
import java.util.*;
import java.io.*;
public class MovieScript
{
	
	private Dialogue dialogue =new Dialogue();
	private Scriptwritter writter;
	private String director="Rafi";
	private List <Cast>castList = new ArrayList<>();
	public static final String name="CoNtRa";

	private List<Seen>seenList;

	public void setSeenList(List<Seen>seenList)
	{
		this.seenList=seenList;
	}
	public List<Seen>getSeenList()
	{
		return seenList;
	}


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
    public void createDialogue()
    {
    	int x =0,k=1;
    	int count =1;
    	try
    	{
	   for(int i=1;i<=3;i++)
           {
	    	String fileName=null;
	    	File file=new File("Prop.properties");
	    	Properties prop=new Properties();
	    	prop.load(new FileInputStream("Prop.properties"));
	    
	    	String a= prop.getProperty("file"+i);
	    	//System.out.println(i);
	    	File f=new File(a);

	    	FileReader fr= new FileReader(f);
	    	BufferedReader br= new BufferedReader(fr);
	    	String line;
	    	dialogue.setComic(new String[10]);
	    	dialogue.setRomantic(new String[10]);
	    	dialogue.setAction(new String[10]);

    	while((line=br.readLine())!=null)
    	{
    	//System.out.println(line);
    		//String[]sp=line.split("$");
	if(i==1)
	{
	 dialogue.getComic()[x] = line;
	 
       	System.out.println("\t\t\t\tScene : "+count);
          for(int j=2;j<5;j++)
            {
            	 k=((int)(Math.random()*10));

             System.out.println("\n\n"+"   "+castList.get(j).getRoleName()+"     : "+dialogue.getComic()[k++]);
            }
         

    	}

    	else if(i==2)
    	{
	    	if(x>=10)
	    	{
	    	x=0;
	    	}
	    	System.out.println("\t\t\t\tScene :"+count);
    	 dialogue.getRomantic()[x]=line;
       
       	for(int j=0;j<5;j++)
       	{
       		 k=((int)(Math.random()*10));
       	System.out.println(castList.get(j).getRoleName()+"     : "+dialogue.getRomantic()[k++]);
       			
       	}
             
       }

       else if(i==3)
       {
       	if(x>=10){
    		x=0;
    	}
    	System.out.println("\t\t\t\tScene :"+count);
    	   dialogue.getAction()[x]=line;
    	    
       	for(int j=5;j<7;j++)
       	{
       		 k=((int)(Math.random()*10));
       	System.out.println(castList.get(j).getRoleName()+"     : "+dialogue.getAction()[k++]);
       			
       	}
       }
    	x++;
    	count++;
    	
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
           catch(IndexOutOfBoundsException e)
           {
           	e.printStackTrace();
           }
         }


}	