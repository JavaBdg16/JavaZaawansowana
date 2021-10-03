package exceptions;

public class Resource implements AutoCloseable {

    public Resource() {
        System.out.println("Resource created");
    }

    @Override
    public void close() throws Exception {
        System.out.println("Resource closed");
    }

    public static void main(String[] args) {

        try (Resource resource = new Resource()) {

            throw new Exception("jakiś błąd");

        } catch (Exception ex) {

            System.out.println(ex.getMessage());

        }

    }
}
