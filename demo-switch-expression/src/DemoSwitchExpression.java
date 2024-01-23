public class DemoSwitchExpression {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }

    //Java 14: Switch Expression
    //1. Return Type
    //2. No break;
    //3. Similar to Lambda expression
    //4. Compiler help ensure all enum value has been catered, any missing or diplicated case will result in compile error

    public static int getCurrencyCode2(Currency currency) {
        int code = -1;
        return switch (currency) {
            case HKD -> 1;
            case USD -> 2;
            case CNY -> 3;
        };
    }

    public static int getCurrencyCode3(Currency currency) {
        int code = -1;
        return switch (currency) {
            case HKD -> {
                String x = "";
                if(x.isEmpty())
                    yield 10;
                yield 1;
            }
            case USD -> 2;
            case CNY -> 3;
        };
    }

    public static int getCurrencyCode3(String day) {
        int code = -1;
        return switch (day) {
            case "Monday" -> {
                String x = "";
                if(x.isEmpty())
                    yield 10;
                yield 1;
            }
            case "Tuesday" -> 2;
            case "Wednesday" -> 3;
            default -> {
                yield 30;
            }
        };
    }

    //Normal Switch statement
    //No return type
    public static int getCurrencyCode(Currency currency) {
        int code = -1;
        switch (currency) {
            case HKD:
                code = 1;
                break;
            case USD:
                code = 2;
                break;
            case CNY:
                code = 3;
                break;

            default:
                break;
        }
        return code;
    }
}
