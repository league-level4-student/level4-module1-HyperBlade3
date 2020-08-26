package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	
		
	
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public static void ZodiacEnum(Zodiac zodiacCurrent) {
		switch (zodiacCurrent) {
		case ARIES:
			JOptionPane.showMessageDialog(null,  "Aries is a passionate, motivated, and confident leader who builds community with their cheerful disposition and relentless determination. Uncomplicated and direct in their approach, they often get frustrated by exhaustive details and unnecessary nuances.");
			break;
		case TAURUS:
			JOptionPane.showMessageDialog(null, " Taureans, like the bull that represents them, are known to be intelligent, dependable, hardworking, dedicated, and stubborn.");
			break;
		case GEMINI:
			JOptionPane.showMessageDialog(null, "Gemini is constantly juggling a variety of passions, hobbies, careers, and friend groups. They are the social butterflies of the zodiac: These quick-witted twins can talk to anyone about anything. Find them buzzing between happy hours, dinner parties, and dance floors");
			break;
		case CANCER:
			JOptionPane.showMessageDialog(null, "Cancers are known for their traits like loyalty, their emotional depth, and their parenting instincts. In your squad they'll be the one that knows the secrets (and keeps them), the one that others turn to first, and the one that can almost smell when something is off.");
			break;
		case LEO:
			JOptionPane.showMessageDialog(null, "Like a crackling fire, Leos tend to be warm, passionate, and dynamic. They delight in opportunities to let their charismatic, inclusive personality shine. And like the lion that represents them, Leos are also strong, brave, and ready to dominate everything they set out to do.");
			break;
		case VIRGO:
			JOptionPane.showMessageDialog(null, "Virgos are logical, practical, and systematic in their approach to life. ... Virgo rules the digestive system, which makes these earth signs especially attuned to the ingredients that make up a whole — in food and in everything else. They're hyper-aware of every detail.");
			break;
		case LIBRA:
			JOptionPane.showMessageDialog(null, "Libra is obsessed with symmetry and strives to create equilibrium in all areas of life. These air signs are the aesthetes of the zodiac: Ruled by Venus, the planet that governs love, beauty, and money, Libras adore high art, intellectualism, and connoisseurship.");
			break;
		case SCORPIO:
			JOptionPane.showMessageDialog(null, "Those born under this sign are dead serious in their mission to learn about others. There’s no fluff or chatter for Scorpios, either; these folks will zero-in on the essential questions, gleaning the secrets that lie within.");
			break;
		case SAGITTARIUS:
			JOptionPane.showMessageDialog(null, "Like Chiron, the Sagittarius personality is loyal, sophisticated, independent, and kind! They are unique, artistic, and have unerring judgment. You might even say their arrows tend to hit the mark! The astrological sign for Sagittariuses is a bow and arrow, just like this one.");
			break;
		case CAPRICORN:
			JOptionPane.showMessageDialog(null, "Capricorns are the ultimate worker bees. They're ambitious, organized, practical, goal-oriented, and they don't mind the hustle. “They're ready to give up a lot in order to achieve that goal,” Verk says. They also love making their own rules, which means they strive to reach high career positions.");
			break;
		case AQUARIUS:
			JOptionPane.showMessageDialog(null, "Every Aquarian is a rebel at heart: These air signs despise authority and anything that represents conventionality. Free-spirited and eccentric, they can often be identified by their offbeat fashion sensibilities, unusual hobbies, and nonconformist attitude.");
			break;
		case PISCES:
			JOptionPane.showMessageDialog(null, "Pisces are very friendly, so they often find themselves in a company of very different people. Pisces are selfless, they are always willing to help others, without hoping to get anything back.\r\n" + 
					"\r\n" + 
					"Pisces is a Water sign and as such this zodiac sign is characterized by empathy and expressed emotional capacity.");
			break;
			
		default:
			break;
			
		}
		
	}
	
	// 3. Make a main method to test your method
	
	public static void main(String[] args) {
		
		String[] options = {"Aries", "Taurus", "Gemini", "Cancer", "Leo", "Virgo", "Libra", "Scorpio", "Sagittarius", "Capricorn", "Aquarius", "Pisces"};
		int input = JOptionPane.showOptionDialog(null, "Choose your zodiac sign!", "Horoscope", 0, -1, null, options, 0);
		
		String output = options[input];
		
		Zodiac zodiacSign = null;
		
		if (output.equals("Aries")) {
			zodiacSign = Zodiac.ARIES;
		}
		if (output.equals("Taurus")) {
			zodiacSign = Zodiac.TAURUS;
		}
		if (output.equals("Gemini")) {
			zodiacSign = Zodiac.GEMINI;
		}
		if (output.equals("Cancer")) {
			zodiacSign = Zodiac.CANCER;
		}
		if (output.equals("Leo")) {
			zodiacSign = Zodiac.LEO;
		}
		if (output.equals("Virgo")) {
			zodiacSign = Zodiac.VIRGO;
		}
		if (output.equals("Libra")) {
			zodiacSign = Zodiac.LIBRA;
		}
		if (output.equals("Scorpio")) {
			zodiacSign = Zodiac.SCORPIO;
		}
		if (output.equals("Sagittarius")) {
			zodiacSign = Zodiac.SAGITTARIUS;
		}
		if (output.equals("Capricorn")) {
			zodiacSign = Zodiac.CAPRICORN;
		}
		if (output.equals("Aquarius")) {
			zodiacSign = Zodiac.AQUARIUS;
		}
		if (output.equals("Pisces")) {
			zodiacSign = Zodiac.PISCES;
		}
		
		_00_Horoscope.ZodiacEnum(zodiacSign);
	}
	
}
