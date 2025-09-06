package kotlinx.serialization.json.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\u0019\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000F\b\u0000\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u001F\u0010\r\u001A\u00020\u00012\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u000B\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0012\u001A\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u000FH\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u001A\u0010\u0003\u001A\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001BR\"\u0010!\u001A\u00020\u00068\u0016@\u0016X\u0096\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010\u0015¨\u0006\""}, d2 = {"Lkotlinx/serialization/json/internal/ArrayAsSequence;", "", "", "buffer", "<init>", "([C)V", "", "index", "", "get", "(I)C", "startIndex", "endIndex", "subSequence", "(II)Ljava/lang/CharSequence;", "", "substring", "(II)Ljava/lang/String;", "newSize", "", "trim", "(I)V", "toString", "()Ljava/lang/String;", "a", "[C", "getBuffer$kotlinx_serialization_json", "()[C", "b", "I", "getLength", "()I", "setLength", "length", "kotlinx-serialization-json"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ArrayAsSequence implements CharSequence {
    public final char[] a;
    public int b;

    public ArrayAsSequence(@NotNull char[] arr_c) {
        Intrinsics.checkNotNullParameter(arr_c, "buffer");
        super();
        this.a = arr_c;
        this.b = arr_c.length;
    }

    @Override
    public final char charAt(int v) {
        return this.get(v);
    }

    public char get(int v) {
        return this.a[v];
    }

    @NotNull
    public final char[] getBuffer$kotlinx_serialization_json() {
        return this.a;
    }

    public int getLength() {
        return this.b;
    }

    @Override
    public final int length() {
        return this.getLength();
    }

    public void setLength(int v) {
        this.b = v;
    }

    @Override
    @NotNull
    public CharSequence subSequence(int v, int v1) {
        int v2 = Math.min(v1, this.length());
        return p.concatToString(this.a, v, v2);
    }

    @NotNull
    public final String substring(int v, int v1) {
        int v2 = Math.min(v1, this.length());
        return p.concatToString(this.a, v, v2);
    }

    @Override
    @NotNull
    public String toString() {
        return this.substring(0, this.length());
    }

    public final void trim(int v) {
        this.setLength(Math.min(this.a.length, v));
    }
}

