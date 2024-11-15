import javax.swing.JFrame;

public class Frame extends JFrame{
    public void calculatorFrame(){
        setSize(400, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임이 닫힐 때 프로그램이 종료되도록 설정.
        setLocationRelativeTo(null); // GUI생성 시 가운데 배치
        setTitle("Calculator");
        setVisible(true);
    }
}
