package application;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SampleController {
	
	/* START GPA */
    @FXML
    private TextField Appre1;

    @FXML
    private TextField Appre2;

    @FXML
    private TextField Appre3;

    @FXML
    private TextField Appre4;

    @FXML
    private TextField Appre5;

    @FXML
    private TextField Appre6;
    
    @FXML
    private Label grade1;

    @FXML
    private Label grade2;

    @FXML
    private Label grade3;

    @FXML
    private Label grade4;

    @FXML
    private Label grade5;

    @FXML
    private Label grade6;
    
    @FXML
    private Label labelgpa;
	    @FXML
	    private Button clacmath;
	    
	    @FXML
	    private TextField hour1;

	    @FXML
	    private TextField hour2;

	    @FXML
	    private TextField hour3;

	    @FXML
	    private TextField hour4;

	    @FXML
	    private TextField hour5;

	    @FXML
	    private TextField hour6;
	    
	    @FXML
	    private Label labelavg;

	    @FXML
	    private Label labelhour;

	    @FXML
	    private Label labelsub;

	    @FXML
	    private TextField sub1;

	    @FXML
	    private TextField sub2;

	    @FXML
	    private TextField sub3;

	    @FXML
	    private TextField sub4;

	    @FXML
	    private TextField sub5;

	    @FXML
	    private TextField sub6;

	    @FXML
	    void clacgpa(ActionEvent event) {
	    	
	    	/*START TOTAL*/
	    	
	    	int num1 ,num2,num3,num4,num5,num6 ,total;
	    	String app1,app2,app3,app4,app5,app6;
	    	double avg;
	    	double GPA= 0;
	    	double GRADE;
	    	
	    	num1=Integer.parseInt(sub1.getText());
	    	num2=Integer.parseInt(sub2.getText());
	    	num3=Integer.parseInt(sub3.getText());
	    	num4=Integer.parseInt(sub4.getText());
	    	num5=Integer.parseInt(sub5.getText());
	    	num6=Integer.parseInt(sub6.getText());
	    	
	    	total= num1 +num2+num3+num4+num5+num6 ;
	    	labelsub.setText("the total subjects = " +String.valueOf(total));
	    	
	    	/*END TOTAL*/
	    	
	    	/*AVG*/
	    	
	    	avg =total / 6;
	    	labelavg.setText("the avarge subjects = " +String.valueOf(avg));
	    	
	    	/*END AVG*/
	    	 /*START HOUR*/
	    	
	    	int h1 ,h2,h3,h4,h5,h6 ,totalhour;
	    	h1=Integer.parseInt(hour1.getText());
	    	h2=Integer.parseInt(hour1.getText());
	    	h3=Integer.parseInt(hour3.getText());
	    	h4=Integer.parseInt(hour4.getText());
	    	h5=Integer.parseInt(hour5.getText());
	    	h6=Integer.parseInt(hour6.getText());
	    	
	    	
	    	totalhour= h1 +h2+h3+h4+h5+h6 ;
	    	labelhour.setText("the total hour = " +String.valueOf(totalhour));
	    	
	    	/*END HOUR*/
	    	/*Start GPA*/
	    	
	    	app1=Appre1.getText();
	    	app2=Appre2.getText();
	    	app3=Appre3.getText();
	    	app4=Appre4.getText();
	    	app5=Appre5.getText();
	    	app6=Appre6.getText();
	    	/*start app 1*/
	    	if (app1.toLowerCase().equals("a+")){
	    		double subject1 = h1 * 4; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("a")){
	    		double subject1 = h1 * 3.7; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("b+")){
	    		double subject1 = h1 * 3.3; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("b")){
	    		double subject1 = h1 * 3; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("c+")){
	    		double subject1 = h1 * 2.7; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("c")){
	    		double subject1 = h1 * 2.3; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("d+")){
	    		double subject1 = h1 * 2.1; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("c+")){
	    		double subject1 = h1 * 2; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("c+")){
	    		double subject1 = h1 * 2.7; grade1.setText(String.valueOf(subject1));}
	    	else if(app1.toLowerCase().equals("p")){
	    		double subject1 = h1 * 0; grade1.setText(String.valueOf(subject1));}
	    	else{grade1.setText("PASS");}
	    	
	    	/*start app2*/
	    	if (app2.toLowerCase().equals("a+")){
	    		double subject2 = h2 * 4; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("a")){
	    		double subject2 = h2 * 3.7; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("b+")){
	    		double subject2 = h2 * 3.3; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("b")){
	    		double subject2 = h2 * 3; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("c+")){
	    		double subject2 = h2 * 2.7; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("c")){
	    		double subject2 = h2 * 2.3; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("d+")){
	    		double subject2 = h2 * 2.1; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("c+")){
	    		double subject2 = h2 * 2; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("c+")){
	    		double subject2 = h2 * 2.7; grade2.setText(String.valueOf(subject2));}
	    	else if(app2.toLowerCase().equals("p")){
	    		double subject2 = h2 * 0; grade2.setText(String.valueOf(subject2));}
	    	else{grade1.setText("PASS");}
	    	
	    	/*start app3*/
	    	if (app3.toLowerCase().equals("a+")){
	    		double subject1 = h1 * 4; grade3.setText(String.valueOf(subject1));}
	    	else if(app3.toLowerCase().equals("a")){
	    		double subject3 = h3 * 3.7; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("b+")){
	    		double subject3 = h3 * 3.3; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("b")){
	    		double subject3 = h3 * 3; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("c+")){
	    		double subject3 = h3 * 2.7; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("c")){
	    		double subject3 = h3 * 2.3; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("d+")){
	    		double subject3 = h3 * 2.1; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("c+")){
	    		double subject3 = h3 * 2; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("c+")){
	    		double subject3 = h3 * 2.7; grade3.setText(String.valueOf(subject3));}
	    	else if(app3.toLowerCase().equals("p")){
	    		double subject3 = h3 * 0; grade3.setText(String.valueOf(subject3));}
	    	else{grade1.setText("PASS");}
	    	/*start app4*/
	    	if (app4.toLowerCase().equals("a+")){
	    		double subject4 = h4 * 4; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("a")){
	    		double subject4 = h4 * 3.7; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("b+")){
	    		double subject4 = h4 * 3.3; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("b")){
	    		double subject4 = h4 * 3; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("c+")){
	    		double subject4 = h4 * 2.7; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("c")){
	    		double subject4 = h4 * 2.3; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("d+")){
	    		double subject4 = h4 * 2.1; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("c+")){
	    		double subject4 = h4 * 2; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("c+")){
	    		double subject4 = h4 * 2.7; grade4.setText(String.valueOf(subject4));}
	    	else if(app4.toLowerCase().equals("p")){
	    		double subject4 = h4 * 0; grade4.setText(String.valueOf(subject4));}
	    	else{grade1.setText("PASS");}
	    	/*start app5*/
	    	if (app5.toLowerCase().equals("a+")){
	    		double subject5 = h5 * 4; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("a")){
	    		double subject5 = h5 * 3.7; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("b+")){
	    		double subject5 = h5 * 3.3; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("b")){
	    		double subject5 = h5 * 3; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("c+")){
	    		double subject5 = h5 * 2.7; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("c")){
	    		double subject5 = h5 * 2.3; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("d+")){
	    		double subject5 = h5 * 2.1; grade5.setText(String.valueOf(subject5));}
	    	else if(app1.toLowerCase().equals("c+")){
	    		double subject5 = h5 * 2; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("c+")){
	    		double subject5 = h5 * 2.7; grade5.setText(String.valueOf(subject5));}
	    	else if(app5.toLowerCase().equals("p")){
	    		double subject5 = h5 * 0; grade5.setText(String.valueOf(subject5));}
	    	else{grade1.setText("PASS");}
	    	/*start app6*/
	    	if (app6.toLowerCase().equals("a+")){
	    		double subject6 = h6* 4; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("a")){
	    		double subject6 = h6 * 3.7; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("b+")){
	    		double subject6 = h6 * 3.3; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("b")){
	    		double subject6 = h6 * 3; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("c+")){
	    		double subject6 = h6 * 2.7; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("c")){
	    		double subject6 = h6 * 2.3; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("d+")){
	    		double subject6 = h6 * 2.1; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("c+")){
	    		double subject6 = h6 * 2; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("c+")){
	    		double subject6 = h6 * 2.7; grade6.setText(String.valueOf(subject6));}
	    	else if(app6.toLowerCase().equals("p")){
	    		double subject6 = h6 * 0; grade6.setText(String.valueOf(subject6));}
	    	else{grade1.setText("PASS");}
	    	
	    	/*REART CALC TOTAL GPA*/
	    	double totalGPA;
	    	double GPA1,GPA2,GPA3,GPA4,GPA5,GPA6;
	    	 GPA1=Double.parseDouble(grade1.getText());
	    	 GPA2=Double.parseDouble(grade2.getText());
	    	 GPA3=Double.parseDouble(grade3.getText());
	    	 GPA4=Double.parseDouble(grade4.getText());
	    	 GPA5=Double.parseDouble(grade5.getText());
	    	 GPA6=Double.parseDouble(grade6.getText());
	    	 totalGPA= (GPA1+GPA2+GPA3+GPA4+GPA5+GPA6)/totalhour;
	    	 labelgpa.setText("GPA = " +String.valueOf(totalGPA));
	    	 
	    
	 
	    	
	    	
	    	/*END GPA*/

	    }
	    /*END GPA*/
	
	/*START LOGIN*/
    @FXML
    void pagecrate(ActionEvent event) throws IOException {
    	try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("createacount.fxml"));
            Parent root = loader.load();

            Stage newStage = new Stage();
            newStage.setTitle("Createacount");
            newStage.setScene(new Scene(root));

            // إغلاق النافذة الحالية عند الضغط على زر الإغلاق في الصفحة الجديدة
            newStage.setOnCloseRequest(e -> ((Stage) root.getScene().getWindow()).close());

            newStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /*END LOGIN*/
	
}
