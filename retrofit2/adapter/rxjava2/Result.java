package retrofit2.adapter.rxjava2;

import javax.annotation.Nullable;
import retrofit2.Response;

public final class Result {
    public final Response a;
    public final Throwable b;

    public Result(Response response0, Throwable throwable0) {
        this.a = response0;
        this.b = throwable0;
    }

    public static Result error(Throwable throwable0) {
        if(throwable0 == null) {
            throw new NullPointerException("error == null");
        }
        return new Result(null, throwable0);
    }

    @Nullable
    public Throwable error() {
        return this.b;
    }

    public boolean isError() {
        return this.b != null;
    }

    public static Result response(Response response0) {
        if(response0 == null) {
            throw new NullPointerException("response == null");
        }
        return new Result(response0, null);
    }

    @Nullable
    public Response response() {
        return this.a;
    }
}

