package check.management.system.isra.osman.service;

import check.management.system.isra.osman.entity.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}