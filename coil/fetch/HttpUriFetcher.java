package coil.fetch;

import android.net.Uri;
import android.os.NetworkOnMainThreadException;
import android.webkit.MimeTypeMap;
import androidx.annotation.VisibleForTesting;
import coil.ImageLoader;
import coil.decode.DataSource;
import coil.decode.ImageSource;
import coil.decode.ImageSources;
import coil.disk.DiskCache.Editor;
import coil.disk.DiskCache.Snapshot;
import coil.disk.DiskCache;
import coil.network.CacheResponse;
import coil.network.CacheStrategy;
import coil.network.HttpException;
import coil.request.Options;
import coil.util.-Calls;
import coil.util.-Utils;
import java.io.IOException;
import java.util.Map.Entry;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import md.b;
import okhttp3.CacheControl.Builder;
import okhttp3.CacheControl;
import okhttp3.Call;
import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.FileSystem;
import okio.Okio;
import okio.Path;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import t5.a;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0002\u0017\u0018B=\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000E\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0001¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0019"}, d2 = {"Lcoil/fetch/HttpUriFetcher;", "Lcoil/fetch/Fetcher;", "", "url", "Lcoil/request/Options;", "options", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "callFactory", "Lcoil/disk/DiskCache;", "diskCache", "", "respectCacheHeaders", "<init>", "(Ljava/lang/String;Lcoil/request/Options;Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "Lcoil/fetch/FetchResult;", "fetch", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lokhttp3/MediaType;", "contentType", "getMimeType$coil_base_release", "(Ljava/lang/String;Lokhttp3/MediaType;)Ljava/lang/String;", "getMimeType", "Companion", "Factory", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nHttpUriFetcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n+ 2 FileSystem.kt\nokio/FileSystem\n+ 3 Okio.kt\nokio/Okio__OkioKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,304:1\n80#2:305\n165#2:306\n81#2:307\n82#2:313\n80#2:340\n165#2:341\n81#2:342\n82#2:348\n80#2:375\n165#2:376\n81#2:377\n82#2:383\n67#2:414\n68#2:420\n52#3,5:308\n60#3,10:314\n57#3,16:324\n52#3,5:343\n60#3,10:349\n57#3,16:359\n52#3,5:378\n60#3,10:384\n57#3,16:394\n66#3:413\n52#3,5:415\n60#3,10:421\n57#3,2:431\n71#3,2:433\n215#4,2:410\n1#5:412\n*S KotlinDebug\n*F\n+ 1 HttpUriFetcher.kt\ncoil/fetch/HttpUriFetcher\n*L\n162#1:305\n162#1:306\n162#1:307\n162#1:313\n167#1:340\n167#1:341\n167#1:342\n167#1:348\n170#1:375\n170#1:376\n170#1:377\n170#1:383\n255#1:414\n255#1:420\n162#1:308,5\n162#1:314,10\n162#1:324,16\n167#1:343,5\n167#1:349,10\n167#1:359,16\n170#1:378,5\n170#1:384,10\n170#1:394,16\n255#1:413\n255#1:415,5\n255#1:421,10\n255#1:431,2\n255#1:433,2\n190#1:410,2\n*E\n"})
public final class HttpUriFetcher implements Fetcher {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil/fetch/HttpUriFetcher$Companion;", "", "Lokhttp3/CacheControl;", "CACHE_CONTROL_FORCE_NETWORK_NO_CACHE", "Lokhttp3/CacheControl;", "CACHE_CONTROL_NO_NETWORK_NO_CACHE", "", "MIME_TYPE_TEXT_PLAIN", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B-\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0003\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ)\u0010\u0012\u001A\u0004\u0018\u00010\u00112\u0006\u0010\f\u001A\u00020\u00022\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcoil/fetch/HttpUriFetcher$Factory;", "Lcoil/fetch/Fetcher$Factory;", "Landroid/net/Uri;", "Lkotlin/Lazy;", "Lokhttp3/Call$Factory;", "callFactory", "Lcoil/disk/DiskCache;", "diskCache", "", "respectCacheHeaders", "<init>", "(Lkotlin/Lazy;Lkotlin/Lazy;Z)V", "data", "Lcoil/request/Options;", "options", "Lcoil/ImageLoader;", "imageLoader", "Lcoil/fetch/Fetcher;", "create", "(Landroid/net/Uri;Lcoil/request/Options;Lcoil/ImageLoader;)Lcoil/fetch/Fetcher;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Factory implements coil.fetch.Fetcher.Factory {
        public final Lazy a;
        public final Lazy b;
        public final boolean c;

