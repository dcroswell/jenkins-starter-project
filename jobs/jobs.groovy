/**
 * Created by Don Croswell on 9/07/2018.
 */

import jenkins.automation.builders.*

def workingDir = System.getProperty("user.dir");  
println workingDir

File utilitiesFile = new File("${workingDir}/workspace/Seed/jobs/Utilities.groovy");
Class utilitiesClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(utilitiesFile);
GroovyObject utils = (GroovyObject) utilitiesClass.newInstance();

def myJob = job('example')
utils.addMyFeature(myJob)


def message = "Hello World from Don!"
utils.say(out)