def call(Map config = [:]) { 
  def scriptcontents = libraryResource "android/${config.name}"    
} 
