package androidx.compose.ui.text.input;

import android.view.Choreographer;
import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.core.view.inputmethod.EditorInfoCompat;
import androidx.emoji2.text.a;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A#\u0010\u0006\u001A\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001A\u0013\u0010\n\u001A\u00020\t*\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "Landroidx/compose/ui/text/input/TextFieldValue;", "textFieldValue", "", "update", "(Landroid/view/inputmethod/EditorInfo;Landroidx/compose/ui/text/input/ImeOptions;Landroidx/compose/ui/text/input/TextFieldValue;)V", "Landroid/view/Choreographer;", "Ljava/util/concurrent/Executor;", "asExecutor", "(Landroid/view/Choreographer;)Ljava/util/concurrent/Executor;", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class TextInputServiceAndroid_androidKt {
    // 去混淆评级： 低(30)
    public static final void access$updateWithEmojiCompat(EditorInfo editorInfo0) {
    }

    @NotNull
    public static final Executor asExecutor(@NotNull Choreographer choreographer0) {
        return new a(choreographer0, 1);
    }

    public static final void update(@NotNull EditorInfo editorInfo0, @NotNull ImeOptions imeOptions0, @NotNull TextFieldValue textFieldValue0) {
        int v = imeOptions0.getImeAction-eUduSuo();
        int v1 = 6;
        if(ImeAction.equals-impl0(v, 1)) {
            if(imeOptions0.getSingleLine()) {
                goto label_25;
            }
            v1 = 0;
        }
        else {
            if(ImeAction.equals-impl0(v, 0)) {
                v1 = 1;
                goto label_25;
            }
            if(ImeAction.equals-impl0(v, 2)) {
                v1 = 2;
                goto label_25;
            }
            if(ImeAction.equals-impl0(v, 6)) {
                v1 = 5;
                goto label_25;
            }
            if(ImeAction.equals-impl0(v, 5)) {
                v1 = 7;
                goto label_25;
            }
            if(ImeAction.equals-impl0(v, 3)) {
                v1 = 3;
                goto label_25;
            }
            if(ImeAction.equals-impl0(v, 4)) {
                v1 = 4;
            }
            else if(ImeAction.equals-impl0(v, 7)) {
            }
            else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
    label_25:
        editorInfo0.imeOptions = v1;
        PlatformImeOptions platformImeOptions0 = imeOptions0.getPlatformImeOptions();
        if(platformImeOptions0 != null) {
            String s = platformImeOptions0.getPrivateImeOptions();
            if(s != null) {
                editorInfo0.privateImeOptions = s;
            }
        }
        int v2 = imeOptions0.getKeyboardType-PjHm6EE();
        if(KeyboardType.equals-impl0(v2, 1)) {
            editorInfo0.inputType = 1;
        }
        else {
            if(KeyboardType.equals-impl0(v2, 2)) {
                editorInfo0.inputType = 1;
                editorInfo0.imeOptions |= 0x80000000;
                goto label_59;
            }
            if(KeyboardType.equals-impl0(v2, 3)) {
                editorInfo0.inputType = 2;
                goto label_59;
            }
            if(KeyboardType.equals-impl0(v2, 4)) {
                editorInfo0.inputType = 3;
                goto label_59;
            }
            if(KeyboardType.equals-impl0(v2, 5)) {
                editorInfo0.inputType = 17;
                goto label_59;
            }
            if(KeyboardType.equals-impl0(v2, 6)) {
                editorInfo0.inputType = 33;
                goto label_59;
            }
            if(KeyboardType.equals-impl0(v2, 7)) {
                editorInfo0.inputType = 0x81;
                goto label_59;
            }
            if(KeyboardType.equals-impl0(v2, 8)) {
                editorInfo0.inputType = 18;
            }
            else if(KeyboardType.equals-impl0(v2, 9)) {
                editorInfo0.inputType = 0x2002;
            }
            else {
                throw new IllegalStateException("Invalid Keyboard Type");
            }
        }
    label_59:
        if(!imeOptions0.getSingleLine()) {
            int v3 = editorInfo0.inputType;
            if((v3 & 1) == 1) {
                editorInfo0.inputType = v3 | 0x20000;
                if(ImeAction.equals-impl0(imeOptions0.getImeAction-eUduSuo(), 1)) {
                    editorInfo0.imeOptions |= 0x40000000;
                }
            }
        }
        if((editorInfo0.inputType & 1) == 1) {
            int v4 = imeOptions0.getCapitalization-IUNYP9k();
            if(KeyboardCapitalization.equals-impl0(v4, 1)) {
                editorInfo0.inputType |= 0x1000;
            }
            else if(KeyboardCapitalization.equals-impl0(v4, 2)) {
                editorInfo0.inputType |= 0x2000;
            }
            else if(KeyboardCapitalization.equals-impl0(v4, 3)) {
                editorInfo0.inputType |= 0x4000;
            }
            if(imeOptions0.getAutoCorrect()) {
                editorInfo0.inputType |= 0x8000;
            }
        }
        editorInfo0.initialSelStart = TextRange.getStart-impl(textFieldValue0.getSelection-d9O1mEE());
        editorInfo0.initialSelEnd = TextRange.getEnd-impl(textFieldValue0.getSelection-d9O1mEE());
        EditorInfoCompat.setInitialSurroundingText(editorInfo0, textFieldValue0.getText());
        editorInfo0.imeOptions |= 0x2000000;
    }
}

