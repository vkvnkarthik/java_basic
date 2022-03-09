package com.training.capgemini;

public class ProductDetails {

	public static void main(String[] args) {
	    int c1;
	    int c2;
	    int c3;
	    int c4;
	    int c5;

		Product p1 = new Product();
		p1.setProdId("E1");
		p1.setProdName("BAT");
		p1.setProdDescription("A1 QUALITY");
		p1.setProdPrice(1000);
		c1=p1.getProdPrice();
		
		Product p2 = new Product();
		p2.setProdId("E2");
		p2.setProdName("BAT2");
		p2.setProdDescription("A2 QUALITY");
		p2.setProdPrice(800);
		c2=p2.getProdPrice();
		
		Product p3 = new Product();
		p3.setProdId("E3");
		p3.setProdName("BAT3");
		p3.setProdDescription("A3 QUALITY");
		p3.setProdPrice(600);
		c3=p3.getProdPrice();
		
		Product p4 = new Product();
		p4.setProdId("E4");
		p4.setProdName("BAT 4");
		p4.setProdDescription("A4 QUALITY");
		p4.setProdPrice(400);
		c4=p4.getProdPrice();
		
		Product p5 = new Product();
		p5.setProdId("E5");
		p5.setProdName("BAT 5");
		p5.setProdDescription("A5 QUALITY");
		p5.setProdPrice(200);
		c5=p5.getProdPrice();
		
		//displaying costly product details
		if(c1>c2&&c1>c3&&c1>c4&&c1>c5) {
			System.out.println(p1.getProdId());
			System.out.println(p1.getProdName());
			System.out.println(p1.getProdDescription());
			System.out.println(p1.getProdPrice());
		}
		else if(c2>c3&&c2>c4&&c2>c5) {
			System.out.println(p2.getProdId());
			System.out.println(p2.getProdName());
			System.out.println(p2.getProdDescription());
			System.out.println(p2.getProdPrice());
		}
		else if(c3>c4&&c3>c4) {
			System.out.println(p3.getProdId());
			System.out.println(p3.getProdName());
			System.out.println(p3.getProdDescription());
			System.out.println(p3.getProdPrice());
		}
		else if(c4>c5) {
			System.out.println(p4.getProdId());
			System.out.println(p4.getProdName());
			System.out.println(p4.getProdDescription());
			System.out.println(p4.getProdPrice());
		}
		else {
			System.out.println(p5.getProdId());
			System.out.println(p5.getProdName());
			System.out.println(p5.getProdDescription());
			System.out.println(p5.getProdPrice());
		}
		// TODO Auto-generated method stub

	}

}
