public class DemoCheckException {

    public static void main(String[] args) {
        // Checked exception = compilor requires the exception to be handled during
        // the compile time
        // 1. if you throw an unchecked exception, you have to handle it by two ways:
        // 1a) Sign the unchecked exception in the method signature
        //isEmailValid("xxxxxxxxxxxxxx@gmail.com"); // The method called still need to handle the unchecked exception even
                                                  // though the method throws already.
        // 1b) try-catch to handle
        try {
            isEmailValid("xxxxxxxxxxxxxx@gmail.com");
        } catch (BusinessException e) {
            // You can do anything after you catched it, or do nothing.
            System.out.println(e.getMessage());
        }
    }

    public static boolean isEmailValid(String emailaddr) throws BusinessException {
        // Check length
        if (emailaddr == null || emailaddr.length() > 100) {
            // return false;
            throw new BusinessException("Email address is too long. The length should be <= 100.");
        }
        // Once all passed
        return true;

    }

    public static boolean isEmailValid2(String emailaddr) throws BusinessException {
        // Check length
        if (emailaddr != null && emailaddr.length() == 8) {
            return true;
        }
        if (emailaddr == null || emailaddr.length() > 8) {
            return false;

        }
        // All other cases
        throw new BusinessException("");

    }
}
