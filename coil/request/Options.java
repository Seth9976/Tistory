package coil.request;

import android.content.Context;
import android.graphics.Bitmap.Config;
import android.graphics.ColorSpace;
import coil.size.Scale;
import coil.size.Size;
import coil.util.-Utils;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r0.a;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b7\u0018\u00002\u00020\u0001B\u009F\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001A\u00020\b\u0012\b\b\u0002\u0010\u000B\u001A\u00020\n\u0012\b\b\u0002\u0010\r\u001A\u00020\f\u0012\b\b\u0002\u0010\u000E\u001A\u00020\f\u0012\b\b\u0002\u0010\u000F\u001A\u00020\f\u0012\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001A\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001A\u00020\u0014\u0012\b\b\u0002\u0010\u0017\u001A\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001A\u00020\u0018\u0012\b\b\u0002\u0010\u001A\u001A\u00020\u0018\u0012\b\b\u0002\u0010\u001B\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u00A7\u0001\u0010\u001E\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\b\b\u0002\u0010\u0005\u001A\u00020\u00042\n\b\u0002\u0010\u0007\u001A\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001A\u00020\b2\b\b\u0002\u0010\u000B\u001A\u00020\n2\b\b\u0002\u0010\r\u001A\u00020\f2\b\b\u0002\u0010\u000E\u001A\u00020\f2\b\b\u0002\u0010\u000F\u001A\u00020\f2\n\b\u0002\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0013\u001A\u00020\u00122\b\b\u0002\u0010\u0015\u001A\u00020\u00142\b\b\u0002\u0010\u0017\u001A\u00020\u00162\b\b\u0002\u0010\u0019\u001A\u00020\u00182\b\b\u0002\u0010\u001A\u001A\u00020\u00182\b\b\u0002\u0010\u001B\u001A\u00020\u0018\u00A2\u0006\u0004\b\u001E\u0010\u001FJ\u001A\u0010!\u001A\u00020\f2\b\u0010 \u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\b!\u0010\"J\u000F\u0010$\u001A\u00020#H\u0016\u00A2\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\b*\u0010+\u001A\u0004\b,\u0010-R\u0019\u0010\u0007\u001A\u0004\u0018\u00010\u00068\u0006\u00A2\u0006\f\n\u0004\b.\u0010/\u001A\u0004\b0\u00101R\u0017\u0010\t\u001A\u00020\b8\u0006\u00A2\u0006\f\n\u0004\b2\u00103\u001A\u0004\b4\u00105R\u0017\u0010\u000B\u001A\u00020\n8\u0006\u00A2\u0006\f\n\u0004\b6\u00107\u001A\u0004\b8\u00109R\u0017\u0010\r\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R\u0017\u0010\u000E\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b>\u0010;\u001A\u0004\b?\u0010=R\u0017\u0010\u000F\u001A\u00020\f8\u0006\u00A2\u0006\f\n\u0004\b@\u0010;\u001A\u0004\bA\u0010=R\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00108\u0006\u00A2\u0006\f\n\u0004\bB\u0010C\u001A\u0004\bD\u0010ER\u0017\u0010\u0013\u001A\u00020\u00128\u0006\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0017\u0010\u0015\u001A\u00020\u00148\u0006\u00A2\u0006\f\n\u0004\bJ\u0010K\u001A\u0004\bL\u0010MR\u0017\u0010\u0017\u001A\u00020\u00168\u0006\u00A2\u0006\f\n\u0004\bN\u0010O\u001A\u0004\bP\u0010QR\u0017\u0010\u0019\u001A\u00020\u00188\u0006\u00A2\u0006\f\n\u0004\bR\u0010S\u001A\u0004\bT\u0010UR\u0017\u0010\u001A\u001A\u00020\u00188\u0006\u00A2\u0006\f\n\u0004\bV\u0010S\u001A\u0004\bW\u0010UR\u0017\u0010\u001B\u001A\u00020\u00188\u0006\u00A2\u0006\f\n\u0004\bX\u0010S\u001A\u0004\bY\u0010U\u00A8\u0006Z"}, d2 = {"Lcoil/request/Options;", "", "Landroid/content/Context;", "context", "Landroid/graphics/Bitmap$Config;", "config", "Landroid/graphics/ColorSpace;", "colorSpace", "Lcoil/size/Size;", "size", "Lcoil/size/Scale;", "scale", "", "allowInexactSize", "allowRgb565", "premultipliedAlpha", "", "diskCacheKey", "Lokhttp3/Headers;", "headers", "Lcoil/request/Tags;", "tags", "Lcoil/request/Parameters;", "parameters", "Lcoil/request/CachePolicy;", "memoryCachePolicy", "diskCachePolicy", "networkCachePolicy", "<init>", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Size;Lcoil/size/Scale;ZZZLjava/lang/String;Lokhttp3/Headers;Lcoil/request/Tags;Lcoil/request/Parameters;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)V", "copy", "(Landroid/content/Context;Landroid/graphics/Bitmap$Config;Landroid/graphics/ColorSpace;Lcoil/size/Size;Lcoil/size/Scale;ZZZLjava/lang/String;Lokhttp3/Headers;Lcoil/request/Tags;Lcoil/request/Parameters;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;Lcoil/request/CachePolicy;)Lcoil/request/Options;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Landroid/graphics/Bitmap$Config;", "getConfig", "()Landroid/graphics/Bitmap$Config;", "c", "Landroid/graphics/ColorSpace;", "getColorSpace", "()Landroid/graphics/ColorSpace;", "d", "Lcoil/size/Size;", "getSize", "()Lcoil/size/Size;", "e", "Lcoil/size/Scale;", "getScale", "()Lcoil/size/Scale;", "f", "Z", "getAllowInexactSize", "()Z", "g", "getAllowRgb565", "h", "getPremultipliedAlpha", "i", "Ljava/lang/String;", "getDiskCacheKey", "()Ljava/lang/String;", "j", "Lokhttp3/Headers;", "getHeaders", "()Lokhttp3/Headers;", "k", "Lcoil/request/Tags;", "getTags", "()Lcoil/request/Tags;", "l", "Lcoil/request/Parameters;", "getParameters", "()Lcoil/request/Parameters;", "m", "Lcoil/request/CachePolicy;", "getMemoryCachePolicy", "()Lcoil/request/CachePolicy;", "n", "getDiskCachePolicy", "o", "getNetworkCachePolicy", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class Options {
    public final Context a;
    public final Bitmap.Config b;
    public final ColorSpace c;
    public final Size d;
    public final Scale e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final String i;
    public final Headers j;
    public final Tags k;
    public final Parameters l;
    public final CachePolicy m;
    public final CachePolicy n;
    public final CachePolicy o;

    public Options(@NotNull Context context0, @NotNull Bitmap.Config bitmap$Config0, @Nullable ColorSpace colorSpace0, @NotNull Size size0, @NotNull Scale scale0, boolean z, boolean z1, boolean z2, @Nullable String s, @NotNull Headers headers0, @NotNull Tags tags0, @NotNull Parameters parameters0, @NotNull CachePolicy cachePolicy0, @NotNull CachePolicy cachePolicy1, @NotNull CachePolicy cachePolicy2) {
        this.a = context0;
        this.b = bitmap$Config0;
        this.c = colorSpace0;
        this.d = size0;
        this.e = scale0;
        this.f = z;
        this.g = z1;
        this.h = z2;
        this.i = s;
        this.j = headers0;
        this.k = tags0;
        this.l = parameters0;
        this.m = cachePolicy0;
        this.n = cachePolicy1;
        this.o = cachePolicy2;
    }

    public Options(Context context0, Bitmap.Config bitmap$Config0, ColorSpace colorSpace0, Size size0, Scale scale0, boolean z, boolean z1, boolean z2, String s, Headers headers0, Tags tags0, Parameters parameters0, CachePolicy cachePolicy0, CachePolicy cachePolicy1, CachePolicy cachePolicy2, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(context0, ((v & 2) == 0 ? bitmap$Config0 : Bitmap.Config.ARGB_8888), ((v & 4) == 0 ? colorSpace0 : null), ((v & 8) == 0 ? size0 : Size.ORIGINAL), ((v & 16) == 0 ? scale0 : Scale.FIT), ((v & 0x20) == 0 ? z : false), ((v & 0x40) == 0 ? z1 : false), ((v & 0x80) == 0 ? z2 : true), ((v & 0x100) == 0 ? s : null), ((v & 0x200) == 0 ? headers0 : -Utils.getEMPTY_HEADERS()), ((v & 0x400) == 0 ? tags0 : Tags.EMPTY), ((v & 0x800) == 0 ? parameters0 : Parameters.EMPTY), ((v & 0x1000) == 0 ? cachePolicy0 : CachePolicy.ENABLED), ((v & 0x2000) == 0 ? cachePolicy1 : CachePolicy.ENABLED), ((v & 0x4000) == 0 ? cachePolicy2 : CachePolicy.ENABLED));
    }

    @NotNull
    public final Options copy(@NotNull Context context0, @NotNull Bitmap.Config bitmap$Config0, @Nullable ColorSpace colorSpace0, @NotNull Size size0, @NotNull Scale scale0, boolean z, boolean z1, boolean z2, @Nullable String s, @NotNull Headers headers0, @NotNull Tags tags0, @NotNull Parameters parameters0, @NotNull CachePolicy cachePolicy0, @NotNull CachePolicy cachePolicy1, @NotNull CachePolicy cachePolicy2) {
        return new Options(context0, bitmap$Config0, colorSpace0, size0, scale0, z, z1, z2, s, headers0, tags0, parameters0, cachePolicy0, cachePolicy1, cachePolicy2);
    }

    public static Options copy$default(Options options0, Context context0, Bitmap.Config bitmap$Config0, ColorSpace colorSpace0, Size size0, Scale scale0, boolean z, boolean z1, boolean z2, String s, Headers headers0, Tags tags0, Parameters parameters0, CachePolicy cachePolicy0, CachePolicy cachePolicy1, CachePolicy cachePolicy2, int v, Object object0) {
        Context context1 = (v & 1) == 0 ? context0 : options0.a;
        Bitmap.Config bitmap$Config1 = (v & 2) == 0 ? bitmap$Config0 : options0.b;
        ColorSpace colorSpace1 = (v & 4) == 0 ? colorSpace0 : options0.c;
        Size size1 = (v & 8) == 0 ? size0 : options0.d;
        Scale scale1 = (v & 16) == 0 ? scale0 : options0.e;
        boolean z3 = (v & 0x20) == 0 ? z : options0.f;
        boolean z4 = (v & 0x40) == 0 ? z1 : options0.g;
        boolean z5 = (v & 0x80) == 0 ? z2 : options0.h;
        String s1 = (v & 0x100) == 0 ? s : options0.i;
        Headers headers1 = (v & 0x200) == 0 ? headers0 : options0.j;
        Tags tags1 = (v & 0x400) == 0 ? tags0 : options0.k;
        Parameters parameters1 = (v & 0x800) == 0 ? parameters0 : options0.l;
        CachePolicy cachePolicy3 = (v & 0x1000) == 0 ? cachePolicy0 : options0.m;
        CachePolicy cachePolicy4 = (v & 0x2000) == 0 ? cachePolicy1 : options0.n;
        return (v & 0x4000) == 0 ? options0.copy(context1, bitmap$Config1, colorSpace1, size1, scale1, z3, z4, z5, s1, headers1, tags1, parameters1, cachePolicy3, cachePolicy4, cachePolicy2) : options0.copy(context1, bitmap$Config1, colorSpace1, size1, scale1, z3, z4, z5, s1, headers1, tags1, parameters1, cachePolicy3, cachePolicy4, options0.o);
    }

    // 去混淆评级： 中等(90)
    @Override
    public boolean equals(@Nullable Object object0) {
        return this == object0 ? true : object0 instanceof Options && Intrinsics.areEqual(this.a, ((Options)object0).a) && this.b == ((Options)object0).b && Intrinsics.areEqual(this.c, ((Options)object0).c) && Intrinsics.areEqual(this.d, ((Options)object0).d) && this.e == ((Options)object0).e && this.f == ((Options)object0).f && this.g == ((Options)object0).g && this.h == ((Options)object0).h && Intrinsics.areEqual(this.i, ((Options)object0).i) && Intrinsics.areEqual(this.j, ((Options)object0).j) && Intrinsics.areEqual(this.k, ((Options)object0).k) && Intrinsics.areEqual(this.l, ((Options)object0).l) && this.m == ((Options)object0).m && this.n == ((Options)object0).n && this.o == ((Options)object0).o;
    }

    public final boolean getAllowInexactSize() {
        return this.f;
    }

    public final boolean getAllowRgb565() {
        return this.g;
    }

    @Nullable
    public final ColorSpace getColorSpace() {
        return this.c;
    }

    @NotNull
    public final Bitmap.Config getConfig() {
        return this.b;
    }

    @NotNull
    public final Context getContext() {
        return this.a;
    }

    @Nullable
    public final String getDiskCacheKey() {
        return this.i;
    }

    @NotNull
    public final CachePolicy getDiskCachePolicy() {
        return this.n;
    }

    @NotNull
    public final Headers getHeaders() {
        return this.j;
    }

    @NotNull
    public final CachePolicy getMemoryCachePolicy() {
        return this.m;
    }

    @NotNull
    public final CachePolicy getNetworkCachePolicy() {
        return this.o;
    }

    @NotNull
    public final Parameters getParameters() {
        return this.l;
    }

    public final boolean getPremultipliedAlpha() {
        return this.h;
    }

    @NotNull
    public final Scale getScale() {
        return this.e;
    }

    @NotNull
    public final Size getSize() {
        return this.d;
    }

    @NotNull
    public final Tags getTags() {
        return this.k;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = a.e(a.e(a.e((this.e.hashCode() + (this.d.hashCode() + ((this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F + (this.c == null ? 0 : this.c.hashCode())) * 0x1F) * 0x1F) * 0x1F, 0x1F, this.f), 0x1F, this.g), 0x1F, this.h);
        String s = this.i;
        if(s != null) {
            v = s.hashCode();
        }
        return this.o.hashCode() + (this.n.hashCode() + (this.m.hashCode() + (this.l.hashCode() + (this.k.hashCode() + (this.j.hashCode() + (v1 + v) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F) * 0x1F;
    }
}

