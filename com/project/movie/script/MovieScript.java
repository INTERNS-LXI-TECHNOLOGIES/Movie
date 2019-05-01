package com.project.movie.script;
import com.project.movie.cast.*;
import com.project.movie.dialogue.*;
import java.util.*;
import java.io.*;
public class MovieScript
{
	
	private Dialogue dialogue;
	private List <Cast>castList;
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
		System.out.println("Film name     :"+"*"+name+"*");
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
        System.out.println("\n"+created.getActorName()+" Playing Role as   "+c.getRoleName());
	}
    public void createDialogue()
    {
    	String fileName=null;
    	dialogue= new Dialogue();
    	dialogue.setComic(new String[3]);
    	dialogue.getComic()[0] = "";
    }


}	