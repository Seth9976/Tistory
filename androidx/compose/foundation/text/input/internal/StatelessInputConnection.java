package androidx.compose.foundation.text.input.internal;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.input.TextFieldCharSequenceKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener;
import androidx.core.view.inputmethod.InputConnectionCompat;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import m0.a;
import m0.c0;
import m0.d0;
import m0.e0;
import m0.j;
import m0.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u00A2\u0006\u0004\b\u0006\u0010\u0007J\u000F\u0010\t\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u000B\u0010\nJ\u000F\u0010\r\u001A\u00020\fH\u0016\u00A2\u0006\u0004\b\r\u0010\u000EJ!\u0010\u0013\u001A\u00020\b2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u0019\u001A\u00020\b2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u0019\u0010\u0014J\u001F\u0010\u001C\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u0018J\u001F\u0010\u001D\u001A\u00020\b2\u0006\u0010\u001A\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u001D\u0010\u0018J\u001F\u0010\u001E\u001A\u00020\b2\u0006\u0010\u0015\u001A\u00020\u00112\u0006\u0010\u0016\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b\u001E\u0010\u0018J\u000F\u0010\u001F\u001A\u00020\bH\u0016\u00A2\u0006\u0004\b\u001F\u0010\nJ\u0017\u0010\"\u001A\u00020\b2\u0006\u0010!\u001A\u00020 H\u0016\u00A2\u0006\u0004\b\"\u0010#J\u001F\u0010&\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020\u00112\u0006\u0010%\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b&\u0010\'J\u001F\u0010(\u001A\u00020\u000F2\u0006\u0010$\u001A\u00020\u00112\u0006\u0010%\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b(\u0010\'J\u0019\u0010)\u001A\u0004\u0018\u00010\u000F2\u0006\u0010%\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010,\u001A\u00020\b2\u0006\u0010+\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b,\u0010-J+\u00104\u001A\u00020\f2\u0006\u0010/\u001A\u00020.2\b\u00101\u001A\u0004\u0018\u0001002\b\u00103\u001A\u0004\u0018\u000102H\u0016\u00A2\u0006\u0004\b4\u00105J!\u00109\u001A\u00020\b2\u0006\u0010/\u001A\u0002062\b\u00108\u001A\u0004\u0018\u000107H\u0016\u00A2\u0006\u0004\b9\u0010:J!\u0010>\u001A\u00020=2\b\u0010<\u001A\u0004\u0018\u00010;2\u0006\u0010%\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\b>\u0010?J\u0017\u0010A\u001A\u00020\u00112\u0006\u0010@\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bA\u0010BJ\u0017\u0010D\u001A\u00020\b2\u0006\u0010C\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bD\u0010-J\u0017\u0010F\u001A\u00020\b2\u0006\u0010E\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bF\u0010-J\u0019\u0010H\u001A\u00020\b2\b\u0010\u0010\u001A\u0004\u0018\u00010GH\u0016\u00A2\u0006\u0004\bH\u0010IJ\u0019\u0010L\u001A\u00020\b2\b\u0010K\u001A\u0004\u0018\u00010JH\u0016\u00A2\u0006\u0004\bL\u0010MJ\u0011\u0010O\u001A\u0004\u0018\u00010NH\u0016\u00A2\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001A\u00020\b2\u0006\u0010Q\u001A\u00020\u0011H\u0016\u00A2\u0006\u0004\bR\u0010-J\u0017\u0010T\u001A\u00020\b2\u0006\u0010S\u001A\u00020\bH\u0016\u00A2\u0006\u0004\bT\u0010UJ#\u0010Z\u001A\u00020\b2\b\u0010W\u001A\u0004\u0018\u00010V2\b\u0010Y\u001A\u0004\u0018\u00010XH\u0016\u00A2\u0006\u0004\bZ\u0010[J)\u0010_\u001A\u00020\b2\u0006\u0010]\u001A\u00020\\2\u0006\u0010%\u001A\u00020\u00112\b\u0010^\u001A\u0004\u0018\u00010XH\u0016\u00A2\u0006\u0004\b_\u0010`\u00A8\u0006a"}, d2 = {"Landroidx/compose/foundation/text/input/internal/StatelessInputConnection;", "Landroid/view/inputmethod/InputConnection;", "Landroidx/compose/foundation/text/input/internal/TextInputSession;", "session", "Landroid/view/inputmethod/EditorInfo;", "editorInfo", "<init>", "(Landroidx/compose/foundation/text/input/internal/TextInputSession;Landroid/view/inputmethod/EditorInfo;)V", "", "beginBatchEdit", "()Z", "endBatchEdit", "", "closeConnection", "()V", "", "text", "", "newCursorPosition", "commitText", "(Ljava/lang/CharSequence;I)Z", "start", "end", "setComposingRegion", "(II)Z", "setComposingText", "beforeLength", "afterLength", "deleteSurroundingTextInCodePoints", "deleteSurroundingText", "setSelection", "finishComposingText", "Landroid/view/KeyEvent;", "event", "sendKeyEvent", "(Landroid/view/KeyEvent;)Z", "maxChars", "flags", "getTextBeforeCursor", "(II)Ljava/lang/CharSequence;", "getTextAfterCursor", "getSelectedText", "(I)Ljava/lang/CharSequence;", "cursorUpdateMode", "requestCursorUpdates", "(I)Z", "Landroid/view/inputmethod/HandwritingGesture;", "gesture", "Ljava/util/concurrent/Executor;", "executor", "Ljava/util/function/IntConsumer;", "consumer", "performHandwritingGesture", "(Landroid/view/inputmethod/HandwritingGesture;Ljava/util/concurrent/Executor;Ljava/util/function/IntConsumer;)V", "Landroid/view/inputmethod/PreviewableHandwritingGesture;", "Landroid/os/CancellationSignal;", "cancellationSignal", "previewHandwritingGesture", "(Landroid/view/inputmethod/PreviewableHandwritingGesture;Landroid/os/CancellationSignal;)Z", "Landroid/view/inputmethod/ExtractedTextRequest;", "request", "Landroid/view/inputmethod/ExtractedText;", "getExtractedText", "(Landroid/view/inputmethod/ExtractedTextRequest;I)Landroid/view/inputmethod/ExtractedText;", "reqModes", "getCursorCapsMode", "(I)I", "id", "performContextMenuAction", "editorAction", "performEditorAction", "Landroid/view/inputmethod/CompletionInfo;", "commitCompletion", "(Landroid/view/inputmethod/CompletionInfo;)Z", "Landroid/view/inputmethod/CorrectionInfo;", "correctionInfo", "commitCorrection", "(Landroid/view/inputmethod/CorrectionInfo;)Z", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "states", "clearMetaKeyStates", "enabled", "reportFullscreenMode", "(Z)Z", "", "action", "Landroid/os/Bundle;", "data", "performPrivateCommand", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "Landroid/view/inputmethod/InputContentInfo;", "inputContentInfo", "opts", "commitContent", "(Landroid/view/inputmethod/InputContentInfo;ILandroid/os/Bundle;)Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nStatelessInputConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n*L\n1#1,583:1\n1208#2:584\n1187#2,2:585\n*S KotlinDebug\n*F\n+ 1 StatelessInputConnection.android.kt\nandroidx/compose/foundation/text/input/internal/StatelessInputConnection\n*L\n100#1:584\n100#1:585,2\n*E\n"})
public final class StatelessInputConnection implements InputConnection {
    public static final int $stable = 8;
    public final TextInputSession a;
    public int b;
    public final MutableVector c;
    public final InputConnection d;

