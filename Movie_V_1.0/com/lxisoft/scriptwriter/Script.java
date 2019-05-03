package com.lxisoft.scriptwriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.film.Film;
import com.lxisoft.dialogue.Dialogue;
import java.util.*;
import java.io.*;
public class Script{

//private String name
	public ArrayList<Scene> scenes = new ArrayList<Scene>();
	Scanner scan=new Scanner(System.in);

public void creatingScene(){
	Scene s = new Scene();
	System.out.println("enter the scene number");
	s.setSceneNumber(scan.nextInt());
	scenes.add(s);
	System.out.println(s.getSceneNumber());
	for(int i=0;i<scenes.size();i++){
 	if(scenes.get(i).getSceneNumber()==1){
 		System.out.println("Scene 1");
 		

 	}
 	else if(scenes.get(i).getSceneNumber()==2){
 		System.out.println("Scene 2");

 	}
 	else if(scenes.get(i).getSceneNumber()==3){
 		System.out.println("Scene 3");
 	}
 	else{
 		System.out.println("                 The end");
 	}
 	}
}
} 