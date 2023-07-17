//Define awakening pattern
val awakeningPattern = 
  """
  Step1: Learn to appreciate yourself
  Step2: Take time to recharge
  Step3: Set achievable goals
  Step4: Take small steps to success
  Step5: Celebrate successes
  Step6: Stay positive
  Step7: Take one day at a time
  Step8: Reach out to a community
  """

//Define object that prints awakening pattern
object RiseUp {
  def printAwakeningPattern(): Unit = {
    println(awakeningPattern);
  }
}

//Define object that reads input from user 
object UserInput {
  def getInput(): String = {
    println("Type in your own personal message to encourage yourself: ")
    scala.io.StdIn.readLine()
  }
}

//Define object that prints user input
object Output {
  def printOutput(userInput: String): Unit = {
    println("Your personal message is: \n" + userInput)
  }
}

//Define object for driver/main method
object Driver {
  def main(args: Array[String]): Unit = {
    RiseUp.printAwakeningPattern()
    val userInput = UserInput.getInput()
    Output.printOutput(userInput)
  }
}