package hello;

class Hello{
	public static int sum(int n, int m) {
		return n + m;
	}
	 public static void main(String[] args) {
		 int i = 20;
		 int s;
		 char a;
		 
		 a = '?';
		 s = sum(i, 10);
		 
		 System.out.println(a);
		 System.out.println("hello");
		 System.out.println(s);
	 }
}