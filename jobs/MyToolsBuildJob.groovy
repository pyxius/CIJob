
job('My Tools Build') {
    scm{
        github 'pyxius/my-tools'
    }
    triggers{
        scm 'H/5 * * * *'
    }
}
