package restApi;

import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.containsString;

public class restTest {

    @Test
    public void testStatusCode(){
        given().
            get("https://www.wallpics.com").
        then().
            assertThat().
            statusCode(200).
            log().status();
    }

    @Test
    public void testOrderWallpicsExist(){
        given().
            get("https://www.wallpics.com").
        then().
            assertThat().
            body(containsString("Get Started")).log().all();
    }
}
