package kotlinx.coroutines.internal;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\f\b\u0081@\u0018\u0000*\u000E\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0003B\u0014\u0012\b\u0010\u0004\u001A\u0004\u0018\u00010\u0003ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001A\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000E\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0013\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0016\u001A\u00020\u00108F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001B\u001A\u00028\u00008F¢\u0006\f\u0012\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u0017\u0010\u0018\u0088\u0001\u0004\u0092\u0001\u0004\u0018\u00010\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001C"}, d2 = {"Lkotlinx/coroutines/internal/SegmentOrClosed;", "Lkotlinx/coroutines/internal/Segment;", "S", "", "value", "constructor-impl", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "toString-impl", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/lang/Object;)I", "hashCode", "other", "", "equals-impl", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "equals", "isClosed-impl", "(Ljava/lang/Object;)Z", "isClosed", "getSegment-impl", "(Ljava/lang/Object;)Lkotlinx/coroutines/internal/Segment;", "getSegment$annotations", "()V", "segment", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class SegmentOrClosed {
    public final Object a;

    public SegmentOrClosed(Object object0) {
        this.a = object0;
    }

    public static final SegmentOrClosed box-impl(Object object0) {
        return new SegmentOrClosed(object0);
    }

    @NotNull
    public static Object constructor-impl(@Nullable Object object0) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return SegmentOrClosed.equals-impl(this.a, object0);
    }

    // 去混淆评级： 低(20)
    public static boolean equals-impl(Object object0, Object object1) {
        return object1 instanceof SegmentOrClosed ? Intrinsics.areEqual(object0, ((SegmentOrClosed)object1).unbox-impl()) : false;
    }

    public static final boolean equals-impl0(Object object0, Object object1) {
        return Intrinsics.areEqual(object0, object1);
    }

    public static void getSegment$annotations() {
    }

    @NotNull
    public static final Segment getSegment-impl(Object object0) {
        if(object0 == ConcurrentLinkedListKt.a) {
            throw new IllegalStateException("Does not contain segment");
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
        return (Segment)object0;
    }

    @Override
    public int hashCode() {
        return SegmentOrClosed.hashCode-impl(this.a);
    }

    public static int hashCode-impl(Object object0) {
        return object0 == null ? 0 : object0.hashCode();
    }

    public static final boolean isClosed-impl(Object object0) {
        return object0 == ConcurrentLinkedListKt.a;
    }

    @Override
    public String toString() {
        return "SegmentOrClosed(value=" + this.a + ')';
    }

    public static String toString-impl(Object object0) [...] // Inlined contents

    public final Object unbox-impl() {
        return this.a;
    }
}

