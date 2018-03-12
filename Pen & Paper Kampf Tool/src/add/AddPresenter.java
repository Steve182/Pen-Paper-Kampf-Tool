package add;

import main.MainPresenter;
import model.Model;
import model.Preset;

public class AddPresenter
	{
		private AddView addV;
		private Model model;
		private MainPresenter mainP;
		
		public void makePreset(String name)
		{
			Preset p = new Preset(name);
			this.model.addPresets(p);
			this.mainP.addPresetButton(p);
		}

		// getter/setter-------------------------------------------
		public AddView getView()
			{
				return addV;
			}

		public void setView(AddView addV)
			{
				this.addV = addV;
			}

		public Model getModel()
			{
				return model;
			}

		public void setModel(Model model)
			{
				this.model = model;
			}

		public MainPresenter getMainPresenter()
			{
				return this.mainP;
			}

		public void setMainPresenter(MainPresenter mainP)
			{
				this.mainP = mainP;
			}

		public AddView getAddV()
			{
				return addV;
			}

		public void setAddV(AddView addV)
			{
				this.addV = addV;
			}

		public MainPresenter getMainP()
			{
				return mainP;
			}

		public void setMainP(MainPresenter mainP)
			{
				this.mainP = mainP;
			}
	}
