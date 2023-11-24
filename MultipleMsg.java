package com.multiplemsg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class MultipleMsg {

	public static void main(String[] args) throws InterruptedException, AWTException {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Your msg");
		String msg = s.nextLine();
		System.out.println("Enter your size");
		int size = s.nextInt();

		StringSelection stringselection = new StringSelection(msg);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(stringselection, null);

		Thread.sleep(1000);
		Robot robot = new Robot();
		for (int i = 0; i < size; i++) {

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);

			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);

			Thread.sleep(100);

		}

	}

}
