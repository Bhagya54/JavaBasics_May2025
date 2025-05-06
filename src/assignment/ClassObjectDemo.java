package assignment;

public class ClassObjectDemo {
	
	int beets;//12
    public int getBeets() {
    	return beets;//12
    }
    public void setBeets(int beet1) {
    	beets = beet1;//12
    }
	
	public static void main(String[] args) {
		ClassObjectDemo c1 = new ClassObjectDemo();
		c1.setBeets(156);
		System.out.println(c1.getBeets());

	}
//prime - 1 and itself - 2,3,5,7
}
