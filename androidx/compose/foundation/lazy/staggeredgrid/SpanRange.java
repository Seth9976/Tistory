package androidx.compose.foundation.lazy.staggeredgrid;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\f\b\u0081@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\r\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0012\u001A\u00020\u000F2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0018\u001A\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0012\u0010\u001A\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u0019\u0010\fR\u0012\u0010\u001C\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u001B\u0010\fR\u0012\u0010\u001E\u001A\u00020\u00028Æ\u0002¢\u0006\u0006\u001A\u0004\b\u001D\u0010\f\u0088\u0001\u0018\u0092\u0001\u00020\u0013¨\u0006\u001F"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/SpanRange;", "", "", "lane", "span", "constructor-impl", "(II)J", "", "toString-impl", "(J)Ljava/lang/String;", "toString", "hashCode-impl", "(J)I", "hashCode", "other", "", "equals-impl", "(JLjava/lang/Object;)Z", "equals", "", "a", "J", "getPackedValue", "()J", "packedValue", "getStart-impl", "start", "getEnd-impl", "end", "getSize-impl", "size", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1334:1\n1008#1:1338\n1007#1:1340\n100#2:1335\n107#2:1336\n114#2:1337\n114#2:1339\n107#2:1341\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasure.kt\nandroidx/compose/foundation/lazy/staggeredgrid/SpanRange\n*L\n1009#1:1338\n1009#1:1340\n1005#1:1335\n1007#1:1336\n1008#1:1337\n1009#1:1339\n1009#1:1341\n*E\n"})
public final class SpanRange {
    public final long a;

    public SpanRange(long v) {
        this.a = v;
    }

    public static final SpanRange box-impl(long v) {
        return new SpanRange(v);
    }

    public static long constructor-impl(int v, int v1) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return SpanRange.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(long v, Object object0) {
        return object0 instanceof SpanRange ? v == ((SpanRange)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(long v, long v1) {
        return v == v1;
    }

    public static final int getEnd-impl(long v) {
        return (int)(v & 0xFFFFFFFFL);
    }

    public final long getPackedValue() {
        return this.a;
    }

    public static final int getSize-impl(long v) {
        return ((int)(0xFFFFFFFFL & v)) - ((int)(v >> 0x20));
    }

    public static final int getStart-impl(long v) {
        return (int)(v >> 0x20);
    }

    @Override
    public int hashCode() {
        return SpanRange.hashCode-impl(this.a);
    }

    public static int hashCode-impl(long v) {
        return Long.hashCode(v);
    }

    @Override
    public String toString() {
        return SpanRange.toString-impl(this.a);
    }

    public static String toString-impl(long v) {
        return "SpanRange(packedValue=" + v + ')';
    }

    public final long unbox-impl() {
        return this.a;
    }
}

