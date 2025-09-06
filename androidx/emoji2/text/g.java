package androidx.emoji2.text;

import com.bumptech.glide.load.engine.bitmap_recycle.Poolable;
import com.bumptech.glide.util.Util;
import java.util.Queue;

public abstract class g {
    public final Object a;

    public g() {
        this.a = Util.createQueue(20);
    }

    public g(EmojiCompat emojiCompat0) {
        this.a = emojiCompat0;
    }

    public void a(Poolable poolable0) {
        Queue queue0 = (Queue)this.a;
        if(queue0.size() < 20) {
            queue0.offer(poolable0);
        }
    }
}

