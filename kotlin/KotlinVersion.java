package kotlin;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0012\b\u0007\u0018\u0000 \u001F2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001FB\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ\u001A\u0010\u000F\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0011\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001D\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0015\u001A\u00020\u000E2\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u0012R\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0019\u001A\u0004\b\u001C\u0010\u0012R\u0017\u0010\u0005\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u0019\u001A\u0004\b\u001E\u0010\u0012¨\u0006 "}, d2 = {"Lkotlin/KotlinVersion;", "", "", "major", "minor", "patch", "<init>", "(III)V", "(II)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "compareTo", "(Lkotlin/KotlinVersion;)I", "isAtLeast", "(II)Z", "(III)Z", "a", "I", "getMajor", "b", "getMinor", "c", "getPatch", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.1")
public final class KotlinVersion implements Comparable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/KotlinVersion$Companion;", "", "Lkotlin/KotlinVersion;", "CURRENT", "Lkotlin/KotlinVersion;", "", "MAX_COMPONENT_VALUE", "I", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @JvmField
    @NotNull
    public static final KotlinVersion CURRENT = null;
    @NotNull
    public static final Companion Companion = null;
    public static final int MAX_COMPONENT_VALUE = 0xFF;
    public final int a;
    public final int b;
    public final int c;
    public final int d;

    static {
        KotlinVersion.Companion = new Companion(null);
        KotlinVersion.CURRENT = new KotlinVersion(1, 9, 24);
    }

    public KotlinVersion(int v, int v1) {
        this(v, v1, 0);
    }

    public KotlinVersion(int v, int v1, int v2) {
        this.a = v;
        this.b = v1;
        this.c = v2;
        if(!new IntRange(0, 0xFF).contains(v) || !new IntRange(0, 0xFF).contains(v1) || !new IntRange(0, 0xFF).contains(v2)) {
            throw new IllegalArgumentException(("Version components are out of range: " + v + '.' + v1 + '.' + v2).toString());
        }
        this.d = (v << 16) + (v1 << 8) + v2;
    }

    @Override
    public int compareTo(Object object0) {
        return this.compareTo(((KotlinVersion)object0));
    }

    public int compareTo(@NotNull KotlinVersion kotlinVersion0) {
        Intrinsics.checkNotNullParameter(kotlinVersion0, "other");
        return this.d - kotlinVersion0.d;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        KotlinVersion kotlinVersion0 = object0 instanceof KotlinVersion ? ((KotlinVersion)object0) : null;
        return kotlinVersion0 == null ? false : this.d == kotlinVersion0.d;
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
        return this.d;
    }

    public final boolean isAtLeast(int v, int v1) {
        return this.a > v || this.a == v && this.b >= v1;
    }

    // 去混淆评级： 低(20)
    public final boolean isAtLeast(int v, int v1, int v2) {
        return this.a > v || this.a == v && (this.b > v1 || this.b == v1 && this.c >= v2);
    }

    @Override
    @NotNull
    public String toString() {
        return this.a + '.' + this.b + '.' + this.c;
    }
}

