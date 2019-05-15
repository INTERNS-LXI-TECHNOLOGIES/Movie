package com.project.movie.script;
import java.util.*;
import com.project.movie.dialogue.*;
import java.io.*;
import javax.sound.sampled.*;
public class Song 
{
  private String music;
  private String musicDirector;

   public void setMusic(String music)
   {
   	this.music=music;
   }
   public void setMusicDirector(String musicDirector)
   {
   	this.musicDirector=musicDirector;
   }
   public String getMusic()
   {
   	return music;

   }
   public String getMusicDirector()
   {
   	return musicDirector;
   }


}