package tp2;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.LinkedList;

public class Deserialization {

	public ObjectInputStream ois;

	public Deserialization(String file) throws FileNotFoundException,IOException {
		FileInputStream fileTestUnit = new FileInputStream(new File(file));
		ois = new ObjectInputStream(fileTestUnit);
	}

	public LinkedList<Server> deserialization() {
		LinkedList<Server> servers = new LinkedList<Server>();
		try {
			Server server = (Server) nextObject();
			while (server != null) {
				servers.add(server);
				server = (Server) nextObject();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return servers;
	}

	private Object nextObject() throws ClassNotFoundException, IOException {
		try {
			return ois.readObject();
		} catch (EOFException eof) {
			return null;
		} catch (ClassNotFoundException e) {
			throw e;
		} catch (IOException e) {
			throw e;
		}
	}
	
	public static void main (String args[]) throws FileNotFoundException, IOException{
		Deserialization d= new Deserialization("test/tp2/serverKoratTestsCota4.obj");
		int[] cantbans=new int[5];
		int[] cantexceptions=new int[5];
		
		for(int i=0; i<5; i++){
			cantbans[i]=0;
			cantexceptions[i]=0;
		}
		
		
		LinkedList<Server> serversKorat=d.deserialization();
		//System.out.println("cantidad de servers: "+serversKorat.size());
		for(Server s: serversKorat){
			//System.out.println(s.toString());
			//System.out.println("exceptions tiene "+s.exceptions.getSize()+" elementos" );
			//System.out.println("bans tiene "+s.bans.getSize()+" elementos" );
			cantexceptions[s.exceptions.getSize()]=cantexceptions[s.exceptions.getSize()]+1;
			cantbans[s.bans.getSize()]=cantbans[s.bans.getSize()]+1;
			
		}
		System.out.println("----------------------------------------------------------------------------");
		System.out.println("cantidad de servers: "+serversKorat.size());
		System.out.println("----------------------------------------------------------------------------");
		int cantidadCasosExceptions=0;
		for(int i=0; i<5; i++){
			System.out.println("genero "+cantexceptions[i]+" casos en que exceptions tiene "+i+" elementos\n");
			cantidadCasosExceptions=cantidadCasosExceptions+cantexceptions[i];
		}
		if(cantidadCasosExceptions==serversKorat.size())
			System.out.println("cantidad de casos exceptions OK");
		
		System.out.println("----------------------------------------------------------------------------");
		int cantidadCasosBans=0;
		for(int i=0; i<5; i++){
			System.out.println("genero "+cantbans[i]+" casos en que bans tiene "+i+" elementos\n");
			cantidadCasosBans=cantidadCasosBans+cantbans[i];
		}
		if(cantidadCasosBans==serversKorat.size())
			System.out.println("cantidad de casos bans OK");
		System.out.println("----------------------------------------------------------------------------");
	}
}
