package am.cs322.Presentation;

import am.cs322.Presentation.model.CreateUserRequest;
import am.cs322.model.UserDTO;

public interface UserController {

    public UserDTO createUser(CreateUserRequest request);

}
