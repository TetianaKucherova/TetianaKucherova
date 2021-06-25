import java.util.*;
public class th {


/*
Implement the method that takes a 2D Object array and creates a
List of Lists out of it and returns it.
 */
 public static void main(String[] args) {

     Object [][] info = {
                {"Name" ,  "Email" , "Phone Number", "Credit Card" },
                {"Anetta Pozer", "apozer0@gizmodo.com", "631-331-4898",	"3552421786057285"},
                {"Ilario Overlow", "ioverlow1@sakura.ne.jp", "512-969-3178", "5007666062273933"},
                {"Jenni Bowdery", "jbowdery2@creativecommons.org", "240-981-3226" ,	"3574299080159492"},
                {"Phyllys Karppi",	"pkarppi3@cnbc.com", "628-686-9886", "3589734035932315"},
                {"Adelbert Yitzovicz",	"ayitzovicz4@jigsy.com", "203-467-0276", "3576321404492926"}

              };

     for (List <String>row:arrayToList(info)){
     System.out.println(row);
     }
  }


  public static List<List<String>>  arrayToList(Object[][] arr){


  List<List<String>> newList = new ArrayList<>();
  for (int i = 0; i < arr.length; i++){
    newList.add(new ArrayList<String>());
    for (int j = 0; j < arr[i].length; j++){
      newList.get(i).add((String)arr[i][j]);
    }
  }
  return newList;

  }


}
