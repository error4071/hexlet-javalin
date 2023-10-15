package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main(String[] args) {
        var app = Javalin.create(config -> {
            config.plugins.enableDevLogging();
        });


        app.get("/users/{id}/post/{postId}", ctx -> {
            ctx.result("users" + ctx.pathParam("id"));
            ctx.result("post" + ctx.pathParam("postId"));
        });

        app.start(7070);
    }
}