import java.util.ArrayList;

public class Game {
	boolean reverse = false;

	public void Game() {
		// Prepping the deck
		Deck deck = new Deck();
		ArrayList<Hand> hands = new ArrayList<Hand>();

		initializeGame(deck, hands);

		System.out.println(hands);

		boolean winner = false;
		int i = 0;
		int turns = 0;
		while (winner == false) { // loops through players until there is a winner
			turns++;
			deck.replenish(); // checks if deck needs to be replenished
			Cards topDiscard = deck.topDiscard(); // getting the top card on the discard deck
			int currentPlayer = i;
			System.out.printf("Turn: %d\n", turns);
			System.out.printf("Top Card: %s\n", topDiscard);
			System.out.printf("Player: %d %s \n", currentPlayer, hands.get(currentPlayer)); 			
			Cards card = hands.get(currentPlayer).hasMatch(topDiscard); // checking if player has a match

			if (card != null) { // if the player can play a card
				System.out.println("Card Played:" + card); // what card they placed down
				if (card.isSpecial(card) == true) { // checks if card is special
					switch (card.getValue()) {
					case SKIP:
						i = getNextPlayer(i);
						break;
					case REVERSE:
						reverse = !reverse;
						break;
					case DRAWTWO:
						int nextPlayer = getNextPlayer(i);
						for (int x = 0; x < 2; x++) {
							hands.get(nextPlayer).drawCard(deck.dealCard());
						}
						break;
					case WILD:
						hands.get(currentPlayer).colorCount(card);
						System.out.println("Player has called the color: " + card.getColor());
						break;
					case WILD_DRAWFOUR:
						hands.get(currentPlayer).colorCount(card);
						System.out.println("Player has called the color: " + card.getColor());
						int wildNextPlayer = getNextPlayer(i);
						for (int x = 0; x < 4; x++) {
							hands.get(wildNextPlayer).drawCard(deck.dealCard());
						}
						break;
					default:
						System.out.println("Hmm something went wrong with a special card");
						break;

					}
					System.out.println("A special card has been played");
				}

				deck.addToDiscard(card); // takes the card the player played and puts it at the top of the discard deck
				if (hands.get(currentPlayer).isUno() == true) { // checks if player can call Uno
					System.out.printf("\nPlayer %d calls UNO!\n", currentPlayer);
				}
				if (hands.get(currentPlayer).isWinner() == true) { // checks if player won
					winner = true;
					System.out.printf("\nPlayer %d Won\n", currentPlayer);
					break;
				}
			} else { // if the player can't match a card they pick one up
				hands.get(currentPlayer).drawCard(deck.dealCard()); // player draws one card
				System.out.printf("Draw Card: %d \n", i); //display player number
				System.out.println(hands.get(currentPlayer)); //displayers current players hand
			}
			i = getNextPlayer(i); // getting the next player
			System.out.println();
		}

	}

	private void initializeGame(Deck deck, ArrayList<Hand> hands) {
		deck.populate();
		System.out.println(deck);
		deck.shuffle();
		System.out.println(deck);

		// Establishing four players
		hands.add(new Hand());
		hands.add(new Hand());
		hands.add(new Hand());
		hands.add(new Hand());

		// adding cards into the hands of the players
		for (int i = 0; i < 7; i++) {
			for (Hand hand : hands) {
				hand.drawCard(deck.dealCard());
			}
		}

		// add a card to the discard to start it, draw until there is a normal card
		deck.discardPile();
	}

	private int getNextPlayer(int i) {

		if (reverse == false) {
			i++;
		} else if (reverse == true) {
			i--;
		}
		if (i > 3) { // making sure that i does not break out of array
			i = 0;
		}
		if (i < 0) { // making sure that i does not break out of array
			i = 3;
		}
		return i;
	}

}
