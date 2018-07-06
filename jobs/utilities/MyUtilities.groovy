package utilities

import java.util.logging.Logger

class MyUtilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
    }

    static loggit(def msg) {        
        def out
        def config = new HashMap()
        def bindings = getBinding()
        config.putAll(bindings.getVariables())
        out = config['out']
        out.println "Hello World from message"
    }
}