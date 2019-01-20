package co.kr.sist.team.login.controller;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.kr.sist.team.login.view.SignUpView;

import static javax.swing.JOptionPane.showMessageDialog;

public class SignUpController extends WindowAdapter implements ActionListener {

	private SignUpView suv;

	public SignUpController(SignUpView suv) {
		this.suv = suv;
	}// 기본생성

	@Override
	public void windowClosing(WindowEvent e) {
		suv.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == suv.getJcbEmail()) {
			if (suv.getJcbEmail().getSelectedIndex() != 3) { // "직접 입력"이 아닐경우
				suv.getJcbEmail().setEditable(false);
				suv.getJcbEmail().setBackground(Color.WHITE);
			} else {
				suv.getJcbEmail().setEditable(true);
			} // end if

		} // end if

		if (e.getSource() == suv.getJbSignUp()) { // '회원가입' 버튼 때
			switch (JOptionPane.showConfirmDialog(suv, "회원가입을 진행 하시겠습니까?")) {
			case JOptionPane.OK_OPTION:
				SignUp();
			}// end switch
		} // end if

		if (e.getSource() == suv.getJbCancle()) { // '취소' 버튼 때
			switch (JOptionPane.showConfirmDialog(suv, "정말 취소 하시겠습니까?")) {
			case JOptionPane.OK_OPTION:
				suv.dispose();
			}// end switch
		} // end if

	}// actionPerformed

	/**
	 * 회원가입을 진행하는 메소드입니다.
	 */
	private void SignUp() {

	}// SignUp

	/**
	 * 전화번호 검증
	 */
	private void validateTel() {

		JTextField jtfTel1 = suv.getJtfTel1();
		JTextField jtfTel2 = suv.getJtfTel1();
		JTextField jtfTel3 = suv.getJtfTel1();

		String telNum1 = jtfTel1.getText().trim();
		String telNum2 = jtfTel2.getText().trim();
		String telNum3 = jtfTel3.getText().trim();

		try {
			if (!telNum1.equals("") && !telNum2.equals("") && !telNum3.equals("")) {
				if (telNum1.length() != 3 || telNum2.length() != 4 || telNum3.length() != 4) {
					showMessageDialog(suv, "입력하신 전화번호는 유효하지 않습니다. 확인해주세요.");
					return;
				} // end if
				Integer.parseInt(telNum1);
				Integer.parseInt(telNum2);
				Integer.parseInt(telNum3);
			} else {
				showMessageDialog(suv, "전화번호를 모두 입력해 주세요.");
				return;
			} // end else
		} catch (NumberFormatException nfe) {
			showMessageDialog(suv, "전화번호는 숫자만 입력가능합니다.");
			nfe.printStackTrace();
		} // end catch

	}// validateEmail

	/**
	 * 이메일 검증
	 */
	private void validateEmail() {
		JTextField jtfEmail1 = suv.getJtfEmail1();
		JComboBox<String> jcbEmail = suv.getJcbEmail();
		if (jcbEmail.getSelectedIndex() != 3) {
		} // end if

		String emailId = jtfEmail1.getText().trim();

	}// validateEmail

	/**
	 * 주민번호 검증
	 */
	private void validateSSN() {

	}// validateEmail

}// class
