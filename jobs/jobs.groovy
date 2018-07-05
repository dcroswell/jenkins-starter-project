import jenkins.automation.builders.*
import utilities.MyUtilities

def myJob = job('example')
MyUtilities.addMyFeature(myJob)

def out
def config = new HashMap()
def bindings = getBinding()
config.putAll(bindings.getVariables())
out = config['out']
out.println "Printed do Jenkins console."