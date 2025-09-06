package kotlinx.serialization.json.internal;

import a5.b;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001A\u00020\b2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u0017\u0010\u0011\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToJavaStreamWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "Ljava/io/OutputStream;", "stream", "<init>", "(Ljava/io/OutputStream;)V", "", "value", "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "()V", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nJvmJsonStreams.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,268:1\n130#1:269\n117#1:271\n130#1:272\n118#1,3:273\n125#1,2:276\n130#1:278\n125#1,2:279\n117#1:281\n130#1:282\n118#1,3:283\n125#1,2:286\n125#1,2:288\n117#1:290\n130#1:291\n118#1,3:292\n125#1,2:295\n125#1,2:297\n125#1,2:299\n117#1:301\n130#1:302\n118#1,3:303\n125#1,2:306\n117#1:308\n130#1:309\n118#1,3:310\n125#1,2:313\n125#1,2:315\n125#1,2:317\n125#1,2:319\n117#1:321\n130#1:322\n118#1,3:323\n125#1,2:326\n117#1:328\n130#1:329\n118#1,3:330\n125#1,2:333\n125#1,2:335\n117#1:337\n130#1:338\n118#1,3:339\n125#1,2:342\n117#1:344\n130#1:345\n118#1,3:346\n125#1,2:349\n125#1,2:351\n125#1,2:353\n117#1:355\n130#1:356\n118#1,3:357\n125#1,2:360\n125#1,2:362\n125#1,2:364\n125#1,2:366\n1#2:270\n*S KotlinDebug\n*F\n+ 1 JvmJsonStreams.kt\nkotlinx/serialization/json/internal/JsonToJavaStreamWriter\n*L\n117#1:269\n148#1:271\n148#1:272\n148#1:273,3\n149#1:276,2\n151#1:278\n158#1:279,2\n165#1:281\n165#1:282\n165#1:283,3\n166#1:286,2\n167#1:288,2\n173#1:290\n173#1:291\n173#1:292,3\n174#1:295,2\n175#1:297,2\n176#1:299,2\n186#1:301\n186#1:302\n186#1:303,3\n187#1:306,2\n196#1:308\n196#1:309\n196#1:310,3\n197#1:313,2\n198#1:315,2\n199#1:317,2\n200#1:319,2\n215#1:321\n215#1:322\n215#1:323,3\n216#1:326,2\n221#1:328\n221#1:329\n221#1:330,3\n222#1:333,2\n223#1:335,2\n228#1:337\n228#1:338\n228#1:339,3\n229#1:342,2\n234#1:344\n234#1:345\n234#1:346,3\n235#1:349,2\n236#1:351,2\n237#1:353,2\n242#1:355\n242#1:356\n242#1:357,3\n243#1:360,2\n244#1:362,2\n245#1:364,2\n246#1:366,2\n*E\n"})
public final class JsonToJavaStreamWriter implements InternalJsonWriter {
    public final OutputStream a;
    public final byte[] b;
    public char[] c;
    public int d;

    public JsonToJavaStreamWriter(@NotNull OutputStream outputStream0) {
        Intrinsics.checkNotNullParameter(outputStream0, "stream");
        super();
        this.a = outputStream0;
        this.b = ByteArrayPool.INSTANCE.take();
        this.c = CharArrayPool.INSTANCE.take();
    }

    public final void a(int v, int v1) {
        int v2 = v1 + v;
        char[] arr_c = this.c;
        if(arr_c.length <= v2) {
            char[] arr_c1 = Arrays.copyOf(arr_c, c.coerceAtLeast(v2, v * 2));
            Intrinsics.checkNotNullExpressionValue(arr_c1, "copyOf(...)");
            this.c = arr_c1;
        }
    }

    public final void b() {
        this.a.write(this.b, 0, this.d);
        this.d = 0;
    }

