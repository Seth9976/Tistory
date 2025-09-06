package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.DoNotInline;

public abstract class b {
    @DoNotInline
    public static boolean a(InputConnection inputConnection0, InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        return inputConnection0.commitContent(inputContentInfo0, v, bundle0);
    }
}

