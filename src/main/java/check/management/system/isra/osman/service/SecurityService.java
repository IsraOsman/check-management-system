package check.management.system.isra.osman.service;

public interface SecurityService {
	String findLoggedInUsername();
    void autoLogin(String username, String password);
}