    public final void c(char[] arr_c, int v) {
        if(v < 0) {
            throw new IllegalArgumentException("count < 0");
        }
        if(v <= arr_c.length) {
            int v1 = 0;
            while(v1 < v) {
                int v2 = arr_c[v1];
                byte[] arr_b = this.b;
                if(v2 < 0x80) {
                    if(arr_b.length - this.d < 1) {
                        this.b();
                    }
                    int v3 = this.d;
                    this.d = v3 + 1;
                    arr_b[v3] = (byte)v2;
                    ++v1;
                    int v4 = Math.min(v, arr_b.length - (v3 + 1) + v1);
                    while(v1 < v4) {
                        int v5 = arr_c[v1];
                        if(v5 >= 0x80) {
                            break;
                        }
                        int v6 = this.d;
                        this.d = v6 + 1;
                        arr_b[v6] = (byte)v5;
                        ++v1;
                    }
                }
                else {
                    if(v2 < 0x800) {
                        if(arr_b.length - this.d < 2) {
                            this.b();
                        }
                        int v7 = this.d;
                        this.d = v7 + 1;
                        arr_b[v7] = (byte)(v2 >> 6 | 0xC0);
                        this.d = v7 + 2;
                        arr_b[v7 + 1] = (byte)(v2 & 0x3F | 0x80);
                    }
                    else if(v2 < 0xD800 || v2 > 0xDFFF) {
                        if(arr_b.length - this.d < 3) {
                            this.b();
                        }
                        int v12 = this.d;
                        this.d = v12 + 1;
                        arr_b[v12] = (byte)(v2 >> 12 | 0xE0);
                        this.d = v12 + 2;
                        arr_b[v12 + 1] = (byte)(v2 >> 6 & 0x3F | 0x80);
                        this.d = v12 + 3;
                        arr_b[v12 + 2] = (byte)(v2 & 0x3F | 0x80);
                    }
                    else {
                        int v8 = v1 + 1 < v ? arr_c[v1 + 1] : 0;
                        if(v2 > 0xDBFF || 0xDC00 > v8 || v8 >= 0xE000) {
                            if(arr_b.length - this.d < 1) {
                                this.b();
                            }
                            int v11 = this.d;
                            this.d = v11 + 1;
                            arr_b[v11] = 0x3F;
                            ++v1;
                        }
                        else {
                            int v9 = ((v2 & 0x3FF) << 10 | v8 & 0x3FF) + 0x10000;
                            if(arr_b.length - this.d < 4) {
                                this.b();
                            }
                            int v10 = this.d;
                            this.d = v10 + 1;
                            arr_b[v10] = (byte)(v9 >> 18 | 0xF0);
                            this.d = v10 + 2;
                            arr_b[v10 + 1] = (byte)(v9 >> 12 & 0x3F | 0x80);
                            this.d = v10 + 3;
                            arr_b[v10 + 2] = (byte)(v9 >> 6 & 0x3F | 0x80);
                            this.d = v10 + 4;
                            arr_b[v10 + 3] = (byte)(v9 & 0x3F | 0x80);
                            v1 += 2;
                        }
                        continue;
                    }
                    ++v1;
                }
            }
            return;
        }
        StringBuilder stringBuilder0 = b.s(v, "count > string.length: ", " > ");
        stringBuilder0.append(arr_c.length);
        throw new IllegalArgumentException(stringBuilder0.toString().toString());
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        this.b();
        CharArrayPool.INSTANCE.release(this.c);
        ByteArrayPool.INSTANCE.release(this.b);
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        int v = s.length();
        this.a(0, v);
        this.c(this.c, v);
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c) {
        byte[] arr_b = this.b;
        if(c < 0x80) {
            if(arr_b.length - this.d < 1) {
                this.b();
            }
            int v = this.d;
            this.d = v + 1;
            arr_b[v] = (byte)c;
            return;
        }
        if(c < 0x800) {
            if(arr_b.length - this.d < 2) {
                this.b();
            }
            int v1 = this.d;
            this.d = v1 + 1;
            arr_b[v1] = (byte)(c >> 6 | 0xC0);
            this.d = v1 + 2;
            arr_b[v1 + 1] = (byte)(c & 0x3F | 0x80);
            return;
        }
        if(0xD800 <= c && c < 0xE000) {
            if(arr_b.length - this.d < 1) {
                this.b();
            }
            int v2 = this.d;
            this.d = v2 + 1;
            arr_b[v2] = 0x3F;
            return;
        }
        if(c < 0x10000) {
            if(arr_b.length - this.d < 3) {
                this.b();
            }
            int v3 = this.d;
            this.d = v3 + 1;
            arr_b[v3] = (byte)(c >> 12 | 0xE0);
            this.d = v3 + 2;
            arr_b[v3 + 1] = (byte)(c >> 6 & 0x3F | 0x80);
            this.d = v3 + 3;
            arr_b[v3 + 2] = (byte)(c & 0x3F | 0x80);
            return;
        }
        if(c > 0x10FFFF) {
            throw new JsonEncodingException("Unexpected code point: " + ((int)c));
        }
        if(arr_b.length - this.d < 4) {
            this.b();
        }
        int v4 = this.d;
        this.d = v4 + 1;
        arr_b[v4] = (byte)(c >> 18 | 0xF0);
        this.d = v4 + 2;
        arr_b[v4 + 1] = (byte)(c >> 12 & 0x3F | 0x80);
        this.d = v4 + 3;
        arr_b[v4 + 2] = (byte)(c >> 6 & 0x3F | 0x80);
        this.d = v4 + 4;
        arr_b[v4 + 3] = (byte)(c & 0x3F | 0x80);
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long v) {
        this.write(String.valueOf(v));
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String s) {
        int v7;
        Intrinsics.checkNotNullParameter(s, "text");
        this.a(0, s.length() + 2);
        char[] arr_c = this.c;
        arr_c[0] = '\"';
        int v = s.length();
        int v1 = 1;
        while(v1 < v + 1) {
            int v2 = arr_c[v1];
            if(v2 < 93 && new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 98, 0x74, 110, 1, 102, 0x72, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 92}[v2] != 0) {
                int v3 = v1 - 1;
                int v4 = s.length();
                while(v3 < v4) {
                    this.a(v1, 2);
                    int v5 = s.charAt(v3);
                    if(v5 < 93) {
                        int v6 = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 98, 0x74, 110, 1, 102, 0x72, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 92}[v5];
                        if(v6 == 0) {
                            v7 = v1 + 1;
                            this.c[v1] = (char)v5;
                            goto label_33;
                        }
                        else {
                            if(v6 == 1) {
                                String s1 = StringOpsKt.getESCAPE_STRINGS()[v5];
                                Intrinsics.checkNotNull(s1);
                                this.a(v1, s1.length());
                                v1 = s1.length() + v1;
                            }
                            else {
                                char[] arr_c1 = this.c;
                                arr_c1[v1] = '\\';
                                arr_c1[v1 + 1] = (char)v6;
                                v1 += 2;
                            }
                            goto label_34;
                        }
                        goto label_31;
                    }
                    else {
                    label_31:
                        v7 = v1 + 1;
                        this.c[v1] = (char)v5;
                    }
                label_33:
                    v1 = v7;
                label_34:
                    ++v3;
                }
                this.a(v1, 1);
                char[] arr_c2 = this.c;
                arr_c2[v1] = '\"';
                this.c(arr_c2, v1 + 1);
                this.b();
                return;
            }
            ++v1;
        }
        arr_c[v + 1] = '\"';
        this.c(arr_c, v + 2);
        this.b();
    }
}

