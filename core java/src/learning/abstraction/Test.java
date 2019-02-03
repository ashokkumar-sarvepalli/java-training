package learning.abstraction;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		
		Download d = new PdfDownload();
		d.convertAndDownload("hello".getBytes());
		
		PdfDownload pd = (PdfDownload) d;
	
		pd.sayHello();
		
		
		pd.sayHello();

		int choice;
		do {
			System.out.println("1.Download as Pdf 2.Download as Text 3. Download as Excel 4.Exit");
			Scanner sc = new Scanner(System.in);
			choice = sc.nextInt();

			switch (choice) {
			case 1:
				writeDownlaod(new PdfDownload());
				break;

			case 2:
				writeDownlaod(new TextDownload());
				break;

			case 3:
				writeDownlaod(new ExcelDownload());
				break;
			case 4:
				break;
			default:
				System.out.println("Invalid choice entered");
			}

		} while (choice != 4);

	}

	private static void writeDownlaod(Download download) {
		byte[] bytes = download.downloadAsBytes("23-10-2018", "23-12-2018");
		
		download.convertAndDownload(bytes);

	}

}
