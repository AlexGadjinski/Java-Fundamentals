import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        // judge e totalno schypen i dava tova: -.032 kato floating number
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("END")) {
                return;
            }
            if (input.equals("true") || input.equals("false")) {
                System.out.println(input + " is boolean type");
            } else if (input.length() == 1) {
                if (input.charAt(0) > 47 && input.charAt(0) < 58) {
                    System.out.println(input + " is integer type");
                } else {
                    System.out.println(input + " is character type");
                }
            } else {
                boolean isWithFloatingPoint = false;
                boolean isString = false;
                boolean isMinus = false;
                for (int i = 0; i < input.length(); i++) {
                    if (input.charAt(i) == 48 && input.charAt(i+1) > 48 && input.charAt(i+1) < 58 && !isWithFloatingPoint) {
                        isString = true;
                        break;
                    }
                    if (input.charAt(i) == 45) {
                        if (isMinus) {
                            isString = true;
                            break;
                        }
                        if (i == 0) {
                            isMinus = true;
                        } else {
                            isString = true;
                            break;
                        }
                    }
                    if ((input.charAt(i) < 48 || input.charAt(i) > 57) && input.charAt(i) != 46 && input.charAt(i) != 45) {
                        isString = true;
                        break;
                    } else if (input.charAt(i) == 46) {
                        if (isWithFloatingPoint) {
                            isString = true;
                            break;
                        }
                        if (i != 0 && i != input.length()-1) {
                            if (isMinus && i == 1) {
                                isString = true;
                                break;
                            }
                            isWithFloatingPoint = true;
                        } else {
                            isString = true;
                        }
                    }
                }
                if (isString) {
                    System.out.println(input + " is string type");
                } else if (isWithFloatingPoint) {
                    System.out.println(input + " is floating point type");
                } else {
                    System.out.println(input + " is integer type");
                }
            }
        }


      /*
                while (!input.equals("END")) {
                    String type = "";
                    //проверка за типовете
                    //boolean
                    if(input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false")) {
                        type = "boolean";
                    }
                    //character
                    else if(input.length() == 1) {
                        char symbol = input.charAt(0);
                        //символ
                        if(symbol < 47 || symbol > 58) {
                            type = "character";
                        }
                        //едноцифрено цяло число
                        else {
                            type = "integer";
                        }
                    } else { //string, floating point, integer
                        boolean isString  = false;
                        boolean isFloat = false;
                        for (int i = 0; i < input.length(); i++) {
                            char currentSymbol = input.charAt(i);
                            //проверка дали е символ
                            if(currentSymbol < 45 || currentSymbol > 57) {
                                isString = true;
                            }

                            if(currentSymbol == 46) {
                                isFloat = true;
                            }
                        }
                        if(isString) {
                            type = "string";
                        } else {
                            //число
                            if(isFloat) {
                                type = "floating point";
                            } else {
                                type = "integer";
                            }

                        }
                    }
                    System.out.printf("%s is %s type%n", input, type);
                    input = scanner.nextLine();
                }
            }
        } */

    }
}
