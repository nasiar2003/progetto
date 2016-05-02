package it.tdp.polito.lab0.model;


import java.util.Collections;
import java.util.LinkedList;
import java.util.List;



public class Model {
	
	private List<String>parole;
	
	
	public Model(){
		
		parole= new LinkedList<String>();
	}
	public void addParola(String p){
		if(!parole.contains(p)){
		this.parole.add(p);
		}
	}
	
	public List<String> getElenco(){
		
		List <String>ltemp= new LinkedList<>(parole);
		
		if(ltemp.size()==0){
			return null;
		}
		Collections.sort(ltemp);
		return ltemp;
		
	}
	
	public void reset(){
		this.parole.clear();
	}

}
