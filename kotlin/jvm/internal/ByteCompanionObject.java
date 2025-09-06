package kotlin.jvm.internal;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001A\u0010\u0007\u001A\u00020\u00068\u0006X\u0087T¢\u0006\f\n\u0004\b\u0007\u0010\b\u0012\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\u00068\u0006X\u0087T¢\u0006\f\n\u0004\b\u000B\u0010\b\u0012\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lkotlin/jvm/internal/ByteCompanionObject;", "", "", "MIN_VALUE", "B", "MAX_VALUE", "", "SIZE_BYTES", "I", "getSIZE_BYTES$annotations", "()V", "SIZE_BITS", "getSIZE_BITS$annotations", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ByteCompanionObject {
    @NotNull
    public static final ByteCompanionObject INSTANCE = null;
    public static final byte MAX_VALUE = 0x7F;
    public static final byte MIN_VALUE = (byte)0x80;
    public static final int SIZE_BITS = 8;
    public static final int SIZE_BYTES = 1;

    static {
        ByteCompanionObject.INSTANCE = new ByteCompanionObject();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @SinceKotlin(version = "1.3")
    public static void getSIZE_BITS$annotations() {
    }

    @SinceKotlin(version = "1.3")
    public static void getSIZE_BYTES$annotations() {
    }
}

