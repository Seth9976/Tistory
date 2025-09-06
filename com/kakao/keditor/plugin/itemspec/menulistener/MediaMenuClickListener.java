package com.kakao.keditor.plugin.itemspec.menulistener;

import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\b\u0010\u0006\u001A\u00020\u0003H\u0016J\b\u0010\u0007\u001A\u00020\u0003H\u0016J\b\u0010\b\u001A\u00020\u0003H\u0016J\u0010\u0010\t\u001A\u00020\u00032\u0006\u0010\n\u001A\u00020\u000BH\u0016J\b\u0010\f\u001A\u00020\u0003H\u0016¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/menulistener/MediaMenuClickListener;", "", "onAlignmentChanged", "", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "onEditImageClicked", "onEditImageGridClicked", "onLinkClicked", "onMobileStyleChangeClicked", "mobileStyle", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "onRemoveMenuClicked", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MediaMenuClickListener {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onAlignmentChanged(@NotNull MediaMenuClickListener mediaMenuClickListener0, @NotNull Alignment alignment0) {
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
        }

        public static void onEditImageClicked(@NotNull MediaMenuClickListener mediaMenuClickListener0) {
        }

        public static void onEditImageGridClicked(@NotNull MediaMenuClickListener mediaMenuClickListener0) {
        }

        public static void onLinkClicked(@NotNull MediaMenuClickListener mediaMenuClickListener0) {
        }

        public static void onMobileStyleChangeClicked(@NotNull MediaMenuClickListener mediaMenuClickListener0, @NotNull MobileStyle mobileStyle0) {
            Intrinsics.checkNotNullParameter(mobileStyle0, "mobileStyle");
        }

        public static void onRemoveMenuClicked(@NotNull MediaMenuClickListener mediaMenuClickListener0) {
        }
    }

    void onAlignmentChanged(@NotNull Alignment arg1);

    void onEditImageClicked();

    void onEditImageGridClicked();

    void onLinkClicked();

    void onMobileStyleChangeClicked(@NotNull MobileStyle arg1);

    void onRemoveMenuClicked();
}

