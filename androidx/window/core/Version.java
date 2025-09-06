package androidx.window.core;

import d0.s;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000B\n\u0002\b\u0014\b\u0000\u0018\u0000 \u001D2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001DJ\u000F\u0010\u0003\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\u0005\u001A\u0004\u0018\u00010\tH\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\r\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000ER\u0017\u0010\u0012\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u000ER\u0017\u0010\u0015\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0010\u001A\u0004\b\u0014\u0010\u000ER\u0017\u0010\u0018\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0010\u001A\u0004\b\u0017\u0010\u000ER\u0017\u0010\u001C\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u0004¨\u0006\u001E"}, d2 = {"Landroidx/window/core/Version;", "", "", "toString", "()Ljava/lang/String;", "other", "", "compareTo", "(Landroidx/window/core/Version;)I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "I", "getMajor", "major", "b", "getMinor", "minor", "c", "getPatch", "patch", "d", "Ljava/lang/String;", "getDescription", "description", "Companion", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class Version implements Comparable {
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000F\b\u0080\u0003\u0018\u00002\u00020\u0001J\u001B\u0010\u0005\u001A\u0004\u0018\u00010\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001A\u0004\b\t\u0010\nR\u0017\u0010\u000B\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000B\u0010\b\u001A\u0004\b\f\u0010\nR\u0017\u0010\r\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001A\u0004\b\u000E\u0010\nR\u0017\u0010\u000F\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000F\u0010\b\u001A\u0004\b\u0010\u0010\nR\u0014\u0010\u0011\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/window/core/Version$Companion;", "", "", "versionString", "Landroidx/window/core/Version;", "parse", "(Ljava/lang/String;)Landroidx/window/core/Version;", "UNKNOWN", "Landroidx/window/core/Version;", "getUNKNOWN", "()Landroidx/window/core/Version;", "VERSION_0_1", "getVERSION_0_1", "VERSION_1_0", "getVERSION_1_0", "CURRENT", "getCURRENT", "VERSION_PATTERN_STRING", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final Version getCURRENT() {
            return Version.i;
        }

        @NotNull
        public final Version getUNKNOWN() {
            return Version.f;
        }

        @NotNull
        public final Version getVERSION_0_1() {
            return Version.g;
        }

        @NotNull
        public final Version getVERSION_1_0() {
            return Version.h;
        }

        @JvmStatic
        @Nullable
        public final Version parse(@Nullable String s) {
            if(s != null && !p.isBlank(s)) {
                Matcher matcher0 = Pattern.compile("(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?").matcher(s);
                if(!matcher0.matches()) {
                    return null;
                }
                String s1 = matcher0.group(1);
                Integer integer0 = s1 == null ? null : Integer.parseInt(s1);
                if(integer0 == null) {
                    return null;
                }
                int v = (int)integer0;
                String s2 = matcher0.group(2);
                Integer integer1 = s2 == null ? null : Integer.parseInt(s2);
                if(integer1 == null) {
                    return null;
                }
                int v1 = (int)integer1;
                String s3 = matcher0.group(3);
                Integer integer2 = s3 == null ? null : Integer.parseInt(s3);
                if(integer2 == null) {
                    return null;
                }
                String s4 = matcher0.group(4) == null ? "" : matcher0.group(4);
                Intrinsics.checkNotNullExpressionValue(s4, "description");
                return new Version(v, v1, ((int)integer2), s4, null);
            }
            return null;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final Lazy e;
    public static final Version f;
    public static final Version g;
    public static final Version h;
    public static final Version i;

    static {
        Version.Companion = new Companion(null);
        Version.f = new Version(0, 0, 0, "");
        Version.g = new Version(0, 1, 0, "");
        Version version0 = new Version(1, 0, 0, "");
        Version.h = version0;
        Version.i = version0;
    }

    public Version(int v, int v1, int v2, String s) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        this.d = s;
        this.e = c.lazy(new s(this, 24));
    }

    public Version(int v, int v1, int v2, String s, DefaultConstructorMarker defaultConstructorMarker0) {
        this(v, v1, v2, s);
    }

    public int compareTo(@NotNull Version version0) {
        Intrinsics.checkNotNullParameter(version0, "other");
        Object object0 = this.e.getValue();
        Intrinsics.checkNotNullExpressionValue(object0, "<get-bigInteger>(...)");
        Object object1 = version0.e.getValue();
        Intrinsics.checkNotNullExpressionValue(object1, "<get-bigInteger>(...)");
        return ((BigInteger)object0).compareTo(((BigInteger)object1));
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((Version)object0));
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        return object0 instanceof Version ? this.a == ((Version)object0).a && this.b == ((Version)object0).b && this.c == ((Version)object0).c : false;
    }

    @NotNull
    public final String getDescription() {
        return this.d;
    }

    public final int getMajor() {
        return this.a;
    }

    public final int getMinor() {
        return this.b;
    }

    public final int getPatch() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return ((this.a + 0x20F) * 0x1F + this.b) * 0x1F + this.c;
    }

    @JvmStatic
    @Nullable
    public static final Version parse(@Nullable String s) {
        return Version.Companion.parse(s);
    }

    @Override
    @NotNull
    public String toString() {
        String s = p.isBlank(this.d) ? "" : "-" + this.d;
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a);
        stringBuilder0.append('.');
        stringBuilder0.append(this.b);
        stringBuilder0.append('.');
        return a.c(this.c, s, stringBuilder0);
    }
}

