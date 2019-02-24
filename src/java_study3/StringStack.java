package java_study3;

import java.util.ArrayList;

public class StringStack<E> implements Stack {
	
	public ArrayList<E> stack;
	
	public StringStack() {
		// TODO Auto-generated constructor stub
		stack = new ArrayList<E>();
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return stack.size();
	}

	@Override
	public Object pop() {
		// TODO Auto-generated method stub
		E str;
		if(stack.size() > 0){
			str = stack.get(stack.size()-1);
			stack.remove(stack.size()-1);
		}
		else
			str = null;
		
		return str;
	}

	@Override
	public boolean push(Object ob) {
		// TODO Auto-generated method stub
		stack.add((E)ob);
		return true;
	}

}
