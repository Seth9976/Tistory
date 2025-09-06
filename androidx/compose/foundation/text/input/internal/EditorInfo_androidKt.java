package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.EditorInfo;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.ImeAction;
import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.KeyboardCapitalization;
import androidx.compose.ui.text.input.KeyboardType;
import androidx.compose.ui.text.input.PlatformImeOptions;
import androidx.core.view.inputmethod.EditorInfoCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001A@\u0010\r\u001A\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001A\u00020\u00012\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0010\b\u0002\u0010\t\u001A\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u000B\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u000E"}, d2 = {"Landroid/view/inputmethod/EditorInfo;", "", "text", "Landroidx/compose/ui/text/TextRange;", "selection", "Landroidx/compose/ui/text/input/ImeOptions;", "imeOptions", "", "", "contentMimeTypes", "", "update-pLxbY9I", "(Landroid/view/inputmethod/EditorInfo;Ljava/lang/CharSequence;JLandroidx/compose/ui/text/input/ImeOptions;[Ljava/lang/String;)V", "update", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class EditorInfo_androidKt {
    public static final void update-pLxbY9I(@NotNull EditorInfo editorInfo0, @NotNull CharSequence charSequence0, long v, @NotNull ImeOptions imeOptions0, @Nullable String[] arr_s) {
        int v1 = imeOptions0.getImeAction-eUduSuo();
        int v2 = 3;
        int v3 = 6;
        if(ImeAction.equals-impl0(v1, 1)) {
            if(imeOptions0.getSingleLine()) {
                goto label_26;
            }
            v3 = 0;
        }
        else {
            if(ImeAction.equals-impl0(v1, 0)) {
                v3 = 1;
                goto label_26;
            }
            if(ImeAction.equals-impl0(v1, 2)) {
                v3 = 2;
                goto label_26;
            }
            if(ImeAction.equals-impl0(v1, 6)) {
                v3 = 5;
                goto label_26;
            }
            if(ImeAction.equals-impl0(v1, 5)) {
                v3 = 7;
                goto label_26;
            }
            if(ImeAction.equals-impl0(v1, 3)) {
                v3 = 3;
                goto label_26;
            }
            if(ImeAction.equals-impl0(v1, 4)) {
                v3 = 4;
            }
            else if(ImeAction.equals-impl0(v1, 7)) {
            }
            else {
                throw new IllegalStateException("invalid ImeAction");
            }
        }
    label_26:
        editorInfo0.imeOptions = v3;
        PlatformImeOptions platformImeOptions0 = imeOptions0.getPlatformImeOptions();
        if(platformImeOptions0 != null) {
            String s = platformImeOptions0.getPrivateImeOptions();
            if(s != null) {
                editorInfo0.privateImeOptions = s;
            }
        }
        LocaleListHelper.INSTANCE.setHintLocales(editorInfo0, imeOptions0.getHintLocales());
        int v4 = imeOptions0.getKeyboardType-PjHm6EE();
        if(KeyboardType.equals-impl0(v4, 1)) {
            v2 = 1;
        }
        else if(KeyboardType.equals-impl0(v4, 2)) {
            editorInfo0.imeOptions |= 0x80000000;
            v2 = 1;
        }
        else if(KeyboardType.equals-impl0(v4, 3)) {
            v2 = 2;
        }
        else if(!KeyboardType.equals-impl0(v4, 4)) {
            if(KeyboardType.equals-impl0(v4, 5)) {
                v2 = 17;
            }
            else if(KeyboardType.equals-impl0(v4, 6)) {
                v2 = 33;
            }
            else if(KeyboardType.equals-impl0(v4, 7)) {
                v2 = 0x81;
            }
            else if(KeyboardType.equals-impl0(v4, 8)) {
                v2 = 18;
            }
            else {
                if(!KeyboardType.equals-impl0(v4, 9)) {
                    throw new IllegalStateException("Invalid Keyboard Type");
                }
                v2 = 0x2002;
            }
        }
        editorInfo0.inputType = v2;
        if(!imeOptions0.getSingleLine()) {
            int v5 = editorInfo0.inputType;
            if((v5 & 1) == 1) {
                editorInfo0.inputType = v5 | 0x20000;
                if(ImeAction.equals-impl0(imeOptions0.getImeAction-eUduSuo(), 1)) {
                    editorInfo0.imeOptions |= 0x40000000;
                }
            }
        }
        if((editorInfo0.inputType & 1) == 1) {
            int v6 = imeOptions0.getCapitalization-IUNYP9k();
            if(KeyboardCapitalization.equals-impl0(v6, 1)) {
                editorInfo0.inputType |= 0x1000;
            }
            else if(KeyboardCapitalization.equals-impl0(v6, 2)) {
                editorInfo0.inputType |= 0x2000;
            }
            else if(KeyboardCapitalization.equals-impl0(v6, 3)) {
                editorInfo0.inputType |= 0x4000;
            }
            if(imeOptions0.getAutoCorrect()) {
                editorInfo0.inputType |= 0x8000;
            }
        }
        editorInfo0.initialSelStart = TextRange.getStart-impl(v);
        editorInfo0.initialSelEnd = TextRange.getEnd-impl(v);
        EditorInfoCompat.setInitialSurroundingText(editorInfo0, charSequence0);
        if(arr_s != null) {
            EditorInfoCompat.setContentMimeTypes(editorInfo0, arr_s);
        }
        editorInfo0.imeOptions |= 0x2000000;
        EditorInfoCompat.setStylusHandwritingEnabled(editorInfo0, false);
    }

    public static void update-pLxbY9I$default(EditorInfo editorInfo0, CharSequence charSequence0, long v, ImeOptions imeOptions0, String[] arr_s, int v1, Object object0) {
        if((v1 & 8) != 0) {
            arr_s = null;
        }
        EditorInfo_androidKt.update-pLxbY9I(editorInfo0, charSequence0, v, imeOptions0, arr_s);
    }
}

