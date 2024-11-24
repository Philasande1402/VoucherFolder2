import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class VoucherAppFA {

    public static void main(String[] args) {
        
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Voucher Application");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setLayout(new BorderLayout());
            frame.setSize(500, 300);
            
            
            
            JPanel flowPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
            
            for(int i=1;i<=4;i++)
            {
                flowPanel.add(new JLabel("Voucher "+ i +" Code "+ i));
            }
            
            JPanel voucherPanel = new JPanel();
            voucherPanel.setBorder(new TitledBorder("Voucher Code"));
            
            JPasswordField voucherField = new JPasswordField(20);
            voucherPanel.add(voucherField);
            
            
            JPanel historyPanel = new JPanel(new BorderLayout());
            JTextArea historyArea = new JTextArea(8, 35);
            historyArea.setEditable(false);
            JScrollPane scrollPane = new JScrollPane(historyArea);
            
            JLabel selectDistrictLabel =new JLabel("Select only one district : ");
            
            JRadioButton tshwaneRadioButton = new JRadioButton("Tshwane");
            JRadioButton emalahleniRadioButton = new JRadioButton("eMalahleni");
            JRadioButton polokwaneRadioButton = new JRadioButton("Polokwane");
            
            JPanel radioPanel = new JPanel();
            radioPanel.add(selectDistrictLabel);
            radioPanel.add(tshwaneRadioButton);
            radioPanel.add(emalahleniRadioButton);
            radioPanel.add(polokwaneRadioButton);
            
            
            historyPanel.add(radioPanel,BorderLayout.SOUTH);
            historyPanel.add(scrollPane,BorderLayout.CENTER);
            
            
            JPanel buttonPanel = new JPanel();
            
            JButton verifyVoucherButton = new JButton("Verify Voucher");
            JButton clearHistoryButton = new JButton("Clear History");
            JButton closeButton = new JButton("Close");
            
            closeButton.addActionListener(e -> System.exit(0));
            
            buttonPanel.add(verifyVoucherButton);
            buttonPanel.add(clearHistoryButton);
            buttonPanel.add(closeButton);
            
            frame.add(voucherPanel,BorderLayout.NORTH);
            frame.add(flowPanel,BorderLayout.CENTER);
            frame.add(historyPanel,BorderLayout.WEST);
            frame.add(buttonPanel,BorderLayout.SOUTH);
            
            frame.setVisible(true);
        });
        
    }
    
}

