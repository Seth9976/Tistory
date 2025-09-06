package androidx.webkit.internal;

public abstract class h {
    public static final WebkitToCompatConverter a;

    static {
        h.a = new WebkitToCompatConverter(WebViewGlueCommunicator.getFactory().getWebkitToCompatConverter());
    }
}

