import java.util.Scanner;
import java.io.*;
import java.io.DataOutputStream;
import java.io.OutputStream; 
class Main{
	public static void main(String[] args){
		try{
	int d,k=0;
	for(int i=0;i<7;i++){
      Scanner console = new Scanner(System.in);
	  
	  System.out.println("Enter number 0 : Break");
      System.out.println("Enter number 1 : addition");
	  System.out.println("Enter number 2 : subtract");
	  System.out.println("Enter number 3 : multiplication");
	  System.out.println("Enter number 4 : division");
	  System.out.println("Enter number 5 : log");
	  System.out.println("Enter number 6 : a pow b");
	  System.out.println("Enter number 7 : root");
	  
      d = console.nextInt();
	  if(d>7 || d<0)
	  {
		  System.out.println("Wrong input given");
	  }
	  int y,z;
	  switch(d){
		  case 0:
		  k=1;
		  break;
		  case 1:
		  try{
		  System.out.println("Wanna add two int? type 1 else type 0");
		  	  y = console.nextInt();
	  if(y==0){
		  FileWriter obj1 = new FileWriter("Addition.txt");
		  BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		  double q=console.nextDouble(),w=console.nextDouble();
		  calculation c=new calculation(q,w);
	 bufferObj.write(c.add(q,w)+"");
			bufferObj.close(); 
			System.out.println("Written successfully");
		FileReader fr = new FileReader("Addition.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);			
	}
	else if(y==1){
		FileWriter obj1 = new FileWriter("Addition.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		int q=console.nextInt(),w=console.nextInt();
		calculation c=new calculation(q,w);
	//System.out.println(c.add(q,w));
	bufferObj.write(c.add(q,w)+"");
		bufferObj.close(); 
			System.out.println("Written successfully");
					  		  FileReader fr = new FileReader("Addition.txt");
		  BufferedReader input = new BufferedReader (fr);
						String inputString = input.readLine();
		  int dd = Integer.parseInt ( inputString );
		  System.out.println(dd);			
	}
	else{
		System.out.println("You have Enter Wrong Input.Please Enter Again");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	break;
	case 2:
	 try{
	 System.out.println("Wanna subtract two int? type 1 else type 0");
		  	  y = console.nextInt();
	  if(y==0){
		  
		FileWriter obj1 = new FileWriter("Subtraction.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		  double q=console.nextDouble(),w=console.nextDouble();
		  calculation c=new calculation(q,w);
		  //System.out.println(c.subtract(q,w));
	 bufferObj.write(c.subtract(q,w)+"");
	 
			bufferObj.close(); 
			System.out.println("Written successfully");
					FileReader fr = new FileReader("Subtraction.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);
	}
	else if(y==1){
		
		  FileWriter obj1 = new FileWriter("Subtraction.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		int q=console.nextInt(),w=console.nextInt();
		calculation c=new calculation(q,w);
	//System.out.println(c.apowb(q,w));
	
		  bufferObj.write(c.subtract(q,w)+"");
			bufferObj.close(); 
			System.out.println("Written successfully");
					  		  FileReader fr = new FileReader("Subtraction.txt");
		  BufferedReader input = new BufferedReader (fr);
						String inputString = input.readLine();
		  int dd = Integer.parseInt ( inputString );
		  System.out.println(dd);  
		  
	}
	 else{
		System.out.println("You have Enter Wrong Input.Please Enter Again");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	break;
	case 3:
	  try{
	  System.out.println("Wanna multiplication two int? type 1 else type 0");
		  	  y = console.nextInt();
	  if(y==0){
		  FileWriter obj1 = new FileWriter("Multiplication.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
      		  double q=console.nextDouble(),w=console.nextDouble();
		  calculation c=new calculation(q,w);
	
	//System.out.println(c.multiplication(q,w));
	
		  bufferObj.write(c.multiplication(q,w)+"");
	 
			bufferObj.close(); 
			System.out.println("Written successfully");
					FileReader fr = new FileReader("Multiplication.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);
	}
	else if(y==1){
		 FileWriter obj1 = new FileWriter("Multiplication.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		int q=console.nextInt(),w=console.nextInt();
		calculation c=new calculation(q,w);
			//System.out.println(c.multiplication(q,w));
					  bufferObj.write(c.multiplication(q,w)+"");
	 
			bufferObj.close(); 
			System.out.println("Written successfully");
								  		  FileReader fr = new FileReader("Multiplication.txt");
		  BufferedReader input = new BufferedReader (fr);
						String inputString = input.readLine();
		  int dd = Integer.parseInt ( inputString );
		  System.out.println(dd);

	}
	else{
		System.out.println("You have Enter Wrong Input.Please Enter Again");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	break;
	case 4:
	  try{
		    //System.out.println("Wanna division two int? type 1 else type 0");
		 // y = console.nextInt();
		  System.out.println("Enter Two Number");
		 FileWriter obj1 = new FileWriter("division.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		  double q=console.nextDouble(),w=console.nextDouble();
		  calculation c=new calculation(q,w);
	//System.out.println(c.division(q,w));
	
		  bufferObj.write(c.division(q,w)+"");
	 
			bufferObj.close(); 
			System.out.println("Written successfully");
						FileReader fr = new FileReader("division.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);
	}
	  catch(Exception ee){
		  System.out.println(ee+"Exception Found!!");
	  }
	break;
	case 5:
	try{
	System.out.println("Enter Number");
		  
		 FileWriter obj1 = new FileWriter("log.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		  double q=console.nextDouble();
		  calculation c=new calculation(q);
	bufferObj.write(c.log(q)+"");
		  bufferObj.close(); 
			System.out.println("Written successfully");
						FileReader fr = new FileReader("log.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);
	}
		  
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	break;
	case 6:
			try{
			System.out.println("Wanna apowb two int? type 1 else type 0");
		  y = console.nextInt();
		  System.out.println("Please Enter Number & Power Respectivly");
	  if(y==0){
		  FileWriter obj1 = new FileWriter("apowb.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		  double q=console.nextDouble(),w=console.nextDouble();
		  calculation c=new calculation(q,w);
	//System.out.println(c.apowb(q,w));
		  
		  bufferObj.write(c.apowb(q,w)+"");
	 
			bufferObj.close(); 
			System.out.println("Written successfully");
			FileReader fr = new FileReader("apowb.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);  
		  
		 /*( double q=console.nextDouble(),w=console.nextDouble();
		  calculation c=new calculation(q,w);
	System.out.println(c.apowb(q,w));*/
	}
	else if(y==1){
		
		  FileWriter obj1 = new FileWriter("apowb.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		int q=console.nextInt(),w=console.nextInt();
		calculation c=new calculation(q,w);
	//System.out.println(c.apowb(q,w));
	
		  bufferObj.write(c.apowb(q,w)+"");
			bufferObj.close(); 
			System.out.println("Written successfully");
					  		  FileReader fr = new FileReader("apowb.txt");
		  BufferedReader input = new BufferedReader (fr);
						String inputString = input.readLine();
		  int dd = Integer.parseInt ( inputString );
		  System.out.println(dd);  
		  
	}
			else{
		System.out.println("You have Enter Wrong Input.Please Enter Again");
		  }
		  }
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	break;
	case 7:
	try{
				  System.out.println("Please Enter Number");
		  
		  FileWriter obj1 = new FileWriter("root.txt");
		BufferedWriter bufferObj = new BufferedWriter(obj1); 
			System.out.println("Buffered Writer start writing :)");
		  double q=console.nextDouble();
		  calculation c=new calculation(q);
	//System.out.println(c.root(q));
	
		  bufferObj.write(c.root(q)+"");
	 
			bufferObj.close(); 
			System.out.println("Written successfully");
						FileReader fr = new FileReader("root.txt");
		  BufferedReader input = new BufferedReader (fr);
			String inputString = input.readLine();
		  double dd = Double.parseDouble ( inputString );
		System.out.println(dd);
	}
		  catch(Exception e)
		  {
			  System.out.println(e);
		  }
	break;
	}
	if(k==1)
	{
		break;
	}
	}
		}
	catch(Exception e)
	{
		System.out.println(e+"Exception Found");
	}
}
}