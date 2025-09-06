package androidx.emoji2.text;

public final class q implements EmojiProcessor.EmojiProcessCallback {
    public final int a;
    public int b;
    public int c;

    public q(int v) {
        this.b = -1;
        this.c = -1;
        this.a = v;
    }

    @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final Object getResult() {
        return this;
    }

    @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final boolean handleEmoji(CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        int v2 = this.a;
        if(v <= v2 && v2 < v1) {
            this.b = v;
            this.c = v1;
            return false;
        }
        return v1 <= v2;
    }
}

