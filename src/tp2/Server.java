package tp2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import randoop.CheckRep;

import korat.finitization.IClassDomain;
import korat.finitization.IFinitization;
import korat.finitization.IIntSet;
import korat.finitization.ILongSet;
import korat.finitization.IObjSet;
import korat.finitization.impl.FinitizationFactory;

/**
 * This class represents a server which accepts connections and manages bans an exceptions
 * 
 * @author 
 * @author 
 * @version 0.1
 */

public class Server implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Long expirationTime= new Long(60000);
		
	private Long lastUpdate;
	
	/**
	 * A set of exceptions
	 */
	SinglyLinkedList exceptions;
	
	/**
	 * A list of bans
	 */
	StrictlySortedSinglyLinkedList bans;
	
	/**
	 * It returns the current system time
	 */
	private ITime time;
	
	public void setTime(ITime time) {
		if(time!=null){
			this.time = time;
		}else{
			this.time = new RealTime();
		}
	}

	/**
	 * Creates a new server
	 */
	public Server() {
		this.exceptions = new SinglyLinkedList();
		this.bans = new StrictlySortedSinglyLinkedList();
		this.time = new RealTime();
		this.lastUpdate=(long) 0;
	}
	
	/**
	 * Accepts a new connection.
	 * If there's a ban for the connecting IP and the ban is not yet due then the connection will be refused.
	 * It returns true iff the connection was accepted.
	 */
	public boolean connect(IP ip) {
		if(bans.containsIP(ip))
			return false;
		else
			return true;
	}
	
	/**
	 * Add a new exception.
	 * If there's a ban for the exception's IP then the ban will be removed.
	 * It returns true iff the exception was successfully added.
	 */
	public boolean addException(IP ip) {
		if(ip==null){
			return false;
		}
		if (exceptions.contains(ip)) {
			return false;
		}
		else{
			bans.removeFromIP(ip);
			exceptions.add(ip);
			return true;
		}
	}
	
	/**
	 * Remove IP from exception list.
	 * It returns true iff the IP was removed from the exception list.
	 */
	public boolean removeException(IP ip) {
		return exceptions.remove(ip);
	}
	
	/**
	 * Adds a new ban iff a ban for the same IP doesn't exist and there's not an exception for the bans IP
	 * returns true iff the ban was successfully added
	 */
	public boolean addBan(IP ban) {
		// ban must be not null
		if(ban==null){
			return false;
		}
		//no repeated
		if (bans.containsIP(ban)) {
			return false;
		}
		
		//banned IP's cannot be in the exceptions list
		if(exceptions.contains(ban))
			return false;
		
		//create new banned IP with the currentTime plus the expirationTime constant.
		IPBan ipban = new IPBan(ban, time.getCurrentTime()+expirationTime);
		bans.add(ipban);
		return true;
	}
	
	/** Removes the IP from the bans list
	*/
	public boolean removeBan(IP ban) {
		//no repeated
		if (!bans.containsIP(ban)) {
			return false;
		}
		
		//remove the banned IP's from bans list
		bans.removeFromIP(ban);
		
		return true;
	}
	
	/**
	 * Update the banned list and the lastUpdate time
	 * @return
	 */
	public void update() {
		
		lastUpdate = time.getCurrentTime();
		
		IPBan b;
		while(bans.getSize()>0 && (b=bans.get(0)).expires.compareTo(lastUpdate) <= 0){
			bans.removeFromIP(b.ip);
		}
		
	}
	
	@CheckRep
	public boolean repOK(){
		/* TODO: Completar este metodo
		bans es una lista de IPBan
			ORDENADA (respecto al tiempo de expiracion de cada IP) 
			SIN REPETICIONES de expires.
			SIN REPETICIONES de IP.
			NINGUN IP baneado tiene tiempo menor a lastupdate
		exceptiones es una lista de IPs
			SIN REPETICIONES
			lista SIMPLEMENTE ENCADENADA con ELEMENTO CENTINELA
		exceptiones y bans
			NO COMPARTEN ELEMENTOS
		*/
		if(!bans.repOK())
			return false;
		
		if(!bansOkTime())
			return false;
		
		if(!exceptions.repOK())
			return false;
		
		if(!notSharedElements())
			return false;
			
		return true;
	}
	

	private static List<IP> fixedIPList() {
		ArrayList<IP> res = new ArrayList<IP>(20);
		res.add(new IP(102,103,254,98));
		res.add(new IP(102,152,254,98));
		res.add(new IP(102,103,233,98));
		res.add(new IP(102,103,254,5));
		res.add(new IP(1,103,254,98));
		res.add(new IP(192,168,24,98));
		res.add(new IP(192,168,12,98));
		res.add(new IP(200,13,233,98));
		res.add(new IP(10,103,254,5));
		res.add(new IP(111,13,254,98));
		res.add(new IP(10,10,4,1));
		res.add(new IP(10,52,54,98));
		res.add(new IP(2,3,233,98));
		res.add(new IP(102,13,4,5));
		res.add(new IP(111,103,254,98));
		res.add(new IP(192,168,0,98));
		res.add(new IP(192,168,0,9));
		res.add(new IP(20,13,33,15));
		res.add(new IP(120,3,2,5));
		res.add(new IP(110,13,20,98));
		return res;		
	}
	
	
	private static List<Long> fixedLongList() {
		ArrayList<Long> res = new ArrayList<Long>(20);
		res.add(new Long(100000));
		res.add(new Long(200000));
		res.add(new Long(300000));
		res.add(new Long(400000));
		res.add(new Long(500000));
		res.add(new Long(600000));
		res.add(new Long(700000));
		res.add(new Long(800000));
		res.add(new Long(900000));
		res.add(new Long(1000000));
		res.add(new Long(1100000));
		res.add(new Long(1200000));
		res.add(new Long(1300000));
		res.add(new Long(1400000));
		res.add(new Long(1500000));
		res.add(new Long(1600000));
		res.add(new Long(1700000));
		res.add(new Long(1800000));
		res.add(new Long(1900000));
		res.add(new Long(2000000));
		return res;		
	}	
	
	
	
	public static IFinitization finServer(int maxSizeLists) {

		IFinitization f = FinitizationFactory.create(Server.class);

		IObjSet exceptionsLists = f.createObjSet(SinglyLinkedList.class, false);
		exceptionsLists.addClassDomain(f.createClassDomain(SinglyLinkedList.class, 1));
			
		
		IObjSet entries = f.createObjSet(Entry.class, true);
		entries.addClassDomain(f.createClassDomain(Entry.class, maxSizeLists+1));
		IIntSet sizes = f.createIntSet(0, maxSizeLists);

			
		IObjSet bansLists = f.createObjSet(StrictlySortedSinglyLinkedList.class, false);
		bansLists.addClassDomain(f.createClassDomain(StrictlySortedSinglyLinkedList.class, 1));

		IObjSet nodes = f.createObjSet(Node.class, true);
		nodes.addClassDomain(f.createClassDomain(Node.class, maxSizeLists+1));
	

		List<Long> longsList = fixedLongList();
		IObjSet longs = f.createObjSet(Long.class, false);
		IClassDomain longsClassDomain = f.createClassDomain(Long.class);
		longsClassDomain.includeInIsomorphismCheck(false);		
		for (int i = 0; i < maxSizeLists; i++) {
			longsClassDomain.addObject(longsList.get(i));
		}
		longs.addClassDomain(longsClassDomain);

		int listElems = maxSizeLists + 1;

		List<IP> IPList = fixedIPList();
		IObjSet ips = f.createObjSet(IP.class, true);
		IClassDomain elemsClassDomain = f.createClassDomain(IP.class);
		elemsClassDomain.includeInIsomorphismCheck(false);
		for (int i = 0; i < listElems; i++) {
			elemsClassDomain.addObject(IPList.get(i));
		}
		ips.addClassDomain(elemsClassDomain);
		

		IObjSet ipbans = f.createObjSet(IPBan.class, true);
		ipbans.addClassDomain(f.createClassDomain(IPBan.class, maxSizeLists));
		

		f.set("exceptions", exceptionsLists);
		
		f.set("SinglyLinkedList.header", entries);
		f.set("SinglyLinkedList.size", sizes);		
		f.set("Entry.next", entries);
		
		f.set("Entry.element", ips);
		
		f.set("bans", bansLists);
		f.set("StrictlySortedSinglyLinkedList.header", nodes);
		f.set("StrictlySortedSinglyLinkedList.size", sizes);
		f.set("Node.next", nodes);
		
		f.set("Node.element", ipbans);
		f.set("IPBan.ip", ips);
		f.set("IPBan.expires", longs);
		
		f.set("lastUpdate", longs);
		
		return f;
	}


	@Override
	public String toString() {
		return "Server [lastUpdate=" + String.valueOf(lastUpdate) + ", exceptions=" + exceptions.toString() + ", bans=" + bans.toString() + "]";
	} 
	
	/*
	 * This method returns True iff bans list does not contain IPs which 
	 * expiration time is lower than lastupdate time
	 * Used for repOk
	 */
	public boolean bansOkTime(){
		boolean okTime = true;
		//if bans list has at least one element
		if(bans.header.next!=null){
			//get the first element (after the sentinel one)
			Node current = bans.header.next;
			//and loop over the list until a null is found or there is an
			//expired time that is greater that the lastupdate time
			while(current != null && okTime){
				okTime = ( current.element.expires > lastUpdate );
				current = current.next;
			}
		}
		return okTime;
	}
	
	/*
	 * This method returns True iff bans and exceptions does not share elements (IPs)
	 * Used for repOk
	 */
	public boolean notSharedElements(){
		boolean notShared = true;
		//list of exceptions IP's
		LinkedList<IP> IPExceptions=new LinkedList<IP>();
		//list of baned IP's
		LinkedList<IP> IPBans=new LinkedList<IP>();
		//if bans has at least 1 element and exceptions has at least 1 element
		if(bans.header.next!=null && exceptions.header.next!=null){
			// get the first exception entry
			Entry current=exceptions.header.next;
			// while current entry still not null
			while(current!=null){
				// save the current element IP
				IPExceptions.add(current.element);
				current=current.next;
			}
			// get baned IP's
			Node banIP=bans.header.next;
			while(banIP!=null){
				// save the current element IP
				IPBans.add(banIP.element.ip);
				banIP=banIP.next;
			}
			
			for(IP ban: IPBans){
				notShared= !IPExceptions.contains(ban);
				if(!notShared)
					return false;
			}
		}
		return notShared;
		
	}
	
	// this method return lastupdate value
	// used for testing
	public long getLastUpdate(){
		return lastUpdate;
	}
	
	//This method returns current time value
	// used for testing (Theories)
	public ITime getTime(){
		return time;
	}
}
