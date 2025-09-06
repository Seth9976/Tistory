package retrofit2.adapter.rxjava2;

import retrofit2.Response;

@Deprecated
public final class HttpException extends retrofit2.HttpException {
    public HttpException(Response response0) {
        super(response0);
    }
}

