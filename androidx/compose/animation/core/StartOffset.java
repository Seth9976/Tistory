package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001B\u001B\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000B\u001A\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000E\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0013\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0003\u001A\u00020\u00028F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001A\u00020\u00048Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0015\u0010\r\u0088\u0001\u0016\u0092\u0001\u00020\u0017\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Landroidx/compose/animation/core/StartOffset;", "", "", "offsetMillis", "Landroidx/compose/animation/core/StartOffsetType;", "offsetType", "constructor-impl", "(II)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getOffsetMillis-impl", "getOffsetType-Eo1U57Q", "value", "", "animation-core_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class StartOffset {
    public final long a;

    public StartOffset(long v) {
        this.a = v;
    }

    public static final StartOffset box-impl(long v) {
        return new StartOffset(v);
    }

    public static long constructor-impl(int v, int v1) [...] // Inlined contents

    public static long constructor-impl$default(int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) [...] // 潜在的解密器

    @Override
    public boolean equals(Object object0) {
        return StartOffset.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof StartOffset ? v == ((StartOffset)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final int getOffsetMillis-impl(long v) {
        return Math.abs(((int)v));
    }

    // 去混淆评级： 中等(70)
    public static final int getOffsetType-Eo1U57Q(long v) {
        return Long.compare(v, 0L) <= 0 ? 1 : -1;
    }

    @Override
    public int hashCode() {
        return StartOffset.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    public String toString() {
        return StartOffset.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "StartOffset(value=" + v + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

