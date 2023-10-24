public class UserController {
    private UserModel model;
    private UserView view;

    public UserController(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void updateUserInfo(String name, int age) {
        model.setName(name);
        model.setAge(age);
    }

    public void displayUserInfo() {
        view.displayUserDetails(model.getName(), model.getAge());
    }
}
