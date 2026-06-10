package lk.jiat.core.service;

import jakarta.ejb.Remote;
import lk.jiat.core.dto.UserDTO;

import java.util.List;

@Remote
public interface UserService {
    UserDTO getUserById(Long id);
    void addUser(UserDTO user);
    void updateUser(UserDTO user);
    void deleteUser(Long id);
    List<UserDTO> getAllUsers();
}
