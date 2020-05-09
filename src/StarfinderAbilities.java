import java.util.HashMap;

public class StarfinderAbilities {

	/*
	protected int Strength;
	protected int Dexterity;
	protected int Constitution;
	protected int Intelligence;
	protected int Wisdom;
	protected int Charisma;
	*/
	HashMap<StarfinderAbility, Integer> abilities;
	
	public StarfinderAbilities() {
		abilities = new HashMap<StarfinderAbility, Integer>();
//		Strength = Dexterity = Constitution = Intelligence = Wisdom = Charisma = 0;
	}
	
	public StarfinderAbilities(int str, int dex, int con, int intel, int wis, int cha) {
		abilities = new HashMap<StarfinderAbility, Integer>();
		
		abilities.put(StarfinderAbility.Strength, str);
		abilities.put(StarfinderAbility.Dexterity, dex);
		abilities.put(StarfinderAbility.Constitution, con);
		abilities.put(StarfinderAbility.Intelligence, intel);
		abilities.put(StarfinderAbility.Wisdom, wis);
		abilities.put(StarfinderAbility.Charisma, cha);
/*		Strength = str;
		Dexterity = dex;
		Constitution = con;
		Intelligence = intel;
		Wisdom = wis;
		Charisma = cha;		*/
	}
	
	public void setStrength(int str) {
		abilities.put(StarfinderAbility.Strength, str);
	}
	
	public int getStrength() {
		return abilities.get(StarfinderAbility.Strength);
	}
	
	public void setDexterity(int dex) {
		abilities.put(StarfinderAbility.Dexterity, dex);
	}
	
	public int getDexterity() {
		return abilities.get(StarfinderAbility.Dexterity);
	}
	
	public void setConstitution(int con) {
		abilities.put(StarfinderAbility.Constitution, con);
	}
	
	public int getConstitution() {
		return abilities.get(StarfinderAbility.Constitution);
	}
	
	public void setIntelligence(int intel) {
		abilities.put(StarfinderAbility.Intelligence, intel);
	}
	
	public int getIntelligence() {
		return abilities.get(StarfinderAbility.Intelligence);
	}
	
	public void setWisdom(int wis) {
		abilities.put(StarfinderAbility.Wisdom, wis);
	}
	
	public int getWisdom() {
		return abilities.get(StarfinderAbility.Wisdom);
	}
	
	public void setCharisma(int cha) {
		abilities.put(StarfinderAbility.Charisma, cha);
	}
	
	public int getCharisma() {
		return abilities.get(StarfinderAbility.Wisdom);
	}
	
	public void set(StarfinderAbility a, int value) {
		abilities.put(a, value);
	}
	
	public int get(StarfinderAbility a) {
		return abilities.get(a);
	}
}
