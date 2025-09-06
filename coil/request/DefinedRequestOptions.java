package coil.request;

import android.graphics.Bitmap.Config;
import androidx.lifecycle.Lifecycle;
import coil.size.Precision;
import coil.size.Scale;
import coil.size.SizeResolver;
import coil.transition.Transition.Factory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b3\u0018\u00002\u00020\u0001B\u009D\u0001\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001A\u0004\u0018\u00010\b\u0012\b\u0010\n\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000B\u001A\u0004\u0018\u00010\b\u0012\b\u0010\f\u001A\u0004\u0018\u00010\b\u0012\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F\u0012\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011\u0012\b\u0010\u0014\u001A\u0004\u0018\u00010\u0013\u0012\b\u0010\u0015\u001A\u0004\u0018\u00010\u0013\u0012\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001A\u0004\u0018\u00010\u0016\u0012\b\u0010\u0019\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u00C1\u0001\u0010\u001C\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001A\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000E\u001A\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\n\b\u0002\u0010\u0012\u001A\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001A\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001A\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001A\u0004\u0018\u00010\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u001A\u0010\u001F\u001A\u00020\u00132\b\u0010\u001E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b\u001F\u0010 J\u000F\u0010\"\u001A\u00020!H\u0016\u00A2\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006\u00A2\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006\u00A2\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010+R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b,\u0010-\u001A\u0004\b.\u0010/R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b0\u00101\u001A\u0004\b2\u00103R\u0019\u0010\n\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b4\u00101\u001A\u0004\b5\u00103R\u0019\u0010\u000B\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b6\u00101\u001A\u0004\b7\u00103R\u0019\u0010\f\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\b8\u00101\u001A\u0004\b9\u00103R\u0019\u0010\u000E\u001A\u0004\u0018\u00010\r8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u0019\u0010\u0010\u001A\u0004\u0018\u00010\u000F8\u0006\u00A2\u0006\f\n\u0004\b>\u0010?\u001A\u0004\b@\u0010AR\u0019\u0010\u0012\u001A\u0004\u0018\u00010\u00118\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0019\u0010\u0015\u001A\u0004\u0018\u00010\u00138\u0006\u00A2\u0006\f\n\u0004\bJ\u0010G\u001A\u0004\bK\u0010IR\u0019\u0010\u0017\u001A\u0004\u0018\u00010\u00168\u0006\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR\u0019\u0010\u0018\u001A\u0004\u0018\u00010\u00168\u0006\u00A2\u0006\f\n\u0004\bP\u0010M\u001A\u0004\bQ\u0010OR\u0019\u0010\u0019\u001A\u0004\u0018\u00010\u00168\u0006\u00A2\u0006\f\n\u0004\bR\u0010M\u001A\u0004\bS\u0010O\u00A8\u0006T"}, d2 = {"Lcoil/request/DefinedRequestOptions;", "", "Landroidx/lifecycle/Lifecycle;", "lifecycle", "Lcoil/size/SizeResolver;", "sizeResolver", "Lcoil/size/Scale;", "scale", "Lkotlinx/coroutines/CoroutineDispatcher;", "interceptorDispatcher", "fetcherDispatcher", "decoderDispatcher", "transformationDispatcher", "Lcoil/transition/Transition$Factory;", "transitionFactory", "Lcoil/size/Precision;", "precision", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "", "allowHardware", "allowRgb565", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "copy", "(Landroidx/lifecycle/Lifecycle;Lcoil/size/SizeResolver;Lcoil/size/Scale;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;Lcoil/transition/Transition$Factory;Lcoil/size/Precision;Landroid/graphics/Bitmap$Config;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/DefinedRequestOptions;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "b", "Lcoil/size/SizeResolver;", "getSizeResolver", "()Lcoil/size/SizeResolver;", "c", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "d", "Lkotlinx/coroutines/CoroutineDispatcher;", "getInterceptorDispatcher", "()Lkotlinx/coroutines/CoroutineDispatcher;", "e", "getFetcherDispatcher", "f", "getDecoderDispatcher", "g", "getTransformationDispatcher", "h", "Lcoil/transition/Transition$Factory;", "getTransitionFactory", "()Lcoil/transition/Transition$Factory;", "i", "Lcoil/size/Precision;", "getPrecision", "()Lcoil/size/Precision;", "j", "Landroid/graphics/Bitmap$Config;", "getBitmapConfig", "()Landroid/graphics/Bitmap$Config;", "k", "Ljava/lang/Boolean;", "getAllowHardware", "()Ljava/lang/Boolean;", "l", "getAllowRgb565", "m", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "n", "getDiskCachePolicy", "o", "getNetworkCachePolicy", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DefinedRequestOptions {
    public final Lifecycle a;
    public final SizeResolver b;
    public final Scale c;
    public final CoroutineDispatcher d;
    public final CoroutineDispatcher e;
    public final CoroutineDispatcher f;
    public final CoroutineDispatcher g;
    public final Factory h;
    public final Precision i;
    public final Bitmap.Config j;
    public final Boolean k;
    public final Boolean l;
    public final CachePolicy m;
    public final CachePolicy n;
    public final CachePolicy o;

    public DefinedRequestOptions(@Nullable Lifecycle lifecycle0, @Nullable SizeResolver sizeResolver0, @Nullable Scale scale0, @Nullable CoroutineDispatcher coroutineDispatcher0, @Nullable CoroutineDispatcher coroutineDispatcher1, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable Factory transition$Factory0, @Nullable Precision precision0, @Nullable Bitmap.Config bitmap$Config0, @Nullable Boolean boolean0, @Nullable Boolean boolean1, @Nullable CachePolicy cachePolicy0, @Nullable CachePolicy cachePolicy1, @Nullable CachePolicy cachePolicy2) {
        this.a = lifecycle0;
        this.b = sizeResolver0;
        this.c = scale0;
        this.d = coroutineDispatcher0;
        this.e = coroutineDispatcher1;
        this.f = coroutineDispatcher2;
        this.g = coroutineDispatcher3;
        this.h = transition$Factory0;
        this.i = precision0;
        this.j = bitmap$Config0;
        this.k = boolean0;
        this.l = boolean1;
        this.m = cachePolicy0;
        this.n = cachePolicy1;
        this.o = cachePolicy2;
    }

    @NotNull
    public final DefinedRequestOptions copy(@Nullable Lifecycle lifecycle0, @Nullable SizeResolver sizeResolver0, @Nullable Scale scale0, @Nullable CoroutineDispatcher coroutineDispatcher0, @Nullable CoroutineDispatcher coroutineDispatcher1, @Nullable CoroutineDispatcher coroutineDispatcher2, @Nullable CoroutineDispatcher coroutineDispatcher3, @Nullable Factory transition$Factory0, @Nullable Precision precision0, @Nullable Bitmap.Config bitmap$Config0, @Nullable Boolean boolean0, @Nullable Boolean boolean1, @Nullable CachePolicy cachePolicy0, @Nullable CachePolicy cachePolicy1, @Nullable CachePolicy cachePolicy2) {
        return new DefinedRequestOptions(lifecycle0, sizeResolver0, scale0, coroutineDispatcher0, coroutineDispatcher1, coroutineDispatcher2, coroutineDispatcher3, transition$Factory0, precision0, bitmap$Config0, boolean0, boolean1, cachePolicy0, cachePolicy1, cachePolicy2);
    }

    public static DefinedRequestOptions copy$default(DefinedRequestOptions definedRequestOptions0, Lifecycle lifecycle0, SizeResolver sizeResolver0, Scale scale0, CoroutineDispatcher coroutineDispatcher0, CoroutineDispatcher coroutineDispatcher1, CoroutineDispatcher coroutineDispatcher2, CoroutineDispatcher coroutineDispatcher3, Factory transition$Factory0, Precision precision0, Bitmap.Config bitmap$Config0, Boolean boolean0, Boolean boolean1, CachePolicy cachePolicy0, CachePolicy cachePolicy1, CachePolicy cachePolicy2, int v, Object object0) {
        Lifecycle lifecycle1 = (v & 1) == 0 ? lifecycle0 : definedRequestOptions0.a;
        SizeResolver sizeResolver1 = (v & 2) == 0 ? sizeResolver0 : definedRequestOptions0.b;
        Scale scale1 = (v & 4) == 0 ? scale0 : definedRequestOptions0.c;
        CoroutineDispatcher coroutineDispatcher4 = (v & 8) == 0 ? coroutineDispatcher0 : definedRequestOptions0.d;
        CoroutineDispatcher coroutineDispatcher5 = (v & 16) == 0 ? coroutineDispatcher1 : definedRequestOptions0.e;
        CoroutineDispatcher coroutineDispatcher6 = (v & 0x20) == 0 ? coroutineDispatcher2 : definedRequestOptions0.f;
        CoroutineDispatcher coroutineDispatcher7 = (v & 0x40) == 0 ? coroutineDispatcher3 : definedRequestOptions0.g;
        Factory transition$Factory1 = (v & 0x80) == 0 ? transition$Factory0 : definedRequestOptions0.h;
        Precision precision1 = (v & 0x100) == 0 ? precision0 : definedRequestOptions0.i;
        Bitmap.Config bitmap$Config1 = (v & 0x200) == 0 ? bitmap$Config0 : definedRequestOptions0.j;
        Boolean boolean2 = (v & 0x400) == 0 ? boolean0 : definedRequestOptions0.k;
        Boolean boolean3 = (v & 0x800) == 0 ? boolean1 : definedRequestOptions0.l;
        CachePolicy cachePolicy3 = (v & 0x1000) == 0 ? cachePolicy0 : definedRequestOptions0.m;
        CachePolicy cachePolicy4 = (v & 0x2000) == 0 ? cachePolicy1 : definedRequestOptions0.n;
        return (v & 0x4000) == 0 ? definedRequestOptions0.copy(lifecycle1, sizeResolver1, scale1, coroutineDispatcher4, coroutineDispatcher5, coroutineDispatcher6, coroutineDispatcher7, transition$Factory1, precision1, bitmap$Config1, boolean2, boolean3, cachePolicy3, cachePolicy4, cachePolicy2) : definedRequestOptions0.copy(lifecycle1, sizeResolver1, scale1, coroutineDispatcher4, coroutineDispatcher5, coroutineDispatcher6, coroutineDispatcher7, transition$Factory1, precision1, bitmap$Config1, boolean2, boolean3, cachePolicy3, cachePolicy4, definedRequestOptions0.o);
    }

    // 去混淆评级： 中等(110)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof DefinedRequestOptions && Intrinsics.areEqual(this.a, ((DefinedRequestOptions)object0).a) && Intrinsics.areEqual(this.b, ((DefinedRequestOptions)object0).b) && this.c == ((DefinedRequestOptions)object0).c && Intrinsics.areEqual(this.d, ((DefinedRequestOptions)object0).d) && Intrinsics.areEqual(this.e, ((DefinedRequestOptions)object0).e) && Intrinsics.areEqual(this.f, ((DefinedRequestOptions)object0).f) && Intrinsics.areEqual(this.g, ((DefinedRequestOptions)object0).g) && Intrinsics.areEqual(this.h, ((DefinedRequestOptions)object0).h) && this.i == ((DefinedRequestOptions)object0).i && this.j == ((DefinedRequestOptions)object0).j && Intrinsics.areEqual(this.k, ((DefinedRequestOptions)object0).k) && Intrinsics.areEqual(this.l, ((DefinedRequestOptions)object0).l) && this.m == ((DefinedRequestOptions)object0).m && this.n == ((DefinedRequestOptions)object0).n && this.o == ((DefinedRequestOptions)object0).o;
    }

    @Nullable
    public final Boolean getAllowHardware() {
        return this.k;
    }

    @Nullable
    public final Boolean getAllowRgb565() {
        return this.l;
    }

    @Nullable
    public final Bitmap.Config getBitmapConfig() {
        return this.j;
    }

    @Nullable
    public final CoroutineDispatcher getDecoderDispatcher() {
        return this.f;
    }

    @Nullable
    public final CachePolicy getDiskCachePolicy() {
        return this.n;
    }

    @Nullable
    public final CoroutineDispatcher getFetcherDispatcher() {
        return this.e;
    }

    @Nullable
    public final CoroutineDispatcher getInterceptorDispatcher() {
        return this.d;
    }

    @Nullable
    public final Lifecycle getLifecycle() {
        return this.a;
    }

    @Nullable
    public final CachePolicy getMemoryCachePolicy() {
        return this.m;
    }

    @Nullable
    public final CachePolicy getNetworkCachePolicy() {
        return this.o;
    }

    @Nullable
    public final Precision getPrecision() {
        return this.i;
    }

    @Nullable
    public final Scale getScale() {
        return this.c;
    }

    @Nullable
    public final SizeResolver getSizeResolver() {
        return this.b;
    }

    @Nullable
    public final CoroutineDispatcher getTransformationDispatcher() {
        return this.g;
    }

    @Nullable
    public final Factory getTransitionFactory() {
        return this.h;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        int v2 = this.b == null ? 0 : this.b.hashCode();
        int v3 = this.c == null ? 0 : this.c.hashCode();
        int v4 = this.d == null ? 0 : this.d.hashCode();
        int v5 = this.e == null ? 0 : this.e.hashCode();
        int v6 = this.f == null ? 0 : this.f.hashCode();
        int v7 = this.g == null ? 0 : this.g.hashCode();
        int v8 = this.h == null ? 0 : this.h.hashCode();
        int v9 = this.i == null ? 0 : this.i.hashCode();
        int v10 = this.j == null ? 0 : this.j.hashCode();
        int v11 = this.k == null ? 0 : this.k.hashCode();
        int v12 = this.l == null ? 0 : this.l.hashCode();
        int v13 = this.m == null ? 0 : this.m.hashCode();
        int v14 = this.n == null ? 0 : this.n.hashCode();
        CachePolicy cachePolicy0 = this.o;
        if(cachePolicy0 != null) {
            v = cachePolicy0.hashCode();
        }
        return (((((((((((((v1 * 0x1F + v2) * 0x1F + v3) * 0x1F + v4) * 0x1F + v5) * 0x1F + v6) * 0x1F + v7) * 0x1F + v8) * 0x1F + v9) * 0x1F + v10) * 0x1F + v11) * 0x1F + v12) * 0x1F + v13) * 0x1F + v14) * 0x1F + v;
    }
}

