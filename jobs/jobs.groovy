/**
 * Created by Don Croswell on 9/07/2018.
 */

import jenkins.automation.builders.PipelineJobBuilder
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
def script = """
    pipeline {
        agent { label 'master' }
        stages {
            stage('hello') {
                steps {
                    sh 'echo "Hello World"'
                }
            }
        }
    }
"""

new PipelineJobBuilder(
        name: 'Hello Pipeline With Script',
        description: 'This is a simple pipeline job',
        pipelineScript: script,
        sandboxFlag: false
).build(this).with {
    logRotator {
        numToKeep(365)
    }
}
