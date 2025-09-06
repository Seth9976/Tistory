package androidx.webkit;

public final class a {
    public final boolean a;
    public final String b;
    public final String c;
    public final PathHandler d;

    public a(String s, String s1, boolean z, PathHandler webViewAssetLoader$PathHandler0) {
        if(s1.isEmpty() || s1.charAt(0) != 0x2F) {
            throw new IllegalArgumentException("Path should start with a slash \'/\'.");
        }
        if(!s1.endsWith("/")) {
            throw new IllegalArgumentException("Path should end with a slash \'/\'");
        }
        this.b = s;
        this.c = s1;
        this.a = z;
        this.d = webViewAssetLoader$PathHandler0;
    }
}

