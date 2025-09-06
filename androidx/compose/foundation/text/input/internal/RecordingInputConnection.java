package androidx.compose.foundation.text.input.internal;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextInCodePointsCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.FinishComposingTextCommand;
import androidx.compose.ui.text.input.SetComposingRegionCommand;
import androidx.compose.ui.text.input.SetComposingTextCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.TextFieldValueKt;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.b0;
import m0.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u00AE\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b \b\u0000\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\n\b\u0002\u0010\t\u001A\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000B\u001A\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001A\u0004\u0018\u00010\f\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u001D\u0010\u0014\u001A\u00020\u00132\u0006\u0010\u0010\u001A\u00020\u00022\u0006\u0010\u0012\u001A\u00020\u0011\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0016\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u000F\u0010\u0018\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b\u0018\u0010\u0017J\u000F\u0010\u0019\u001A\u00020\u0013H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u001AJ!\u0010\u001F\u001A\u00020\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b\u001F\u0010 J\u001F\u0010#\u001A\u00020\u00062\u0006\u0010!\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b#\u0010$J!\u0010%\u001A\u00020\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010\u001B2\u0006\u0010\u001E\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b%\u0010 J\u001F\u0010(\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u001D2\u0006\u0010\'\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b(\u0010$J\u001F\u0010)\u001A\u00020\u00062\u0006\u0010&\u001A\u00020\u001D2\u0006\u0010\'\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b)\u0010$J\u001F\u0010*\u001A\u00020\u00062\u0006\u0010!\u001A\u00020\u001D2\u0006\u0010\"\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b*\u0010$J\u000F\u0010+\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b+\u0010\u0017J\u0017\u0010.\u001A\u00020\u00062\u0006\u0010-\u001A\u00020,H\u0016\u00A2\u0006\u0004\b.\u0010/J\u001F\u00102\u001A\u00020\u001B2\u0006\u00100\u001A\u00020\u001D2\u0006\u00101\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b2\u00103J\u001F\u00104\u001A\u00020\u001B2\u0006\u00100\u001A\u00020\u001D2\u0006\u00101\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b4\u00103J\u0019\u00105\u001A\u0004\u0018\u00010\u001B2\u0006\u00101\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b5\u00106J\u0017\u00108\u001A\u00020\u00062\u0006\u00107\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b8\u00109J!\u0010=\u001A\u00020<2\b\u0010;\u001A\u0004\u0018\u00010:2\u0006\u00101\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b=\u0010>J\u0017\u0010@\u001A\u00020\u00062\u0006\u0010?\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b@\u00109J\u0017\u0010B\u001A\u00020\u00062\u0006\u0010A\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\bB\u00109J+\u0010I\u001A\u00020\u00132\u0006\u0010D\u001A\u00020C2\b\u0010F\u001A\u0004\u0018\u00010E2\b\u0010H\u001A\u0004\u0018\u00010GH\u0016\u00A2\u0006\u0004\bI\u0010JJ!\u0010N\u001A\u00020\u00062\u0006\u0010D\u001A\u00020K2\b\u0010M\u001A\u0004\u0018\u00010LH\u0016\u00A2\u0006\u0004\bN\u0010OJ\u0019\u0010Q\u001A\u00020\u00062\b\u0010\u001C\u001A\u0004\u0018\u00010PH\u0016\u00A2\u0006\u0004\bQ\u0010RJ\u0019\u0010U\u001A\u00020\u00062\b\u0010T\u001A\u0004\u0018\u00010SH\u0016\u00A2\u0006\u0004\bU\u0010VJ\u0011\u0010X\u001A\u0004\u0018\u00010WH\u0016\u00A2\u0006\u0004\bX\u0010YJ\u0017\u0010[\u001A\u00020\u00062\u0006\u0010Z\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b[\u00109J\u0017\u0010]\u001A\u00020\u00062\u0006\u0010\\\u001A\u00020\u0006H\u0016\u00A2\u0006\u0004\b]\u0010^J\u0017\u0010`\u001A\u00020\u001D2\u0006\u0010_\u001A\u00020\u001DH\u0016\u00A2\u0006\u0004\b`\u0010aJ#\u0010f\u001A\u00020\u00062\b\u0010c\u001A\u0004\u0018\u00010b2\b\u0010e\u001A\u0004\u0018\u00010dH\u0016\u00A2\u0006\u0004\bf\u0010gJ)\u0010k\u001A\u00020\u00062\u0006\u0010i\u001A\u00020h2\u0006\u00101\u001A\u00020\u001D2\b\u0010j\u001A\u0004\u0018\u00010dH\u0016\u00A2\u0006\u0004\bk\u0010lR\u0017\u0010\u0005\u001A\u00020\u00048\u0006\u00A2\u0006\f\n\u0004\bm\u0010n\u001A\u0004\bo\u0010pR\u0017\u0010\u0007\u001A\u00020\u00068\u0006\u00A2\u0006\f\n\u0004\bq\u0010r\u001A\u0004\bs\u0010\u0017R\u0019\u0010\t\u001A\u0004\u0018\u00010\b8\u0006\u00A2\u0006\f\n\u0004\bt\u0010u\u001A\u0004\bv\u0010wR\u0019\u0010\u000B\u001A\u0004\u0018\u00010\n8\u0006\u00A2\u0006\f\n\u0004\bx\u0010y\u001A\u0004\bz\u0010{R\u0019\u0010\r\u001A\u0004\u0018\u00010\f8\u0006\u00A2\u0006\f\n\u0004\b|\u0010}\u001A\u0004\b~\u0010\u007FR2\u0010\u0087\u0001\u001A\u00020\u00022\u0007\u0010\u0080\u0001\u001A\u00020\u00028\u0000@@X\u0080\u000E\u00A2\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001A\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001\u00A8\u0006\u0088\u0001"}, d2 = {"Landroidx/compose/foundation/text/input/internal/RecordingInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/ui/text/input/TextFieldValue;", "initState", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "eventCallback", "", "autoCorrect", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "legacyTextFieldState", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "textFieldSelectionManager", "Landroidx/compose/ui/platform/ViewConfiguration;", "viewConfiguration", "<init>", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputEventCallback2;ZLandroidx/compose/foundation/text/LegacyTextFieldState;Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;Landroidx/compose/ui/platform/ViewConfiguration;)V", "state", "Landroidx/compose/foundation/text/input/internal/InputMethodManager;", "inputMethodManager", "", "updateInputState", "(Landroidx/compose/ui/text/input/TextFieldValue;Landroidx/compose/foundation/text/input/internal/InputMethodManager;)V", "beginBatchEdit", "()Z", "endBatchEdit", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "reqModes", "getCursorCapsMode", "(I)I", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "a", "Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "getEventCallback", "()Landroidx/compose/foundation/text/input/internal/InputEventCallback2;", "b", "Z", "getAutoCorrect", "c", "Landroidx/compose/foundation/text/LegacyTextFieldState;", "getLegacyTextFieldState", "()Landroidx/compose/foundation/text/LegacyTextFieldState;", "d", "Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "getTextFieldSelectionManager", "()Landroidx/compose/foundation/text/selection/TextFieldSelectionManager;", "e", "Landroidx/compose/ui/platform/ViewConfiguration;", "getViewConfiguration", "()Landroidx/compose/ui/platform/ViewConfiguration;", "value", "g", "Landroidx/compose/ui/text/input/TextFieldValue;", "getTextFieldValue$foundation_release", "()Landroidx/compose/ui/text/input/TextFieldValue;", "setTextFieldValue$foundation_release", "(Landroidx/compose/ui/text/input/TextFieldValue;)V", "textFieldValue", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nRecordingInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n1#1,570:1\n109#1,5:571\n109#1,5:576\n109#1,5:581\n109#1,5:586\n109#1,5:591\n109#1,5:596\n109#1,5:601\n109#1,5:606\n109#1,5:611\n109#1,5:616\n109#1,5:621\n109#1,5:626\n109#1,5:631\n109#1,5:636\n109#1,5:641\n109#1,5:646\n109#1,5:651\n*S KotlinDebug\n*F\n+ 1 RecordingInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/RecordingInputConnection\n*L\n166#1:571,5\n201#1:576,5\n206#1:581,5\n212#1:586,5\n220#1:591,5\n231#1:596,5\n237#1:601,5\n243#1:606,5\n249#1:611,5\n284#1:616,5\n367#1:621,5\n393#1:626,5\n451#1:631,5\n461#1:636,5\n473#1:641,5\n493#1:646,5\n502#1:651,5\n*E\n"})
public final class RecordingInputConnection implements InputConnection {
    public static final int $stable = 8;
    public final InputEventCallback2 a;
    public final boolean b;
    public final LegacyTextFieldState c;
    public final TextFieldSelectionManager d;
    public final ViewConfiguration e;
    public int f;
    public TextFieldValue g;
    public int h;
    public boolean i;
    public final ArrayList j;
    public boolean k;

