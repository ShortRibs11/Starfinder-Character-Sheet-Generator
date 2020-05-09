import java.util.ArrayList;

public class StarfinderRace {
	
	//----------------------------
	//  Class Members
	//----------------------------

	/**  The name of the class.  */
	String name;
	
	/**  Contains the ability score improvements or penalties
	 * from selecting this race.  */
	StarfinderAbilities abilities;

	/**  Describes the amount added to the character's hit points.  */
	protected int hp;

	/**  The speed at which the character can move.
	 * Will almost always be 30.  */
	protected int speed = 30;

	/**  Lists the racial traits the character gets as this race.  */
	protected ArrayList<StarfinderTrait> traits;
	
	//----------------------------
	//  Constructors
	//----------------------------
	
	/**
	 * Creates an empty race object with empty lists and 0 hit points.
	 */
	public StarfinderRace() {
		abilities = new StarfinderAbilities();
		traits = new ArrayList<StarfinderTrait>();
		hp = 0;
	}

	
	/**
	 * Creates a race object with empty traits but defined
	 * ability scores and hit points.
	 */
	public StarfinderRace(int str, int dex, int con, 
			int intel, int wis, int cha, int hit) {
		abilities = new StarfinderAbilities(str, dex, con, intel, wis, cha);
		traits = new ArrayList<StarfinderTrait>();
		hp = hit;
	}

	/**
	 * Creates a race object with empty traits and a preexisting
	 * ability scores object.
	 */
	public StarfinderRace(StarfinderAbilities ab) {
		abilities = ab;
		traits = new ArrayList<StarfinderTrait>();
	}

	/**
	 * Creates a race object with empty traits and a preexisting
	 * ability scores object and defined hit points.
	 */
	public StarfinderRace(StarfinderAbilities ab, int hit) {
		abilities = ab;
		traits = new ArrayList<StarfinderTrait>();
		hp = hit;
	}

	//----------------------------
	//  Accessor Methods - Accesors and Mutators
	//----------------------------

	/**
	 * Mutator for Name.
	 */
	public void setName(String na) {
		name = na;
	}

	/**
	 * Accessor for Name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Mutator for Strength attribute.
	 */
	public void setStrength(int str) {
		abilities.setStrength(str);
	}

	/**
	 * Accessor for Strength attribute.
	 */
	public int getStrength() {
		return abilities.getStrength();
	}

	/**
	 * Mutator for Dexterity attribute.
	 */
	public void setDexterity(int dex) {
		abilities.setDexterity(dex);
	}

	/**
	 * Accessor for Dexterity attribute.
	 */
	public int getDexterity() {
		return abilities.getDexterity();
	}

	/**
	 * Mutator for Constitution attribute.
	 */
	public void setConstitution(int con) {
		abilities.setConstitution(con);
	}

	/**
	 * Accessor for Constitution attribute.
	 */
	public int getConstitution() {
		return abilities.getConstitution();
	}

	/**
	 * Mutator for Intelligence attribute.
	 */
	public void setIntelligence(int intel) {
		abilities.setIntelligence(intel);
	}

	/**
	 * Accessor for Intelligence attribute.
	 */
	public int getIntelligence() {
		return abilities.getIntelligence();
	}

	/**
	 * Mutator for Wisdom attribute.
	 */
	public void setWisdom(int wis) {
		abilities.setWisdom(wis);
	}

	/**
	 * Accessor for Wisdom attribute.
	 */
	public int getWisdom() {
		return abilities.getWisdom();
	}

	/**
	 * Mutator for Charisma attribute.
	 */
	public void setCharisma(int cha) {
		abilities.setCharisma(cha);
	}

	/**
	 * Accessor for Charisma attribute.
	 */
	public int getCharisma() {
		return abilities.getCharisma();
	}

	/**
	 * Generic Mutator for abilities.
	 */
	public void setAbility(StarfinderAbility a, int value) {
		abilities.set(a, value);
	}

	/**
	 * Generic Accessor for abilities.
	 */
	public int getAbility(StarfinderAbility a) {
		return abilities.get(a);
	}

	/**
	 * Mutator for Hit Points.
	 */
	public void setHitPoints(int hit) {
		hp = hit;
	}

	/**
	 * Accessor for Hit Points.
	 */
	public int getHitPoints() {
		return hp;
	}

	/**
	 * Mutator for Speed.
	 */
	public void setSpeed(int spd) {
		speed = spd;
	}

	/**
	 * Accessor for Speed.
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * Mutator for racial traits.
	 */
	public void setTraits(ArrayList<StarfinderTrait> t) {
		traits = t;
	}

	/**
	 * TODO: Bugtest this
	 * Accessor for racial traits: Returns a clone of the list.
	 */
	public ArrayList<StarfinderTrait> getTraits() {
		return (ArrayList<StarfinderTrait>)traits.clone();
	}
	
	//----------------------------
	//  Miscellaneous Methods
	//----------------------------

	/**
	 * Adds a new racial trait.
	 */
	public void addTrait(StarfinderTrait t) {
		traits.add(t);
	}
	
	/**
	 * Removes a specified racial trait.
	 * Returns 'false' if the object was not found. 
	 */
	public boolean removeTrait(StarfinderTrait t) {
		if (traits.contains(t)) {
			traits.remove(t);
			return true;
		} else {
			return false;
		}
	}
	
	/**
	 * Removes a racial trait by index.
	 * Returns 'false' if the index is out of range. 
	 */
	public boolean removeTrait(int i) {
		if (traits.size() > i) {
			traits.remove(i);
			return true;
		} else {
			return false;
		}
	}
}
