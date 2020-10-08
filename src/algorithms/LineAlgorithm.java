package algorithms;

import com.jogamp.opengl.GL2;

public abstract class LineAlgorithm{
	public GL2 gl;
	
	public LineAlgorithm(GL2 gl) {
		this.gl = gl;
	}
	
	public void drawCircle() {
		//Desenhar o pixel centrado aqui
	}
	
	public abstract void draw(int x1, int y1, int x2, int y2);
}
