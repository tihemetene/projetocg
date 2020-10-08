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
		gl.glOrtho(-80, 80, -60, 60, -1, 1);
		gl.glClear(GL2.GL_COLOR_BUFFER_BIT);
		//Primeiro Octante
		pontoMedio.draw(0, 0, 50, 10);
		//Segundo Octante
		pontoMedio.draw(0, 0, 10, 50);
		//Terceiro Octante
		pontoMedio.draw(0, 50, 10, 0);
		//Quinto Octante
		pontoMedio.draw(0, 0, -50, -20);
		//Ouinto Octante -> Primeiro Octanto
		pontoMedio.draw(-50, -20, 0, 0);
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