/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/Utilities.groovy
 */

package jobs
import hudson.model.*

class Utilities {
    // Get the out variable
    def out = getBinding().out;

    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
        
    }

    static void say(out) {
        out << "Hello World"
    }
}