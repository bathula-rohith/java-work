package comt;

public class Mad {
	public static void main(String[]f)
	{
Robo r = new Robo();
Thread t1= new Thread(r);
t1.start();
}
}
