package models;

import java.util.ArrayList;

public class techStud extends user{
	private ArrayList<String> skill=new ArrayList<String>();
	private ArrayList<String> intern=new ArrayList<String>();
	
	public void setSkill(String skill){
		this.skill.add(skill);
	}
	public ArrayList<String> getSkill(){
		return skill;
	}
	public void setIntern(String intern){
		this.intern.add(intern);
	}
	public ArrayList<String> getIntern(){
		return intern;
	}
}
