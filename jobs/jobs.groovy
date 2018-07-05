import jenkins.automation.builders.*
import utilities.MyUtilities

def myJob = job('example')
MyUtilities.addMyFeature(myJob)


def message = "SOME VERY USEFUL INFORMATION"
MyUtilities.logInfo(message)