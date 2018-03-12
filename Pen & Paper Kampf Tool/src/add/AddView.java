package add;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;


public class AddView extends BorderPane
	{
		private AddPresenter addP;
				
		public AddView(AddPresenter editP)
			{
				this.addP = editP;
				this.initView();
			}

		public void initView()
			{
				Label l = new Label("Add");
				
				setCenter(l);
			}

		// getter/setter--------------------------------------------
		public AddPresenter getEditP()
			{
				return addP;
			}

		public void setEditP(AddPresenter editP)
			{
				this.addP = editP;
			}
	}
