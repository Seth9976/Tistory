package retrofit2;

import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;
import okio.Okio;
import q5.a;

public final class q extends ResponseBody {
    public final ResponseBody b;
    public final BufferedSource c;
    public IOException d;

    public q(ResponseBody responseBody0) {
        this.b = responseBody0;
        this.c = Okio.buffer(new a(this, responseBody0.source()));
    }

    @Override  // okhttp3.ResponseBody
    public final void close() {
        this.b.close();
    }

    @Override  // okhttp3.ResponseBody
    public final long contentLength() {
        return this.b.contentLength();
    }

    @Override  // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.b.contentType();
    }

    @Override  // okhttp3.ResponseBody
    public final BufferedSource source() {
        return this.c;
    }
}

