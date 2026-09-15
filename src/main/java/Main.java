import io.javalin.Javalin;

public class Main {

    public static void main(String[] args) {

        var app = Javalin.create(config -> {
            config.routes.get("/", ctx -> ctx.result("Hej verden"));
            config.routes.get("/hello", ctx -> ctx.result("Hello!"));
            config.routes.get("/about", ctx -> ctx.result("Hej Webserver"));
            config.routes.get("/contact", ctx -> ctx.result("Kontakt webserver"));
        }).start(7070);
    }



}