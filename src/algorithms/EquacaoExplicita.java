package algorithms;

import com.jogamp.opengl.GL2;

public class EquacaoExplicita extends LineAlgorithm{

	public EquacaoExplicita(GL2 gl) {
		super(gl);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(GL2 gl, int x1,int x2, int y1,int y2) {
		int y_aux;
		
		int x;
		float m, y;
		int dx, dy;
		dx = Math.abs(x2 - x1);
		dy = Math.abs(y2 - y1);
		m = (float)dy/dx;
		x = x1;
		while(x <= x2) {
			y = m * (x - x1) + y1;
			y_aux = Math.round(y);
			draw_pixel(gl, x, y_aux, "GREEN");
			x++;
		}
	}

}
