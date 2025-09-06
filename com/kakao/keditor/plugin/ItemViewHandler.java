package com.kakao.keditor.plugin;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003J-\u0010\u0004\u001A\u00020\u00052\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00028\u00002\u0006\u0010\t\u001A\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH&¢\u0006\u0002\u0010\rJ\u001A\u0010\u000E\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u00102\b\b\u0002\u0010\u0011\u001A\u00020\u0012H&¨\u0006\u0013"}, d2 = {"Lcom/kakao/keditor/plugin/ItemViewHandler;", "T", "Lcom/kakao/keditor/KeditorItem;", "", "onItemBound", "", "view", "Landroid/view/View;", "item", "position", "", "editorState", "Lcom/kakao/keditor/KeditorState;", "(Landroid/view/View;Lcom/kakao/keditor/KeditorItem;ILcom/kakao/keditor/KeditorState;)V", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface ItemViewHandler {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public static final class DefaultImpls {
        public static View onViewCreated$default(ItemViewHandler itemViewHandler0, ViewGroup viewGroup0, LayoutInflater layoutInflater0, int v, Object object0) {
            if(object0 != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onViewCreated");
            }
            if((v & 2) != 0) {
                layoutInflater0 = LayoutInflater.from(viewGroup0.getContext());
                Intrinsics.checkNotNullExpressionValue(layoutInflater0, "from(...)");
            }
            return itemViewHandler0.onViewCreated(viewGroup0, layoutInflater0);
        }
    }

    void onItemBound(@NotNull View arg1, @NotNull KeditorItem arg2, int arg3, @NotNull KeditorState arg4);

    @NotNull
    View onViewCreated(@NotNull ViewGroup arg1, @NotNull LayoutInflater arg2);
}

