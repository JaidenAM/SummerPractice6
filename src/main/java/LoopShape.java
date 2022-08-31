import java.awt.*;
import java.awt.image.BufferedImage;


public class LoopShape {

    static void createRectangle(int width, int height){
        if(width < 1 || height < 1){
            System.out.println("No");
        }else {
            for (int y = 0; y < height; y++) {
                StringBuilder stringBuilder = new StringBuilder();

                for (int x = 0; x < width; x++) {
                    stringBuilder.append("*");
                }

                if (stringBuilder.toString().trim().isEmpty()) {
                    continue;
                }

                System.out.println(stringBuilder);
            }
        }
    }

    static void createTriangle(int leg){
        if(leg < 1){
            System.out.println("No");
        }else {
            for (int i=leg;i>0;i--){//number of lines
                for(int j=i-1;j>0;j--){
                    System.out.print(" ");
                }
                for(int k=leg;k>=i;k--){        //use k>=i
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            }
        }
    }
