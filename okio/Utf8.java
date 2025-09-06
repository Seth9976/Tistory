package okio;

import a5.b;
import kotlin.Metadata;
import kotlin.jvm.JvmName;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u001A\u0011\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\u0001H\u0080\b\u001A\u0011\u0010\u000E\u001A\u00020\f2\u0006\u0010\u000F\u001A\u00020\u0007H\u0080\b\u001A4\u0010\u0010\u001A\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\b\u00F8\u0001\u0000\u001A4\u0010\u0017\u001A\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\b\u00F8\u0001\u0000\u001A4\u0010\u0018\u001A\u00020\u0001*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\b\u00F8\u0001\u0000\u001A4\u0010\u0019\u001A\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\b\u00F8\u0001\u0000\u001A4\u0010\u001A\u001A\u00020\u0016*\u00020\u001B2\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\b\u00F8\u0001\u0000\u001A4\u0010\u001C\u001A\u00020\u0016*\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00012\u0006\u0010\u0013\u001A\u00020\u00012\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00160\u0015H\u0080\b\u00F8\u0001\u0000\u001A%\u0010\u001D\u001A\u00020\u001E*\u00020\u001B2\b\b\u0002\u0010\u0012\u001A\u00020\u00012\b\b\u0002\u0010\u0013\u001A\u00020\u0001H\u0007\u00A2\u0006\u0002\b\u001F\"\u000E\u0010\u0000\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0002\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0003\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0004\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0005\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\u0006\u001A\u00020\u0007X\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\b\u001A\u00020\tX\u0080T\u00A2\u0006\u0002\n\u0000\"\u000E\u0010\n\u001A\u00020\u0001X\u0080T\u00A2\u0006\u0002\n\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00A8\u0006 "}, d2 = {"HIGH_SURROGATE_HEADER", "", "LOG_SURROGATE_HEADER", "MASK_2BYTES", "MASK_3BYTES", "MASK_4BYTES", "REPLACEMENT_BYTE", "", "REPLACEMENT_CHARACTER", "", "REPLACEMENT_CODE_POINT", "isIsoControl", "", "codePoint", "isUtf8Continuation", "byte", "process2Utf8Bytes", "", "beginIndex", "endIndex", "yield", "Lkotlin/Function1;", "", "process3Utf8Bytes", "process4Utf8Bytes", "processUtf16Chars", "processUtf8Bytes", "", "processUtf8CodePoints", "utf8Size", "", "size", "okio"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@JvmName(name = "Utf8")
@SourceDebugExtension({"SMAP\nUtf8.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Utf8.kt\nokio/Utf8\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Util.kt\nokio/-SegmentedByteString\n*L\n1#1,559:1\n397#1,9:563\n127#1:572\n406#1,20:574\n440#1,4:595\n127#1:599\n446#1,10:601\n127#1:611\n456#1,5:612\n127#1:617\n461#1,24:618\n500#1,4:643\n127#1:647\n506#1,2:649\n127#1:651\n510#1,10:652\n127#1:662\n520#1,5:663\n127#1:668\n525#1,5:669\n127#1:674\n530#1,28:675\n397#1,9:704\n127#1:713\n406#1,20:715\n440#1,4:736\n127#1:740\n446#1,10:742\n127#1:752\n456#1,5:753\n127#1:758\n461#1,24:759\n500#1,4:784\n127#1:788\n506#1,2:790\n127#1:792\n510#1,10:793\n127#1:803\n520#1,5:804\n127#1:809\n525#1,5:810\n127#1:815\n530#1,28:816\n127#1:844\n127#1:846\n127#1:848\n127#1:850\n127#1:852\n127#1:854\n127#1:856\n127#1:858\n127#1:860\n1#2:560\n74#3:561\n68#3:562\n74#3:573\n68#3:594\n74#3:600\n68#3:642\n74#3:648\n68#3:703\n74#3:714\n68#3:735\n74#3:741\n68#3:783\n74#3:789\n74#3:845\n74#3:847\n74#3:849\n74#3:851\n74#3:853\n74#3:855\n74#3:857\n74#3:859\n74#3:861\n*S KotlinDebug\n*F\n+ 1 Utf8.kt\nokio/Utf8\n*L\n228#1:563,9\n228#1:572\n228#1:574,20\n232#1:595,4\n232#1:599\n232#1:601,10\n232#1:611\n232#1:612,5\n232#1:617\n232#1:618,24\n236#1:643,4\n236#1:647\n236#1:649,2\n236#1:651\n236#1:652,10\n236#1:662\n236#1:663,5\n236#1:668\n236#1:669,5\n236#1:674\n236#1:675,28\n277#1:704,9\n277#1:713\n277#1:715,20\n281#1:736,4\n281#1:740\n281#1:742,10\n281#1:752\n281#1:753,5\n281#1:758\n281#1:759,24\n285#1:784,4\n285#1:788\n285#1:790,2\n285#1:792\n285#1:793,10\n285#1:803\n285#1:804,5\n285#1:809\n285#1:810,5\n285#1:815\n285#1:816,28\n405#1:844\n443#1:846\n455#1:848\n460#1:850\n503#1:852\n507#1:854\n519#1:856\n524#1:858\n529#1:860\n127#1:561\n226#1:562\n228#1:573\n230#1:594\n232#1:600\n234#1:642\n236#1:648\n275#1:703\n277#1:714\n279#1:735\n281#1:741\n283#1:783\n285#1:789\n405#1:845\n443#1:847\n455#1:849\n460#1:851\n503#1:853\n507#1:855\n519#1:857\n524#1:859\n529#1:861\n*E\n"})
public final class Utf8 {
    public static final int HIGH_SURROGATE_HEADER = 0xD7C0;
    public static final int LOG_SURROGATE_HEADER = 0xDC00;
    public static final int MASK_2BYTES = 0xF80;
    public static final int MASK_3BYTES = 0xFFFE1F80;
    public static final int MASK_4BYTES = 0x381F80;
    public static final byte REPLACEMENT_BYTE = 0x3F;
    public static final char REPLACEMENT_CHARACTER = '\uFFFD';
    public static final int REPLACEMENT_CODE_POINT = 0xFFFD;

    // 去混淆评级： 低(20)
    public static final boolean isIsoControl(int v) {
        return v >= 0 && v < 0x20 || 0x7F <= v && v < 0xA0;
    }

    public static final boolean isUtf8Continuation(byte b) {
        return (b & 0xC0) == 0x80;
    }

    public static final int process2Utf8Bytes(@NotNull byte[] arr_b, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "yield");
        if(v1 <= v + 1) {
            function10.invoke(0xFFFD);
            return 1;
        }
        int v2 = arr_b[v];
        int v3 = arr_b[v + 1];
        if((v3 & 0xC0) == 0x80) {
            int v4 = v3 ^ 0xF80 ^ v2 << 6;
            if(v4 < 0x80) {
                function10.invoke(0xFFFD);
                return 2;
            }
            function10.invoke(v4);
            return 2;
        }
        function10.invoke(0xFFFD);
        return 1;
    }

    public static final int process3Utf8Bytes(@NotNull byte[] arr_b, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "yield");
        if(v1 <= v + 2) {
            function10.invoke(0xFFFD);
            return v1 <= v + 1 || (arr_b[v + 1] & 0xC0) != 0x80 ? 1 : 2;
        }
        int v2 = arr_b[v];
        int v3 = arr_b[v + 1];
        if((v3 & 0xC0) == 0x80) {
            int v4 = arr_b[v + 2];
            if((v4 & 0xC0) == 0x80) {
                int v5 = v4 ^ 0xFFFE1F80 ^ v3 << 6 ^ v2 << 12;
                if(v5 < 0x800) {
                    function10.invoke(0xFFFD);
                    return 3;
                }
                if(0xD800 <= v5 && v5 < 0xE000) {
                    function10.invoke(0xFFFD);
                    return 3;
                }
                function10.invoke(v5);
                return 3;
            }
            function10.invoke(0xFFFD);
            return 2;
        }
        function10.invoke(0xFFFD);
        return 1;
    }

    public static final int process4Utf8Bytes(@NotNull byte[] arr_b, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "yield");
        if(v1 <= v + 3) {
            function10.invoke(0xFFFD);
            if(v1 > v + 1 && (arr_b[v + 1] & 0xC0) == 0x80) {
                return v1 <= v + 2 || (arr_b[v + 2] & 0xC0) != 0x80 ? 2 : 3;
            }
            return 1;
        }
        int v2 = arr_b[v];
        int v3 = arr_b[v + 1];
        if((v3 & 0xC0) == 0x80) {
            int v4 = arr_b[v + 2];
            if((v4 & 0xC0) == 0x80) {
                int v5 = arr_b[v + 3];
                if((v5 & 0xC0) == 0x80) {
                    int v6 = v5 ^ 0x381F80 ^ v4 << 6 ^ v3 << 12 ^ v2 << 18;
                    if(v6 > 0x10FFFF) {
                        function10.invoke(0xFFFD);
                        return 4;
                    }
                    if(0xD800 <= v6 && v6 < 0xE000) {
                        function10.invoke(0xFFFD);
                        return 4;
                    }
                    if(v6 < 0x10000) {
                        function10.invoke(0xFFFD);
                        return 4;
                    }
                    function10.invoke(v6);
                    return 4;
                }
                function10.invoke(0xFFFD);
                return 3;
            }
            function10.invoke(0xFFFD);
            return 2;
        }
        function10.invoke(0xFFFD);
        return 1;
    }

    public static final void processUtf16Chars(@NotNull byte[] arr_b, int v, int v1, @NotNull Function1 function10) {
        int v11;
        int v7;
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "yield");
        int v2 = v;
        while(v2 < v1) {
            int v3 = arr_b[v2];
            if(v3 >= 0) {
                function10.invoke(Character.valueOf(((char)v3)));
                ++v2;
                while(v2 < v1) {
                    int v4 = arr_b[v2];
                    if(v4 < 0) {
                        break;
                    }
                    ++v2;
                    function10.invoke(Character.valueOf(((char)v4)));
                }
            }
            else {
                if(v3 >> 5 == -2) {
                    if(v1 > v2 + 1) {
                        int v5 = arr_b[v2 + 1];
                        if((v5 & 0xC0) == 0x80) {
                            int v6 = v3 << 6 ^ (v5 ^ 0xF80);
                            function10.invoke(Character.valueOf((v6 >= 0x80 ? ((char)v6) : '\uFFFD')));
                            v7 = 2;
                            goto label_44;
                        }
                    }
                    function10.invoke(Character.valueOf('\uFFFD'));
                }
                else if(v3 >> 4 != -2) {
                    goto label_46;
                }
                else if(v1 <= v2 + 2) {
                    function10.invoke(Character.valueOf('\uFFFD'));
                    if(v1 > v2 + 1 && (arr_b[v2 + 1] & 0xC0) == 0x80) {
                        v7 = 2;
                        goto label_44;
                    }
                }
                else {
                    int v8 = arr_b[v2 + 1];
                    if((v8 & 0xC0) == 0x80) {
                        int v9 = arr_b[v2 + 2];
                        if((v9 & 0xC0) == 0x80) {
                            int v10 = v3 << 12 ^ (v9 ^ 0xFFFE1F80 ^ v8 << 6);
                            function10.invoke(Character.valueOf((v10 < 0x800 || 0xD800 <= v10 && v10 < 0xE000 ? '\uFFFD' : ((char)v10))));
                            v7 = 3;
                        }
                        else {
                            function10.invoke(Character.valueOf('\uFFFD'));
                            v7 = 2;
                        }
                        goto label_44;
                    }
                    else {
                        function10.invoke(Character.valueOf('\uFFFD'));
                    }
                }
                v7 = 1;
            label_44:
                v2 += v7;
                continue;
            label_46:
                if(v3 >> 3 == -2) {
                    if(v1 <= v2 + 3) {
                        function10.invoke(Character.valueOf('\uFFFD'));
                        if(v1 > v2 + 1 && (arr_b[v2 + 1] & 0xC0) == 0x80) {
                            v11 = v1 <= v2 + 2 || (arr_b[v2 + 2] & 0xC0) != 0x80 ? 2 : 3;
                            goto label_77;
                        }
                    }
                    else {
                        int v12 = arr_b[v2 + 1];
                        if((v12 & 0xC0) == 0x80) {
                            int v13 = arr_b[v2 + 2];
                            if((v13 & 0xC0) == 0x80) {
                                int v14 = arr_b[v2 + 3];
                                if((v14 & 0xC0) == 0x80) {
                                    int v15 = v14 ^ 0x381F80 ^ v13 << 6 ^ v12 << 12 ^ v3 << 18;
                                    if(v15 > 0x10FFFF || (0xD800 <= v15 && v15 < 0xE000 || v15 < 0x10000 || v15 == 0xFFFD)) {
                                        function10.invoke(Character.valueOf('\uFFFD'));
                                    }
                                    else {
                                        function10.invoke(Character.valueOf(((char)((v15 >>> 10) + 0xD7C0))));
                                        function10.invoke(Character.valueOf(((char)((v15 & 0x3FF) + 0xDC00))));
                                    }
                                    v11 = 4;
                                }
                                else {
                                    function10.invoke(Character.valueOf('\uFFFD'));
                                    v11 = 3;
                                }
                            }
                            else {
                                function10.invoke(Character.valueOf('\uFFFD'));
                                v11 = 2;
                            }
                            goto label_77;
                        }
                        else {
                            function10.invoke(Character.valueOf('\uFFFD'));
                        }
                    }
                    v11 = 1;
                label_77:
                    v2 += v11;
                }
                else {
                    function10.invoke(Character.valueOf('\uFFFD'));
                    ++v2;
                }
            }
        }
    }

    public static final void processUtf8Bytes(@NotNull String s, int v, int v1, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        Intrinsics.checkNotNullParameter(function10, "yield");
        while(v < v1) {
            int v2 = s.charAt(v);
            if(Intrinsics.compare(v2, 0x80) < 0) {
                function10.invoke(((byte)v2));
                ++v;
                while(v < v1 && Intrinsics.compare(s.charAt(v), 0x80) < 0) {
                    function10.invoke(((byte)s.charAt(v)));
                    ++v;
                }
            }
            else {
                if(Intrinsics.compare(v2, 0x800) < 0) {
                    function10.invoke(((byte)(v2 >> 6 | 0xC0)));
                    function10.invoke(((byte)(v2 & 0x3F | 0x80)));
                }
                else if(0xD800 > v2 || v2 >= 0xE000) {
                    function10.invoke(((byte)(v2 >> 12 | 0xE0)));
                    function10.invoke(((byte)(v2 >> 6 & 0x3F | 0x80)));
                    function10.invoke(((byte)(v2 & 0x3F | 0x80)));
                }
                else {
                    if(Intrinsics.compare(v2, 0xDBFF) <= 0 && v1 > v + 1) {
                        int v3 = s.charAt(v + 1);
                        if(0xDC00 <= v3 && v3 < 0xE000) {
                            int v4 = s.charAt(v + 1) + (v2 << 10) - 0x35FDC00;
                            function10.invoke(((byte)(v4 >> 18 | 0xF0)));
                            function10.invoke(((byte)(v4 >> 12 & 0x3F | 0x80)));
                            function10.invoke(((byte)(v4 >> 6 & 0x3F | 0x80)));
                            function10.invoke(((byte)(v4 & 0x3F | 0x80)));
                            v += 2;
                            continue;
                        }
                    }
                    function10.invoke(((byte)0x3F));
                }
                ++v;
            }
        }
    }

    public static final void processUtf8CodePoints(@NotNull byte[] arr_b, int v, int v1, @NotNull Function1 function10) {
        int v11;
        int v7;
        Intrinsics.checkNotNullParameter(arr_b, "<this>");
        Intrinsics.checkNotNullParameter(function10, "yield");
        int v2 = v;
        while(v2 < v1) {
            int v3 = arr_b[v2];
            if(v3 >= 0) {
                function10.invoke(v3);
                ++v2;
                while(v2 < v1) {
                    int v4 = arr_b[v2];
                    if(v4 < 0) {
                        break;
                    }
                    ++v2;
                    function10.invoke(v4);
                }
            }
            else {
                if(v3 >> 5 == -2) {
                    if(v1 > v2 + 1) {
                        int v5 = arr_b[v2 + 1];
                        if((v5 & 0xC0) == 0x80) {
                            int v6 = v3 << 6 ^ (v5 ^ 0xF80);
                            function10.invoke((v6 >= 0x80 ? v6 : 0xFFFD));
                            v7 = 2;
                            goto label_44;
                        }
                    }
                    function10.invoke(0xFFFD);
                }
                else if(v3 >> 4 != -2) {
                    goto label_46;
                }
                else if(v1 <= v2 + 2) {
                    function10.invoke(0xFFFD);
                    if(v1 > v2 + 1 && (arr_b[v2 + 1] & 0xC0) == 0x80) {
                        v7 = 2;
                        goto label_44;
                    }
                }
                else {
                    int v8 = arr_b[v2 + 1];
                    if((v8 & 0xC0) == 0x80) {
                        int v9 = arr_b[v2 + 2];
                        if((v9 & 0xC0) == 0x80) {
                            int v10 = v3 << 12 ^ (v9 ^ 0xFFFE1F80 ^ v8 << 6);
                            function10.invoke((v10 < 0x800 || 0xD800 <= v10 && v10 < 0xE000 ? 0xFFFD : v10));
                            v7 = 3;
                        }
                        else {
                            function10.invoke(0xFFFD);
                            v7 = 2;
                        }
                        goto label_44;
                    }
                    else {
                        function10.invoke(0xFFFD);
                    }
                }
                v7 = 1;
            label_44:
                v2 += v7;
                continue;
            label_46:
                if(v3 >> 3 == -2) {
                    if(v1 <= v2 + 3) {
                        function10.invoke(0xFFFD);
                        if(v1 > v2 + 1 && (arr_b[v2 + 1] & 0xC0) == 0x80) {
                            v11 = v1 <= v2 + 2 || (arr_b[v2 + 2] & 0xC0) != 0x80 ? 2 : 3;
                            goto label_73;
                        }
                    }
                    else {
                        int v12 = arr_b[v2 + 1];
                        if((v12 & 0xC0) == 0x80) {
                            int v13 = arr_b[v2 + 2];
                            if((v13 & 0xC0) == 0x80) {
                                int v14 = arr_b[v2 + 3];
                                if((v14 & 0xC0) == 0x80) {
                                    int v15 = v14 ^ 0x381F80 ^ v13 << 6 ^ v12 << 12 ^ v3 << 18;
                                    function10.invoke((v15 > 0x10FFFF || (0xD800 <= v15 && v15 < 0xE000 || v15 < 0x10000) ? 0xFFFD : v15));
                                    v11 = 4;
                                }
                                else {
                                    function10.invoke(0xFFFD);
                                    v11 = 3;
                                }
                            }
                            else {
                                function10.invoke(0xFFFD);
                                v11 = 2;
                            }
                            goto label_73;
                        }
                        else {
                            function10.invoke(0xFFFD);
                        }
                    }
                    v11 = 1;
                label_73:
                    v2 += v11;
                }
                else {
                    function10.invoke(0xFFFD);
                    ++v2;
                }
            }
        }
    }

    @JvmName(name = "size")
    @JvmOverloads
    public static final long size(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return Utf8.size$default(s, 0, 0, 3, null);
    }

    @JvmName(name = "size")
    @JvmOverloads
    public static final long size(@NotNull String s, int v) {
        Intrinsics.checkNotNullParameter(s, "<this>");
        return Utf8.size$default(s, v, 0, 2, null);
    }

    @JvmName(name = "size")
    @JvmOverloads
    public static final long size(@NotNull String s, int v, int v1) {
        int v4;
        Intrinsics.checkNotNullParameter(s, "<this>");
        if(v < 0) {
            throw new IllegalArgumentException(("beginIndex < 0: " + v).toString());
        }
        if(v1 < v) {
            throw new IllegalArgumentException(("endIndex < beginIndex: " + v1 + " < " + v).toString());
        }
        if(v1 <= s.length()) {
            long v2 = 0L;
            while(v < v1) {
                int v3 = s.charAt(v);
                if(v3 < 0x80) {
                    ++v2;
                }
                else {
                    if(v3 < 0x800) {
                        v4 = 2;
                    }
                    else if(v3 < 0xD800 || v3 > 0xDFFF) {
                        v4 = 3;
                    }
                    else {
                        int v5 = v + 1 >= v1 ? 0 : s.charAt(v + 1);
                        if(v3 > 0xDBFF || v5 < 0xDC00 || v5 > 0xDFFF) {
                            ++v2;
                            ++v;
                        }
                        else {
                            v2 += 4L;
                            v += 2;
                        }
                        continue;
                    }
                    v2 += (long)v4;
                }
                ++v;
            }
            return v2;
        }
        StringBuilder stringBuilder0 = b.s(v1, "endIndex > string.length: ", " > ");
        stringBuilder0.append(s.length());
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    public static long size$default(String s, int v, int v1, int v2, Object object0) {
        if((v2 & 1) != 0) {
            v = 0;
        }
        if((v2 & 2) != 0) {
            v1 = s.length();
        }
        return Utf8.size(s, v, v1);
    }
}

