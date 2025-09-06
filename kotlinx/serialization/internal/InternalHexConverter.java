package kotlinx.serialization.internal;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\n\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00042\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\u0015\u0010\u000E\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\f¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lkotlinx/serialization/internal/InternalHexConverter;", "", "", "s", "", "parseHexBinary", "(Ljava/lang/String;)[B", "data", "", "lowerCase", "printHexBinary", "([BZ)Ljava/lang/String;", "", "n", "toHexString", "(I)Ljava/lang/String;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPlatform.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Platform.common.kt\nkotlinx/serialization/internal/InternalHexConverter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
public final class InternalHexConverter {
    @NotNull
    public static final InternalHexConverter INSTANCE;

    static {
        InternalHexConverter.INSTANCE = new InternalHexConverter();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static int a(char c) {
        if(0x30 <= c && c < 58) {
            return c - 0x30;
        }
        if(65 <= c && c < 71) {
            return c - 55;
        }
        return 97 > c || c >= 103 ? -1 : c - 87;
    }

    @NotNull
    public final byte[] parseHexBinary(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "s");
        int v = s.length();
        if(v % 2 != 0) {
            throw new IllegalArgumentException("HexBinary string must be even length");
        }
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v; v1 += 2) {
            int v2 = InternalHexConverter.a(s.charAt(v1));
            int v3 = InternalHexConverter.a(s.charAt(v1 + 1));
            if(v2 == -1 || v3 == -1) {
                throw new IllegalArgumentException(("Invalid hex chars: " + s.charAt(v1) + s.charAt(v1 + 1)).toString());
            }
            arr_b[v1 / 2] = (byte)((v2 << 4) + v3);
        }
        return arr_b;
    }

    @NotNull
    public final String printHexBinary(@NotNull byte[] arr_b, boolean z) {
        Intrinsics.checkNotNullParameter(arr_b, "data");
        StringBuilder stringBuilder0 = new StringBuilder(arr_b.length * 2);
        for(int v = 0; v < arr_b.length; ++v) {
            int v1 = arr_b[v];
            stringBuilder0.append("0123456789ABCDEF".charAt(v1 >> 4 & 15));
            stringBuilder0.append("0123456789ABCDEF".charAt(v1 & 15));
        }
        if(z) {
            String s = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s, "toString(...)");
            String s1 = s.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(s1, "toLowerCase(...)");
            return s1;
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "toString(...)");
        return s2;
    }

    public static String printHexBinary$default(InternalHexConverter internalHexConverter0, byte[] arr_b, boolean z, int v, Object object0) {
        if((v & 2) != 0) {
            z = false;
        }
        return internalHexConverter0.printHexBinary(arr_b, z);
    }

    @NotNull
    public final String toHexString(int v) {
        byte[] arr_b = new byte[4];
        for(int v1 = 0; v1 < 4; ++v1) {
            arr_b[v1] = (byte)(v >> 24 - v1 * 8);
        }
        String s = StringsKt__StringsKt.trimStart(this.printHexBinary(arr_b, true), new char[]{'0'});
        if(s.length() <= 0) {
            s = null;
        }
        return s == null ? "0" : s;
    }
}

