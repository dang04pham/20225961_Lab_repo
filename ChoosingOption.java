import javax.swing.JOptionPane;

public class ChoosingOption {

    public static void main(String[] args) {
        int option = JOptionPane.showConfirmDialog(null, "Do you want to change the firstclass ticket?");
        JOptionPane.showMessageDialog(null, "You have chosen: " + (option == JOptionPane.YES_NO_OPTION?"I do" : "I don't"));

        System.exit(0);
    }
}