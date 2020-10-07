package algorithms;

import com.jogamp.opengl.GL2;

public abstract class LineAlgorithm {
	public GL2 gl;
	
	public LineAlgorithm(GL2 gl) {
		this.gl = gl;
	}
	
	public void drawPixel(int x, int y) {
		this.gl.glBegin(GL2.GL_POINTS);
		this.gl.glColor3f(1,1,1);
		this.gl.glVertex2i(x, y);
		this.gl.glEnd();
		this.gl.glFlush();
	}
	
	public abstract void draw(int x1, int y1, int x2, int y2);
}
