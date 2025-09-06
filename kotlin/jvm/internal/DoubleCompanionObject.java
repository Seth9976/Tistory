package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004R\u001A\u0010\t\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\n\u0012\u0004\b\u000E\u0010\fR\u001A\u0010\u000F\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000F\u0010\n\u0012\u0004\b\u0010\u0010\fR\u001A\u0010\u0011\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0012\u0010\fR\u001A\u0010\u0013\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0013\u0010\n\u0012\u0004\b\u0014\u0010\fR\u001A\u0010\u0016\u001A\u00020\u00158\u0006X\u0087T¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\fR\u001A\u0010\u0019\u001A\u00020\u00158\u0006X\u0087T¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u0012\u0004\b\u001A\u0010\f¨\u0006\u001B"}, d2 = {"Lkotlin/jvm/internal/DoubleCompanionObject;", "", "", "getMIN_VALUE", "()D", "getMAX_VALUE", "getPOSITIVE_INFINITY", "getNEGATIVE_INFINITY", "getNaN", "MIN_VALUE", "D", "getMIN_VALUE$annotations", "()V", "MAX_VALUE", "getMAX_VALUE$annotations", "POSITIVE_INFINITY", "getPOSITIVE_INFINITY$annotations", "NEGATIVE_INFINITY", "getNEGATIVE_INFINITY$annotations", "NaN", "getNaN$annotations", "", "SIZE_BYTES", "I", "getSIZE_BYTES$annotations", "SIZE_BITS", "getSIZE_BITS$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class DoubleCompanionObject {
    @NotNull
    public static final DoubleCompanionObject INSTANCE = null;
    public static final double MAX_VALUE = 1.797693E+308;
    public static final double MIN_VALUE = 4.900000E-324;
    public static final double NEGATIVE_INFINITY = -Infinity;
    public static final double NaN = NaN;
    public static final double POSITIVE_INFINITY = Infinity;
    public static final int SIZE_BITS = 0x40;
    public static final int SIZE_BYTES = 8;

    static {
        DoubleCompanionObject.INSTANCE = new DoubleCompanionObject();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final double getMAX_VALUE() {
        return 1.797693E+308;
    }

    @SinceKotlin(version = "1.4")
    public static void getMAX_VALUE$annotations() {
    }

    public final double getMIN_VALUE() {
        return 4.900000E-324;
    }

    @SinceKotlin(version = "1.4")
    public static void getMIN_VALUE$annotations() {
    }

    public final double getNEGATIVE_INFINITY() {
        return -Infinity;
    }

    @SinceKotlin(version = "1.4")
    public static void getNEGATIVE_INFINITY$annotations() {
    }

    public final double getNaN() {
        return NaN;
    }

    @SinceKotlin(version = "1.4")
    public static void getNaN$annotations() {
    }

    public final double getPOSITIVE_INFINITY() {
        return Infinity;
    }

    @SinceKotlin(version = "1.4")
    public static void getPOSITIVE_INFINITY$annotations() {
    }

    @SinceKotlin(version = "1.4")
    public static void getSIZE_BITS$annotations() {
    }

    @SinceKotlin(version = "1.4")
    public static void getSIZE_BYTES$annotations() {
    }
}

