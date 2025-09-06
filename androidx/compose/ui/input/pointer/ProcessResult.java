package androidx.compose.ui.input.pointer;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\t\b\u0081@\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001A\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000B\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001A\u0010\u0010\u001A\u00020\r2\b\u0010\f\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000E\u0010\u000FR\u0011\u0010\u0013\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0015\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u0014\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/input/pointer/ProcessResult;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "getDispatchedToAPointerInputModifier-impl", "(I)Z", "dispatchedToAPointerInputModifier", "getAnyMovementConsumed-impl", "anyMovementConsumed", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@JvmInline
public final class ProcessResult {
    public final int a;

    public ProcessResult(int v) {
        this.a = v;
    }

    public static final ProcessResult box-impl(int v) {
        return new ProcessResult(v);
    }

    public static int constructor-impl(int v) [...] // Inlined contents

    @Override
    public boolean equals(Object object0) {
        return ProcessResult.equals-impl(this.a, object0);
    }

    public static boolean equals-impl(int v, Object object0) {
        return object0 instanceof ProcessResult ? v == ((ProcessResult)object0).unbox-impl() : false;
    }

    public static final boolean equals-impl0(int v, int v1) {
        return v == v1;
    }

    public static final boolean getAnyMovementConsumed-impl(int v) {
        return (v & 2) != 0;
    }

    public static final boolean getDispatchedToAPointerInputModifier-impl(int v) {
        return (v & 1) != 0;
    }

    @Override
    public int hashCode() {
        return ProcessResult.hashCode-impl(this.a);
    }

    public static int hashCode-impl(int v) {
        return v;
    }

    @Override
    public String toString() {
        return ProcessResult.toString-impl(this.a);
    }

    public static String toString-impl(int v) {
        return "ProcessResult(value=" + v + ')';
    }

    public final int unbox-impl() {
        return this.a;
    }
}

