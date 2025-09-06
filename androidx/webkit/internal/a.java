package androidx.webkit.internal;

import java.util.Arrays;
import java.util.HashSet;

public abstract class a {
    public static final HashSet a;

    static {
        a.a = new HashSet(Arrays.asList(WebViewGlueCommunicator.getFactory().getWebViewFeatures()));
    }
}

