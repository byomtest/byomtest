public class Application {

    public static void main(String[] args) {
        spark.Spark.port(4567);

        spark.Spark.get("/", (req, res) -> "Hello world!!!");
    }
}
