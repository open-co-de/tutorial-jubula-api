# tutorial-jubula-api
EclipseCon - Jubula API tutorial

## prerequisites

### note: the tutorial will only work on Windows / Linux
- [why macOS does not work](http://eclip.se/525658)

1. Download and install
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Java SE Development Kit 8 Demos and Samples](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html) 
- [Eclipse IDE for Eclipse Committers: Oxygen 1](http://www.eclipse.org/downloads/packages/eclipse-ide-eclipse-committers/oxygen1)
- all components from [Jubula 8.5](https://testing.bredex.de/jubula-download-page.html) (you will need to register or login to download the standalone version)

2. Make sure the following works
- `java -version` on the console displays `java version "1.8.0_144"` or similiar
- `<JavaSEDevelopmentKit8DemosAndSamplesExtractionLocation>/demo/javafx_samples/Ensemble8.jar` launches (e.g. by double-clicking)
- Eclipse starts and has JDK 8 available
- the [Jubula AUT Agent can be started with -om option](https://testing.bredex.de/faqs/how-can-i-perform-mapping-when-using-the-api-without-requiring-the-ite.html) (you only need to perform the steps up until you see the system tray icon for the AUT Agent. We will start the AUT and perform Object Mapping during the tutorial)

3. Clone [this git repository](https://github.com/open-co-de/tutorial-jubula-api.git) to your local machine
- import project `org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi`
- set `ide/api-OSGi.target` as target definition
- make sure the project shows no compile errors

4. Grab a cup of coffee and join the tutorial

5. Enjoy!

## Slides
 1. [Introduction](https://open-co-de.github.io/tutorial-jubula-api/slides/01_Intro.html)
 1. [Jubula basics](https://open-co-de.github.io/tutorial-jubula-api/slides/02_Basics.html)
 1. [Advanced topics](https://open-co-de.github.io/tutorial-jubula-api/slides/03_Advanced.html)
 1. [Equivalence classes](https://open-co-de.github.io/tutorial-jubula-api/slides/04_Equi.html)
 1. [Summary](https://open-co-de.github.io/tutorial-jubula-api/slides/05_Summary.html)
