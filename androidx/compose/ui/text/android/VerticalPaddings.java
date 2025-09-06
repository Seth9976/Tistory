package androidx.compose.ui.text.android;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\b\b\u0081@\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0014\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u0013\u0010\fR\u0011\u0010\u0016\u001A\u00020\n8F¢\u0006\u0006\u001A\u0004\b\u0015\u0010\f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/text/android/VerticalPaddings;", "", "", "packedValue", "constructor-impl", "(J)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "getTopPadding-impl", "topPadding", "getBottomPadding-impl", "bottomPadding", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nTextLayout.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n+ 2 InlineClassUtils.android.kt\nandroidx/compose/ui/text/android/InlineClassUtils_androidKt\n*L\n1#1,1155:1\n32#2:1156\n39#2:1157\n*S KotlinDebug\n*F\n+ 1 TextLayout.android.kt\nandroidx/compose/ui/text/android/VerticalPaddings\n*L\n992#1:1156\n995#1:1157\n*E\n"})
public final class VerticalPaddings {
    public final long a;

    public VerticalPaddings(long v) {
        this.a = v;
    }

    public static final VerticalPaddings box-impl(long v) {
        return new VerticalPaddings(v);
    }

    public static long constructor-impl(long v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return VerticalPaddings.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof VerticalPaddings ? v == ((VerticalPaddings)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final int getBottomPadding-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public static final int getTopPadding-impl(long v) {
        return (int)(v >> 0x20);
    }

    @Override
    public int hashCode() {
        return VerticalPaddings.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    public String toString() {
        return VerticalPaddings.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "VerticalPaddings(packedValue=" + v + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

