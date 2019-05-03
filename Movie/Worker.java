import java.io.*;
class Worker
{
	public static void main(String[] args) {

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