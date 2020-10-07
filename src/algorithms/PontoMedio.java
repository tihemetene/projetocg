package algorithms;

import com.jogamp.opengl.GL2;

public class PontoMedio extends LineAlgorithm{	
	public PontoMedio(GL2 gl) {
		super(gl);
	}
	
	public void draw(int x1, int y1, int x2, int y2) {
		double m;
		int dx, dy, aux;
		if(x1>x2) {
			aux=x1;
			x1=x2;
			x2=aux;
			
			aux=y1;
			y1=y2;
			y2=aux;
		}
		dx = x2-x1;
		dy = y2-y1;
		System.out.println("Entrou");
		if(dy>0) {
			m = (double)(y2-y1)/(x2-x1);
			if(m<=1 && dx>0) {
				//Primeiro octante e quinto octante
				pontoMedioAsc(x1,y1, x2, y2);
			}else if(m>1 && dx>0) {
				//Segundo Octante e sexto octante
				pontoMedioAscFunctionX(y1,x1, y2, x2);
			}
		}else if(dy<=0) {
			m = (double)(y2-y1)/(x2-x1);
			if(m<=-1 && dx>0) {
				//Terceiro Octante e setimo cotante
				pontoMedioDescFunctionX(y2, x2, y1, x1);
			}else if(m>-1 && dx>0) {
				//Quarto Octante e oitavo octante
				pontoMedioDesc(x1,y1, x2, y2);
			}
		}
	}

	private void pontoMedioAsc(int x1, int y1, int x2, int y2) {
		int x, y, d, dx, dy;
		int incrNE, incrE;
		
		dx = x2-x1;
		dy = y2-y1;
		
		d = 2*dy - dx;
		incrE = 2*dy;
		incrNE = 2*(dy - dx);
		x=x1;
		y=y1;
		
		this.gl.glPointSize(1.0f);
		this.gl.glBegin(GL2.GL_POINTS);
		while(x<x2) {
			this.gl.glColor3f(1.0f,1.0f,1.0f);
			this.gl.glVertex2f((float)x/320, (float)y/240);
			if(d<=0) {
				d = d + incrE;
				x++;
			}else {
				d = d + incrNE;
				x++;
				y++;
			}
		}
		this.gl.glVertex2f((float)x/320, (float)y/240);
		this.gl.glEnd();
		this.gl.glFlush();

	}
	
	private void pontoMedioAscFunctionX(int x1, int y1, int x2, int y2) {
		int x, y, d, dx, dy;
		int incrNE, incrE;
		
		dx = x2-x1;
		dy = y2-y1;
		
		d = 2*dy - dx;
		incrE = 2*dy;
		incrNE = 2*(dy - dx);
		x=x1;
		y=y1;
		
		this.gl.glPointSize(1.0f);
		this.gl.glBegin(GL2.GL_POINTS);
		while(x<x2) {
			this.gl.glColor3f(1.0f,1.0f,1.0f);
			this.gl.glVertex2f((float)y/320, (float)x/240);
			if(d<=0) {
				d = d + incrE;
				x++;
			}else {
				d = d + incrNE;
				x++;
				y++;
			}
		}
		this.gl.glVertex2f((float)y/320, (float)x/240);
		this.gl.glEnd();
		this.gl.glFlush();
	}
	
	private void pontoMedioDescFunctionX(int x1, int y1, int x2, int y2) {
		int x, y, d, dx, dy;
		int incrNE, incrE;
		
		dx = x2-x1;
		dy = y2-y1;
		
		d = 2*dy+dx;
		incrNE = 2*dy;
		incrE = 2*(dy + dx);
		
		x=x1;
		y=y1;
		
		this.gl.glPointSize(1.0f);
		this.gl.glBegin(GL2.GL_POINTS);
		while(x<x2) {
			this.gl.glColor3f(1.0f,1.0f,1.0f);
			this.gl.glVertex2f((float)y/320, (float)x/240);
			if(d>0) {
				d = d + incrNE;
				x++;
			}else {
				d = d + incrE;
				x++;
				y--;
			}
		}
		this.gl.glVertex2f((float)y/320, (float)x/240);
		this.gl.glEnd();
		this.gl.glFlush();
	}
	
	private void pontoMedioDesc(int x1, int y1, int x2, int y2) {
		int x, y, d, dx, dy;
		int incrNE, incrE;
		
		dx = x2-x1;
		dy = y2-y1;
		
		d = 2*dy+dx;
		incrNE = 2*dy;
		incrE = 2*(dy + dx);
		
		x=x1;
		y=y1;
		
		this.gl.glPointSize(1.0f);
		this.gl.glBegin(GL2.GL_POINTS);
		while(x<x2) {
			this.gl.glColor3f(1.0f,1.0f,1.0f);
			this.gl.glVertex2f((float)x/320, (float)y/240);
			if(d>0) {
				d = d + incrNE;
				x++;
			}else {
				d = d + incrE;
				x++;
				y--;
			}
		}
		this.gl.glVertex2f((float)x/320, (float)y/240);
		this.gl.glEnd();
		this.gl.glFlush();
	}
}