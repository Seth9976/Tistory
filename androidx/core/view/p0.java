package androidx.core.view;

import android.view.ContentInfo;
import android.view.OnReceiveContentListener;
import android.view.View;

public final class p0 implements OnReceiveContentListener {
    public final androidx.core.view.OnReceiveContentListener a;

    public p0(androidx.core.view.OnReceiveContentListener onReceiveContentListener0) {
        this.a = onReceiveContentListener0;
    }

    @Override  // android.view.OnReceiveContentListener
    public final ContentInfo onReceiveContent(View view0, ContentInfo contentInfo0) {
        ContentInfoCompat contentInfoCompat0 = ContentInfoCompat.toContentInfoCompat(contentInfo0);
        ContentInfoCompat contentInfoCompat1 = this.a.onReceiveContent(view0, contentInfoCompat0);
        if(contentInfoCompat1 == null) {
            return null;
        }
        return contentInfoCompat1 == contentInfoCompat0 ? contentInfo0 : contentInfoCompat1.toContentInfo();
    }
}

