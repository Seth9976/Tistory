package okhttp3;

import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import okhttp3.internal.Util;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000E\n\u0002\b\u0015\u0018\u0000 -2\u00020\u0001:\u0002.-J\u000F\u0010\u0005\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u000F\u0010\u0007\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0006\u0010\u0004J\u000F\u0010\u000B\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\r\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\f\u0010\nJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u000E\u0010\u0004J\u000F\u0010\u0011\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u0010\u0010\nJ\u000F\u0010\u0013\u001A\u00020\bH\u0007\u00A2\u0006\u0004\b\u0012\u0010\nJ\u000F\u0010\u0015\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0004J\u000F\u0010\u0017\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0016\u0010\u0004J\u000F\u0010\u0019\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u0018\u0010\u0004J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016\u00A2\u0006\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0005\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u0005\u0010\u0004R\u0017\u0010\u0007\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b\u001F\u0010\u001E\u001A\u0004\b\u0007\u0010\u0004R\u0017\u0010\u000B\u001A\u00020\b8\u0007\u00A2\u0006\f\n\u0004\b \u0010!\u001A\u0004\b\u000B\u0010\nR\u0017\u0010\r\u001A\u00020\b8\u0007\u00A2\u0006\f\n\u0004\b\"\u0010!\u001A\u0004\b\r\u0010\nR\u0017\u0010$\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b#\u0010\u001E\u001A\u0004\b$\u0010\u0004R\u0017\u0010&\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\b%\u0010\u001E\u001A\u0004\b&\u0010\u0004R\u0017\u0010\u000F\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b\'\u0010\u001E\u001A\u0004\b\u000F\u0010\u0004R\u0017\u0010\u0011\u001A\u00020\b8\u0007\u00A2\u0006\f\n\u0004\b(\u0010!\u001A\u0004\b\u0011\u0010\nR\u0017\u0010\u0013\u001A\u00020\b8\u0007\u00A2\u0006\f\n\u0004\b)\u0010!\u001A\u0004\b\u0013\u0010\nR\u0017\u0010\u0015\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b*\u0010\u001E\u001A\u0004\b\u0015\u0010\u0004R\u0017\u0010\u0017\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b+\u0010\u001E\u001A\u0004\b\u0017\u0010\u0004R\u0017\u0010\u0019\u001A\u00020\u00028\u0007\u00A2\u0006\f\n\u0004\b,\u0010\u001E\u001A\u0004\b\u0019\u0010\u0004\u00A8\u0006/"}, d2 = {"Lokhttp3/CacheControl;", "", "", "-deprecated_noCache", "()Z", "noCache", "-deprecated_noStore", "noStore", "", "-deprecated_maxAgeSeconds", "()I", "maxAgeSeconds", "-deprecated_sMaxAgeSeconds", "sMaxAgeSeconds", "-deprecated_mustRevalidate", "mustRevalidate", "-deprecated_maxStaleSeconds", "maxStaleSeconds", "-deprecated_minFreshSeconds", "minFreshSeconds", "-deprecated_onlyIfCached", "onlyIfCached", "-deprecated_noTransform", "noTransform", "-deprecated_immutable", "immutable", "", "toString", "()Ljava/lang/String;", "a", "Z", "b", "c", "I", "d", "e", "isPrivate", "f", "isPublic", "g", "h", "i", "j", "k", "l", "Companion", "Builder", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CacheControl {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0004\u001A\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001A\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0005J\u001D\u0010\b\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\b\u0010\u000BJ\u001D\u0010\f\u001A\u00020\u00002\u0006\u0010\f\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\f\u0010\u000BJ\u001D\u0010\r\u001A\u00020\u00002\u0006\u0010\r\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000BJ\r\u0010\u000E\u001A\u00020\u0000¢\u0006\u0004\b\u000E\u0010\u0005J\r\u0010\u000F\u001A\u00020\u0000¢\u0006\u0004\b\u000F\u0010\u0005J\r\u0010\u0010\u001A\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0005J\r\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lokhttp3/CacheControl$Builder;", "", "<init>", "()V", "noCache", "()Lokhttp3/CacheControl$Builder;", "noStore", "", "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "(ILjava/util/concurrent/TimeUnit;)Lokhttp3/CacheControl$Builder;", "maxStale", "minFresh", "onlyIfCached", "noTransform", "immutable", "Lokhttp3/CacheControl;", "build", "()Lokhttp3/CacheControl;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nCacheControl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CacheControl.kt\nokhttp3/CacheControl$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
    public static final class Builder {
        public boolean a;
        public boolean b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;

        public Builder() {
            this.c = -1;
            this.d = -1;
            this.e = -1;
        }

        @NotNull
        public final CacheControl build() {
            return new CacheControl(this.a, this.b, this.c, -1, false, false, false, this.d, this.e, this.f, this.g, this.h, null, null);
        }

        @NotNull
        public final Builder immutable() {
            this.h = true;
            return this;
        }

        @NotNull
        public final Builder maxAge(int v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            if(v < 0) {
                throw new IllegalArgumentException(("maxAge < 0: " + v).toString());
            }
            long v1 = timeUnit0.toSeconds(((long)v));
            this.c = v1 <= 0x7FFFFFFFL ? ((int)v1) : 0x7FFFFFFF;
            return this;
        }

        @NotNull
        public final Builder maxStale(int v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            if(v < 0) {
                throw new IllegalArgumentException(("maxStale < 0: " + v).toString());
            }
            long v1 = timeUnit0.toSeconds(((long)v));
            this.d = v1 <= 0x7FFFFFFFL ? ((int)v1) : 0x7FFFFFFF;
            return this;
        }

        @NotNull
        public final Builder minFresh(int v, @NotNull TimeUnit timeUnit0) {
            Intrinsics.checkNotNullParameter(timeUnit0, "timeUnit");
            if(v < 0) {
                throw new IllegalArgumentException(("minFresh < 0: " + v).toString());
            }
            long v1 = timeUnit0.toSeconds(((long)v));
            this.e = v1 <= 0x7FFFFFFFL ? ((int)v1) : 0x7FFFFFFF;
            return this;
        }

        @NotNull
        public final Builder noCache() {
            this.a = true;
            return this;
        }

        @NotNull
        public final Builder noStore() {
            this.b = true;
            return this;
        }

        @NotNull
        public final Builder noTransform() {
            this.g = true;
            return this;
        }

        @NotNull
        public final Builder onlyIfCached() {
            this.f = true;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lokhttp3/CacheControl$Companion;", "", "Lokhttp3/Headers;", "headers", "Lokhttp3/CacheControl;", "parse", "(Lokhttp3/Headers;)Lokhttp3/CacheControl;", "FORCE_CACHE", "Lokhttp3/CacheControl;", "FORCE_NETWORK", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final CacheControl parse(@NotNull Headers headers0) {
            boolean z11;
            boolean z10;
            int v16;
            String s6;
            boolean z9;
            boolean z8;
            String s3;
            int v11;
            int v10;
            int v7;
            Intrinsics.checkNotNullParameter(headers0, "headers");
            int v = headers0.size();
            int v1 = 1;
            int v2 = 0;
            String s = null;
            boolean z = false;
            boolean z1 = false;
            int v3 = -1;
            int v4 = -1;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            int v5 = -1;
            int v6 = -1;
            boolean z5 = false;
            boolean z6 = false;
            boolean z7 = false;
            while(v2 < v) {
                String s1 = headers0.name(v2);
                String s2 = headers0.value(v2);
                if(p.equals(s1, "Cache-Control", true)) {
                    if(s == null) {
                        s = s2;
                    }
                    else {
                        v1 = 0;
                    }
                    v7 = 0;
                    goto label_30;
                }
                else if(p.equals(s1, "Pragma", true)) {
                    v1 = 0;
                    v7 = 0;
                label_30:
                    while(v7 < s2.length()) {
                        int v8 = s2.length();
                        int v9 = v7;
                        while(true) {
                            if(v9 < v8) {
                                v10 = v;
                                v11 = v1;
                                s3 = s;
                                if(StringsKt__StringsKt.contains$default("=,;", s2.charAt(v9), false, 2, null)) {
                                    break;
                                }
                                else {
                                    ++v9;
                                    v = v10;
                                    v1 = v11;
                                    s = s3;
                                    continue;
                                }
                            }
                            v10 = v;
                            v11 = v1;
                            s3 = s;
                            v9 = s2.length();
                            break;
                        }
                        String s4 = s2.substring(v7, v9);
                        Intrinsics.checkNotNullExpressionValue(s4, "this as java.lang.String…ing(startIndex, endIndex)");
                        String s5 = StringsKt__StringsKt.trim(s4).toString();
                        if(v9 != s2.length() && s2.charAt(v9) != 44 && s2.charAt(v9) != 59) {
                            int v12 = Util.indexOfNonWhitespace(s2, v9 + 1);
                            if(v12 >= s2.length() || s2.charAt(v12) != 34) {
                                int v14 = s2.length();
                                int v15 = v12;
                                while(true) {
                                    if(v15 < v14) {
                                        z8 = z3;
                                        z9 = z4;
                                        if(StringsKt__StringsKt.contains$default(",;", s2.charAt(v15), false, 2, null)) {
                                            break;
                                        }
                                        else {
                                            ++v15;
                                            z4 = z9;
                                            z3 = z8;
                                            continue;
                                        }
                                    }
                                    z8 = z3;
                                    z9 = z4;
                                    v15 = s2.length();
                                    break;
                                }
                                String s7 = s2.substring(v12, v15);
                                Intrinsics.checkNotNullExpressionValue(s7, "this as java.lang.String…ing(startIndex, endIndex)");
                                s6 = StringsKt__StringsKt.trim(s7).toString();
                                v7 = v15;
                            }
                            else {
                                int v13 = StringsKt__StringsKt.indexOf$default(s2, '\"', v12 + 1, false, 4, null);
                                s6 = s2.substring(v12 + 1, v13);
                                Intrinsics.checkNotNullExpressionValue(s6, "this as java.lang.String…ing(startIndex, endIndex)");
                                v7 = v13 + 1;
                                z8 = z3;
                                z9 = z4;
                            }
                        }
                        else {
                            z8 = z3;
                            z9 = z4;
                            v7 = v9 + 1;
                            s6 = null;
                        }
                        if(p.equals("no-cache", s5, true)) {
                            z = true;
                        }
                        else if(p.equals("no-store", s5, true)) {
                            z1 = true;
                        }
                        else if(p.equals("max-age", s5, true)) {
                            v3 = Util.toNonNegativeInt(s6, -1);
                        }
                        else if(p.equals("s-maxage", s5, true)) {
                            v4 = Util.toNonNegativeInt(s6, -1);
                        }
                        else if(p.equals("private", s5, true)) {
                            z2 = true;
                        }
                        else if(p.equals("public", s5, true)) {
                            z3 = true;
                            z4 = z9;
                            goto label_122;
                        }
                        else if(p.equals("must-revalidate", s5, true)) {
                            z4 = true;
                            goto label_121;
                        }
                        else if(p.equals("max-stale", s5, true)) {
                            v5 = Util.toNonNegativeInt(s6, 0x7FFFFFFF);
                        }
                        else if(p.equals("min-fresh", s5, true)) {
                            v6 = Util.toNonNegativeInt(s6, -1);
                        }
                        else if(p.equals("only-if-cached", s5, true)) {
                            z5 = true;
                        }
                        else if(p.equals("no-transform", s5, true)) {
                            z6 = true;
                        }
                        else if(p.equals("immutable", s5, true)) {
                            z7 = true;
                        }
                        z4 = z9;
                    label_121:
                        z3 = z8;
                    label_122:
                        v = v10;
                        v1 = v11;
                        s = s3;
                    }
                    v16 = v;
                    z10 = z4;
                    z11 = z3;
                }
                else {
                    v16 = v;
                    z11 = z3;
                    z10 = z4;
                }
                ++v2;
                z4 = z10;
                z3 = z11;
                v = v16;
            }
            return v1 == 0 ? new CacheControl(z, z1, v3, v4, z2, z3, z4, v5, v6, z5, z6, z7, null, null) : new CacheControl(z, z1, v3, v4, z2, z3, z4, v5, v6, z5, z6, z7, s, null);
        }
    }

    @NotNull
    public static final Companion Companion;
    @JvmField
    @NotNull
    public static final CacheControl FORCE_CACHE;
    @JvmField
    @NotNull
    public static final CacheControl FORCE_NETWORK;
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final int h;
    public final int i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public String m;

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "immutable", imports = {}))
    @JvmName(name = "-deprecated_immutable")
    public final boolean -deprecated_immutable() {
        return this.l;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxAgeSeconds")
    public final int -deprecated_maxAgeSeconds() {
        return this.c;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "maxStaleSeconds", imports = {}))
    @JvmName(name = "-deprecated_maxStaleSeconds")
    public final int -deprecated_maxStaleSeconds() {
        return this.h;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "minFreshSeconds", imports = {}))
    @JvmName(name = "-deprecated_minFreshSeconds")
    public final int -deprecated_minFreshSeconds() {
        return this.i;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "mustRevalidate", imports = {}))
    @JvmName(name = "-deprecated_mustRevalidate")
    public final boolean -deprecated_mustRevalidate() {
        return this.g;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noCache", imports = {}))
    @JvmName(name = "-deprecated_noCache")
    public final boolean -deprecated_noCache() {
        return this.a;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noStore", imports = {}))
    @JvmName(name = "-deprecated_noStore")
    public final boolean -deprecated_noStore() {
        return this.b;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "noTransform", imports = {}))
    @JvmName(name = "-deprecated_noTransform")
    public final boolean -deprecated_noTransform() {
        return this.k;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "onlyIfCached", imports = {}))
    @JvmName(name = "-deprecated_onlyIfCached")
    public final boolean -deprecated_onlyIfCached() {
        return this.j;
    }

    @Deprecated(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @ReplaceWith(expression = "sMaxAgeSeconds", imports = {}))
    @JvmName(name = "-deprecated_sMaxAgeSeconds")
    public final int -deprecated_sMaxAgeSeconds() {
        return this.d;
    }

    static {
        CacheControl.Companion = new Companion(null);
        CacheControl.FORCE_NETWORK = new Builder().noCache().build();
        CacheControl.FORCE_CACHE = new Builder().onlyIfCached().maxStale(0x7FFFFFFF, TimeUnit.SECONDS).build();
    }

    public CacheControl(boolean z, boolean z1, int v, int v1, boolean z2, boolean z3, boolean z4, int v2, int v3, boolean z5, boolean z6, boolean z7, String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this.a = z;
        this.b = z1;
        this.c = v;
        this.d = v1;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = v2;
        this.i = v3;
        this.j = z5;
        this.k = z6;
        this.l = z7;
        this.m = s;
    }

    @JvmName(name = "immutable")
    public final boolean immutable() {
        return this.l;
    }

    public final boolean isPrivate() {
        return this.e;
    }

    public final boolean isPublic() {
        return this.f;
    }

    @JvmName(name = "maxAgeSeconds")
    public final int maxAgeSeconds() {
        return this.c;
    }

    @JvmName(name = "maxStaleSeconds")
    public final int maxStaleSeconds() {
        return this.h;
    }

    @JvmName(name = "minFreshSeconds")
    public final int minFreshSeconds() {
        return this.i;
    }

    @JvmName(name = "mustRevalidate")
    public final boolean mustRevalidate() {
        return this.g;
    }

    @JvmName(name = "noCache")
    public final boolean noCache() {
        return this.a;
    }

    @JvmName(name = "noStore")
    public final boolean noStore() {
        return this.b;
    }

    @JvmName(name = "noTransform")
    public final boolean noTransform() {
        return this.k;
    }

    @JvmName(name = "onlyIfCached")
    public final boolean onlyIfCached() {
        return this.j;
    }

    @JvmStatic
    @NotNull
    public static final CacheControl parse(@NotNull Headers headers0) {
        return CacheControl.Companion.parse(headers0);
    }

    @JvmName(name = "sMaxAgeSeconds")
    public final int sMaxAgeSeconds() {
        return this.d;
    }

    @Override
    @NotNull
    public String toString() {
        String s = this.m;
        if(s == null) {
            StringBuilder stringBuilder0 = new StringBuilder();
            if(this.a) {
                stringBuilder0.append("no-cache, ");
            }
            if(this.b) {
                stringBuilder0.append("no-store, ");
            }
            int v = this.c;
            if(v != -1) {
                stringBuilder0.append("max-age=");
                stringBuilder0.append(v);
                stringBuilder0.append(", ");
            }
            int v1 = this.d;
            if(v1 != -1) {
                stringBuilder0.append("s-maxage=");
                stringBuilder0.append(v1);
                stringBuilder0.append(", ");
            }
            if(this.e) {
                stringBuilder0.append("private, ");
            }
            if(this.f) {
                stringBuilder0.append("public, ");
            }
            if(this.g) {
                stringBuilder0.append("must-revalidate, ");
            }
            int v2 = this.h;
            if(v2 != -1) {
                stringBuilder0.append("max-stale=");
                stringBuilder0.append(v2);
                stringBuilder0.append(", ");
            }
            int v3 = this.i;
            if(v3 != -1) {
                stringBuilder0.append("min-fresh=");
                stringBuilder0.append(v3);
                stringBuilder0.append(", ");
            }
            if(this.j) {
                stringBuilder0.append("only-if-cached, ");
            }
            if(this.k) {
                stringBuilder0.append("no-transform, ");
            }
            if(this.l) {
                stringBuilder0.append("immutable, ");
            }
            if(stringBuilder0.length() == 0) {
                return "";
            }
            stringBuilder0.delete(stringBuilder0.length() - 2, stringBuilder0.length());
            s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
            this.m = s;
        }
        return s;
    }
}

