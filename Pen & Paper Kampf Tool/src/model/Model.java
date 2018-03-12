package model;

import java.util.ArrayList;

public class Model
	{
		private ArrayList<Preset> presets;
		
		public Model()
		{
			this.presets = new ArrayList<>();
		}
		
		public void addPresets(Preset... p)
		{
			for(int i = 0; i < p.length; i++)
				this.presets.add(p[i]);
		}

		//getter/setter
		public ArrayList<Preset> getPresets()
			{
				return presets;
			}

		public void setPresets(ArrayList<Preset> presets)
			{
				this.presets = presets;
			}
	}
