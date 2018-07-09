/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/jobs.groovy
 */
 
package jobs

import jenkins.automation.builders.*
import jobs.Utilities

def utils = new jobs.Utilities()

def myJob = job('example')
Utilities.addMyFeature(myJob)


def message = "Hello World from Don!"
Utilities.loggit(message)