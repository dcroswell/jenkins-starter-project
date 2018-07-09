/**
 * Created by muchniki on 1/12/16.
 */
 
package jobs

import jenkins.automation.builders.*
import jobs.Utilities

def utils = new jobs.Utilities()

def myJob = job('example')
Utilities.addMyFeature(myJob)


def message = "Hello World from Don!"
Utilities.loggit(message)