package main;

import javax.swing.JFrame;

import com.jogamp.opengl.GLCapabilities;
import com.jogamp.opengl.GLProfile;
import com.jogamp.opengl.awt.GLCanvas;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Window {
	public static void main(String args[]) {
		GLProfile.initSingleton();
	    GLProfile profile = GLProfile.get(GLProfile.GL2);
	    GLCapabilities capabilities = new GLCapabilities(profile);
	    
	    GLCanvas glCanvas = new GLCanvas(capabilities);
	    Renderer renderer = new Renderer();
	    glCanvas.addGLEventListener(renderer);
	    glCanvas.setSize(800, 600);
	    
	    JFrame frame = new JFrame ("Hello World");
	    frame.getContentPane().add(glCanvas);
	    frame.setSize(frame.getContentPane().getPreferredSize());
	    frame.setVisible(true);
	    
	    frame.addWindowListener(new WindowAdapter() {
	        public void windowClosing(WindowEvent windowEvent) {
	        	System.exit(0);
	        }
	    });
	}
}
