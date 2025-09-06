package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import lg.b;
import okhttp3.internal.http1.HeadersReader;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0003\u0014\u0015\u0016B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000F\u0010\f\u001A\u0004\u0018\u00010\u000B¢\u0006\u0004\b\f\u0010\rJ\u000F\u0010\u000F\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0005\u001A\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0005\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokhttp3/MultipartReader;", "Ljava/io/Closeable;", "Lokio/BufferedSource;", "source", "", "boundary", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "Lokhttp3/ResponseBody;", "response", "(Lokhttp3/ResponseBody;)V", "Lokhttp3/MultipartReader$Part;", "nextPart", "()Lokhttp3/MultipartReader$Part;", "", "close", "()V", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "Companion", "Part", "lg/b", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nMultipartReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultipartReader.kt\nokhttp3/MultipartReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,210:1\n1#2:211\n*E\n"})
public final class MultipartReader implements Closeable {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/MultipartReader$Companion;", "", "Lokio/Options;", "afterBoundaryOptions", "Lokio/Options;", "getAfterBoundaryOptions", "()Lokio/Options;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Options getAfterBoundaryOptions() {
            return MultipartReader.i;
        }
    }

    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001A\u00020\bH\u0096\u0001¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0003\u001A\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\u0003\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u000E\u0010\u000F\u001A\u0004\b\u0005\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/MultipartReader$Part;", "Ljava/io/Closeable;", "Lokhttp3/Headers;", "headers", "Lokio/BufferedSource;", "body", "<init>", "(Lokhttp3/Headers;Lokio/BufferedSource;)V", "", "close", "()V", "a", "Lokhttp3/Headers;", "()Lokhttp3/Headers;", "b", "Lokio/BufferedSource;", "()Lokio/BufferedSource;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Part implements Closeable {
        public final Headers a;
        public final BufferedSource b;

        public Part(@NotNull Headers headers0, @NotNull BufferedSource bufferedSource0) {
            Intrinsics.checkNotNullParameter(headers0, "headers");
            Intrinsics.checkNotNullParameter(bufferedSource0, "body");
            super();
            this.a = headers0;
            this.b = bufferedSource0;
        }

        @JvmName(name = "body")
        @NotNull
        public final BufferedSource body() {
            return this.b;
        }

        @Override
        public void close() {
            this.b.close();
        }

        @JvmName(name = "headers")
        @NotNull
        public final Headers headers() {
            return this.a;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final BufferedSource a;
    public final String b;
    public final ByteString c;
    public final ByteString d;
    public int e;
    public boolean f;
    public boolean g;
    public b h;
    public static final Options i;

    static {
        MultipartReader.Companion = new Companion(null);
        ByteString[] arr_byteString = {ByteString.Companion.encodeUtf8("\r\n"), ByteString.Companion.encodeUtf8("--"), ByteString.Companion.encodeUtf8(" "), ByteString.Companion.encodeUtf8("\t")};
        MultipartReader.i = Options.Companion.of(arr_byteString);
    }

    public MultipartReader(@NotNull ResponseBody responseBody0) throws IOException {
        Intrinsics.checkNotNullParameter(responseBody0, "response");
        BufferedSource bufferedSource0 = responseBody0.source();
        MediaType mediaType0 = responseBody0.contentType();
        if(mediaType0 != null) {
            String s = mediaType0.parameter("boundary");
            if(s != null) {
                this(bufferedSource0, s);
                return;
            }
        }
        throw new ProtocolException("expected the Content-Type to have a boundary parameter");
    }

    public MultipartReader(@NotNull BufferedSource bufferedSource0, @NotNull String s) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        Intrinsics.checkNotNullParameter(s, "boundary");
        super();
        this.a = bufferedSource0;
        this.b = s;
        this.c = new Buffer().writeUtf8("--").writeUtf8(s).readByteString();
        this.d = new Buffer().writeUtf8("\r\n--").writeUtf8(s).readByteString();
    }

    public final long a(long v) {
        this.a.require(((long)this.d.size()));
        long v1 = this.a.getBuffer().indexOf(this.d);
        return v1 == -1L ? Math.min(v, this.a.getBuffer().size() - ((long)this.d.size()) + 1L) : Math.min(v, v1);
    }

    public static final long access$currentPartBytesRemaining(MultipartReader multipartReader0, long v) {
        return multipartReader0.a(v);
    }

    public static final b access$getCurrentPart$p(MultipartReader multipartReader0) {
        return multipartReader0.h;
    }

    public static final BufferedSource access$getSource$p(MultipartReader multipartReader0) {
        return multipartReader0.a;
    }

    public static final void access$setCurrentPart$p(MultipartReader multipartReader0, b b0) {
        multipartReader0.h = b0;
    }

    @JvmName(name = "boundary")
    @NotNull
    public final String boundary() {
        return this.b;
    }

    @Override
    public void close() throws IOException {
        if(this.f) {
            return;
        }
        this.f = true;
        this.h = null;
        this.a.close();
    }

    @Nullable
    public final Part nextPart() throws IOException {
        if(this.f) {
            throw new IllegalStateException("closed");
        }
        if(this.g) {
            return null;
        }
        BufferedSource bufferedSource0 = this.a;
        if(this.e == 0) {
            ByteString byteString0 = this.c;
            if(bufferedSource0.rangeEquals(0L, byteString0)) {
                bufferedSource0.skip(((long)byteString0.size()));
                goto label_14;
            }
            goto label_9;
        }
        else {
            while(true) {
            label_9:
                long v = this.a(0x2000L);
                if(v == 0L) {
                    break;
                }
                bufferedSource0.skip(v);
            }
            bufferedSource0.skip(((long)this.d.size()));
        }
    label_14:
        boolean z = false;
        int v1;
        while((v1 = bufferedSource0.select(MultipartReader.i)) != -1) {
            switch(v1) {
                case 0: {
                    ++this.e;
                    Headers headers0 = new HeadersReader(bufferedSource0).readHeaders();
                    b b0 = new b(this);
                    this.h = b0;
                    return new Part(headers0, Okio.buffer(b0));
                }
                case 1: {
                    if(z) {
                        throw new ProtocolException("unexpected characters after boundary");
                    }
                    if(this.e == 0) {
                        throw new ProtocolException("expected at least 1 part");
                    }
                    this.g = true;
                    return null;
                label_30:
                    if(v1 == 2 || v1 == 3) {
                        break;
                    }
                    continue;
                }
                default: {
                    goto label_30;
                }
            }
            z = true;
        }
        throw new ProtocolException("unexpected characters after boundary");
    }
}

