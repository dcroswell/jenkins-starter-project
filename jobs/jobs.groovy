/**
 * Created by Don Croswell on 9/07/2018.
 */

import jenkins.automation.builders.*
File utilitiesFile = new File("./jobs/Utilities.groovy");
Class utilitiesClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(utilitiesFile);
GroovyObject utils = (GroovyObject) utilitiesClass.newInstance();

def myJob = job('example')
utils.addMyFeature(myJob)


// def message = "Hello World from Don!"
// utils.loggit(message)