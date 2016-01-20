package tmcit.freedom.System;

import javax.swing.ToolTipManager;

import tmcit.freedom.UI.MainFrame;
import tmcit.freedom.Util.IconUtil;

public class Main {
	public static final String appName = "PIPE M@STER Visualize Application";

	public static final int[] dirX = {0, 0, -1, 1};
	public static final int[] dirY = {-1, 1, 0, 0};

	public Main(){
		new IconUtil("Parts");
		this.setToolTip();
		ProblemManager.setMainFrame(new MainFrame(appName));
	}

	private void setToolTip(){
		ToolTipManager tp = ToolTipManager.sharedInstance();
		tp.setInitialDelay(0);
	}

	public static void main(String[] args){
		new ProblemDownloader();
		new Main();
	}

}
