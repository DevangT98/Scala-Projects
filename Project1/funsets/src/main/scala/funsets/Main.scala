package funsets

object Main extends App {
  import FunSets._
  println("The statement \"{1} contains 1\" is " + contains(x => x==1, 1) + ".")

  val singleton3: IntSet = singletonSet(3)
  println(contains(singleton3,3) + ".")

  val even_set: IntSet = (x: Int) => x % 2 == 0
  val odd_set: IntSet = (x: Int) => x % 2 == 1

  // Compute the union of the two sets
  val numbers: IntSet = union(even_set, odd_set)

  // Test the resulting set by checking if it contains some elements
  println(contains(numbers, 2)) 
  println(contains(numbers, 3)) 

  val set1: IntSet = (x: Int) => x < 5
  val set2: IntSet = (x: Int) => x > 3
  val set3: IntSet = (x: Int) => x % 2 == 0

  val numbers1: IntSet = intersect(set1,set2)
  
  val numbers2: IntSet = intersect(set1,set3)
  
  println(contains(numbers1, 4)) 
  println(contains(numbers2, 3)) 

  val evenNumbers: IntSet = (x: Int) => x % 2 == 0

  //Create a new set containing only even numbers that are greater than 5
  val filteredSet: IntSet = filter(evenNumbers, (x: Int) => x > 5)

  // Test the resulting set by checking if it contains some elements
  println(contains(filteredSet, 2)) // false
  println(contains(filteredSet, 4)) // false
  println(contains(filteredSet, 6)) // true
  println(contains(filteredSet, 8)) // true


//val evenNumbers: IntSet = (x: Int) => x % 2 == 0

  // Check if all even numbers greater than 5 are also greater than 3
  val result: Boolean = forall(evenNumbers, (x: Int) => x > 3)

  println(result) 

  // Define an IntSet object
  val mySet: IntSet = (x: Int) => x >= 0 && x <= 10

  // Define a function that multiplies an integer by 2
  def double(x: Int): Int = x * 2

  // Apply the map function to mySet and double
  val mappedSet: IntSet = map(mySet, double)

  // Test the mappedSet by checking some values
  println(mappedSet(5)) // Output: true, because 5 * 2 = 10, which is within the range of mySet
  println(mappedSet(15)) // Output: false, because 15 * 2 = 30, which is outside the range of mySet
}
