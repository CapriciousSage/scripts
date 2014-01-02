// Required for FileBot context menu.
// You MUST change the starting path below (unless your NAS is literally called mynas)
// Renaming scheme is called directly from GitHub Repo. To use your own, comment that line, and uncomment/edit the line below it.

def input  = args[0].isDirectory() ? args[0].listFiles() : args[0]
def format = '''//mynas/media/TV Shows/''' + new URL('https://raw.github.com/CapriciousSage/schemes/master/tv_shows.txt').getText()
// def format = '''//mynas/media/TV Shows/''' + new File('C:\\Program Files\\FileBot\\cmdlets\\tv_shows.txt').getText()

rename(file:input, format:format)