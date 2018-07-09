/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/Utilities.groovy
 */

package jobs
import hudson.model.*

class Utilities {
    static void addMyFeature(def job) {
        job.with {
            description('Arbitrary feature')
        }
        
    }

    Script script
    public void a() {
        script.echo("Hello")
    }
}