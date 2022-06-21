package promo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;

import utils.Ser;

public class PromoGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Promo> promos = new ArrayList<Promo>();
		
		ArrayList<Apprenant> promo1 = new ArrayList<Apprenant>();
		while (promo1.size()<11) {
		promo1.add(new Stagiaire(randomName(), randomName(), randomYear(), randomMonth(), randomDay(), new ArrayList<String>(Arrays.asList(randomContact(), randomContact())), randomEmployer(), 0, 0, "Java 4", randomType(), randomSalary()));
		}

		promos.add(new Promo(promo1, "Java 4", 2022, 05, 02, 120));
		
		ArrayList<Apprenant> promo2 = new ArrayList<Apprenant>();
		while (promo2.size()<11) {
		promo2.add(new Stagiaire(randomName(), randomName(), randomYear(), randomMonth(), randomDay(), new ArrayList<String>(Arrays.asList(randomContact(), randomContact())), randomEmployer(), 0, 0, "Php 4", randomType(), randomSalary()));
		}
		
		promos.add(new Promo(promo2, "Php 4", 2022, 05, 02, 120));
		
		ArrayList<Apprenant> promo3 = new ArrayList<Apprenant>();
		while (promo3.size()<11) {
		promo3.add(new Alternant(randomName(), randomName(), randomYear(), randomMonth(), randomDay(), new ArrayList<String>(Arrays.asList(randomContact(), randomContact())), randomEmployer(), 0, 0, "Java 3", randomSalary()));
		}
		
		promos.add(new Promo(promo3, "Java 3", 2022, 05, 02, 120));
		
		
		Ser.save("promos", promos);

	}
	
	
	public static String randomContact() {
		return new String(randomName() + " " + randomName() + "" + randomTel());
	}
	
	public static String randomName() {
		ArrayList<String> names = new ArrayList<String>();
		Collections.addAll(names, "Beckham","Vivian","Amelia","Amaya","Gordon","Sharon","Neveah","Josie","Heidy","Heather","Prince","Braeden","Shannon","Emmy","Anthony","Arabella","Jessie","Aurora","Martha","Rhys","Haven","Destiney","Alondra","Adriana","Jaxson","Ty","Sam","Jovanni","Hamza","Felipe","Aden","Estrella","Dayami","Carla","Ayla","Micah","Houston","Bella","Gilberto","Dexter","Ricky","Moshe","Jagger","Holly","Jaydin","Justice","Jordyn","Logan","Kamden","Erik","Arturo","Michelle","Terrence","Amanda","Sincere","Henry","Aaron","Judah","Aliza","Kiara","Leticia","Tatum","Mohamed","Olive","Kira","Alexzander","Julissa","Bailey","Nehemiah","Marques","Precious","Elian","Mylee","Damian","Jacob","Cael","Angela","Katie","Emmalee","Alejandra","Giovani","Cesar","Maci","Jolie","Reilly","Zane","Karissa","Reese","Anya","Maximo","Layne","Mathias","Clarence","Kareem","Cristina","Kayla","Jaliyah","Tobias","Nadia","Jamie","Aditya","Amiya","Clare","Juliet","Darwin","Claudia","Orlando","Reyna","Sara","Pierre","Madilynn","Lewis","Kristian","Ryder","Karen","Kaleigh","Campbell","Alyvia","Susan","Kendal","Araceli","Serenity","Deborah","Mackenzie","Ben","Steve","Ashley","Arthur","Jovani","Jaeden","Piper","Essence","Kelsey","Riley","Pablo","Jaylene","Natalee","Chris","Kamren","Coleman","Rhett","Joanna","Luke","Marley","Summer","Barrett","Andre","Lucille","Jaden","Luciana","Carlee","Marcos","Jovany","Toby","Christina","Brooklyn","Miracle","Johanna","Ronald","Jade","Kaylah","Skyler","Leland","Jovan","Branden","Shyla","Alden","Bronson","Lennon","Dangelo","Lailah","Maddox","Heidi","Rashad","Madeleine","Ean","Iris","Salma","Raphael","Myla","Cody","Damien","Nayeli","Madeline","Karlie","Marc","Scarlett","Dax","Steven","Kaeden","Ishaan","Trystan","Kiersten","Amelie","Pedro","Leo","Gracie","Walker","Laney","Jaylyn","Lillian","Jadyn","Adonis","Elliot","Colten","April","Lorenzo","Karlee","Halle","Neil","Jaylen","Haylie","Pranav","Jaylynn","Salvatore","Wesley","Geovanni","Serena","Bryanna","Rudy","Adelyn","Dakota","Frederick","Beatrice","Rex","Adriel","Blaze","Bo","Keyon","Annie","Mina","Adrien","Reina","Kyan","Saige","Waylon","Layton","Jacquelyn","Darius","Adrienne","Samara","Alonzo","Vincent","Bryce","Ingrid","Yahir","Alissa","Porter","Oliver","Camryn","Glenn","Isis","Trevon","Heath","Randy","Humberto","Octavio","Ainsley","Josiah","Jay","Marlene","Lila","Tiara","Soren","Demarcus","Konner","Freddy","Izayah","Saniya","Autumn","Bridger","Mckenzie","Rayna","Liana","Ray","Noah","Sierra","Alia","Mara","Gretchen","Davon","Ashtyn","Alexis","Izaiah","Carly","Diana","Jaslyn","Jazmyn","Tatiana","Mya","Kenny","Jaylin","Hana","Teagan","Rose","Hanna","Camryn","Brenton","Titus","Malcolm","Katherine","Lena","Nickolas","Charlee","Destinee","Erick","Kara","Chaz","Roberto","Abigail","Cassandra","Trinity","Jonathon","Miah","Zayden","Nathaniel","Cecilia","Maverick","Ezequiel","Kyson","Franklin","Presley","Dean","Tristian","Mikaela","Jamison","Calvin","Georgia","Anderson","Cierra","Karter","Jaime","Troy","Lilia","Jonas","Rory","Teresa","Quincy","Josephine","Dominique","Maren","Maritza","Jensen","Quinton","Reynaldo","River","Ezekiel","Liam","Erika","Claire","Deven","Lawson","Kingston","Kiera","Janet","Garrett","Davis","Kendall","Violet","Cecelia","Marlon","Justine","Ernesto","Dominique","Jaylan","Katelynn","Addison","Shamar","Kayleigh","Marisa","Crystal","Eileen","Stella","Aydan","Danny","Adelaide","Esther","Felicity","Theodore","Aidan","Kamila","Ansley","Aryanna","Jadiel","Melina","Justus","Madelynn","Lilliana","Ethen","Tyler","Micaela","Allan","Haleigh","Shayla","Baylee","Brianna","Christine","Raelynn","Ally","Guillermo","Elianna","Kaiya","Allison","Meadow","Byron","Gunner","Aspen","Laura","Sage","Mireya","Aisha","Marilyn","Annika","Brett","Braedon","Cassie","Shiloh","Madalynn","Libby","Gianni","Joyce","Mila","Jacey","Charlie","Riya","Adrianna","Hailie","Logan","Lilianna","Matthew","Averi","Eli","Jamir","Lilly","Brittany","Camilla","Ashlynn","Reagan","Gaven","Isaias","Antonio","Kathryn","Jayla","Jorge","Karli","Katelyn","Meghan","Alina","Adison","Sebastian","Frida","Jaelyn","Jacoby","Isla","Eduardo","Camille","Madelyn","Lola","Victoria","Leonardo","Hassan","Amber","Donovan","Charlize","Landon","Shaniya","Elaine","Sheldon","Jameson","Mariam","Zavier","Lamont","Ashlee","Leslie","Lydia","Keith","Gerald","Carlos","Albert","Jaylon","Nora","Nina","Keenan","Janae","Jerry","Emilee","Valentina","Caitlyn","Grace","Janelle","Lexi","Mattie","Koen","Rebecca","Walter","Tyrell","Bryant","Marissa","Harley","Thalia","Shirley","Gisselle","Julius","Trent","Janiya","Kai","Jayce","Milton","Giovanni","Ruby","Courtney","Kinsley","Julia","Abdullah","Braden","Ulises","Braylen","Naima","Perla","Avery","Christian","Laci","Alisson","Journey","Kamari","Layla","Angeline","Katrina","Teagan","Ana","Samantha","Demetrius","Kailee","Cullen","Hailee","Ryleigh","Brian","Fisher","Melvin","Cannon","Jeffrey","Ralph","Daniela","Dennis","Cameron","Conor","Madisyn","Destiny","Alanna","Carl","Mallory","Briley","Julianna","Howard","Mekhi","Emelia","Colt","Zackery","Margaret","Beckett","Keely","Ryan","Broderick","Elyse","Taylor","Paula","Ruben","Aidyn","Anika","Jazlyn","Karson","Jazmin","Fabian","Sawyer","Kadyn","Tianna","Laylah","Darrell","Leilani","Brisa","Everett","Rodney","Lincoln","Dale","Drew","Terry","Sidney","Paul","Jayson","Carissa","Alison","Jaiden","Jane","Sanaa","Jazlene","Chance","Carter","Lindsay","Giuliana","Asa","Lauren","Milo","Tessa","Sarai","Brenda","Ace","Justin","Cruz","Kaley","Anton","Taylor","Jayvion","Ayana","Jordon","Macie","Camren","Sylvia","Paloma","Maria","Jonah","Jillian","Lance","Lisa","Ximena","Fiona","Alex","Quinn","Konnor","Nico","Lilah","Jessie","Haiden","Rafael","Brooklynn","Harmony","Gauge","Meredith","Daisy","Andres","Zion","Regan","George","Pierce","Keyla","Cyrus","Magdalena","Annalise","Monica","Marcel","Nia","Quinn","Greta","Kolten","Carmelo","Hector","Oswaldo","Lizbeth","Giovanny","Misael","Ahmad","Deshawn","Kaya","Douglas","Leanna","Makhi","Roman","Philip","Kayley","Omari","Rhianna","Isiah","Raegan","Genevieve","Tyson","Allisson","Lilian","Kelvin","Hillary","Connor","Alfredo","Terrance","Carina","Hugo","Isabell","Leonidas","Zaria","Yaretzi","Shea","Lacey","Angelo","Karly","Terrell","Royce","Ramon","Britney","Nathalia","Ellie","Miles","Rylie","Jefferson","Jeramiah","Bryan","Nathan","Samir","Ruth","Luna","Matteo","Kelton","Alexia","Sullivan","Conrad","Rogelio","Brock","Amya","Spencer","Alayna","Xander","Sadie","Amirah","Bryson","Erica","Rylee","Raymond","Silas","Seamus","Javon","Adeline","Ross","Kierra","Rene","Kaitlyn","Alannah","Renee","Lawrence","Curtis","Stacy","Anna","Nathalie","Eden","Omar","Cara","Rigoberto","Kali","Nikhil","Eliana","Taliyah","Edwin","Santiago","Sean","Branson","Julio","Izabella","Chelsea","Abbigail","Viviana","Nyla","Malia","Raiden","Bradyn","Kaelyn","Eliezer","Maximus","Johnathon","Camron","Tanya","Carson","Karley","Emmanuel","Weston","Penelope","Maggie","Jerome","Seth","Simeon","Clinton","Aleah","Rolando","Mia","Callum","Tiffany","Laurel","Brenden","Jeremy","Morgan","Anahi","Beau","Lee","Mckayla","Isai","Melany","Elvis","Finnegan","Azaria","Valerie","Jon","Olivia","Noe","Jaidyn","Jack","Kade","Caden","Zachery","Hadley","Litzy","Emery","Yesenia","Norah","Makayla","Mira","Collin","Deacon","Ernest","Emanuel","Kailey","Cale","Cali","Gillian","Jarrett","Avah","Darien","Memphis","Dayton","Antony","Laila","Janiah","Kennedi","Delaney","Nicholas","Davin","Kenyon","Judith","Kason","Rowan","Muhammad","Jennifer","Denzel","Bianca","Kale","Leyla","Edgar","Lainey","Brycen","Zechariah","Matthias","Cason","Sterling","Zack","Jakobe","Richard","Eden","Savion","Ariana","Dylan","Coby","Jaida","Ezra","Aubrey","Lizeth","Rocco","Xiomara","Selah","Jazmine","Javier","Tate","Lexie","Martin","Miya","Caiden","Macy","Jadyn","Cortez","Landyn","Kate","Rishi","Miriam","Elliott","Niko","Madison","Julie","Molly","Cadence","Luz","Ismael","Matilda","Tamara","Alejandro","Audrina","Khalil","Roselyn","Chandler","Wendy","Esmeralda","Emery","Darion","Fatima","Uriel","Marina","Phoenix","Dante","Barbara","Mariana","Abigayle","Mark","Giselle","Ariel","Will","Dustin","Justice","Aron","Clark","Adalynn","Jaydon","Lara","Natalya","Angelina","Raul","Zayne","Kiley","Chase","Kimberly","Gavyn","Shelby","Landin","Yaritza","Ahmed","Josh","Callie","Ashton","Aniyah","Davian","Marvin","Julianne","Addisyn","Carolyn","Emely","Amare","Dominik","Daphne","Marely","Irvin","Aleena","Kaylen","Linda","Paisley","Emerson","Uriah","Kelsie","Emily","Brogan","Azul","Annabel","Kylie","Skyla","Maximillian","Alvaro","Samuel","Alessandra","Jake","Kyle","Bradley","Brynn","Cash","Ariella","Vaughn","Keegan","Tristin","Aarav","Manuel","Cindy","Jayden","Caroline","Sophia","Bailee","Kaia","Larry","Juliana","Maryjane","Kash","Catherine","Dominic","Drake","Cohen","Jude","Marisol","Davion","Dominick","Carolina","Madilyn","Tomas","Janessa","Lorena","Maribel","Abril","Graham","William","Dalton","Kassandra","Whitney","Braylon","Kadin");
		return names.get(ThreadLocalRandom.current().nextInt(0, names.size()));
	}
	
	public static String randomTel() {
		String tel = ": 0";
		tel += ThreadLocalRandom.current().nextInt(1, 8);
		while (tel.length()<10) {
			tel += ThreadLocalRandom.current().nextInt(0, 10);
		}
		return tel;
	}
	
	
	public static int randomYear() {
		return ThreadLocalRandom.current().nextInt(2021, 2023);
	}
	
	public static int randomMonth() {
		return ThreadLocalRandom.current().nextInt(1, 13);
	}
	
	public static int randomDay() {
		return ThreadLocalRandom.current().nextInt(1, 27);
	}
	
	public static String randomEmployer() {
		ArrayList<String> employers = new ArrayList<String>();
		Collections.addAll(employers, "American Family Insurance Group", "IQVIA Holdings", "Lincoln National", "Ingredion", "Alcoa", "GameStop", "Costco Wholesale", "Reinsurance Group of America", "KeyCorp", "Brighthouse Financial", "Dollar General", "Dana", "Hormel Foods", "Albertsons", "News Corp.", "Energy Transfer", "United States Steel", "Abbott Laboratories", "XPO Logistics", "WESCO International", "Clorox", "Tech Data", "Dick's Sporting Goods", "McDonald's", "Advance Auto Parts", "AutoZone", "Hewlett Packard Enterprise", "NVR", "Waste Management", "Ball", "Danaher", "Molson Coors Brewing", "Constellation Brands", "Adobe", "Nordstrom", "Old Republic International", "AT&T", "Omnicom Group", "Bank of New York Mellon", "Las Vegas Sands", "PVH", "Cummins", "Publix Super Markets", "Northrop Grumman", "ADP", "Graphic Packaging Holding", "Liberty Mutual Insurance Group", "Franklin Resources", "Calpine", "Arthur J. Gallagher", "Qualcomm", "Targa Resources", "Henry Schein", "Eli Lilly", "Lear", "HollyFrontier", "Illinois Tool Works", "MetLife", "Stanley Black & Decker", "R.R. Donnelley & Sons", "Hertz Global Holdings", "United Technologies", "Expedia Group", "DTE Energy", "Dover", "Mutual of Omaha Insurance", "Western Union", "Duke Energy", "MasTec", "PayPal Holdings", "Plains GP Holdings", "Post Holdings", "FedEx", "US Foods Holding", "CenturyLink", "PG&E", "Citizens Financial Group", "Olin", "Best Buy", "DXC Technology", "Southwest Airlines", "Insight Enterprises", "Republic Services", "American Airlines Group", "Cognizant Technology Solutions", "HP", "Murphy USA", "A-Mark Precious Metals", "Lam Research", "Expeditors Intl. of Washington", "Verizon Communications", "Genworth Financial", "Builders FirstSource", "DISH Network", "Amgen", "Occidental Petroleum", "Lithia Motors", "Cardinal Health", "NCR", "Tapestry");
		return employers.get(ThreadLocalRandom.current().nextInt(0, employers.size()));
	}
	
	public static String randomSalary() {
		return String.valueOf(ThreadLocalRandom.current().nextInt(1500, 2001));
	}
	
	public static String randomType() {
		int var = ThreadLocalRandom.current().nextInt(0, 3);
		switch (var) {
		case 0: {
			return "ARE";
		}
		case 1: {
			return "AREF";
		}
		case 2: {
			return "RSA";
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + var);
		}
		
	}
	

}
