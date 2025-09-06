package androidx.compose.ui.semantics;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u001A\u0010\n\u001A\u00020\u00052\b\u0010\t\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000BJ\u000F\u0010\r\u001A\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000EJ\u000F\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u000F\u0010\u0010R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001A\u0004\b\u0013\u0010\u0010R\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/semantics/CustomAccessibilityAction;", "", "", "label", "Lkotlin/Function0;", "", "action", "<init>", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "getLabel", "b", "Lkotlin/jvm/functions/Function0;", "getAction", "()Lkotlin/jvm/functions/Function0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class CustomAccessibilityAction {
    public static final int $stable;
    public final String a;
    public final Function0 b;

    public CustomAccessibilityAction(@NotNull String s, @NotNull Function0 function00) {
        this.a = s;
        this.b = function00;
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof CustomAccessibilityAction)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((CustomAccessibilityAction)object0).a) ? this.b == ((CustomAccessibilityAction)object0).b : false;
    }

    @NotNull
    public final Function0 getAction() {
        return this.b;
    }

    @NotNull
    public final String getLabel() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.b.hashCode() + this.a.hashCode() * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        return "CustomAccessibilityAction(label=" + this.a + ", action=" + this.b + ')';
    }
}

