package androidx.emoji2.text;

import android.text.Spannable;
import android.text.SpannableString;

public final class p implements EmojiProcessor.EmojiProcessCallback {
    public d0 a;
    public final SpanFactory b;

    public p(d0 d00, SpanFactory emojiCompat$SpanFactory0) {
        this.a = d00;
        this.b = emojiCompat$SpanFactory0;
    }

    @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final Object getResult() {
        return this.a;
    }

    @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public final boolean handleEmoji(CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        if(typefaceEmojiRasterizer0.isPreferredSystemRender()) {
            return true;
        }
        if(this.a == null) {
            Spannable spannable0 = charSequence0 instanceof Spannable ? ((Spannable)charSequence0) : new SpannableString(charSequence0);
            this.a = new d0(spannable0);
        }
        EmojiSpan emojiSpan0 = this.b.createSpan(typefaceEmojiRasterizer0);
        this.a.setSpan(emojiSpan0, v, v1, 33);
        return true;
    }
}

