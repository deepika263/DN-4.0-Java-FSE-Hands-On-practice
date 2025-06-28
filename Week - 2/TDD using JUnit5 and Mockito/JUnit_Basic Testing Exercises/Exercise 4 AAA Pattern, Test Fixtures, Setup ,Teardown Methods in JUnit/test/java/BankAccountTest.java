import org.junit.*;
import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount account;
    private static int testCount = 0;

    // Setup method runs BEFORE EACH test
    @Before
    public void setUp() {
        System.out.println("Setting up test...");
        account = new BankAccount(100.00); // Initial balance $100
    }

    // Teardown method runs AFTER EACH test
    @After
    public void tearDown() {
        System.out.println("Test completed. Cleaning up...");
        testCount++;
        System.out.println("Tests run so far: " + testCount);
    }

    // Class-level setup (runs once)
    @BeforeClass
    public static void classSetup() {
        System.out.println("Starting test suite...");
    }

    // Class-level teardown (runs once)
    @AfterClass
    public static void classTeardown() {
        System.out.println("All tests completed!");
    }

    @Test
    public void testDeposit() {
        // Arrange
        double initialBalance = account.getBalance();
        double depositAmount = 50.00;

        // Act
        account.deposit(depositAmount);

        // Assert
        assertEquals(initialBalance + depositAmount, account.getBalance(), 0.001);
    }

    @Test
    public void testWithdraw() throws InsufficientFundsException {
        // Arrange
        double initialBalance = account.getBalance();
        double withdrawAmount = 30.00;

        // Act
        account.withdraw(withdrawAmount);

        // Assert
        assertEquals(initialBalance - withdrawAmount, account.getBalance(), 0.001);
    }

    @Test(expected = InsufficientFundsException.class)
    public void testWithdrawMoreThanBalance() throws InsufficientFundsException {
        // Arrange
        double withdrawAmount = 150.00;

        // Act & Assert (in one step for exception testing)
        account.withdraw(withdrawAmount);
    }
}