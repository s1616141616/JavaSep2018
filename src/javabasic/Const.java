package javabasic;

public class Const {

	int length;
	int width;
	int height;

	public int getRectangle() {
		return (length * width * height);
	}

	Const() {
		length = 10;
		width = 15;
		height = 20;
	}

	Const(int l, int w, int h) {
		length = l;
		width = w;
		height = h;
	}
}