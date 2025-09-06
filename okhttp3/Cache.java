package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.f0;
import kotlin.io.CloseableKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import lg.a;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache.Editor;
import okhttp3.internal.cache.DiskLruCache.Snapshot;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.io.FileSystem;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0010)\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000B\n\u0002\b\u0007\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0004NMOPB!\b\u0000\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\t\u0010\u000BJ\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u000E2\u0006\u0010\r\u001A\u00020\fH\u0000\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u0019\u0010\u0016\u001A\u0004\u0018\u00010\u00132\u0006\u0010\u0012\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u001A\u001A\u00020\u00172\u0006\u0010\r\u001A\u00020\fH\u0000\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u001F\u0010\u001F\u001A\u00020\u00172\u0006\u0010\u001B\u001A\u00020\u000E2\u0006\u0010\u001C\u001A\u00020\u000EH\u0000\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\r\u0010 \u001A\u00020\u0017\u00A2\u0006\u0004\b \u0010!J\r\u0010\"\u001A\u00020\u0017\u00A2\u0006\u0004\b\"\u0010!J\r\u0010#\u001A\u00020\u0017\u00A2\u0006\u0004\b#\u0010!J\u0013\u0010&\u001A\b\u0012\u0004\u0012\u00020%0$\u00A2\u0006\u0004\b&\u0010\'J\r\u0010)\u001A\u00020(\u00A2\u0006\u0004\b)\u0010*J\r\u0010+\u001A\u00020(\u00A2\u0006\u0004\b+\u0010*J\r\u0010,\u001A\u00020\u0005\u00A2\u0006\u0004\b,\u0010-J\r\u0010\u0006\u001A\u00020\u0005\u00A2\u0006\u0004\b\u0006\u0010-J\u000F\u0010.\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b.\u0010!J\u000F\u0010/\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b/\u0010!J\u000F\u0010\u0004\u001A\u00020\u0003H\u0007\u00A2\u0006\u0004\b0\u00101J\u0017\u00106\u001A\u00020\u00172\u0006\u00103\u001A\u000202H\u0000\u00A2\u0006\u0004\b4\u00105J\u000F\u00108\u001A\u00020\u0017H\u0000\u00A2\u0006\u0004\b7\u0010!J\r\u00109\u001A\u00020(\u00A2\u0006\u0004\b9\u0010*J\r\u0010:\u001A\u00020(\u00A2\u0006\u0004\b:\u0010*J\r\u0010;\u001A\u00020(\u00A2\u0006\u0004\b;\u0010*R\u001A\u0010A\u001A\u00020<8\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b=\u0010>\u001A\u0004\b?\u0010@R\"\u0010+\u001A\u00020(8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bB\u0010C\u001A\u0004\bD\u0010*\"\u0004\bE\u0010FR\"\u0010)\u001A\u00020(8\u0000@\u0000X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bG\u0010C\u001A\u0004\bH\u0010*\"\u0004\bI\u0010FR\u0011\u0010K\u001A\u00020J8F\u00A2\u0006\u0006\u001A\u0004\bK\u0010LR\u0011\u0010\u0004\u001A\u00020\u00038G\u00A2\u0006\u0006\u001A\u0004\b\u0004\u00101\u00A8\u0006Q"}, d2 = {"Lokhttp3/Cache;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Ljava/io/File;", "directory", "", "maxSize", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "Lokhttp3/Request;", "request", "Lokhttp3/Response;", "get$okhttp", "(Lokhttp3/Request;)Lokhttp3/Response;", "get", "response", "Lokhttp3/internal/cache/CacheRequest;", "put$okhttp", "(Lokhttp3/Response;)Lokhttp3/internal/cache/CacheRequest;", "put", "", "remove$okhttp", "(Lokhttp3/Request;)V", "remove", "cached", "network", "update$okhttp", "(Lokhttp3/Response;Lokhttp3/Response;)V", "update", "initialize", "()V", "delete", "evictAll", "", "", "urls", "()Ljava/util/Iterator;", "", "writeAbortCount", "()I", "writeSuccessCount", "size", "()J", "flush", "close", "-deprecated_directory", "()Ljava/io/File;", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "trackResponse$okhttp", "(Lokhttp3/internal/cache/CacheStrategy;)V", "trackResponse", "trackConditionalCacheHit$okhttp", "trackConditionalCacheHit", "networkCount", "hitCount", "requestCount", "Lokhttp3/internal/cache/DiskLruCache;", "a", "Lokhttp3/internal/cache/DiskLruCache;", "getCache$okhttp", "()Lokhttp3/internal/cache/DiskLruCache;", "cache", "b", "I", "getWriteSuccessCount$okhttp", "setWriteSuccessCount$okhttp", "(I)V", "c", "getWriteAbortCount$okhttp", "setWriteAbortCount$okhttp", "", "isClosed", "()Z", "Companion", "okhttp3/b", "okhttp3/c", "lg/a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class Cache implements Closeable, Flushable {
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\f\u001A\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000BJ%\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0016\u001A\u00020\u0013*\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u0011\u0010\u0018\u001A\u00020\u000F*\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001A\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001C\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001C\u0010\u001BR\u0014\u0010\u001D\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001D\u0010\u001BR\u0014\u0010\u001E\u001A\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001E\u0010\u001B¨\u0006\u001F"}, d2 = {"Lokhttp3/Cache$Companion;", "", "Lokhttp3/HttpUrl;", "url", "", "key", "(Lokhttp3/HttpUrl;)Ljava/lang/String;", "Lokio/BufferedSource;", "source", "", "readInt$okhttp", "(Lokio/BufferedSource;)I", "readInt", "Lokhttp3/Response;", "cachedResponse", "Lokhttp3/Headers;", "cachedRequest", "Lokhttp3/Request;", "newRequest", "", "varyMatches", "(Lokhttp3/Response;Lokhttp3/Headers;Lokhttp3/Request;)Z", "hasVaryAll", "(Lokhttp3/Response;)Z", "varyHeaders", "(Lokhttp3/Response;)Lokhttp3/Headers;", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCache.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,788:1\n2624#2,3:789\n*S KotlinDebug\n*F\n+ 1 Cache.kt\nokhttp3/Cache$Companion\n*L\n729#1:789,3\n*E\n"})
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static Set a(Headers headers0) {
            int v = headers0.size();
            Set set0 = null;
            for(int v1 = 0; v1 < v; ++v1) {
                if(p.equals("Vary", headers0.name(v1), true)) {
                    String s = headers0.value(v1);
                    if(set0 == null) {
                        set0 = new TreeSet(p.getCASE_INSENSITIVE_ORDER(StringCompanionObject.INSTANCE));
                    }
                    for(Object object0: StringsKt__StringsKt.split$default(s, new char[]{','}, false, 0, 6, null)) {
                        set0.add(StringsKt__StringsKt.trim(((String)object0)).toString());
                    }
                }
            }
            return set0 == null ? f0.emptySet() : set0;
        }

        public final boolean hasVaryAll(@NotNull Response response0) {
            Intrinsics.checkNotNullParameter(response0, "<this>");
            return Companion.a(response0.headers()).contains("*");
        }

        @JvmStatic
        @NotNull
        public final String key(@NotNull HttpUrl httpUrl0) {
            Intrinsics.checkNotNullParameter(httpUrl0, "url");
            return ByteString.Companion.encodeUtf8(httpUrl0.toString()).md5().hex();
        }

        public final int readInt$okhttp(@NotNull BufferedSource bufferedSource0) throws IOException {
            Intrinsics.checkNotNullParameter(bufferedSource0, "source");
            try {
                long v = bufferedSource0.readDecimalLong();
                String s = bufferedSource0.readUtf8LineStrict();
                if(v < 0L || v > 0x7FFFFFFFL || s.length() > 0) {
                    throw new IOException("expected an int but was \"" + v + s + '\"');
                }
                return (int)v;
            }
            catch(NumberFormatException numberFormatException0) {
            }
            throw new IOException(numberFormatException0.getMessage());
        }

        @NotNull
        public final Headers varyHeaders(@NotNull Response response0) {
            Intrinsics.checkNotNullParameter(response0, "<this>");
            Response response1 = response0.networkResponse();
            Intrinsics.checkNotNull(response1);
            Headers headers0 = response1.request().headers();
            Set set0 = Companion.a(response0.headers());
            if(set0.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            Builder headers$Builder0 = new Builder();
            int v = headers0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                String s = headers0.name(v1);
                if(set0.contains(s)) {
                    headers$Builder0.add(s, headers0.value(v1));
                }
            }
            return headers$Builder0.build();
        }

        public final boolean varyMatches(@NotNull Response response0, @NotNull Headers headers0, @NotNull Request request0) {
            Intrinsics.checkNotNullParameter(response0, "cachedResponse");
            Intrinsics.checkNotNullParameter(headers0, "cachedRequest");
            Intrinsics.checkNotNullParameter(request0, "newRequest");
            Iterable iterable0 = Companion.a(response0.headers());
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object0: iterable0) {
                    if(!Intrinsics.areEqual(headers0.values(((String)object0)), request0.headers(((String)object0)))) {
                        return false;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return true;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final DiskLruCache a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "directory", imports = {}))
    @JvmName(name = "-deprecated_directory")
    @NotNull
    public final File -deprecated_directory() {
        return this.a.getDirectory();
    }

    static {
        Cache.Companion = new Companion(null);
    }

    public Cache(@NotNull File file0, long v) {
        Intrinsics.checkNotNullParameter(file0, "directory");
        this(file0, v, FileSystem.SYSTEM);
    }

    public Cache(@NotNull File file0, long v, @NotNull FileSystem fileSystem0) {
        Intrinsics.checkNotNullParameter(file0, "directory");
        Intrinsics.checkNotNullParameter(fileSystem0, "fileSystem");
        super();
        this.a = new DiskLruCache(fileSystem0, file0, 201105, 2, v, TaskRunner.INSTANCE);
    }

    @Override
    public void close() throws IOException {
        this.a.close();
    }

    public final void delete() throws IOException {
        this.a.delete();
    }

    @JvmName(name = "directory")
    @NotNull
    public final File directory() {
        return this.a.getDirectory();
    }

    public final void evictAll() throws IOException {
        this.a.evictAll();
    }

    @Override
    public void flush() throws IOException {
        this.a.flush();
    }

    @Nullable
    public final Response get$okhttp(@NotNull Request request0) {
        c c0;
        Snapshot diskLruCache$Snapshot0;
        Intrinsics.checkNotNullParameter(request0, "request");
        Companion cache$Companion0 = Cache.Companion;
        String s = cache$Companion0.key(request0.url());
        try {
            diskLruCache$Snapshot0 = this.a.get(s);
            if(diskLruCache$Snapshot0 == null) {
                return null;
            }
            goto label_6;
        }
        catch(IOException unused_ex) {
        }
        return null;
        try {
        label_6:
            c0 = new c(diskLruCache$Snapshot0.getSource(0));
        }
        catch(IOException unused_ex) {
            Util.closeQuietly(diskLruCache$Snapshot0);
            return null;
        }
        Intrinsics.checkNotNullParameter(diskLruCache$Snapshot0, "snapshot");
        String s1 = c0.g.get("Content-Type");
        String s2 = c0.g.get("Content-Length");
        Request request1 = new okhttp3.Request.Builder().url(c0.a).method(c0.c, null).headers(c0.b).build();
        Response response0 = new okhttp3.Response.Builder().request(request1).protocol(c0.d).code(c0.e).message(c0.f).headers(c0.g).body(new b(diskLruCache$Snapshot0, s1, s2)).handshake(c0.h).sentRequestAtMillis(c0.i).receivedResponseAtMillis(c0.j).build();
        Intrinsics.checkNotNullParameter(request0, "request");
        Intrinsics.checkNotNullParameter(response0, "response");
        if(Intrinsics.areEqual(c0.a, request0.url()) && Intrinsics.areEqual(c0.c, request0.method()) && cache$Companion0.varyMatches(response0, c0.b, request0)) {
            return response0;
        }
        ResponseBody responseBody0 = response0.body();
        if(responseBody0 != null) {
            Util.closeQuietly(responseBody0);
        }
        return null;
    }

    @NotNull
    public final DiskLruCache getCache$okhttp() {
        return this.a;
    }

    public final int getWriteAbortCount$okhttp() {
        return this.c;
    }

    public final int getWriteSuccessCount$okhttp() {
        return this.b;
    }

    public final int hitCount() {
        synchronized(this) {
        }
        return this.e;
    }

    public final void initialize() throws IOException {
        this.a.initialize();
    }

    public final boolean isClosed() {
        return this.a.isClosed();
    }

    @JvmStatic
    @NotNull
    public static final String key(@NotNull HttpUrl httpUrl0) {
        return Cache.Companion.key(httpUrl0);
    }

    public final long maxSize() {
        return this.a.getMaxSize();
    }

    public final int networkCount() {
        synchronized(this) {
        }
        return this.d;
    }

    @Nullable
    public final CacheRequest put$okhttp(@NotNull Response response0) {
        Editor diskLruCache$Editor0;
        Intrinsics.checkNotNullParameter(response0, "response");
        String s = response0.request().method();
        if(HttpMethod.INSTANCE.invalidatesCache(response0.request().method())) {
            try {
                this.remove$okhttp(response0.request());
            }
            catch(IOException unused_ex) {
            }
            return null;
        }
        if(!Intrinsics.areEqual(s, "GET")) {
            return null;
        }
        Companion cache$Companion0 = Cache.Companion;
        if(cache$Companion0.hasVaryAll(response0)) {
            return null;
        }
        c c0 = new c(response0);
        try {
            String s1 = cache$Companion0.key(response0.request().url());
            diskLruCache$Editor0 = null;
            diskLruCache$Editor0 = DiskLruCache.edit$default(this.a, s1, 0L, 2, null);
            if(diskLruCache$Editor0 != null) {
                c0.c(diskLruCache$Editor0);
                return new a(this, diskLruCache$Editor0);
            }
        }
        catch(IOException unused_ex) {
            if(diskLruCache$Editor0 != null) {
                try {
                    diskLruCache$Editor0.abort();
                }
                catch(IOException unused_ex) {
                }
            }
        }
        return null;
    }

    public final void remove$okhttp(@NotNull Request request0) throws IOException {
        Intrinsics.checkNotNullParameter(request0, "request");
        String s = Cache.Companion.key(request0.url());
        this.a.remove(s);
    }

    public final int requestCount() {
        synchronized(this) {
        }
        return this.f;
    }

    public final void setWriteAbortCount$okhttp(int v) {
        this.c = v;
    }

    public final void setWriteSuccessCount$okhttp(int v) {
        this.b = v;
    }

    public final long size() throws IOException {
        return this.a.size();
    }

    public final void trackConditionalCacheHit$okhttp() {
        synchronized(this) {
            ++this.e;
        }
    }

    public final void trackResponse$okhttp(@NotNull CacheStrategy cacheStrategy0) {
        synchronized(this) {
            Intrinsics.checkNotNullParameter(cacheStrategy0, "cacheStrategy");
            ++this.f;
            if(cacheStrategy0.getNetworkRequest() != null) {
                ++this.d;
            }
            else if(cacheStrategy0.getCacheResponse() != null) {
                ++this.e;
            }
        }
    }

    public final void update$okhttp(@NotNull Response response0, @NotNull Response response1) {
        Editor diskLruCache$Editor0;
        Intrinsics.checkNotNullParameter(response0, "cached");
        Intrinsics.checkNotNullParameter(response1, "network");
        c c0 = new c(response1);
        ResponseBody responseBody0 = response0.body();
        Intrinsics.checkNotNull(responseBody0, "null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        Snapshot diskLruCache$Snapshot0 = ((b)responseBody0).b;
        try {
            diskLruCache$Editor0 = null;
            diskLruCache$Editor0 = diskLruCache$Snapshot0.edit();
            if(diskLruCache$Editor0 != null) {
                c0.c(diskLruCache$Editor0);
                diskLruCache$Editor0.commit();
            }
        }
        catch(IOException unused_ex) {
            if(diskLruCache$Editor0 != null) {
                try {
                    diskLruCache$Editor0.abort();
                }
                catch(IOException unused_ex) {
                }
            }
        }
    }

    @NotNull
    public final Iterator urls() throws IOException {
        return new Object() {
            public final Iterator a;
            public String b;
            public boolean c;

            {
                this.a = cache0.getCache$okhttp().snapshots();
            }

            @Override
            public boolean hasNext() {
                Closeable closeable0;
                if(this.b != null) {
                    return true;
                }
                this.c = false;
            label_3:
                Iterator iterator0 = this.a;
                if(iterator0.hasNext()) {
                    try {
                        Object object0 = iterator0.next();
                        closeable0 = (Closeable)object0;
                    }
                    catch(IOException unused_ex) {
                        goto label_3;
                    }
                    try {
                        this.b = Okio.buffer(((Snapshot)closeable0).getSource(0)).readUtf8LineStrict();
                        goto label_12;
                    }
                    catch(Throwable throwable0) {
                        try {
                            CloseableKt.closeFinally(closeable0, throwable0);
                            throw throwable0;
                        label_12:
                            CloseableKt.closeFinally(closeable0, null);
                            return true;
                        }
                        catch(IOException unused_ex) {
                            goto label_3;
                        }
                    }
                }
                return false;
            }

            @Override
            public Object next() {
                return this.next();
            }

            @NotNull
            public String next() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                String s = this.b;
                Intrinsics.checkNotNull(s);
                this.b = null;
                this.c = true;
                return s;
            }

            @Override
            public void remove() {
                if(!this.c) {
                    throw new IllegalStateException("remove() before next()");
                }
                this.a.remove();
            }
        };
    }

    public final int writeAbortCount() {
        synchronized(this) {
        }
        return this.c;
    }

    public final int writeSuccessCount() {
        synchronized(this) {
        }
        return this.b;
    }
}

