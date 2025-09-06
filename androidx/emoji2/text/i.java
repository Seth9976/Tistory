package androidx.emoji2.text;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;

public final class i implements DefaultLifecycleObserver {
    public final Lifecycle a;
    public final EmojiCompatInitializer b;

    public i(EmojiCompatInitializer emojiCompatInitializer0, Lifecycle lifecycle0) {
        this.b = emojiCompatInitializer0;
        this.a = lifecycle0;
    }

    @Override  // androidx.lifecycle.DefaultLifecycleObserver
    public final void onResume(LifecycleOwner lifecycleOwner0) {
        this.b.getClass();
        (Build.VERSION.SDK_INT < 28 ? new Handler(Looper.getMainLooper()) : c.a(Looper.getMainLooper())).postDelayed(new n(0), 500L);
        this.a.removeObserver(this);
    }
}

