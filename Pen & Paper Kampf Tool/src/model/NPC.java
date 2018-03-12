package model;

import java.util.HashMap;

public class NPC extends Entity
	{
		private HashMap<String, Integer> attributes;
		private Weapon weapon;
		private int armor;
		
		//getter/setter
		public HashMap<String, Integer> getAttributes()
			{
				return attributes;
			}
		public void setAttributes(HashMap<String, Integer> attributes)
			{
				this.attributes = attributes;
			}
		public Weapon getWeapon()
			{
				return weapon;
			}
		public void setWeapon(Weapon weapon)
			{
				this.weapon = weapon;
			}
		public int getArmor()
			{
				return armor;
			}
		public void setArmor(int armor)
			{
				this.armor = armor;
			}
	}
