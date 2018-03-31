import java.*;
import java.util.*;
import processing.core.*;
public class HappyFace extends PApplet {

	private String url="https://github.com/bhaskar164/HAPPYFACE/blob/master/img/codes-coding-computer-247791.jpg?raw=true.jpg";
	private PImage bkimg;
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
		bkimg=loadImage(url,"jpg");
	}
	public void draw()
	{
	
		bkimg.resize(0,height);
    	        image(bkimg,0,0);
		fill(255,255,0);
		ellipse(300, 300, 400, 400);
		fill(0,0,0);
		ellipse(200, 250, 100, 100);
		ellipse(400, 250, 100, 100);
		fill(255,20,0);
		arc(300, 400, 300, 80, 0, PI, OPEN);

	}

}
