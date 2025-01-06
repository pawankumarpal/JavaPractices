package stacks;

import java.util.Stack;

public class BaseballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseballGame bg = new BaseballGame();
		String [] operations= {"5","-2","4","C","D","9","+","+"};
		System.out.println(bg.calPoints(operations));
	}
	
    public int calPoints(String[] operations) {
        
        Stack<Integer> scores = new Stack<Integer>();
        int score =0;
        String extras = "+DC";
        for(int i=0;i<operations.length;i++){
            if(!extras.contains(operations[i])){
                scores.push(Integer.valueOf(operations[i]));
            }else{
                if((operations[i]).equalsIgnoreCase("+")){
                	//System.out.println(scores.get(scores.size()-2));
                    int num1 = scores.isEmpty()?0: scores.peek();
                    int num2 = scores.isEmpty()?0: scores.get(scores.size()-2);
                    
                    int num3 = num1+num2;
                    scores.push(num3);
                }else if((operations[i]).equalsIgnoreCase("D")){
                    scores.push(Integer.valueOf(scores.peek())*2);
                }else if((operations[i]).equalsIgnoreCase("C")){
                    scores.pop();
                }
            }
            System.out.println(scores);
        }

        while(!scores.isEmpty()){
            score += scores.pop();
        }
        return score;
    }

}
