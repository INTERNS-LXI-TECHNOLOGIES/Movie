import java.io.*;
import java.util.*;
class Director{
  private String name="D";
  Hero hero =new Hero();
  Heroine heroine =new Heroine();
  ScriptWriter scriptWriter=new ScriptWriter();
   public String getName()
   {
	return this.name;
   }
   public void casting()
   {
   	 	
	 String anamelist []={"Mohanlal","Mammotty","Prithiraj","Jayasurya","Nivin Pauly"};
     String aname=(anamelist[new Random().nextInt(anamelist.length)]);
     hero.setName(aname);
     String snamelist []={"Samatha","Samyutha","Nazriya"};
     aname=(snamelist[new Random().nextInt(snamelist.length)]);
     
     heroine.setName(aname);
     String dnamelist []={"Suraj","Salim Kumar","Jagathish"};
     aname=(dnamelist[new Random().nextInt(dnamelist.length)]);
     Comedian comedian =new Comedian();
     comedian.setName(aname);
     String fnamelist []={"Sonu","Prakash raj"};
     aname=(fnamelist[new Random().nextInt(fnamelist.length)]);
     Villain villain =new Villain();
     villain.setName(aname);
	 scriptWriter.script();
     action();
      
   }
   public void action()
   {
   
   	try
	 {
       File file=new File("blueprint.txt");
       FileReader fR=new FileReader(file);
       BufferedReader bR=new BufferedReader(fR);	
       String line;  

  	   while((line=bR.readLine())!=null)
  	    {
        
	      if(line.equals("Hero"))
  	      { 	
  	      	System.out.println(hero.getName()+" : "+scriptWriter.heroDialogue.get(0));
            scriptWriter.heroDialogue.remove(0);
  	      }
  	      else
  	      {
  	      	
  	      	System.out.println(heroine.getName()+" : "+scriptWriter.heroineDialogue.get(0));
            scriptWriter.heroineDialogue.remove(0);
  	      }
  	    }
  	    FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bW=new BufferedWriter(fileWriter);
  	    bW.write(" ");
  	   
  	    bW.close();
     }
     catch(IOException ex){}
   }
	
}