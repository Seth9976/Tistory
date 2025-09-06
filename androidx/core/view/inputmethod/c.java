package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

public final class c implements InputContentInfoCompatImpl {
    public final InputContentInfo a;

    public c(Uri uri0, ClipDescription clipDescription0, Uri uri1) {
        this.a = new InputContentInfo(uri0, clipDescription0, uri1);
    }

    public c(Object object0) {
        this.a = (InputContentInfo)object0;
    }

    @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Uri getContentUri() {
        return this.a.getContentUri();
    }

    @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final ClipDescription getDescription() {
        return this.a.getDescription();
    }

    @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Object getInputContentInfo() {
        return this.a;
    }

    @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final Uri getLinkUri() {
        return this.a.getLinkUri();
    }

    @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final void releasePermission() {
        this.a.releasePermission();
    }

    @Override  // androidx.core.view.inputmethod.InputContentInfoCompat$InputContentInfoCompatImpl
    public final void requestPermission() {
        this.a.requestPermission();
    }
}

