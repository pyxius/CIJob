
job('TestJob'){
    triggers{
        scm 'H/5 * * * *'
    }
    steps {
        gradle 'clean test'
    }
}