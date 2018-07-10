/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/Utilities.groovy
 */

package jobs
import hudson.model.*

class Utilities {
    static void addMyCredentials(def job) {
        job.with {
            description('This step should create the credentials based on the environment.')
            pipelineScript('/scripts/outputArtifacts.groovy')
        }
        
    }

    Script script
    public void a() {
        script.echo("Hello")
    }
}