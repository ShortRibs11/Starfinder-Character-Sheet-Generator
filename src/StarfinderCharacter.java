import java.util.HashMap;

public class StarfinderCharacter {
	static final int BASE_ATTRIBUTE = 10;
	HashMap<StarfinderSkill, StarfinderAbility> skillAbilities = 
			new HashMap<StarfinderSkill, StarfinderAbility>() {
		{
			put(StarfinderSkill.Acrobatics, StarfinderAbility.Dexterity);
			put(StarfinderSkill.Athletics, StarfinderAbility.Strength);
			put(StarfinderSkill.Bluff, StarfinderAbility.Charisma);
			put(StarfinderSkill.Computers, StarfinderAbility.Intelligence);
			put(StarfinderSkill.Culture, StarfinderAbility.Intelligence);
			put(StarfinderSkill.Diplomacy, StarfinderAbility.Charisma);
			put(StarfinderSkill.Disguise, StarfinderAbility.Charisma);
			put(StarfinderSkill.Engineering, StarfinderAbility.Intelligence);
			put(StarfinderSkill.Intimidate, StarfinderAbility.Charisma);
			put(StarfinderSkill.LifeScience, StarfinderAbility.Intelligence);
			put(StarfinderSkill.Medicine, StarfinderAbility.Intelligence);
			put(StarfinderSkill.Mysticism, StarfinderAbility.Wisdom);
			put(StarfinderSkill.Perception, StarfinderAbility.Wisdom);
			put(StarfinderSkill.PhysicalScience, StarfinderAbility.Intelligence);
			put(StarfinderSkill.Piloting, StarfinderAbility.Dexterity);
			put(StarfinderSkill.SenseMotive, StarfinderAbility.Wisdom);
			put(StarfinderSkill.SleightOfHand, StarfinderAbility.Dexterity);
			put(StarfinderSkill.Stealth, StarfinderAbility.Dexterity);
			put(StarfinderSkill.Survival, StarfinderAbility.Wisdom);
		}
	};
	
	StarfinderSkill trainedSkills[] = {
			StarfinderSkill.Computers,
			StarfinderSkill.Culture,
			StarfinderSkill.Engineering,
			StarfinderSkill.LifeScience,
			StarfinderSkill.Medicine,
			StarfinderSkill.Mysticism,
			StarfinderSkill.PhysicalScience,
			StarfinderSkill.SleightOfHand,
	};
	
	/** Name of the character */
	String name;
	/** Name of the player */
	String playerName;
	
	/**  The character's race */
	StarfinderRace race;
	/** The character's theme */
	StarfinderTheme theme;
	/** The character's class */
	StarfinderClass cClass;
	
	StarfinderAbilities abilityImprovements;
	
	HashMap<StarfinderSkill, Integer> skills;
	

	
	
	public int getAbility(StarfinderAbility a) {
		return race.getAbility(a) + theme.getAbility(a) + 
				abilityImprovements.get(a);
	}
	
	public int getAbilityModifier(StarfinderAbility a) {
		return (getAbility(a)-10)/2;
	}
	
	public int getResolvePoints() {
		return getAbilityModifier(cClass.getKeyAbility());
	}
	
	public int getSkillBonus(StarfinderSkill s) {
		int classBonus = 0;
		int ranks = 0;
		
		// Check if character has ranks in the skill
		if (skills.containsKey(s)) {
			ranks = skills.get(s);
			if (cClass.isClassSkill(s)) {
				classBonus = 3;
			}
		}
		return ranks + classBonus + getAbilityModifier(skillAbilities.get(s));
	}
}
