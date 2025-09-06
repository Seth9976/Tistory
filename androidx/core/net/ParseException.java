package androidx.core.net;

import androidx.annotation.NonNull;

public class ParseException extends RuntimeException {
    @NonNull
    public final String response;

    public ParseException() {
        super("Not a mailto scheme");
        this.response = "Not a mailto scheme";
    }
}

