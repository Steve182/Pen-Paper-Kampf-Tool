package display;

import main.MainPresenter;
import model.Model;

public class DisplayPresenter
	{
		private DisplayView view;
		private Model model;
		
		private MainPresenter mainP;
		
		
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
