package main;

import add.AddPresenter;
import display.DisplayPresenter;
import model.Preset;

public class MainPresenter
	{
		private MainView view;
		private DisplayPresenter displayP;
		private AddPresenter addP;
		
		public void showDisplayView()
		{
			view.setContent(displayP.getView());
		}
		
		public void showAddView()
		{
			view.setContent(addP.getView());
		}
		
		public void addPresetButton(Preset p)
		{
			this.displayP.addPresetButton(p);
		}

		//getter/setter-----------------------------------------------
		public MainView getView()
			{
				return view;
			}

		public void setView(MainView view)
			{
				this.view = view;
			}

		public DisplayPresenter getDisplayP()
			{
				return displayP;
			}

		public void setDisplayP(DisplayPresenter displayP)
			{
				this.displayP = displayP;
			}

		public AddPresenter getAddP()
			{
				return addP;
			}

		public void setAddP(AddPresenter addP)
			{
				this.addP = addP;
			}
	}
