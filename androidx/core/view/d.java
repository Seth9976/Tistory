package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;

public final class d implements BuilderCompat {
    public ClipData a;
    public int b;
    public int c;
    public Uri d;
    public Bundle e;

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final ContentInfoCompat build() {
        return new ContentInfoCompat(new f(this));
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setClip(ClipData clipData0) {
        this.a = clipData0;
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setExtras(Bundle bundle0) {
        this.e = bundle0;
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setFlags(int v) {
        this.c = v;
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setLinkUri(Uri uri0) {
        this.d = uri0;
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setSource(int v) {
        this.b = v;
    }
}

