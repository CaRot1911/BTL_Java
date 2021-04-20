package Game2048.Manage;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Game2048.Art.ArtLayOut;
import Game2048.Game;


public class LayOutManage {
    public int magin = 2;
    public int width = 400+3*magin;
    public int height = 400+3*magin;
    ArtLayOut Art;
    DataManage dataM;
    public LayOutManage(ArtLayOut Art,DataManage dataM,JFrame frame){
        this.Art = Art;
        this.Art = new ArtLayOut();
        this.Art.art(frame,width,height,magin);
        this.dataM = new DataManage();
        //this.dataM = dataM;
    }


    public void setUp(JFrame frame){
        frame.setSize(width+16+2*magin,height+38+2*magin);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setFocusable(true);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Game.hexRGB("#000000"));
        //quan ly su kien
        frame.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==KeyEvent.VK_LEFT){
                    dataM.moveLeft();
                }else if(e.getKeyCode()==KeyEvent.VK_RIGHT){
                    dataM.moveRight();
                }else if(e.getKeyCode()==KeyEvent.VK_UP){
                    dataM.moveTop();
                }else if(e.getKeyCode()==KeyEvent.VK_DOWN){
                    dataM.moveBT();
                }
                Art.upDate();
            }
        });
    }
}
