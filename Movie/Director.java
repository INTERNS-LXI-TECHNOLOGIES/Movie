import java.io.*;
import java.util.*;
class Director{
   private String name="D";
   ArrayList<Actor> actorslist=new ArrayList<Actor>(); 
   ScriptWriter scriptWriter=new ScriptWriter();
   Scanner in =new Scanner(System.in);
   public String getName()
   {
	   return this.name;
   }
   public void casting() 
   {
   	 	Random rand=new Random();
      int n1=rand.nextInt(2)+1;     
      System.out.println(n1+" Hero");
      int n2=rand.nextInt(2)+1;
      System.out.println(n2+" Heroine");
      int n3=rand.nextInt(3)+1;
      System.out.println(n3+" Villain");
      int n4=rand.nextInt(3)+2; 
      System.out.println(n4+" Comedian");
      System.out.println("\nEnter the Details:");
      readHero(n1);   
      readHeroine(n2);
      readVillain(n3);
      readComedian(n4);
      scriptWriter.script();
   }
   public int action(String type,int dialogue,int songno)
   { 
    Movie movie=new Movie();int r=0;
    String previousDialogue=null,previousName=null,c2="actor";
   	for(int j=0;j<dialogue;j++)
		    {
		    	String name=null; 
		      Actor a=new Actor(); 
          int x=new Random().nextInt(actorslist.size());
          a =(actorslist.get(x)); 
          String dialogueSaid=a.deliverDialogue(type);
          String rol=a.getRoleName();
          String c1=a.getRole();
          try{
             name=a.getName();
             if((name.equals(previousName)&&dialogueSaid.equals(previousDialogue))||(dialogueSaid.equals(previousDialogue)))
                { throw new DuplicationException("Duplicated!!\n");
                 }
             previousDialogue=dialogueSaid;
             previousName=name;
             if((songno>0)&&(r==0))
             {

             int old=songno;
              songno=singSong(type,c1,c2,songno);
             if (old!=songno)
               r=1;
             }
             c2=c1;
             System.out.println("\n"+rol+"("+name+"):"+dialogueSaid);
            }
            catch(DuplicationException de)
            {
              System.out.print(de.getMessage());
              j--;
            }

            
		    }
        return songno;
   }
   public void cut()
     { 
     	String list []={"Hero","Heroine","Villian","Comedian","General"};
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
     public void readHero(int index)
     {
       for(int i=1;i<= index;i++)
        {
         Hero hero =new Hero();
         System.out.print("Hero "+i+"\nReal Name:");
         String realname = in.nextLine(); 
         hero.setName(realname);
         System.out.print("Role Name:");
         String rolename = in.nextLine(); 
         hero.setRoleName(rolename);
         String role="Hero";
         hero.setRole(role);
         actorslist.add(hero);
        }
     }
     public void readHeroine(int index)
     {
       for(int i=1;i<= index;i++)
        {
         Heroine heroine =new Heroine();
         System.out.print("Heroine "+i+"\nReal Name:");
         String realname = in.nextLine(); 
         heroine.setName(realname);
         System.out.print("Role Name:");
         String rolename = in.nextLine(); 
         heroine.setRoleName(rolename);
         String role="Heroine";
         heroine.setRole(role);
         actorslist.add(heroine);
        }
     } 
     public void readVillain(int index)
     {
       for(int i=1;i<= index;i++)
        {
         Villain villain =new Villain();
         System.out.print("Villain "+i+"\nReal Name:");
         String realname = in.nextLine(); 
         villain.setName(realname);
         System.out.print("Role Name:");
         String rolename = in.nextLine(); 
         villain.setRoleName(rolename);
         String role="Villain";
         villain.setRole(role);
         actorslist.add(villain);
        }
     }
     public void readComedian(int index)
     {
       for(int i=1;i<= index;i++)
        {
         Comedian comedian =new Comedian();
         System.out.print("Comedian "+i+"\nReal Name:");
         String realname = in.nextLine(); 
         comedian.setName(realname);
         System.out.print("Role Name:");
         String rolename = in.nextLine();  
         comedian.setRoleName(rolename);
         String role="Comedian";
         comedian.setRole(role);
         actorslist.add(comedian);
        }
     }  
     public int singSong(String type,String c1,String c2,int n)
  {
    String song=null;         
    try
    {
         FileReader fR=new FileReader("Songs.csv");  
         BufferedReader bR=new BufferedReader(fR);
         String line;
         ArrayList<String> songslist=new ArrayList<String>();
         while((line=bR.readLine())!=null)
          {
         String[] split = line.split(",");  
         if(split[0].equals(type))
           {
           songslist.add(split[1]);
           }
          }
         if(songslist.size()>0)
          {int kk=new Random().nextInt(songslist.size());
        song=(songslist.get(kk)); 
      }
     }
    catch(IOException ex)
    {

    }
    int ch=new Random().nextInt(2);
   
     if(ch%2!=0)
     { 
      if(((c1.equals("Hero"))&&(c2.equals("Heroine")))||((c2.equals("Hero"))&&(c1.equals("Heroine"))) )
        {  selectSinger(); System.out.println("\n"+song+"\n");n--;System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
         }
     else if((((c1.equals("Hero"))&&(c2.equals("Comedian")))||((c2.equals("Hero"))&&(c1.equals("Comedian"))))&&(type!="romantic"))
         { selectSinger(); System.out.println("\n"+song);n--;System.out.println("++++++++++++++++++++++++++++++++++++++++++++");
         } 
     else{}
      
     }
     return n;
  }
  public void selectSinger()
     {
       
         Song song =new Song();
         String maleSinger []={"Singer1","Singer2","Singer3","Singer4"};
         String femaleSinger []={"Singer5","Singer6","Singer7","Singer8"};
        // System.out.print("Hero "+i+"\nReal Name:");
        String singer1=(maleSinger [new Random().nextInt(maleSinger.length)]); 
        String singer2=(femaleSinger [new Random().nextInt(femaleSinger.length)]);
        System.out.println("++++++++++++++++++++++++++++++++++++++++\n\tSingers:"+singer1+" "+singer2);
     } 
     
}