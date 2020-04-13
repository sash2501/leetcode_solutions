class Solution {
    public int evalRPN(String[] tokens) {
        int eval = 0;
		String operators = "+-*/";
 
		Stack<String> stack = new Stack<String>();
 
		for (String t : tokens) {
			if (!operators.contains(t)) { //push to stack if it is a number
				stack.push(t);
			} else {//pop two numbers from stack if it is an operator
				int a = Integer.valueOf(stack.pop());
				int b = Integer.valueOf(stack.pop());
				switch (t) {
				case "+":{
                            stack.push(String.valueOf(a + b));
                            break;
                         }
				case "-":{
                            stack.push(String.valueOf(b - a));
                            break;
                         }
				case "*":{
                            stack.push(String.valueOf(a * b));
                            break;
                         }
				case "/":{
                            stack.push(String.valueOf(b / a));
                            break;
                         }
				}
			}
		}
 
		eval = Integer.valueOf(stack.pop());
 
		return eval;
    }
}
