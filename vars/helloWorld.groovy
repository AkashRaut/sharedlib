def call(Map config = [:]) {
    loadIosScript(name: 'hi.sh')
    sh "./hi.sh"
}
