
class CWin
{
	int radius;
	int lng;
   int width;
   int height;

   
   void setr(int r)  // 半徑
   {
	   radius=r;
   }
   void setl(int l)  // 持
   {
      lng=l;
   }
   void setW(int w)  // 寬
   {
      width=w;
   }
   void setH(int h)  // 高
   {
      height=h;
   }

   void show()
   {
      System.out.println("半徑="+radius);
      System.out.println("球形體積="+radius*radius*radius/3*4*3.14159);
      System.out.println("長="+lng+",寬="+width+",高="+height);
      System.out.println("立方體表面積="+(lng*width*2+height*width*2+height*lng*2));
   }
   void setWindows(int r,int l,int w,int h)
   {
	  radius=r;
	  lng=l;
      width=w;
      height=h;
   }
}
public class Class01 {

		   public static void main(String args[])
		   {
		      CWin cw=new CWin();

		      cw.setWindows(10,4,5,6);
		      cw.show();
		   }
}

/**
半徑=10
球形體積=4184.59788
長=4,寬=5,高=6
立方體表面積=148
 */
