package application;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller
{
	@FXML
	private TextField firstnum;
	@FXML
	private TextField secondnum;
	@FXML
	private TextField result;
	@FXML
	private Button addbutton;
	@FXML
	private Button minusbutton;
	@FXML
	private Button multiplybutton;	
	@FXML
	private Button dividebutton;
	@FXML
	private Label label1;
	@FXML
	private Label label2;
	
	private float first = 0;
	private float second = 0;
	private float r = 0; //result
	
	public void string2float(String a, String b)
	{
		first = Float.parseFloat(a);
		second = Float.valueOf(b);
	}
	
	public void add()
	{
		string2float(firstnum.getText(),secondnum.getText());
		r = first + second;
		result.setText(String.valueOf(r));
	}
	
	public void minus()
	{
		string2float(firstnum.getText(),secondnum.getText());
		r = first - second;
		result.setText(String.valueOf(r));
	}
	
	public void multiply()
	{
		string2float(firstnum.getText(),secondnum.getText());
		r = first * second;
		result.setText(String.valueOf(r));
	}
	
	public void divide()
	{
		string2float(firstnum.getText(),secondnum.getText());
		r = first / second;
		result.setText(String.valueOf(r));
	}
}
