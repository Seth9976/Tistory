package j6;

import com.bumptech.glide.util.pool.StateVerifier;

public final class a extends StateVerifier {
    public volatile boolean a;

    @Override  // com.bumptech.glide.util.pool.StateVerifier
    public final void a(boolean z) {
        this.a = z;
    }

    @Override  // com.bumptech.glide.util.pool.StateVerifier
    public final void throwIfRecycled() {
        if(this.a) {
            throw new IllegalStateException("Already released");
        }
    }
}

