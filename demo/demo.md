# Demo

## Pluggable nature of Jenkins

### New Plain controller

```bash
  JENKINS_HOME=jhome1 java -jar jenkins.war --httpPort=8080
```

### New pre-installed controller

```bash
  JENKINS_HOME=jhome2 java -jar jenkins.war --httpPort=8081
```

## Developing code

### run the plugin

```bash
  mvn hpi:run
```

### run with specific version of Jenkins

```bash
  mvn hpi:run -Djenkins.version=2.499
```

Debug mode

```bash
  mvnDebug hpi:run
```

### Debug Controller

```bash
  JENKINS_HOME=jhome3 java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 -jar jenkins.war --httpPort=8082
```