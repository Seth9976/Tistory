package androidx.core.view.inputmethod;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.h;
import androidx.core.util.ObjectsCompat;
import androidx.core.util.Preconditions;

@SuppressLint({"PrivateConstructorForUtilityClass"})
public final class InputConnectionCompat {
    public interface OnCommitContentListener {
        boolean onCommitContent(@NonNull InputContentInfoCompat arg1, int arg2, @Nullable Bundle arg3);
    }

    public static final int INPUT_CONTENT_GRANT_READ_URI_PERMISSION = 1;

    public static boolean commitContent(@NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0, @NonNull InputContentInfoCompat inputContentInfoCompat0, int v, @Nullable Bundle bundle0) {
        return b.a(inputConnection0, ((InputContentInfo)inputContentInfoCompat0.unwrap()), v, bundle0);
    }

    @NonNull
    public static InputConnection createWrapper(@NonNull View view0, @NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0) {
        Preconditions.checkNotNull(view0);
        return InputConnectionCompat.createWrapper(inputConnection0, editorInfo0, new h(view0, 1));
    }

    @NonNull
    @Deprecated
    public static InputConnection createWrapper(@NonNull InputConnection inputConnection0, @NonNull EditorInfo editorInfo0, @NonNull OnCommitContentListener inputConnectionCompat$OnCommitContentListener0) {
        ObjectsCompat.requireNonNull(inputConnection0, "inputConnection must be non-null");
        ObjectsCompat.requireNonNull(editorInfo0, "editorInfo must be non-null");
        ObjectsCompat.requireNonNull(inputConnectionCompat$OnCommitContentListener0, "onCommitContentListener must be non-null");
        return new a(inputConnection0, inputConnectionCompat$OnCommitContentListener0);
    }
}

