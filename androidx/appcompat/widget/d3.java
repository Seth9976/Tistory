package androidx.appcompat.widget;

import androidx.emoji2.text.EmojiCompat.InitCallback;
import java.lang.ref.WeakReference;

public final class d3 extends InitCallback {
    public final WeakReference a;

    public d3(SwitchCompat switchCompat0) {
        this.a = new WeakReference(switchCompat0);
    }

    @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void onFailed(Throwable throwable0) {
        SwitchCompat switchCompat0 = (SwitchCompat)this.a.get();
        if(switchCompat0 != null) {
            switchCompat0.c();
        }
    }

    @Override  // androidx.emoji2.text.EmojiCompat$InitCallback
    public final void onInitialized() {
        SwitchCompat switchCompat0 = (SwitchCompat)this.a.get();
        if(switchCompat0 != null) {
            switchCompat0.c();
        }
    }
}

