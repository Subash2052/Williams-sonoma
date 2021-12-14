
# Zipcode pair optimization

The approach taken is *greedy* with the pair supplied being sorted accoding to the start and then the overlapped are removed by *updating the end* accordingly


# Files

- **PairZipCode** Pair to hold the start and end of zipcodes.
- **PairZipCodeComparator** To compare the start of each pair and used in sorting the collection.
- **ZipCodeService** Servoce which comtains the main logic to optimise the pair of zip-codes.
- **ZipCodeServiceTest** Test class that contains both the test given in the problem statement along with an additional test.
- **pom.xml** : Contains dependencies.

## Build
Created a maven project so it would be easy to build and run the test cases

To Build:

mvn clean install  
**Tech Used**
- Maven
- Java 16
- Junit-Jupiter