package co.com.oospina.userhexagonalservice.application.dto.users;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;


@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class UsersPostDto {
   private UsersDto users;
    List<PostDto> posts;
}