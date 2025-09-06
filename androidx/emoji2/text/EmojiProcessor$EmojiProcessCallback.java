package androidx.emoji2.text;

import androidx.annotation.NonNull;

interface EmojiProcessor.EmojiProcessCallback {
    Object getResult();

    boolean handleEmoji(@NonNull CharSequence arg1, int arg2, int arg3, TypefaceEmojiRasterizer arg4);
}

