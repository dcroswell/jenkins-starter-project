/**
 * Created by Don Croswell on 9/07/2018.
 * Build the script with: groovyc ./jobs/Utilities.groovy
 */

package jobs
import hudson.model.*

class Utilities {
    def path = '/jobs/scripts/shared.services.groovy'
    def pipelineScript = readFileFromWorkspace(path)

    public void createPipeline(def pipeline) {
        pipeline.with {
            description('This step should build the pipeline based on the environment.')
            displayName('Job DSL Example Project')
            // definition() {
            //     cps {
            //         script(this.pipelineScript)
            //         sandbox()
            //     }
            // }
        }
        
    }

    Script script
    public void a() {
        script.echo("Hello")
    }
}