package org.ju.cse.gobinda;

import java.awt.EventQueue;

import org.jnativehook.GlobalScreen;

public class Main {

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ButtonIdentifier frame = new ButtonIdentifier();
					GlobalScreen.registerNativeHook();
					GlobalScreen.addNativeKeyListener(frame);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
