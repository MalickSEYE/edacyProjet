package model;

import java.util.ArrayList;

public class School {
	private ArrayList<Talent> talents = new ArrayList<Talent>();
	private static int effectif = 0;
	
	public void addTalent(Talent T){
		if(T!=null){
			talents.add(T);
			effectif++;
		}
	}

}
