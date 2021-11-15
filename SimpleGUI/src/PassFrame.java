import java.util.Scanner;

public class PassFrame {

		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		public PassFrame() {
			 super();
		}
		
		public static void main(String[] args) {
			
		PassFrame passwordValidator = new PassFrame();
		  String userName = "ABC";
		String passWord = "wsi";
		System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
		
		
		passwordValidator.passFrame(userName,passWord);
        System.out.println();
        passWord = "2011";
        System.out.println("Input : UserName "+userName+" PassWord -> "+passWord);
        passwordValidator.passFrame(userName,passWord);

	}

        private void passFrame(String userName, String passWord) {
			// TODO Auto-generated method stub
			
		}

		public void passwordValidation(String userName, String password)
        {
                boolean valid = true;
                if (password.length() > 15 || password.length() < 8)
                {
                        System.out.println("Password should be less than 15 and more than 8 characters in length.");
                        valid = false;
                }
                if (password.indexOf(userName) > -1)
                {
                        System.out.println("Password Should not be same as user name");
                        valid = false;
                }
                String upperCaseChars = "(.*[A-Z].*)";
                if (!password.matches(upperCaseChars ))
                {
                        System.out.println("Password should contain atleast one upper case alphabet");
                        valid = false;
    }
    String lowerCaseChars = "(.*[a-z].*)";
    if (!password.matches(lowerCaseChars ))
    {
            System.out.println("Password should contain atleast one lower case alphabet");
            valid = false;
    }
    String numbers = "(.*[0-9].*)";
    if (!password.matches(numbers ))
    {
            System.out.println("Password should contain atleast one number.");
            valid = false;
    }
    String specialChars = "(.*[,~,!,@,#,$,%,^,&,*,(,),-,_,=,+,[,{,],},|,;,:,<,>,/,?].*$)";
    if (!password.matches(specialChars ))
    {
            System.out.println("Password should contain atleast one special character");
            valid = false;
    }
    if (valid)
    {
            System.out.println("Password is valid.");
    }
		
	}

}
