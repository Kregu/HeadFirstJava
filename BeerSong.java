public class BeerSong {
    public static void main(String[] args) {
                
        int beerNum = 9;
        String word = "bootles";

        while (beerNum > 0) {
            System.out.print(beerNum + " " + word + " of beer on the wall, ");
            System.out.println(beerNum + " " + word + " of beer.");
            System.out.println("Take one down, pass it around, ");

            beerNum -= 1;
            
            if (beerNum == 1) {
                word = "bottle";
            }

            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " of beer on the wall...");
            }
            else {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
            }
            

        }


    }
        
}