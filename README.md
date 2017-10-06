# tutorial-jubula-api
EclipseCon - Jubula API tutorial

# prerequisites

## note: the tutorial will only work on Windows / Linux
- [why macOS does not work](http://eclip.se/525658)

1. Download and install
- [Java SE Development Kit 8](http://www.oracle.com/technetwork/java/javase/downloads/index.html)
- Java SE Development Kit 8 Demos and Samples 
- [Eclipse IDE for Eclipse Committers: Oxygen 1](http://www.eclipse.org/downloads/packages/eclipse-ide-eclipse-committers/oxygen1)
- all components from [Jubula 8.5](https://testing.bredex.de/jubula-download-page.html)

2. Make sure the following works
- `java -version` on the console displays `java version "1.8.0_144"` or similiar
- `<JavaSEDevelopmentKit8DemosAndSamplesExtractionLocation>/demo/javafx_samples/Ensemble8.jar` launches (e.g. by double-clicking)
- Eclipse starts and has JDK 8 available
- the [Jubula AUT Agent is started with -om option](https://testing.bredex.de/faqs/jubula-api-setup.html)

3. Clone [this git repository](https://github.com/open-co-de/tutorial-jubula-api.git) to your local machine
- import project `org.eclipse.jubula.examples.api.jdk.javafx.ensemble.osgi`
- set `ide/api-OSGi.target` as target definition
- make sure the project shows no compile errors

4. Grab a cup of coffee and join the [ECE 2017 tutorial](https://www.eclipsecon.org/europe2017/session/ui-test-automation-using-jubula-api-why-how-and-what)

5. Enjoy!
