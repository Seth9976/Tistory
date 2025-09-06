package com.kakao.keditor.plugin.itemspec.paragraph.overlay;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.databinding.KeToolbarSelectableItemBinding;
import com.kakao.keditor.plugin.attrs.text.CharacterSize;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuAdapter.OverlayItemViewHolder;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuAdapter;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\u000E\u0010\u0003\u001A\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005J\u001E\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000BH\u0016¨\u0006\f"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/paragraph/overlay/TextSizeOverlayAdapter;", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter;", "Lcom/kakao/keditor/plugin/attrs/text/CharacterSize;", "listener", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;", "(Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuClickedListener;)V", "onCreateViewHolder", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenuAdapter$OverlayItemViewHolder;", "parent", "Landroid/view/ViewGroup;", "viewType", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class TextSizeOverlayAdapter extends ToolbarOverlayMenuAdapter {
    public TextSizeOverlayAdapter(@Nullable ToolbarOverlayMenuClickedListener toolbarOverlayMenuClickedListener0) {
        super(toolbarOverlayMenuClickedListener0);
        this.setItems(CharacterSize.Companion.getAllList());
    }

    @Override  // androidx.recyclerview.widget.RecyclerView$Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup0, int v) {
        return this.onCreateViewHolder(viewGroup0, v);
    }

    @NotNull
    public OverlayItemViewHolder onCreateViewHolder(@NotNull ViewGroup viewGroup0, int v) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        View view0 = ((KeToolbarSelectableItemBinding)DataBindingUtil.inflate(LayoutInflater.from(viewGroup0.getContext()), layout.ke_toolbar_selectable_item, viewGroup0, false)).getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        OverlayItemViewHolder toolbarOverlayMenuAdapter$OverlayItemViewHolder0 = new OverlayItemViewHolder(view0);
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = toolbarOverlayMenuAdapter$OverlayItemViewHolder0.itemView.getLayoutParams();
        viewGroup$LayoutParams0.height = Math.min(viewGroup0.getMeasuredHeight() / 2, UnitConversionKt.dp2pxRoundDown(114.0f));
        return toolbarOverlayMenuAdapter$OverlayItemViewHolder0;
    }
}

