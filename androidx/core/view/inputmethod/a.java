package androidx.core.view.inputmethod;

import android.os.Bundle;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class a extends InputConnectionWrapper {
    public final OnCommitContentListener a;

    public a(InputConnection inputConnection0, OnCommitContentListener inputConnectionCompat$OnCommitContentListener0) {
        this.a = inputConnectionCompat$OnCommitContentListener0;
        super(inputConnection0, false);
    }

    @Override  // android.view.inputmethod.InputConnectionWrapper
    public final boolean commitContent(InputContentInfo inputContentInfo0, int v, Bundle bundle0) {
        InputContentInfoCompat inputContentInfoCompat0 = InputContentInfoCompat.wrap(inputContentInfo0);
        return this.a.onCommitContent(inputContentInfoCompat0, v, bundle0) ? true : super.commitContent(inputContentInfo0, v, bundle0);
    }
}

