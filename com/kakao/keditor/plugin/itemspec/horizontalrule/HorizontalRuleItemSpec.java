package com.kakao.keditor.plugin.itemspec.horizontalrule;

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
import com.kakao.keditor.databinding.KeItemHorizontalRuleBinding;
import com.kakao.keditor.databinding.KeToolbarHorizontalRuleMenuBinding;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.itemspec.ItemValidator.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveFocusItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.f0;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "horizontalRule")
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00A2\u0006\u0002\u0010\u0003J\u001C\u0010\"\u001A\u00020#2\b\u0010$\u001A\u0004\u0018\u00010%2\b\u0010&\u001A\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\'\u001A\u00020#2\u0006\u0010(\u001A\u00020)H\u0016J\b\u0010*\u001A\u00020%H\u0016J\b\u0010+\u001A\u00020,H\u0016J(\u0010-\u001A\u00020#2\u0006\u0010&\u001A\u00020\u00052\u0006\u0010$\u001A\u00020%2\u0006\u0010.\u001A\u00020\u000B2\u0006\u0010/\u001A\u000200H\u0016J\u0018\u00101\u001A\u00020\u00052\u0006\u00102\u001A\u0002032\u0006\u00104\u001A\u000205H\u0016J\u0010\u00106\u001A\u0002072\u0006\u0010$\u001A\u00020\u0002H\u0014J,\u00108\u001A\u00020\u00022\u0006\u0010(\u001A\u00020)2\u0006\u0010$\u001A\u0002072\u0012\u00109\u001A\u000E\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020;0:H\u0014R\u001A\u0010\u0004\u001A\u00020\u0005X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000FR&\u0010\u0013\u001A\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00160\u0014X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0017\u0010\u0018R\u001A\u0010\u0019\u001A\u00020\u000BX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\r\"\u0004\b\u001B\u0010\u000FR\u001A\u0010\u001C\u001A\u00020\u001DX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!\u00A8\u0006<"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/horizontalrule/HorizontalRuleItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/horizontalrule/HorizontalRuleItem;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarHorizontalRuleMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarHorizontalRuleMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarHorizontalRuleMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HorizontalRuleItemSpec extends RootItemSpec {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarHorizontalRuleMenuBinding menuBinding;

    public HorizontalRuleItemSpec() {
        this.knownEnumValues = x.mapOf(new Pair[]{TuplesKt.to("style", f0.setOf(new String[]{"style1", "style2", "style3", "style4", "style5", "style6", "style7", "style8"})), TuplesKt.to("align", Alignment.Companion.typeSet())});
        this.layout = layout.ke_item_horizontal_rule;
        this.contextMenulayout = layout.ke_toolbar_horizontal_rule_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        KeToolbarHorizontalRuleMenuBinding keToolbarHorizontalRuleMenuBinding0 = this.getMenuBinding();
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleItem");
        keToolbarHorizontalRuleMenuBinding0.setHorizontalRule(((HorizontalRuleItem)keditorItem0));
        this.getMenuBinding().setListener(new HorizontalRuleMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleMenuClickListener
            public void removeItem() {
                KeEvent.INSTANCE.postInScope(RemoveFocusItem.INSTANCE);
                Keditor.clickEvent$default(Keditor.INSTANCE, "horizontalrule-toolbar", "remove", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.horizontalrule.HorizontalRuleMenuClickListener
            public void setStyle(@NotNull HorizontalRuleItem horizontalRuleItem0, @NotNull String s) {
                Intrinsics.checkNotNullParameter(horizontalRuleItem0, "item");
                Intrinsics.checkNotNullParameter(s, "style");
                horizontalRuleItem0.setStyle(s);
                HorizontalRuleItemSpec.this.getMenuBinding().setHorizontalRule(horizontalRuleItem0);
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(0, 1, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "horizontalrule-toolbar", s, null, 4, null);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarHorizontalRuleMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @NotNull
    public KeditorItem createKeditorItem() {
        return new HorizontalRuleItem();
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
    public final KeToolbarHorizontalRuleMenuBinding getMenuBinding() {
        KeToolbarHorizontalRuleMenuBinding keToolbarHorizontalRuleMenuBinding0 = this.menuBinding;
        if(keToolbarHorizontalRuleMenuBinding0 != null) {
            return keToolbarHorizontalRuleMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemHorizontalRuleBinding keItemHorizontalRuleBinding0 = (KeItemHorizontalRuleBinding)DataBindingUtil.bind(view0);
        if(keItemHorizontalRuleBinding0 == null) {
            keItemHorizontalRuleBinding0 = null;
        }
        else {
            keItemHorizontalRuleBinding0.setHorizontalRule(((HorizontalRuleItem)keditorItem0));
        }
        if(keItemHorizontalRuleBinding0 != null) {
            keItemHorizontalRuleBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        View view0 = ((KeItemHorizontalRuleBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false)).getRoot();
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

    public final void setMenuBinding(@NotNull KeToolbarHorizontalRuleMenuBinding keToolbarHorizontalRuleMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarHorizontalRuleMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarHorizontalRuleMenuBinding0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((HorizontalRuleItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull HorizontalRuleItem horizontalRuleItem0) {
        Intrinsics.checkNotNullParameter(horizontalRuleItem0, "item");
        String s = horizontalRuleItem0.getType();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("style", horizontalRuleItem0.getValueOrBypass("style", horizontalRuleItem0.getStyle()));
        linkedHashMap0.put("align", horizontalRuleItem0.getValueOrBypass("align", "alignAlignment"));
        return new Item(s, linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public HorizontalRuleItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        HorizontalRuleItem horizontalRuleItem0 = new HorizontalRuleItem();
        horizontalRuleItem0.setStyle(this.popValueOrDefault(map0, "style", "style1", true));
        String s = DefaultImpls.popValueOrDefault$default(this, map0, "align", "alignCenter", false, 8, null);
        horizontalRuleItem0.setAlignment(Alignment.Companion.byNameText(s, Others.INSTANCE));
        return horizontalRuleItem0;
    }
}

