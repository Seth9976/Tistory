package androidx.compose.foundation.text.input.internal;

import android.os.Build.VERSION;
import android.os.CancellationSignal;
import android.view.KeyEvent;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.content.TransferableContent;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeAction;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\n\u0018\u00002\u00020\u0001J(\u0010\u0007\u001A\u00020\u00042\u0017\u0010\u0006\u001A\u0013\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0002\b\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00042\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001A\u0010\u0011\u001A\u00020\u00042\u0006\u0010\u000E\u001A\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0013\u001A\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001A\u00020\u00042\u0006\u0010\u0018\u001A\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001C\u001A\u00020\u00172\u0006\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001C\u0010\u001DJ!\u0010!\u001A\u00020\u00142\u0006\u0010\u001B\u001A\u00020\u001E2\b\u0010 \u001A\u0004\u0018\u00010\u001FH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010&\u001A\u00020#8VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b$\u0010%\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\'"}, d2 = {"androidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "Lkotlin/Function1;", "Landroidx/compose/foundation/text/input/internal/EditingBuffer;", "", "Lkotlin/ExtensionFunctionType;", "block", "requestEdit", "(Lkotlin/jvm/functions/Function1;)V", "Landroid/view/KeyEvent;", "keyEvent", "sendKeyEvent", "(Landroid/view/KeyEvent;)V", "Landroidx/compose/ui/text/input/ImeAction;", "imeAction", "onImeAction-KlQnJC8", "(I)V", "onImeAction", "Landroidx/compose/foundation/content/TransferableContent;", "transferableContent", "", "onCommitContent", "(Landroidx/compose/foundation/content/TransferableContent;)Z", "", "cursorUpdateMode", "requestCursorUpdates", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;)I", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "getText", "()Landroidx/compose/foundation/text/input/TextFieldCharSequence;", "text", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1\n+ 2 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 3 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,211:1\n318#2,2:212\n323#2:229\n261#3,15:214\n*S KotlinDebug\n*F\n+ 1 AndroidTextInputSession.android.kt\nandroidx/compose/foundation/text/input/internal/AndroidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$1\n*L\n137#1:212,2\n137#1:229\n137#1:214,15\n*E\n"})
public final class AndroidTextInputSession_androidKt.platformSpecificTextInputSession.3.3.textInputSession.1 implements TextInputSession {
    public final TransformedTextFieldState a;
    public final ComposeInputMethodManager b;
    public final Function1 c;
    public final ReceiveContentConfiguration d;
    public final CursorAnchorInfoController e;
    public final TextLayoutState f;
    public final ViewConfiguration g;

    public AndroidTextInputSession_androidKt.platformSpecificTextInputSession.3.3.textInputSession.1(TransformedTextFieldState transformedTextFieldState0, ComposeInputMethodManager composeInputMethodManager0, Function1 function10, ReceiveContentConfiguration receiveContentConfiguration0, CursorAnchorInfoController cursorAnchorInfoController0, TextLayoutState textLayoutState0, ViewConfiguration viewConfiguration0) {
        this.a = transformedTextFieldState0;
        this.b = composeInputMethodManager0;
        this.c = function10;
        this.d = receiveContentConfiguration0;
        this.e = cursorAnchorInfoController0;
        this.f = textLayoutState0;
        this.g = viewConfiguration0;
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    @NotNull
    public TextFieldCharSequence getText() {
        return this.a.getVisualText();
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean onCommitContent(@NotNull TransferableContent transferableContent0) {
        return this.d == null ? false : this.d.onCommitContent(transferableContent0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public void onImeAction-KlQnJC8(int v) {
        Function1 function10 = this.c;
        if(function10 != null) {
            function10.invoke(ImeAction.box-impl(v));
        }
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public int performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture0) {
        return Build.VERSION.SDK_INT < 34 ? 2 : HandwritingGestureApi34.INSTANCE.performHandwritingGesture$foundation_release(this.a, handwritingGesture0, this.f, this.g);
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @Nullable CancellationSignal cancellationSignal0) {
        return Build.VERSION.SDK_INT < 34 ? false : HandwritingGestureApi34.INSTANCE.previewHandwritingGesture$foundation_release(this.a, previewableHandwritingGesture0, this.f, cancellationSignal0);
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public void requestCursorUpdates(int v) {
        this.e.requestUpdates(v);
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public void requestEdit(@NotNull Function1 function10) {
        TextFieldState textFieldState0 = this.a.a;
        textFieldState0.getMainBuffer$foundation_release().getChangeTracker().clearChanges();
        function10.invoke(textFieldState0.getMainBuffer$foundation_release());
        TextFieldState.access$commitEditAsUser(textFieldState0, this.a.b, false, TextFieldEditUndoBehavior.MergeIfPossible);
    }

    @Override  // androidx.compose.foundation.text.input.internal.TextInputSession
    public void sendKeyEvent(@NotNull KeyEvent keyEvent0) {
        this.b.sendKeyEvent(keyEvent0);
    }
}

