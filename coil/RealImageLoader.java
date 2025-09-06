package coil;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import coil.decode.DataSource;
import coil.disk.DiskCache;
import coil.intercept.EngineInterceptor;
import coil.key.FileKeyer;
import coil.key.UriKeyer;
import coil.map.ByteArrayMapper;
import coil.map.FileUriMapper;
import coil.map.HttpUrlMapper;
import coil.map.ResourceIntMapper;
import coil.map.ResourceUriMapper;
import coil.map.StringMapper;
import coil.memory.MemoryCache.Key;
import coil.memory.MemoryCache.Value;
import coil.memory.MemoryCache;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ErrorResult;
import coil.request.ImageRequest.Listener;
import coil.request.ImageRequest;
import coil.request.ImageResult;
import coil.request.NullRequestData;
import coil.request.NullRequestDataException;
import coil.request.OneShotDisposable;
import coil.request.RequestDelegate;
import coil.request.RequestService;
import coil.request.SuccessResult;
import coil.size.Size;
import coil.target.Target;
import coil.target.ViewTarget;
import coil.transition.NoneTransition;
import coil.transition.Transition;
import coil.transition.TransitionTarget;
import coil.util.-Lifecycles;
import coil.util.-Logs;
import coil.util.-Utils;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import coil.util.SystemCallbacks;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.SupervisorKt;
import o5.b;
import o5.d;
import o5.e;
import o5.f;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b0\b\u0000\u0018\u0000 V2\u00020\u0001:\u0001VBg\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u000E\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u000E\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0006\u0012\f\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u0006\u0012\u0006\u0010\u000E\u001A\u00020\r\u0012\u0006\u0010\u0010\u001A\u00020\u000F\u0012\u0006\u0010\u0012\u001A\u00020\u0011\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u00A2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u0018\u0010\u001D\u001A\u00020\u001C2\u0006\u0010\u0018\u001A\u00020\u0017H\u0096@\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u0017\u0010$\u001A\u00020!2\u0006\u0010 \u001A\u00020\u001FH\u0000\u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010%\u001A\u00020!H\u0016\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010(\u001A\u00020\'H\u0016\u00A2\u0006\u0004\b(\u0010)R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u001A\u0010\u0005\u001A\u00020\u00048\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u001F\u0010\b\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u001F\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u00068\u0006\u00A2\u0006\f\n\u0004\b6\u00103\u001A\u0004\b7\u00105R\u001D\u0010\f\u001A\b\u0012\u0004\u0012\u00020\u000B0\u00068\u0006\u00A2\u0006\f\n\u0004\b8\u00103\u001A\u0004\b9\u00105R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u0017\u0010\u0010\u001A\u00020\u000F8\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010AR\u0017\u0010\u0012\u001A\u00020\u00118\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u001A\u0010L\u001A\u00020\u000F8\u0016X\u0096\u0004\u00A2\u0006\f\n\u0004\bJ\u0010?\u001A\u0004\bK\u0010AR\u001D\u0010Q\u001A\u0004\u0018\u00010\u00078VX\u0096\u0084\u0002\u00A2\u0006\f\u001A\u0004\bM\u0010N*\u0004\bO\u0010PR\u001D\u0010U\u001A\u0004\u0018\u00010\t8VX\u0096\u0084\u0002\u00A2\u0006\f\u001A\u0004\bR\u0010S*\u0004\bT\u0010P\u00A8\u0006W"}, d2 = {"Lcoil/RealImageLoader;", "Lcoil/ImageLoader;", "Landroid/content/Context;", "context", "Lcoil/request/DefaultRequestOptions;", "defaults", "Lkotlin/Lazy;", "Lcoil/memory/MemoryCache;", "memoryCacheLazy", "Lcoil/disk/DiskCache;", "diskCacheLazy", "Lokhttp3/Call$Factory;", "callFactoryLazy", "Lcoil/EventListener$Factory;", "eventListenerFactory", "Lcoil/ComponentRegistry;", "componentRegistry", "Lcoil/util/ImageLoaderOptions;", "options", "Lcoil/util/Logger;", "logger", "<init>", "(Landroid/content/Context;Lcoil/request/DefaultRequestOptions;Lkotlin/Lazy;Lkotlin/Lazy;Lkotlin/Lazy;Lcoil/EventListener$Factory;Lcoil/ComponentRegistry;Lcoil/util/ImageLoaderOptions;Lcoil/util/Logger;)V", "Lcoil/request/ImageRequest;", "request", "Lcoil/request/Disposable;", "enqueue", "(Lcoil/request/ImageRequest;)Lcoil/request/Disposable;", "Lcoil/request/ImageResult;", "execute", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "level", "", "onTrimMemory$coil_base_release", "(I)V", "onTrimMemory", "shutdown", "()V", "Lcoil/ImageLoader$Builder;", "newBuilder", "()Lcoil/ImageLoader$Builder;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "c", "Lkotlin/Lazy;", "getMemoryCacheLazy", "()Lkotlin/Lazy;", "d", "getDiskCacheLazy", "e", "getCallFactoryLazy", "f", "Lcoil/EventListener$Factory;", "getEventListenerFactory", "()Lcoil/EventListener$Factory;", "g", "Lcoil/ComponentRegistry;", "getComponentRegistry", "()Lcoil/ComponentRegistry;", "h", "Lcoil/util/ImageLoaderOptions;", "getOptions", "()Lcoil/util/ImageLoaderOptions;", "i", "Lcoil/util/Logger;", "getLogger", "()Lcoil/util/Logger;", "m", "getComponents", "components", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "getMemoryCache$delegate", "(Lcoil/RealImageLoader;)Ljava/lang/Object;", "memoryCache", "getDiskCache", "()Lcoil/disk/DiskCache;", "getDiskCache$delegate", "diskCache", "Companion", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRealImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n+ 3 ComponentRegistry.kt\ncoil/ComponentRegistry$Builder\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Utils.kt\ncoil/util/-Utils\n+ 6 Bitmaps.kt\ncoil/util/-Bitmaps\n+ 7 BitmapDrawable.kt\nandroidx/core/graphics/drawable/BitmapDrawableKt\n+ 8 Logs.kt\ncoil/util/-Logs\n*L\n1#1,292:1\n270#1,15:322\n270#1,15:341\n48#2,4:293\n138#3:297\n138#3:298\n138#3:299\n138#3:300\n138#3:301\n138#3:302\n146#3:303\n146#3:304\n154#3:305\n154#3:306\n154#3:307\n154#3:308\n154#3:309\n154#3:310\n154#3:311\n154#3:312\n1#4:313\n1#4:315\n173#5:314\n50#6:316\n28#7:317\n21#8,4:318\n21#8,4:337\n21#8,4:356\n*S KotlinDebug\n*F\n+ 1 RealImageLoader.kt\ncoil/RealImageLoader\n*L\n237#1:322,15\n251#1:341,15\n78#1:293,4\n85#1:297\n86#1:298\n87#1:299\n88#1:300\n89#1:301\n90#1:302\n92#1:303\n93#1:304\n95#1:305\n96#1:306\n97#1:307\n98#1:308\n99#1:309\n100#1:310\n101#1:311\n102#1:312\n166#1:315\n166#1:314\n167#1:316\n167#1:317\n234#1:318,4\n248#1:337,4\n257#1:356,4\n*E\n"})
public final class RealImageLoader implements ImageLoader {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcoil/RealImageLoader$Companion;", "", "", "REQUEST_TYPE_ENQUEUE", "I", "REQUEST_TYPE_EXECUTE", "", "TAG", "Ljava/lang/String;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Context a;
    public final DefaultRequestOptions b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;
    public final Factory f;
    public final ComponentRegistry g;
    public final ImageLoaderOptions h;
    public final Logger i;
    public final CoroutineScope j;
    public final SystemCallbacks k;
    public final RequestService l;
    public final ComponentRegistry m;
    public final List n;
    public final AtomicBoolean o;

    static {
        RealImageLoader.Companion = new Companion(null);
    }

    public RealImageLoader(@NotNull Context context0, @NotNull DefaultRequestOptions defaultRequestOptions0, @NotNull Lazy lazy0, @NotNull Lazy lazy1, @NotNull Lazy lazy2, @NotNull Factory eventListener$Factory0, @NotNull ComponentRegistry componentRegistry0, @NotNull ImageLoaderOptions imageLoaderOptions0, @Nullable Logger logger0) {
        this.a = context0;
        this.b = defaultRequestOptions0;
        this.c = lazy0;
        this.d = lazy1;
        this.e = lazy2;
        this.f = eventListener$Factory0;
        this.g = componentRegistry0;
        this.h = imageLoaderOptions0;
        this.i = logger0;
        this.j = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default(null, 1, null).plus(Dispatchers.getMain().getImmediate()).plus(new CoroutineExceptionHandler(this) {
            @Override  // kotlinx.coroutines.CoroutineExceptionHandler
            public void handleException(@NotNull CoroutineContext coroutineContext0, @NotNull Throwable throwable0) {
                Logger logger0 = this.b.getLogger();
                if(logger0 != null) {
                    -Logs.log(logger0, "RealImageLoader", throwable0);
                }
            }
        }));
        SystemCallbacks systemCallbacks0 = new SystemCallbacks(this);
        this.k = systemCallbacks0;
        RequestService requestService0 = new RequestService(this, systemCallbacks0, logger0);
        this.l = requestService0;
        this.m = componentRegistry0.newBuilder().add(new HttpUrlMapper(), HttpUrl.class).add(new StringMapper(), String.class).add(new FileUriMapper(), Uri.class).add(new ResourceUriMapper(), Uri.class).add(new ResourceIntMapper(), Integer.class).add(new ByteArrayMapper(), byte[].class).add(new UriKeyer(), Uri.class).add(new FileKeyer(imageLoaderOptions0.getAddLastModifiedToFileCacheKey()), File.class).add(new coil.fetch.HttpUriFetcher.Factory(lazy2, lazy1, imageLoaderOptions0.getRespectCacheHeaders()), Uri.class).add(new coil.fetch.FileFetcher.Factory(), File.class).add(new coil.fetch.AssetUriFetcher.Factory(), Uri.class).add(new coil.fetch.ContentUriFetcher.Factory(), Uri.class).add(new coil.fetch.ResourceUriFetcher.Factory(), Uri.class).add(new coil.fetch.DrawableFetcher.Factory(), Drawable.class).add(new coil.fetch.BitmapFetcher.Factory(), Bitmap.class).add(new coil.fetch.ByteBufferFetcher.Factory(), ByteBuffer.class).add(new coil.decode.BitmapFactoryDecoder.Factory(imageLoaderOptions0.getBitmapFactoryMaxParallelism(), imageLoaderOptions0.getBitmapFactoryExifOrientationPolicy())).build();
        this.n = CollectionsKt___CollectionsKt.plus(this.getComponents().getInterceptors(), new EngineInterceptor(this, systemCallbacks0, requestService0, logger0));
        this.o = new AtomicBoolean(false);
    }

    public final void a(ErrorResult errorResult0, Target target0, EventListener eventListener0) {
        ImageRequest imageRequest0 = errorResult0.getRequest();
        Logger logger0 = this.i;
        if(logger0 != null && logger0.getLevel() <= 4) {
            logger0.log("RealImageLoader", 4, "\uD83D\uDEA8 Failed - " + imageRequest0.getData() + " - " + errorResult0.getThrowable(), null);
        }
        if(target0 instanceof TransitionTarget) {
            Transition transition0 = errorResult0.getRequest().getTransitionFactory().create(((TransitionTarget)target0), errorResult0);
            if(transition0 instanceof NoneTransition) {
                target0.onError(errorResult0.getDrawable());
            }
            else {
                eventListener0.transitionStart(errorResult0.getRequest(), transition0);
                transition0.transition();
                eventListener0.transitionEnd(errorResult0.getRequest(), transition0);
            }
        }
        else if(target0 != null) {
            target0.onError(errorResult0.getDrawable());
        }
        Listener imageRequest$Listener0 = imageRequest0.getListener();
        if(imageRequest$Listener0 != null) {
            imageRequest$Listener0.onError(imageRequest0, errorResult0);
        }
    }

    public static final Object access$executeMain(RealImageLoader realImageLoader0, ImageRequest imageRequest0, int v, Continuation continuation0) {
        ImageResult imageResult1;
        RealImageLoader realImageLoader3;
        RequestDelegate requestDelegate2;
        ImageRequest imageRequest4;
        Bitmap bitmap1;
        Object object1;
        Bitmap bitmap0;
        ImageRequest imageRequest3;
        RealImageLoader realImageLoader2;
        RequestDelegate requestDelegate1;
        ImageRequest imageRequest2;
        EventListener eventListener1;
        EventListener eventListener0;
        ImageRequest imageRequest1;
        RequestDelegate requestDelegate0;
        e e0;
        RealImageLoader realImageLoader1 = realImageLoader0;
        realImageLoader0.getClass();
        if(continuation0 instanceof e) {
            e0 = (e)continuation0;
            int v1 = e0.v;
            if((v1 & 0x80000000) == 0) {
                e0 = new e(realImageLoader1, continuation0);
            }
            else {
                e0.v = v1 ^ 0x80000000;
            }
        }
        else {
            e0 = new e(realImageLoader1, continuation0);
        }
        Object object0 = e0.t;
        ImageResult imageResult0 = a.getCOROUTINE_SUSPENDED();
        switch(e0.v) {
            case 0: {
                ResultKt.throwOnFailure(object0);
                Job job0 = JobKt.getJob(e0.getContext());
                requestDelegate0 = realImageLoader1.l.requestDelegate(imageRequest0, job0);
                requestDelegate0.assertActive();
                imageRequest1 = ImageRequest.newBuilder$default(imageRequest0, null, 1, null).defaults(realImageLoader0.getDefaults()).build();
                eventListener0 = realImageLoader1.f.create(imageRequest1);
                try {
                    if(imageRequest1.getData() == NullRequestData.INSTANCE) {
                        throw new NullRequestDataException();
                    }
                    requestDelegate0.start();
                    if(v == 0) {
                        e0.o = realImageLoader1;
                        e0.p = requestDelegate0;
                        e0.q = imageRequest1;
                        e0.r = eventListener0;
                        e0.v = 1;
                        if(-Lifecycles.awaitStarted(imageRequest1.getLifecycle(), e0) != imageResult0) {
                            goto label_48;
                        }
                    }
                    else {
                        goto label_48;
                    }
                    return imageResult0;
                }
                catch(Throwable throwable0) {
                    imageRequest3 = imageRequest1;
                    break;
                }
            }
            case 1: {
                try {
                    eventListener1 = e0.r;
                    imageRequest2 = e0.q;
                    requestDelegate1 = e0.p;
                    realImageLoader2 = e0.o;
                    ResultKt.throwOnFailure(object0);
                    eventListener0 = eventListener1;
                    realImageLoader1 = realImageLoader2;
                }
                catch(Throwable throwable0) {
                    imageRequest3 = imageRequest2;
                    requestDelegate0 = requestDelegate1;
                    eventListener0 = eventListener1;
                    realImageLoader1 = realImageLoader2;
                    break;
                }
                try {
                    imageRequest1 = imageRequest2;
                    requestDelegate0 = requestDelegate1;
                label_48:
                    MemoryCache memoryCache0 = realImageLoader1.getMemoryCache();
                    if(memoryCache0 == null) {
                        bitmap0 = null;
                    }
                    else {
                        Key memoryCache$Key0 = imageRequest1.getPlaceholderMemoryCacheKey();
                        Value memoryCache$Value0 = memoryCache$Key0 == null ? null : memoryCache0.get(memoryCache$Key0);
                        bitmap0 = memoryCache$Value0 == null ? null : memoryCache$Value0.getBitmap();
                    }
                    Drawable drawable0 = bitmap0 == null ? imageRequest1.getPlaceholder() : new BitmapDrawable(imageRequest1.getContext().getResources(), bitmap0);
                    Target target0 = imageRequest1.getTarget();
                    if(target0 != null) {
                        target0.onStart(drawable0);
                    }
                    Listener imageRequest$Listener0 = imageRequest1.getListener();
                    if(imageRequest$Listener0 != null) {
                        imageRequest$Listener0.onStart(imageRequest1);
                    }
                    e0.o = realImageLoader1;
                    e0.p = requestDelegate0;
                    e0.q = imageRequest1;
                    e0.r = eventListener0;
                    e0.s = bitmap0;
                    e0.v = 2;
                    object1 = imageRequest1.getSizeResolver().size(e0);
                    if(object1 != imageResult0) {
                        goto label_76;
                    }
                    return imageResult0;
                }
                catch(Throwable throwable0) {
                    imageRequest3 = imageRequest1;
                    break;
                }
            label_76:
                bitmap1 = bitmap0;
                imageRequest4 = imageRequest1;
                object0 = object1;
                requestDelegate2 = requestDelegate0;
                goto label_97;
            }
            case 2: {
                try {
                    Bitmap bitmap2 = e0.s;
                    EventListener eventListener2 = e0.r;
                    imageRequest4 = e0.q;
                    requestDelegate2 = e0.p;
                    realImageLoader3 = e0.o;
                    eventListener0 = eventListener2;
                    ResultKt.throwOnFailure(object0);
                    bitmap1 = bitmap2;
                    eventListener0 = eventListener2;
                    realImageLoader1 = realImageLoader3;
                }
                catch(Throwable throwable0) {
                    imageRequest3 = imageRequest4;
                    requestDelegate0 = requestDelegate2;
                    realImageLoader1 = realImageLoader3;
                    break;
                }
                try {
                label_97:
                    f f0 = new f(imageRequest4, realImageLoader1, ((Size)object0), eventListener0, bitmap1, null);
                    e0.o = realImageLoader1;
                    e0.p = requestDelegate2;
                    e0.q = imageRequest4;
                    e0.r = eventListener0;
                    e0.s = null;
                    e0.v = 3;
                    object0 = BuildersKt.withContext(imageRequest4.getInterceptorDispatcher(), f0, e0);
                }
                catch(Throwable throwable0) {
                    imageRequest3 = imageRequest4;
                    requestDelegate0 = requestDelegate2;
                    break;
                }
                if(object0 != imageResult0) {
                    imageRequest3 = imageRequest4;
                    requestDelegate0 = requestDelegate2;
                    goto label_127;
                }
                try {
                    return imageResult0;
                }
                catch(Throwable throwable0) {
                    imageRequest3 = imageRequest1;
                    break;
                }
            }
            case 3: {
                try {
                    EventListener eventListener3 = e0.r;
                    imageRequest3 = e0.q;
                    requestDelegate0 = e0.p;
                    RealImageLoader realImageLoader4 = e0.o;
                    eventListener0 = eventListener3;
                    realImageLoader1 = realImageLoader4;
                    ResultKt.throwOnFailure(object0);
                    eventListener0 = eventListener3;
                    realImageLoader1 = realImageLoader4;
                label_127:
                    imageResult1 = (ImageResult)object0;
                    if(imageResult1 instanceof SuccessResult) {
                        realImageLoader1.b(((SuccessResult)imageResult1), imageRequest3.getTarget(), eventListener0);
                    }
                    else if(imageResult1 instanceof ErrorResult) {
                        realImageLoader1.a(((ErrorResult)imageResult1), imageRequest3.getTarget(), eventListener0);
                    }
                    goto label_149;
                }
                catch(Throwable throwable0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        try {
            if(throwable0 instanceof CancellationException) {
                Logger logger0 = realImageLoader1.i;
                if(logger0 != null && logger0.getLevel() <= 4) {
                    logger0.log("RealImageLoader", 4, "\uD83C\uDFD7  Cancelled - " + imageRequest3.getData(), null);
                }
                Listener imageRequest$Listener1 = imageRequest3.getListener();
                if(imageRequest$Listener1 != null) {
                    imageRequest$Listener1.onCancel(imageRequest3);
                }
                throw throwable0;
            }
            imageResult1 = realImageLoader1.l.errorResult(imageRequest3, throwable0);
            realImageLoader1.a(((ErrorResult)imageResult1), imageRequest3.getTarget(), eventListener0);
        }
        catch(Throwable throwable1) {
            requestDelegate0.complete();
            throw throwable1;
        }
    label_149:
        requestDelegate0.complete();
        return imageResult1;
    }

    public final void b(SuccessResult successResult0, Target target0, EventListener eventListener0) {
        ImageRequest imageRequest0 = successResult0.getRequest();
        DataSource dataSource0 = successResult0.getDataSource();
        Logger logger0 = this.i;
        if(logger0 != null && logger0.getLevel() <= 4) {
            logger0.log("RealImageLoader", 4, -Utils.getEmoji(dataSource0) + " Successful (" + dataSource0.name() + ") - " + imageRequest0.getData(), null);
        }
        if(target0 instanceof TransitionTarget) {
            Transition transition0 = successResult0.getRequest().getTransitionFactory().create(((TransitionTarget)target0), successResult0);
            if(transition0 instanceof NoneTransition) {
                target0.onSuccess(successResult0.getDrawable());
            }
            else {
                eventListener0.transitionStart(successResult0.getRequest(), transition0);
                transition0.transition();
                eventListener0.transitionEnd(successResult0.getRequest(), transition0);
            }
        }
        else if(target0 != null) {
            target0.onSuccess(successResult0.getDrawable());
        }
        Listener imageRequest$Listener0 = imageRequest0.getListener();
        if(imageRequest$Listener0 != null) {
            imageRequest$Listener0.onSuccess(imageRequest0, successResult0);
        }
    }

    @Override  // coil.ImageLoader
    @NotNull
    public Disposable enqueue(@NotNull ImageRequest imageRequest0) {
        b b0 = new b(this, imageRequest0, null);
        Deferred deferred0 = BuildersKt.async$default(this.j, null, null, b0, 3, null);
        return imageRequest0.getTarget() instanceof ViewTarget ? -Utils.getRequestManager(((ViewTarget)imageRequest0.getTarget()).getView()).getDisposable(deferred0) : new OneShotDisposable(deferred0);
    }

    @Override  // coil.ImageLoader
    @Nullable
    public Object execute(@NotNull ImageRequest imageRequest0, @NotNull Continuation continuation0) {
        return CoroutineScopeKt.coroutineScope(new d(this, imageRequest0, null), continuation0);
    }

    @NotNull
    public final Lazy getCallFactoryLazy() {
        return this.e;
    }

    @NotNull
    public final ComponentRegistry getComponentRegistry() {
        return this.g;
    }

    @Override  // coil.ImageLoader
    @NotNull
    public ComponentRegistry getComponents() {
        return this.m;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Override  // coil.ImageLoader
    @NotNull
    public DefaultRequestOptions getDefaults() {
        return this.b;
    }

    @Override  // coil.ImageLoader
    @Nullable
    public DiskCache getDiskCache() {
        return (DiskCache)this.d.getValue();
    }

    @NotNull
    public final Lazy getDiskCacheLazy() {
        return this.d;
    }

    @NotNull
    public final Factory getEventListenerFactory() {
        return this.f;
    }

    @Nullable
    public final Logger getLogger() {
        return this.i;
    }

    @Override  // coil.ImageLoader
    @Nullable
    public MemoryCache getMemoryCache() {
        return (MemoryCache)this.c.getValue();
    }

    @NotNull
    public final Lazy getMemoryCacheLazy() {
        return this.c;
    }

    @NotNull
    public final ImageLoaderOptions getOptions() {
        return this.h;
    }

    @Override  // coil.ImageLoader
    @NotNull
    public Builder newBuilder() {
        return new Builder(this);
    }

    public final void onTrimMemory$coil_base_release(int v) {
        Lazy lazy0 = this.c;
        if(lazy0 != null) {
            MemoryCache memoryCache0 = (MemoryCache)lazy0.getValue();
            if(memoryCache0 != null) {
                memoryCache0.trimMemory(v);
            }
        }
    }

    @Override  // coil.ImageLoader
    public void shutdown() {
        if(this.o.getAndSet(true)) {
            return;
        }
        CoroutineScopeKt.cancel$default(this.j, null, 1, null);
        this.k.shutdown();
        MemoryCache memoryCache0 = this.getMemoryCache();
        if(memoryCache0 != null) {
            memoryCache0.clear();
        }
    }
}

