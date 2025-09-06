package coil;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import androidx.annotation.DrawableRes;
import androidx.annotation.FloatRange;
import androidx.core.app.h;
import coil.decode.ExifOrientationPolicy;
import coil.disk.DiskCache;
import coil.memory.MemoryCache;
import coil.request.CachePolicy;
import coil.request.DefaultRequestOptions;
import coil.request.Disposable;
import coil.request.ImageRequest;
import coil.size.Precision;
import coil.transition.Transition;
import coil.util.-Contexts;
import coil.util.-Requests;
import coil.util.-Utils;
import coil.util.ImageLoaderOptions;
import coil.util.Logger;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.KotlinNothingValueException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineDispatcher;
import md.c;
import md.d;
import okhttp3.OkHttpClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u001DJ\u0010\u0010\u0012\u001A\u00020\u00132\u0006\u0010\u0014\u001A\u00020\u0015H&J\u0016\u0010\u0016\u001A\u00020\u00172\u0006\u0010\u0014\u001A\u00020\u0015H¦@¢\u0006\u0002\u0010\u0018J\b\u0010\u0019\u001A\u00020\u001AH&J\b\u0010\u001B\u001A\u00020\u001CH&R\u0012\u0010\u0002\u001A\u00020\u0003X¦\u0004¢\u0006\u0006\u001A\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001A\u00020\u0007X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u0004\u0018\u00010\u000BX¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\rR\u0014\u0010\u000E\u001A\u0004\u0018\u00010\u000FX¦\u0004¢\u0006\u0006\u001A\u0004\b\u0010\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001EÀ\u0006\u0001"}, d2 = {"Lcoil/ImageLoader;", "", "components", "Lcoil/ComponentRegistry;", "getComponents", "()Lcoil/ComponentRegistry;", "defaults", "Lcoil/request/DefaultRequestOptions;", "getDefaults", "()Lcoil/request/DefaultRequestOptions;", "diskCache", "Lcoil/disk/DiskCache;", "getDiskCache", "()Lcoil/disk/DiskCache;", "memoryCache", "Lcoil/memory/MemoryCache;", "getMemoryCache", "()Lcoil/memory/MemoryCache;", "enqueue", "Lcoil/request/Disposable;", "request", "Lcoil/request/ImageRequest;", "execute", "Lcoil/request/ImageResult;", "(Lcoil/request/ImageRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newBuilder", "Lcoil/ImageLoader$Builder;", "shutdown", "", "Builder", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ImageLoader {
    @Metadata(d1 = {"\u0000\u00D2\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\n\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\t\u00A2\u0006\u0004\b\n\u0010\u000BJ\u001B\u0010\n\u001A\u00020\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\t0\f\u00A2\u0006\u0004\b\n\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u0010\u001A\u00020\u000F\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u001B\u0010\u0010\u001A\u00020\u00002\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\u000F0\f\u00A2\u0006\u0004\b\u0010\u0010\u000EJ)\u0010\u0017\u001A\u00020\u00002\u0017\u0010\u0016\u001A\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u00A2\u0006\u0002\b\u0015H\u0086\b\u00A2\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0017\u001A\u00020\u0019\u00A2\u0006\u0004\b\u0017\u0010\u001AJ\u0017\u0010\u001C\u001A\u00020\u00002\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001D\u0010\u001C\u001A\u00020\u00002\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001B0\f\u00A2\u0006\u0004\b\u001C\u0010\u000EJ\u0017\u0010\u001F\u001A\u00020\u00002\b\u0010\u001F\u001A\u0004\u0018\u00010\u001E\u00A2\u0006\u0004\b\u001F\u0010 J\u001D\u0010\u001F\u001A\u00020\u00002\u000E\u0010\r\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u001E0\f\u00A2\u0006\u0004\b\u001F\u0010\u000EJ\u0015\u0010#\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b#\u0010$J\u0015\u0010%\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b%\u0010$J\u0015\u0010&\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b&\u0010$J\u0015\u0010\'\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b\'\u0010$J\u0015\u0010(\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b(\u0010$J\u0015\u0010+\u001A\u00020\u00002\u0006\u0010*\u001A\u00020)\u00A2\u0006\u0004\b+\u0010,J\u0015\u0010/\u001A\u00020\u00002\u0006\u0010.\u001A\u00020-\u00A2\u0006\u0004\b/\u00100J\u0015\u00103\u001A\u00020\u00002\u0006\u00102\u001A\u000201\u00A2\u0006\u0004\b3\u00104J\u0015\u00107\u001A\u00020\u00002\u0006\u00106\u001A\u000205\u00A2\u0006\u0004\b7\u00108J\u0015\u00109\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!\u00A2\u0006\u0004\b9\u0010$J\u0015\u00109\u001A\u00020\u00002\u0006\u0010:\u001A\u00020)\u00A2\u0006\u0004\b9\u0010,J\u0015\u0010<\u001A\u00020\u00002\u0006\u00106\u001A\u00020;\u00A2\u0006\u0004\b<\u0010=J\u0015\u0010?\u001A\u00020\u00002\u0006\u0010?\u001A\u00020>\u00A2\u0006\u0004\b?\u0010@J\u0015\u0010B\u001A\u00020\u00002\u0006\u0010B\u001A\u00020A\u00A2\u0006\u0004\bB\u0010CJ\u0015\u0010E\u001A\u00020\u00002\u0006\u0010E\u001A\u00020D\u00A2\u0006\u0004\bE\u0010FJ\u0015\u0010G\u001A\u00020\u00002\u0006\u0010E\u001A\u00020D\u00A2\u0006\u0004\bG\u0010FJ\u0015\u0010H\u001A\u00020\u00002\u0006\u0010E\u001A\u00020D\u00A2\u0006\u0004\bH\u0010FJ\u0015\u0010I\u001A\u00020\u00002\u0006\u0010E\u001A\u00020D\u00A2\u0006\u0004\bI\u0010FJ\u0015\u0010J\u001A\u00020\u00002\u0006\u0010E\u001A\u00020D\u00A2\u0006\u0004\bJ\u0010FJ\u0017\u0010L\u001A\u00020\u00002\b\b\u0001\u0010K\u001A\u00020)\u00A2\u0006\u0004\bL\u0010,J\u0017\u0010L\u001A\u00020\u00002\b\u0010N\u001A\u0004\u0018\u00010M\u00A2\u0006\u0004\bL\u0010OJ\u0017\u0010P\u001A\u00020\u00002\b\b\u0001\u0010K\u001A\u00020)\u00A2\u0006\u0004\bP\u0010,J\u0017\u0010P\u001A\u00020\u00002\b\u0010N\u001A\u0004\u0018\u00010M\u00A2\u0006\u0004\bP\u0010OJ\u0017\u0010Q\u001A\u00020\u00002\b\b\u0001\u0010K\u001A\u00020)\u00A2\u0006\u0004\bQ\u0010,J\u0017\u0010Q\u001A\u00020\u00002\b\u0010N\u001A\u0004\u0018\u00010M\u00A2\u0006\u0004\bQ\u0010OJ\u0015\u0010S\u001A\u00020\u00002\u0006\u0010.\u001A\u00020R\u00A2\u0006\u0004\bS\u0010TJ\u0015\u0010U\u001A\u00020\u00002\u0006\u0010.\u001A\u00020R\u00A2\u0006\u0004\bU\u0010TJ\u0015\u0010V\u001A\u00020\u00002\u0006\u0010.\u001A\u00020R\u00A2\u0006\u0004\bV\u0010TJ\u0017\u0010X\u001A\u00020\u00002\b\u0010X\u001A\u0004\u0018\u00010W\u00A2\u0006\u0004\bX\u0010YJ\r\u0010[\u001A\u00020Z\u00A2\u0006\u0004\b[\u0010\\J\u0019\u0010_\u001A\u00020\u00002\b\b\u0001\u0010^\u001A\u00020]H\u0007\u00A2\u0006\u0004\b_\u0010`J\u0017\u0010a\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\ba\u0010$J\u0017\u0010b\u001A\u00020\u00002\u0006\u0010\"\u001A\u00020!H\u0007\u00A2\u0006\u0004\bb\u0010$J(\u0010c\u001A\u00020\u00002\u0017\u0010\u0016\u001A\u0013\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u00A2\u0006\u0002\b\u0015H\u0007\u00A2\u0006\u0004\bc\u0010\u0018J\u0017\u0010c\u001A\u00020\u00002\u0006\u0010d\u001A\u00020\u0019H\u0007\u00A2\u0006\u0004\bc\u0010\u001AJ\u0017\u0010f\u001A\u00020\u00002\u0006\u0010f\u001A\u00020eH\u0007\u00A2\u0006\u0004\bf\u0010g\u00A8\u0006h"}, d2 = {"Lcoil/ImageLoader$Builder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcoil/RealImageLoader;", "imageLoader", "(Lcoil/RealImageLoader;)V", "Lokhttp3/OkHttpClient;", "okHttpClient", "(Lokhttp3/OkHttpClient;)Lcoil/ImageLoader$Builder;", "Lkotlin/Function0;", "initializer", "(Lkotlin/jvm/functions/Function0;)Lcoil/ImageLoader$Builder;", "Lokhttp3/Call$Factory;", "callFactory", "(Lokhttp3/Call$Factory;)Lcoil/ImageLoader$Builder;", "Lkotlin/Function1;", "Lcoil/ComponentRegistry$Builder;", "", "Lkotlin/ExtensionFunctionType;", "builder", "components", "(Lkotlin/jvm/functions/Function1;)Lcoil/ImageLoader$Builder;", "Lcoil/ComponentRegistry;", "(Lcoil/ComponentRegistry;)Lcoil/ImageLoader$Builder;", "Lcoil/memory/MemoryCache;", "memoryCache", "(Lcoil/memory/MemoryCache;)Lcoil/ImageLoader$Builder;", "Lcoil/disk/DiskCache;", "diskCache", "(Lcoil/disk/DiskCache;)Lcoil/ImageLoader$Builder;", "", "enable", "allowHardware", "(Z)Lcoil/ImageLoader$Builder;", "allowRgb565", "addLastModifiedToFileCacheKey", "networkObserverEnabled", "respectCacheHeaders", "", "maxParallelism", "bitmapFactoryMaxParallelism", "(I)Lcoil/ImageLoader$Builder;", "Lcoil/decode/ExifOrientationPolicy;", "policy", "bitmapFactoryExifOrientationPolicy", "(Lcoil/decode/ExifOrientationPolicy;)Lcoil/ImageLoader$Builder;", "Lcoil/EventListener;", "listener", "eventListener", "(Lcoil/EventListener;)Lcoil/ImageLoader$Builder;", "Lcoil/EventListener$Factory;", "factory", "eventListenerFactory", "(Lcoil/EventListener$Factory;)Lcoil/ImageLoader$Builder;", "crossfade", "durationMillis", "Lcoil/transition/Transition$Factory;", "transitionFactory", "(Lcoil/transition/Transition$Factory;)Lcoil/ImageLoader$Builder;", "Lcoil/size/Precision;", "precision", "(Lcoil/size/Precision;)Lcoil/ImageLoader$Builder;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "(Landroid/graphics/Bitmap$Config;)Lcoil/ImageLoader$Builder;", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "(Lkotlinx/coroutines/CoroutineDispatcher;)Lcoil/ImageLoader$Builder;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "drawableResId", "placeholder", "Landroid/graphics/drawable/Drawable;", "drawable", "(Landroid/graphics/drawable/Drawable;)Lcoil/ImageLoader$Builder;", "error", "fallback", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "(Lcoil/request/CachePolicy;)Lcoil/ImageLoader$Builder;", "diskCachePolicy", "networkCachePolicy", "Lcoil/util/Logger;", "logger", "(Lcoil/util/Logger;)Lcoil/ImageLoader$Builder;", "Lcoil/ImageLoader;", "build", "()Lcoil/ImageLoader;", "", "percent", "availableMemoryPercentage", "(D)Lcoil/ImageLoader$Builder;", "trackWeakReferences", "launchInterceptorChainOnMainThread", "componentRegistry", "registry", "Lcoil/transition/Transition;", "transition", "(Lcoil/transition/Transition;)Lcoil/ImageLoader$Builder;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nImageLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageLoader.kt\ncoil/ImageLoader$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,595:1\n1#2:596\n*E\n"})
    public static final class Builder {
        public final Context a;
        public DefaultRequestOptions b;
        public Lazy c;
        public Lazy d;
        public Lazy e;
        public Factory f;
        public ComponentRegistry g;
        public ImageLoaderOptions h;
        public Logger i;

        public Builder(@NotNull Context context0) {
            this.a = context0.getApplicationContext();
            this.b = -Requests.getDEFAULT_REQUEST_OPTIONS();
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.g = null;
            this.h = new ImageLoaderOptions(false, false, false, 0, null, 0x1F, null);
            this.i = null;
        }

        public Builder(@NotNull RealImageLoader realImageLoader0) {
            this.a = realImageLoader0.getContext().getApplicationContext();
            this.b = realImageLoader0.getDefaults();
            this.c = realImageLoader0.getMemoryCacheLazy();
            this.d = realImageLoader0.getDiskCacheLazy();
            this.e = realImageLoader0.getCallFactoryLazy();
            this.f = realImageLoader0.getEventListenerFactory();
            this.g = realImageLoader0.getComponentRegistry();
            this.h = realImageLoader0.getOptions();
            this.i = realImageLoader0.getLogger();
        }

        @NotNull
        public final Builder addLastModifiedToFileCacheKey(boolean z) {
            this.h = ImageLoaderOptions.copy$default(this.h, z, false, false, 0, null, 30, null);
            return this;
        }

        @NotNull
        public final Builder allowHardware(boolean z) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, z, false, null, null, null, null, null, null, 0x7F7F, null);
            return this;
        }

        @NotNull
        public final Builder allowRgb565(boolean z) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, z, null, null, null, null, null, null, 0x7EFF, null);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'memoryCache\'.", replaceWith = @ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).maxSizePercent(percent).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final Builder availableMemoryPercentage(@FloatRange(from = 0.0, to = 1.0) double f) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder bitmapConfig(@NotNull Bitmap.Config bitmap$Config0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, bitmap$Config0, false, false, null, null, null, null, null, null, 0x7FBF, null);
            return this;
        }

        @NotNull
        public final Builder bitmapFactoryExifOrientationPolicy(@NotNull ExifOrientationPolicy exifOrientationPolicy0) {
            this.h = ImageLoaderOptions.copy$default(this.h, false, false, false, 0, exifOrientationPolicy0, 15, null);
            return this;
        }

        @NotNull
        public final Builder bitmapFactoryMaxParallelism(int v) {
            if(v <= 0) {
                throw new IllegalArgumentException("maxParallelism must be > 0.");
            }
            this.h = ImageLoaderOptions.copy$default(this.h, false, false, false, v, null, 23, null);
            return this;
        }

        @NotNull
        public final ImageLoader build() {
            DefaultRequestOptions defaultRequestOptions0 = this.b;
            Lazy lazy0 = this.c == null ? c.lazy(new a(this)) : this.c;
            Lazy lazy1 = this.d == null ? c.lazy(new b(this)) : this.d;
            Lazy lazy2 = this.e == null ? c.lazy(coil.c.w) : this.e;
            Factory eventListener$Factory0 = this.f == null ? Factory.NONE : this.f;
            ComponentRegistry componentRegistry0 = this.g == null ? new ComponentRegistry() : this.g;
            return new RealImageLoader(this.a, defaultRequestOptions0, lazy0, lazy1, lazy2, eventListener$Factory0, componentRegistry0, this.h, this.i);
        }

        @NotNull
        public final Builder callFactory(@NotNull Function0 function00) {
            this.e = c.lazy(function00);
            return this;
        }

        @NotNull
        public final Builder callFactory(@NotNull okhttp3.Call.Factory call$Factory0) {
            this.e = d.lazyOf(call$Factory0);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with \'components\'.", replaceWith = @ReplaceWith(expression = "components(registry)", imports = {}))
        @NotNull
        public final Builder componentRegistry(@NotNull ComponentRegistry componentRegistry0) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Replace with \'components\'.", replaceWith = @ReplaceWith(expression = "components(builder)", imports = {}))
        public final Builder componentRegistry(Function1 function10) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder components(@NotNull ComponentRegistry componentRegistry0) {
            this.g = componentRegistry0;
            return this;
        }

        public final Builder components(Function1 function10) {
            coil.ComponentRegistry.Builder componentRegistry$Builder0 = new coil.ComponentRegistry.Builder();
            function10.invoke(componentRegistry$Builder0);
            return this.components(componentRegistry$Builder0.build());
        }

        @NotNull
        public final Builder crossfade(int v) {
            coil.transition.Transition.Factory transition$Factory0 = v > 0 ? new coil.transition.CrossfadeTransition.Factory(v, false, 2, null) : coil.transition.Transition.Factory.NONE;
            this.transitionFactory(transition$Factory0);
            return this;
        }

        // 去混淆评级： 低(20)
        @NotNull
        public final Builder crossfade(boolean z) {
            return z ? this.crossfade(100) : this.crossfade(0);
        }

        @NotNull
        public final Builder decoderDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, coroutineDispatcher0, null, null, null, null, false, false, null, null, null, null, null, null, 0x7FFB, null);
            return this;
        }

        @NotNull
        public final Builder diskCache(@Nullable DiskCache diskCache0) {
            this.d = d.lazyOf(diskCache0);
            return this;
        }

        @NotNull
        public final Builder diskCache(@NotNull Function0 function00) {
            this.d = c.lazy(function00);
            return this;
        }

        @NotNull
        public final Builder diskCachePolicy(@NotNull CachePolicy cachePolicy0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, false, null, null, null, null, cachePolicy0, null, 0x5FFF, null);
            return this;
        }

        @NotNull
        public final Builder dispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, coroutineDispatcher0, coroutineDispatcher0, coroutineDispatcher0, null, null, null, false, false, null, null, null, null, null, null, 0x7FF1, null);
            return this;
        }

        @NotNull
        public final Builder error(@DrawableRes int v) {
            return this.error(-Contexts.getDrawableCompat(this.a, v));
        }

        @NotNull
        public final Builder error(@Nullable Drawable drawable0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, false, null, (drawable0 == null ? null : drawable0.mutate()), null, null, null, null, 0x7BFF, null);
            return this;
        }

        @NotNull
        public final Builder eventListener(@NotNull EventListener eventListener0) {
            return this.eventListenerFactory(new h(eventListener0, 21));
        }

        @NotNull
        public final Builder eventListenerFactory(@NotNull Factory eventListener$Factory0) {
            this.f = eventListener$Factory0;
            return this;
        }

        @NotNull
        public final Builder fallback(@DrawableRes int v) {
            return this.fallback(-Contexts.getDrawableCompat(this.a, v));
        }

        @NotNull
        public final Builder fallback(@Nullable Drawable drawable0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, false, null, null, (drawable0 == null ? null : drawable0.mutate()), null, null, null, 0x77FF, null);
            return this;
        }

        @NotNull
        public final Builder fetcherDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, coroutineDispatcher0, null, null, null, null, null, false, false, null, null, null, null, null, null, 0x7FFD, null);
            return this;
        }

        @NotNull
        public final Builder interceptorDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.b = DefaultRequestOptions.copy$default(this.b, coroutineDispatcher0, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 0x7FFE, null);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'interceptorDispatcher\'.", replaceWith = @ReplaceWith(expression = "interceptorDispatcher(if (enable) Dispatchers.Main.immediate else Dispatchers.IO)", imports = {"kotlinx.coroutines.Dispatchers"}))
        @NotNull
        public final Builder launchInterceptorChainOnMainThread(boolean z) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder logger(@Nullable Logger logger0) {
            this.i = logger0;
            return this;
        }

        @NotNull
        public final Builder memoryCache(@Nullable MemoryCache memoryCache0) {
            this.c = d.lazyOf(memoryCache0);
            return this;
        }

        @NotNull
        public final Builder memoryCache(@NotNull Function0 function00) {
            this.c = c.lazy(function00);
            return this;
        }

        @NotNull
        public final Builder memoryCachePolicy(@NotNull CachePolicy cachePolicy0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, false, null, null, null, cachePolicy0, null, null, 0x6FFF, null);
            return this;
        }

        @NotNull
        public final Builder networkCachePolicy(@NotNull CachePolicy cachePolicy0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, false, null, null, null, null, null, cachePolicy0, 0x3FFF, null);
            return this;
        }

        @NotNull
        public final Builder networkObserverEnabled(boolean z) {
            this.h = ImageLoaderOptions.copy$default(this.h, false, z, false, 0, null, 29, null);
            return this;
        }

        @NotNull
        public final Builder okHttpClient(@NotNull Function0 function00) {
            return this.callFactory(function00);
        }

        @NotNull
        public final Builder okHttpClient(@NotNull OkHttpClient okHttpClient0) {
            return this.callFactory(okHttpClient0);
        }

        @NotNull
        public final Builder placeholder(@DrawableRes int v) {
            return this.placeholder(-Contexts.getDrawableCompat(this.a, v));
        }

        @NotNull
        public final Builder placeholder(@Nullable Drawable drawable0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, null, null, false, false, (drawable0 == null ? null : drawable0.mutate()), null, null, null, null, null, 0x7DFF, null);
            return this;
        }

        @NotNull
        public final Builder precision(@NotNull Precision precision0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, null, precision0, null, false, false, null, null, null, null, null, null, 0x7FDF, null);
            return this;
        }

        @NotNull
        public final Builder respectCacheHeaders(boolean z) {
            this.h = ImageLoaderOptions.copy$default(this.h, false, false, z, 0, null, 27, null);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'memoryCache\'.", replaceWith = @ReplaceWith(expression = "memoryCache { MemoryCache.Builder(context).weakReferencesEnabled(enable).build() }", imports = {"coil.memory.MemoryCache"}))
        @NotNull
        public final Builder trackWeakReferences(boolean z) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder transformationDispatcher(@NotNull CoroutineDispatcher coroutineDispatcher0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, coroutineDispatcher0, null, null, null, false, false, null, null, null, null, null, null, 0x7FF7, null);
            return this;
        }

        @Deprecated(level = DeprecationLevel.ERROR, message = "Migrate to \'transitionFactory\'.", replaceWith = @ReplaceWith(expression = "transitionFactory { _, _ -> transition }", imports = {}))
        @NotNull
        public final Builder transition(@NotNull Transition transition0) {
            -Utils.unsupported();
            throw new KotlinNothingValueException();
        }

        @NotNull
        public final Builder transitionFactory(@NotNull coil.transition.Transition.Factory transition$Factory0) {
            this.b = DefaultRequestOptions.copy$default(this.b, null, null, null, null, transition$Factory0, null, null, false, false, null, null, null, null, null, null, 0x7FEF, null);
            return this;
        }
    }

    @NotNull
    Disposable enqueue(@NotNull ImageRequest arg1);

    @Nullable
    Object execute(@NotNull ImageRequest arg1, @NotNull Continuation arg2);

    @NotNull
    ComponentRegistry getComponents();

    @NotNull
    DefaultRequestOptions getDefaults();

    @Nullable
    DiskCache getDiskCache();

    @Nullable
    MemoryCache getMemoryCache();

    @NotNull
    Builder newBuilder();

    void shutdown();
}

