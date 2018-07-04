def signature = 'new groovy.json.JsonSlurperClassic'
org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().approveSignature(signature)

scm {
        github('dcroswell/jenkins-starter-project', 'master')
    }
    triggers {
        cron("@hourly")
    }
    steps {
        shell("echo 'Hello World'")
    }
}