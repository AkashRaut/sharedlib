def call() {
    loadAndroidScript(name: 'hi.sh')
    sh "bash hi.sh"
}
