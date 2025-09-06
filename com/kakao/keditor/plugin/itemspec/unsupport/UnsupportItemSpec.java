package com.kakao.keditor.plugin.itemspec.unsupport;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemUnsupportedBinding;
import com.kakao.keditor.databinding.KeToolbarSimpleDeletionMenuBinding;
import com.kakao.keditor.exception.NotMatchedModelException;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleDeleteMenuClickListener;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "unsupported")
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010\u001D\u001A\u00020\u001E2\b\u0010\u001F\u001A\u0004\u0018\u00010 2\b\u0010!\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010\"\u001A\u00020\u001E2\u0006\u0010#\u001A\u00020$H\u0016J\n\u0010%\u001A\u0004\u0018\u00010 H\u0016J\b\u0010&\u001A\u00020\'H\u0016J\u0010\u0010(\u001A\u00020)2\u0006\u0010\u001F\u001A\u00020*H\u0016J\b\u0010+\u001A\u00020,H\u0016J(\u0010-\u001A\u00020\u001E2\u0006\u0010!\u001A\u00020\u00062\u0006\u0010\u001F\u001A\u00020 2\u0006\u0010.\u001A\u00020\f2\u0006\u0010/\u001A\u000200H\u0016J\u0018\u00101\u001A\u00020\u00062\u0006\u00102\u001A\u0002032\u0006\u00104\u001A\u000205H\u0016J\u0010\u00106\u001A\u00020*2\u0006\u0010\u001F\u001A\u00020\u0002H\u0014J,\u00107\u001A\u00020\u00022\u0006\u0010#\u001A\u00020$2\u0006\u0010\u001F\u001A\u00020*2\u0012\u00108\u001A\u000E\u0012\u0004\u0012\u00020:\u0012\u0004\u0012\u00020;09H\u0014R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R\u001A\u0010\u0014\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u000E\"\u0004\b\u0016\u0010\u0010R\u001A\u0010\u0017\u001A\u00020\u0018X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0019\u0010\u001A\"\u0004\b\u001B\u0010\u001C\u00A8\u0006<"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/unsupport/UnsupportItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/unsupport/UnSupportedItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarSimpleDeletionMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarSimpleDeletionMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarSimpleDeletionMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "isSupport", "", "Lcom/kakao/keditor/cdm/CDM$Item;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "toKeditorItem", "attr", "", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class UnsupportItemSpec extends RootItemSpec implements HasItemDecoration {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    private int layout;
    public KeToolbarSimpleDeletionMenuBinding menuBinding;

    public UnsupportItemSpec() {
        this.layout = layout.ke_item_unsupported;
        this.contextMenulayout = layout.ke_toolbar_simple_deletion_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        this.getMenuBinding().setDeleteListener(new SimpleDeleteMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleDeleteMenuClickListener
            public void onRemoveMenuClicked() {
                Intrinsics.checkNotNull(this.$item);
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(keditorItem0.indexOf(this.$item), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarSimpleDeletionMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @Nullable
    public KeditorItem createKeditorItem() {
        return null;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    @NotNull
    public ViewDataBinding getContextMenuBinding() {
        return this.getMenuBinding();
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    @NotNull
    public View getContextMenuLayoutView() {
        View view0 = this.contextMenuLayoutView;
        if(view0 != null) {
            return view0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("contextMenuLayoutView");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public int getContextMenulayout() {
        return this.contextMenulayout;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public int getEditorId() {
        return this.editorId;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public int getLayout() {
        return this.layout;
    }

    @NotNull
    public final KeToolbarSimpleDeletionMenuBinding getMenuBinding() {
        KeToolbarSimpleDeletionMenuBinding keToolbarSimpleDeletionMenuBinding0 = this.menuBinding;
        if(keToolbarSimpleDeletionMenuBinding0 != null) {
            return keToolbarSimpleDeletionMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    public boolean isSupport(@NotNull Item cDM$Item0) {
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        return true;
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return UnSupportedItemDecorationPolicy.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemUnsupportedBinding keItemUnsupportedBinding0 = (KeItemUnsupportedBinding)DataBindingUtil.bind(view0);
        if(keItemUnsupportedBinding0 != null) {
            UnSupportedItem unSupportedItem0 = keditorItem0 instanceof UnSupportedItem ? ((UnSupportedItem)keditorItem0) : null;
            boolean z = true;
            if(unSupportedItem0 == null) {
                unSupportedItem0 = new UnSupportedItem(null, 1, null);
            }
            keItemUnsupportedBinding0.setUnSupportedItem(unSupportedItem0);
            if(v != keditorState0.getFocusedItemPosition()) {
                z = false;
            }
            keItemUnsupportedBinding0.setHasFocus(z);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        View view0 = ((KeItemUnsupportedBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false)).getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setContextMenuLayoutView(@NotNull View view0) {
        Intrinsics.checkNotNullParameter(view0, "<set-?>");
        this.contextMenuLayoutView = view0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setContextMenulayout(int v) {
        this.contextMenulayout = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void setEditorId(int v) {
        this.editorId = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setLayout(int v) {
        this.layout = v;
    }

    public final void setMenuBinding(@NotNull KeToolbarSimpleDeletionMenuBinding keToolbarSimpleDeletionMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarSimpleDeletionMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarSimpleDeletionMenuBinding0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((UnSupportedItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull UnSupportedItem unSupportedItem0) {
        Intrinsics.checkNotNullParameter(unSupportedItem0, "item");
        Item cDM$Item0 = unSupportedItem0.getItem();
        if(cDM$Item0 == null) {
            throw new NotMatchedModelException();
        }
        return cDM$Item0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public UnSupportedItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        return new UnSupportedItem(cDM$Item0);
    }
}

