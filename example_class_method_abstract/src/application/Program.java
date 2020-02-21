package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Shape> shapes = new ArrayList<>();
		
		System.out.print("Enter the number os shapes: ");
		int n = sc.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.print("Rectangle or Circle (r/c)? ");
			sc.nextLine();
			char cr = sc.nextLine().charAt(0);
			
			System.out.print("Color (BLACK/BLUE/RED): ");
			String color = sc.nextLine();
			
			if (cr == 'r') {
				System.out.print("Width: ");
				double width = sc.nextDouble();
				
				System.out.print("Height: ");
				double height = sc.nextDouble();
				
				shapes.add(new Rectangle(Color.valueOf(color), width, height));
			}
			else if (cr == 'c') {
				System.out.print("Radius: ");
				double radius = sc.nextDouble();
				
				shapes.add(new Circle(Color.valueOf(color), radius));
			}
		}
		
		System.out.println("SHAPE AREAS:");
		
		for (Shape shape: shapes) {
			System.out.println(shape.area());
		}
		
		sc.close();
	}
}