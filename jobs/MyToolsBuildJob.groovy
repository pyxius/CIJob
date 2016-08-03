
job('my-tools-Build') {
    scm{
        github 'pyxius/my-tools'
    }
    triggers{
        scm 'H/5 * * * *'
    }
    steps {
        shell 'sbt clean compile package'
    }
}
