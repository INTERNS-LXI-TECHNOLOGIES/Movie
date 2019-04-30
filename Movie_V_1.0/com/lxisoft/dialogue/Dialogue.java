package com.lxisoft.dialogue;
import java.util.*;
public class Dialogue{
	
File file;	
 ArrayList<Dialogue> dialogues = new ArrayList<Dialogue>();

public void creatingDialogues(){
	try{
	FileReader fR = new FileReader(file);
	BufferReader bR = new BufferReader(fR);
	while(bR.readLine()!=null){
	System.out.println(data);	

	}
	catch(FileNotFoundException e){

	}
	catch(IOException e){

	}
}
}