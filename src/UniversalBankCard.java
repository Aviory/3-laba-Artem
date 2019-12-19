import jdk.jshell.spi.SPIResolutionException;

public class UniversalBankCard  <T> {
    private T id;
    private String fio;
    private Double credit;
    private Double personalBill;


    public T getId() {
        return id;
    }

    public void setId(T id) {
        this.id = id;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public Double getCredit() {
        return credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public Double getPersonalBill() {
        return personalBill;
    }

    public void setPersonalBill(Double personalBill) {
        this.personalBill = personalBill;
    }


    public Double getSum(){
        return getCredit() + getPersonalBill();
    }

    public void setSum(double sum) {
        personalBill += sum;
    }
}
