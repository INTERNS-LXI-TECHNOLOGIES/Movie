/*package com.project.movie.Song;
import java.util.*;
import com.project.movie.dialogue.*;
import java.io.*;
import javax.sound.sampled.*;
public class Song extends Dialogue
{
public void playMusic(String path)
{
	try
	{
		File musicPath=new File(path);
		if(musicPath.exist())
		{
			AudioInputStream audioInput=AudioSystem.getAudioInputStream(musicPath);
		} 
		else
		{
			System.out.println("can't Find File");
		}
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
}
}*/