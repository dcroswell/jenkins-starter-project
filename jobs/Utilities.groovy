/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/Utilities.groovy
 */

package jobs

class Utilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
        
    }

    static loggit(def msg) {        
        def out
        def config = new HashMap()
        def bindings = groovy.lang.getBinding()
        config.putAll(bindings.getVariables())
        out = config['out']
        out.println "Hello World from message"
    }
}