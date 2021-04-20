def logger(String str, String level)
{
   if (level == "ALERT")
   {
        
            echo '\033[32m' + str // Green
        
   }
   else if (level == "BOLD")
   {
       
           echo '\033[1;31m' + str // Green
        
   }
}

def loadColors() {
	RED='\033[0;31m'
	BLUE='\033[0;34m'
	CYAN='\033[0;36m'
	GREEN='\033[0;32m'
	PURPLE='\033[0;35m'
	ON_YELLOW='\033[0;43m'
	NC='\033[0;0m'
}

def printMsg(String message, String level, String color) {
	loadColors()
	echo color + level +' - '+message + NC
}

def debug(String message) {
	loadColors()

	printMsg(message, "DEBUG", BLUE)
}

def info(String message) {
	loadColors()

	printMsg(message, "INFO", "$CYAN")
}

def warn(String message) {
	loadColors()

	printMsg(message, "WARN", "$ON_YELLOW")
}

def error(String message) {
	loadColors()

	printMsg(message, "ERROR", "$RED")
}

def printRedMsg(String msg) {
	loadColors()
	echo RED + msg + NC
}

def printGreenMsg(String msg) {
	loadColors()
	echo GREEN + msg + NC
}

def printBlueMsg(String msg) {
	loadColors()
	echo BLUE + msg + NC
}

def printCyanMsg(String msg) {
	loadColors()
	echo CYAN + msg + NC
}

def printPurpleMsg(String msg) {
	loadColors()
	echo PURPLE + msg + NC
}
