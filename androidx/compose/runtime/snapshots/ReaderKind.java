package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u000F\b\u0081@\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB\u0011\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001B\u0010\t\u001A\u00020\u00002\u0006\u0010\u0006\u001A\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\r\u001A\u00020\n2\u0006\u0010\u0006\u001A\u00020\u0000H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\u0011\u001A\u00020\u000EHÖ\u0001¢\u0006\u0004\b\u000F\u0010\u0010J\u0010\u0010\u0013\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0005J\u001A\u0010\u0017\u001A\u00020\n2\b\u0010\u0014\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001D"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind;", "", "", "mask", "constructor-impl", "(I)I", "reader", "withReadIn-3QSx2Dw", "(II)I", "withReadIn", "", "isReadIn-h_f27i8", "(II)Z", "isReadIn", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "a", "I", "getMask", "()I", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class ReaderKind {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0018\u0010\u0005\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0003\u0010\u0004R\u0018\u0010\u0007\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\u0006\u0010\u0004R\u0018\u0010\t\u001A\u00020\u00028Æ\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001A\u0004\b\b\u0010\u0004\u0082\u0002\u000B\n\u0005\b¡\u001E0\u0001\n\u0002\b!¨\u0006\n"}, d2 = {"Landroidx/compose/runtime/snapshots/ReaderKind$Companion;", "", "Landroidx/compose/runtime/snapshots/ReaderKind;", "getComposition-6f8NoZ8", "()I", "Composition", "getSnapshotStateObserver-6f8NoZ8", "SnapshotStateObserver", "getSnapshotFlow-6f8NoZ8", "SnapshotFlow", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public final int getComposition-6f8NoZ8() {
            return 1;
        }

        public final int getSnapshotFlow-6f8NoZ8() {
            return 4;
        }

        public final int getSnapshotStateObserver-6f8NoZ8() {
            return 2;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final int a;

    static {
        ReaderKind.Companion = new Companion(null);
    }

    public ReaderKind(int v) {
        this.a = v;
    }

    public static final ReaderKind box-impl(int v) {
        return new ReaderKind(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    public static int constructor-impl$default(int v, int v1, DefaultConstructorMarker defaultConstructorMarker0) {
        return (v1 & 1) == 0 ? v : 0;
    }

    @Override
    public boolean equals(Object object0) {
        return ReaderKind.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof ReaderKind ? v == ((ReaderKind)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public final int getMask() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return ReaderKind.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    public static final boolean isReadIn-h_f27i8(int v, int v1) {
        return (v & v1) != 0;
    }

    @Override
    public String toString() {
        return ReaderKind.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "ReaderKind(mask=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }

    public static final int withReadIn-3QSx2Dw(int v, int v1) {
        return v | v1;
    }
}

