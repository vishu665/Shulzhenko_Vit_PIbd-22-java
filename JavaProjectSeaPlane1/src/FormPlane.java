import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import java.awt.Color;

public class FormPlane {

	private JFrame frame;
	private JPanel_Plane panel;
	private JButton start;
	private JButton buttonUp;
	private JButton buttonDown;
	private JButton buttonLeft;
	private JButton buttonRight;
	SeaPlane seaPlane;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormPlane window = new FormPlane();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public FormPlane() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 762, 483);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

 		start = new JButton("C\u043E\u0437\u0434\u0430\u0442\u044C");
		start.setBounds(598, 322, 106, 25);
		frame.getContentPane().add(start);
		start.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seaPlane = new SeaPlane( 100, 1000 , Color.BLUE, Color.YELLOW, true, true);
				seaPlane.SetPosition(100, 100, 550, 400);
				panel = new JPanel_Plane();
				panel.setBorder(new BevelBorder(BevelBorder.LOWERED, 
						null, null, null, null));
				panel.setBounds(10, 11, 551, 414);
				frame.getContentPane().add(panel);

 				panel.drawPlane(seaPlane);
				panel.repaint();
			}
		});

 		buttonUp = new JButton("^");
		buttonUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seaPlane.MoveTransport(Direction.Up);
				panel.drawPlane(seaPlane);
				panel.repaint();
			}
		});
		buttonUp.setBounds(626, 360, 50, 20);
		frame.getContentPane().add(buttonUp);

 		buttonDown = new JButton("v");
		buttonDown.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seaPlane.MoveTransport(Direction.Down);
				panel.drawPlane(seaPlane);
				panel.repaint();
			}
		});
		buttonDown.setBounds(626, 405, 50, 20);
		frame.getContentPane().add(buttonDown);

 		buttonLeft = new JButton("<");
		buttonLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seaPlane.MoveTransport(Direction.Left);
				panel.drawPlane(seaPlane);
				panel.repaint();	
			}
		});
		buttonLeft.setBounds(598, 382, 50, 20);
		frame.getContentPane().add(buttonLeft);

 		buttonRight = new JButton(">");
		buttonRight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				seaPlane.MoveTransport(Direction.Right);
				panel.drawPlane(seaPlane);
				panel.repaint();				      
			}
		});
		buttonRight.setBounds(655, 382, 50, 20);
		frame.getContentPane().add(buttonRight);
	}
}