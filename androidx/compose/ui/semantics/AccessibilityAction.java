package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u0000*\u000E\b\u0000\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0004B\u001B\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001A\u0004\u0018\u00018\u0000¢\u0006\u0004\b\b\u0010\tJ\u001A\u0010\u000B\u001A\u00020\u00022\b\u0010\n\u001A\u0004\u0018\u00010\u0004H\u0096\u0002¢\u0006\u0004\b\u000B\u0010\fJ\u000F\u0010\u000E\u001A\u00020\rH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0011R\u0019\u0010\u0007\u001A\u0004\u0018\u00018\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/semantics/AccessibilityAction;", "Lkotlin/Function;", "", "T", "", "", "label", "action", "<init>", "(Ljava/lang/String;Lkotlin/Function;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLabel", "b", "Lkotlin/Function;", "getAction", "()Lkotlin/Function;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class AccessibilityAction {
    public static final int $stable;
    public final String a;
    public final Function b;

    public AccessibilityAction(@Nullable String s, @Nullable Function function0) {
        this.a = s;
        this.b = function0;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof AccessibilityAction)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((AccessibilityAction)object0).a) ? Intrinsics.areEqual(this.b, ((AccessibilityAction)object0).b) : false;
    }

    @Nullable
    public final Function getAction() {
        return this.b;
    }

    @Nullable
    public final String getLabel() {
        return this.a;
    }

    @Override
    public int hashCode() {
        int v = 0;
        int v1 = this.a == null ? 0 : this.a.hashCode();
        Function function0 = this.b;
        if(function0 != null) {
            v = function0.hashCode();
        }
        return v1 * 0x1F + v;
    }

    @Override
    @NotNull
    public String toString() {
        return "AccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}

