package androidx.emoji2.text;

import android.text.TextUtils;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class r implements EmojiProcessor.EmojiProcessCallback, MetadataListReader.OpenTypeReader {
    public final Comparable a;

    public r(String s) {
        this.a = s;
    }

    public r(ByteBuffer byteBuffer0) {
        this.a = byteBuffer0;
        byteBuffer0.order(ByteOrder.BIG_ENDIAN);
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public long getPosition() {
        return (long)((ByteBuffer)this.a).position();
    }

    @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public Object getResult() {
        return this;
    }

    @Override  // androidx.emoji2.text.EmojiProcessor$EmojiProcessCallback
    public boolean handleEmoji(CharSequence charSequence0, int v, int v1, TypefaceEmojiRasterizer typefaceEmojiRasterizer0) {
        if(TextUtils.equals(charSequence0.subSequence(v, v1), ((String)this.a))) {
            typefaceEmojiRasterizer0.setExclusion(true);
            return false;
        }
        return true;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public int readTag() {
        return ((ByteBuffer)this.a).getInt();
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public long readUnsignedInt() {
        return ((long)((ByteBuffer)this.a).getInt()) & 0xFFFFFFFFL;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public int readUnsignedShort() {
        return ((ByteBuffer)this.a).getShort() & 0xFFFF;
    }

    @Override  // androidx.emoji2.text.MetadataListReader$OpenTypeReader
    public void skip(int v) {
        ((ByteBuffer)this.a).position(((ByteBuffer)this.a).position() + v);
    }
}

