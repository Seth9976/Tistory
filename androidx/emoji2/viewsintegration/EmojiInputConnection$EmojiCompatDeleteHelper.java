package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompat;

public class EmojiInputConnection.EmojiCompatDeleteHelper {
    public boolean handleDeleteSurroundingText(@NonNull InputConnection inputConnection0, @NonNull Editable editable0, @IntRange(from = 0L) int v, @IntRange(from = 0L) int v1, boolean z) {
        return EmojiCompat.handleDeleteSurroundingText(inputConnection0, editable0, v, v1, z);
    }

    // 去混淆评级： 低(30)
    public void updateEditorInfoAttrs(@NonNull EditorInfo editorInfo0) {
    }
}

