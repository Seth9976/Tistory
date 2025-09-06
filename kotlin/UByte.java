package kotlin;

import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087@\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0018B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\t\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\r\u001A\u00020\nHÖ\u0001¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0013\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0016\u0010\u0017\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0019"}, d2 = {"Lkotlin/UByte;", "", "", "data", "constructor-impl", "(B)B", "", "toString-impl", "(B)Ljava/lang/String;", "toString", "", "hashCode-impl", "(B)I", "hashCode", "", "other", "", "equals-impl", "(BLjava/lang/Object;)Z", "equals", "a", "B", "getData$annotations", "()V", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SinceKotlin(version = "1.5")
@WasExperimental(markerClass = {ExperimentalUnsignedTypes.class})
@JvmInline
public final class UByte implements Comparable {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0017\u0010\u0005\u001A\u00020\u00028\u0006X\u0086Tø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0007\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001A\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b\u0082\u0002\u0004\n\u0002\b!¨\u0006\n"}, d2 = {"Lkotlin/UByte$Companion;", "", "Lkotlin/UByte;", "MAX_VALUE", "B", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @NotNull
    public static final Companion Companion = null;
    public static final byte MAX_VALUE = -1;
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;
    public final byte a;

    static {
        UByte.Companion = new Companion(null);
    }

    public UByte(byte b) {
        this.a = b;
    }

    public static final UByte box-impl(byte b) {
        return new UByte(b);
    }

    @Override
    public int compareTo(Object object0) {
        return Intrinsics.compare(this.unbox-impl() & 0xFF, ((UByte)object0).unbox-impl() & 0xFF);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public static byte constructor-impl(byte b) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return UByte.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(byte b, Object object0) {
        return object0 instanceof UByte ? b == ((UByte)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(byte b, byte b1) {
        return b == b1;
    }

    @PublishedApi
    public static void getData$annotations() {
    }

    @Override
    public int hashCode() {
        return UByte.hashCode-impl(this.a);
    }

    public static int hashCode-impl(byte b) {
        return Byte.hashCode(b);
    }

    @Override
    @NotNull
    public String toString() {
        return UByte.toString-impl(this.a);
    }

    @NotNull
    public static String toString-impl(byte b) {
        return String.valueOf(b & 0xFF);
    }

    public final byte unbox-impl() {
        return this.a;
    }
}

