import java.io.*;
import java.util.*;
class Director{
  private String name="D";
  Hero hero =new Hero();
  Heroine heroine =new Heroine();
  Villain villain =new Villain();
  Comedian comedian =new Comedian();
  General general= new General();
  ScriptWriter scriptWriter=new ScriptWriter();
   public String getName()
   {
	return this.name;
   }
   public void casting()
   {
   	 	
	 String anamelist []={"Mohanlal","Mammotty","Prithiraj","Jayasurya","Nivin Pauly","Kunchacko Boban"};
     String aname=(anamelist[new Random().nextInt(anamelist.length)]);
     hero.setName(aname);

     String snamelist []={"Samatha","Samyutha","Nazriya","Anu Sithara"};
     aname=(snamelist[new Random().nextInt(snamelist.length)]);
     heroine.setName(aname);

     String dnamelist []={"Suraj","Salim Kumar","Jagathish"};
     aname=(dnamelist[new Random().nextInt(dnamelist.length)]);
     comedian.setName(aname);

     String fnamelist []={"Sonu","Prakash raj"};
     aname=(fnamelist[new Random().nextInt(fnamelist.length)]);
     villain.setName(aname);

     String gnamelist []={"Character1","Character2","Character3"};
     aname=(gnamelist[new Random().nextInt(snamelist.length)]);
     general.setName(aname);
     System.out.println("Casting\nHero:"+hero.getName()+"\nHeroine:"+heroine.getName()+"\nVillain:"+villain.getName()+"\nComedian:"+comedian.getName()+"\nOthers:"+general.getName());
     // String characters []={hero.getName(),heroine.getName(),villain.getName(),comedian.getName(),general.getName()}
      scriptWriter.script();
     //scriptWriter.clearFileData(f);


   }
   public void action(String type,int dialogue)
   {
   	for(int j=0;j<dialogue;j++)
		    {
		    	String name=null;
		    	String list []={"hero","heroine","villian","comedian","general"};
                String teller=(list[new Random().nextInt(list.length)]); 
                 Actor a=new Actor();
                String dialogueSaid=a.deliverDialogue(teller,type);
                if(teller.equals("hero"))
                {
                	name=hero.getName();
                }
               else if(teller.equals("heroine"))
                {
                	name=heroine.getName();
                }
               else if(teller.equals("villain"))
                {
                	name=villain.getName();
                }
                else if(teller.equals("comedian"))
                {
                	name=comedian.getName();
                }
                else{
                	name=general.getName();
                }
                System.out.println("\n"+name+":"+dialogueSaid);

		    }
    
    
   }
   public void cut()
     { 
     	String list []={"hero","heroine","villian","comedian","general"};
     	for(int i=0;i<list.length;i++)
     	{
     		String s=list[i];
     	String file=s+"Dialogue.csv";
     	try{
     	    FileWriter fW = new FileWriter(file);
       	    BufferedWriter bW=new BufferedWriter(fW);
  	    	bW.write(" ");
  	    	bW.close();
  	        }
  	       catch(IOException ex){

  	       } 

     	}
     }
	
}