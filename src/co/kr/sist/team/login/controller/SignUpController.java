package co.kr.sist.team.login.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import co.kr.sist.team.login.view.SignUpView;

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
		JTextField jtfId = suv.getJtfId();
		JTextField jtfId = suv.getJtfId();
		JTextField jtfId = suv.getJtfId();
		JTextField jtfId = suv.getJtfId();
		JTextField jtfId = suv.getJtfId();
		JTextField jtfId = suv.getJtfId();
		JTextField jtfId = suv.getJtfId();
		

	}// SignUp

	/**
	 * 전화번호 검증
	 */
	private void validateTel() {

	}// validateEmail

	/**
	 * 이메일 검증
	 */
	private void validateEmail() {

	}// validateEmail

	/**
	 * 주민번호 검증
	 */
	private void validateSSN() {

	}// validateEmail

}// class
