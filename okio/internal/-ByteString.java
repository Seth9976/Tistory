package okio.internal;

import a5.b;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import okio.-Base64;
import okio.-SegmentedByteString;
import okio.Buffer;
import okio.ByteString;
import okio._JvmPlatformKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0019\n\u0002\b\b\u001A\u0014\u0010\u0002\u001A\u00020\u0001*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0002\u0010\u0003\u001A\u0014\u0010\u0004\u001A\u00020\u0001*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0004\u0010\u0003\u001A\u0014\u0010\u0005\u001A\u00020\u0001*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0005\u0010\u0003\u001A\u0014\u0010\u0006\u001A\u00020\u0001*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0006\u0010\u0003\u001A\u0014\u0010\u0007\u001A\u00020\u0000*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0007\u0010\b\u001A\u0014\u0010\t\u001A\u00020\u0000*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\t\u0010\b\u001A$\u0010\r\u001A\u00020\u0000*\u00020\u00002\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\f\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b\r\u0010\u000E\u001A\u001C\u0010\u0011\u001A\u00020\u0010*\u00020\u00002\u0006\u0010\u000F\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b\u0011\u0010\u0012\u001A\u0014\u0010\u0013\u001A\u00020\n*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0013\u0010\u0014\u001A\u0014\u0010\u0016\u001A\u00020\u0015*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0016\u0010\u0017\u001A\u0014\u0010\u0018\u001A\u00020\u0015*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\u0018\u0010\u0017\u001A4\u0010\u001E\u001A\u00020\u001D*\u00020\u00002\u0006\u0010\u0019\u001A\u00020\n2\u0006\u0010\u001A\u001A\u00020\u00002\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b\u001E\u0010\u001F\u001A4\u0010\u001E\u001A\u00020\u001D*\u00020\u00002\u0006\u0010\u0019\u001A\u00020\n2\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010\u001B\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b\u001E\u0010 \u001A4\u0010$\u001A\u00020#*\u00020\u00002\u0006\u0010\u0019\u001A\u00020\n2\u0006\u0010!\u001A\u00020\u00152\u0006\u0010\"\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b$\u0010%\u001A\u001C\u0010\'\u001A\u00020\u001D*\u00020\u00002\u0006\u0010&\u001A\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b\'\u0010(\u001A\u001C\u0010\'\u001A\u00020\u001D*\u00020\u00002\u0006\u0010&\u001A\u00020\u0015H\u0080\b\u00A2\u0006\u0004\b\'\u0010)\u001A\u001C\u0010+\u001A\u00020\u001D*\u00020\u00002\u0006\u0010*\u001A\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b+\u0010(\u001A\u001C\u0010+\u001A\u00020\u001D*\u00020\u00002\u0006\u0010*\u001A\u00020\u0015H\u0080\b\u00A2\u0006\u0004\b+\u0010)\u001A$\u0010-\u001A\u00020\n*\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010,\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b-\u0010.\u001A$\u0010/\u001A\u00020\n*\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u00002\u0006\u0010,\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b/\u00100\u001A$\u0010/\u001A\u00020\n*\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u00152\u0006\u0010,\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b/\u0010.\u001A\u001E\u00102\u001A\u00020\u001D*\u00020\u00002\b\u0010\u001A\u001A\u0004\u0018\u000101H\u0080\b\u00A2\u0006\u0004\b2\u00103\u001A\u0014\u00104\u001A\u00020\n*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b4\u0010\u0014\u001A\u001C\u00105\u001A\u00020\n*\u00020\u00002\u0006\u0010\u001A\u001A\u00020\u0000H\u0080\b\u00A2\u0006\u0004\b5\u00106\u001A\u0018\u00108\u001A\u00020\u00002\u0006\u00107\u001A\u00020\u0015H\u0080\b\u00A2\u0006\u0004\b8\u00109\u001A$\u0010:\u001A\u00020\u0000*\u00020\u00152\u0006\u0010\u0019\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\nH\u0080\b\u00A2\u0006\u0004\b:\u0010;\u001A\u0014\u0010<\u001A\u00020\u0000*\u00020\u0001H\u0080\b\u00A2\u0006\u0004\b<\u0010=\u001A\u0016\u0010>\u001A\u0004\u0018\u00010\u0000*\u00020\u0001H\u0080\b\u00A2\u0006\u0004\b>\u0010=\u001A\u0014\u0010?\u001A\u00020\u0000*\u00020\u0001H\u0080\b\u00A2\u0006\u0004\b?\u0010=\u001A+\u0010B\u001A\u00020#*\u00020\u00002\u0006\u0010A\u001A\u00020@2\u0006\u0010\u0019\u001A\u00020\n2\u0006\u0010\u001C\u001A\u00020\nH\u0000\u00A2\u0006\u0004\bB\u0010C\u001A\u0014\u0010D\u001A\u00020\u0001*\u00020\u0000H\u0080\b\u00A2\u0006\u0004\bD\u0010\u0003\" \u0010L\u001A\u00020E8\u0000X\u0081\u0004\u00A2\u0006\u0012\n\u0004\bF\u0010G\u0012\u0004\bJ\u0010K\u001A\u0004\bH\u0010I\u00A8\u0006M"}, d2 = {"Lokio/ByteString;", "", "commonUtf8", "(Lokio/ByteString;)Ljava/lang/String;", "commonBase64", "commonBase64Url", "commonHex", "commonToAsciiLowercase", "(Lokio/ByteString;)Lokio/ByteString;", "commonToAsciiUppercase", "", "beginIndex", "endIndex", "commonSubstring", "(Lokio/ByteString;II)Lokio/ByteString;", "pos", "", "commonGetByte", "(Lokio/ByteString;I)B", "commonGetSize", "(Lokio/ByteString;)I", "", "commonToByteArray", "(Lokio/ByteString;)[B", "commonInternalArray", "offset", "other", "otherOffset", "byteCount", "", "commonRangeEquals", "(Lokio/ByteString;ILokio/ByteString;II)Z", "(Lokio/ByteString;I[BII)Z", "target", "targetOffset", "", "commonCopyInto", "(Lokio/ByteString;I[BII)V", "prefix", "commonStartsWith", "(Lokio/ByteString;Lokio/ByteString;)Z", "(Lokio/ByteString;[B)Z", "suffix", "commonEndsWith", "fromIndex", "commonIndexOf", "(Lokio/ByteString;[BI)I", "commonLastIndexOf", "(Lokio/ByteString;Lokio/ByteString;I)I", "", "commonEquals", "(Lokio/ByteString;Ljava/lang/Object;)Z", "commonHashCode", "commonCompareTo", "(Lokio/ByteString;Lokio/ByteString;)I", "data", "commonOf", "([B)Lokio/ByteString;", "commonToByteString", "([BII)Lokio/ByteString;", "commonEncodeUtf8", "(Ljava/lang/String;)Lokio/ByteString;", "commonDecodeBase64", "commonDecodeHex", "Lokio/Buffer;", "buffer", "commonWrite", "(Lokio/ByteString;Lokio/Buffer;II)V", "commonToString", "", "a", "[C", "getHEX_DIGIT_CHARS", "()[C", "getHEX_DIGIT_CHARS$annotations", "()V", "HEX_DIGIT_CHARS", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "-ByteString")
@SourceDebugExtension({"SMAP\nByteString.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n+ 2 Util.kt\nokio/-SegmentedByteString\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Utf8.kt\nokio/Utf8\n*L\n1#1,363:1\n131#1,2:369\n133#1,9:372\n68#2:364\n74#2:365\n74#2:367\n74#2:368\n68#2:396\n74#2:408\n1#3:366\n1#3:371\n212#4,7:381\n122#4:388\n219#4,5:389\n122#4:394\n226#4:395\n228#4:397\n397#4,2:398\n122#4:400\n400#4,6:401\n127#4:407\n406#4:409\n122#4:410\n407#4,13:411\n122#4:424\n422#4:425\n122#4:426\n425#4:427\n230#4,3:428\n440#4,3:431\n122#4:434\n443#4:435\n127#4:436\n446#4,10:437\n127#4:447\n456#4:448\n122#4:449\n457#4,4:450\n127#4:454\n461#4:455\n122#4:456\n462#4,14:457\n122#4:471\n477#4,2:472\n122#4:474\n481#4:475\n122#4:476\n484#4:477\n234#4,3:478\n500#4,3:481\n122#4:484\n503#4:485\n127#4:486\n506#4,2:487\n127#4:489\n510#4,10:490\n127#4:500\n520#4:501\n122#4:502\n521#4,4:503\n127#4:507\n525#4:508\n122#4:509\n526#4,4:510\n127#4:514\n530#4:515\n122#4:516\n531#4,15:517\n122#4:532\n547#4,2:533\n122#4:535\n550#4,2:536\n122#4:538\n554#4:539\n122#4:540\n557#4:541\n241#4:542\n122#4:543\n242#4,5:544\n*S KotlinDebug\n*F\n+ 1 ByteString.kt\nokio/internal/-ByteString\n*L\n329#1:369,2\n329#1:372,9\n67#1:364\n68#1:365\n258#1:367\n259#1:368\n348#1:396\n348#1:408\n329#1:371\n348#1:381,7\n353#1:388\n348#1:389,5\n353#1:394\n348#1:395\n348#1:397\n348#1:398,2\n353#1:400\n348#1:401,6\n348#1:407\n348#1:409\n353#1:410\n348#1:411,13\n353#1:424\n348#1:425\n353#1:426\n348#1:427\n348#1:428,3\n348#1:431,3\n353#1:434\n348#1:435\n348#1:436\n348#1:437,10\n348#1:447\n348#1:448\n353#1:449\n348#1:450,4\n348#1:454\n348#1:455\n353#1:456\n348#1:457,14\n353#1:471\n348#1:472,2\n353#1:474\n348#1:475\n353#1:476\n348#1:477\n348#1:478,3\n348#1:481,3\n353#1:484\n348#1:485\n348#1:486\n348#1:487,2\n348#1:489\n348#1:490,10\n348#1:500\n348#1:501\n353#1:502\n348#1:503,4\n348#1:507\n348#1:508\n353#1:509\n348#1:510,4\n348#1:514\n348#1:515\n353#1:516\n348#1:517,15\n353#1:532\n348#1:533,2\n353#1:535\n348#1:536,2\n353#1:538\n348#1:539\n353#1:540\n348#1:541\n348#1:542\n353#1:543\n348#1:544,5\n*E\n"})
public final class -ByteString {
    public static final char[] a;

