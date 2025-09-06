package coil.network;

import coil.util.-Utils;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import md.c;
import okhttp3.CacheControl;
import okhttp3.Headers.Builder;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.Response;
import okio.BufferedSink;
import okio.BufferedSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w5.a;
import w5.b;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\rR\u001B\u0010\u0013\u001A\u00020\u000E8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001D\u0010\u0018\u001A\u0004\u0018\u00010\u00148FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001A\u0004\b\u0016\u0010\u0017R\u0017\u0010\u001E\u001A\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u001DR\u0017\u0010!\u001A\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001B\u001A\u0004\b \u0010\u001DR\u0017\u0010%\u001A\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001A\u0004\b%\u0010&R\u0017\u0010,\u001A\u00020\'8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+¨\u0006-"}, d2 = {"Lcoil/network/CacheResponse;", "", "Lokio/BufferedSource;", "source", "<init>", "(Lokio/BufferedSource;)V", "Lokhttp3/Response;", "response", "(Lokhttp3/Response;)V", "Lokio/BufferedSink;", "sink", "", "writeTo", "(Lokio/BufferedSink;)V", "Lokhttp3/CacheControl;", "a", "Lkotlin/Lazy;", "getCacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "Lokhttp3/MediaType;", "b", "getContentType", "()Lokhttp3/MediaType;", "contentType", "", "c", "J", "getSentRequestAtMillis", "()J", "sentRequestAtMillis", "d", "getReceivedResponseAtMillis", "receivedResponseAtMillis", "", "e", "Z", "isTls", "()Z", "Lokhttp3/Headers;", "f", "Lokhttp3/Headers;", "getResponseHeaders", "()Lokhttp3/Headers;", "responseHeaders", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CacheResponse {
    public final Lazy a;
    public final Lazy b;
    public final long c;
    public final long d;
    public final boolean e;
    public final Headers f;

    public CacheResponse(@NotNull Response response0) {
        a a0 = new a(this);
        this.a = c.lazy(LazyThreadSafetyMode.NONE, a0);
        b b0 = new b(this);
        this.b = c.lazy(LazyThreadSafetyMode.NONE, b0);
        this.c = response0.sentRequestAtMillis();
        this.d = response0.receivedResponseAtMillis();
        this.e = response0.handshake() != null;
        this.f = response0.headers();
    }

    public CacheResponse(@NotNull BufferedSource bufferedSource0) {
        a a0 = new a(this);
        this.a = c.lazy(LazyThreadSafetyMode.NONE, a0);
        b b0 = new b(this);
        this.b = c.lazy(LazyThreadSafetyMode.NONE, b0);
        this.c = Long.parseLong(bufferedSource0.readUtf8LineStrict());
        this.d = Long.parseLong(bufferedSource0.readUtf8LineStrict());
        this.e = Integer.parseInt(bufferedSource0.readUtf8LineStrict()) > 0;
        int v1 = Integer.parseInt(bufferedSource0.readUtf8LineStrict());
        Builder headers$Builder0 = new Builder();
        for(int v = 0; v < v1; ++v) {
            -Utils.addUnsafeNonAscii(headers$Builder0, bufferedSource0.readUtf8LineStrict());
        }
        this.f = headers$Builder0.build();
    }

    @NotNull
    public final CacheControl getCacheControl() {
        return (CacheControl)this.a.getValue();
    }

    @Nullable
    public final MediaType getContentType() {
        return (MediaType)this.b.getValue();
    }

    public final long getReceivedResponseAtMillis() {
        return this.d;
    }

    @NotNull
    public final Headers getResponseHeaders() {
        return this.f;
    }

    public final long getSentRequestAtMillis() {
        return this.c;
    }

    public final boolean isTls() {
        return this.e;
    }

    public final void writeTo(@NotNull BufferedSink bufferedSink0) {
        bufferedSink0.writeDecimalLong(this.c).writeByte(10);
        bufferedSink0.writeDecimalLong(this.d).writeByte(10);
        bufferedSink0.writeDecimalLong((this.e ? 1L : 0L)).writeByte(10);
        Headers headers0 = this.f;
        bufferedSink0.writeDecimalLong(((long)headers0.size())).writeByte(10);
        int v = headers0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            bufferedSink0.writeUtf8(headers0.name(v1)).writeUtf8(": ").writeUtf8(headers0.value(v1)).writeByte(10);
        }
    }
}

