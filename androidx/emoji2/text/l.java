package androidx.emoji2.text;

import java.util.concurrent.ThreadPoolExecutor;

public final class l extends MetadataRepoLoaderCallback {
    public final MetadataRepoLoaderCallback a;
    public final ThreadPoolExecutor b;

    public l(MetadataRepoLoaderCallback emojiCompat$MetadataRepoLoaderCallback0, ThreadPoolExecutor threadPoolExecutor0) {
        this.a = emojiCompat$MetadataRepoLoaderCallback0;
        this.b = threadPoolExecutor0;
        super();
    }

    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void onFailed(Throwable throwable0) {
        try {
            this.a.onFailed(throwable0);
        }
        finally {
            this.b.shutdown();
        }
    }

    @Override  // androidx.emoji2.text.EmojiCompat$MetadataRepoLoaderCallback
    public final void onLoaded(MetadataRepo metadataRepo0) {
        try {
            this.a.onLoaded(metadataRepo0);
        }
        finally {
            this.b.shutdown();
        }
    }
}

