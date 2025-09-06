package kotlin.io.encoding;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u000E\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A\u0017\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0001\u001A\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"", "symbol", "", "isInMimeAlphabet", "(I)Z", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,643:1\n13384#2,3:644\n13384#2,3:647\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n580#1:644,3\n597#1:647,3\n*E\n"})
public final class Base64Kt {
    public static final byte[] a;
    public static final int[] b;
    public static final byte[] c;
    public static final int[] d;

    static {
        byte[] arr_b = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 0x2F};
        Base64Kt.a = arr_b;
        int[] arr_v = new int[0x100];
        int v = 0;
        ArraysKt___ArraysJvmKt.fill$default(arr_v, -1, 0, 0, 6, null);
        arr_v[61] = -2;
        int v2 = 0;
        for(int v1 = 0; v2 < 0x40; ++v1) {
            arr_v[arr_b[v2]] = v1;
            ++v2;
        }
        Base64Kt.b = arr_v;
        byte[] arr_b1 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F};
        Base64Kt.c = arr_b1;
        int[] arr_v1 = new int[0x100];
        ArraysKt___ArraysJvmKt.fill$default(arr_v1, -1, 0, 0, 6, null);
        arr_v1[61] = -2;
        for(int v3 = 0; v < 0x40; ++v3) {
            arr_v1[arr_b1[v]] = v3;
            ++v;
        }
        Base64Kt.d = arr_v1;
    }

    public static final byte[] access$getBase64EncodeMap$p() [...] // 潜在的解密器

    public static final byte[] access$getBase64UrlEncodeMap$p() [...] // 潜在的解密器

    @SinceKotlin(version = "1.8")
    @ExperimentalEncodingApi
    public static final boolean isInMimeAlphabet(int v) {
        return v >= 0 && (v < Base64Kt.b.length && Base64Kt.b[v] != -1);
    }
}

