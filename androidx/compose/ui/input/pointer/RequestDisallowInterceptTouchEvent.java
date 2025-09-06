package androidx.compose.ui.input.pointer;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ExperimentalComposeUiApi;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@ExperimentalComposeUiApi
@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0007\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0010\u001A\u0004\u0018\u00010\t8\u0000@\u0000X\u0080\u000E¢\u0006\u0012\n\u0004\b\n\u0010\u000B\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/input/pointer/RequestDisallowInterceptTouchEvent;", "Lkotlin/Function1;", "", "", "<init>", "()V", "disallowIntercept", "invoke", "(Z)V", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "a", "Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "getPointerInteropFilter$ui_release", "()Landroidx/compose/ui/input/pointer/PointerInteropFilter;", "setPointerInteropFilter$ui_release", "(Landroidx/compose/ui/input/pointer/PointerInteropFilter;)V", "pointerInteropFilter", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class RequestDisallowInterceptTouchEvent implements Function1 {
    public static final int $stable = 8;
    public PointerInteropFilter a;

    @Nullable
    public final PointerInteropFilter getPointerInteropFilter$ui_release() {
        return this.a;
    }

    @Override  // kotlin.jvm.functions.Function1
    public Object invoke(Object object0) {
        this.invoke(((Boolean)object0).booleanValue());
        return Unit.INSTANCE;
    }

    public void invoke(boolean z) {
        PointerInteropFilter pointerInteropFilter0 = this.a;
        if(pointerInteropFilter0 != null) {
            pointerInteropFilter0.setDisallowIntercept$ui_release(z);
        }
    }

    public final void setPointerInteropFilter$ui_release(@Nullable PointerInteropFilter pointerInteropFilter0) {
        this.a = pointerInteropFilter0;
    }
}

