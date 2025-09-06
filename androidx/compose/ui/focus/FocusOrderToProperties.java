package androidx.compose.ui.focus;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B \u0012\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fR(\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/focus/FocusOrderToProperties;", "Landroidx/compose/ui/focus/FocusPropertiesScope;", "Lkotlin/Function1;", "Landroidx/compose/ui/focus/FocusOrder;", "", "Lkotlin/ExtensionFunctionType;", "focusOrderReceiver", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/focus/FocusProperties;", "focusProperties", "apply", "(Landroidx/compose/ui/focus/FocusProperties;)V", "a", "Lkotlin/jvm/functions/Function1;", "getFocusOrderReceiver", "()Lkotlin/jvm/functions/Function1;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FocusOrderToProperties implements FocusPropertiesScope {
    public static final int $stable;
    public final Function1 a;

    public FocusOrderToProperties(@NotNull Function1 function10) {
        this.a = function10;
    }

    @Override  // androidx.compose.ui.focus.FocusPropertiesScope
    public void apply(@NotNull FocusProperties focusProperties0) {
        FocusOrder focusOrder0 = new FocusOrder(focusProperties0);
        this.a.invoke(focusOrder0);
    }

    @NotNull
    public final Function1 getFocusOrderReceiver() {
        return this.a;
    }
}

