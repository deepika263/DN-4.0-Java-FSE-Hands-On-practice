import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;

public class MyServiceTest {
    @Test
    public void testVerifyInteraction() {
        // 1. Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // 2. Create service with mock dependency
        MyService service = new MyService(mockApi);

        // 3. Call the method under test
        service.fetchData();

        // 4. Verify the interaction
        verify(mockApi).getData();
    }
}