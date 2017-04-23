import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class TicTacToe_2 extends JFrame
{
	private JButton button[] = new JButton[9];
	private Icon x, o, white;
	private int i;
	private int board[] = new int[9];
	private boolean gameOver = false;
	public TicTacToe_2()
	{
		super("TIC TAC TOE");
		setLayout(new GridLayout(3,3));
		
		x =  new ImageIcon(getClass().getResource("x.png"));
		o = new ImageIcon(getClass().getResource("o.png"));
		white = new ImageIcon(getClass().getResource("white.png"));
		i=0;
		
		for(int i=0; i<9; i++)
		{
			button[i] = new JButton("", white);
			board[i]=-1;
			add(button[i]);
		}
		
			EventClass eventObject = new EventClass();
			button[0].addActionListener(eventObject);
			button[1].addActionListener(eventObject);
			button[2].addActionListener(eventObject);
			button[3].addActionListener(eventObject);
			button[4].addActionListener(eventObject);
			button[5].addActionListener(eventObject);
			button[6].addActionListener(eventObject);
			button[7].addActionListener(eventObject);
			button[8].addActionListener(eventObject);

				for(int k=0; k<9 && board[k]==-1; k++)
					button[k].setRolloverIcon(x);
			
	}
	
	private class EventClass implements ActionListener
	{
		public void actionPerformed(ActionEvent event)
		{
			if(event.getSource()==button[0])
			{
				if(board[0]==-1)
				{
					if(i%2==0)
					{
						button[0].setIcon(x);
						board[0] = 1;
					}
					else
					{
						button[0].setIcon(o);		
						board[0] = 0;
					}
				}
				else
					i--;
			}
			else if(event.getSource()==button[1])
			{
				if(board[1]==-1)
				{	
					if(i%2==0)
					{
						button[1].setIcon(x);
						board[1] = 1;
					}
					else
					{
						button[1].setIcon(o);
						board[1] = 0;
					}
				}
				else
					i--;
			}
			else if(event.getSource()==button[2])
			{
				if(board[2]==-1)
				{
					if(i%2==0)
					{
						button[2].setIcon(x);
						board[2] = 1;
					}
					else
					{
						button[2].setIcon(o);
						board[2] = 0;
					}
				}
				else
					i--;
			}
			else if(event.getSource()==button[3])
			{
				if(board[3]==-1)
				{
					if(i%2==0)
					{
						button[3].setIcon(x);
						board[3] = 1;
					}
					else
					{
						button[3].setIcon(o);
						board[3] = 0;
					}
				}
				else
					i--;
			}
			else if(event.getSource()==button[4])
			{
				if(board[4]==-1)
				{
					if(i%2==0)
					{
						button[4].setIcon(x);
						board[4] = 1;
					}
					else
					{
						button[4].setIcon(o);
						board[4] = 0;
					}
				}
				else
					i--;
			}
			else if(event.getSource()==button[5])
			{
				if(board[5]==-1)
				{
					if(i%2==0)
					{
						button[5].setIcon(x);
						board[5] = 1;
					}
					else
					{
						button[5].setIcon(o);		
						board[5] = 0;
					}
				}
				else 
					i--;
			}
			else if(event.getSource()==button[6])
			{
				if(board[6]==-1)
				{
					if(i%2==0)
					{
						button[6].setIcon(x);
						board[6] = 1;
					}
					else
					{
						button[6].setIcon(o);
						board[6] = 0;
					}
				}
			}
			else if(event.getSource()==button[7])
			{
				if(board[7]==-1)
				{
					if(i%2==0)
					{
						button[7].setIcon(x);
						board[7] = 1;
					}
					else
					{
						button[7].setIcon(o);
						board[7] = 0;
					}
				}
				else
					i--;
			}
			else if(event.getSource()==button[8])
			{
				if(board[8]==-1)
				{
					if(i%2==0)
					{
						button[8].setIcon(x);
						board[8] = 1;
					}
					else
					{
						button[8].setIcon(o);
						board[8] = 0;
					}
				}
				else
					i--;
			}
	
			
			i++;
			
			if(i==9)
				gameOver =  true;
			
			if(i%2==0)
				for(int k=0; k<9; k++)
				{
					if(board[k]!=-1)
						continue;
					button[k].setRolloverIcon(x);
				}	
			else
				for(int k=0; k<9; k++)
				{
					if(board[k]!=-1)
						continue;
					button[k].setRolloverIcon(o);
				}
			if(!gameOver)
			{
			if( (board[0]==1 && board[1]==1 && board[2]==1) || (board[0]==1 && board[3]==1 && board[6]==1) || (board[0]==1 && board[4]==1 && board[8]==1) || (board[2]==1 && board[4]==1 && board[6]==1) || (board[1]==1 && board[4]==1 && board[7]==1) || (board[2]==1 && board[5]==1 && board[8]==1) || (board[3]==1 && board[4]==1 && board[5]==1) || (board[6]==1 && board[7]==1 && board[8]==1) )
			{
				for(int i=0; i<9; i++)
					board[i] = 1;
				JOptionPane.showMessageDialog(null, "X Won!", "Result", JOptionPane.PLAIN_MESSAGE);
				gameOver = true;
			}
			else if( (board[0]==0 && board[1]==0 && board[2]==0) || (board[0]==0 && board[3]==0 && board[6]==0) || (board[0]==0 && board[4]==0 && board[8]==0) || (board[2]==0 && board[4]==0 && board[6]==0) || (board[1]==0 && board[4]==0 && board[7]==0) || (board[2]==0 && board[5]==0 && board[8]==0) || (board[3]==0 && board[4]==0 && board[5]==0) || (board[6]==0 && board[7]==0 && board[8]==0) )
			{
				for(int i=0; i<9; i++)
					board[i] = 0;
				JOptionPane.showMessageDialog(null, "O Won!", "Result", JOptionPane.PLAIN_MESSAGE);
				gameOver = true;
			}
			}
			else if(i==9)
				{
					JOptionPane.showMessageDialog(null, "Match draw!","Result",JOptionPane.PLAIN_MESSAGE);
					i++;
				}
		}
	}
}