package com.Suhas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

@SuppressWarnings("serial")
class Calculator extends JFrame implements ActionListener {
	static JFrame f;
	static JTextField l;
	String s0, s1, s2;

	Calculator() {
		s0 = s1 = s2 = "";
	}

	public static void main(String[] args) {
		f = new JFrame("Calculator");

		try {
			UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
		} catch (Exception e) {
			System.err.print(e.getMessage());
		}

		Calculator c = new Calculator();
		l = new JTextField(15);
		l.setEditable(true);

		JButton b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, ba, bs, bm, bd, beq, bclr, bdot;

		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		ba = new JButton("+");
		bs = new JButton("-");
		bm = new JButton("*");
		bd = new JButton("/");
		beq = new JButton("=");
		bdot = new JButton(".");
		bclr = new JButton("C");

		JPanel p = new JPanel();
		bclr.addActionListener(c);
		b0.addActionListener(c);
		b1.addActionListener(c);
		b2.addActionListener(c);
		b3.addActionListener(c);
		b4.addActionListener(c);
		b5.addActionListener(c);
		b6.addActionListener(c);
		b7.addActionListener(c);
		b8.addActionListener(c);
		b9.addActionListener(c);
		ba.addActionListener(c);
		bs.addActionListener(c);
		bm.addActionListener(c);
		bd.addActionListener(c);
		bdot.addActionListener(c);
		beq.addActionListener(c);

		p.add(l);
		p.add(bclr);
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(ba);
		p.add(bs);
		p.add(bm);
		p.add(bd);
		p.add(bdot);
		p.add(beq);

		p.setBackground(Color.cyan);
		f.add(p);
		f.setSize(225, 300);
		f.setResizable(false);
		f.setVisible(true);

	}

	public void actionPerformed(ActionEvent e) {
		String s = e.getActionCommand();
		if (s.charAt(0) >= '0' && s.charAt(0) <= '9' || s.charAt(0) == '.') {
			if (!s1.equals("")) {
				s2 = s2 + s;
			} else {
				s0 = s0 + s;
			}

			l.setText(s0 + s1 + s2);
		} else if (s.charAt(0) == 'C') {
			s0 = s1 = s2 = "";
			l.setText("");
		} else if (s.charAt(0) == '=') {
			double res = 0;
			if (s1.equals("+")) {
				res = Double.parseDouble(s0) + Double.parseDouble(s2);
			} else if (s1.equals("-")) {
				res = Double.parseDouble(s0) - Double.parseDouble(s2);
			} else if (s1.equals("*")) {
				res = Double.parseDouble(s0) * Double.parseDouble(s2);
			} else if (s1.equals("/")) {
				res = Double.parseDouble(s0) / Double.parseDouble(s2);
			}
			l.setText(s0 + s1 + s2 + "=" + res);
			s0 = Double.toString(res);
			s1 = s2 = "";
		} else {
			if (s1.equals("") || s2.equals(""))
				s1 = s;
			else {
				double te;

				if (s1.equals("+"))
					te = (Double.parseDouble(s0) + Double.parseDouble(s2));
				else if (s1.equals("-"))
					te = (Double.parseDouble(s0) - Double.parseDouble(s2));
				else if (s1.equals("/"))
					te = (Double.parseDouble(s0) / Double.parseDouble(s2));
				else
					te = (Double.parseDouble(s0) * Double.parseDouble(s2));

				s0 = Double.toString(te);

				s1 = s;

				s2 = "";
			}

			l.setText(s0 + s1 + s2);
		}
	}

}
