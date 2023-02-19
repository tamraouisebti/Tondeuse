
# Tondeuse

This is a solution to the mower problem described in the image bellow.

## Problem

![](https://github.com/tamraouisebti/Tondeuse/blob/master/doc/mowerProblem.PNG)

The solution that we are about to present does not take in consideration obstacles as it is not mentioned in the document nor in the examples given.

## Solution

To make a solution we made out classes as represented in the diagram bellow, the solution was implemented in JAVA.

<img src="https://github.com/tamraouisebti/Tondeuse/blob/master/doc/domain.png" width="400" height="400">

This diagram represents the classes that we created to calculate the final position of the Mower (Les tondeuses), and they are classified as follows :

* [Direction](https://github.com/tamraouisebti/Tondeuse/blob/master/src/domain/Direction.java): an enumeration that represents the moves that can be mode by the mower (left, right, advance).
* [Orientation](https://github.com/tamraouisebti/Tondeuse/blob/master/src/domain/Orientation.java): an enumeration that represents the orientations of a mower (north, south, east, west).
* [Position](https://github.com/tamraouisebti/Tondeuse/blob/master/src/domain/Position.java): a class that contains the coordinates of the mower (x, y), this class has the methods that update the position according to the Orientations.
* [Mower](https://github.com/tamraouisebti/Tondeuse/blob/master/src/domain/Mower.java): a class that represents the mower and its attributes.
* [Lawn](https://github.com/tamraouisebti/Tondeuse/blob/master/src/domain/Lawn.java): a class that represents the field to be mown, it contains the mowers and the size of the lawn.

Also, a custom [exception](https://github.com/tamraouisebti/Tondeuse/blob/master/src/exception/BadlyFormattedInputFileException.java) was created to be thrown in case the file is badly formatted .

## Example
In this section we are going to execute our solution on the test given in the description of the problem.
```
5 5
1 2 N
GAGAGAGAA
3 3 E
AADAADADDA
```
To execute the solution we can just run the project on an IDE or use the following command on the terminal:
```
$> java <DIRECTORY>/Main.java <DIRECTORY>/testFileName
```
If no test file is specified it will by default run with this example, the result will be as the following image shows.

<img src="https://github.com/tamraouisebti/Tondeuse/blob/master/doc/example.PNG" width="700">

Also, the [Unit test](https://github.com/tamraouisebti/Tondeuse/blob/master/src/test/MowerTest.java) was written based on this example.
