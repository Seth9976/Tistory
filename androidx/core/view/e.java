package androidx.core.view;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.compose.ui.platform.a;
import androidx.core.util.Preconditions;

public final class e implements Compat {
    public final ContentInfo a;

    public e(ContentInfo contentInfo0) {
        this.a = a.k(Preconditions.checkNotNull(contentInfo0));
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final ClipData getClip() {
        return this.a.getClip();
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final Bundle getExtras() {
        return this.a.getExtras();
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final int getFlags() {
        return this.a.getFlags();
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final Uri getLinkUri() {
        return this.a.getLinkUri();
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final int getSource() {
        return this.a.getSource();
    }

    @Override  // androidx.core.view.ContentInfoCompat$Compat
    public final ContentInfo getWrapped() {
        return this.a;
    }

    @Override
    public final String toString() {
        return "ContentInfoCompat{" + this.a + "}";
    }
}

