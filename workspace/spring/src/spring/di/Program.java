package spring.di;

import spring.di.entity.Exam;
import spring.di.entity.NewlecExam;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.di.ui.ExamConsole;
import spring.di.ui.GridExamConsole;

public class Program {

	public static void main(String[] args) {
		
		// ���������� �����ϴ� ������� �ڵ带 ����
		Exam exam = new NewlecExam();
		ExamConsole console = new GridExamConsole();
		
		console.setExam(exam);
		
		
//		ApplicationContext context = 
//				new ClassPathXmlApplicationContext("spring/di/setting.xml");
//		
//		ExamConsole console = (ExamConsole) context.getBean("console");
//		//ExamConsole console = context.getBean(ExamConsole.class);
		console.print();

	}

}