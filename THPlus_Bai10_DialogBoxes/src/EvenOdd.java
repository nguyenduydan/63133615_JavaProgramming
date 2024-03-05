import javax.swing.JOptionPane;

public class EvenOdd {

	public static void main(String[] args) {
		int ques;
		do {
			String numStr = JOptionPane.showInputDialog("Nhập một số nguyên: ");
			if(numStr!=null && !numStr.trim().equals("")) {
				try { //bắt lỗi
					int num=Integer.parseInt(numStr);
					String result = "Số vừa nhập là số "+((num%2==0)?"chẵn" : "lẻ"); //kiểm tra chẵn lẽ
					JOptionPane.showMessageDialog(null, result,"Output",JOptionPane.INFORMATION_MESSAGE);
				}catch(NumberFormatException ex) {
					JOptionPane.showMessageDialog(null,"Nhập sai dữ liệu");
				}
			}
			ques = JOptionPane.showConfirmDialog(null,"Tiếp tục không?","Question",JOptionPane.YES_NO_OPTION); 
		}while(ques == JOptionPane.YES_OPTION);
	}

}
