public class Main {
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserController controller = new UserController(model, view);

        // Atualizar as informações do usuário
        controller.updateUserInfo("João", 30);

        // Exibir as informações do usuário
        controller.displayUserInfo();

        // Saída:
        // Name: João
        // Age: 30
    }
}
