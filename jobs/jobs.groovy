/**
 * Created by Don Croswell on 9/07/2018.
 */

import jenkins.automation.builders.*
import hudson.model.*

// Get the out variable
def out = getBinding().out
def workingDir = System.getProperty("user.dir");  
println workingDir

// This section of code creates a Utilities Object/Class which creates the bulk of the Pipeline DSL
File utilitiesFile = new File("${workingDir}/workspace/Seed/jobs/Utilities.groovy"); // reference the groovy class file
Class utilitiesClass = new GroovyClassLoader(getClass().getClassLoader()).parseClass(utilitiesFile); // create the class
GroovyObject utils = (GroovyObject) utilitiesClass.newInstance(); // create an instance of the class

// This section will define a Pipeline Job with the Utilities object created above
def pipe = pipelineJob('My Pipeline Script') {
    definition {
        cps {
            script(readFileFromWorkspace("${workingDir}/workspace/Seed/jobs/project-a-workflow.groovy"))
            sandbox()
        }
    }
} // create the pipeline job
//utils.createPipeline(pipe) // use the utils class to set up stages, steps, etc.
