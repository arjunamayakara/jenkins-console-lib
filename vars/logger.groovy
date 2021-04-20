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

def printPurpleMsg(String msg) {
	loadColors()
	echo -e "${PURPLE}$msg${NC}"
}
