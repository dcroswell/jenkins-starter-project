/**
 * Created by muchniki on 1/12/16.
 */
 
package au.com.sportsbet.jenkins

import jenkins.automation.builders.*
import au.com.sportsbet.jenkins.Utilities

def utils = new au.com.sportsbet.jenkins.Utilities()

def myJob = job('example')
Utilities.addMyFeature(myJob)


def message = "Hello World from Don!"
Utilities.loggit(message)