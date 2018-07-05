import jenkins.automation.builders.*
import utilities.MyUtilities

def myJob = job('example')
MyUtilities.addMyFeature(myJob)

def out = new MyUtilities.Output()
out.info("SOME VERY USEFUL INFORMATION")