package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public final class InputContentInfoCompat {
    interface InputContentInfoCompatImpl {
        @NonNull
        Uri getContentUri();

        @NonNull
        ClipDescription getDescription();

        @Nullable
        Object getInputContentInfo();

        @Nullable
        Uri getLinkUri();

        void releasePermission();

        void requestPermission();
    }

    public final c a;

    public InputContentInfoCompat(@NonNull Uri uri0, @NonNull ClipDescription clipDescription0, @Nullable Uri uri1) {
        this.a = new c(uri0, clipDescription0, uri1);
    }

    public InputContentInfoCompat(c c0) {
        this.a = c0;
    }

    @NonNull
    public Uri getContentUri() {
        return this.a.a.getContentUri();
    }

    @NonNull
    public ClipDescription getDescription() {
        return this.a.a.getDescription();
    }

    @Nullable
    public Uri getLinkUri() {
        return this.a.a.getLinkUri();
    }

    public void releasePermission() {
        this.a.releasePermission();
    }

    public void requestPermission() {
        this.a.requestPermission();
    }

    @Nullable
    public Object unwrap() {
        return this.a.a;
    }

    @Nullable
    public static InputContentInfoCompat wrap(@Nullable Object object0) {
        return object0 == null ? null : new InputContentInfoCompat(new c(object0));
    }
}

