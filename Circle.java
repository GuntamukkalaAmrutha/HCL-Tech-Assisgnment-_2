package lab2q1;

public class Circle {
	
		private double radius;
		private String color="red";

		public Circle()
		{
		}
			public Circle(int radius)
			{
				this.radius=radius;
			}
			public double getradius()
			{
				return radius;
			}
			public double getarea()
			{
				return Math.PI*radius*radius;
			}
			public double getperimeter()
			{
				return Math.PI*radius*2;
			}
			public String tostring()
			{
				return "circle[radius=" + radius + " , color=" +color +"]";
			}
		}



