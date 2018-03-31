import java.*;
import java.util.*;
import processing.core.*;
public class HappyFace extends PApplet {

	public static void main(String[] args) {
		PApplet.main("HappyFace");
	}
	public void settings()
	{
		size(600,600);
	}
	public void setup()
	{
		size(600,600);
	}
	public void draw()
	{
	
		fill(255,255,0);
		ellipse(300, 300, 400, 400);
		fill(0,0,0);
		ellipse(200, 250, 100, 100);
		ellipse(400, 250, 100, 100);
		fill(255,20,0);
		arc(300, 400, 300, 80, 0, PI, OPEN);

	}

}
