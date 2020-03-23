public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer(int sheetsLeft, int tonerVolume){
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheets(){
        return this.sheetsLeft;
    }

    public int getTonerVolume(){
        return this.tonerVolume;
    }

    public void print(int numberOfPages, int numberOfCopies){
        int sheetsNeeded = numberOfPages * numberOfCopies;
        if (sheetsNeeded <= this.sheetsLeft){
            this.sheetsLeft -= sheetsNeeded;
            this.tonerVolume -= sheetsNeeded;
        }
    }
}
