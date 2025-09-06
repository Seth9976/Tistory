package coil.request;

import android.graphics.Bitmap.Config;
import android.graphics.drawable.Drawable;
import coil.size.Precision;
import coil.transition.Transition.Factory;
import coil.util.-Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b/\u0018\u00002\u00020\u0001B\u00A3\u0001\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0002\u0012\b\b\u0002\u0010\b\u001A\u00020\u0007\u0012\b\b\u0002\u0010\n\u001A\u00020\t\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B\u0012\b\b\u0002\u0010\u000E\u001A\u00020\r\u0012\b\b\u0002\u0010\u000F\u001A\u00020\r\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0016\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0014\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u00A9\u0001\u0010\u001A\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0004\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00022\b\b\u0002\u0010\u0006\u001A\u00020\u00022\b\b\u0002\u0010\b\u001A\u00020\u00072\b\b\u0002\u0010\n\u001A\u00020\t2\b\b\u0002\u0010\f\u001A\u00020\u000B2\b\b\u0002\u0010\u000E\u001A\u00020\r2\b\b\u0002\u0010\u000F\u001A\u00020\r2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001A\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0016\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u0014\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u001A\u0010\u001D\u001A\u00020\r2\b\u0010\u001C\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001D\u0010\u001EJ\u000F\u0010 \u001A\u00020\u001FH\u0016\u00A2\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010%R\u0017\u0010\u0004\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010#\u001A\u0004\b\'\u0010%R\u0017\u0010\u0005\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b(\u0010#\u001A\u0004\b)\u0010%R\u0017\u0010\u0006\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b*\u0010#\u001A\u0004\b+\u0010%R\u0017\u0010\b\u001A\u00020\u00078\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R\u0017\u0010\n\u001A\u00020\t8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0017\u0010\f\u001A\u00020\u000B8\u0006\u00A2\u0006\f\n\u0004\b4\u00105\u001A\u0004\b6\u00107R\u0017\u0010\u000E\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b8\u00109\u001A\u0004\b:\u0010;R\u0017\u0010\u000F\u001A\u00020\r8\u0006\u00A2\u0006\f\n\u0004\b<\u00109\u001A\u0004\b=\u0010;R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010AR\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\f\n\u0004\bB\u0010?\u001A\u0004\bC\u0010AR\u0019\u0010\u0013\u001A\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\f\n\u0004\bD\u0010?\u001A\u0004\bE\u0010AR\u0017\u0010\u0015\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0017\u0010\u0016\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bJ\u0010G\u001A\u0004\bK\u0010IR\u0017\u0010\u0017\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bL\u0010G\u001A\u0004\bM\u0010I\u00A8\u0006N"}, d2 = {"Lcoil/request/DefaultRequestOptions;", "", "Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lcoil/transition/Transition$Factory;", "transitionFactory", "Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Landroid/graphics/drawable/Drawable;", "placeholder", "error", "fallback", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "copy", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;ZZLandroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/DefaultRequestOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Lkotlinx/coroutines/CoroutineDispatcher;", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "b", "getFetcherDispatcher", "c", "getDecoderDispatcher", "d", "getTransformationDispatcher", "e", "Lcoil/transition/Transition$Factory;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "f", "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", "g", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "h", "Z", "getAllowHardware", "()Z", "i", "getAllowRgb565", "j", "Landroid/graphics/drawable/Drawable;", "getPlaceholder", "()Landroid/graphics/drawable/Drawable;", "k", "getError", "l", "getFallback", "m", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "n", "getDiskCachePolicy", "o", "getNetworkCachePolicy", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DefaultRequestOptions {
    public final CoroutineDispatcher a;
    public final CoroutineDispatcher b;
    public final CoroutineDispatcher c;
    public final CoroutineDispatcher d;
    public final Factory e;
    public final Precision f;
    public final Bitmap.Config g;
    public final boolean h;
    public final boolean i;
    public final Drawable j;
    public final Drawable k;
    public final Drawable l;
    public final CachePolicy m;
    public final CachePolicy n;
    public final CachePolicy o;

    public DefaultRequestOptions() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 0x7FFF, null);
    }

    public DefaultRequestOptions(@NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3, @NotNull Factory transition$Factory0, @NotNull Precision precision0, @NotNull Bitmap.Config bitmap$Config0, boolean z, boolean z1, @Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @NotNull CachePolicy cachePolicy0, @NotNull CachePolicy cachePolicy1, @NotNull CachePolicy cachePolicy2) {
        this.a = coroutineDispatcher0;
        this.b = coroutineDispatcher1;
        this.c = coroutineDispatcher2;
        this.d = coroutineDispatcher3;
        this.e = transition$Factory0;
        this.f = precision0;
        this.g = bitmap$Config0;
        this.h = z;
        this.i = z1;
        this.j = drawable0;
        this.k = drawable1;
        this.l = drawable2;
        this.m = cachePolicy0;
        this.n = cachePolicy1;
        this.o = cachePolicy2;
    }

    public DefaultRequestOptions(CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, Factory transition$Factory0, Precision precision0, Bitmap.Config bitmap$Config0, boolean z, boolean z1, Drawable drawable0, Drawable drawable1, Drawable drawable2, CachePolicy cachePolicy0, CachePolicy cachePolicy1, CachePolicy cachePolicy2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        CoroutineDispatcher coroutineDispatcher4 = (v & 1) == 0 ? coroutineDispatcher0 : Dispatchers.getMain().getImmediate();
        this(coroutineDispatcher4, ((v & 2) == 0 ? coroutineDispatcher1 : Dispatchers.getIO()), ((v & 4) == 0 ? coroutineDispatcher2 : Dispatchers.getIO()), ((v & 8) == 0 ? coroutineDispatcher3 : Dispatchers.getIO()), ((v & 16) == 0 ? transition$Factory0 : Factory.NONE), ((v & 0x20) == 0 ? precision0 : Precision.AUTOMATIC), ((v & 0x40) == 0 ? bitmap$Config0 : -Utils.getDEFAULT_BITMAP_CONFIG()), ((v & 0x80) == 0 ? z : true), ((v & 0x100) == 0 ? z1 : false), ((v & 0x200) == 0 ? drawable0 : null), ((v & 0x400) == 0 ? drawable1 : null), ((v & 0x800) == 0 ? drawable2 : null), ((v & 0x1000) == 0 ? cachePolicy0 : CachePolicy.ENABLED), ((v & 0x2000) == 0 ? cachePolicy1 : CachePolicy.ENABLED), ((v & 0x4000) == 0 ? cachePolicy2 : CachePolicy.ENABLED));
    }

    @NotNull
    public final DefaultRequestOptions copy(@NotNull CoroutineDispatcher coroutineDispatcher0, @NotNull CoroutineDispatcher coroutineDispatcher1, @NotNull CoroutineDispatcher coroutineDispatcher2, @NotNull CoroutineDispatcher coroutineDispatcher3, @NotNull Factory transition$Factory0, @NotNull Precision precision0, @NotNull Bitmap.Config bitmap$Config0, boolean z, boolean z1, @Nullable Drawable drawable0, @Nullable Drawable drawable1, @Nullable Drawable drawable2, @NotNull CachePolicy cachePolicy0, @NotNull CachePolicy cachePolicy1, @NotNull CachePolicy cachePolicy2) {
        return new DefaultRequestOptions(coroutineDispatcher0, coroutineDispatcher1, coroutineDispatcher2, coroutineDispatcher3, transition$Factory0, precision0, bitmap$Config0, z, z1, drawable0, drawable1, drawable2, cachePolicy0, cachePolicy1, cachePolicy2);
    }

    public static DefaultRequestOptions copy$default(DefaultRequestOptions defaultRequestOptions0, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, Factory transition$Factory0, Precision precision0, Bitmap.Config bitmap$Config0, boolean z, boolean z1, Drawable drawable0, Drawable drawable1, Drawable drawable2, CachePolicy cachePolicy0, CachePolicy cachePolicy1, CachePolicy cachePolicy2, int v, Object object0) {
        CoroutineDispatcher coroutineDispatcher4 = (v & 1) == 0 ? coroutineDispatcher0 : defaultRequestOptions0.a;
        CoroutineDispatcher coroutineDispatcher5 = (v & 2) == 0 ? coroutineDispatcher1 : defaultRequestOptions0.b;
        CoroutineDispatcher coroutineDispatcher6 = (v & 4) == 0 ? coroutineDispatcher2 : defaultRequestOptions0.c;
        CoroutineDispatcher coroutineDispatcher7 = (v & 8) == 0 ? coroutineDispatcher3 : defaultRequestOptions0.d;
        Factory transition$Factory1 = (v & 16) == 0 ? transition$Factory0 : defaultRequestOptions0.e;
        Precision precision1 = (v & 0x20) == 0 ? precision0 : defaultRequestOptions0.f;
        Bitmap.Config bitmap$Config1 = (v & 0x40) == 0 ? bitmap$Config0 : defaultRequestOptions0.g;
        boolean z2 = (v & 0x80) == 0 ? z : defaultRequestOptions0.h;
        boolean z3 = (v & 0x100) == 0 ? z1 : defaultRequestOptions0.i;
        Drawable drawable3 = (v & 0x200) == 0 ? drawable0 : defaultRequestOptions0.j;
        Drawable drawable4 = (v & 0x400) == 0 ? drawable1 : defaultRequestOptions0.k;
        Drawable drawable5 = (v & 0x800) == 0 ? drawable2 : defaultRequestOptions0.l;
        CachePolicy cachePolicy3 = (v & 0x1000) == 0 ? cachePolicy0 : defaultRequestOptions0.m;
        CachePolicy cachePolicy4 = (v & 0x2000) == 0 ? cachePolicy1 : defaultRequestOptions0.n;
        return (v & 0x4000) == 0 ? defaultRequestOptions0.copy(coroutineDispatcher4, coroutineDispatcher5, coroutineDispatcher6, coroutineDispatcher7, transition$Factory1, precision1, bitmap$Config1, z2, z3, drawable3, drawable4, drawable5, cachePolicy3, cachePolicy4, cachePolicy2) : defaultRequestOptions0.copy(coroutineDispatcher4, coroutineDispatcher5, coroutineDispatcher6, coroutineDispatcher7, transition$Factory1, precision1, bitmap$Config1, z2, z3, drawable3, drawable4, drawable5, cachePolicy3, cachePolicy4, defaultRequestOptions0.o);
    }

    // 去混淆评级： 中等(100)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof DefaultRequestOptions && Intrinsics.areEqual(this.a, ((DefaultRequestOptions)object0).a) && Intrinsics.areEqual(this.b, ((DefaultRequestOptions)object0).b) && Intrinsics.areEqual(this.c, ((DefaultRequestOptions)object0).c) && Intrinsics.areEqual(this.d, ((DefaultRequestOptions)object0).d) && Intrinsics.areEqual(this.e, ((DefaultRequestOptions)object0).e) && this.f == ((DefaultRequestOptions)object0).f && this.g == ((DefaultRequestOptions)object0).g && this.h == ((DefaultRequestOptions)object0).h && this.i == ((DefaultRequestOptions)object0).i && Intrinsics.areEqual(this.j, ((DefaultRequestOptions)object0).j) && Intrinsics.areEqual(this.k, ((DefaultRequestOptions)object0).k) && Intrinsics.areEqual(this.l, ((DefaultRequestOptions)object0).l) && this.m == ((DefaultRequestOptions)object0).m && this.n == ((DefaultRequestOptions)object0).n && this.o == ((DefaultRequestOptions)object0).o;
    }

    public final boolean getAllowHardware() {
        return this.h;
    }

    public final boolean getAllowRgb565() {
        return this.i;
    }

    @NotNull
    public final Bitmap.Config getBitmapConfig() {
        return this.g;
    }

    @NotNull
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.c;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.n;
    }

    @Nullable
    public final Drawable getError() {
        return this.k;
    }

    @Nullable
    public final Drawable getFallback() {
        return this.l;
    }

    @NotNull
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.b;
    }

    @NotNull
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.a;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.m;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.o;
    }

    @Nullable
    public final Drawable getPlaceholder() {
        return this.j;
    }

    @NotNull
    public final Precision getPrecision() {
        return this.f;
    }

    @NotNull
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.d;
    }

    @NotNull
    public final Factory getTransitionFactory() {
        return this.e;
    }

    @Override
    public int hashCode() {
        int v = a.e(a.e((this.g.hashCode() + (this.f.hashCode() + (this.e.hashCode() + (this.d.hashCode() + (this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.h), 0x1F, this.i);
        int v1 = 0;
        int v2 = this.j == null ? 0 : this.j.hashCode();
        int v3 = this.k == null ? 0 : this.k.hashCode();
        Drawable drawable0 = this.l;
        if(drawable0 != null) {
            v1 = drawable0.hashCode();
        }
        return this.o.hashCode() + (this.n.hashCode() + (this.m.hashCode() + (((v + v2) * 0x1F + v3) * 0x1F + v1) * 0x1F) * 0x1F) * 0x1F;
    }
}