    static {
        -ByteString.a = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    }

    public static final int access$codePointIndexToCharIndex(byte[] arr_b, int v) {
        int v1 = 0;
        int v2 = 0;
        int v3 = 0;
    label_3:
        while(v1 < arr_b.length) {
            int v4 = arr_b[v1];
            if(v4 >= 0) {
                int v5 = v3 + 1;
                if(v3 == v) {
                    break;
                }
                if(v4 != 10 && v4 != 13 && (v4 >= 0 && v4 < 0x20 || 0x7F <= v4 && v4 < 0xA0) || v4 == 0xFFFD) {
                    return -1;
                }
                v2 += (v4 >= 0x10000 ? 2 : 1);
                ++v1;
                while(true) {
                    v3 = v5;
                    if(v1 >= arr_b.length) {
                        continue label_3;
                    }
                    int v6 = arr_b[v1];
                    if(v6 < 0) {
                        continue label_3;
                    }
                    ++v1;
                    v5 = v3 + 1;
                    if(v3 == v) {
                        break label_3;
                    }
                    if(v6 != 10 && v6 != 13 && (v6 >= 0 && v6 < 0x20 || 0x7F <= v6 && v6 < 0xA0) || v6 == 0xFFFD) {
                        return -1;
                    }
                    v2 += (v6 >= 0x10000 ? 2 : 1);
                }
            }
            if(v4 >> 5 == -2) {
                if(arr_b.length <= v1 + 1) {
                    return v3 == v ? v2 : -1;
                }
                int v7 = arr_b[v1 + 1];
                if((v7 & 0xC0) != 0x80) {
                    return v3 == v ? v2 : -1;
                }
                int v8 = v7 ^ 0xF80 ^ v4 << 6;
                if(v8 < 0x80) {
                    return v3 == v ? v2 : -1;
                }
                if(v3 != v) {
                    if(v8 != 10 && v8 != 13 && (v8 >= 0 && v8 < 0x20 || 0x7F <= v8 && v8 < 0xA0) || v8 == 0xFFFD) {
                        return -1;
                    }
                    v2 += (v8 >= 0x10000 ? 2 : 1);
                    v1 += 2;
                    ++v3;
                    continue;
                }
            }
            else if(v4 >> 4 == -2) {
                if(arr_b.length <= v1 + 2) {
                    return v3 == v ? v2 : -1;
                }
                int v9 = arr_b[v1 + 1];
                if((v9 & 0xC0) != 0x80) {
                    return v3 == v ? v2 : -1;
                }
                int v10 = arr_b[v1 + 2];
                if((v10 & 0xC0) != 0x80) {
                    return v3 == v ? v2 : -1;
                }
                int v11 = v9 << 6 ^ (0xFFFE1F80 ^ v10) ^ v4 << 12;
                if(v11 < 0x800) {
                    return v3 == v ? v2 : -1;
                }
                if(0xD800 <= v11 && v11 < 0xE000) {
                    return v3 == v ? v2 : -1;
                }
                if(v3 != v) {
                    if(v11 != 10 && v11 != 13 && (v11 >= 0 && v11 < 0x20 || 0x7F <= v11 && v11 < 0xA0) || v11 == 0xFFFD) {
                        return -1;
                    }
                    v2 += (v11 >= 0x10000 ? 2 : 1);
                    v1 += 3;
                    ++v3;
                    continue;
                }
            }
            else {
                if(v4 >> 3 != -2 || arr_b.length <= v1 + 3) {
                    return v3 == v ? v2 : -1;
                }
                int v12 = arr_b[v1 + 1];
                if((v12 & 0xC0) != 0x80) {
                    return v3 == v ? v2 : -1;
                }
                int v13 = arr_b[v1 + 2];
                if((v13 & 0xC0) != 0x80) {
                    return v3 == v ? v2 : -1;
                }
                int v14 = arr_b[v1 + 3];
                if((v14 & 0xC0) != 0x80) {
                    return v3 == v ? v2 : -1;
                }
                int v15 = v14 ^ 0x381F80 ^ v13 << 6 ^ v12 << 12 ^ v4 << 18;
                if(v15 > 0x10FFFF) {
                    return v3 == v ? v2 : -1;
                }
                if(0xD800 <= v15 && v15 < 0xE000) {
                    return v3 == v ? v2 : -1;
                }
                if(v15 < 0x10000) {
                    return v3 == v ? v2 : -1;
                }
                if(v3 != v) {
                    if((v15 == 10 || v15 == 13 || (v15 < 0 || v15 >= 0x20) && (0x7F > v15 || v15 >= 0xA0)) && v15 != 0xFFFD) {
                        v2 += 2;
                        v1 += 4;
                        ++v3;
                        continue;
                    }
                    return -1;
                }
            }
            break;
        }
        return v2;
    }

