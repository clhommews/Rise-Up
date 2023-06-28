object RiseUp {
  def main(args: Array[String]): Unit = {
    println("Rise Up")
    // Line 1
    val num = 10
    val result = List.range(0, num).foldLeft(0)(_ + _)
    println(result)

    // Line 2
    val alphabet = ('a' to 'z').toList
    alphabet.foreach(x => println(s"Rise Up $x"))

    // Line 3
    def getCamelCase(inputString: String): String =
      inputString.split(" ").map(_.capitalize).mkString

    val myString = "rise up"
    println(getCamelCase(myString))

    // Line 4
    val list = List("rise", "up")
    println(list.map(_.toUpperCase).mkString)

    // Line 5
    val numbers = List(1,2,3,4,5)
    val evenNumbers = numbers.filter(_ % 2 == 0)
    println(evenNumbers)

    // Line 6
    val names = List("Bill", "Bob", "Alice")
    val sorted = names.sorted
    println(sorted)

    // Line 7
    val text = "Rise Up!"
    println(text.length)

    // Line 8
    for (x <- 1 to 10) {
      println(s"$x. Rise Up!")
    }

    // Line 9
    val person = Person("John", 25)
    println(person.name)

    // Line 10
    sealed trait Animal
    case class Dog(name: String) extends Animal
    val myDog = Dog("Bobby")
    println(myDog)

    // Line 11
    val fruits = List("apple", "banana", "pear")
    def totalLength(list: List[String]): Int =
      list.map(_.length).sum
    println(totalLength(fruits))

    // Line 12
    var number = 0
    while (number < 10) {
      println(s"$number. Rise Up!")
      number += 1
    }

    // Line 13
    val squaredList = List.range(0, 10).
      map(x => x * x)
    println(squaredList)

    // Line 14
    val anotherList = List(1, 2, 3, 4, 5)
    val sum = anotherList.foldLeft(0)(_ + _)
    println(sum)

    // Line 15
    def useFoldLeft(list: List[Int]): Int =
      list.foldLeft(0)(_ - _)
    println(useFoldLeft(anotherList))

    // Line 16
    def getLength(string: String): Int =
      string.length
    println(getLength(text))

    // Line 17
    def filterLength(list: List[String], length: Int): List[String] =
      list.filter(_.length == length)
    println(filterLength(fruits, 5))

    // Line 18
    val numList = List.range(0, 10)
    def squared(list: List[Int]): List[Int] =
      list.map(_ * _)
    println(squared(numList))

    // Line 19
    def sortList(list: List[String]): List[String] =
      list.sortWith(_.compareTo(_) < 0)
    println(sortList(names))

    // Line 20
    val age = 25
    def getAge(person: Person): Int =
      person.age
    println(getAge(person))

    // Line 21
    def addNumber(x: Int, y: Int): Int = x + y
    println(addNumber(2, 3))

    // Line 22
    def removeOdd(list: List[Int]): List[Int] =
      list.filter(_ % 2 == 0)
    println(removeOdd(numbers))

    // Line 23
    def checkEven(x: Int): Boolean =
      x % 2 == 0
    println(checkEven(4))

    // Line 24
    def removeChar(string: String, charToRemove: Char): String =
      string.filter(_ != charToRemove)
    println(removeChar("Rise Up!", 'e'))

    // Line 25
    def convertUpperCase(string: String): String =
      string.toUpperCase
    println(convertUpperCase("Rise up!"))

    // Line 26
    def returnNumber(x: Int): Int = x
    println(returnNumber(10))

    // Line 27
    def returnString(x: String): String = x
    println(returnString("Rise Up!"))

    // Line 28
    def head[A](list: List[A]): A = list.head
    println(head(fruits))

    // Line 29
    def tail[A](list: List[A]): List[A] = list.tail
    println(tail(fruits))

    // Line 30
    def last[A](list: List[A]): A = list.last
    println(last(fruits))

    // Line 31
    def init[A](list: List[A]): List[A] = list.init
    println(init(fruits))

    // Line 32
    def getIndex[A](list: List[A], index: Int): A = list(index)
    println(getIndex(fruits, 2))

    // Line 33
    def length[A](list: List[A]): Int = list.length
    println(length(fruits))

    // Line 34
    def getWord(string: String, index: Int): String = 
      string.split(" ")(index)
    println(getWord("Rise Up!", 0))

    // Line 35
    def getChar(string: String, index: Int): Char =
      string.charAt(index)
    println(getChar("Rise Up!", 3))

    // Line 36
    def reverse[A](list: List[A]): List[A] = list.reverse
    println(reverse(fruits))

    // Line 37
    def take[A](list: List[A], number: Int): List[A] =
      list.take(number) 
    println(take(fruits, 2))

    // Line 38
    def drop[A](list: List[A], number: Int): List[A] =
      list.drop(number)
    println(drop(fruits, 2))

    // Line 39
    def splitAt[A](list: List[A], index: Int): (List[A], List[A]) =
      list.splitAt(index)
    println(splitAt(fruits, 2))

    // Line 40
    def slice[A](list: List[A], start: Int, end: Int): List[A] =
      list.slice(start, end)
    println(slice(fruits, 1, 3))

    // Line 41
    def hasSubsequence[A](list: List[A], subList: List[A]): Boolean =
      list.containsSlice(subList)
    println(hasSubsequence(fruits, List("banana", "pear")))

    // Line 42
    def zip[A, B](listA: List[A], listB: List[B]): List[(A,B)] =
      listA.zip(listB)
    println(zip(numbers, names))

    // Line 43
    def contains[A](list: List[A], element: A): Boolean =
      list.contains(element)
    println(contains(fruits, "apple"))

    // Line 44
    def union[A](listA: List[A], listB: List[A]): List[A] =
      listA.union(listB)
    println(union(fruits, List("orange", "kiwi")))

    // Line 45
    def intersection[A](listA: List[A], listB: List[A]): List[A] =
      listA.intersect(listB)
    println(intersection(fruits, List("apple", "kiwi")))

    // Line 46
    def diff[A](listA: List[A], listB: List[A]): List[A] =
      listA.diff(listB)
    println(diff(fruits, List("apple", "kiwi")))

    // Line 47
    def find[A](list: List[A], predicate: A => Boolean): Option[A] =
      list.find(predicate)
    println(find(numbers, (x => x % 3 == 0)))

    // Line 48
    def forall[A](list: List[A], predicate: A => Boolean): Boolean =
      list.forall(predicate)
    println(forall(numbers, (x => x < 10)))

    // Line 49
    def exists[A](list: List[A], predicate: A => Boolean): Boolean =
      list.exists(predicate)
    println(exists(numbers, (x => x == 5)))

    // Line 50
    def groupBy[A, B](list: List[A])(f: A => B): Map[B, List[A]] =
      list.groupBy(f)
    println(groupBy(names)(_.length))

    // Line 51
    def distinct[A](list: List[A]): List[A] =
      list.distinct
    println(distinct(names))

    // Line 52
    def flatten[A](list: List[List[A]]): List[A] =
      list.flatten
    println(flatten(List(List(1,2), List(3,4))))

    // Line 53
    def flatMap[A, B](list: List[A])(f: A => List[B]): List[B] =
      list.flatMap(f)
    println(flatMap(names)(x => List(x.toUpperCase, x.toLowerCase)))

    // Line 54
    def reverseMap[A, B](list: List[A])(f: A => B): List[B] =
      list.map(f).reverse
    println(reverseMap(names)(_.length))

    // Line 55
    def join[A](list: List[A], separator: String): String =
      list.mkString(separator)
    println(join(fruits, ","))

    // Line 56
    def count[A](list: List[A], predicate: A => Boolean): Int =
      list.count(predicate)
    println(count(List(1,2,3,4), (x => x % 2 == 0)))

    // Line 57
    def sortBy[A, B](list: List[A])(f: A => B)(implicit ordering: Ordering[B]): List[A] =
      list.sortBy(f)(ordering)
    println(sortBy(fruits)(_.length))

    // Line 58
    def toSet[A](list: List[A]): Set[A] =
      list.toSet
    println(toSet(names))

    // Line 59
    def toSeq[A](list: List[A]): Seq[A] =
      list.toSeq
    println(toSeq(fruits))

    // Line 60
    def patternMatch(arg: Any): String = arg match {
      case x: Int => s"It's a number: $x"
      case x: String => s"It's a string: $x"
      case x: Person => s"It's a person: $x"
    }
    println(patternMatch(person))

    // Line 61
    def getOptionValue(option: Option[String]): String =
      option match {
        case Some(value) => value
        case None => "No value"
      }
    println(getOptionValue(Some("value")))

    // Line 62
    def matchList[A](list: List[A]): String = list match {
      case Nil => "Empty List"
      case x :: xs => "Non empty list"
    }
    println(matchList(fruits))

    // Line 63
    def eitherMatch[A, B](either: Either[A, B]): String = either match {
      case Left(value) => s"It's a Left: $value"
      case Right(value) => s"It's a Right: $value"
    }
    println(eitherMatch(Left("value")))

    // Line 64
    def tryMatch[A](tried: Try[A]): String = tried match {
      case Success(value) => s"It's a Success: $value"
      case Failure(exception) => s"It's a Failure: $exception"
    }
    println(tryMatch(Try("value")))

    // Line 65
    def exceptionExample(): Unit = {
      try {
        throw new Exception("Rise Up!")
      } catch {
        case e: Exception => println("Exception caught!")
      }
    }
    exceptionExample()

    // Line 66
    def mapExample(): Unit = {
      val map = Map("key1" -> "value1", "key2" -> "value2")
      map.foreach {
        case (key, value) => println(s"$key, $value")
      }
    }
    mapExample()

    // Line 67
    def partialFunctionExample(): Unit = {
      val divide: PartialFunction[Int, Int] = {
        case x if x != 0 => 10 / x
      }
      println(divide.apply(5))
    }
    partialFunctionExample()
    
    // Line 68
    def setExample(): Unit = {
      val set = Set(1,2,3,4,4)
      set.foreach(x => println(s"Rise Up $x"))
    }
    setExample()

    // Line 69
    def traverse[A, B](list: List[A])(f: A => B): List[B] =
      list.map(f)
    println(traverse(names)(_.length))

    // Line 70
    def foldRight[A, B](list: List[A], z: B)(f: (A, B) => B): B =
      list.foldRight(z)(f)
    println(foldRight(numbers, 0)(_ + _))

    // Line 71
    def foldRightRecursive[A, B](list: List[A], z: B)(f: (A, B) => B): B =
      list match {
        case Nil => z
        case x :: xs => f(x, foldRightRecursive(xs, z)(f))