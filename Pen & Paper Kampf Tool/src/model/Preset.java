package model;

import java.util.ArrayList;

public class Preset
	{
		private String presetName;
		private ArrayList<NPC> npcs;
		
		public Preset(String name)
		{
			this.presetName = name;
			this.npcs = new ArrayList<>();
		}
		
		public void addToPreset(NPC npc)
		{
			if(npc != null)
				this.npcs.add(npc);
		}
		
		@Override
		public String toString()
		{
			return this.presetName;
		}
		
		//getter/setter
		public String getPresetName()
			{
				return presetName;
			}
		public void setPresetName(String presetName)
			{
				this.presetName = presetName;
			}
		public ArrayList<NPC> getNpcs()
			{
				return npcs;
			}
		public void setNpcs(ArrayList<NPC> npcs)
			{
				this.npcs = npcs;
			}
		
	}
