package Main;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Runnable{
	
	//SCREEN SETTING
	final int originalTileSize = 16; // 16x16 tile
	final int scale = 3;
	
	final int tileSize = originalTileSize * scale; // 40x40 tile
	final int maxScreenCol = 20;
	final int maxScreenRow = 12;
	final int screenWidth = tileSize * maxScreenCol; //768 pixels
	final int screenHeigh = tileSize * maxScreenRow; //567 pixels
	
	Thread gameThread;
	
	
	public GamePanel() {
		
		this.setPreferredSize(new Dimension(screenWidth,screenHeigh));
		this.setBackground(Color.black);
		this.setDoubleBuffered(true);
		
	}

	public void startGameThread() {
		
		gameThread = new Thread();
		gameThread.start();
		
	}
	
	@Override
	public void run() {
		
		
		
	}
	
}
