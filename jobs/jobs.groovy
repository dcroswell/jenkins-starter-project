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