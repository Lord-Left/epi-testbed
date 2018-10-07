import java.util.*;

public class sixSeven {

	final static public String[] MAP = {"0", "1", "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ"};

	public static void main(String[] args) {

		System.out.println("This program prints out mnemonic sequences. \n");
		String num = "5164764181";
		ArrayList<String> sequenceList = new ArrayList<String>();
		char[] charList = new char[num.length()];
		List<String> strList = sixSeven.listOfSequences(num, 0, charList, sequenceList);
		Iterator itr = strList.iterator();

		while(itr.hasNext()) {
			System.out.println(itr.next() + " ");
		}


	}

	public static List<String> listOfSequences(String phoneNumber, int count, char[] partialString, List<String> listOfStrings) {


			if(count == phoneNumber.length()) {

			listOfStrings.add(new String(partialString));
			return listOfStrings;

			} else {

				// for each character that cooresponds to a mapping, producing a string that uses that character
				char c = phoneNumber.charAt(count);
				int mapInt = Integer.parseInt(String.valueOf(c)); // is there a more direct way of doing this??
				String currentMapping = MAP[mapInt];

				for(int j = 0; j < currentMapping.length(); j++) {

					char mapChar = currentMapping.charAt(j);
					partialString[count] = mapChar;

					listOfSequences(phoneNumber, count + 1, partialString, listOfStrings);


				}


			}

			return listOfStrings;
		}
	}
