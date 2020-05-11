package network;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIBookClient extends JFrame {

    JTextField txtNumber;
    JLabel lblResult;
    JButton btnPrime, btnExit;
    Socket socket;
    BufferedReader br;
    PrintWriter pw;

    public GUIBookClient() {
        super("Book Client");
        JPanel p = new JPanel();
        p.add(new JLabel("Enter Book Number : "));
        txtNumber = new JTextField(10);
        btnPrime = new JButton("Get Title");
        btnExit = new JButton("Exit");
        lblResult = new JLabel();
        lblResult.setHorizontalAlignment(JLabel.CENTER);
        p.add(txtNumber);
        p.add(btnPrime);
        p.add(btnExit);

        Container c = getContentPane();
        c.add(p, BorderLayout.PAGE_START);
        c.add(lblResult, BorderLayout.PAGE_END);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        btnPrime.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        try {
                            int number = Integer.parseInt(txtNumber.getText());
                            pw.println(number);
                            String line = br.readLine();
                            if (line.length() == 0) {
                                line = "Sorry! Book Not Found!";
                            }
                            lblResult.setText(line);
                        } catch (Exception ex) {
                            lblResult.setText("Invalid Value. Please enter a valid number!");
                        }
                    }
                });

        btnExit.addActionListener(
                new ActionListener() {

                    public void actionPerformed(ActionEvent evt) {
                        pw.println(0); // send 0 to server
                        System.exit(0);
                    }
                });

        try {
            socket = new Socket("localhost", 3000);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
        } catch (Exception ex) {
            lblResult.setText(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        GUIBookClient f = new GUIBookClient();
        f.setSize(400, 100);
        f.setVisible(true);
    }
}

