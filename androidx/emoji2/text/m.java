package androidx.emoji2.text;

import android.content.Context;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class m implements MetadataRepoLoader {
    public final Context a;

    public m(Context context0) {
        this.a = context0.getApplicationContext();
    }

    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoader
    public final void load(MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0) {
        b b0 = new b("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), b0);
        threadPoolExecutor0.allowCoreThreadTimeOut(true);
        threadPoolExecutor0.execute(new k(this, emojiCompat$MetadataRepoLoaderCallback0, 0, threadPoolExecutor0));
    }
}

