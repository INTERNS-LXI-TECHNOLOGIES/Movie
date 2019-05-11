package com.project.movie.dialogue;
import java.util.*;
public class Dialogue
{
	private List<String> comic=new ArrayList<String>();
	private List<String> action=new ArrayList<String>();
	private List<String> romantic=new ArrayList<String>();
	private List<String> negative=new ArrayList<String>();
	public void setComic(ArrayList<String> comic)
	{
      this.comic=comic;
	}
	public void setAction(ArrayList<String> action)
	{
		this.action=action;
	}
	public void setRomantic(ArrayList<String> romantic)
	{
		this.romantic=romantic;
	}
	public void setNegative(ArrayList<String> negative)
	{
		this.negative=negative;
	}
	public List<String> getComic()
	{
		return comic;
	}
	public List<String> getAction()
	{
		return action;
	}
	public List<String> getRomantic()
	{
		return romantic;
	}
	public List<String> getNegative()
	{
		return negative;
	}
	
	
}