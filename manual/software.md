:lock: VSCode JDK 11 issue  

The path to the Java Development Kit is searched in the following order:
the java.home setting in VS Code settings (workspace then user settings)
the JDK_HOME environment variable
the JAVA_HOME environment variable
on the current system path

:key: settings.json
```json
 "java.home": "C:\\Users\\enzo\\Workspace\\software\\jdk-11.0.2"
```

:lock: maven jdk1.5 and jdk1.6  
:key:  environment variable
```sh
JAVA_HOME=C:\Program Files\Java\jdk1.8.0_191  
```

