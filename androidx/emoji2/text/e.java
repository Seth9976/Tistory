package androidx.emoji2.text;

import android.os.Build.VERSION;
import g.b;
import java.util.ArrayList;
import java.util.Set;

public final class e extends MetadataRepoLoaderCallback {
    public final f a;

    public e(f f0) {
        this.a = f0;
        super();
    }

    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void onFailed(Throwable throwable0) {
        ((EmojiCompat)this.a.a).b(throwable0);
    }

    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void onLoaded(MetadataRepo metadataRepo0) {
        f f0 = this.a;
        if(metadataRepo0 == null) {
            IllegalArgumentException illegalArgumentException0 = new IllegalArgumentException("metadataRepo cannot be null");
            ((EmojiCompat)f0.a).b(illegalArgumentException0);
            return;
        }
        f0.c = metadataRepo0;
        MetadataRepo metadataRepo1 = f0.c;
        Set set0 = Build.VERSION.SDK_INT < 34 ? b.n() : o.a();
        f0.b = new t(metadataRepo1, ((EmojiCompat)f0.a).g, ((EmojiCompat)f0.a).n, ((EmojiCompat)f0.a).i, ((EmojiCompat)f0.a).j, set0);
        ((EmojiCompat)f0.a).getClass();
        ArrayList arrayList0 = new ArrayList();
        ((EmojiCompat)f0.a).a.writeLock().lock();
        try {
            ((EmojiCompat)f0.a).c = 1;
            arrayList0.addAll(((EmojiCompat)f0.a).b);
            ((EmojiCompat)f0.a).b.clear();
        }
        finally {
            ((EmojiCompat)f0.a).a.writeLock().unlock();
        }
        h h0 = new h(arrayList0, ((EmojiCompat)f0.a).c, null);
        ((EmojiCompat)f0.a).d.post(h0);
    }
}

