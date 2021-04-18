def logger(String str, String level)
{
   if (level == "ALERT")
   {
        ansiColor('xterm')
        {
            echo '\033[32m' + str // Green
        }
   }
   else if (level == "BOLD")
   {
        ansiColor('xterm')
        {
           echo '\033[1;31m' + str // Green
        }
   }
}