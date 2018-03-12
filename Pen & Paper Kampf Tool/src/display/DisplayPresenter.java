package display;

import main.MainPresenter;
import model.Model;
import model.Preset;

public class DisplayPresenter
	{
		private DisplayView view;
		private Model model;
		
		private MainPresenter mainP;
		
		public void showSelectedPreset()
			{
				
			}
		
		public void addPresetButton(Preset p)
		{
			this.view.addPresetButton(p);
		}
		
		
		//getter/setter----------------------------------------
		public DisplayView getView()
			{
				return view;
			}
		public void setView(DisplayView view)
			{
				this.view = view;
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

		public MainPresenter getMainP()
			{
				return mainP;
			}

		public void setMainP(MainPresenter mainP)
			{
				this.mainP = mainP;
			}
	}
