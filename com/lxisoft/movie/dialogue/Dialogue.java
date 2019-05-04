package com.lxisoft.movie.dialogue;
import java.util.*;
public class Dialogue
{
	private String[] comic;
	private String[] action;
	private String[] romantic;
	private String[] negative;
	public void setComic(String[] comic)
	{
      this.comic=comic;
	}
	public void setAction(String[] action)
	{
		this.action=action;
	}
	public void SetRomntic(String[] romantic)
	{
		this.romantic=romantic;
	}
	public void setNegative(String[] negative)
	{
		this.negative=negative;
	}
	public String[] getComic()
	{
		return comic;
	}
	public String[] getAction()
	{
		return action;
	}
	public String[] getromantic()
	{
		return romantic;
	}
	public String[]getNegative()
	{
		return negative;
	}
	
	
}