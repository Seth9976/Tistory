package okhttp3;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Charsets;
import kotlin.text.q;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b&\u0018\u0000 \u001E2\u00020\u0001:\u0002\u001F\u001EB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0005\u001A\u0004\u0018\u00010\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\b\u001A\u00020\u0007H&¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH&¢\u0006\u0004\b\u000E\u0010\u000FJ\r\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0014\u001A\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0017\u001A\u00020\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019¢\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001D\u001A\u00020\u001CH\u0016¢\u0006\u0004\b\u001D\u0010\u0003¨\u0006 "}, d2 = {"Lokhttp3/ResponseBody;", "Ljava/io/Closeable;", "<init>", "()V", "Lokhttp3/MediaType;", "contentType", "()Lokhttp3/MediaType;", "", "contentLength", "()J", "Ljava/io/InputStream;", "byteStream", "()Ljava/io/InputStream;", "Lokio/BufferedSource;", "source", "()Lokio/BufferedSource;", "", "bytes", "()[B", "Lokio/ByteString;", "byteString", "()Lokio/ByteString;", "Ljava/io/Reader;", "charStream", "()Ljava/io/Reader;", "", "string", "()Ljava/lang/String;", "", "close", "Companion", "BomAwareReader", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n1#1,321:1\n140#1,11:322\n140#1,11:333\n*S KotlinDebug\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody\n*L\n124#1:322,11\n134#1:333,11\n*E\n"})
public abstract class ResponseBody implements Closeable {
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\'\u0010\r\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lokhttp3/ResponseBody$BomAwareReader;", "Ljava/io/Reader;", "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "", "cbuf", "", "off", "len", "read", "([CII)I", "", "close", "()V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nResponseBody.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseBody.kt\nokhttp3/ResponseBody$BomAwareReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,321:1\n1#2:322\n*E\n"})
    public static final class BomAwareReader extends Reader {
        public final BufferedSource a;
        public final Charset b;
        public boolean c;
        public InputStreamReader d;

        public BomAwareReader(@NotNull BufferedSource bufferedSource0, @NotNull Charset charset0) {
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            Intrinsics.checkNotNullParameter(charset0, "charset");
            super();
            this.a = bufferedSource0;
            this.b = charset0;
        }

        @Override
        public void close() throws IOException {
            Unit unit0;
            this.c = true;
            InputStreamReader inputStreamReader0 = this.d;
            if(inputStreamReader0 == null) {
                unit0 = null;
            }
            else {
                inputStreamReader0.close();
                unit0 = Unit.INSTANCE;
            }
            if(unit0 == null) {
                this.a.close();
            }
        }

