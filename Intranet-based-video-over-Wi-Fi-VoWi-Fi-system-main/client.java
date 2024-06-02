package CN;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class client {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
	ServerSocket server=new ServerSocket(123);
	System.out.println("waiting...");
	Socket socket=server.accept();
	System.out.println("Connected");
	ObjectInputStream in=new ObjectInputStream(socket.getInputStream());
    JLabel label=new JLabel();
    JFrame fr=new JFrame();
    fr.setSize(640,360);
    fr.setDefaultCloseOperation(fr.EXIT_ON_CLOSE);
    label=new JLabel();
    label.setSize(640,360);
    label.setVisible(true);
	
	while(true) {
		label.setIcon((ImageIcon)in.readObject());
	}
	}

}
