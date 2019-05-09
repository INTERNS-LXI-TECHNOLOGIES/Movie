import java.io.*;
import java.util.*;
class Actor{
  int numberOfActor;
private String name;
private String roleName;
private String role;
public void setRole(String role)
{
  this.role=role;
}
public String getRole()
{
  return this.role;
}
public String  getName()
{
	return this.name;
}
public void  setName(String name)
{
	 this.name=name;
}
public int  getnumberOfActor()
{
  return this.numberOfActor;
}
public void  setnumberOfActor(int numberOfActor)
{
   this.numberOfActor=numberOfActor;
}
public void  setRoleName(String roleName)
{
   this.roleName=roleName;
}

	public String  getRoleName()
{
	return this.roleName;
}
public String deliverDialogue(String type)
     {
      String file1=this.getRole();
     	String file2=file1+"Dialogue.csv";
     	 String line=null;
       try{
       	
          FileReader fR=new FileReader(file2);
     ArrayList <String> dialogue=new ArrayList <String> ();
     BufferedReader bR=new BufferedReader(fR);
     
     while((line=bR.readLine())!=null)
  	    {
  	    String[] split = line.split(",");
  	     
  	    if((split[0].equals(type)) ||(split[0].equals("general")) )
            {
            	
            	dialogue.add(split[1]);
            }
        // else if(split[0].equals("general"))
        //    dialogue.add(split[1]);
        else
             {
             }
  	     }
        int xx=dialogue.size();
        // System.out.println("$$"+xx);
         if(xx<=0){
          line="Hai";
         }
          else{
             Random rand=new Random();
              int p=rand.nextInt(dialogue.size());
  	    
  	    line=dialogue.get(p);
        }  
       

         }
         catch(IOException ex){}
        
         return line;
     }

}