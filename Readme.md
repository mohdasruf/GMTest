Framework details:
I have used serenity BDD framework for this test. Few advantages of Serenity framework is
1. Webdriver instantiation will be done by the framework and the type of webdriver instance can be controlled by serenity.properties file
2. Reports produced with screenshots.

Details of Project Structure
1.  The "serenity.properties" file in the root folder contains options like the base URL or when screenshots should be taken.
2.  The Page Object classes are located in the "src/main/java/com/test/pages" folder.
3.  The step classes are located in the located in the "src/test/java/com/test/cucumber/steps/serenity" folder.
4.  The tests can be run using the runner file src/test/java/com/test/cucumber/BDDRunner.java
5.  The feature files can be found in src/test/resources/features/order-product.feature
6.  serenity.conf file contains the path to the webdriver executables


Serenity.properties file
```
    webdriver.driver=chrome
    #webdriver.driver=remote
    #firefox, chrome,iexplorer,phantomjs,htmlunit,edge:
    
    serenity.project.name =  DEMO
    
    #serenity.timeout=10000
    webdriver.wait.for.timeout=15000
    
    webdriver.base.url=https://www.apple.com/uk/
    
    # How long does Serenity wait for elements that are not present on the screen to load
    webdriver.timeouts.implicitlywait=5000
    
    serenity.take.screenshots=FOR_EACH_ACTION
    # FOR_EACH_ACTION,BEFORE_AND_AFTER_EACH_STEP,AFTER_EACH_STEP,FOR_FAILURES,DISABLED



