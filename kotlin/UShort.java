package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0013\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0019"}, d2 = {"Lkotlin/UShort;", "", "", "data", "constructor-impl", "(S)S", "", "toString-impl", "(S)Ljava/lang/String;", "toString", "", "hashCode-impl", "(S)I", "hashCode", "", "other", "", "equals-impl", "(SLjava/lang/Object;)Z", "equals", "a", "S", "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@JvmInline
public final class UShort implements Comparable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001A\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UShort$Companion;", "", "Lkotlin/UShort;", "MAX_VALUE", "S", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final short MAX_VALUE = -1;
    public static final short MIN_VALUE = 0;
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;
    public final short a;

    static {
        UShort.Companion = new Companion(null);
    }

    public UShort(short v) {
        this.a = v;
    }

    public static final UShort box-impl(short v) {
        return new UShort(v);
    }

    @Override
    public int compareTo(Object object0) {
        return Intrinsics.compare(this.unbox-impl() & 0xFFFF, ((UShort)object0).unbox-impl() & 0xFFFF);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public static short constructor-impl(short v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return UShort.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(short v, Object object0) {
        return object0 instanceof UShort ? v == ((UShort)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(short v, short v1) {
        return v == v1;
    }

    @PublishedApi
    public static void getData$annotations() {
    }

    @Override
    public int hashCode() {
        return UShort.hashCode-impl(this.a);
    }

    public static int hashCode-impl(short v) {
        return Short.hashCode(v);
    }

    @Override
    @NotNull
    public String toString() {
        return UShort.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(short v) {
        return String.valueOf(v & 0xFFFF);
    }

    public final short unbox-impl() {
        return this.a;
    }
}

