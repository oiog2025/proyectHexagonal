package co.com.oospina.userhexagonalservice.infrastructure.adapter;

import co.com.oospina.userhexagonalservice.application.dto.users.PostDto;
import co.com.oospina.userhexagonalservice.application.dto.users.UsersPostDto;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersPostOutput;
import java.util.List;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@AllArgsConstructor
public class UsersAdapter implements IGetUsersPostOutput {

  private final RestTemplate restTemplate;
  private final String url = "https://jsonplaceholder.typicode.com/posts?userId=1";

  @Override
  public UsersPostDto getUsersPost(Integer id) {
    UsersPostDto usersPostDto = new UsersPostDto();

    ParameterizedTypeReference<List<PostDto>> responseType = new ParameterizedTypeReference<>() {};
    ResponseEntity<List<PostDto>> response =
        restTemplate.exchange(url, HttpMethod.GET, null, responseType);
    usersPostDto.setPosts(response.getBody());
    return usersPostDto;
  }
}
