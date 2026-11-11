# 📝 Java Core Notes:

### Refresher Day10:
- File I/O
---

<br/>

### File I/O
- **stream** - flow of data
- **input stream** - in coming
  - .in read data as raw bytes (one byte at a time)
  - .in usually passed into a wrapper class like scanner 
  - or buffered reader to parse text & number easily.
- **output stream** - out coming
  - .out

#### byte streams 
- file input output
- raw bytes
- read data as raw bytes (one byte at a time)

####  char stream 
-  for text

#### buffer writer 
- convenient to write text

<br/>

### FileInputStream
- reads raw bytes
- it returns - 1 if no more character

#### path
- relative path - starts from current working directory
- absolute path - complete path from your computer.

```java
FileInputStream fileInputStream = new FileInputStream(/*path*/);
```

<br/>

### Buffered Reader
- gives you readline
- returns null if no more line
```java
BufferedReader bufferedReader = new br(new FileWriter(/*path*/));
```

<br/>

### Buffered Writer
- provides write() method

```java
BufferedWriter bw = new BufferedWriter(new FileWriter(/*path*/));
```