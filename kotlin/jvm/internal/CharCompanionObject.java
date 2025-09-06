package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001R\u001A\u0010\u0003\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0005\u0010\u0006R\u001A\u0010\u0007\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u0012\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000B\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000B\u0010\u0004R\u0014\u0010\f\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000E\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000E\u0010\u0004R\u001A\u0010\u0010\u001A\u00020\u000F8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u0012\u0004\b\u0012\u0010\u0006R\u001A\u0010\u0013\u001A\u00020\u000F8\u0006X\u0087T¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u0012\u0004\b\u0014\u0010\u0006¨\u0006\u0015"}, d2 = {"Lkotlin/jvm/internal/CharCompanionObject;", "", "", "MIN_VALUE", "C", "getMIN_VALUE$annotations", "()V", "MAX_VALUE", "getMAX_VALUE$annotations", "MIN_HIGH_SURROGATE", "MAX_HIGH_SURROGATE", "MIN_LOW_SURROGATE", "MAX_LOW_SURROGATE", "MIN_SURROGATE", "MAX_SURROGATE", "", "SIZE_BYTES", "I", "getSIZE_BYTES$annotations", "SIZE_BITS", "getSIZE_BITS$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class CharCompanionObject {
    @NotNull
    public static final CharCompanionObject INSTANCE = null;
    public static final char MAX_HIGH_SURROGATE = '\uDBFF';
    public static final char MAX_LOW_SURROGATE = '\uDFFF';
    public static final char MAX_SURROGATE = '\uDFFF';
    public static final char MAX_VALUE = '\uFFFF';
    public static final char MIN_HIGH_SURROGATE = '\uD800';
    public static final char MIN_LOW_SURROGATE = '\uDC00';
    public static final char MIN_SURROGATE = '\uD800';
    public static final char MIN_VALUE = '\u0000';
    public static final int SIZE_BITS = 16;
    public static final int SIZE_BYTES = 2;

    static {
        CharCompanionObject.INSTANCE = new CharCompanionObject();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @SinceKotlin(version = "1.3")
    public static void getMAX_VALUE$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static void getMIN_VALUE$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static void getSIZE_BITS$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static void getSIZE_BYTES$annotations() {
    }
}

