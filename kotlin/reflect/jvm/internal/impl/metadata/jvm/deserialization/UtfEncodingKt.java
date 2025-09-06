package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@SourceDebugExtension({"SMAP\nutfEncoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,73:1\n37#2,2:74\n1#3:76\n*S KotlinDebug\n*F\n+ 1 utfEncoding.kt\norg/jetbrains/kotlin/metadata/jvm/deserialization/UtfEncodingKt\n*L\n55#1:74,2\n*E\n"})
public final class UtfEncodingKt {
    @NotNull
    public static final byte[] stringsToBytes(@NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(arr_s, "strings");
        int v1 = 0;
        for(int v = 0; v < arr_s.length; ++v) {
            v1 += arr_s[v].length();
        }
        byte[] arr_b = new byte[v1];
        for(int v2 = 0; v2 < arr_s.length; ++v2) {
            String s = arr_s[v2];
            int v4 = s.length();
            int v5 = 0;
            for(int v3 = 0; v5 < v4; ++v3) {
                arr_b[v3] = (byte)s.charAt(v5);
                ++v5;
            }
        }
        return arr_b;
    }
}

