/**
	* Explanation
	* @author Mr. Kalisz
	* @version 17.0.1
	*/

class Example {

	//instance variables
	int var1;
	String var2;

	/**
	 * Explanation
	 * @param var1 explanation of what the variable is
	 * @param var2 a String and then the explanation
	 */
	//constructor - params
	public Example(int var1, String var2) {
		this.var1 = var1;
		this.var2 = var2;
	}

	//methods - params and return
	/**
	 * @return returns the value of var1 (explanation of return value) 
	 *
	 */
	
	public int getVar1() {
		return var1;
	}

	/**
	* Explanation of the method
	*
	*@param a String that will replace the value of var2 (explataion of what the parameter is)
	*
	*/
	
	public void setVar2(String var2) {
		this.var2 = var2;
	}
	
}