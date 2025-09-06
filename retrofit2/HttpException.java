package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;

public class HttpException extends RuntimeException {
    public final int a;
    public final String b;
    public final transient Response c;

    public HttpException(Response response0) {
        Objects.requireNonNull(response0, "response == null");
        super("HTTP " + response0.code() + " " + response0.message());
        this.a = response0.code();
        this.b = response0.message();
        this.c = response0;
    }

    public int code() {
        return this.a;
    }

    public String message() {
        return this.b;
    }

    @Nullable
    public Response response() {
        return this.c;
    }
}

