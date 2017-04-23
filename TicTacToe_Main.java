import javax.swing.JFrame;

class TicTacToe_Main
{
	public static void main(String args[])
	{
		TicTacToe_2 object =  new TicTacToe_2();
		object.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		object.setSize(780,600);
		object.setResizable(false);
		object.setVisible(true);
	}
}