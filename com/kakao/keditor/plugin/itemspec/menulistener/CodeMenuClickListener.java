package com.kakao.keditor.plugin.itemspec.menulistener;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001A\u00020\u0003H\u0016J\b\u0010\u0004\u001A\u00020\u0003H\u0016¨\u0006\u0005"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/menulistener/CodeMenuClickListener;", "", "onItemEditClicked", "", "onRemoveMenuClicked", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface CodeMenuClickListener {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static void onItemEditClicked(@NotNull CodeMenuClickListener codeMenuClickListener0) {
        }

        public static void onRemoveMenuClicked(@NotNull CodeMenuClickListener codeMenuClickListener0) {
        }
    }

    void onItemEditClicked();

    void onRemoveMenuClicked();
}

