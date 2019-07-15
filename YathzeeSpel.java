package YathzeeSpelletje;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Stream;

public class YathzeeSpel {


	ArrayList<Dobbelsteen> dobbelsteen = new ArrayList<>();
	
	YathzeeSpel() {
		for( int i = 1; i < 6; i++) {
		dobbelsteen.add(new Dobbelsteen(werpen()));
		}

	}
	
	void spelen() {
		System.out.println("Enter to continue. q to quit.");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
		while (true) {
			input = scanner.nextLine();

			if ( input.equals("") ) {
			System.out.println("enter");
			//for( Dobbelsteen d : dobbelsteen) {
			YathzeeSpel ys = new YathzeeSpel();	
			for(Dobbelsteen d : dobbelsteen) {
			System.out.print(d.getGetal() + " ");
			
		//	}
			}

			vasthouden();

			}
			else if ( input.equals("q")) {
				System.out.println("");
				break;
			}
		}

	}
	int werpen() {
		Random random = new Random();
		int getal = random.nextInt((6 - 1) + 1) + 1;
		return getal;
		
	}
	
	void vasthouden() {
		System.out.println("\n Typ 0 of 1 in ");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		
//		int blokkeerarray = Integer.parseInt(input);
//		
//		List<Integer> array = Arrays.asList(blokkeerarray);

	    String[] parts = input.split(" ");

	    int[] ary = new int[5];
	    int element1 = Integer.parseInt(parts[0]);
	    int element2 = Integer.parseInt(parts[1]);
	    int element3 = Integer.parseInt(parts[2]);
	    int element4 = Integer.parseInt(parts[3]);
	    int element5 = Integer.parseInt(parts[4]);

	    
	    ary[0] = element1;
	    ary[1] = element2;
	    ary[2] = element3;
	    ary[3] = element4;
	    ary[4] = element5;
	    
	    ArrayList<Integer> arraylistd = new ArrayList<>(); 
	    arraylistd.add(0, element1);
	    arraylistd.add(1, element2);
	    arraylistd.add(2, element3);
	    arraylistd.add(3, element4);
	    arraylistd.add(4, element5);
	   

	    for(int i=0; i<5; i++){
	    System.out.println("get" + arraylistd.get(i));
	    	if(ary[i] == 0) {
	        System.out.println("ary" + ary[i]);
	    	}
	    }
	
	    

		
	}
}