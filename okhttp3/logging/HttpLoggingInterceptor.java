package okhttp3.logging;

import a5.b;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.f0;
import kotlin.collections.o;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.p;
import okhttp3.Connection;
import okhttp3.Headers;
import okhttp3.Interceptor.Chain;
import okhttp3.Interceptor;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.http.HttpHeaders;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001:\u0002\u001B\u001CB\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u0011\u001A\u00020\u000BH\u0007¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\f\u001A\u00020\u000B2\u0006\u0010\u0017\u001A\u00020\u000B8\u0006@GX\u0086\u000E¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u0011\u0010\u0010\"\u0004\b\f\u0010\u001A¨\u0006\u001D"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/Interceptor;", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$Logger;)V", "", "name", "", "redactHeader", "(Ljava/lang/String;)V", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "setLevel", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)Lokhttp3/logging/HttpLoggingInterceptor;", "-deprecated_level", "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "getLevel", "Lokhttp3/Interceptor$Chain;", "chain", "Lokhttp3/Response;", "intercept", "(Lokhttp3/Interceptor$Chain;)Lokhttp3/Response;", "<set-?>", "c", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Level", "Logger", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class HttpLoggingInterceptor implements Interceptor {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY;

    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "", "log", "", "message", "", "Companion", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Logger {
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Logger$Companion;", "", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$Logger;", "okhttp3/logging/a", "okhttp-logging-interceptor"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public static final Companion a;

            static {
                Companion.a = new Companion();  // 初始化器: Ljava/lang/Object;-><init>()V
            }
        }

        @NotNull
        public static final Companion Companion;
        @JvmField
        @NotNull
        public static final Logger DEFAULT;

        static {
            Logger.Companion = Companion.a;
            Logger.DEFAULT = new a();  // 初始化器: Ljava/lang/Object;-><init>()V
        }

        void log(@NotNull String arg1);
    }

    public final Logger a;
    public volatile Set b;
    public volatile Level c;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to var", replaceWith = @ReplaceWith(expression = "level", imports = {}))
    @JvmName(name = "-deprecated_level")
    @NotNull
    public final Level -deprecated_level() {
        return this.c;
    }

    @JvmOverloads
    public HttpLoggingInterceptor() {
        this(null, 1, null);
    }

    @JvmOverloads
    public HttpLoggingInterceptor(@NotNull Logger httpLoggingInterceptor$Logger0) {
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor$Logger0, "logger");
        super();
        this.a = httpLoggingInterceptor$Logger0;
        this.b = f0.emptySet();
        this.c = Level.NONE;
    }

    public HttpLoggingInterceptor(Logger httpLoggingInterceptor$Logger0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            httpLoggingInterceptor$Logger0 = Logger.DEFAULT;
        }
        this(httpLoggingInterceptor$Logger0);
    }

    public final void a(Headers headers0, int v) {
        String s = this.b.contains(headers0.name(v)) ? "██" : headers0.value(v);
        this.a.log(headers0.name(v) + ": " + s);
    }

    @NotNull
    public final Level getLevel() {
        return this.c;
    }

    @Override  // okhttp3.Interceptor
    @NotNull
    public Response intercept(@NotNull Chain interceptor$Chain0) throws IOException {
        Charset charset1;
        String s4;
        long v6;
        Response response0;
        Charset charset0;
        String s1;
        int v1;
        Intrinsics.checkNotNullParameter(interceptor$Chain0, "chain");
        Level httpLoggingInterceptor$Level0 = this.c;
        Request request0 = interceptor$Chain0.request();
        if(httpLoggingInterceptor$Level0 == Level.NONE) {
            return interceptor$Chain0.proceed(request0);
        }
        boolean z = httpLoggingInterceptor$Level0 == Level.BODY;
        int v = z || httpLoggingInterceptor$Level0 == Level.HEADERS ? 1 : 0;
        RequestBody requestBody0 = request0.body();
        Connection connection0 = interceptor$Chain0.connection();
        String s = "--> " + request0.method() + ' ' + request0.url() + (connection0 == null ? "" : " " + connection0.protocol());
        if(v == 0 && requestBody0 != null) {
            StringBuilder stringBuilder0 = b.u(s, " (");
            stringBuilder0.append(requestBody0.contentLength());
            stringBuilder0.append("-byte body)");
            s = stringBuilder0.toString();
        }
        this.a.log(s);
        if(v == 0) {
            v1 = 0;
            s1 = "";
        }
        else {
            Headers headers0 = request0.headers();
            v1 = v;
            if(requestBody0 == null) {
                s1 = "";
            }
            else {
                MediaType mediaType0 = requestBody0.contentType();
                if(mediaType0 != null && headers0.get("Content-Type") == null) {
                    this.a.log("Content-Type: " + mediaType0);
                }
                if(requestBody0.contentLength() == -1L || headers0.get("Content-Length") != null) {
                    s1 = "";
                }
                else {
                    s1 = "";
                    this.a.log("Content-Length: " + requestBody0.contentLength());
                }
            }
            int v2 = headers0.size();
            for(int v3 = 0; v3 < v2; ++v3) {
                this.a(headers0, v3);
            }
            if(z && requestBody0 != null) {
                String s2 = request0.headers().get("Content-Encoding");
                if(s2 == null || p.equals(s2, "identity", true) || p.equals(s2, "gzip", true)) {
                    Buffer buffer0 = new Buffer();
                    requestBody0.writeTo(buffer0);
                    MediaType mediaType1 = requestBody0.contentType();
                    if(mediaType1 == null) {
                        charset0 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(charset0, "UTF_8");
                    }
                    else {
                        charset0 = mediaType1.charset(StandardCharsets.UTF_8);
                        if(charset0 == null) {
                            charset0 = StandardCharsets.UTF_8;
                            Intrinsics.checkNotNullExpressionValue(charset0, "UTF_8");
                        }
                    }
                    this.a.log("");
                    if(Utf8Kt.isProbablyUtf8(buffer0)) {
                        String s3 = buffer0.readString(charset0);
                        this.a.log(s3);
                        this.a.log("--> END " + request0.method() + " (" + requestBody0.contentLength() + "-byte body)");
                    }
                    else {
                        this.a.log("--> END " + request0.method() + " (binary " + requestBody0.contentLength() + "-byte body omitted)");
                    }
                }
                else {
                    this.a.log("--> END " + request0.method() + " (encoded body omitted)");
                }
            }
            else {
                this.a.log("--> END " + request0.method());
            }
        }
        try {
            response0 = interceptor$Chain0.proceed(request0);
        }
        catch(Exception exception0) {
            this.a.log("<-- HTTP FAILED: " + exception0);
            throw exception0;
        }
        long v4 = TimeUnit.NANOSECONDS.toMillis(0L);
        ResponseBody responseBody0 = response0.body();
        Intrinsics.checkNotNull(responseBody0);
        long v5 = responseBody0.contentLength();
        if(v5 == -1L) {
            v6 = -1L;
            s4 = "unknown-length";
        }
        else {
            v6 = v5;
            s4 = v5 + "-byte";
        }
        Logger httpLoggingInterceptor$Logger0 = this.a;
        StringBuilder stringBuilder1 = new StringBuilder("<-- ");
        stringBuilder1.append(response0.code());
        if(response0.message().length() != 0) {
            s1 = " " + response0.message();
        }
        stringBuilder1.append(s1);
        stringBuilder1.append(' ');
        stringBuilder1.append(response0.request().url());
        stringBuilder1.append(" (");
        stringBuilder1.append(v4);
        stringBuilder1.append("ms");
        stringBuilder1.append((v1 == 0 ? ", " + s4 + " body" : ""));
        stringBuilder1.append(')');
        httpLoggingInterceptor$Logger0.log(stringBuilder1.toString());
        if(v1 != 0) {
            Headers headers1 = response0.headers();
            int v7 = headers1.size();
            for(int v8 = 0; v8 < v7; ++v8) {
                this.a(headers1, v8);
            }
            if(z && HttpHeaders.promisesBody(response0)) {
                String s5 = response0.headers().get("Content-Encoding");
                if(s5 != null && !p.equals(s5, "identity", true) && !p.equals(s5, "gzip", true)) {
                    this.a.log("<-- END HTTP (encoded body omitted)");
                    return response0;
                }
                BufferedSource bufferedSource0 = responseBody0.source();
                bufferedSource0.request(0x7FFFFFFFFFFFFFFFL);
                Buffer buffer1 = bufferedSource0.getBuffer();
                Long long0 = null;
                if(p.equals("gzip", headers1.get("Content-Encoding"), true)) {
                    Long long1 = buffer1.size();
                    GzipSource gzipSource0 = new GzipSource(buffer1.clone());
                    try {
                        buffer1 = new Buffer();
                        buffer1.writeAll(gzipSource0);
                    }
                    catch(Throwable throwable0) {
                        CloseableKt.closeFinally(gzipSource0, throwable0);
                        throw throwable0;
                    }
                    CloseableKt.closeFinally(gzipSource0, null);
                    long0 = long1;
                }
                MediaType mediaType2 = responseBody0.contentType();
                if(mediaType2 == null) {
                    charset1 = StandardCharsets.UTF_8;
                    Intrinsics.checkNotNullExpressionValue(charset1, "UTF_8");
                }
                else {
                    charset1 = mediaType2.charset(StandardCharsets.UTF_8);
                    if(charset1 == null) {
                        charset1 = StandardCharsets.UTF_8;
                        Intrinsics.checkNotNullExpressionValue(charset1, "UTF_8");
                    }
                }
                if(!Utf8Kt.isProbablyUtf8(buffer1)) {
                    this.a.log("");
                    this.a.log("<-- END HTTP (binary " + buffer1.size() + "-byte body omitted)");
                    return response0;
                }
                if(v6 != 0L) {
                    this.a.log("");
                    String s6 = buffer1.clone().readString(charset1);
                    this.a.log(s6);
                }
                if(long0 != null) {
                    this.a.log("<-- END HTTP (" + buffer1.size() + "-byte, " + long0 + "-gzipped-byte body)");
                    return response0;
                }
                this.a.log("<-- END HTTP (" + buffer1.size() + "-byte body)");
                return response0;
            }
            this.a.log("<-- END HTTP");
        }
        return response0;
    }

    @JvmName(name = "level")
    public final void level(@NotNull Level httpLoggingInterceptor$Level0) {
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor$Level0, "<set-?>");
        this.c = httpLoggingInterceptor$Level0;
    }

    public final void redactHeader(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        TreeSet treeSet0 = new TreeSet(p.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
        o.addAll(treeSet0, this.b);
        treeSet0.add(s);
        this.b = treeSet0;
    }

    @NotNull
    public final HttpLoggingInterceptor setLevel(@NotNull Level httpLoggingInterceptor$Level0) {
        Intrinsics.checkNotNullParameter(httpLoggingInterceptor$Level0, "level");
        this.c = httpLoggingInterceptor$Level0;
        return this;
    }
}

