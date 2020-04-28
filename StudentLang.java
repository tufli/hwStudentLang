public class Main {

    public static void main(String[] args) {
	Human.sayHello(2);
	Student.sayHello(2);
	MasterStudent.sayHello(3);
	MasterStudent.whatMedals(5);
    }
}

class Human {
        static void sayHello(int lang){
switch (lang){
    case 1:
        System.out.println("Hi");
        break;
    case 2:
        System.out.println("Привет");
        break;
    case 3:
        System.out.println("Salut");
        break;
    default:
        System.out.println("Incorrect insert number");
     }
    }
   }

      class Student extends Human{
       static void sayHello(int langStudent) {
           switch (langStudent) {
               case 1:
                   System.out.println("I am a student");
                   break;
               case 2:
                   System.out.println("Я студетн");
                   break;
               case 3:
                   System.out.println("Je suis an student");
                   break;
               default:
                   System.out.println("Incorrect insert number");
           }
       }
       static void whereDoYouStydy(int langStudy){
           switch (langStudy) {
               case 1:
                   System.out.println("I study UTM");
                   break;
               case 2:
                   System.out.println("Я учусь в Политехе");
                   break;
               case 3:
                   System.out.println("Je suis a stundet au L'Universite ");
                   break;
               default:
                   System.out.println("Incorrect insert number");
           }
         }
        }

   class MasterStudent extends Student {
        static void whatMedals(int langMedal){
            switch (langMedal) {
                case 1:
                    System.out.println("I have a golden Medal");
                    break;
                case 2:
                    System.out.println("У меня золотая медаль");
                    break;
                case 3:
                    System.out.println("J'ai unne medalle de l'or");
                    break;
                default:
                    System.out.println("Incorrect insert number");
            }
        }
   }
