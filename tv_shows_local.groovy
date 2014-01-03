// Required for FileBot context menu.
// Renaming scheme is called directly from GitHub Repo. To use your own, comment that line, and uncomment/edit the line below it.
// See output.txt for instructions on setting output path.

myFile = new File("C:\\Program Files\\FileBot\\cmdlets\\output.txt")

def input  = args[0].isDirectory() ? args[0].listFiles() : args[0]
// def format = new URL('https://raw.github.com/CapriciousSage/schemes/master/tv_shows.txt').getText()
def format = new File('C:\\Program Files\\FileBot\\cmdlets\\tv_shows.txt').getText()

def output = myFile.readLines().get(1)

rename(file:input, format:format, output:output)