package in.ineuron.main;

public class Bubblesort {
	public static void main(String[] args) {
		int[] a= {10,7,4,6,8,2,9,20};
		for(int i=0;i<a.length;i++) {
			for(int j=1;j<a.length-i;j++) {
				if(a[i]<a[j-1]) {
					int temp=a[j];
					a[j]=a[j-1];
					a[j-1] =temp;
				}
			}
		}
		for(int ele:a) {
			System.out.println(ele);
		}
	}

}
