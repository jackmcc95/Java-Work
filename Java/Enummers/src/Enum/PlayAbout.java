package Enum;

public class PlayAbout {

	public PlayAbout() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		System.out.println("Today is : " + Day.Monday);
		
		Book b1 = new Book();
		b1.setTitle("Catch 22");
		b1.setGenre(Genre.COMEDY);
		
		Book b2 = new Book();
		b2.setTitle("Gangster Granny");
		b2.setGenre(Genre.COMEDY);
		
		Book[]books = {b1, b2};
		for (Book book : books) {
			if (book.getGenre()==Genre.COMEDY) {
				System.out.println(book.getTitle());
			}
		}
	}

}
