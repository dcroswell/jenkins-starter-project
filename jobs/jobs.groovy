import jenkins.automation.builders.*
import utilities.MyUtilities

def myJob = job('example')
MyUtilities.addMyFeature(myJob)