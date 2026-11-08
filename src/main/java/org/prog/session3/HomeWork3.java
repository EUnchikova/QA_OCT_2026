package org.prog.session3;

//TODO: email rules:
// - email must have only 1 @
// - before @ must be at least 3 symbols
// - after @ must be at least 5 symbols
// - after @ must be at least 1 dot (.)
// - dot may neve be first or last symbol

public class HomeWork3 {

    public static void main(String[] args) {
        String[] emails = {
                "john@mail.com",
                "jo@gmail.com",
                "peter@localhost",
                "alex.smith@company.net",
                "max@b@c.com",
                "bob@a.io",
                "anna@x.y.z",
                ".sara@mail.com",
                "kate.mail.com",
                "lee@ab.cd",
                "john.doe@server",
                "tom@mail.com.",
                "ann@site.org",
                "@mail.com",
                "first.last@my-server.com"};
        for (int i=0;i<emails.length;i++){
            int firstAt = emails[i].indexOf('@');
            if (firstAt != -1 && firstAt == emails[i].lastIndexOf('@')){
                int charsBefore = firstAt;
                int charsAfter = emails[i].length() - (firstAt + 1);
                int dotAfterAt = emails[i].lastIndexOf('.', firstAt + 1);
                if (charsBefore >= 3 && charsAfter >= 5 && dotAfterAt != -1 && !emails[i].startsWith(".") && !emails[i].endsWith(".")){
                System.out.println(emails[i]);
                 }
             }
        }
    }
}