package m0;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.compose.foundation.content.internal.ReceiveContentConfiguration;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt.platformSpecificTextInputSession.3.3.textInputSession.1;
import androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt;
import androidx.compose.foundation.text.input.internal.ComposeInputMethodManager;
import androidx.compose.foundation.text.input.internal.CursorAnchorInfoController;
import androidx.compose.foundation.text.input.internal.EditorInfo_androidKt;
import androidx.compose.foundation.text.input.internal.StatelessInputConnection;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.ui.platform.PlatformTextInputMethodRequest;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.input.ImeOptions;
import j2.j;
import kotlin.jvm.functions.Function1;

public final class e implements PlatformTextInputMethodRequest {
    public final TransformedTextFieldState a;
    public final ImeOptions b;
    public final ReceiveContentConfiguration c;
    public final ComposeInputMethodManager d;
    public final Function1 e;
    public final CursorAnchorInfoController f;
    public final TextLayoutState g;
    public final ViewConfiguration h;

    public e(TransformedTextFieldState transformedTextFieldState0, ImeOptions imeOptions0, ReceiveContentConfiguration receiveContentConfiguration0, ComposeInputMethodManager composeInputMethodManager0, Function1 function10, CursorAnchorInfoController cursorAnchorInfoController0, TextLayoutState textLayoutState0, ViewConfiguration viewConfiguration0) {
        this.a = transformedTextFieldState0;
        this.b = imeOptions0;
        this.c = receiveContentConfiguration0;
        this.d = composeInputMethodManager0;
        this.e = function10;
        this.f = cursorAnchorInfoController0;
        this.g = textLayoutState0;
        this.h = viewConfiguration0;
    }

    @Override  // androidx.compose.ui.platform.PlatformTextInputMethodRequest
    public final InputConnection createInputConnection(EditorInfo editorInfo0) {
        new j(this.a, 20);
        AndroidTextInputSession_androidKt.platformSpecificTextInputSession.3.3.textInputSession.1 androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$10 = new AndroidTextInputSession_androidKt.platformSpecificTextInputSession.3.3.textInputSession.1(this.a, this.d, this.e, this.c, this.f, this.g, this.h);
        EditorInfo_androidKt.update-pLxbY9I(editorInfo0, this.a.getVisualText(), this.a.getVisualText().getSelection-d9O1mEE(), this.b, (this.c == null ? null : AndroidTextInputSession_androidKt.a));
        return new StatelessInputConnection(androidTextInputSession_androidKt$platformSpecificTextInputSession$3$3$textInputSession$10, editorInfo0);
    }
}

