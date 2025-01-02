package stacks;

public class SelfImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stacks s1 = new Stacks(0);
		s1.push(1);
		s1.push(2);
		s1.push(3);
		System.out.println(s1.top);
	}
	static class Stacks{
		int arr[];
		int cap;
		int top;
		Stacks(int x){
		cap =x;
		top =-1;
		arr = new int [x];
		}
		
		void push(int x) {
			if(top ==cap) {
				System.out.println("Stack Overflow");
				return;
			}
			top++;
			arr[top] =x;
		}
		
		int pop(int x) {
			if(top ==-1) {
				System.out.println("Stack Underflow");
				return -1;
			}
			int res = arr[top];
			top--;
			return res;
		}
		
	}

}
