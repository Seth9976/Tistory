package androidx.compose.ui.text.input;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B\u001F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\b\u0010\tJ\u001D\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\u00022\u0006\u0010\f\u001A\u00020\u000B\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0010\u0010\u0011J\u000F\u0010\u0012\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0012\u0010\u0011J\u000F\u0010\u0013\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001A\u00020\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ\u001F\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u001EJ!\u0010\u001F\u001A\u00020\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\u001F\u0010\u001AJ\u001F\u0010\"\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u00172\u0006\u0010!\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b\"\u0010\u001EJ\u001F\u0010#\u001A\u00020\u00062\u0006\u0010 \u001A\u00020\u00172\u0006\u0010!\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b#\u0010\u001EJ\u001F\u0010$\u001A\u00020\u00062\u0006\u0010\u001B\u001A\u00020\u00172\u0006\u0010\u001C\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b$\u0010\u001EJ\u000F\u0010%\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b%\u0010\u0011J\u0017\u0010(\u001A\u00020\u00062\u0006\u0010\'\u001A\u00020&H\u0016\u00A2\u0006\u0004\b(\u0010)J\u001F\u0010,\u001A\u00020\u00152\u0006\u0010*\u001A\u00020\u00172\u0006\u0010+\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b,\u0010-J\u001F\u0010.\u001A\u00020\u00152\u0006\u0010*\u001A\u00020\u00172\u0006\u0010+\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b.\u0010-J\u0019\u0010/\u001A\u0004\u0018\u00010\u00152\u0006\u0010+\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b/\u00100J\u0017\u00102\u001A\u00020\u00062\u0006\u00101\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b2\u00103J!\u00107\u001A\u0002062\b\u00105\u001A\u0004\u0018\u0001042\u0006\u0010+\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b7\u00108J\u0017\u0010:\u001A\u00020\u00062\u0006\u00109\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b:\u00103J\u0017\u0010<\u001A\u00020\u00062\u0006\u0010;\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\b<\u00103J\u0019\u0010>\u001A\u00020\u00062\b\u0010\u0016\u001A\u0004\u0018\u00010=H\u0016\u00A2\u0006\u0004\b>\u0010?J\u0019\u0010B\u001A\u00020\u00062\b\u0010A\u001A\u0004\u0018\u00010@H\u0016\u00A2\u0006\u0004\bB\u0010CJ\u0011\u0010E\u001A\u0004\u0018\u00010DH\u0016\u00A2\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001A\u00020\u00062\u0006\u0010G\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bH\u00103J\u0017\u0010J\u001A\u00020\u00062\u0006\u0010I\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\bJ\u0010KJ\u0017\u0010M\u001A\u00020\u00172\u0006\u0010L\u001A\u00020\u0017H\u0016\u00A2\u0006\u0004\bM\u0010NJ#\u0010S\u001A\u00020\u00062\b\u0010P\u001A\u0004\u0018\u00010O2\b\u0010R\u001A\u0004\u0018\u00010QH\u0016\u00A2\u0006\u0004\bS\u0010TJ)\u0010X\u001A\u00020\u00062\u0006\u0010V\u001A\u00020U2\u0006\u0010+\u001A\u00020\u00172\b\u0010W\u001A\u0004\u0018\u00010QH\u0016\u00A2\u0006\u0004\bX\u0010YR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]R\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\b^\u0010_\u001A\u0004\b`\u0010\u0011R*\u0010h\u001A\u00020\u00022\u0006\u0010a\u001A\u00020\u00028\u0000@@X\u0080\u000E\u00A2\u0006\u0012\n\u0004\bb\u0010c\u001A\u0004\bd\u0010e\"\u0004\bf\u0010g\u00A8\u0006i"}, d2 = {"Landroidx/compose/ui/text/input/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/ui/text/input/InputEventCallback2;", "eventCallback", "", "autoCorrect", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputEventCallback2;Z)V", "state", "Landroidx/compose/ui/text/input/InputMethodManager;", "inputMethodManager", "", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/ui/text/input/InputMethodManager;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Landroidx/compose/ui/text/input/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/ui/text/input/InputEventCallback2;", "b", "Z", "getAutoCorrect", "value", "d", "Landroidx/compose/ui/text/input/TextFieldValue;", "getMTextFieldValue$ui_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setMTextFieldValue$ui_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "mTextFieldValue", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n1#1,459:1\n86#1,5:460\n86#1,5:465\n86#1,5:470\n86#1,5:475\n86#1,5:480\n86#1,5:485\n86#1,5:490\n86#1,5:495\n86#1,5:500\n86#1,5:505\n86#1,5:510\n86#1,5:515\n86#1,5:520\n86#1,5:525\n86#1,5:530\n86#1,5:535\n86#1,5:540\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/ui/text/input/RecordingInputConnection\n*L\n146#1:460,5\n182#1:465,5\n187#1:470,5\n193#1:475,5\n201#1:480,5\n212#1:485,5\n218#1:490,5\n224#1:495,5\n230#1:500,5\n266#1:505,5\n350#1:510,5\n376#1:515,5\n399#1:520,5\n409#1:525,5\n421#1:530,5\n441#1:535,5\n450#1:540,5\n*E\n"})
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    public final InputEventCallback2 a;
    public final boolean b;
    public int c;
    public TextFieldValue d;
    public int e;
    public boolean f;
    public final ArrayList g;
    public boolean h;

    public RecordingInputConnection(@NotNull TextFieldValue textFieldValue0, @NotNull InputEventCallback2 inputEventCallback20, boolean z) {
        this.a = inputEventCallback20;
        this.b = z;
        this.d = textFieldValue0;
        this.g = new ArrayList();
        this.h = true;
    }

    public final void a(EditCommand editCommand0) {
        try {
            ++this.c;
            this.g.add(editCommand0);
        }
        finally {
            this.b();
        }
    }

    public final boolean b() {
        int v = this.c - 1;
        this.c = v;
        if(v == 0) {
            ArrayList arrayList0 = this.g;
            if(!arrayList0.isEmpty()) {
                List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
                this.a.onEditCommands(list0);
                arrayList0.clear();
            }
        }
        return this.c > 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        if(this.h) {
            ++this.c;
            return true;
        }
        return false;
    }

    public final void c(int v) {
        this.sendKeyEvent(new KeyEvent(0, v));
        this.sendKeyEvent(new KeyEvent(1, v));
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int v) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.g.clear();
        this.c = 0;
        this.h = false;
        this.a.onConnectionClosed(this);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo0) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo0, int v, @Nullable Bundle bundle0) {
        return false;
    }

    // 去混淆评级： 低(20)
    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo0) {
        return this.h ? this.b : false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence0, int v) {
        boolean z = this.h;
        if(z) {
            this.a(new CommitTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int v, int v1) {
        if(this.h) {
            this.a(new DeleteSurroundingTextCommand(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        if(this.h) {
            this.a(new DeleteSurroundingTextInCodePointsCommand(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return this.b();
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        if(this.h) {
            this.a(new FinishComposingTextCommand());
            return true;
        }
        return false;
    }

    public final boolean getAutoCorrect() {
        return this.b;
    }

    @Override  // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int v) {
        return TextUtils.getCapsMode(this.d.getText(), TextRange.getMin-impl(this.d.getSelection-d9O1mEE()), v);
    }

    @NotNull
    public final InputEventCallback2 getEventCallback() {
        return this.a;
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest0, int v) {
        boolean z = true;
        int v1 = 0;
        if((v & 1) == 0) {
            z = false;
        }
        this.f = z;
        if(z) {
            if(extractedTextRequest0 != null) {
                v1 = extractedTextRequest0.token;
            }
            this.e = v1;
        }
        return InputState_androidKt.toExtractedText(this.d);
    }

    @Override  // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @NotNull
    public final TextFieldValue getMTextFieldValue$ui_release() {
        return this.d;
    }

    @Override  // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int v) {
        return TextRange.getCollapsed-impl(this.d.getSelection-d9O1mEE()) ? null : TextFieldValueKt.getSelectedText(this.d).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int v, int v1) {
        return TextFieldValueKt.getTextAfterSelection(this.d, v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int v, int v1) {
        return TextFieldValueKt.getTextBeforeSelection(this.d, v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int v) {
        if(this.h) {
            switch(v) {
                case 0x102001F: {
                    this.a(new SetSelectionCommand(0, this.d.getText().length()));
                    break;
                }
                case 0x1020020: {
                    this.c(277);
                    return false;
                }
                case 0x1020021: {
                    this.c(278);
                    return false;
                }
                case 0x1020022: {
                    this.c(279);
                    return false;
                }
                default: {
                    return false;
                }
            }
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int v) {
        int v1;
        if(this.h) {
            if(v == 0) {
                v1 = 1;
            }
            else {
                switch(v) {
                    case 2: {
                        v1 = 2;
                        break;
                    }
                    case 3: {
                        v1 = 3;
                        break;
                    }
                    case 4: {
                        v1 = 4;
                        break;
                    }
                    case 5: {
                        v1 = 6;
                        break;
                    }
                    case 6: {
                        v1 = 7;
                        break;
                    }
                    case 7: {
                        v1 = 5;
                        break;
                    }
                    default: {
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + v);
                        v1 = 1;
                    }
                }
            }
            this.a.onImeAction-KlQnJC8(v1);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String s, @Nullable Bundle bundle0) {
        return this.h;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int v) {
        boolean z7;
        boolean z6;
        boolean z5;
        boolean z4;
        boolean z = false;
        if(this.h) {
            int v1 = Build.VERSION.SDK_INT;
            if(v1 >= 33) {
                boolean z1 = (v & 16) != 0;
                boolean z2 = (v & 8) != 0;
                boolean z3 = (v & 4) != 0;
                if(v1 >= 34 && (v & 0x20) != 0) {
                    z = true;
                }
                if(z1 || z2 || z3 || z) {
                    z7 = z;
                    z6 = z3;
                    z5 = z2;
                    z4 = z1;
                }
                else {
                    z4 = true;
                    z5 = true;
                    if(v1 >= 34) {
                        z6 = true;
                        z7 = true;
                    }
                    else {
                        z6 = true;
                        z7 = false;
                    }
                }
            }
            else {
                z4 = true;
                z5 = true;
                z6 = false;
                z7 = false;
            }
            this.a.onRequestCursorAnchorInfo((v & 1) != 0, (v & 2) != 0, z4, z5, z6, z7);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent0) {
        if(this.h) {
            this.a.onKeyEvent(keyEvent0);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int v, int v1) {
        boolean z = this.h;
        if(z) {
            this.a(new SetComposingRegionCommand(v, v1));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence0, int v) {
        boolean z = this.h;
        if(z) {
            this.a(new SetComposingTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    public final void setMTextFieldValue$ui_release(@NotNull TextFieldValue textFieldValue0) {
        this.d = textFieldValue0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setSelection(int v, int v1) {
        if(this.h) {
            this.a(new SetSelectionCommand(v, v1));
            return true;
        }
        return false;
    }

    public final void updateInputState(@NotNull TextFieldValue textFieldValue0, @NotNull InputMethodManager inputMethodManager0) {
        if(!this.h) {
            return;
        }
        this.setMTextFieldValue$ui_release(textFieldValue0);
        if(this.f) {
            inputMethodManager0.updateExtractedText(this.e, InputState_androidKt.toExtractedText(textFieldValue0));
        }
        TextRange textRange0 = textFieldValue0.getComposition-MzsxiRA();
        int v = -1;
        int v1 = textRange0 == null ? -1 : TextRange.getMin-impl(textRange0.unbox-impl());
        TextRange textRange1 = textFieldValue0.getComposition-MzsxiRA();
        if(textRange1 != null) {
            v = TextRange.getMax-impl(textRange1.unbox-impl());
        }
        inputMethodManager0.updateSelection(TextRange.getMin-impl(textFieldValue0.getSelection-d9O1mEE()), TextRange.getMax-impl(textFieldValue0.getSelection-d9O1mEE()), v1, v);
    }
}

