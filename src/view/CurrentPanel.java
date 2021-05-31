package view;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JPanel;

public class CurrentPanel extends JPanel {

	private JPanel field;
	private JPanel hero;
	private JPanel hand;
	public CurrentPanel() {
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		field = new JPanel();
		hand = new JPanel();
		hero = new JPanel();
		field.setLayout(new FlowLayout());
		hero.setLayout(new GridLayout());
		hand.setLayout(new FlowLayout());
		hand.setPreferredSize(new Dimension(screenSize.width,screenSize.height/6));
		hero.setPreferredSize(new Dimension(screenSize.width,screenSize.height/6));
		field.setPreferredSize(new Dimension(screenSize.width,screenSize.height/6));
	}
	public JPanel getField() {
		return field;
	}
	public void setField(JPanel field) {
		this.field = field;
	}
	public JPanel getHero() {
		return hero;
	}
	public void setHero(JPanel hero) {
		this.hero = hero;
	}
	public JPanel getHand() {
		return hand;
	}
	public void setHand(JPanel hand) {
		this.hand = hand;
	}
}
