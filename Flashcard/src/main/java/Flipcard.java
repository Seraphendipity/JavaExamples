import 
/**
 * Hello world!
 *
 */
public class Flipcard 
{

        public appSession() {
            String option;
            while (bContinue) {}
            switch(option) {
                case "study":
                    bContinue = studySession();
                    break;
                case "e":
                case "exit":
                    break;
                default:
                    menuOptions();
            }


        }

        public Boolean studySession() {
            String option;
            Boolean bContinue = true;
            Boolean bContinueApp = true;
            while (bContinue) {
                switch(option) {
                    case "flip":
                        bKnow = 0;
                        break;
                    case "k":
                    case "y":
                    case "yes":
                    case "b":
                    case "know":
                        bKnow = 1;
                        break;
                    case "c":
                    case "n":
                    case "no":
                    case "idk":
                        bKnow = 0;
                        break;
                    case "done":
                    case "finish":
                    case "end":
                        bContinue = 0;
                        break;
                    case "e":
                    case "exit":
                        bContinueApp = 0;
                        break;
                    }
                }
                return bContinueAll;
            }
    
    
    

}
