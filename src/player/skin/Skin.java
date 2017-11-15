/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player.skin;

import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;

/**
 *
 * @author kipanga
 */
public class Skin extends JFrame{
    public Skin(){
        super("SweetPlayer");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,520);
        setVisible(true);
        showWinowIcon();
    }
    private void showWinowIcon(){
        try {
            setIconImage(ImageIO.read(new File("icons/sweetPlayer.jpg")));
        }catch (IOException exc) {
            exc.printStackTrace();
        }
    }
}
