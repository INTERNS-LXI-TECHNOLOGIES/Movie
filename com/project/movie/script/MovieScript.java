package com.project.movie.script;
import com.project.movie.cast.*;
import com.project.movie.dialogue.*;
import java.util.*;
import java.io.*;
public class MovieScript
{
	
	private Dialogue dialogue =new Dialogue();
	private Scriptwritter writter=new Scriptwritter();
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
		System.out.println("\n\n"+"Film name     :"+"*"+name+"*");
		writter=new Scriptwritter("Aju Varghese"); 
		createCast((Cast)new Hero(),"Mammooty","Raju");
		createCast((Cast)new Heroin(),"Nayans","Ammu");

		createCast((Cast)new Comedian(),"HariSree","pottan");
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
    	try{

    	String fileName=null;
    	File file=new File("Prop.properties");
    	Properties prop=new Properties();
    	prop.load(new FileInputStream(file));
    	String a= prop.getProperty("file");
    	File f=new File(a);
    	FileReader fr= new FileReader(f);
    	BufferedReader br= new BufferedReader(fr);
    	String line;
    	int i=0;
    	dialogue.setComic(new String[10]);
    	dialogue.setRomantic(new String[10]);
    	dialogue.setAction(new String[10]);

    	while((line=br.readLine())!=null)
    	{
    		//String[]sp=line.split("$");
	
    	dialogue.getComic()[i] = line;
    	dialogue.getRmantic()[i]=line;
    	dialogue.getAction()[i]=line;
    	i++;
    	
        }
       for(int k=0;k<3;k++)
       {
       	for(int j=3;j<5;j++)
       	{


       	System.out.println("\n\n"+"   "+castList.get(j).getRoleName()+" : "+dialogue.getComic()[k]);
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
           	
           }
         }


}	