    public RecordingInputConnection(@NotNull TextFieldValue textFieldValue0, @NotNull InputEventCallback2 inputEventCallback20, boolean z, @Nullable LegacyTextFieldState legacyTextFieldState0, @Nullable TextFieldSelectionManager textFieldSelectionManager0, @Nullable ViewConfiguration viewConfiguration0) {
        this.a = inputEventCallback20;
        this.b = z;
        this.c = legacyTextFieldState0;
        this.d = textFieldSelectionManager0;
        this.e = viewConfiguration0;
        this.g = textFieldValue0;
        this.j = new ArrayList();
        this.k = true;
    }

    public RecordingInputConnection(TextFieldValue textFieldValue0, InputEventCallback2 inputEventCallback20, boolean z, LegacyTextFieldState legacyTextFieldState0, TextFieldSelectionManager textFieldSelectionManager0, ViewConfiguration viewConfiguration0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        this(textFieldValue0, inputEventCallback20, z, ((v & 8) == 0 ? legacyTextFieldState0 : null), ((v & 16) == 0 ? textFieldSelectionManager0 : null), ((v & 0x20) == 0 ? viewConfiguration0 : null));
    }

    public final void a(EditCommand editCommand0) {
        try {
            ++this.f;
            this.j.add(editCommand0);
        }
        finally {
            this.b();
        }
    }

