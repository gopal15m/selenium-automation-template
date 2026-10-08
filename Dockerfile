FROM maven:3.9-eclipse-temurin-17
WORKDIR /work
COPY . .
CMD ["mvn","test","-Dexecution=grid","-DgridUrl=http://selenium-hub:4444/wd/hub","-DsuiteXmlFile=src/test/resources/suites/smoke.xml"]