    public StatelessInputConnection(@NotNull TextInputSession textInputSession0, @NotNull EditorInfo editorInfo0) {
        this.a = textInputSession0;
        this.c = new MutableVector(new Function1[16], 0);
        this.d = InputConnectionCompat.createWrapper(new InputConnectionWrapper(false) {  // 初始化器: Landroid/view/inputmethod/InputConnectionWrapper;-><init>(Landroid/view/inputmethod/InputConnection;Z)V
            @Override  // android.view.inputmethod.InputConnectionWrapper
            public boolean commitContent(@NotNull InputContentInfo inputContentInfo0, int v, @Nullable Bundle bundle0) {
                return false;
            }

            @Override  // android.view.inputmethod.InputConnectionWrapper
            public boolean performPrivateCommand(@Nullable String s, @Nullable Bundle bundle0) {
                return true;
            }
        }, editorInfo0, new OnCommitContentListener() {
            public final StatelessInputConnection a;

            {
                this.a = statelessInputConnection0;
            }

            @Override  // androidx.core.view.inputmethod.InputConnectionCompat$OnCommitContentListener
            public boolean onCommitContent(@NotNull InputContentInfoCompat inputContentInfoCompat0, int v, @Nullable Bundle bundle0) {
                StatelessInputConnection statelessInputConnection0 = this.a;
                if((v & 1) != 0) {
                    try {
                        inputContentInfoCompat0.requestPermission();
                    }
                    catch(Exception exception0) {
                        StatelessInputConnection.access$logDebug(statelessInputConnection0, "Can\'t insert content from IME; requestPermission() failed, " + exception0);
                        return false;
                    }
                    Object object0 = inputContentInfoCompat0.unwrap();
                    Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.os.Parcelable");
                    bundle0 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
                    bundle0.putParcelable("EXTRA_INPUT_CONTENT_INFO", ((Parcelable)object0));
                    return StatelessInputConnection.access$getSession$p(statelessInputConnection0).onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(inputContentInfoCompat0, bundle0));
                }
                return StatelessInputConnection.access$getSession$p(statelessInputConnection0).onCommitContent(StatelessInputConnection_androidKt.toTransferableContent(inputContentInfoCompat0, bundle0));
            }
        });
    }

    public final void a(Function1 function10) {
        try {
            ++this.b;
            this.c.add(function10);
        }
        finally {
            this.b();
        }
    }

    public static final TextInputSession access$getSession$p(StatelessInputConnection statelessInputConnection0) {
        return statelessInputConnection0.a;
    }

    public static final TextFieldCharSequence access$getText(StatelessInputConnection statelessInputConnection0) {
        return statelessInputConnection0.a.getText();
    }

    public static final void access$logDebug(StatelessInputConnection statelessInputConnection0, String s) {
        statelessInputConnection0.getClass();
    }

    public final boolean b() {
        int v = this.b - 1;
        this.b = v;
        if(v == 0) {
            MutableVector mutableVector0 = this.c;
            if(mutableVector0.isNotEmpty()) {
                e0 e00 = new e0(this, 0);
                this.a.requestEdit(e00);
                mutableVector0.clear();
            }
        }
        return this.b > 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        ++this.b;
        return true;
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
        this.c.clear();
        this.b = 0;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCompletion(@Nullable CompletionInfo completionInfo0) {
        Objects.toString((completionInfo0 == null ? null : completionInfo0.getText()));
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitContent(@NotNull InputContentInfo inputContentInfo0, int v, @Nullable Bundle bundle0) {
        Objects.toString(inputContentInfo0);
        Objects.toString(bundle0);
        return j.a.a(this.d, inputContentInfo0, v, bundle0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitCorrection(@Nullable CorrectionInfo correctionInfo0) {
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean commitText(@Nullable CharSequence charSequence0, int v) {
        Objects.toString(charSequence0);
        this.a(new c0(charSequence0, v, 0));
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int v, int v1) {
        this.a(new d0(v, v1, 0));
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int v, int v1) {
        this.a(new d0(v, v1, 1));
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return this.b();
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        this.a(a.C);
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int v) {
        return TextUtils.getCapsMode(this.a.getText(), TextRange.getMin-impl(this.a.getText().getSelection-d9O1mEE()), v);
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public ExtractedText getExtractedText(@Nullable ExtractedTextRequest extractedTextRequest0, int v) {
        Objects.toString(extractedTextRequest0);
        return StatelessInputConnection_androidKt.access$toExtractedText(this.a.getText());
    }

    @Override  // android.view.inputmethod.InputConnection
    @Nullable
    public Handler getHandler() {
        return null;
    }

    @Override  // android.view.inputmethod.InputConnection
    @Nullable
    public CharSequence getSelectedText(int v) {
        TextInputSession textInputSession0 = this.a;
        return TextRange.getCollapsed-impl(textInputSession0.getText().getSelection-d9O1mEE()) ? null : TextFieldCharSequenceKt.getSelectedText(textInputSession0.getText()).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextAfterCursor(int v, int v1) {
        return TextFieldCharSequenceKt.getTextAfterSelection(this.a.getText(), v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    @NotNull
    public CharSequence getTextBeforeCursor(int v, int v1) {
        return TextFieldCharSequenceKt.getTextBeforeSelection(this.a.getText(), v).toString();
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int v) {
        switch(v) {
            case 0x102001F: {
                this.a(new e0(this, 1));
                return false;
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

    @Override  // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int v) {
        int v1;
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
                    v1 = 1;
                }
            }
        }
        this.a.onImeAction-KlQnJC8(v1);
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public void performHandwritingGesture(@NotNull HandwritingGesture handwritingGesture0, @Nullable Executor executor0, @Nullable IntConsumer intConsumer0) {
        Objects.toString(handwritingGesture0);
        Objects.toString(executor0);
        Objects.toString(intConsumer0);
        if(Build.VERSION.SDK_INT < 34) {
            return;
        }
        m.a.a(this.a, handwritingGesture0, executor0, intConsumer0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(@Nullable String s, @Nullable Bundle bundle0) {
        Objects.toString(bundle0);
        return this.d.performPrivateCommand(s, bundle0);
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean previewHandwritingGesture(@NotNull PreviewableHandwritingGesture previewableHandwritingGesture0, @Nullable CancellationSignal cancellationSignal0) {
        Objects.toString(previewableHandwritingGesture0);
        Objects.toString(cancellationSignal0);
        return Build.VERSION.SDK_INT >= 34 ? m.a.b(this.a, previewableHandwritingGesture0, cancellationSignal0) : false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int v) {
        this.a.requestCursorUpdates(v);
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(@NotNull KeyEvent keyEvent0) {
        Objects.toString(keyEvent0);
        this.a.sendKeyEvent(keyEvent0);
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int v, int v1) {
        this.a(new d0(v, v1, 2));
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setComposingText(@Nullable CharSequence charSequence0, int v) {
        Objects.toString(charSequence0);
        this.a(new c0(charSequence0, v, 1));
        return true;
    }

    @Override  // android.view.inputmethod.InputConnection
    public boolean setSelection(int v, int v1) {
        this.a(new d0(v, v1, 3));
        return true;
    }
}

