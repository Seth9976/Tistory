package com.kakao.tistory.data.model.common;

import com.kakao.android.base.model.ErrorModel;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sd.a;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\nB\u0005¢\u0006\u0002\u0010\u0003R\u001C\u0010\u0004\u001A\u0004\u0018\u00010\u0005X\u0096\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Lcom/kakao/tistory/data/model/common/EmojiErrorModel;", "Lcom/kakao/android/base/model/ErrorModel;", "Lcom/kakao/tistory/data/model/common/EmojiError;", "()V", "emoji", "Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "getEmoji", "()Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "setEmoji", "(Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;)V", "Emoji", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmojiErrorModel extends ErrorModel implements EmojiError {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000F\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001F\b\u0002\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\u0006\u0010\u0004\u001A\u00020\u0005\u0012\u0006\u0010\u0006\u001A\u00020\u0007¢\u0006\u0002\u0010\bR\u001A\u0010\u0006\u001A\u00020\u0007X\u0086\u000E¢\u0006\u000E\n\u0000\u001A\u0004\b\t\u0010\n\"\u0004\b\u000B\u0010\fR\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\r\u0010\u000ER\u0011\u0010\u0004\u001A\u00020\u0005¢\u0006\b\n\u0000\u001A\u0004\b\u000F\u0010\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0016"}, d2 = {"Lcom/kakao/tistory/data/model/common/EmojiErrorModel$Emoji;", "", "emoticon", "", "gravity", "", "bottomMargin", "", "(Ljava/lang/String;ILjava/lang/String;IF)V", "getBottomMargin", "()F", "setBottomMargin", "(F)V", "getEmoticon", "()Ljava/lang/String;", "getGravity", "()I", "Eyes", "Cloud", "Screaming", "Persevering", "Finger", "data_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static enum Emoji {
        Eyes("\uD83D\uDC40", 0x800005, 20.0f),
        Cloud("\uD83C\uDF29", 17, 28.0f),
        Screaming("\uD83D\uDE31", 0x800005, 20.0f),
        Persevering("\uD83D\uDE23", 17, 28.0f),
        Finger("\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47\uD83D\uDC47", 0x800003, 70.0f);

        private static final EnumEntries $ENTRIES;
        private static final Emoji[] $VALUES;
        private float bottomMargin;
        @NotNull
        private final String emoticon;
        private final int gravity;

        private static final Emoji[] $values() [...] // Inlined contents

        static {
            Emoji.$VALUES = arr_emojiErrorModel$Emoji;
            Intrinsics.checkNotNullParameter(arr_emojiErrorModel$Emoji, "entries");
            Emoji.$ENTRIES = new a(arr_emojiErrorModel$Emoji);
        }

        private Emoji(String s1, int v1, float f) {
            this.emoticon = s1;
            this.gravity = v1;
            this.bottomMargin = f;
        }

        public final float getBottomMargin() {
            return this.bottomMargin;
        }

        @NotNull
        public final String getEmoticon() {
            return this.emoticon;
        }

        @NotNull
        public static EnumEntries getEntries() {
            return Emoji.$ENTRIES;
        }

        public final int getGravity() {
            return this.gravity;
        }

        public final void setBottomMargin(float f) {
            this.bottomMargin = f;
        }
    }

    @Nullable
    private Emoji emoji;

    @Override  // com.kakao.tistory.data.model.common.EmojiError
    @Nullable
    public Emoji getEmoji() {
        return this.emoji;
    }

    public void setEmoji(@Nullable Emoji emojiErrorModel$Emoji0) {
        this.emoji = emojiErrorModel$Emoji0;
    }
}

