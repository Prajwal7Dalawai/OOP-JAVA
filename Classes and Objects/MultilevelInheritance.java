package classesAndObjects;


class Box{
	double width;
	double hieght;
	double depth;
	Box(){		//Default constructor of parent class
		width = 0;
		hieght = 0;
		depth = 0; 
	}
	Box(double w, double h, double d){
		width = w;
		hieght = h;
		depth = d;
	}
	
	Box(double value){
		width = hieght = depth = value;
	}
	
	void volume() {
		System.out.println("The volume of the box is: " + width*hieght*depth);
	}
}

class BoxWeight extends Box {
	double weight;
	BoxWeight(){
		super();
		weight = 0;
	}
	
	BoxWeight(double w, double h, double d, double we){
		super(w,h,d);
		weight = we;
	}
	
	BoxWeight(double value, double we){
		super(value);
		weight = we;
	}
}

class Shipment extends BoxWeight{
	double cost;
	
	Shipment(){
		super();
		cost = 0;
	}
	
	Shipment(double w, double h, double d, double we, double co){
		super(w,h,d,we);
		cost = co;
	}
	Shipment(double value, double we, double co){
		super(value,we);
		cost = co;
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In the class box..");
		Box b1 = new Box();
		Box b2 = new Box(2,3,4);
		Box b3 = new Box(5);
		System.out.println("For default constructor:");
		System.out.println("Width = "+b1.width);
		System.out.println("Hieght = "+b1.hieght);
		System.out.println("Depth = "+b1.depth);
		b1.volume();
		System.out.println("");
		System.out.println("For constructor with three parameters:");
		System.out.println("Width = "+b2.width);
		System.out.println("Hieght = "+b2.hieght);
		System.out.println("Depth = "+b2.depth);
		b2.volume();
		System.out.println("");
		System.out.println("For constructor with single parameter:");
		System.out.println("Width = "+b3.width);
		System.out.println("Hieght = "+b3.hieght);
		System.out.println("Depth = "+b3.depth);
		b3.volume();
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("In the class BoxWeight...");
		BoxWeight bo1 = new BoxWeight();
		BoxWeight bo2 = new BoxWeight(2,3,4,5);
		BoxWeight bo3 = new BoxWeight(5,5);
		System.out.println("For default constructor:");
		System.out.println("Width = "+bo1.width);
		System.out.println("Hieght = "+bo1.hieght);
		System.out.println("Depth = "+bo1.depth);
		System.out.println("Weight = "+bo1.weight);
		System.out.println("");
		System.out.println("For constructor with four parameters:");
		System.out.println("Width = "+bo2.width);
		System.out.println("Hieght = "+bo2.hieght);
		System.out.println("Depth = "+bo2.depth);
		System.out.println("Weight = "+bo2.weight);
		System.out.println("");
		System.out.println("For constructor with two parameter:");
		System.out.println("Width = "+bo3.width);
		System.out.println("Hieght = "+bo3.hieght);
		System.out.println("Depth = "+bo3.depth);
		System.out.println("Weight = "+bo3.weight);
		System.out.println("");
		System.out.println("");
		
		
		System.out.println("In the class Shipment...");
		Shipment s1 = new Shipment();
		Shipment s2 = new Shipment(2,3,4,5,6);
		Shipment s3 = new Shipment(5,5,5);
		System.out.println("For default constructor:");
		System.out.println("Width = "+s1.width);
		System.out.println("Hieght = "+s1.hieght);
		System.out.println("Depth = "+s1.depth);
		System.out.println("Weight = "+s1.weight);
		System.out.println("Cost = "+s1.cost);
		System.out.println("");
		System.out.println("For constructor with five parameters:");
		System.out.println("Width = "+s2.width);
		System.out.println("Hieght = "+s2.hieght);
		System.out.println("Depth = "+s2.depth);
		System.out.println("Weight = "+s2.weight);
		System.out.println("Cost = "+s2.cost);
		System.out.println("");
		System.out.println("For constructor with two parameter:");
		System.out.println("Width = "+s3.width);
		System.out.println("Hieght = "+s3.hieght);
		System.out.println("Depth = "+s3.depth);
		System.out.println("Weight = "+s3.weight);
		System.out.println("Cost = "+s3.cost);
		
	}
}
