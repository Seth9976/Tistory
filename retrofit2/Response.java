package retrofit2;

import java.util.Objects;
import javax.annotation.Nullable;
import okhttp3.Headers;
import okhttp3.Protocol;
import okhttp3.Response.Builder;
import okhttp3.ResponseBody;

public final class Response {
    public final okhttp3.Response a;
    public final Object b;
    public final ResponseBody c;

    public Response(okhttp3.Response response0, Object object0, ResponseBody responseBody0) {
        this.a = response0;
        this.b = object0;
        this.c = responseBody0;
    }

    @Nullable
    public Object body() {
        return this.b;
    }

    public int code() {
        return this.a.code();
    }

    public static Response error(int v, ResponseBody responseBody0) {
        Objects.requireNonNull(responseBody0, "body == null");
        if(v < 400) {
            throw new IllegalArgumentException("code < 400: " + v);
        }
        return Response.error(responseBody0, new Builder().body(new r(responseBody0.contentType(), responseBody0.contentLength())).code(v).message("Response.error()").protocol(Protocol.HTTP_1_1).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static Response error(ResponseBody responseBody0, okhttp3.Response response0) {
        Objects.requireNonNull(responseBody0, "body == null");
        Objects.requireNonNull(response0, "rawResponse == null");
        if(response0.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse should not be successful response");
        }
        return new Response(response0, null, responseBody0);
    }

    @Nullable
    public ResponseBody errorBody() {
        return this.c;
    }

    public Headers headers() {
        return this.a.headers();
    }

    public boolean isSuccessful() {
        return this.a.isSuccessful();
    }

    public String message() {
        return this.a.message();
    }

    public okhttp3.Response raw() {
        return this.a;
    }

    public static Response success(int v, @Nullable Object object0) {
        if(v < 200 || v >= 300) {
            throw new IllegalArgumentException("code < 200 or >= 300: " + v);
        }
        return Response.success(object0, new Builder().code(v).message("Response.success()").protocol(Protocol.HTTP_1_1).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static Response success(@Nullable Object object0) {
        return Response.success(object0, new Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static Response success(@Nullable Object object0, Headers headers0) {
        Objects.requireNonNull(headers0, "headers == null");
        return Response.success(object0, new Builder().code(200).message("OK").protocol(Protocol.HTTP_1_1).headers(headers0).request(new okhttp3.Request.Builder().url("http://localhost/").build()).build());
    }

    public static Response success(@Nullable Object object0, okhttp3.Response response0) {
        Objects.requireNonNull(response0, "rawResponse == null");
        if(!response0.isSuccessful()) {
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        return new Response(response0, object0, null);
    }

    @Override
    public String toString() {
        return this.a.toString();
    }
}

