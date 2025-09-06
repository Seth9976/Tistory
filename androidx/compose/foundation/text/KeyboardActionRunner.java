package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.platform.SoftwareKeyboardController;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001A\u0010\r\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\f\u0010\nR\"\u0010\u000F\u001A\u00020\u000E8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0016\u001A\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019\"\u0004\b\u001A\u0010\u001B\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u001C"}, d2 = {"Landroidx/compose/foundation/text/KeyboardActionRunner;", "Landroidx/compose/foundation/text/KeyboardActionScope;", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/SoftwareKeyboardController;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "", "runAction-KlQnJC8", "(I)V", "runAction", "defaultKeyboardAction-KlQnJC8", "defaultKeyboardAction", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "getKeyboardActions", "()Landroidx/compose/foundation/text/KeyboardActions;", "setKeyboardActions", "(Landroidx/compose/foundation/text/KeyboardActions;)V", "Landroidx/compose/ui/focus/FocusManager;", "focusManager", "Landroidx/compose/ui/focus/FocusManager;", "getFocusManager", "()Landroidx/compose/ui/focus/FocusManager;", "setFocusManager", "(Landroidx/compose/ui/focus/FocusManager;)V", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class KeyboardActionRunner implements KeyboardActionScope {
    public static final int $stable = 8;
    public final SoftwareKeyboardController a;
    public FocusManager focusManager;
    public KeyboardActions keyboardActions;

    public KeyboardActionRunner(@Nullable SoftwareKeyboardController softwareKeyboardController0) {
        this.a = softwareKeyboardController0;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.compose.foundation.text.KeyboardActionScope
    public void defaultKeyboardAction-KlQnJC8(int v) {
        if(ImeAction.equals-impl0(v, 6)) {
            this.getFocusManager().moveFocus-3ESFkO8(1);
            return;
        }
        if(ImeAction.equals-impl0(v, 5)) {
            this.getFocusManager().moveFocus-3ESFkO8(2);
            return;
        }
        if(ImeAction.equals-impl0(v, 7)) {
            SoftwareKeyboardController softwareKeyboardController0 = this.a;
            if(softwareKeyboardController0 != null) {
                softwareKeyboardController0.hide();
            }
        }
    }

    @NotNull
    public final FocusManager getFocusManager() {
        FocusManager focusManager0 = this.focusManager;
        if(focusManager0 != null) {
            return focusManager0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("focusManager");
        return null;
    }

    @NotNull
    public final KeyboardActions getKeyboardActions() {
        KeyboardActions keyboardActions0 = this.keyboardActions;
        if(keyboardActions0 != null) {
            return keyboardActions0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("keyboardActions");
        return null;
    }

    public final void runAction-KlQnJC8(int v) {
        Function1 function10;
        Unit unit0 = null;
        if(ImeAction.equals-impl0(v, 7)) {
            function10 = this.getKeyboardActions().getOnDone();
        }
        else {
            if(ImeAction.equals-impl0(v, 2)) {
                function10 = this.getKeyboardActions().getOnGo();
                goto label_21;
            }
            if(ImeAction.equals-impl0(v, 6)) {
                function10 = this.getKeyboardActions().getOnNext();
                goto label_21;
            }
            if(ImeAction.equals-impl0(v, 5)) {
                function10 = this.getKeyboardActions().getOnPrevious();
                goto label_21;
            }
            if(ImeAction.equals-impl0(v, 3)) {
                function10 = this.getKeyboardActions().getOnSearch();
                goto label_21;
            }
            if(ImeAction.equals-impl0(v, 4)) {
                function10 = this.getKeyboardActions().getOnSend();
            }
            else if((ImeAction.equals-impl0(v, 1) ? true : ImeAction.equals-impl0(v, 0))) {
                function10 = null;
            }
            else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
    label_21:
        if(function10 != null) {
            function10.invoke(this);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            this.defaultKeyboardAction-KlQnJC8(v);
        }
    }

    public final void setFocusManager(@NotNull FocusManager focusManager0) {
        this.focusManager = focusManager0;
    }

    public final void setKeyboardActions(@NotNull KeyboardActions keyboardActions0) {
        this.keyboardActions = keyboardActions0;
    }
}

