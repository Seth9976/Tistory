package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo.Builder;
import androidx.compose.ui.platform.a;

public final class c implements BuilderCompat {
    public final ContentInfo.Builder a;

    public c(ClipData clipData0, int v) {
        this.a = a.h(clipData0, v);
    }

    public c(ContentInfoCompat contentInfoCompat0) {
        this.a = a.i(contentInfoCompat0.toContentInfo());
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final ContentInfoCompat build() {
        return new ContentInfoCompat(new e(this.a.build()));
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setClip(ClipData clipData0) {
        this.a.setClip(clipData0);
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setExtras(Bundle bundle0) {
        this.a.setExtras(bundle0);
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setFlags(int v) {
        this.a.setFlags(v);
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setLinkUri(Uri uri0) {
        this.a.setLinkUri(uri0);
    }

    @Override  // androidx.core.view.ContentInfoCompat$BuilderCompat
    public final void setSource(int v) {
        this.a.setSource(v);
    }
}

