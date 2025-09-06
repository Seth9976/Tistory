package androidx.core.content;

import android.content.Context;
import android.view.inputmethod.EditorInfo;

public abstract class r {
    public static boolean a(Context context0) {
        return !context0.getPackageManager().isAutoRevokeWhitelisted();
    }

    public static CharSequence b(EditorInfo editorInfo0, int v) {
        return editorInfo0.getInitialSelectedText(v);
    }

    public static CharSequence c(EditorInfo editorInfo0, int v, int v1) {
        return editorInfo0.getInitialTextAfterCursor(v, v1);
    }

    public static CharSequence d(EditorInfo editorInfo0, int v, int v1) {
        return editorInfo0.getInitialTextBeforeCursor(v, v1);
    }

    public static void e(EditorInfo editorInfo0, CharSequence charSequence0, int v) {
        editorInfo0.setInitialSurroundingSubText(charSequence0, v);
    }
}

