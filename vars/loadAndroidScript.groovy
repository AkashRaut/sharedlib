def call(Map config = [:]) { 
  def request = libraryResource "android/${config.name}" 
  writeFile file: "${config.name}", text: scriptcontents 
  sh "chmod a+x ./${config.name}"
} 
