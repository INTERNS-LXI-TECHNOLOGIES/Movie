package com.project.movie.script;
import com.project.movie.cast.*;
import com.project.movie.dialogue.*;
import java.util.*;
import java.io.*;
public class MovieScript
{
	
	private Dialogue dialogue;
	private List <Cast>castList;
	public static final String name="Contra";

	private List<Seen>seenList;

	public void setSeenList(List<Seen>seenList)
	{
		this.seenList=seenList;
	}
	public List<Seen>getSeenList()
	{
		return seenList;
	}
    public void createDialogue()
    {
    	String fileName=null;
    	dialogue= new Dialogue();
    	dialogue.setComic(new String[3]);
    	dialogue.getComic()[0] = "";
    }


}	