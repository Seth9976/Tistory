package retrofit2;

import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

public final class f0 extends RequestBody {
    public final RequestBody d;
    public final MediaType e;

    public f0(RequestBody requestBody0, MediaType mediaType0) {
        this.d = requestBody0;
        this.e = mediaType0;
    }

    @Override  // okhttp3.RequestBody
    public final long contentLength() {
        return this.d.contentLength();
    }

    @Override  // okhttp3.RequestBody
    public final MediaType contentType() {
        return this.e;
    }

    @Override  // okhttp3.RequestBody
    public final void writeTo(BufferedSink bufferedSink0) {
        this.d.writeTo(bufferedSink0);
    }
}

