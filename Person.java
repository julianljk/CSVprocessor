public class Person {
	
	//do I need it as public
	String [] preList = new String [11];
	String [] postList = new String [11];
	String name;
	int id; 
	
	//for the first time
	public Person (int id, String name, String prePost, int position, String rating)
	{
		this.name = name;
		this.id = id;
		
		addStuff(prePost, position, rating);
	}
	public void addStuff (String prePost, int position, String rating)
	{
		if (prePost.equals("Pre"))
		{
			preList[position] = rating;
		}
		else 
		{
			postList[position] = rating;
		}
	}
}
