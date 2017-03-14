package nsu.fit.g14203.pospelov.filter;

import ru.nsu.cg.MainFrame;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Main window class
 * @author Ivan Pospelov
 */
public class InitMainWindow extends MainFrame {


	/**
	 * Default constructor to create main window
	 */
    private JScrollPane scrollPane;
	private static int windowWidth = 600;
	private static int windowHeight = 400;

	private InitMainWindow()
	{
		super(windowWidth, windowHeight, "Init application");
/*		combGrid = new CombGrid(windowWidth - 200, windowHeight - 100);
		scrollPane = new JScrollPane(combGrid);
        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
		combGridController = new CombGridController(combGrid, new CombGridModel());
		drawed = false;*/

		this.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
	/*			if(drawed) {
					JPanel exitPanel = new JPanel();
					JLabel exitLabel = new JLabel("Are you sure to exit without saving?");
					exitPanel.add(exitLabel);
					int result = JOptionPane.showConfirmDialog(null, exitPanel,
							"Exit without saving", JOptionPane.OK_CANCEL_OPTION);
					if (result == JOptionPane.OK_OPTION)
						System.exit(0);
					if (result == JOptionPane.CANCEL_OPTION) {
						combGridController.writeDataToFile();
						System.exit(0);
					}
				}else {
					System.exit(0);
				}*/
			}
		});

		try
		{
			/*addSubMenu("File", KeyEvent.VK_F);
			addSubMenu("Help", KeyEvent.VK_H);
			addSubMenu("Edit", KeyEvent.VK_E);
			addSubMenu("View", KeyEvent.VK_V);


			addMenuItem("File/Exit", "Exit application", KeyEvent.VK_X, "Exit.gif", "onExit");
			addMenuItem("File/New", "New field", KeyEvent.VK_N, "new.png", "onNew");
			addMenuItem("File/Save as...", "Save file", KeyEvent.VK_S, "save.png", "onSave");
			addMenuItem("File/Open", "Open file", KeyEvent.VK_O, "open.png", "onOpen");


			addMenuItem("View/Next step", "Next iteration of life", KeyEvent.VK_S, "nextstep.png", "onNextStep");
			addMenuItem("View/Impact", "Show state over impact", KeyEvent.VK_I, "numbers.png", "onShowImpact");
			addMenuItem("View/Start cycle", "Cycle of iterations of life", KeyEvent.VK_P, "play-button.png", "onPlay");

			addMenuItem("Edit/Settings", "Program settings", KeyEvent.VK_S, "settings.png", "onSettings");
			addMenuItem("Edit/XOR", "Determine edit mode as XOR", KeyEvent.VK_S, "xor.png", "onXOR");
			addMenuItem("Edit/Replace mode", "Determine edit mode as replace", KeyEvent.VK_S, "plus.png", "onReplace");
			addMenuItem("Edit/Clear", "Clear field", KeyEvent.VK_S, "clear.png", "onClear");


			addMenuItem("Help/About...", "Shows program version and copyright information", KeyEvent.VK_A, "About.gif", "onAbout");


			addToolBarButton("File/Open");
			addToolBarSeparator();
			addToolBarButton("File/Save as...");
			addToolBarSeparator();
			addToolBarButton("File/New");
			addToolBarSeparator();
			addToolBarButton("File/Exit");
			addToolBarSeparator();
			addToolBarButton("Edit/Settings");
			addToolBarSeparator();
			addToolBarButton("Help/About...");
			addToolBarSeparator();
			addToolBarButton("Edit/XOR");
			addToolBarSeparator();
			addToolBarButton("Edit/Replace mode");
			addToolBarSeparator();
			addToolBarButton("View/Next step");
			addToolBarSeparator();
			addToolBarButton("View/Start cycle");
			addToolBarSeparator();
			addToolBarButton("View/Impact");
			addToolBarSeparator();
			addToolBarButton("Edit/Clear");


			add(scrollPane, BorderLayout.CENTER);*/



		}
		catch(Exception e)
		{
			throw new RuntimeException(e);
		}

	}

	/**
	 * Application main entry point
	 * @param args command line arguments (unused)
	 */
	public static void main(String[] args)
	{
		InitMainWindow mainFrame = new InitMainWindow();
		mainFrame.setVisible(true);
	}
}
