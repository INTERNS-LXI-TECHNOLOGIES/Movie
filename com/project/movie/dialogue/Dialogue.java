package com.project.movie.dialogue;
import java.util.*;
public class Dialogue
{
	private List<String> comic=new ArrayList<String>();
	private List<String> action=new ArrayList<String>();
	private List<String> romantic=new ArrayList<String>();
	private List<String> song=new ArrayList<String>();

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
	public void setSong(ArrayList<String> song)
	{
		this.song=song;
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
	public List<String> getSong()
	{
		return song;
	}
	
	
}