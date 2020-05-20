import java.util.*;



class Colors{
    String word;
    String word2;
    Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();

    public void copyMyColors(Map <Integer,String> myFavoriteColors, Map <Integer,String> myFriendsFavoriteColors)  {

        for(int i = 1; i < myFavoriteColors.size() + 1; i++){


            ourFavoriteColors.put(i,myFavoriteColors.get(i));

            String word = ourFavoriteColors.get(i);


        }





    }
    public String toString(){

        return word;
    }



}

class Kodilla {
    public static void main (String[] args) {
        // your code goes here

        Map <Integer,String> myFavoriteColors = new HashMap <Integer,String> ();
        Map <Integer,String> myFriendsFavoriteColors = new HashMap <Integer,String> ();

        myFavoriteColors.put(1, "Red");
        myFavoriteColors.put(2, "Green");
        myFavoriteColors.put(3, "Black");
        System.out.println("Values in first map: " + myFavoriteColors);
        myFriendsFavoriteColors.put(4, "White");
        myFriendsFavoriteColors.put(5, "Blue");
        myFriendsFavoriteColors.put(6, "Orange");
        System.out.println("Values in second map: " + myFriendsFavoriteColors);

        //Map <Integer,String> ourFavoriteColors = new HashMap <Integer,String> ();

        Colors colors = new Colors();
        colors.copyMyColors(myFavoriteColors, myFriendsFavoriteColors);


        //System.out.println(colors.size());




    }
}