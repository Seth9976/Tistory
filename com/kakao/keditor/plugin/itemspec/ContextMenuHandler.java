package com.kakao.keditor.plugin.itemspec;

import android.content.Context;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.KeditorItem;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001C\u0010\u0002\u001A\u00020\u00032\b\u0010\u0004\u001A\u0004\u0018\u00010\u00052\b\u0010\u0006\u001A\u0004\u0018\u00010\u0007H&J\u0010\u0010\b\u001A\u00020\u00032\u0006\u0010\t\u001A\u00020\nH&J\b\u0010\u000B\u001A\u00020\fH&¨\u0006\r"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/ContextMenuHandler;", "", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "Landroid/view/View;", "createContextMenu", "context", "Landroid/content/Context;", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ContextMenuHandler {
    void bind(@Nullable KeditorItem arg1, @Nullable View arg2);

    void createContextMenu(@NotNull Context arg1);

    @NotNull
    ViewDataBinding getContextMenuBinding();
}

