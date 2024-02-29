/*calculate Maximum number of chocolates can eat and Number of wrappers left in hand.
Money: Total money one has to spend.
Price: price per chocolate.
wrappers: minimum number of wrappers for exchange
choco: number of chocolate for wrappers.
Max visit: Maximum number of times one can visit the shop.(if zero consider it infinite)
example: input: Money:40   Price:1   wrappers:3   choco:1   Max visit:1
Output: total chocolate can eat: 53   wrappers left in hand:14
*/
package ZohoQuestions;
public class Zoho10 {
    public static void calculateChocolateWrapper(int money, int perPrice, int wrappers, int choco, int maxVisit){
        int totalChocolate = 0;
        int wrappersLeft = 0;
        totalChocolate = money/perPrice;
        wrappersLeft = totalChocolate;
        if(maxVisit == 0){
            while(wrappers < wrappersLeft){
                totalChocolate += (wrappersLeft/wrappers);
                int extraWrappers = wrappersLeft/wrappers; // wrappers got in exchange for old wrappers
                wrappersLeft -= (wrappersLeft/wrappers) * wrappers;
                wrappersLeft += extraWrappers;
            }
        }
        while(maxVisit != 0){
            totalChocolate += wrappersLeft/wrappers;
            int extraWrappers = wrappersLeft/wrappers;
            wrappersLeft -= (wrappersLeft/wrappers) * wrappers;
            wrappersLeft += extraWrappers;
            maxVisit--;
        }

        System.out.println("Chocolate ate: " + totalChocolate);
        System.out.println("Wrappers Left: " + wrappersLeft);
    }
    public static void main(String[] args) {
        calculateChocolateWrapper(40, 1, 3, 1, 1);
    }
}
