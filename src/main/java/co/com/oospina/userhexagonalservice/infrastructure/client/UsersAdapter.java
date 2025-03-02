package co.com.oospina.userhexagonalservice.infrastructure.client;

import co.com.oospina.userhexagonalservice.application.dto.users.UsersDto;
import co.com.oospina.userhexagonalservice.application.port.output.IGetUsersPostByIdOutput;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class UsersAdapter implements IGetUsersPostByIdOutput {

//  private final RestTemplate restTemplate;
  private final String url = "https://jsonplaceholder.typicode.com/posts?userId=1";

//  @Override
//  public UsersPostDto getUsersPost(Integer id) {
//    UsersPostDto usersPostDto = new UsersPostDto();
//
//    ParameterizedTypeReference<List<PostDto>> responseType = new ParameterizedTypeReference<>() {};
//    ResponseEntity<List<PostDto>> response =
//        restTemplate.exchange(url, HttpMethod.GET, null, responseType);
//    usersPostDto.setPosts(response.getBody());
//    return usersPostDto;
//  }

  @Override
  public UsersDto getAllUsersPostById(Integer id) {
    return null;
  }
}
