package androidx.compose.foundation.text.input.internal;

import androidx.compose.runtime.internal.StabilityInferred;
import j2.d;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysJvmKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001F2\u00020\u0001:\u0001\u001FB\u000F\u0012\u0006\u0010\u0002\u001A\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J9\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u0007\u001A\u00020\u00052\u0006\u0010\u0002\u001A\u00020\u00012\b\b\u0002\u0010\b\u001A\u00020\u00052\b\b\u0002\u0010\t\u001A\u00020\u0005¢\u0006\u0004\b\u000B\u0010\fJ\u0018\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\r\u001A\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0013\u001A\u00020\u00012\u0006\u0010\u0011\u001A\u00020\u00052\u0006\u0010\u0012\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0018\u001A\u00020\u0001¢\u0006\u0004\b\u001A\u0010\u001BR\u0014\u0010\u001E\u001A\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u001C\u0010\u001D¨\u0006 "}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer;", "", "text", "<init>", "(Ljava/lang/CharSequence;)V", "", "start", "end", "textStart", "textEnd", "", "replace", "(IILjava/lang/CharSequence;II)V", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "toString", "()Ljava/lang/String;", "other", "", "contentEquals", "(Ljava/lang/CharSequence;)Z", "getLength", "()I", "length", "Companion", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nGapBuffer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GapBuffer.kt\nandroidx/compose/foundation/text/input/internal/PartialGapBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,334:1\n1#2:335\n*E\n"})
public final class PartialGapBuffer implements CharSequence {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Landroidx/compose/foundation/text/input/internal/PartialGapBuffer$Companion;", "", "", "BUF_SIZE", "I", "NOWHERE", "SURROUNDING_SIZE", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
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
    public CharSequence a;
    public d b;
    public int c;
    public int d;

    static {
        PartialGapBuffer.Companion = new Companion(null);
        PartialGapBuffer.$stable = 8;
    }

    public PartialGapBuffer(@NotNull CharSequence charSequence0) {
        this.a = charSequence0;
        this.c = -1;
        this.d = -1;
    }

    @Override
    public final char charAt(int v) {
        return this.get(v);
    }

    public final boolean contentEquals(@NotNull CharSequence charSequence0) {
        return Intrinsics.areEqual(this.toString(), charSequence0.toString());
    }

    public char get(int v) {
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

    public int getLength() {
        d d0 = this.b;
        if(d0 == null) {
            return this.a.length();
        }
        int v = this.a.length() - (this.d - this.c);
        return d0.b - d0.b() + v;
    }

    @Override
    public final int length() {
        return this.getLength();
    }

    public final void replace(int v, int v1, @NotNull CharSequence charSequence0, int v2, int v3) {
        if(v > v1) {
            throw new IllegalArgumentException(("start=" + v + " > end=" + v1).toString());
        }
        if(v2 > v3) {
            throw new IllegalArgumentException(("textStart=" + v2 + " > textEnd=" + v3).toString());
        }
        if(v < 0) {
            throw new IllegalArgumentException(("start must be non-negative, but was " + v).toString());
        }
        if(v2 < 0) {
            throw new IllegalArgumentException(("textStart must be non-negative, but was " + v2).toString());
        }
        d d0 = this.b;
        int v4 = v3 - v2;
        if(d0 == null) {
            int v5 = Math.max(0xFF, v4 + 0x80);
            char[] arr_c = new char[v5];
            int v6 = Math.min(v, 0x40);
            int v7 = Math.min(this.a.length() - v1, 0x40);
            int v8 = v - v6;
            ToCharArray_androidKt.toCharArray(this.a, arr_c, 0, v8, v);
            int v9 = v5 - v7;
            int v10 = v7 + v1;
            ToCharArray_androidKt.toCharArray(this.a, arr_c, v9, v1, v10);
            ToCharArray_androidKt.toCharArray(charSequence0, arr_c, v6, v2, v3);
            d d1 = new d(1);
            d1.b = v5;
            d1.c = arr_c;
            d1.d = v6 + v4;
            d1.e = v9;
            this.b = d1;
            this.c = v8;
            this.d = v10;
            return;
        }
        int v11 = v - this.c;
        int v12 = v1 - this.c;
        if(v11 >= 0 && v12 <= d0.b - d0.b()) {
            int v13 = v4 - (v12 - v11);
            if(v13 > d0.b()) {
                int v14 = d0.b();
                int v15 = d0.b;
                do {
                    v15 *= 2;
                }
                while(v15 - d0.b < v13 - v14);
                char[] arr_c1 = new char[v15];
                ArraysKt___ArraysJvmKt.copyInto(((char[])d0.c), arr_c1, 0, 0, d0.d);
                int v16 = d0.b - d0.e;
                int v17 = v15 - v16;
                ArraysKt___ArraysJvmKt.copyInto(((char[])d0.c), arr_c1, v17, d0.e, v16 + d0.e);
                d0.c = arr_c1;
                d0.b = v15;
                d0.e = v17;
            }
            int v18 = d0.d;
            if(v11 < v18 && v12 <= v18) {
                int v19 = v18 - v12;
                char[] arr_c2 = (char[])d0.c;
                ArraysKt___ArraysJvmKt.copyInto(arr_c2, arr_c2, d0.e - v19, v12, v18);
                d0.d = v11;
                d0.e -= v19;
            }
            else if(v11 >= v18 || v12 < v18) {
                int v20 = d0.b() + v11;
                int v21 = d0.b();
                int v22 = d0.e;
                char[] arr_c3 = (char[])d0.c;
                ArraysKt___ArraysJvmKt.copyInto(arr_c3, arr_c3, d0.d, v22, v20);
                d0.d += v20 - v22;
                d0.e = v21 + v12;
            }
            else {
                d0.e = d0.b() + v12;
                d0.d = v11;
            }
            ToCharArray_androidKt.toCharArray(charSequence0, ((char[])d0.c), d0.d, v2, v3);
            d0.d += v4;
            return;
        }
        this.a = this.toString();
        this.b = null;
        this.c = -1;
        this.d = -1;
        this.replace(v, v1, charSequence0, v2, v3);
    }

    public static void replace$default(PartialGapBuffer partialGapBuffer0, int v, int v1, CharSequence charSequence0, int v2, int v3, int v4, Object object0) {
        if((v4 & 8) != 0) {
            v2 = 0;
        }
        if((v4 & 16) != 0) {
            v3 = charSequence0.length();
        }
        partialGapBuffer0.replace(v, v1, charSequence0, v2, v3);
    }

    @Override
    @NotNull
    public CharSequence subSequence(int v, int v1) {
        return this.toString().subSequence(v, v1);
    }

    @Override
    @NotNull
    public String toString() {
        d d0 = this.b;
        if(d0 == null) {
            return this.a.toString();
        }
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.a, 0, this.c);
        stringBuilder0.append(((char[])d0.c), 0, d0.d);
        stringBuilder0.append(((char[])d0.c), d0.e, d0.b - d0.e);
        stringBuilder0.append(this.a, this.d, this.a.length());
        return stringBuilder0.toString();
    }
}

