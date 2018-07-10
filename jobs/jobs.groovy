/**
 * Created by Don Croswell on 9/07/2018.
 */

import jenkins.automation.builders.*
import hudson.model.*

// Get the out variable
def out = getBinding().out

def workingDir = System.getProperty("user.dir");  
println workingDir

File utilitiesFile = new File("${workingDir}/workspace/Seed/jobs/Utilities.groovy");
Class utilitiesClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(utilitiesFile);
GroovyObject utils = (GroovyObject) utilitiesClass.newInstance();

// def message = "Hello World from Don in ${env}"
// println message

def pipeline = createPipeline(n)
def pipe = job("Dev Jenkins Pipeline")
utils.createPipeline(pipe)