package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0006\u001A\u001F\u0010\u0005\u001A\u00020\u0004*\u00060\u0000j\u0002`\u00012\u0006\u0010\u0003\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001A\u0015\u0010\b\u001A\u0004\u0018\u00010\u0007*\u00020\u0002H\u0000¢\u0006\u0004\b\b\u0010\t\"\"\u0010\u000F\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E\"\u001A\u0010\u0015\u001A\u00020\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "value", "", "printQuoted", "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "", "toBooleanStrictOrNull", "(Ljava/lang/String;)Ljava/lang/Boolean;", "", "a", "[Ljava/lang/String;", "getESCAPE_STRINGS", "()[Ljava/lang/String;", "ESCAPE_STRINGS", "", "b", "[B", "getESCAPE_MARKERS", "()[B", "ESCAPE_MARKERS", "kotlinx-serialization-json"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
public final class StringOpsKt {
    public static final String[] a;
    public static final byte[] b;

    static {
        String[] arr_s = new String[93];
        for(int v1 = 0; v1 < 0x20; ++v1) {
            arr_s[v1] = "\\u" + StringOpsKt.a(v1 >> 12) + StringOpsKt.a(v1 >> 8) + StringOpsKt.a(v1 >> 4) + StringOpsKt.a(v1);
        }
        arr_s[34] = "\\\"";
        arr_s[92] = "\\\\";
        arr_s[9] = "\\t";
        arr_s[8] = "\\b";
        arr_s[10] = "\\n";
        arr_s[13] = "\\r";
        arr_s[12] = "\\f";
        StringOpsKt.a = arr_s;
        byte[] arr_b = new byte[93];
        for(int v = 0; v < 0x20; ++v) {
            arr_b[v] = 1;
        }
        arr_b[34] = 34;
        arr_b[92] = 92;
        arr_b[9] = 0x74;
        arr_b[8] = 98;
        arr_b[10] = 110;
        arr_b[13] = 0x72;
        arr_b[12] = 102;
        StringOpsKt.b = arr_b;
    }

    public static final char a(int v) {
        return (v & 15) >= 10 ? ((char)((v & 15) + 87)) : ((char)((v & 15) + 0x30));
    }

    @NotNull
    public static final byte[] getESCAPE_MARKERS() [...] // 潜在的解密器

    @NotNull
    public static final String[] getESCAPE_STRINGS() {
        return StringOpsKt.a;
    }

    public static final void printQuoted(@NotNull StringBuilder stringBuilder0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(stringBuilder0, "<this>");
        Intrinsics.checkNotNullParameter(s, "value");
        stringBuilder0.append('\"');
        int v = s.length();
        int v2 = 0;
        for(int v1 = 0; v1 < v; ++v1) {
            int v3 = s.charAt(v1);
            String[] arr_s = StringOpsKt.a;
            if(v3 < arr_s.length && arr_s[v3] != null) {
                stringBuilder0.append(s, v2, v1);
                stringBuilder0.append(arr_s[v3]);
                v2 = v1 + 1;
            }
        }
        if(v2 == 0) {
            stringBuilder0.append(s);
        }
        else {
            stringBuilder0.append(s, v2, s.length());
        }
        stringBuilder0.append('\"');
    }

    @Nullable
    public static final Boolean toBooleanStrictOrNull(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(p.equals(s, "true", true)) {
            return true;
        }
        return p.equals(s, "false", true) ? false : null;
    }
}

