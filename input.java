import javax.swing.JOptionPane;

public class input {
    public static void main(String[] args){
        String answerString = JOptionPane.showInputDialog("太阳系有几个行星？");
        String replyString;
        int ans = Integer.parseInt(answerString);
        if (ans==8){
            replyString = "正确!";
        }else{
            replyString = "错了!!!\n";
            replyString += "正确答案为： " + 8;
        }
        JOptionPane.showMessageDialog(null, replyString);
    }
}