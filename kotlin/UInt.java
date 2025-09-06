package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0016B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0011\u001A\u00020\u000E2\b\u0010\r\u001A\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u0012\u0004\b\u0014\u0010\u0015\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0017"}, d2 = {"Lkotlin/UInt;", "", "", "data", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@JvmInline
public final class UInt implements Comparable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001A\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0014\u0010\b\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004\u0082\u0002\u0004\n\u0002\b!¨\u0006\t"}, d2 = {"Lkotlin/UInt$Companion;", "", "Lkotlin/UInt;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final int MAX_VALUE = -1;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BITS = 0x20;
    public static final int SIZE_BYTES = 4;
    public final int a;

    static {
        UInt.Companion = new Companion(null);
    }

    public UInt(int v) {
        this.a = v;
    }

    public static final UInt box-impl(int v) {
        return new UInt(v);
    }

    @Override
    public int compareTo(Object object0) {
        return UnsignedKt.uintCompare(this.unbox-impl(), ((UInt)object0).unbox-impl());
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return UInt.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof UInt ? v == ((UInt)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    @PublishedApi
    public static void getData$annotations() {
    }

    @Override
    public int hashCode() {
        return UInt.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    @NotNull
    public String toString() {
        return UInt.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(int v) {
        return String.valueOf(((long)v) & 0xFFFFFFFFL);
    }

    public final int unbox-impl() {
        return this.a;
    }
}

