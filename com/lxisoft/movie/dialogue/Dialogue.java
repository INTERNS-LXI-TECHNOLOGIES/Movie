package com.lxisoft.movie.dialogue;
import java.util.*;
public class Dialogue
{
	private String[] comic;
	private String[] action;
	private String[] romantic;
	//private String[] negative;
	public void setComic(String[] comic)
	{
      this.comic=comic;
	}
	public String[] getComic()
	{
		return comic;
	}
	public void setAction(String[] action)
	{
		this.action=action;
	}
	public String[] getAction()
	{
		return action;
	}
	
	public void SetRomantic(String[] romantic)
	{
		this.romantic=romantic;
	}
	public String[] getRomantic()
	{
		return romantic;
	}
	/*public void setNegative(String[] negative)
	{
		this.negative=negative;
	}
	
	public String[]getNegative()
	{
		return negative;
	}*/
	
	
}