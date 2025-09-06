package retrofit2;

import okhttp3.MediaType;
import okhttp3.ResponseBody;
import okio.BufferedSource;

public final class r extends ResponseBody {
    public final MediaType b;
    public final long c;

    public r(MediaType mediaType0, long v) {
        this.b = mediaType0;
        this.c = v;
    }

    @Override  // okhttp3.ResponseBody
    public final long contentLength() {
        return this.c;
    }

    @Override  // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.b;
    }

    @Override  // okhttp3.ResponseBody
    public final BufferedSource source() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}

