package com.lxisoft.movie.movieScript;
import com.lxisoft.movie.movieScript.*;
import java.util.ArrayList;
public class Scene
{
	private int sceneNumber;
	public ArrayList<Dialogue> dialogues=new ArrayList<Dialogue>();
	public ArrayList<Character> characterSequance=new ArrayList<Character>();
    public void setSceneNumber(int sceneNumber)
    {
		this.sceneNumber=sceneNumber;
	}	
	public int getSceneNumber()
	{
		return sceneNumber;
	}
	public void calling()
	{
	  dialogues.get(0).readingFileData();
	}
	
}