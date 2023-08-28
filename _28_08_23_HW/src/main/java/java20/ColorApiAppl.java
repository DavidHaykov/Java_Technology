package java20;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

public class ColorApiAppl {
    public static void main(String[] args) {
        String endpoint_url = "https://api.imagga.com/v2/colors?image_url=";
        String image_url = "https://krasivosti.pro/uploads/posts/2022-08/1660764625_27-krasivosti-pro-p-rigayushchii-kot-krasivo-foto-32.jpg";
        RestTemplate rest = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Authorization", "Basic YWNjX2M3M2QzMTM5MTRhZWFjYjo5YjFmODc4MDY2MzMxZTRiNDljZmExMjhjZDJjMWNhNg==");
        HttpEntity<Void> request = new HttpEntity<>(headers);
        ResponseEntity<ColorResponse> response = rest.exchange(endpoint_url + image_url, HttpMethod.GET, request, ColorResponse.class);
        ColorResponse body = response.getBody();
        if (body.status.type.equals("success")) {
            System.out.println("Background colors:\n");
            Arrays.stream(body.result.colors.background_colors).forEach(System.out::println);
            System.out.println("===============================\n");
            System.out.println("Foreground colors:\n");
            Arrays.stream(body.result.colors.foreground_colors).forEach(System.out::println);
            System.out.println("===============================\n");
            System.out.println("Image colors:\n");
            Arrays.stream(body.result.colors.image_colors).forEach(System.out::println);
        }

    }
}