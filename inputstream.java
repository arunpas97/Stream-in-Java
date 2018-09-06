import java.io.*;
class stream
	{
		DataInputStream din=new DataInputStream(System.in);
		public void show()
			{				
				try{
					System.out.println("Enter your Name	:");
					String name=din.readLine();
					System.out.println("Enter your Age	:");
					int age=Integer.valueOf(din.readLine()).intValue();
					System.out.println("Name	:"+name);
					System.out.println("Age	:"+age);
					
							
				}catch(Exception e){}			
			
			}
	}
class inputstream
	{
		public static void main(String a[])
			{
				loop obj=new loop();
				obj.show();					
			}
	}