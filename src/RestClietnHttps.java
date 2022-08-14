import java.net.Authenticator;
import java.net.InetSocketAddress;
import java.net.ProxySelector;
import java.net.http.HttpClient;
import java.time.Duration;

public class RestClietnHttps {

    public static void main(String[] args) {

        HttpClient httpClient =
                HttpClient.newBuilder()
                        .version(HttpClient.Version.HTTP_2)
                        .followRedirects(HttpClient.Redirect.NORMAL)
                        .connectTimeout(Duration.ofSeconds(10))
                        .proxy(ProxySelector.of(new InetSocketAddress("https://jsonplaceholder.typicode.com/users", 80)))
                        //.authenticator(Authenticator.getDefault())
                        .build();
        System.out.println(httpClient.toString());
    }
}
