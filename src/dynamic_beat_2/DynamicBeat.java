package dynamic_beat_2;

import javax.swing.*;
import java.awt.Image;
import java.awt.Graphics;

public class DynamicBeat extends JFrame {

  private Image screenImage;
  private Graphics screenGraphics;

  private Image introBackground;


  // constructor
  public DynamicBeat() { setTitle("Dynamic Beat");
    setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
    setResizable(false);
    setLocationRelativeTo(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);

    introBackground = new ImageIcon(Main.class.getResource("../img/introBackground.jpg")).getImage();
  }

  public void paint(Graphics g){
    screenImage = createImage(Main.SCREEN_WIDTH,Main.SCREEN_HEIGHT);
    screenGraphics = screenImage.getGraphics();
    screenDraw(screenGraphics);
    g.drawImage(screenImage,0,0,null);
  }

  public void screenDraw(Graphics g) {
    g.drawImage(introBackground,0,0,null);
    this.repaint();
  }
}
