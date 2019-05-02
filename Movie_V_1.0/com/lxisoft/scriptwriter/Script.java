package com.lxisoft.scriptwriter;
import com.lxisoft.scene.Scene;
import com.lxisoft.film.Film;
import java.util.*;
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
}
} 