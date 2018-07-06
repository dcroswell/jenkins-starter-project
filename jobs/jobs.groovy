import jenkins.automation.builders.*
import utilities.MyUtilities

def myJob = job('example')
MyUtilities.addMyFeature(myJob)


def message = "Hello World from Don!"
MyUtilities.loggit(message)