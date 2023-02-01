package review1;

public class Max_And_Min {

	public static void main(String[] args) {
		int m[]= {30,80,60,10,5};
		int max=m[0];
		int min=m[0];
		for(int i=1;i<m.length;i++) {
			if(m[i]>max) {
				max=m[i];
				
			}
			if(m[i]<min) {
				min=m[i];
			}
		}
			System.out.println(+max);
			System.out.println(+min);
	}

}
