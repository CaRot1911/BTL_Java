package Game2048;

import Game2048.Art.ArtLayOut;
import Game2048.Manage.DataManage;
import Game2048.Manage.LayOutManage;

import javax.swing.*;
import java.awt.*;

public class Game {
    /*Khoi ta layout and JFrame*/
    JFrame game;
    LayOutManage layOut;
    ArtLayOut Art;
    DataManage dataM;
    //Contracter
    public Game(){
        init();
        setUp();
    }

    //Ham khoi tao
    private void init(){
        game = new JFrame();
        layOut = new LayOutManage(Art,dataM,game);

    }

    //Set up man hinh
    private void setUp(){
        layOut.setUp(game);
    }

    //Chay game
    public void  runGame(){
        game.setVisible(true);
    }

    //set color backgroud
    public static Color hexRGB(String colorStr){
        return new Color(
                Integer.valueOf(colorStr.substring(1,3),16),
                Integer.valueOf(colorStr.substring(3,5),16),
                Integer.valueOf(colorStr.substring(5,7),16)
        );

    }

    public static void main(String[] args) {
        Game game = new Game();
        game.runGame();
    }
}
