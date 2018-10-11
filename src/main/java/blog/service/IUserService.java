package blog.service;

public interface IUserService {
    public boolean createUser(String username, String password1, String password2);

    public boolean deleteUser(String username, String password);

    public boolean updateUser(String username, String password1, String password2);

    public boolean ensureUser(String username, String password);
}
