package main;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLEventListener;

import algorithms.PontoMedio;

import com.jogamp.opengl.GLAutoDrawable;

public class Renderer implements GLEventListener {
	@Override
	public void display(GLAutoDrawable drawable) {
		GL2 gl = drawable.getGL().getGL2();
		PontoMedio pontoMedio = new PontoMedio(gl);
		gl.glViewport(80, 60, 640, 480);
		gl.glClearColor(0, 0, 0, 0);
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		pontoMedio.draw(5, -5, 0, 10);
	}

	@Override
	public void dispose(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void init(GLAutoDrawable arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void reshape(GLAutoDrawable arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub
		
	}
}