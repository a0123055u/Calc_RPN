import java.util.Stack;

public class RPN_calc {

	    public int calculate(String expr) 
	    	throws Exception {
	            Stack<Double> stack = new Stack<>();

	            System.out.println(expr);
	            System.out.println("Input\tOperation\tStack after");

	            for (String token : expr.split(",")) {
	                System.out.print(token + "\t");
	                switch (token) {
	                    case "+":
	                        System.out.print("Operate\t\t");
	                        stack.push(stack.pop() + stack.pop());
	                        break;
	                    case "-":
	                        System.out.print("Operate\t\t");
	                        stack.push(-stack.pop() + stack.pop());
	                        break;
	                    case "*":
	                        System.out.print("Operate\t\t");
	                        stack.push(stack.pop() * stack.pop());
	                        break;
	                    case "/":
	                        System.out.print("Operate\t\t");
	                        double divisor = stack.pop();
	                        stack.push(stack.pop() / divisor);
	                        break;
	                    case "^":
	                        System.out.print("Operate\t\t");
	                        double exponent = stack.pop();
	                        stack.push(Math.pow(stack.pop(), exponent));
	                        break;
	                    case "%":
	                        System.out.print("Operate\t\t");
	                        double percent = stack.pop();
	                        stack.push(Math.pow(stack.pop(), percent));
	                        break;
	                    default:
	                        System.out.print("Push\t\t");
	                        stack.push(Double.parseDouble(token));
	                        break;
	                }
	                System.out.println(stack);
	            }
	            double res = stack.pop();
	            System.out.println("Final Answer: " + res);
	            
	        return (int)res;

	    }
	}
	
	
	
	
	

