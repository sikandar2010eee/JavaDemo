package Core.java;

public class Thisdemo {
	int a = 100;

	public Thisdemo() {

	}

	public Thisdemo(int a) {

		this.a = a;
	}

	public static void main(String[] args) {
		Thisdemo obj = new Thisdemo(40);
		System.out.println(obj.a);

	}
}
