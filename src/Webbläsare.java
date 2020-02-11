import javax.swing.JOptionPane;
import java.net.URL;
import java.util.Scanner;

    /**
     * Created by magnus on 2018-02-07.
     */
    public class Webbläsare {
        public static void main(String[] args) {
            String url = JOptionPane.showInputDialog(null, "where?","The Ultimate Textbrowser",JOptionPane.QUESTION_MESSAGE);
            try {
                URL resource = new URL(url);
                Scanner urlScanner = new Scanner(resource.openStream());
                while (urlScanner.hasNext()) {
                    System.out.println(urlScanner.nextLine());
                }
            } catch (Exception e) {
                e.printStackTrace();
                


                }
        }
    }


