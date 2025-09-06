package com.kakao.keditor.plugin.itemspec.emoticon;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemEmoticonBinding;
import com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "emoticon")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0003J\u001C\u0010\"\u001A\u00020#2\b\u0010$\u001A\u0004\u0018\u00010%2\b\u0010&\u001A\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\'\u001A\u00020#2\u0006\u0010(\u001A\u00020)H\u0016J\b\u0010*\u001A\u00020+H\u0016J(\u0010,\u001A\u00020#2\u0006\u0010&\u001A\u00020\u00052\u0006\u0010$\u001A\u00020%2\u0006\u0010-\u001A\u00020\u000B2\u0006\u0010.\u001A\u00020/H\u0016J\u0018\u00100\u001A\u00020\u00052\u0006\u00101\u001A\u0002022\u0006\u00103\u001A\u000204H\u0016J\u0010\u00105\u001A\u0002062\u0006\u0010$\u001A\u00020\u0002H\u0014J,\u00107\u001A\u00020\u00022\u0006\u0010(\u001A\u00020)2\u0006\u0010$\u001A\u0002062\u0012\u00108\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020:09H\u0014R\u001A\u0010\u0004\u001A\u00020\u0005X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000FR&\u0010\u0013\u001A\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00160\u0014X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0019\u001A\u00020\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\r\"\u0004\b\u001B\u0010\u000FR\u001A\u0010\u001C\u001A\u00020\u001DX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!\u00A8\u0006;"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/emoticon/EmoticonItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/emoticon/EmoticonItem;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class EmoticonItemSpec extends RootItemSpec {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarSimpleAlignmentMenuBinding menuBinding;

    public EmoticonItemSpec() {
        this.knownEnumValues = w.mapOf(TuplesKt.to("align", Alignment.Companion.typeSet()));
        this.layout = layout.ke_item_emoticon;
        this.contextMenulayout = layout.ke_toolbar_simple_alignment_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.emoticon.EmoticonItem");
        this.getMenuBinding().setAlignment(((EmoticonItem)keditorItem0).getAlignment());
        this.getMenuBinding().setAlignMenuClickListener(new SimpleAlignMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onAlignmentClicked(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Alignment alignment1 = alignment0.next(Others.INSTANCE);
                ((EmoticonItem)this).setAlignment(alignment1);
                EmoticonItemSpec.this.getMenuBinding().setAlignment(((EmoticonItem)this).getAlignment());
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(0, 1, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "emoticon-toolbar", "alignAlignment", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(EmoticonItemSpec.this.indexOf(this), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "emoticon-toolbar", "remove", null, 4, null);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarSimpleAlignmentMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
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

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Map getKnownEnumValues() {
        return this.knownEnumValues;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public int getLayout() {
        return this.layout;
    }

    @NotNull
    public final KeToolbarSimpleAlignmentMenuBinding getMenuBinding() {
        KeToolbarSimpleAlignmentMenuBinding keToolbarSimpleAlignmentMenuBinding0 = this.menuBinding;
        if(keToolbarSimpleAlignmentMenuBinding0 != null) {
            return keToolbarSimpleAlignmentMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemEmoticonBinding keItemEmoticonBinding0 = (KeItemEmoticonBinding)DataBindingUtil.bind(view0);
        if(keItemEmoticonBinding0 != null) {
            keItemEmoticonBinding0.setItem(((EmoticonItem)keditorItem0));
        }
        if(keItemEmoticonBinding0 != null) {
            keItemEmoticonBinding0.setHasFocus(keditorState0.getFocusedItemPosition() == v);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        View view0 = ((KeItemEmoticonBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false)).getRoot();
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

    public final void setMenuBinding(@NotNull KeToolbarSimpleAlignmentMenuBinding keToolbarSimpleAlignmentMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarSimpleAlignmentMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarSimpleAlignmentMenuBinding0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((EmoticonItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull EmoticonItem emoticonItem0) {
        Intrinsics.checkNotNullParameter(emoticonItem0, "item");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("src", emoticonItem0.getSrc());
        linkedHashMap0.put("type", emoticonItem0.getPackId());
        linkedHashMap0.put("name", emoticonItem0.getId());
        linkedHashMap0.put("align", emoticonItem0.getValueOrBypass("align", "alignAlignment"));
        linkedHashMap0.put("isAnimation", Boolean.valueOf(emoticonItem0.isAnimation()));
        return new Item("emoticon", linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public EmoticonItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        String s = String.valueOf(ItemValidatorKt.pop(map0, "type", true));
        String s1 = String.valueOf(ItemValidatorKt.pop(map0, "name", true));
        String s2 = String.valueOf(ItemValidatorKt.pop(map0, "src", true));
        String s3 = this.popValueOrDefault(map0, "align", "alignCenter", true);
        return new EmoticonItem(s, s1, s2, Alignment.Companion.byNameText(s3, Others.INSTANCE));
    }
}

