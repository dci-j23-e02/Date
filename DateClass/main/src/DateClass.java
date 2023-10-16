import java.util.*;


public class DateClass {
public static void main(String[] args){
  /*
  * Variable names rules in Java
  * can not start with a number
  * can not contain any special characters But only ('_' and '$')
  * can contain alphanumeric characters
  * can start with  ('_' or '$')
  *
  * Variable names best practices in Java
  * use either Camel case (camelCase) or snake case (snake_case)
  * give a meaningful name
  * constants are named always with full name capitalised (NUMBERS)
  * */
  // Date dates_1$ = new Date();
  // Date $dates = new Date();
 // Date _dates = new Date();


  // Using the default constructor 'new Date();' and having the current date and time
  Date date1 = new Date();
 // System.out.println("Current date is " + date1);

  Date SuzeBirthDate = new Date(2000, 11, 21); // Y2K bug : deprecated
  System.out.println("Suze birthdate is " + SuzeBirthDate);
  Date KarlBirthdate = new Date(93, 8, 7); // using 2 digits for the year before 2000, gives correct results , deprecated
  System.out.println("Karl birthdate is " + KarlBirthdate);
  Date KaiserBirthdate = new Date(1855, 8, 7); // using 4 digits is also a bug, deprecated
  System.out.println("Kaiser birthdate is " + KaiserBirthdate);







}
}