        public Factory(@NotNull Lazy lazy0, @NotNull Lazy lazy1, boolean z) {
            this.a = lazy0;
            this.b = lazy1;
            this.c = z;
        }

        @Nullable
        public Fetcher create(@NotNull Uri uri0, @NotNull Options options0, @NotNull ImageLoader imageLoader0) {
            return !Intrinsics.areEqual(uri0.getScheme(), "http") && !Intrinsics.areEqual(uri0.getScheme(), "https") ? null : new HttpUriFetcher(uri0.toString(), options0, this.a, this.b, this.c);
        }

        @Override  // coil.fetch.Fetcher$Factory
        public Fetcher create(Object object0, Options options0, ImageLoader imageLoader0) {
            return this.create(((Uri)object0), options0, imageLoader0);
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public final Options b;
    public final Lazy c;
    public final Lazy d;
    public final boolean e;
    public static final CacheControl f;
    public static final CacheControl g;

    static {
        HttpUriFetcher.Companion = new Companion(null);
        HttpUriFetcher.f = new Builder().noCache().noStore().build();
        HttpUriFetcher.g = new Builder().noCache().onlyIfCached().build();
    }

    public HttpUriFetcher(@NotNull String s, @NotNull Options options0, @NotNull Lazy lazy0, @NotNull Lazy lazy1, boolean z) {
        this.a = s;
        this.b = options0;
        this.c = lazy0;
        this.d = lazy1;
        this.e = z;
    }

    public final Object a(Request request0, Continuation continuation0) {
        Response response0;
        a a0;
        if(continuation0 instanceof a) {
            a0 = (a)continuation0;
            int v = a0.q;
            if((v & 0x80000000) == 0) {
                a0 = new a(this, continuation0);
            }
            else {
                a0.q = v ^ 0x80000000;
            }
        }
        else {
            a0 = new a(this, continuation0);
        }
        Object object0 = a0.o;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        switch(a0.q) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                boolean z = -Utils.isMainThread();
                Lazy lazy0 = this.c;
                if(z) {
                    if(this.b.getNetworkCachePolicy().getReadEnabled()) {
                        throw new NetworkOnMainThreadException();
                    }
                    response0 = ((okhttp3.Call.Factory)lazy0.getValue()).newCall(request0).execute();
                    break;
                }
                else {
                    Call call0 = ((okhttp3.Call.Factory)lazy0.getValue()).newCall(request0);
                    a0.q = 1;
                    object0 = -Calls.await(call0, a0);
                    if(object0 == object1) {
                        return object1;
                    }
                    response0 = (Response)object0;
                }
                break;
            }
            case 1: {
                ResultKt.throwOnFailure(object0);
                response0 = (Response)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(!response0.isSuccessful() && response0.code() != 304) {
            ResponseBody responseBody0 = response0.body();
            if(responseBody0 != null) {
                -Utils.closeQuietly(responseBody0);
            }
            throw new HttpException(response0);
        }
        return response0;
    }

    public final FileSystem b() {
        Object object0 = this.d.getValue();
        Intrinsics.checkNotNull(object0);
        return ((DiskCache)object0).getFileSystem();
    }

    public final Request c() {
        okhttp3.Request.Builder request$Builder0 = new okhttp3.Request.Builder().url(this.a);
        Options options0 = this.b;
        okhttp3.Request.Builder request$Builder1 = request$Builder0.headers(options0.getHeaders());
        for(Object object0: options0.getTags().asMap().entrySet()) {
            Object object1 = ((Map.Entry)object0).getKey();
            Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            request$Builder1.tag(((Class)object1), ((Map.Entry)object0).getValue());
        }
        boolean z = options0.getDiskCachePolicy().getReadEnabled();
        boolean z1 = options0.getNetworkCachePolicy().getReadEnabled();
        if(!z1 && z) {
            request$Builder1.cacheControl(CacheControl.FORCE_CACHE);
            return request$Builder1.build();
        }
        if(z1 && !z) {
            if(options0.getDiskCachePolicy().getWriteEnabled()) {
                request$Builder1.cacheControl(CacheControl.FORCE_NETWORK);
                return request$Builder1.build();
            }
            request$Builder1.cacheControl(HttpUriFetcher.f);
            return request$Builder1.build();
        }
        if(!z1 && !z) {
            request$Builder1.cacheControl(HttpUriFetcher.g);
        }
        return request$Builder1.build();
    }

    public final CacheResponse d(Snapshot diskCache$Snapshot0) {
        Throwable throwable2;
        CacheResponse cacheResponse0;
        try {
            BufferedSource bufferedSource0 = Okio.buffer(this.b().source(diskCache$Snapshot0.getMetadata()));
            try {
                cacheResponse0 = new CacheResponse(bufferedSource0);
            }
            catch(Throwable throwable0) {
                if(bufferedSource0 != null) {
                    try {
                        bufferedSource0.close();
                    }
                    catch(Throwable throwable1) {
                        b.addSuppressed(throwable0, throwable1);
                    }
                }
                throwable2 = throwable0;
                cacheResponse0 = null;
                goto label_18;
            }
            if(bufferedSource0 == null) {
            label_17:
                throwable2 = null;
            }
            else {
                try {
                    bufferedSource0.close();
                    goto label_17;
                }
                catch(Throwable throwable2) {
                }
            }
        label_18:
            if(throwable2 != null) {
                throw throwable2;
            }
            Intrinsics.checkNotNull(cacheResponse0);
            return cacheResponse0;
        }
        catch(IOException unused_ex) {
            return null;
        }
    }

    public final ImageSource e(Snapshot diskCache$Snapshot0) {
        Path path0 = diskCache$Snapshot0.getData();
        FileSystem fileSystem0 = this.b();
        String s = this.b.getDiskCacheKey();
        if(s == null) {
            s = this.a;
        }
        return ImageSources.create(path0, fileSystem0, s, diskCache$Snapshot0);
    }

    public final Snapshot f(Snapshot diskCache$Snapshot0, Request request0, Response response0, CacheResponse cacheResponse0) {
        Long long0;
        BufferedSink bufferedSink2;
        Throwable throwable5;
        Unit unit1;
        BufferedSink bufferedSink1;
        Unit unit0;
        BufferedSink bufferedSink0;
        Response response1;
        Editor diskCache$Editor0;
        Options options0 = this.b;
        Throwable throwable0 = null;
        if(options0.getDiskCachePolicy().getWriteEnabled() && (!this.e || CacheStrategy.Companion.isCacheable(request0, response0))) {
            if(diskCache$Snapshot0 == null) {
                DiskCache diskCache0 = (DiskCache)this.d.getValue();
                diskCache$Editor0 = diskCache0 == null ? null : diskCache0.openEditor((options0.getDiskCacheKey() == null ? this.a : options0.getDiskCacheKey()));
            }
            else {
                diskCache$Editor0 = diskCache$Snapshot0.closeAndOpenEditor();
            }
            if(diskCache$Editor0 == null) {
                return null;
            }
            try {
                if(response0.code() != 304 || cacheResponse0 == null) {
                    goto label_35;
                }
                else {
                    response1 = response0.newBuilder().headers(CacheStrategy.Companion.combineHeaders(cacheResponse0.getResponseHeaders(), response0.headers())).build();
                    bufferedSink0 = Okio.buffer(this.b().sink(diskCache$Editor0.getMetadata(), false));
                    goto label_14;
                }
                return diskCache$Editor0.commitAndOpenSnapshot();
            }
            catch(Exception exception0) {
                -Utils.abortQuietly(diskCache$Editor0);
                throw exception0;
            }
            finally {
                -Utils.closeQuietly(response0);
            }
            try {
            label_14:
                new CacheResponse(response1).writeTo(bufferedSink0);
                unit0 = Unit.INSTANCE;
            }
            catch(Throwable throwable1) {
                if(bufferedSink0 != null) {
                    try {
                        bufferedSink0.close();
                    }
                    catch(Throwable throwable2) {
                        try {
                            b.addSuppressed(throwable1, throwable2);
                            throwable0 = throwable1;
                            unit0 = null;
                            goto label_30;
                        }
                        catch(Exception exception0) {
                            -Utils.abortQuietly(diskCache$Editor0);
                            throw exception0;
                        }
                    }
                }
                throwable0 = throwable1;
                unit0 = null;
                goto label_30;
            }
            if(bufferedSink0 != null) {
                try {
                    bufferedSink0.close();
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_30:
                if(throwable0 != null) {
                    throw throwable0;
                }
                Intrinsics.checkNotNull(unit0);
                return diskCache$Editor0.commitAndOpenSnapshot();
            label_35:
                bufferedSink1 = Okio.buffer(this.b().sink(diskCache$Editor0.getMetadata(), false));
            }
            catch(Exception exception0) {
                -Utils.abortQuietly(diskCache$Editor0);
                throw exception0;
            }
            try {
                new CacheResponse(response0).writeTo(bufferedSink1);
                unit1 = Unit.INSTANCE;
            }
            catch(Throwable throwable3) {
                if(bufferedSink1 != null) {
                    try {
                        bufferedSink1.close();
                    }
                    catch(Throwable throwable4) {
                        try {
                            b.addSuppressed(throwable3, throwable4);
                            throwable5 = throwable3;
                            unit1 = null;
                            goto label_54;
                        }
                        catch(Exception exception0) {
                            -Utils.abortQuietly(diskCache$Editor0);
                            throw exception0;
                        }
                    }
                }
                throwable5 = throwable3;
                unit1 = null;
                goto label_54;
            }
            if(bufferedSink1 != null) {
                try {
                    bufferedSink1.close();
                }
                catch(Throwable throwable5) {
                    goto label_54;
                }
            }
            throwable5 = null;
            try {
            label_54:
                if(throwable5 != null) {
                    throw throwable5;
                }
                Intrinsics.checkNotNull(unit1);
                bufferedSink2 = Okio.buffer(this.b().sink(diskCache$Editor0.getData(), false));
            }
            catch(Exception exception0) {
                -Utils.abortQuietly(diskCache$Editor0);
                throw exception0;
            }
            try {
                ResponseBody responseBody0 = response0.body();
                Intrinsics.checkNotNull(responseBody0);
                long0 = responseBody0.source().readAll(bufferedSink2);
            }
            catch(Throwable throwable6) {
                if(bufferedSink2 != null) {
                    try {
                        bufferedSink2.close();
                    }
                    catch(Throwable throwable7) {
                        try {
                            b.addSuppressed(throwable6, throwable7);
                            throwable0 = throwable6;
                            long0 = null;
                            goto label_76;
                        }
                        catch(Exception exception0) {
                            -Utils.abortQuietly(diskCache$Editor0);
                            throw exception0;
                        }
                    }
                }
                throwable0 = throwable6;
                long0 = null;
                goto label_76;
            }
            if(bufferedSink2 != null) {
                try {
                    bufferedSink2.close();
                }
                catch(Throwable throwable0) {
                }
            }
            try {
            label_76:
                if(throwable0 != null) {
                    throw throwable0;
                }
                Intrinsics.checkNotNull(long0);
                return diskCache$Editor0.commitAndOpenSnapshot();
            }
            catch(Exception exception0) {
            }
            -Utils.abortQuietly(diskCache$Editor0);
            throw exception0;
        }
        if(diskCache$Snapshot0 != null) {
            -Utils.closeQuietly(diskCache$Snapshot0);
        }
        return null;
    }

    @Override  // coil.fetch.Fetcher
    @Nullable
    public Object fetch(@NotNull Continuation continuation0) {
        HttpUriFetcher httpUriFetcher1;
        Response response1;
        Object object3;
        ResponseBody responseBody0;
        Response response0;
        CacheStrategy cacheStrategy1;
        Snapshot diskCache$Snapshot2;
        HttpUriFetcher httpUriFetcher0;
        Exception exception1;
        Snapshot diskCache$Snapshot1;
        Object object2;
        CacheStrategy cacheStrategy0;
        Snapshot diskCache$Snapshot0;
        t5.b b0;
        if(continuation0 instanceof t5.b) {
            b0 = (t5.b)continuation0;
            int v = b0.t;
            if((v & 0x80000000) == 0) {
                b0 = new t5.b(this, continuation0);
            }
            else {
                b0.t = v ^ 0x80000000;
            }
        }
        else {
            b0 = new t5.b(this, continuation0);
        }
        Object object0 = b0.r;
        Object object1 = qd.a.getCOROUTINE_SUSPENDED();
        MediaType mediaType0 = null;
        switch(b0.t) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Options options0 = this.b;
                String s = this.a;
                if(options0.getDiskCachePolicy().getReadEnabled()) {
                    DiskCache diskCache0 = (DiskCache)this.d.getValue();
                    diskCache$Snapshot0 = diskCache0 == null ? null : diskCache0.openSnapshot((options0.getDiskCacheKey() == null ? s : options0.getDiskCacheKey()));
                }
                else {
                    diskCache$Snapshot0 = null;
                }
                try {
                    if(diskCache$Snapshot0 == null) {
                        cacheStrategy0 = new coil.network.CacheStrategy.Factory(this.c(), null).compute();
                    }
                    else {
                        Long long0 = this.b().metadata(diskCache$Snapshot0.getMetadata()).getSize();
                        if(long0 != null && ((long)long0) == 0L) {
                            return new SourceResult(this.e(diskCache$Snapshot0), this.getMimeType$coil_base_release(s, null), DataSource.DISK);
                        }
                        if(!this.e) {
                            ImageSource imageSource0 = this.e(diskCache$Snapshot0);
                            CacheResponse cacheResponse0 = this.d(diskCache$Snapshot0);
                            if(cacheResponse0 != null) {
                                mediaType0 = cacheResponse0.getContentType();
                            }
                            return new SourceResult(imageSource0, this.getMimeType$coil_base_release(s, mediaType0), DataSource.DISK);
                        }
                        cacheStrategy0 = new coil.network.CacheStrategy.Factory(this.c(), this.d(diskCache$Snapshot0)).compute();
                        if(cacheStrategy0.getNetworkRequest() == null && cacheStrategy0.getCacheResponse() != null) {
                            return new SourceResult(this.e(diskCache$Snapshot0), this.getMimeType$coil_base_release(s, cacheStrategy0.getCacheResponse().getContentType()), DataSource.DISK);
                        }
                    }
                    Request request0 = cacheStrategy0.getNetworkRequest();
                    Intrinsics.checkNotNull(request0);
                    b0.o = this;
                    b0.p = diskCache$Snapshot0;
                    b0.q = cacheStrategy0;
                    b0.t = 1;
                    object2 = this.a(request0, b0);
                }
                catch(Exception exception0) {
                    diskCache$Snapshot1 = diskCache$Snapshot0;
                    exception1 = exception0;
                    goto label_113;
                }
                if(object2 == object1) {
                    return object1;
                }
                try {
                    httpUriFetcher0 = this;
                    diskCache$Snapshot2 = diskCache$Snapshot0;
                    cacheStrategy1 = cacheStrategy0;
                    response0 = (Response)object2;
                    responseBody0 = -Utils.requireBody(response0);
                    goto label_70;
                }
                catch(Exception exception1) {
                    goto label_112;
                }
            }
            case 1: {
                CacheStrategy cacheStrategy2 = (CacheStrategy)b0.q;
                diskCache$Snapshot1 = b0.p;
                httpUriFetcher0 = b0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    cacheStrategy1 = cacheStrategy2;
                    diskCache$Snapshot2 = diskCache$Snapshot1;
                }
                catch(Exception exception1) {
                    goto label_113;
                }
                try {
                    response0 = (Response)object0;
                    responseBody0 = -Utils.requireBody(response0);
                }
                catch(Exception exception1) {
                    goto label_112;
                }
                try {
                label_70:
                    diskCache$Snapshot2 = httpUriFetcher0.f(diskCache$Snapshot2, cacheStrategy1.getNetworkRequest(), response0, cacheStrategy1.getCacheResponse());
                    String s1 = httpUriFetcher0.a;
                    if(diskCache$Snapshot2 != null) {
                        ImageSource imageSource1 = httpUriFetcher0.e(diskCache$Snapshot2);
                        CacheResponse cacheResponse1 = httpUriFetcher0.d(diskCache$Snapshot2);
                        if(cacheResponse1 != null) {
                            mediaType0 = cacheResponse1.getContentType();
                        }
                        return new SourceResult(imageSource1, httpUriFetcher0.getMimeType$coil_base_release(s1, mediaType0), DataSource.NETWORK);
                    }
                    if(responseBody0.contentLength() > 0L) {
                        return new SourceResult(ImageSources.create(responseBody0.source(), httpUriFetcher0.b.getContext()), httpUriFetcher0.getMimeType$coil_base_release(s1, responseBody0.contentType()), (response0.networkResponse() == null ? DataSource.DISK : DataSource.NETWORK));
                    }
                    -Utils.closeQuietly(response0);
                    Request request1 = httpUriFetcher0.c();
                    b0.o = httpUriFetcher0;
                    b0.p = null;
                    b0.q = response0;
                    b0.t = 2;
                    object3 = httpUriFetcher0.a(request1, b0);
                    if(object3 == object1) {
                        return object1;
                    }
                }
                catch(Exception exception2) {
                    goto label_107;
                }
                response1 = response0;
                object0 = object3;
                httpUriFetcher1 = httpUriFetcher0;
                response0 = (Response)object0;
                goto label_101;
            }
            case 2: {
                response1 = (Response)b0.q;
                diskCache$Snapshot2 = b0.p;
                httpUriFetcher1 = b0.o;
                try {
                    ResultKt.throwOnFailure(object0);
                    response0 = (Response)object0;
                    goto label_101;
                }
                catch(Exception exception3) {
                }
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        goto label_109;
        try {
        label_101:
            ResponseBody responseBody1 = -Utils.requireBody(response0);
            httpUriFetcher1.getClass();
            ImageSource imageSource2 = ImageSources.create(responseBody1.source(), httpUriFetcher1.b.getContext());
            MediaType mediaType1 = responseBody1.contentType();
            return new SourceResult(imageSource2, httpUriFetcher1.getMimeType$coil_base_release(httpUriFetcher1.a, mediaType1), (response0.networkResponse() == null ? DataSource.DISK : DataSource.NETWORK));
        }
        catch(Exception exception2) {
        label_107:
            response1 = response0;
            exception3 = exception2;
        }
        try {
        label_109:
            -Utils.closeQuietly(response1);
            throw exception3;
        }
        catch(Exception exception1) {
        label_112:
            diskCache$Snapshot1 = diskCache$Snapshot2;
        }
    label_113:
        if(diskCache$Snapshot1 != null) {
            -Utils.closeQuietly(diskCache$Snapshot1);
        }
        throw exception1;
    }

    @VisibleForTesting
    @Nullable
    public final String getMimeType$coil_base_release(@NotNull String s, @Nullable MediaType mediaType0) {
        String s1 = mediaType0 == null ? null : mediaType0.toString();
        if(s1 == null || p.startsWith$default(s1, "text/plain", false, 2, null)) {
            String s2 = -Utils.getMimeTypeFromUrl(MimeTypeMap.getSingleton(), s);
            if(s2 != null) {
                return s2;
            }
        }
        return s1 == null ? null : StringsKt__StringsKt.substringBefore$default(s1, ';', null, 2, null);
    }
}

