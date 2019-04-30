import java.io.*;
public class Movie
{
	public void playMovie(){
		ScriptWriter scriptWriter=new ScriptWriter();
		String movieName=scriptWriter.getScriptName();
		System.out.println("Movie name:"+movieName);
        Director director=new Director();
        String directorName=director.getName();
		System.out.println("Directed by "+directorName);
        Producer producer=new Producer();
        String producerName=producer.getName();
		System.out.println("Produced by "+producerName);
		String scriptWriterName=scriptWriter.getName();
		System.out.println("Story written by "+scriptWriterName);
		director.casting();
	}
}