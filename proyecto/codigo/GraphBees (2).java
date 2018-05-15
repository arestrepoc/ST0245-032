
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.io.FileNotFoundException;
public class GraphBees extends JFrame
{
    static ArrayList<Bee> list;
    
    public GraphBees()throws FileNotFoundException{
        setTitle("Bees");
        setSize(900,800);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    public void paint(Graphics g){
        bees(g);
    }
    public static void bees(Graphics g){
        g.setColor(Color.YELLOW);
	for(Bee n : list){
        	g.fillOval(n.x/25+50, n.y/25+50, 2, 2);
        }
        g.setColor(Color.BLACK);
	for(int i = 0; i< 16000; i = i+1000){
		for(int j = 0; j< 16000; j = j+1000){
			g.drawRect(i/25+50,j/25+50,1000/25,1000/25);
		}
	}
    }
    public static void main(String[] args)throws FileNotFoundException{
        list = TextReader.Bee1M();
        GraphBees bees = new GraphBees();
    }        
            
}