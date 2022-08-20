def call() {
    loadAndroidScript(name: 'hi.sh')
    sh "./hello-world.sh"
}
