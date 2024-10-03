public class FindLargestNumber {

 public static void main(String[] args) {

  //numbers array
  int numbers[] = new int[]{55,32,45,98,82,11,9,39,50};

  //assign first element of an array to largest
  int largest = numbers[0];

  for (int i = 1; i < numbers.length; i++) {
   if (numbers[i] > largest)
    largetst = numbers[i];
  }

  System.out.println("Largest Number is : " + largest);
 }
}
