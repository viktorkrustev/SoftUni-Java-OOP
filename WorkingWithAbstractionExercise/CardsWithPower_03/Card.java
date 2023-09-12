package WorkingWithAbstractionExercise.CardsWithPower_03;

public class Card {
    public static int calculatedPower(String rank, String suit){
        CardSuits cardSuitsValue = CardSuits.valueOf(suit);
        CardRanks cardRanks= CardRanks.valueOf(rank);
        return cardSuitsValue.getSuitPower() + cardRanks.getCardPower();
    }
}
