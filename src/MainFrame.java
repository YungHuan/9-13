import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends Frame{
    private int x =300 ,y=200;
    private JLabel jl =new JLabel("0");
    private JButton jbn1 =new JButton("+");
    private JButton jbn2 =new JButton("-");
    private JButton jbn3 =new JButton("exit");
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(100,100,500,500);
        this.setLayout(null);
        this.setTitle("HI");
        this.add(jbn1);
        this.add(jbn2);
        this.add(jbn3);
        this.add(jl);
        jbn1.setBounds(200,300,80,80);
        jbn2.setBounds(300,300,80,80);
        jbn3.setBounds(400,300,80,80);
        jl.setBounds(300,200,80,80);
        jbn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x-5;
                jl.setLocation(x,y);
//                jl.setText(Integer.toString(x));
//                MainFrame.this.setTitle(Integer.toString(x));
            }
        });
        jbn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x=x+5;
                jl.setLocation(x,y);

//                jl.setText(Integer.toString(x));
//                MainFrame.this.setTitle(Integer.toString(x));
            }
        });
        jbn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        }
        );
    }
}
