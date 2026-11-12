# 📝 Java Core Notes:

### Refresher Day11:
- JUnit
---

<br/>

### JUnit
#### Automated Testing
- Test the define expected result

#### Manual Testing
- Running application and manually decided whether the result are correct.
- not efficient as the program grows

#### JUnit
- testing framework in java
- write test method to check method automatically.

#### Test Folder Structure
- follow the class directory when creating class test.
- className + Test  
- src
  - main
  - test
    - same to main structure:
    - main
    - --java
    - ----package
    - ------test

#### Testing
- we need the class object
#### @beforeAll
- runs once before test executes

#### @beforeEach
- runs before every each test
- instantiate object

#### @Test 
- tells that the following method is a test method
- @Test

#### @DisplayName
- @DisplayName("Test Addition Operation")

#### @Tag 
- optional: for organizing purposes 
- @Tag("Arithmetic")

#### method to test
```java
void testAddition(){
    int p1 = 2;
    int p2 = 3;
    int expected = 5;
        
    int  actualResult = calculator.add(p1,p2);
}
```

#### JUnit allows us to parameterized test
```java
  @ParameterizedTest
  @DisplayName ("")
  @Tag("")
  @CSVSource({
      "2,3,6",
      "4,5,0",...
      })
  void testMultiplication(int a, int b){
  assertEquals(expectedResult, calc.multiply(a,b))
}
```
- *CSVSource:* 2 is the firsNumber, 3 is the secondNumber, and 6 is the expected result
- *in method:* int a is the 2, int b is the 3

#### Triple A Method
- **Arrange** - Data Needed
- **Act** - Executed the method being tested
- **Assert** - verify
- assertEquals(expectedResult, method());

#### assertThrows
- not every test returns check values
- sometimes it throws exceptions
```java
  @Test
  @DisplayName("")
  @Tag("")
  void testDivision(int a, int b){
    assertThrows(ArithmeticException.class()->calc.divide(5,0));
  }
```
  
#### @RepeatedTest(n)
- JUnit provides repeated test
- @RepeatedTest(n)

#### @Disbled
- when disabled, java will not process the test

#### @AfterEach
- runs after each test

#### @AfterAll
- runs after all test finished
- runs once at the end of the test cycle
