import jenkins.automation.builders.*
import au.com.sportsbet.jenkins

def utils = new au.com.sportsbet.jenkins.Utilities

def myJob = job('example')
Utilities.addMyFeature(myJob)


def message = "Hello World from Don!"
Utilities.loggit(message)