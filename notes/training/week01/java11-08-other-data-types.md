# Java 11

### Overview:
- Time of events
- Human-friendly time
- Date and time formatting
- Primitive type wrapper classes

<br/>

### Understanding time
#### Time of events
Primarily interested in sequencing and timestamp.  
##### Tracking Time of Events
**Instant class**
- optimized for time-stamping events
- works well for relative time comparison
- can be converted into more complex date/time types

```java
static void checkReationship(Instant otherInstant){
    Instant nowInstant = Instant.now();
    if(otherInstant.compareTo(nowInstant)>0){
        System.out.println("Instant is in the future");
    } else if (otherInstant.compareTo(nowInstant) < 0) {
        System.out.println("Instant is in the past");
    } else {
        System.out.println("Instant is now");
    }
}
```
#### Local human-friendly time
##### Date and/or time of day  
`LocalTime` - Time of Day: 09:15:10.000000
`LocalDate` - Date only: 2022-12-25  
`LocalDateTime` - Date and time of day:2022-12-25T09:15:10.000000

**Focuses on the date and/or time value**
- no time zone
**Provide common operation**
- Finding differences
- increasing/decreasing values
- manipulating content
- convert to/from string

<br/>

#### Global human-friendly time
##### Date and time of day  
`ZonedDateTime`
- Operation similar to LocalDateTime
- Understanding  time zones  

**Strong time zone  support**
- can work with values across time zones
- can convert different time zones

<br/>

### Date and time formatting
#### Converting date/time values to/from String
- By default, each type is limited to a single string format

#### Converting to String with DateTimeFormatter
```java
LocalDate today = LocalDate.now();
System.out.println(today); // 2026-11-04

DateTimeFormatter formattedDated = DateTimeFormatter.ofPattern("MM-dd-yyyy");
System.out.println(today.format(formattedDated)); // 11-04-2026
```

#### Parsing a String with DateTimeFormatter
```java
String dateNow = "04-11-2026"; // 4th of November, 2026
DateTimeFormatter formattedDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");

LocalDate newDate = LocalDate.parse(dateNow, formattedDate);
System.out.println(newDate);
```

<br/>

### Primitive Wrapper Classes
- Can hold primitive data value.
- Provide methods
- Enable compatibility with richer aspects of Java type system

**Each primitive types has a wrapper class**
- Byte, Short,Integer, Long
- Float, Double
- Character
- Boolean


<br/>
