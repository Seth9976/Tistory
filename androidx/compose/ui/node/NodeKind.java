package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\b\b\u0081@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\n\u001A\u00020\u00032\n\u0010\u0007\u001A\u0006\u0012\u0002\b\u00030\u0000H\u0086\fø\u0001\u0000¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00032\u0006\u0010\u0007\u001A\u00020\u0003H\u0086\f¢\u0006\u0004\b\u000B\u0010\tJ\u0010\u0010\u000F\u001A\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0011\u001A\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0006J\u001A\u0010\u0015\u001A\u00020\u00122\b\u0010\u0007\u001A\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001A\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\u0088\u0001\u0004\u0092\u0001\u00020\u0003\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001A"}, d2 = {"Landroidx/compose/ui/node/NodeKind;", "T", "", "", "mask", "constructor-impl", "(I)I", "other", "or-H91voCI", "(II)I", "or", "or-impl", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getMask", "()I", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class NodeKind {
    public final int a;

    public NodeKind(int v) {
        this.a = v;
    }

    public static final NodeKind box-impl(int v) {
        return new NodeKind(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return NodeKind.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof NodeKind ? v == ((NodeKind)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getMask() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return NodeKind.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    public static final int or-H91voCI(int v, int v1) {
        return v | v1;
    }

    public static final int or-impl(int v, int v1) {
        return v | v1;
    }

    @Override
    public String toString() {
        return NodeKind.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "NodeKind(mask=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

