package extra;

import java.awt.Robot;

public class PixelRunner {
public static void main(String[] args) { 
  PixelParty P = new PixelParty();
  
  P.setColor(24, 255, 60);
  P.drawCircle(9, 900, 90);
  P.drawCircle(250, 250, 250);
  P.drawRectangle(200, 0, 200, 250);
  P.drawRectangle(0, 50 , 200,  200);
  P.drawTriangle(20, 30, 40, 50, 60, 70);
  P.drawTriangle(70, 60 , 50 , 40 , 30 , 20);
  P.saveImage();
}}