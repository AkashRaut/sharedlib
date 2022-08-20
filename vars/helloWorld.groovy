def call(Map config = [:]) {
    loadAndroidScript(name: 'hi.sh')
    sh "./hi.sh"
}
