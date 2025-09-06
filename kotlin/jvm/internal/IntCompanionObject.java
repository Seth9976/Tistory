package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001A\u0010\u0006\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\u0006\u0010\u0004\u0012\u0004\b\u0007\u0010\bR\u001A\u0010\t\u001A\u00020\u00028\u0006X\u0087T¢\u0006\f\n\u0004\b\t\u0010\u0004\u0012\u0004\b\n\u0010\b¨\u0006\u000B"}, d2 = {"Lkotlin/jvm/internal/IntCompanionObject;", "", "", "MIN_VALUE", "I", "MAX_VALUE", "SIZE_BYTES", "getSIZE_BYTES$annotations", "()V", "SIZE_BITS", "getSIZE_BITS$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class IntCompanionObject {
    @NotNull
    public static final IntCompanionObject INSTANCE = null;
    public static final int MAX_VALUE = 0x7FFFFFFF;
    public static final int MIN_VALUE = 0x80000000;
    public static final int SIZE_BITS = 0x20;
    public static final int SIZE_BYTES = 4;

    static {
        IntCompanionObject.INSTANCE = new IntCompanionObject();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @SinceKotlin(version = "1.3")
    public static void getSIZE_BITS$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static void getSIZE_BYTES$annotations() {
    }
}

