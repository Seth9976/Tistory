package androidx.compose.ui.text.input;

import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.InternalTextApi;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Use PlatformTextInputModifierNode instead.")
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0017\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JM\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0007\u001A\u00020\u00062\u0006\u0010\t\u001A\u00020\b2\u0018\u0010\u000E\u001A\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000B\u0012\u0004\u0012\u00020\r0\n2\u0012\u0010\u0010\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\r0\nH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0012\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0014J\u0017\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0015\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0016\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0014J\u000F\u0010\u0018\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0018\u0010\u0014J\u000F\u0010\u0019\u001A\u00020\rH\u0007¢\u0006\u0004\b\u0019\u0010\u0014R\u0016\u0010\u001C\u001A\u0004\u0018\u00010\u00118@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/text/input/TextInputService;", "", "Landroidx/compose/ui/text/input/PlatformTextInputService;", "platformTextInputService", "<init>", "(Landroidx/compose/ui/text/input/PlatformTextInputService;)V", "Landroidx/compose/ui/text/input/TextFieldValue;", "value", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Lkotlin/Function1;", "", "Landroidx/compose/ui/text/input/EditCommand;", "", "onEditCommand", "Landroidx/compose/ui/text/input/ImeAction;", "onImeActionPerformed", "Landroidx/compose/ui/text/input/TextInputSession;", "startInput", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/ImeOptions;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/input/TextInputSession;", "()V", "session", "stopInput", "(Landroidx/compose/ui/text/input/TextInputSession;)V", "showSoftwareKeyboard", "hideSoftwareKeyboard", "getCurrentInputSession$ui_text_release", "()Landroidx/compose/ui/text/input/TextInputSession;", "currentInputSession", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public class TextInputService {
    public static final int $stable = 8;
    public final PlatformTextInputService a;
    public final AtomicReference b;

    public TextInputService(@NotNull PlatformTextInputService platformTextInputService0) {
        this.a = platformTextInputService0;
        this.b = new AtomicReference(null);
    }

    @Nullable
    public final TextInputSession getCurrentInputSession$ui_text_release() {
        return (TextInputSession)this.b.get();
    }

    @Deprecated(message = "Use SoftwareKeyboardController.hide or TextInputSession.hideSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.hideSoftwareKeyboard()", imports = {}))
    public final void hideSoftwareKeyboard() {
        this.a.hideSoftwareKeyboard();
    }

    @Deprecated(message = "Use SoftwareKeyboardController.show or TextInputSession.showSoftwareKeyboard instead.", replaceWith = @ReplaceWith(expression = "textInputSession.showSoftwareKeyboard()", imports = {}))
    public final void showSoftwareKeyboard() {
        if(this.getCurrentInputSession$ui_text_release() != null) {
            this.a.showSoftwareKeyboard();
        }
    }

    @NotNull
    public TextInputSession startInput(@NotNull TextFieldValue textFieldValue0, @NotNull ImeOptions imeOptions0, @NotNull Function1 function10, @NotNull Function1 function11) {
        this.a.startInput(textFieldValue0, imeOptions0, function10, function11);
        TextInputSession textInputSession0 = new TextInputSession(this, this.a);
        this.b.set(textInputSession0);
        return textInputSession0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @InternalTextApi
    public final void startInput() {
        this.a.startInput();
        TextInputSession textInputSession0 = new TextInputSession(this, this.a);
        this.b.set(textInputSession0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @InternalTextApi
    public final void stopInput() {
        this.a.stopInput();
    }

    public void stopInput(@NotNull TextInputSession textInputSession0) {
        AtomicReference atomicReference0 = this.b;
        do {
            if(atomicReference0.compareAndSet(textInputSession0, null)) {
                this.a.stopInput();
                return;
            }
        }
        while(atomicReference0.get() == textInputSession0);
    }
}

