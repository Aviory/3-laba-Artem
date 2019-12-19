import java.util.ArrayList;

public class Bank <T>{
    ArrayList <UniversalBankCard<T>> cards = new ArrayList<>();

    public ArrayList<UniversalBankCard<T>> getCards() {
        return cards;
    }

    public String returningCustomerInformationById(T id){
        for (UniversalBankCard card:cards) {
            if ( card.getId().equals(id)){
                return card.getFio();
            }
        }
        return null;
    }



}
