package okhttp3;

import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.x;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import kotlin.text.q;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000B\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u00018BC\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\u0016\u0010\f\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000B\u0012\u0004\u0012\u00020\u00010\n\u00A2\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0010\u001A\u0004\u0018\u00010\u00042\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001B\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\u00040\u00122\u0006\u0010\u000F\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0007\u0010\u0013J\u000F\u0010\u0014\u001A\u0004\u0018\u00010\u0001\u00A2\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u0014\u001A\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00162\u000E\u0010\u0017\u001A\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u000B\u00A2\u0006\u0004\b\u0014\u0010\u0018J\r\u0010\u001A\u001A\u00020\u0019\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u0005\u001A\u00020\u0004H\u0007\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u000F\u0010\u0007\u001A\u00020\u0006H\u0007\u00A2\u0006\u0004\b \u0010!J\u0011\u0010\t\u001A\u0004\u0018\u00010\bH\u0007\u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010\'\u001A\u00020$H\u0007\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b(\u0010\u001FR\u0017\u0010\u0003\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b)\u0010*\u001A\u0004\b\u0003\u0010\u001DR\u0017\u0010\u0005\u001A\u00020\u00048\u0007\u00A2\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b\u0005\u0010\u001FR\u0017\u0010\u0007\u001A\u00020\u00068\u0007\u00A2\u0006\f\n\u0004\b-\u0010.\u001A\u0004\b\u0007\u0010!R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0007\u00A2\u0006\f\n\u0004\b/\u00100\u001A\u0004\b\t\u0010#R*\u0010\f\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000B\u0012\u0004\u0012\u00020\u00010\n8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R\u0011\u00106\u001A\u0002058F\u00A2\u0006\u0006\u001A\u0004\b6\u00107R\u0011\u0010\'\u001A\u00020$8G\u00A2\u0006\u0006\u001A\u0004\b\'\u0010&\u00A8\u00069"}, d2 = {"Lokhttp3/Request;", "", "Lokhttp3/HttpUrl;", "url", "", "method", "Lokhttp3/Headers;", "headers", "Lokhttp3/RequestBody;", "body", "", "Ljava/lang/Class;", "tags", "<init>", "(Lokhttp3/HttpUrl;Ljava/lang/String;Lokhttp3/Headers;Lokhttp3/RequestBody;Ljava/util/Map;)V", "name", "header", "(Ljava/lang/String;)Ljava/lang/String;", "", "(Ljava/lang/String;)Ljava/util/List;", "tag", "()Ljava/lang/Object;", "T", "type", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/Request$Builder;", "newBuilder", "()Lokhttp3/Request$Builder;", "-deprecated_url", "()Lokhttp3/HttpUrl;", "-deprecated_method", "()Ljava/lang/String;", "-deprecated_headers", "()Lokhttp3/Headers;", "-deprecated_body", "()Lokhttp3/RequestBody;", "Lokhttp3/CacheControl;", "-deprecated_cacheControl", "()Lokhttp3/CacheControl;", "cacheControl", "toString", "a", "Lokhttp3/HttpUrl;", "b", "Ljava/lang/String;", "c", "Lokhttp3/Headers;", "d", "Lokhttp3/RequestBody;", "e", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "", "isHttps", "()Z", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,298:1\n1864#2,3:299\n*S KotlinDebug\n*F\n+ 1 Request.kt\nokhttp3/Request\n*L\n119#1:299,3\n*E\n"})
public final class Request {
    @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016\u00A2\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0010\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0002\u0010\u0006J\u0017\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\b\u0010\u000BJ\u0017\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\b\u0010\rJ\u001F\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001F\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\n2\u0006\u0010\u000F\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\nH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u000BJ\u0017\u0010\u0015\u001A\u00020\u00002\u0006\u0010\u0015\u001A\u00020\u0014H\u0016\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001A\u00020\u00002\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001A\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0000H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001BJ\u0017\u0010\u001F\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u001B\u0010!\u001A\u00020\u00002\n\b\u0002\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0017\u00A2\u0006\u0004\b!\u0010 J\u0017\u0010\"\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b\"\u0010 J\u0017\u0010#\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b#\u0010 J!\u0010$\u001A\u00020\u00002\u0006\u0010$\u001A\u00020\n2\b\u0010\u001E\u001A\u0004\u0018\u00010\u001DH\u0016\u00A2\u0006\u0004\b$\u0010%J\u0019\u0010&\u001A\u00020\u00002\b\u0010&\u001A\u0004\u0018\u00010\u0001H\u0016\u00A2\u0006\u0004\b&\u0010\'J/\u0010&\u001A\u00020\u0000\"\u0004\b\u0000\u0010(2\u000E\u0010*\u001A\n\u0012\u0006\b\u0000\u0012\u00028\u00000)2\b\u0010&\u001A\u0004\u0018\u00018\u0000H\u0016\u00A2\u0006\u0004\b&\u0010+J\u000F\u0010,\u001A\u00020\u0004H\u0016\u00A2\u0006\u0004\b,\u0010-R$\u0010\b\u001A\u0004\u0018\u00010\u00078\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b.\u0010/\u001A\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010$\u001A\u00020\n8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b4\u00105\u001A\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010\u0015\u001A\u00020:8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\b;\u0010<\u001A\u0004\b=\u0010>\"\u0004\b?\u0010@R$\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bA\u0010B\u001A\u0004\bC\u0010D\"\u0004\bE\u0010FR2\u0010N\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030)\u0012\u0004\u0012\u00020\u00010G8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bH\u0010I\u001A\u0004\bJ\u0010K\"\u0004\bL\u0010M\u00A8\u0006O"}, d2 = {"Lokhttp3/Request$Builder;", "", "<init>", "()V", "Lokhttp3/Request;", "request", "(Lokhttp3/Request;)V", "Lokhttp3/HttpUrl;", "url", "(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;", "", "(Ljava/lang/String;)Lokhttp3/Request$Builder;", "Ljava/net/URL;", "(Ljava/net/URL;)Lokhttp3/Request$Builder;", "name", "value", "header", "(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;", "addHeader", "removeHeader", "Lokhttp3/Headers;", "headers", "(Lokhttp3/Headers;)Lokhttp3/Request$Builder;", "Lokhttp3/CacheControl;", "cacheControl", "(Lokhttp3/CacheControl;)Lokhttp3/Request$Builder;", "get", "()Lokhttp3/Request$Builder;", "head", "Lokhttp3/RequestBody;", "body", "post", "(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "delete", "put", "patch", "method", "(Ljava/lang/String;Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;", "tag", "(Ljava/lang/Object;)Lokhttp3/Request$Builder;", "T", "Ljava/lang/Class;", "type", "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/Request$Builder;", "build", "()Lokhttp3/Request;", "a", "Lokhttp3/HttpUrl;", "getUrl$okhttp", "()Lokhttp3/HttpUrl;", "setUrl$okhttp", "(Lokhttp3/HttpUrl;)V", "b", "Ljava/lang/String;", "getMethod$okhttp", "()Ljava/lang/String;", "setMethod$okhttp", "(Ljava/lang/String;)V", "Lokhttp3/Headers$Builder;", "c", "Lokhttp3/Headers$Builder;", "getHeaders$okhttp", "()Lokhttp3/Headers$Builder;", "setHeaders$okhttp", "(Lokhttp3/Headers$Builder;)V", "d", "Lokhttp3/RequestBody;", "getBody$okhttp", "()Lokhttp3/RequestBody;", "setBody$okhttp", "(Lokhttp3/RequestBody;)V", "", "e", "Ljava/util/Map;", "getTags$okhttp", "()Ljava/util/Map;", "setTags$okhttp", "(Ljava/util/Map;)V", "tags", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Request.kt\nokhttp3/Request$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,298:1\n1#2:299\n*E\n"})
    public static class Builder {
        public HttpUrl a;
        public String b;
        public okhttp3.Headers.Builder c;
        public RequestBody d;
        public Map e;

        public Builder() {
            this.e = new LinkedHashMap();
            this.b = "GET";
            this.c = new okhttp3.Headers.Builder();
        }

        public Builder(@NotNull Request request0) {
            Intrinsics.checkNotNullParameter(request0, "request");
            super();
            this.e = new LinkedHashMap();
            this.a = request0.url();
            this.b = request0.method();
            this.d = request0.body();
            Map map0 = request0.getTags$okhttp().isEmpty() ? new LinkedHashMap() : x.toMutableMap(request0.getTags$okhttp());
            this.e = map0;
            this.c = request0.headers().newBuilder();
        }

        @NotNull
        public Builder addHeader(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            this.c.add(s, s1);
            return this;
        }

        @NotNull
        public Request build() {
            HttpUrl httpUrl0 = this.a;
            if(httpUrl0 == null) {
                throw new IllegalStateException("url == null");
            }
            return new Request(httpUrl0, this.b, this.c.build(), this.d, Util.toImmutableMap(this.e));
        }

        @NotNull
        public Builder cacheControl(@NotNull CacheControl cacheControl0) {
            Intrinsics.checkNotNullParameter(cacheControl0, "cacheControl");
            String s = cacheControl0.toString();
            return s.length() == 0 ? this.removeHeader("Cache-Control") : this.header("Cache-Control", s);
        }

        @JvmOverloads
        @NotNull
        public final Builder delete() {
            return Builder.delete$default(this, null, 1, null);
        }

        @JvmOverloads
        @NotNull
        public Builder delete(@Nullable RequestBody requestBody0) {
            return this.method("DELETE", requestBody0);
        }

        public static Builder delete$default(Builder request$Builder0, RequestBody requestBody0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if((v & 1) != 0) {
                requestBody0 = Util.EMPTY_REQUEST;
            }
            return request$Builder0.delete(requestBody0);
        }

        @NotNull
        public Builder get() {
            return this.method("GET", null);
        }

        @Nullable
        public final RequestBody getBody$okhttp() {
            return this.d;
        }

        @NotNull
        public final okhttp3.Headers.Builder getHeaders$okhttp() {
            return this.c;
        }

        @NotNull
        public final String getMethod$okhttp() {
            return this.b;
        }

        @NotNull
        public final Map getTags$okhttp() {
            return this.e;
        }

        @Nullable
        public final HttpUrl getUrl$okhttp() {
            return this.a;
        }

        @NotNull
        public Builder head() {
            return this.method("HEAD", null);
        }

        @NotNull
        public Builder header(@NotNull String s, @NotNull String s1) {
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(s1, "value");
            this.c.set(s, s1);
            return this;
        }

        @NotNull
        public Builder headers(@NotNull Headers headers0) {
            Intrinsics.checkNotNullParameter(headers0, "headers");
            this.c = headers0.newBuilder();
            return this;
        }

        @NotNull
        public Builder method(@NotNull String s, @Nullable RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(s, "method");
            if(s.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if(requestBody0 == null) {
                if(HttpMethod.requiresRequestBody(s)) {
                    throw new IllegalArgumentException(("method " + s + " must have a request body.").toString());
                }
            }
            else if(!HttpMethod.permitsRequestBody(s)) {
                throw new IllegalArgumentException(("method " + s + " must not have a request body.").toString());
            }
            this.b = s;
            this.d = requestBody0;
            return this;
        }

        @NotNull
        public Builder patch(@NotNull RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(requestBody0, "body");
            return this.method("PATCH", requestBody0);
        }

        @NotNull
        public Builder post(@NotNull RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(requestBody0, "body");
            return this.method("POST", requestBody0);
        }

        @NotNull
        public Builder put(@NotNull RequestBody requestBody0) {
            Intrinsics.checkNotNullParameter(requestBody0, "body");
            return this.method("PUT", requestBody0);
        }

        @NotNull
        public Builder removeHeader(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            this.c.removeAll(s);
            return this;
        }

        public final void setBody$okhttp(@Nullable RequestBody requestBody0) {
            this.d = requestBody0;
        }

        public final void setHeaders$okhttp(@NotNull okhttp3.Headers.Builder headers$Builder0) {
            Intrinsics.checkNotNullParameter(headers$Builder0, "<set-?>");
            this.c = headers$Builder0;
        }

        public final void setMethod$okhttp(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "<set-?>");
            this.b = s;
        }

        public final void setTags$okhttp(@NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "<set-?>");
            this.e = map0;
        }

        public final void setUrl$okhttp(@Nullable HttpUrl httpUrl0) {
            this.a = httpUrl0;
        }

        @NotNull
        public Builder tag(@NotNull Class class0, @Nullable Object object0) {
            Intrinsics.checkNotNullParameter(class0, "type");
            if(object0 == null) {
                this.e.remove(class0);
                return this;
            }
            if(this.e.isEmpty()) {
                this.e = new LinkedHashMap();
            }
            Map map0 = this.e;
            Object object1 = class0.cast(object0);
            Intrinsics.checkNotNull(object1);
            map0.put(class0, object1);
            return this;
        }

        @NotNull
        public Builder tag(@Nullable Object object0) {
            return this.tag(Object.class, object0);
        }

        @NotNull
        public Builder url(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "url");
            if(p.startsWith(s, "ws:", true)) {
                String s1 = s.substring(3);
                Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
                return this.url(HttpUrl.Companion.get("http:" + s1));
            }
            if(p.startsWith(s, "wss:", true)) {
                String s2 = s.substring(4);
                Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String).substring(startIndex)");
                s = "https:" + s2;
            }
            return this.url(HttpUrl.Companion.get(s));
        }

        @NotNull
        public Builder url(@NotNull URL uRL0) {
            Intrinsics.checkNotNullParameter(uRL0, "url");
            String s = uRL0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "url.toString()");
            return this.url(HttpUrl.Companion.get(s));
        }

        @NotNull
        public Builder url(@NotNull HttpUrl httpUrl0) {
            Intrinsics.checkNotNullParameter(httpUrl0, "url");
            this.a = httpUrl0;
            return this;
        }
    }

    public final HttpUrl a;
    public final String b;
    public final Headers c;
    public final RequestBody d;
    public final Map e;
    public CacheControl f;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "body", imports = {}))
    @JvmName(name = "-deprecated_body")
    @Nullable
    public final RequestBody -deprecated_body() {
        return this.d;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "cacheControl", imports = {}))
    @JvmName(name = "-deprecated_cacheControl")
    @NotNull
    public final CacheControl -deprecated_cacheControl() {
        return this.cacheControl();
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "headers", imports = {}))
    @JvmName(name = "-deprecated_headers")
    @NotNull
    public final Headers -deprecated_headers() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "method", imports = {}))
    @JvmName(name = "-deprecated_method")
    @NotNull
    public final String -deprecated_method() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "url", imports = {}))
    @JvmName(name = "-deprecated_url")
    @NotNull
    public final HttpUrl -deprecated_url() {
        return this.a;
    }

    public Request(@NotNull HttpUrl httpUrl0, @NotNull String s, @NotNull Headers headers0, @Nullable RequestBody requestBody0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        Intrinsics.checkNotNullParameter(s, "method");
        Intrinsics.checkNotNullParameter(headers0, "headers");
        Intrinsics.checkNotNullParameter(map0, "tags");
        super();
        this.a = httpUrl0;
        this.b = s;
        this.c = headers0;
        this.d = requestBody0;
        this.e = map0;
    }

    @JvmName(name = "body")
    @Nullable
    public final RequestBody body() {
        return this.d;
    }

    @JvmName(name = "cacheControl")
    @NotNull
    public final CacheControl cacheControl() {
        CacheControl cacheControl0 = this.f;
        if(cacheControl0 == null) {
            cacheControl0 = CacheControl.Companion.parse(this.c);
            this.f = cacheControl0;
        }
        return cacheControl0;
    }

    @NotNull
    public final Map getTags$okhttp() {
        return this.e;
    }

    @Nullable
    public final String header(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this.c.get(s);
    }

    @NotNull
    public final List headers(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        return this.c.values(s);
    }

    @JvmName(name = "headers")
    @NotNull
    public final Headers headers() {
        return this.c;
    }

    public final boolean isHttps() {
        return this.a.isHttps();
    }

    @JvmName(name = "method")
    @NotNull
    public final String method() {
        return this.b;
    }

    @NotNull
    public final Builder newBuilder() {
        return new Builder(this);
    }

    @Nullable
    public final Object tag() {
        return this.tag(Object.class);
    }

    @Nullable
    public final Object tag(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "type");
        return class0.cast(this.e.get(class0));
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder("Request{method=");
        stringBuilder0.append(this.b);
        stringBuilder0.append(", url=");
        stringBuilder0.append(this.a);
        Headers headers0 = this.c;
        if(headers0.size() != 0) {
            stringBuilder0.append(", headers=[");
            int v = 0;
            for(Object object0: headers0) {
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                String s = (String)((Pair)object0).component1();
                String s1 = (String)((Pair)object0).component2();
                if(v > 0) {
                    stringBuilder0.append(", ");
                }
                stringBuilder0.append(s);
                stringBuilder0.append(':');
                stringBuilder0.append(s1);
                ++v;
            }
            stringBuilder0.append(']');
        }
        Map map0 = this.e;
        if(!map0.isEmpty()) {
            stringBuilder0.append(", tags=");
            stringBuilder0.append(map0);
        }
        return q.l('}', "StringBuilder().apply(builderAction).toString()", stringBuilder0);
    }

    @JvmName(name = "url")
    @NotNull
    public final HttpUrl url() {
        return this.a;
    }
}

