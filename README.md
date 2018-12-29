# nicebank
A full stack Java application to demo Behavior-Driven Development using Cucumber

## How to Run the App:
``` shell
mvn exec:java -Dexec.mainClass="com.shaundashjian.nicebank.AtmServer"
```
## How to Remote Debug:
- ``` export MAVEN_OPTS="-Xdebug -agentlib:jdwp=transport=dt_socket,address=9999,server=y,suspend=n" ```
- In Eclipse: `Debug Configuration... > Remote Java Application > Connect > Port: 9999` 
- Add break points
- ``` mvn exec:java -Dexec.mainClass="com.shaundashjian.nicebank.AtmServer" ```
