# Java 11:

### Content:
- JRE, JDK,IDE
- Running from cmd line
- statement
- comments
- packages

<br/>

###  JRE, JDK, IDE
- **JRE** (Java Runtime Environment)  - enables java code execution.
- **JDK** (Java Development Kit) - provides tools required to create java apps.
- **IDE** (Integrated Development Environment) - edit, build, run, debug.
- Flow: *IDE* ➡️ *JDK* ➡️ *JRE* ➡️ *Host Environment* (Operating System) 

<br/>

### Running from CMD Line
- **Open the folder** containing your `.class`.
- **Click on the address bar** at the top of the file explorer window.
- **type `cmd`** into the address bar and press enter.
- **run the file** by typing `java <className>`.

<br/>

### Program made up of statements
- statements end with semicolon.
- parts are separated by zero or more whitespaces.

<br/>

### Comments
- string of text that ignored by the compiler.
- used to add human-readable notes to source code.
- used to hide code without deleting.

#### 3 types of comments
- `//...` *line-comment* - text ignored until end of current line.
- `/*...*/` *block comment* - text ignored within the block. 
- `//*...*/` *javadoc comment* - compiler treats similar to block comment and can be used to generate documentation.

<br/>

### Packages
- provides organization.
- follow standard naming convention. 
- affect sourcecode structure.
- **package naming conventions:**
  - all lower case.
  - user reverse domain name notation to assure global uniqueness
  - add further qualifies to assure uniqueness within a company or group.
- package name affect source code organization.