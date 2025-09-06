package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001A\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001A\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0004J\r\u0010\b\u001A\u00020\u0002¢\u0006\u0004\b\b\u0010\u0004R\u001A\u0010\t\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000B\u0010\fR\u001A\u0010\r\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\r\u0010\n\u0012\u0004\b\u000E\u0010\fR\u001A\u0010\u000F\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u000F\u0010\n\u0012\u0004\b\u0010\u0010\fR\u001A\u0010\u0011\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0011\u0010\n\u0012\u0004\b\u0012\u0010\fR\u001A\u0010\u0013\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0013\u0010\n\u0012\u0004\b\u0014\u0010\fR\u001A\u0010\u0016\u001A\u00020\u00158\u0006X\u0087T¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u0018\u0010\fR\u001A\u0010\u0019\u001A\u00020\u00158\u0006X\u0087T¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u0012\u0004\b\u001A\u0010\f¨\u0006\u001B"}, d2 = {"Lkotlin/jvm/internal/FloatCompanionObject;", "", "", "getMIN_VALUE", "()F", "getMAX_VALUE", "getPOSITIVE_INFINITY", "getNEGATIVE_INFINITY", "getNaN", "MIN_VALUE", "F", "getMIN_VALUE$annotations", "()V", "MAX_VALUE", "getMAX_VALUE$annotations", "POSITIVE_INFINITY", "getPOSITIVE_INFINITY$annotations", "NEGATIVE_INFINITY", "getNEGATIVE_INFINITY$annotations", "NaN", "getNaN$annotations", "", "SIZE_BYTES", "I", "getSIZE_BYTES$annotations", "SIZE_BITS", "getSIZE_BITS$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FloatCompanionObject {
    @NotNull
    public static final FloatCompanionObject INSTANCE = null;
    public static final float MAX_VALUE = 3.402823E+38f;
    public static final float MIN_VALUE = 1.401298E-45f;
    public static final float NEGATIVE_INFINITY = -Infinityf;
    public static final float NaN = NaNf;
    public static final float POSITIVE_INFINITY = Infinityf;
    public static final int SIZE_BITS = 0x20;
    public static final int SIZE_BYTES = 4;

    static {
        FloatCompanionObject.INSTANCE = new FloatCompanionObject();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public final float getMAX_VALUE() {
        return 3.402823E+38f;
    }

    @SinceKotlin(version = "1.4")
    public static void getMAX_VALUE$annotations() {
    }

    public final float getMIN_VALUE() {
        return 1.401298E-45f;
    }

    @SinceKotlin(version = "1.4")
    public static void getMIN_VALUE$annotations() {
    }

    public final float getNEGATIVE_INFINITY() {
        return -Infinityf;
    }

    @SinceKotlin(version = "1.4")
    public static void getNEGATIVE_INFINITY$annotations() {
    }

    public final float getNaN() {
        return NaNf;
    }

    @SinceKotlin(version = "1.4")
    public static void getNaN$annotations() {
    }

    public final float getPOSITIVE_INFINITY() {
        return Infinityf;
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

