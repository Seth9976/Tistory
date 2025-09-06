package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.view.KeyEvent;
import java.util.Set;

public final class t {
    public final SpanFactory a;
    public final MetadataRepo b;
    public final GlyphChecker c;
    public final boolean d;
    public final int[] e;

    public t(MetadataRepo metadataRepo0, SpanFactory emojiCompat$SpanFactory0, GlyphChecker emojiCompat$GlyphChecker0, boolean z, int[] arr_v, Set set0) {
        this.a = emojiCompat$SpanFactory0;
        this.b = metadataRepo0;
        this.c = emojiCompat$GlyphChecker0;
        this.d = z;
        this.e = arr_v;
        if(!set0.isEmpty()) {
            for(Object object0: set0) {
                String s = new String(((int[])object0), 0, ((int[])object0).length);
                this.c(s, 0, s.length(), 1, true, new r(s));
            }
        }
    }

    public static boolean a(Editable editable0, KeyEvent keyEvent0, boolean z) {
        if(!KeyEvent.metaStateHasNoModifiers(keyEvent0.getMetaState())) {
            return false;
        }
        int v = Selection.getSelectionStart(editable0);
        int v1 = Selection.getSelectionEnd(editable0);
        if(v != -1 && v1 != -1 && v == v1) {
            EmojiSpan[] arr_emojiSpan = (EmojiSpan[])editable0.getSpans(v, v1, EmojiSpan.class);
            if(arr_emojiSpan != null && arr_emojiSpan.length > 0) {
                for(int v2 = 0; v2 < arr_emojiSpan.length; ++v2) {
                    EmojiSpan emojiSpan0 = arr_emojiSpan[v2];
                    int v3 = editable0.getSpanStart(emojiSpan0);
                    int v4 = editable0.getSpanEnd(emojiSpan0);
                    if(z && v3 == v || !z && v4 == v || v > v3 && v < v4) {
                        editable0.delete(v3, v4);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int b(CharSequence charSequence0, int v) {
        s s0 = new s(this.b.c, this.d, this.e);
        int v1 = charSequence0.length();
        int v2 = 0;
        int v3 = 0;
        int v4 = 0;
        while(v2 < v1) {
            int v5 = Character.codePointAt(charSequence0, v2);
            int v6 = s0.a(v5);
            TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = s0.c.b;
            switch(v6) {
                case 1: {
                    v2 += Character.charCount(v5);
                    v4 = 0;
                    break;
                }
                case 2: {
                    v2 += Character.charCount(v5);
                    break;
                }
                default: {
                    if(v6 == 3) {
                        typefaceEmojiRasterizer0 = s0.d.b;
                        if(typefaceEmojiRasterizer0.getCompatAdded() <= v) {
                            ++v3;
                        }
                    }
                }
            }
            if(typefaceEmojiRasterizer0 != null && typefaceEmojiRasterizer0.getCompatAdded() <= v) {
                ++v4;
            }
        }
        if(v3 != 0) {
            return 2;
        }
        if(s0.a == 2 && s0.c.b != null && (s0.f > 1 || s0.c()) && s0.c.b.getCompatAdded() <= v) {
            return 1;
        }
        return v4 == 0 ? 0 : 2;
    }

    public final Object c(CharSequence charSequence0, int v, int v1, int v2, boolean z, EmojiProcessor.EmojiProcessCallback emojiProcessor$EmojiProcessCallback0) {
        int v6;
        s s0 = new s(this.b.c, this.d, this.e);
        int v3 = Character.codePointAt(charSequence0, v);
        boolean z1 = true;
        int v4 = 0;
        int v5 = v;
        while(true) {
            v6 = v5;
        label_6:
            if(v5 >= v1 || v4 >= v2 || !z1) {
                break;
            }
            int v7 = s0.a(v3);
            switch(v7) {
                case 1: {
                    v5 = Character.charCount(Character.codePointAt(charSequence0, v6)) + v6;
                    if(v5 >= v1) {
                        continue;
                    }
                    v3 = Character.codePointAt(charSequence0, v5);
                    continue;
                }
                case 2: {
                    break;
                }
                default: {
                    if(v7 != 3) {
                        goto label_6;
                    }
                    if(!z) {
                        TypefaceEmojiRasterizer typefaceEmojiRasterizer0 = s0.d.b;
                        if(typefaceEmojiRasterizer0.getHasGlyph() == 0) {
                            int v8 = typefaceEmojiRasterizer0.getSdkAdded();
                            typefaceEmojiRasterizer0.setHasGlyph(this.c.hasGlyph(charSequence0, v6, v5, v8));
                        }
                        if(typefaceEmojiRasterizer0.getHasGlyph() == 2) {
                            v6 = v5;
                            goto label_6;
                        }
                    }
                    z1 = emojiProcessor$EmojiProcessCallback0.handleEmoji(charSequence0, v6, v5, s0.d.b);
                    ++v4;
                    continue;
                }
            }
            int v9 = Character.charCount(v3) + v5;
            if(v9 < v1) {
                v3 = Character.codePointAt(charSequence0, v9);
            }
            v5 = v9;
            goto label_6;
        }
        if(s0.a == 2 && s0.c.b != null && (s0.f > 1 || s0.c()) && v4 < v2 && z1) {
            if(z) {
                emojiProcessor$EmojiProcessCallback0.handleEmoji(charSequence0, v6, v5, s0.c.b);
            }
            else {
                TypefaceEmojiRasterizer typefaceEmojiRasterizer1 = s0.c.b;
                if(typefaceEmojiRasterizer1.getHasGlyph() == 0) {
                    int v10 = typefaceEmojiRasterizer1.getSdkAdded();
                    typefaceEmojiRasterizer1.setHasGlyph(this.c.hasGlyph(charSequence0, v6, v5, v10));
                }
                if(typefaceEmojiRasterizer1.getHasGlyph() != 2) {
                    emojiProcessor$EmojiProcessCallback0.handleEmoji(charSequence0, v6, v5, s0.c.b);
                    return emojiProcessor$EmojiProcessCallback0.getResult();
                }
            }
        }
        return emojiProcessor$EmojiProcessCallback0.getResult();
    }
}

