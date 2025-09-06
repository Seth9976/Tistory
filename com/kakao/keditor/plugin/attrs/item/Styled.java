package com.kakao.keditor.plugin.attrs.item;

import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.Style;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R$\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0002\u001A\u00020\u00038V@VX\u0096\u000E¢\u0006\f\u001A\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001A\u00020\nX¦\u000E¢\u0006\f\u001A\u0004\b\u000B\u0010\f\"\u0004\b\r\u0010\u000ER\u0018\u0010\u000F\u001A\u00020\u0010X¦\u000E¢\u0006\f\u001A\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/kakao/keditor/plugin/attrs/item/Styled;", "Lcom/kakao/keditor/plugin/attrs/item/Aligned;", "value", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "alignment", "getAlignment", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setAlignment", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "mobileStyle", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "getMobileStyle", "()Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "setMobileStyle", "(Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;)V", "style", "Lcom/kakao/keditor/plugin/attrs/Style;", "getStyle", "()Lcom/kakao/keditor/plugin/attrs/Style;", "setStyle", "(Lcom/kakao/keditor/plugin/attrs/Style;)V", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface Styled extends Aligned {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        @NotNull
        public static Alignment getAlignment(@NotNull Styled styled0) {
            return styled0.getStyle().toAlignment();
        }

        public static void setAlignment(@NotNull Styled styled0, @NotNull Alignment alignment0) {
            Intrinsics.checkNotNullParameter(alignment0, "value");
        }
    }

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    @NotNull
    Alignment getAlignment();

    @NotNull
    MobileStyle getMobileStyle();

    @NotNull
    Style getStyle();

    @Override  // com.kakao.keditor.plugin.attrs.item.Aligned
    void setAlignment(@NotNull Alignment arg1);

    void setMobileStyle(@NotNull MobileStyle arg1);

    void setStyle(@NotNull Style arg1);
}

