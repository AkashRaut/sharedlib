def call() {
    loadAndroidScript(name: 'hi.sh')
    sh "./hi.sh"
}
