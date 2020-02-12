import java.io.*;
import java.util.*;

public class Albums {
	String name;
	String year;
	String genre;
	String artist;
	
	//ALBUM CONSTRUCTOR
	public Albums(String name, String year, String genre, String artist) {
		this.name = name;
		this.year = year;
		this.genre = genre;
		this.artist = artist;
	}
	//NAME GETTER
	public String getName() {
		return name;
	}
	//YEAR GETTER
	public String getYear() {
		return year;
	}
	//GENRE GETTER
	public String getGenre() {
		return genre;
	}
	//ARTIST GETTER
	public String getArtist() {
		return artist;
	}
	
	public static void main(String[] args) {
		//NO FILE SPECIFIED
		if (args.length == 0) {
			System.out.println("No File Specified");
			return;
		}
		//CREATE ARRAYLIST
		ArrayList<Albums> array = new ArrayList<Albums>();
		
		/*//NAME COMPARATOR
		public static final Comparator<Albums> comparebyName = (Albums o1, Albums o2) {
			return o1.name.compareTo(o2.name);
		}

		//YEAR COMPARATOR
		public static final Comparator<Albums> comparebyYear = (Albums o1, Albums o2) {
			return o1.year.compareTo(o2.year);
		}

		//GENRE COMPARATOR
		public static final Comparator<Albums> comparebyGenre = (Albums o1, Albums o2) {
			return o1.genre.compareTo(o2.genre);
		}

		//ARTIST COMPARATOR
		public static final Comparator<Albums> comparebyArtist = (Albums o1, Albums o2) {
			return o1.artist.compareTo(o2.artist);
		}*/
		
		//READING IN DATA & ADDING INTO ARRAYLIST
		String inputFile = args[0];
		File f = new File(inputFile);
		try {
		Scanner scan = new Scanner(f);
		while (scan.hasNextLine()) {
			String line = scan.nextLine();
			String[] parts = line.split(",");
			//int yearpart = Integer.parseInt(parts[1]);
			array.add(new Albums(parts[0], parts[1], parts[2], parts[3]));
		}
		} catch (FileNotFoundException e) {
			System.err.println("File Does Not Exist");
			return;
		}
		//INTERPRETING COMMANDS
		Scanner input = new Scanner(System.in);
		while (true) {
			String cmd = input.nextLine();
			//QUIT COMMAND
			if (cmd.equals("QUIT")) {
				break;
			}
			
			//DISPLAY COMMAND
			if (cmd.equals("DISPLAY")) {
				for (int i = 0; i < array.size(); i++) {
					System.out.println(array.get(i).getName() + ", " + array.get(i).getYear()
					+ ", " + array.get(i).getGenre() + ", " + array.get(i).getArtist());
				}
			}
			//SORT COMMAND
			String[] sortcmd = cmd.split(" ");
			if (sortcmd[0].equals("SORT")) {
				if (sortcmd.length < 3) {
					//DEFAULT
					if (sortcmd[1].equals("0")) {
						Collections.sort(array, new Comparator<Albums>() {
							public int compare(Albums o1, Albums o2) {
								return o1.getName().compareTo(o2.getName());
							}
						});
					}
					if (sortcmd[1].equals("1")) {
						Collections.sort(array, new Comparator<Albums>() {
							public int compare(Albums o1, Albums o2) {
								return o1.getYear().compareTo(o2.getYear());
							}
						});
					}
					if (sortcmd[1].equals("2")) {
						Collections.sort(array, new Comparator<Albums>() {
							public int compare(Albums o1, Albums o2) {
								return o1.getGenre().compareTo(o2.getGenre());
							}
						});
					}
					if (sortcmd[1].equals("3")) {
						Collections.sort(array, new Comparator<Albums>() {
							public int compare(Albums o1, Albums o2) {
								return o1.getArtist().compareTo(o2.getArtist());
							}
						});
					}
				} else {
					//ASCENDING
					if (sortcmd[2].equals("ASC")) {
						if (sortcmd[1].equals("0")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o1.getName().compareTo(o2.getName());
								}
							});
						}
						if (sortcmd[1].equals("1")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o1.getYear().compareTo(o2.getYear());
								}
							});
						}
						if (sortcmd[1].equals("2")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o1.getGenre().compareTo(o2.getGenre());
								}
							});
						}
						if (sortcmd[1].equals("3")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o1.getArtist().compareTo(o2.getArtist());
								}
							});
						}
					} else {
						//DESCENDING
						if (sortcmd[1].equals("0")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o2.getName().compareTo(o1.getName());
								}
							});
						}
						if (sortcmd[1].equals("1")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o2.getYear().compareTo(o1.getYear());
								}
							});
						}
						if (sortcmd[1].equals("2")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o2.getGenre().compareTo(o1.getGenre());
								}
							});
						}
						if (sortcmd[1].equals("3")) {
							Collections.sort(array, new Comparator<Albums>() {
								public int compare(Albums o1, Albums o2) {
									return o2.getArtist().compareTo(o1.getArtist());
								}
							});
						}
					}
				}
			}
		}
	}
}