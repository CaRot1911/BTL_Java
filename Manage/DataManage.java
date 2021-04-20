package Game2048.Manage;

import Game2048.Datas.Data;

import java.util.Random;

public class DataManage {
    Random r = new Random();

    public DataManage() {
        newNumber();
    }

    public  void newNumber(){
        int boxRong = 0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j]==0){
                    boxRong++;
                }
            }
        }
       if (boxRong>=2){
           if(r.nextInt(10)>6){
               boxRong = 1;
           }
           else{
               boxRong = 2;
           }
       }
       while (boxRong!=0){
           int x = r.nextInt(4);
           int y = r.nextInt(4);
           while (Data.getData().arr[x][y] !=0){
               x = r.nextInt(4);
               y = r.nextInt(4);
           }
           if(r.nextInt(10)>6){
               Data.getData().arr[x][y]=4;
           }else{
               Data.getData().arr[x][y] =2;
            }
           boxRong--;
       }
    }
    public void moveLeft(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,0,-1);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    sumBox(i,j,0,1);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,0,1);
                }
            }
        }
        newNumber();

    }
    public void moveRight(){
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,0,1);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    sumBox(i,j,0,1);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,0,1);
                }
            }
        }
        newNumber();

    }

    public void moveTop(){
        for(int i=3;i>0;i--){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,-1,0);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    sumBox(i,j,-1,0);
                }
            }
        }
        for(int i=3;i>0;i--){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,-1,0);
                }
            }
        }
        newNumber();

    }
    public void moveBT(){
        for(int i=3;i>0;i--){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,1,0);
                }
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    sumBox(i,j,1,0);
                }
            }
        }
        for(int i=3;i>0;i--){
            for(int j=0;j<4;j++){
                if(Data.getData().arr[i][j] != 0){
                    donBox(i,j,1,0);
                }
            }
        }
        newNumber();

    }
   private void donBox(int i,int j,int it,int jt){
        if(i==0 && it ==-1){
            return;
        }if(i==3 && it ==1){
            return;
        }if(j==0 && jt ==-1){
            return;
        }if(j==3 && jt ==1){
            return;
        }
        int x = i+it;
        int y = j+jt;
        if(Data.getData().arr[x][y] !=0){
            return;
        }
        int k = Data.getData().arr[i][j];
        Data.getData().arr[x][y] = k;
        Data.getData().arr[i][j] = 0;
        donBox(x,y,it,jt);
    }
    private void sumBox(int i,int j,int it,int jt) {
        if (i == 0 && it == -1) {
            return;
        }
        if (i == 3 && it == 1) {
            return;
        }
        if (j == 0 && jt == -1) {
            return;
        }
        if (j == 3 && jt == 1) {
            return;
        }
        int x = i + it;
        int y = j + jt;
        if (Data.getData().arr[x][y] != Data.getData().arr[i][j]){
            return;
        }
        int k = Data.getData().arr[i][j]*2;
        Data.getData().arr[x][y] = 0;
        Data.getData().arr[i][j] = k;
    }
}
