package video.practice.sonam.day2;

import sun.security.util.Length;

public class SmallBox {
    int length;
    int width;

    SmallBox(int l, int w){
        this.length = l;
        this.width = w;

    }
    int  calulateArea(){
        int a = 0;
      a= length*width;
      return a;
    }
}