        @Override
        public int read(@NotNull char[] arr_c, int v, int v1) throws IOException {
            Intrinsics.checkNotNullParameter(arr_c, "cbuf");
            if(this.c) {
                throw new IOException("Stream closed");
            }
            InputStreamReader inputStreamReader0 = this.d;
            if(inputStreamReader0 == null) {
                inputStreamReader0 = new InputStreamReader(this.a.inputStream(), Util.readBomAsCharset(this.a, this.b));
                this.d = inputStreamReader0;
            }
            return inputStreamReader0.read(arr_c, v, v1);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001J\u001F\u0010\b\u001A\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\b\u001A\u00020\u0005*\u00020\t2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\nJ\u001F\u0010\b\u001A\u00020\u0005*\u00020\u000B2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\fJ)\u0010\u0011\u001A\u00020\u0005*\u00020\r2\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0006\u0010\u0010J!\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0013J!\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001A\u00020\tH\u0007¢\u0006\u0004\b\u0006\u0010\u0014J!\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0012\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u0006\u0010\u0015J)\u0010\u0006\u001A\u00020\u00052\b\u0010\u0004\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0012\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, d2 = {"Lokhttp3/ResponseBody$Companion;", "", "", "Lokhttp3/MediaType;", "contentType", "Lokhttp3/ResponseBody;", "create", "(Ljava/lang/String;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "toResponseBody", "", "([BLokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/ByteString;", "(Lokio/ByteString;Lokhttp3/MediaType;)Lokhttp3/ResponseBody;", "Lokio/BufferedSource;", "", "contentLength", "(Lokio/BufferedSource;Lokhttp3/MediaType;J)Lokhttp3/ResponseBody;", "asResponseBody", "content", "(Lokhttp3/MediaType;Ljava/lang/String;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;[B)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;Lokio/ByteString;)Lokhttp3/ResponseBody;", "(Lokhttp3/MediaType;JLokio/BufferedSource;)Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final ResponseBody create(@NotNull String s, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(s, "<this>");
            Charset charset0 = Charsets.UTF_8;
            if(mediaType0 != null) {
                Charset charset1 = MediaType.charset$default(mediaType0, null, 1, null);
                if(charset1 == null) {
                    mediaType0 = MediaType.Companion.parse(mediaType0 + "; charset=utf-8");
                }
                else {
                    charset0 = charset1;
                }
            }
            Buffer buffer0 = new Buffer().writeString(s, charset0);
            return this.create(buffer0, mediaType0, buffer0.size());
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType0, long v, @NotNull BufferedSource bufferedSource0) {
            Intrinsics.checkNotNullParameter(bufferedSource0, "content");
            return this.create(bufferedSource0, mediaType0, v);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType0, @NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "content");
            return this.create(s, mediaType0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType0, @NotNull ByteString byteString0) {
            Intrinsics.checkNotNullParameter(byteString0, "content");
            return this.create(byteString0, mediaType0);
        }

        @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @JvmStatic
        @NotNull
        public final ResponseBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b) {
            Intrinsics.checkNotNullParameter(arr_b, "content");
            return this.create(arr_b, mediaType0);
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final ResponseBody create(@NotNull BufferedSource bufferedSource0, @Nullable MediaType mediaType0, long v) {
            Intrinsics.checkNotNullParameter(bufferedSource0, "<this>");
            return new ResponseBody() {
                @Override  // okhttp3.ResponseBody
                public long contentLength() {
                    return bufferedSource0;
                }

                @Override  // okhttp3.ResponseBody
                @Nullable
                public MediaType contentType() {
                    return v;
                }

                @Override  // okhttp3.ResponseBody
                @NotNull
                public BufferedSource source() {
                    return this.d;
                }
            };
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final ResponseBody create(@NotNull ByteString byteString0, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(byteString0, "<this>");
            return this.create(new Buffer().write(byteString0), mediaType0, ((long)byteString0.size()));
        }

        @JvmName(name = "create")
        @JvmStatic
        @NotNull
        public final ResponseBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0) {
            Intrinsics.checkNotNullParameter(arr_b, "<this>");
            return this.create(new Buffer().write(arr_b), mediaType0, ((long)arr_b.length));
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, String s, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return responseBody$Companion0.create(s, mediaType0);
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, BufferedSource bufferedSource0, MediaType mediaType0, long v, int v1, Object object0) {
            if((v1 & 1) != 0) {
                mediaType0 = null;
            }
            if((v1 & 2) != 0) {
                v = -1L;
            }
            return responseBody$Companion0.create(bufferedSource0, mediaType0, v);
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, ByteString byteString0, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return responseBody$Companion0.create(byteString0, mediaType0);
        }

        public static ResponseBody create$default(Companion responseBody$Companion0, byte[] arr_b, MediaType mediaType0, int v, Object object0) {
            if((v & 1) != 0) {
                mediaType0 = null;
            }
            return responseBody$Companion0.create(arr_b, mediaType0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public BomAwareReader a;

    static {
        ResponseBody.Companion = new Companion(null);
    }

    @NotNull
    public final InputStream byteStream() {
        return this.source().inputStream();
    }

    @NotNull
    public final ByteString byteString() throws IOException {
        ByteString byteString0;
        long v = this.contentLength();
        if(v > 0x7FFFFFFFL) {
            throw new IOException(q.n(v, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSource0 = this.source();
        try {
            byteString0 = bufferedSource0.readByteString();
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedSource0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedSource0, null);
        int v1 = byteString0.size();
        if(v != -1L && v != ((long)v1)) {
            throw new IOException("Content-Length (" + v + ") and stream length (" + v1 + ") disagree");
        }
        return byteString0;
    }

    @NotNull
    public final byte[] bytes() throws IOException {
        byte[] arr_b;
        long v = this.contentLength();
        if(v > 0x7FFFFFFFL) {
            throw new IOException(q.n(v, "Cannot buffer entire body for content length: "));
        }
        BufferedSource bufferedSource0 = this.source();
        try {
            arr_b = bufferedSource0.readByteArray();
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedSource0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedSource0, null);
        if(v != -1L && v != ((long)arr_b.length)) {
            throw new IOException("Content-Length (" + v + ") and stream length (" + arr_b.length + ") disagree");
        }
        return arr_b;
    }

    @NotNull
    public final Reader charStream() {
        Charset charset0;
        BomAwareReader responseBody$BomAwareReader0 = this.a;
        if(responseBody$BomAwareReader0 == null) {
            BufferedSource bufferedSource0 = this.source();
            MediaType mediaType0 = this.contentType();
            if(mediaType0 == null) {
                charset0 = Charsets.UTF_8;
            }
            else {
                charset0 = mediaType0.charset(Charsets.UTF_8);
                if(charset0 == null) {
                    charset0 = Charsets.UTF_8;
                }
            }
            responseBody$BomAwareReader0 = new BomAwareReader(bufferedSource0, charset0);
            this.a = responseBody$BomAwareReader0;
        }
        return responseBody$BomAwareReader0;
    }

    @Override
    public void close() {
        Util.closeQuietly(this.source());
    }

    public abstract long contentLength();

    @Nullable
    public abstract MediaType contentType();

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@NotNull String s, @Nullable MediaType mediaType0) {
        return ResponseBody.Companion.create(s, mediaType0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType0, long v, @NotNull BufferedSource bufferedSource0) {
        return ResponseBody.Companion.create(mediaType0, v, bufferedSource0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType0, @NotNull String s) {
        return ResponseBody.Companion.create(mediaType0, s);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType0, @NotNull ByteString byteString0) {
        return ResponseBody.Companion.create(mediaType0, byteString0);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the \'content\' argument first to fix Java", replaceWith = @ReplaceWith(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@Nullable MediaType mediaType0, @NotNull byte[] arr_b) {
        return ResponseBody.Companion.create(mediaType0, arr_b);
    }

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@NotNull BufferedSource bufferedSource0, @Nullable MediaType mediaType0, long v) {
        return ResponseBody.Companion.create(bufferedSource0, mediaType0, v);
    }

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@NotNull ByteString byteString0, @Nullable MediaType mediaType0) {
        return ResponseBody.Companion.create(byteString0, mediaType0);
    }

    @JvmName(name = "create")
    @JvmStatic
    @NotNull
    public static final ResponseBody create(@NotNull byte[] arr_b, @Nullable MediaType mediaType0) {
        return ResponseBody.Companion.create(arr_b, mediaType0);
    }

    @NotNull
    public abstract BufferedSource source();

    @NotNull
    public final String string() throws IOException {
        String s;
        Charset charset0;
        BufferedSource bufferedSource0 = this.source();
        try {
            MediaType mediaType0 = this.contentType();
            if(mediaType0 == null) {
                charset0 = Charsets.UTF_8;
            }
            else {
                charset0 = mediaType0.charset(Charsets.UTF_8);
                if(charset0 == null) {
                    charset0 = Charsets.UTF_8;
                }
            }
            s = bufferedSource0.readString(Util.readBomAsCharset(bufferedSource0, charset0));
        }
        catch(Throwable throwable0) {
            CloseableKt.closeFinally(bufferedSource0, throwable0);
            throw throwable0;
        }
        CloseableKt.closeFinally(bufferedSource0, null);
        return s;
    }
}

