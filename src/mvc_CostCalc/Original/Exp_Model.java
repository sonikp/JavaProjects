package mvc_CostCalc.Original;

// http://shulgadim.blogspot.com/2012/01/model-view-controller-mvc-pattern_13.html

public class Exp_Model{
	
	private int x;
	
	public Exp_Model(){
		x = 20;
	}
	
	public Exp_Model(int x){
		this.x = x;
	}
	
	
	//--ORIGINAL----------------------------
	public void incX(){
		x++;
	}
	
	public int getX(){
		return x;
	}
	//--ORIGINAL----------------------------

}