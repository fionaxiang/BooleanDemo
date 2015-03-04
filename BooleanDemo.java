import javax.swing.JOptionPane;
public class BooleanDemo {
	public static void main(String [] args){
		String numPeopleString=JOptionPane.showInputDialog("Enter the number of people");
		String numPlayersString=JOptionPane.showInputDialog("Enter the number of players");
		int  numPeople,groupSize,groupSize1,numPlayers,teamSize,teamSize1;
		numPeople=Integer.parseInt(numPeopleString);
		numPlayers=Integer.parseInt(numPlayersString);
		boolean status = true;
		boolean numPeople1,numberPlayers;
		
		if(numPeople>10&&numPlayers>10){
			//numpeople is true
			groupSize =numPeople/2;
			teamSize = numPlayers/11;
			JOptionPane.showMessageDialog(null, "The input number of people is" + numPeople + "\n"+ "The input number of players is" + numPlayers+ "\n"
					
				+"The number of people is " + groupSize + "\n" + "The number of team size is "+ teamSize);
			
			
		}else if(numPeople<10&&numPlayers<55){
			groupSize1=numPeople/3;
			teamSize1=1;
			JOptionPane.showMessageDialog(null,"The input number of people is" +numPeople+"\n"+"The input number of players is" +numPlayers +"\n"+
					"The number of people has to be at least 3 "  + "\n" + "The number of team size is" + teamSize1);
		}
		
		
	}

}
