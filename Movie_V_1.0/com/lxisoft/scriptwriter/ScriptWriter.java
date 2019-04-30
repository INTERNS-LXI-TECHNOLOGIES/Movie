package com.lxisoft.scriptwriter;
public class ScriptWriter{

private String name;
private String sceneName;
private String dialogue;

public ScriptWriter(String name){
	this.name=name;
}
public void setName(String name){
	this.name=name;
	
}
public String getName(){
	return name;
}
public void setScene(String sceneName){
	this.sceneName=sceneName;
}
public String getScene(){
	return sceneName;
}

}