    public final boolean b() {
        int v = this.f - 1;
        this.f = v;
        if(v == 0) {
            ArrayList arrayList0 = this.j;
            if(!arrayList0.isEmpty()) {
                List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList0);
                this.a.onEditCommands(list0);
                arrayList0.clear();
            }
        }
        return this.f > 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        if(this.k) {
            ++this.f;
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
        this.j.clear();
        this.f = 0;
        this.k = false;
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
        return this.k ? this.b : false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence0, int v) {
        boolean z = this.k;
        if(z) {
            this.a(new CommitTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int v, int v1) {
        if(this.k) {
            this.a(new DeleteSurroundingTextCommand(v, v1));
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        if(this.k) {
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
        if(this.k) {
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
        return TextUtils.getCapsMode(this.g.getText(), TextRange.getMin-impl(this.g.getSelection-d9O1mEE()), v);
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
        this.i = z;
        if(z) {
            if(extractedTextRequest0 != null) {
                v1 = extractedTextRequest0.token;
            }
            this.h = v1;
        }
        return RecordingInputConnection_androidKt.access$toExtractedText(this.g);
    }

    @Override  // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Nullable
    public final LegacyTextFieldState getLegacyTextFieldState() {
        return this.c;
    }

    @Override  // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int v) {
        return TextRange.getCollapsed-impl(this.g.getSelection-d9O1mEE()) ? null : TextFieldValueKt.getSelectedText(this.g).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int v, int v1) {
        return TextFieldValueKt.getTextAfterSelection(this.g, v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int v, int v1) {
        return TextFieldValueKt.getTextBeforeSelection(this.g, v).toString();
    }

    @Nullable
    public final TextFieldSelectionManager getTextFieldSelectionManager() {
        return this.d;
    }

    @NotNull
    public final TextFieldValue getTextFieldValue$foundation_release() {
        return this.g;
    }

    @Nullable
    public final ViewConfiguration getViewConfiguration() {
        return this.e;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int v) {
        if(this.k) {
            switch(v) {
                case 0x102001F: {
                    this.a(new SetSelectionCommand(0, this.g.getText().length()));
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
        if(this.k) {
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
    public void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture0, @Nullable Executor executor0, @Nullable IntConsumer intConsumer0) {
        if(Build.VERSION.SDK_INT >= 34) {
            b0 b00 = new b0(this, 0);
            l.a.a(this.c, this.d, handwritingGesture0, this.e, executor0, intConsumer0, b00);
        }
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String s, @Nullable Bundle bundle0) {
        return this.k;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @Nullable CancellationSignal cancellationSignal0) {
        return Build.VERSION.SDK_INT < 34 ? false : l.a.b(this.c, this.d, previewableHandwritingGesture0, cancellationSignal0);
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
        if(this.k) {
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
        if(this.k) {
            this.a.onKeyEvent(keyEvent0);
            return true;
        }
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int v, int v1) {
        boolean z = this.k;
        if(z) {
            this.a(new SetComposingRegionCommand(v, v1));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence0, int v) {
        boolean z = this.k;
        if(z) {
            this.a(new SetComposingTextCommand(String.valueOf(charSequence0), v));
        }
        return z;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setSelection(int v, int v1) {
        if(this.k) {
            this.a(new SetSelectionCommand(v, v1));
            return true;
        }
        return false;
    }

    public final void setTextFieldValue$foundation_release(@NotNull TextFieldValue textFieldValue0) {
        this.g = textFieldValue0;
    }

    public final void updateInputState(@NotNull TextFieldValue textFieldValue0, @NotNull InputMethodManager inputMethodManager0) {
        if(!this.k) {
            return;
        }
        this.setTextFieldValue$foundation_release(textFieldValue0);
        if(this.i) {
            inputMethodManager0.updateExtractedText(this.h, RecordingInputConnection_androidKt.access$toExtractedText(textFieldValue0));
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

