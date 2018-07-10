/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/Utilities.groovy
 */

package jobs
import hudson.model.*

class Utilities {
    static void createPipeline(def pipeline) {
        pipeline.with {
            description('This step should build the pipeline based on the environment.')
            pipelineScript('/scripts/stages.groovy')
        }
        
    }

    Script script
    public void a() {
        script.echo("Hello")
    }
}