    public static final int access$decodeHexDigit(char c) {
        if(0x30 <= c && c < 58) {
            return c - 0x30;
        }
        if(97 <= c && c < 103) {
            return c - 87;
        }
        if(65 > c || c >= 71) {
            throw new IllegalArgumentException("Unexpected hex digit: " + c);
        }
        return c - 55;
    }

    @NotNull
    public static final String commonBase64(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return -Base64.encodeBase64$default(byteString0.getData$okio(), null, 1, null);
    }

    @NotNull
    public static final String commonBase64Url(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return -Base64.encodeBase64(byteString0.getData$okio(), new byte[]{65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 0x4F, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 0x6F, 0x70, 0x71, 0x72, 0x73, 0x74, 0x75, 0x76, 0x77, 120, 0x79, 0x7A, 0x30, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 0x5F});
    }

    public static final int commonCompareTo(@NotNull ByteString byteString0, @NotNull ByteString byteString1) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(byteString1, "other");
        int v = byteString0.size();
        int v1 = byteString1.size();
        int v2 = Math.min(v, v1);
        int v3 = 0;
        while(v3 < v2) {
            int v4 = byteString0.getByte(v3) & 0xFF;
            int v5 = byteString1.getByte(v3) & 0xFF;
            if(v4 == v5) {
                ++v3;
                continue;
            }
            return v4 < v5 ? -1 : 1;
        }
        if(v == v1) {
            return 0;
        }
        return v < v1 ? -1 : 1;
    }

    public static final void commonCopyInto(@NotNull ByteString byteString0, int v, @NotNull byte[] arr_b, int v1, int v2) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "target");
        ArraysKt___ArraysJvmKt.copyInto(byteString0.getData$okio(), arr_b, v1, v, v2 + v);
    }

    @Nullable
    public static final ByteString commonDecodeBase64(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        byte[] arr_b = -Base64.decodeBase64ToArray(s);
        return arr_b == null ? null : new ByteString(arr_b);
    }

    @NotNull
    public static final ByteString commonDecodeHex(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(s.length() % 2 != 0) {
            throw new IllegalArgumentException(("Unexpected hex string: " + s).toString());
        }
        int v = s.length();
        byte[] arr_b = new byte[v / 2];
        for(int v1 = 0; v1 < v / 2; ++v1) {
            int v2 = -ByteString.access$decodeHexDigit(s.charAt(v1 * 2));
            arr_b[v1] = (byte)(-ByteString.access$decodeHexDigit(s.charAt(v1 * 2 + 1)) + (v2 << 4));
        }
        return new ByteString(arr_b);
    }

    @NotNull
    public static final ByteString commonEncodeUtf8(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        ByteString byteString0 = new ByteString(_JvmPlatformKt.asUtf8ToByteArray(s));
        byteString0.setUtf8$okio(s);
        return byteString0;
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString0, @NotNull ByteString byteString1) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(byteString1, "suffix");
        return byteString0.rangeEquals(byteString0.size() - byteString1.size(), byteString1, 0, byteString1.size());
    }

    public static final boolean commonEndsWith(@NotNull ByteString byteString0, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "suffix");
        return byteString0.rangeEquals(byteString0.size() - arr_b.length, arr_b, 0, arr_b.length);
    }

    public static final boolean commonEquals(@NotNull ByteString byteString0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return object0 == byteString0 || object0 instanceof ByteString && ((ByteString)object0).size() == byteString0.getData$okio().length && ((ByteString)object0).rangeEquals(0, byteString0.getData$okio(), 0, byteString0.getData$okio().length);
    }

    public static final byte commonGetByte(@NotNull ByteString byteString0, int v) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return byteString0.getData$okio()[v];
    }

    public static final int commonGetSize(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return byteString0.getData$okio().length;
    }

    public static final int commonHashCode(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        int v = byteString0.getHashCode$okio();
        if(v != 0) {
            return v;
        }
        int v1 = Arrays.hashCode(byteString0.getData$okio());
        byteString0.setHashCode$okio(v1);
        return v1;
    }

    @NotNull
    public static final String commonHex(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        char[] arr_c = new char[byteString0.getData$okio().length * 2];
        byte[] arr_b = byteString0.getData$okio();
        int v1 = 0;
        for(int v = 0; v < arr_b.length; ++v) {
            int v2 = arr_b[v];
            int v3 = v1 + 1;
            arr_c[v1] = -ByteString.getHEX_DIGIT_CHARS()[v2 >> 4 & 15];
            v1 += 2;
            arr_c[v3] = -ByteString.getHEX_DIGIT_CHARS()[v2 & 15];
        }
        return p.concatToString(arr_c);
    }

    public static final int commonIndexOf(@NotNull ByteString byteString0, @NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "other");
        int v1 = byteString0.getData$okio().length - arr_b.length;
        int v2 = Math.max(v, 0);
        if(v2 <= v1) {
            while(true) {
                if(-SegmentedByteString.arrayRangeEquals(byteString0.getData$okio(), v2, arr_b, 0, arr_b.length)) {
                    return v2;
                }
                if(v2 == v1) {
                    break;
                }
                ++v2;
            }
        }
        return -1;
    }

    @NotNull
    public static final byte[] commonInternalArray(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        return byteString0.getData$okio();
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString0, @NotNull ByteString byteString1, int v) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(byteString1, "other");
        return byteString0.lastIndexOf(byteString1.internalArray$okio(), v);
    }

    public static final int commonLastIndexOf(@NotNull ByteString byteString0, @NotNull byte[] arr_b, int v) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "other");
        for(int v1 = Math.min(-SegmentedByteString.resolveDefaultParameter(byteString0, v), byteString0.getData$okio().length - arr_b.length); -1 < v1; --v1) {
            if(-SegmentedByteString.arrayRangeEquals(byteString0.getData$okio(), v1, arr_b, 0, arr_b.length)) {
                return v1;
            }
        }
        return -1;
    }

    @NotNull
    public static final ByteString commonOf(@NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(arr_b, "data");
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        return new ByteString(arr_b1);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString0, int v, @NotNull ByteString byteString1, int v1, int v2) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(byteString1, "other");
        return byteString1.rangeEquals(v1, byteString0.getData$okio(), v, v2);
    }

    public static final boolean commonRangeEquals(@NotNull ByteString byteString0, int v, @NotNull byte[] arr_b, int v1, int v2) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "other");
        return v >= 0 && v <= byteString0.getData$okio().length - v2 && v1 >= 0 && v1 <= arr_b.length - v2 && -SegmentedByteString.arrayRangeEquals(byteString0.getData$okio(), v, arr_b, v1, v2);
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString0, @NotNull ByteString byteString1) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(byteString1, "prefix");
        return byteString0.rangeEquals(0, byteString1, 0, byteString1.size());
    }

    public static final boolean commonStartsWith(@NotNull ByteString byteString0, @NotNull byte[] arr_b) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(arr_b, "prefix");
        return byteString0.rangeEquals(0, arr_b, 0, arr_b.length);
    }

    @NotNull
    public static final ByteString commonSubstring(@NotNull ByteString byteString0, int v, int v1) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        int v2 = -SegmentedByteString.resolveDefaultParameter(byteString0, v1);
        if(v < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        if(v2 > byteString0.getData$okio().length) {
            throw new IllegalArgumentException(b.p(new StringBuilder("endIndex > length("), byteString0.getData$okio().length, ')').toString());
        }
        if(v2 - v < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        return v != 0 || v2 != byteString0.getData$okio().length ? new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(byteString0.getData$okio(), v, v2)) : byteString0;
    }

    @NotNull
    public static final ByteString commonToAsciiLowercase(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        for(int v = 0; v < byteString0.getData$okio().length; ++v) {
            int v1 = byteString0.getData$okio()[v];
            if(v1 >= 65 && v1 <= 90) {
                byte[] arr_b = byteString0.getData$okio();
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
                int v2 = v + 1;
                arr_b1[v] = (byte)(v1 + 0x20);
                while(v2 < arr_b1.length) {
                    int v3 = arr_b1[v2];
                    if(v3 >= 65 && v3 <= 90) {
                        arr_b1[v2] = (byte)(v3 + 0x20);
                    }
                    ++v2;
                }
                return new ByteString(arr_b1);
            }
        }
        return byteString0;
    }

    @NotNull
    public static final ByteString commonToAsciiUppercase(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        for(int v = 0; v < byteString0.getData$okio().length; ++v) {
            int v1 = byteString0.getData$okio()[v];
            if(v1 >= 97 && v1 <= 0x7A) {
                byte[] arr_b = byteString0.getData$okio();
                byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
                Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
                int v2 = v + 1;
                arr_b1[v] = (byte)(v1 - 0x20);
                while(v2 < arr_b1.length) {
                    int v3 = arr_b1[v2];
                    if(v3 >= 97 && v3 <= 0x7A) {
                        arr_b1[v2] = (byte)(v3 - 0x20);
                    }
                    ++v2;
                }
                return new ByteString(arr_b1);
            }
        }
        return byteString0;
    }

    @NotNull
    public static final byte[] commonToByteArray(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        byte[] arr_b = byteString0.getData$okio();
        byte[] arr_b1 = Arrays.copyOf(arr_b, arr_b.length);
        Intrinsics.checkNotNullExpressionValue(arr_b1, "copyOf(...)");
        return arr_b1;
    }

    @NotNull
    public static final ByteString commonToByteString(@NotNull byte[] arr_b, int v, int v1) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        int v2 = -SegmentedByteString.resolveDefaultParameter(arr_b, v1);
        -SegmentedByteString.checkOffsetAndCount(arr_b.length, v, v2);
        return new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(arr_b, v, v2 + v));
    }

    @NotNull
    public static final String commonToString(@NotNull ByteString byteString0) {
        ByteString byteString1 = byteString0;
        Intrinsics.checkNotNullParameter(byteString1, "<this>");
        if(byteString0.getData$okio().length == 0) {
            return "[size=0]";
        }
        int v = -ByteString.access$codePointIndexToCharIndex(byteString0.getData$okio(), 0x40);
        if(v == -1) {
            if(byteString0.getData$okio().length <= 0x40) {
                return "[hex=" + byteString0.hex() + ']';
            }
            StringBuilder stringBuilder0 = new StringBuilder("[size=");
            stringBuilder0.append(byteString0.getData$okio().length);
            stringBuilder0.append(" hex=");
            int v1 = -SegmentedByteString.resolveDefaultParameter(byteString1, 0x40);
            if(v1 > byteString0.getData$okio().length) {
                throw new IllegalArgumentException(b.p(new StringBuilder("endIndex > length("), byteString0.getData$okio().length, ')').toString());
            }
            if(v1 < 0) {
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            if(v1 != byteString0.getData$okio().length) {
                byteString1 = new ByteString(ArraysKt___ArraysJvmKt.copyOfRange(byteString0.getData$okio(), 0, v1));
            }
            stringBuilder0.append(byteString1.hex());
            stringBuilder0.append("…]");
            return stringBuilder0.toString();
        }
        String s = byteString0.utf8();
        String s1 = s.substring(0, v);
        Intrinsics.checkNotNullExpressionValue(s1, "substring(...)");
        String s2 = p.replace$default(p.replace$default(p.replace$default(s1, "\\", "\\\\", false, 4, null), "\n", "\\n", false, 4, null), "\r", "\\r", false, 4, null);
        return v >= s.length() ? "[text=" + s2 + ']' : "[size=" + byteString0.getData$okio().length + " text=" + s2 + "…]";
    }

    @NotNull
    public static final String commonUtf8(@NotNull ByteString byteString0) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        String s = byteString0.getUtf8$okio();
        if(s == null) {
            s = _JvmPlatformKt.toUtf8String(byteString0.internalArray$okio());
            byteString0.setUtf8$okio(s);
        }
        return s;
    }

    public static final void commonWrite(@NotNull ByteString byteString0, @NotNull Buffer buffer0, int v, int v1) {
        Intrinsics.checkNotNullParameter(byteString0, "<this>");
        Intrinsics.checkNotNullParameter(buffer0, "buffer");
        buffer0.write(byteString0.getData$okio(), v, v1);
    }

    @NotNull
    public static final char[] getHEX_DIGIT_CHARS() {
        return -ByteString.a;
    }

    public static void getHEX_DIGIT_CHARS$annotations() {
    }
}

