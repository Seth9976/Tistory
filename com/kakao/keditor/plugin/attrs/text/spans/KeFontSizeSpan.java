package com.kakao.keditor.plugin.attrs.text.spans;

import android.text.style.AbsoluteSizeSpan;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001A\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0006\u001A\u00020\u0007¢\u0006\b\n\u0000\u001A\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/text/spans/KeFontSizeSpan;", "Landroid/text/style/AbsoluteSizeSpan;", "Lcom/kakao/keditor/plugin/attrs/text/spans/KeAttributeSpan;", "size", "", "(I)V", "characterSize", "Lcom/kakao/keditor/plugin/attrs/text/CharacterSize;", "getCharacterSize", "()Lcom/kakao/keditor/plugin/attrs/text/CharacterSize;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class KeFontSizeSpan extends AbsoluteSizeSpan implements KeAttributeSpan {
    @NotNull
    private final CharacterSize characterSize;

    public KeFontSizeSpan(int v) {
        super(v, false);
        this.characterSize = CharacterSize.Companion.getTypeBySizeDP(v);
    }

    @NotNull
    public final CharacterSize getCharacterSize() {
        return this.characterSize;
    }
}

