package com.kakao.keditor.plugin.itemspec.menulistener;

import com.kakao.keditor.plugin.attrs.Alignment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\b\u0010\u0006\u001A\u00020\u0003H\u0016¨\u0006\u0007"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/menulistener/SimpleAlignMenuClickListener;", "", "onAlignmentClicked", "", "alignment", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "onRemoveMenuClicked", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface SimpleAlignMenuClickListener {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onAlignmentClicked(@NotNull SimpleAlignMenuClickListener simpleAlignMenuClickListener0, @NotNull Alignment alignment0) {
            Intrinsics.checkNotNullParameter(alignment0, "alignment");
        }

        public static void onRemoveMenuClicked(@NotNull SimpleAlignMenuClickListener simpleAlignMenuClickListener0) {
        }
    }

    void onAlignmentClicked(@NotNull Alignment arg1);

    void onRemoveMenuClicked();
}

