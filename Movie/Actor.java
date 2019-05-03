import java.io.*;
import java.util.*;
class Actor{
private String name;
private String roleName;
private String role;
public String  getName()
{
	return this.name;
}
public void  setName(String name)
{
	 this.name=name;
}
	public String  getRoleName()
{
	return this.roleName;
}
public String deliverDialogue(String file1,String type)
     {
     	String file2=file1+"Dialogue.csv";
     	 String line=null;
       try{
       	File file=new File(file2);
          FileReader fR=new FileReader(file);
     ArrayList <String> dialogue=new ArrayList <String> ();
     BufferedReader bR=new BufferedReader(fR);
     
     while((line=bR.readLine())!=null)
  	    {
  	    String[] split = line.split(",");
  	     
  	    if(split[0].equals(type)) 
            {
            	
            	dialogue.add(split[1]);
            }
         else if(split[0].equals("general"))
            dialogue.add(split[1]);
        else
             {
             	dialogue.add("Mmm....");
             }
  	     }

  	     Collections.shuffle(dialogue); 
  	    line=dialogue.get(0);    
         }
         catch(IOException ex){}
         return line;
     }

}