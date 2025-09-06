package kotlinx.serialization.json.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.c;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J\u000F\u0010\u0013\u001A\u00020\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lkotlinx/serialization/json/internal/JsonToStringWriter;", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "<init>", "()V", "", "value", "", "writeLong", "(J)V", "", "char", "writeChar", "(C)V", "", "text", "write", "(Ljava/lang/String;)V", "writeQuoted", "release", "toString", "()Ljava/lang/String;", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class JsonToStringWriter implements InternalJsonWriter {
    public char[] a;
    public int b;

    public JsonToStringWriter() {
        this.a = CharArrayPool.INSTANCE.take();
    }

    public final void a(int v, int v1) {
        int v2 = v1 + v;
        char[] arr_c = this.a;
        if(arr_c.length <= v2) {
            char[] arr_c1 = Arrays.copyOf(arr_c, c.coerceAtLeast(v2, v * 2));
            Intrinsics.checkNotNullExpressionValue(arr_c1, "copyOf(...)");
            this.a = arr_c1;
        }
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void release() {
        CharArrayPool.INSTANCE.release(this.a);
    }

    @Override
    @NotNull
    public String toString() [...] // 潜在的解密器

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void write(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "text");
        int v = s.length();
        if(v == 0) {
            return;
        }
        this.a(this.b, v);
        this.b += v;
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeChar(char c) {
        this.a(this.b, 1);
        int v = this.b;
        this.b = v + 1;
        this.a[v] = c;
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeLong(long v) {
        this.write(String.valueOf(v));
    }

    @Override  // kotlinx.serialization.json.internal.InternalJsonWriter
    public void writeQuoted(@NotNull String s) {
        int v8;
        Intrinsics.checkNotNullParameter(s, "text");
        this.a(this.b, s.length() + 2);
        char[] arr_c = this.a;
        int v = this.b + 1;
        arr_c[this.b] = '\"';
        int v1 = s.length() + v;
        int v2 = v;
        while(v2 < v1) {
            int v3 = arr_c[v2];
            if(v3 < 93 && new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 98, 0x74, 110, 1, 102, 0x72, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 92}[v3] != 0) {
                int v4 = v2 - v;
                int v5 = s.length();
                while(v4 < v5) {
                    this.a(v2, 2);
                    int v6 = s.charAt(v4);
                    if(v6 < 93) {
                        int v7 = new byte[]{1, 1, 1, 1, 1, 1, 1, 1, 98, 0x74, 110, 1, 102, 0x72, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 34, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 92}[v6];
                        if(v7 == 0) {
                            v8 = v2 + 1;
                            this.a[v2] = (char)v6;
                            goto label_37;
                        }
                        else {
                            if(v7 == 1) {
                                String s1 = StringOpsKt.getESCAPE_STRINGS()[v6];
                                Intrinsics.checkNotNull(s1);
                                this.a(v2, s1.length());
                                int v9 = s1.length() + v2;
                                this.b = v9;
                                v2 = v9;
                            }
                            else {
                                char[] arr_c1 = this.a;
                                arr_c1[v2] = '\\';
                                arr_c1[v2 + 1] = (char)v7;
                                v2 += 2;
                                this.b = v2;
                            }
                            goto label_38;
                        }
                        goto label_35;
                    }
                    else {
                    label_35:
                        v8 = v2 + 1;
                        this.a[v2] = (char)v6;
                    }
                label_37:
                    v2 = v8;
                label_38:
                    ++v4;
                }
                this.a(v2, 1);
                this.a[v2] = '\"';
                this.b = v2 + 1;
                return;
            }
            ++v2;
        }
        arr_c[v1] = '\"';
        this.b = v1 + 1;
    }
}

