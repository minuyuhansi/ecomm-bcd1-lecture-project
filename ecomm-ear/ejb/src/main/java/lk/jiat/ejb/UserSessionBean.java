package lk.jiat.ejb;

import jakarta.ejb.Stateless;
import lk.jiat.core.dto.UserDTO;
import lk.jiat.core.service.UserService;

import java.util.List;

@Stateless
public class UserSessionBean implements UserService {
    @Override
    public UserDTO getUserById(Long id) {
        System.out.println("getUserById");
        return null;
    }

    @Override
    public void addUser(UserDTO user) {
        System.out.println("addUser");

    }

    @Override
    public void updateUser(UserDTO user) {
        System.out.println("updateUser");
    }

    @Override
    public void deleteUser(Long id) {
        System.out.println("deleteUser");
    }

    @Override
    public List<UserDTO> getAllUsers() {
        return List.of();
    }
}
