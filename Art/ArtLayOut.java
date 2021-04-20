package Game2048.Art;

import Game2048.Datas.Data;
import Game2048.Game;

import javax.swing.*;
import java.awt.*;

public class ArtLayOut {
    JLabel arrlb[][] = new JLabel[4][4];

    //ve o vuong
    public void art(JFrame frame,int W,int H,int M){
        int w = (W-3*M)/4;
        int h = (H-3*M)/4;
        int x=0,y=0;
        for(int i=0;i<4;i++){
            y = i*h + (1+i)*M;
            for (int j=0;j<4;j++){
                x = j*h + (1+j)*M;
                arrlb[i][j] = setO(x,y,w,h,i,j);
                frame.add(arrlb[i][j]);
            }
        }
        frame.add(new JLabel());
    }

    //khoi tao cac o vuong
    private JLabel setO(int x,int y,int w,int h,int i,int j){
        JLabel label = new JLabel("5");
        label.setBounds(x,y,w,h);
        setBG(label,i,j);
        label.setOpaque(true);
        return label;
    }

    //do mau cho gia tri 2,4,8,16,.....
    private void setBG(JLabel label,int i,int j){
        int data = Data.getData().arr[i][j];
        String color="";
        System.out.println(data);
        switch (data) {
            case 2:
                color = "8B1A1A";
                break;

            case 4:
                color = "8B1A1A";
                break;

            case 8:
                color = "8B1A1A";
                break;

            case 16:
                color = "8B1A1A";
                break;

            case 32:
                color = "8B1A1A";
                break;

            case 64:
                color = "8B1A1A";
                break;

            case 128:
                color = "8B1A1A";
                break;

            case 256:
                color = "8B1A1A";
                break;

            case 512:
                color = "8B1A1A";
                break;

            case 1024:
                color = "8B1A1A";
                break;

            case 2048:
                color = "8B1A1A";
                break;

            default:
                color = "8B1A1A";
                break;

        }
        if(data==0){
            label.setText("");
        }else{
            label.setText(""+data);
        }
        label.setFont(new Font("Sefif",Font.BOLD,26));
        label.setForeground(Color.white);
        label.setHorizontalAlignment(SwingConstants.CENTER); //xet chieu ngang
        label.setVerticalAlignment(SwingConstants.CENTER); //xet chieu doc
        label.setBackground(Game.hexRGB("#"+color));
    }
    public void upDate(){
        for(int i=0;i<4;i++){
            for (int j=0;j<4;j++){
                setBG(arrlb[i][j],i,j);
            }
        }

    }
}
