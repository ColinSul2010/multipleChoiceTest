import javax.swing.*;

public class TakeTest<Jframe> {
    private static JComboBox comboBox1;
    private static JComboBox comboBox2;
    private static JComboBox comboBox3;
    private static JComboBox comboBox4;

    private static JLabel Q1L;
    private static JLabel Q2L;
    private static JLabel Q3L;
    private static JLabel Q4L;

    private JButton createTestButton;
    private JLabel takeATestLabel;
    private JFrame JFrameTakeTest;

    public JFrame getTakeTest() {
        return JFrameTakeTest;
    }
    public void setTakeTest(JFrame JFrameTakeTest) {
        this.JFrameTakeTest = JFrameTakeTest;
    }
}