package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import j2.d;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@RestrictTo({Scope.LIBRARY_GROUP})
@StabilityInferred(parameters = 0)
@InternalTextApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\r\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\n\u001A\u00020\t2\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\b\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u0018\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u0006H\u0086\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0003\u001A\u00020\u00028\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0005R\u0011\u0010\u0018\u001A\u00020\u00068F¢\u0006\u0006\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer;", "", "", "text", "<init>", "(Ljava/lang/String;)V", "", "start", "end", "", "replace", "(IILjava/lang/String;)V", "index", "", "get", "(I)C", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getText", "setText", "getLength", "()I", "length", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PartialGapBuffer {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/text/input/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    public static final int BUF_SIZE = 0xFF;
    @NotNull
    public static final Companion Companion = null;
    public static final int NOWHERE = -1;
    public static final int SURROUNDING_SIZE = 0x40;
    public String a;
    public d b;
    public int c;
    public int d;

    static {
        PartialGapBuffer.Companion = new Companion(null);
        PartialGapBuffer.$stable = 8;
    }

    public PartialGapBuffer(@NotNull String s) {
        this.a = s;
        this.c = -1;
        this.d = -1;
    }

    public final char get(int v) {
        d d0 = this.b;
        if(d0 == null) {
            return this.a.charAt(v);
        }
        if(v < this.c) {
            return this.a.charAt(v);
        }
        int v1 = d0.b - d0.b();
        int v2 = this.c;
        if(v < v1 + v2) {
            int v3 = v - v2;
            return v3 >= d0.d ? ((char[])d0.c)[v3 - d0.d + d0.e] : ((char[])d0.c)[v3];
        }
        return this.a.charAt(v - (v1 - this.d + v2));
    }

    public final int getLength() {
        return this.b == null ? this.a.length() : this.b.b - this.b.b() + (this.a.length() - (this.d - this.c));
    }

    @NotNull
    public final String getText() {
        return this.a;
    }

    public final void replace(int v, int v1, @NotNull String s) {
        if(v > v1) {
            throw new IllegalArgumentException(("start index must be less than or equal to end index: " + v + " > " + v1).toString());
        }
        if(v < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + v).toString());
        }
        d d0 = this.b;
        if(d0 == null) {
            int v2 = Math.max(0xFF, s.length() + 0x80);
            char[] arr_c = new char[v2];
            int v3 = Math.min(v, 0x40);
            int v4 = Math.min(this.a.length() - v1, 0x40);
            int v5 = v - v3;
            GapBuffer_jvmKt.toCharArray(this.a, arr_c, 0, v5, v);
            int v6 = v2 - v4;
            int v7 = v4 + v1;
            GapBuffer_jvmKt.toCharArray(this.a, arr_c, v6, v1, v7);
            GapBufferKt.access$toCharArray(s, arr_c, v3);
            d d1 = new d(0);
            d1.b = v2;
            d1.c = arr_c;
            d1.d = s.length() + v3;
            d1.e = v6;
            this.b = d1;
            this.c = v5;
            this.d = v7;
            return;
        }
        int v8 = v - this.c;
        int v9 = v1 - this.c;
        if(v8 >= 0 && v9 <= d0.b - d0.b()) {
            int v10 = s.length() - (v9 - v8);
            if(v10 > d0.b()) {
                int v11 = d0.b();
                int v12 = d0.b;
                do {
                    v12 *= 2;
                }
                while(v12 - d0.b < v10 - v11);
                char[] arr_c1 = new char[v12];
                ArraysKt___ArraysJvmKt.copyInto(((char[])d0.c), arr_c1, 0, 0, d0.d);
                int v13 = d0.b - d0.e;
                int v14 = v12 - v13;
                ArraysKt___ArraysJvmKt.copyInto(((char[])d0.c), arr_c1, v14, d0.e, v13 + d0.e);
                d0.c = arr_c1;
                d0.b = v12;
                d0.e = v14;
            }
            int v15 = d0.d;
            if(v8 < v15 && v9 <= v15) {
                int v16 = v15 - v9;
                char[] arr_c2 = (char[])d0.c;
                ArraysKt___ArraysJvmKt.copyInto(arr_c2, arr_c2, d0.e - v16, v9, v15);
                d0.d = v8;
                d0.e -= v16;
            }
            else if(v8 >= v15 || v9 < v15) {
                int v17 = d0.b() + v8;
                int v18 = d0.b();
                int v19 = d0.e;
                char[] arr_c3 = (char[])d0.c;
                ArraysKt___ArraysJvmKt.copyInto(arr_c3, arr_c3, d0.d, v19, v17);
                d0.d += v17 - v19;
                d0.e = v18 + v9;
            }
            else {
                d0.e = d0.b() + v9;
                d0.d = v8;
            }
            GapBufferKt.access$toCharArray(s, ((char[])d0.c), d0.d);
            d0.d = s.length() + d0.d;
            return;
        }
        this.a = this.toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.replace(v, v1, s);
    }

    public final void setText(@NotNull String s) {
        this.a = s;
    }

    @Override
    @NotNull
    public String toString() {
        d d0 = this.b;
        if(d0 == null) {
            return this.a;
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a, 0, this.c);
        stringBuilder0.append(((char[])d0.c), 0, d0.d);
        stringBuilder0.append(((char[])d0.c), d0.e, d0.b - d0.e);
        stringBuilder0.append(this.a, this.d, this.a.length());
        return stringBuilder0.toString();
    }
}

