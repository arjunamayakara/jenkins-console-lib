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
