

job('My Tools Build') {
    scm{
        github 'https://github.com/pyxius/myAkka.git'
    }
    triggers{
        scm 'H/5 * * * *'
    }
}
