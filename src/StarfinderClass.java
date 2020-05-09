import java.util.ArrayList;

public class StarfinderClass {
	
	String name;
	
	int stamina;
	int hp;
	
	StarfinderAbility keyAbility;
	
	ArrayList<StarfinderSkill> classSkills;
	
	ArrayList<StarfinderProficiency> proficiencies;

	public StarfinderClass(int s, int h) {
		stamina = s;
		hp = h;
		classSkills = new ArrayList<StarfinderSkill>();
		proficiencies = new ArrayList<StarfinderProficiency>();
	}
	
	
	
	public void addClassSkill(StarfinderSkill s) {
		classSkills.add(s);
	}
	
	public void addProficiency(StarfinderProficiency p) {
		proficiencies.add(p);
	}
	
	public StarfinderSkill[] getClassSkills() {
		return (StarfinderSkill[]) classSkills.toArray();
	}
	
	public StarfinderProficiency[] getProficiencies() {
		return (StarfinderProficiency[]) proficiencies.toArray();
	}
	
	public StarfinderAbility getKeyAbility() {
		return keyAbility;
	}
	
	public boolean isClassSkill(StarfinderSkill s) {
		return (classSkills.contains(s));
	}
}
