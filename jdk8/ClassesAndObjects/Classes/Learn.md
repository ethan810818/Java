# Classes
## Declaring Classes
public class House extends SuperHouse implements HouseInterface {
    //fields
    //constructors
    //method
}

- Body:
1. Modifiers: (public || private, || ...)
2. ClassName: (House, || ...)
3. SuperClass: (SuperHouse, || ...)
4. Interface: (HouseInterface, ...)
5. Body: {}

## Declaring Member Variables
1. Kinds of variables:
    - Fields
    - Local variables
    - parameters
2. Components of field declarations:
    - Modifier? DataType variableName;

## Defining Methods
public void createMethod() {}
public String createMethod(String parameter1, int parameter2, float parameter3) {
    String localVariable = "Hello World!";
    return localVariable;
}

- Body:
1. Modifiers
2. ReturnType: (DataType || void)
3. MethodName: 
4. ParameterList:
5. An exceptionList
6. MethodBody: {}

- Signature of method:
createMethod()
createMethodI(String, int, float)

## Naming a Method
- (one-word): be a verb 
- (multi-word): be a verb + capitalized

## Overloading Methods
public class DataArtist {
    ...
    public void draw(String s) {
        ...
    }
    public void draw(int i) {
        ...
    }
    public void draw(double f) {
        ...
    }
    public void draw(int i, double f) {
        ...
    }
}

## Providing Constructors for Your Classes
public class MyClass {
    private String field1;

    public MyClass(String field1) {
        this.field1 = field1;
    }

    public MyClass() {
        field1 = "field1";
    }
}

## Passing Information to a Method or a Constructor
### Parameter Types
### Arbitrary Number of Arguments
public PrintStream printf(String format, Object... args)

### ParameterName
### Passing Primitive Data Type Arguments
### Passing Reference Data Type Arguments




