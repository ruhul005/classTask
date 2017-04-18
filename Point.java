package classTask;

public class Point {
	
		private int x;
		private int y;
		
		Point (int x,int y){
			this.x=x;
			this.y=y;
		}
		
		int getX(){
			return x;
		}
		int getY(){
			return y;
		}
		
		public double distance(Point p)
		{
			//distance=Math.sqrt(Math.pow(p.getX()-point.getX(), 2),2);
			double a= x-p.getX();
			double b= y-p.getY();
			return Math.sqrt(a*a+b*b);
			
		}
		
}
