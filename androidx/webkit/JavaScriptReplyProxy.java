package androidx.webkit;

import androidx.annotation.NonNull;

public abstract class JavaScriptReplyProxy {
    public abstract void postMessage(@NonNull String arg1);

    public abstract void postMessage(@NonNull byte[] arg1);
}

