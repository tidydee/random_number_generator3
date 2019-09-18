public class rng3 {
    public static void main(String[] args) {
        Integer[] random20 = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int oddsLength = random20.length;
        int randomNumber = (int) (Math.random() * oddsLength);
        System.out.println(randomNumber);
    }
}
