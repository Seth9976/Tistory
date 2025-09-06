package androidx.emoji2.viewsintegration;

import android.text.Editable;
import android.view.KeyEvent;
import androidx.annotation.NonNull;
import androidx.emoji2.text.EmojiCompat;

public class EmojiKeyListener.EmojiCompatHandleKeyDownHelper {
    public boolean handleKeyDown(@NonNull Editable editable0, int v, @NonNull KeyEvent keyEvent0) {
        return EmojiCompat.handleOnKeyDown(editable0, v, keyEvent0);
    }
}

