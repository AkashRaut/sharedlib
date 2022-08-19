def call() {
    loadLinuxScript(name: 'hi.sh')
    sh "./hi.sh"
}
