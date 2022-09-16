import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Yunir Yuliakshin
 */
public class Main {

    private static final String APP_NAME = "Currency Converter";
    private static final String ERROR_MESSAGE = "Произошла ошибка ";
    private static final String EXIT_MESSAGE = "Чтобы выйти из программы введите 0\n" +
            "Для еще одной конвертации введите 10";
    private static final String CHOICE_MESSAGE = "Что Вы хотите сделать - купить или продать? \n" +
            "Чтобы купить введите 8, а чтобы продать введите 9";
    private static final String WRONG_ERROR = "Вы ввели неправильное значение.";
    private static final String INPUT_MESSAGE = "Введите сумму";

    private static Database database;
    private static BufferedReader reader;
    private static CurrencyPair currencyPair;
    private static String input;

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        database = new Database();
        System.out.println(APP_NAME);
        try {
            askForInput();
        } catch (Exception e) {
            System.out.println(ERROR_MESSAGE + e.getMessage());
        }
    }

    private static void askForInput() throws Exception {
        printDatabase();
        while (true) {
            if ((input = reader.readLine()).equals("0"))
                break;

            int id = Integer.parseInt(input);
            if (id == 10) {
                askForInput();
            }
            boolean found = false;
            for (CurrencyPair pair : database.getCurrencyPairList()) {
                if (id == pair.getId()) {
                    currencyPair = pair;
                    System.out.println(CHOICE_MESSAGE);
                    getAnswerAboutAction();
                    found = true;
                    break;
                }
            }
            if (!found) {
                System.out.println(WRONG_ERROR);
                askForInput();
            }
        }
    }

    private static void printDatabase() {
        for (CurrencyPair currencyPair : database.getCurrencyPairList()) {
            System.out.println(currencyPair.toString());
        }
    }

    private static void getAnswerAboutAction() throws Exception {
        while (true) {
            int actionInput = Integer.parseInt(reader.readLine());
            if (actionInput == 8) {
                makeOperation(currencyPair.getAsk());
                break;
            } else if (actionInput == 9) {
                makeOperation(currencyPair.getBid());
                break;
            } else {
                System.out.println(WRONG_ERROR);
            }
        }
    }

    private static void makeOperation(double price) throws Exception {
        double moneyInput = getMoneyInput();
        System.out.println("Вы преобрели " + Utils.getCount(moneyInput, price) + " единиц");
        System.out.println(EXIT_MESSAGE);
    }

    private static double getMoneyInput() throws Exception {
        System.out.println(INPUT_MESSAGE);
        return Double.parseDouble(reader.readLine());
    }
}