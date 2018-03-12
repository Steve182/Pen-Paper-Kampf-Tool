package model;

public class Weapon
	{
		private String name;
		private Waffenklasse klasse;
		private int dmg;
		private int bonus;
		
		
		enum Waffenklasse
		{
			WUCHT, 
			KURZE_KLINGEN,
			STUMPFE,
			STICH,
			SCHUSS,
			WAFFENLOS,
			WURF,
			AEXTE,
			STANGEN,
			MECHANISCH
		}
		
		//getter/setter
		public String getName()
			{
				return name;
			}
		public void setName(String name)
			{
				this.name = name;
			}
		public Waffenklasse getKlasse()
			{
				return klasse;
			}
		public void setKlasse(Waffenklasse klasse)
			{
				this.klasse = klasse;
			}
		public int getDmg()
			{
				return dmg;
			}
		public void setDmg(int dmg)
			{
				this.dmg = dmg;
			}
		public int getBonus()
			{
				return bonus;
			}
		public void setBonus(int bonus)
			{
				this.bonus = bonus;
			}
		
		
	}
