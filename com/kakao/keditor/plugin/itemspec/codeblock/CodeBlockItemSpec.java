package com.kakao.keditor.plugin.itemspec.codeblock;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.room.a;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemCodeBlockBinding;
import com.kakao.keditor.databinding.KeToolbarCodeBlockMenuBinding;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "codeblock")
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010*\u001A\u00020+2\b\u0010,\u001A\u0004\u0018\u00010-2\b\u0010.\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010/\u001A\u00020+2\u0006\u00100\u001A\u000201H\u0016J\b\u00102\u001A\u00020-H\u0016J\b\u00103\u001A\u000204H\u0016J\b\u00105\u001A\u000206H\u0016J(\u00107\u001A\u00020+2\u0006\u0010.\u001A\u00020\u00062\u0006\u0010,\u001A\u00020-2\u0006\u00108\u001A\u00020\f2\u0006\u00109\u001A\u00020:H\u0016J\u0018\u0010;\u001A\u00020\u00062\u0006\u0010<\u001A\u00020=2\u0006\u0010>\u001A\u00020?H\u0016J\u0010\u0010@\u001A\u00020A2\u0006\u0010,\u001A\u00020\u0002H\u0014J,\u0010B\u001A\u00020\u00022\u0006\u00100\u001A\u0002012\u0006\u0010,\u001A\u00020A2\u0012\u0010C\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020E0DH\u0014R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001A\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u0015X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0010R\u001A\u0010\u001D\u001A\u00020\u001EX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001A\u0012\u0012\u0004\u0012\u00020\u00160$j\b\u0012\u0004\u0012\u00020\u0016`%X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b&\u0010\'\"\u0004\b(\u0010)\u00A8\u0006F"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarCodeBlockMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarCodeBlockMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarCodeBlockMenuBinding;)V", "supportedLanguages", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getSupportedLanguages", "()Ljava/util/ArrayList;", "setSupportedLanguages", "(Ljava/util/ArrayList;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCodeBlockItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CodeBlockItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItemSpec\n+ 2 Keditor.kt\ncom/kakao/keditor/Keditor\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n136#2,12:102\n1549#3:114\n1620#3,3:115\n*S KotlinDebug\n*F\n+ 1 CodeBlockItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/codeblock/CodeBlockItemSpec\n*L\n32#1:102,12\n36#1:114\n36#1:115,3\n*E\n"})
public final class CodeBlockItemSpec extends RootItemSpec implements HasItemDecoration {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarCodeBlockMenuBinding menuBinding;
    @NotNull
    private ArrayList supportedLanguages;

    public CodeBlockItemSpec() {
        ArrayList arrayList1;
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        ArrayList arrayList0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("code_block_languages")) {
            Object object1 = keditor0.getConfig().get("code_block_languages");
            if(!(object1 instanceof ArrayList)) {
                object1 = null;
            }
            arrayList1 = (ArrayList)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("code_block_languages");
            if(!(object0 instanceof ArrayList)) {
                object0 = null;
            }
            arrayList1 = (ArrayList)object0;
        }
        if(arrayList1 != null) {
            arrayList0 = arrayList1;
        }
        if(arrayList0 == null) {
            arrayList0 = CollectionsKt__CollectionsKt.arrayListOf(new String[]{"HTML", "Javascript", "Python", "Java", "C++", "Kotlin", "Swift", "PHP", "Go", "C#", "SQL", "Scala", "R"});
        }
        this.supportedLanguages = arrayList0;
        ArrayList arrayList2 = new ArrayList(l.collectionSizeOrDefault(arrayList0, 10));
        for(Object object2: arrayList0) {
            arrayList2.add(a.k(Locale.ROOT, "ROOT", ((String)object2), Locale.ROOT, "toLowerCase(...)"));
        }
        this.knownEnumValues = x.mutableMapOf(new Pair[]{TuplesKt.to("language", CollectionsKt___CollectionsKt.toSet(arrayList2))});
        this.layout = layout.ke_item_code_block;
        this.contextMenulayout = layout.ke_toolbar_code_block_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.codeblock.CodeBlockItem");
        CodeBlockItem codeBlockItem0 = (CodeBlockItem)keditorItem0;
        int v = this.indexOf(keditorItem0);
        this.getMenuBinding().setCodeMenuListener(new CodeMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener
            public void onItemEditClicked() {
                KeditorItem keditorItem0 = CodeBlockItemSpec.this.getItem(this);
                EditKeditorItem pluginSpecRequest$EditKeditorItem0 = new EditKeditorItem("codeblock", this, keditorItem0);
                KeEvent.INSTANCE.postInScope(pluginSpecRequest$EditKeditorItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "codeblock-toolbar", "edit", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(this, false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "codeblock-toolbar", "remove", null, 4, null);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarCodeBlockMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @NotNull
    public KeditorItem createKeditorItem() {
        return new CodeBlockItem();
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
    public final KeToolbarCodeBlockMenuBinding getMenuBinding() {
        KeToolbarCodeBlockMenuBinding keToolbarCodeBlockMenuBinding0 = this.menuBinding;
        if(keToolbarCodeBlockMenuBinding0 != null) {
            return keToolbarCodeBlockMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @NotNull
    public final ArrayList getSupportedLanguages() {
        return this.supportedLanguages;
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return CodeBlockItemDecoration.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemCodeBlockBinding keItemCodeBlockBinding0 = (KeItemCodeBlockBinding)DataBindingUtil.bind(view0);
        if(keItemCodeBlockBinding0 != null) {
            keItemCodeBlockBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
            keItemCodeBlockBinding0.setItem(((CodeBlockItem)keditorItem0));
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        View view0 = ((KeItemCodeBlockBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false)).getRoot();
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

    public final void setMenuBinding(@NotNull KeToolbarCodeBlockMenuBinding keToolbarCodeBlockMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarCodeBlockMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarCodeBlockMenuBinding0;
    }

    public final void setSupportedLanguages(@NotNull ArrayList arrayList0) {
        Intrinsics.checkNotNullParameter(arrayList0, "<set-?>");
        this.supportedLanguages = arrayList0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((CodeBlockItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull CodeBlockItem codeBlockItem0) {
        Intrinsics.checkNotNullParameter(codeBlockItem0, "item");
        String s = codeBlockItem0.getType();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("text", codeBlockItem0.getCode());
        String s1 = codeBlockItem0.getValueOrBypass("language", codeBlockItem0.getLanguageName());
        linkedHashMap0.put("language", a.k(Locale.ROOT, "ROOT", s1, Locale.ROOT, "toLowerCase(...)"));
        return new Item(s, linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public CodeBlockItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        CodeBlockItem codeBlockItem0 = new CodeBlockItem();
        Object object0 = ItemValidatorKt.pop(map0, "text", true);
        if(object0 == null) {
            s = "";
        }
        else {
            s = object0.toString();
            if(s == null) {
                s = "";
            }
        }
        codeBlockItem0.setCode(s);
        String s1 = this.popValueOrDefault(map0, "language", String.valueOf(CollectionsKt___CollectionsKt.firstOrNull(this.supportedLanguages)), true);
        for(Object object1: this.supportedLanguages) {
            Locale locale0 = Locale.ROOT;
            if(!Intrinsics.areEqual(a.k(locale0, "ROOT", ((String)object1), locale0, "toLowerCase(...)"), a.k(locale0, "ROOT", s1, locale0, "toLowerCase(...)"))) {
                continue;
            }
            goto label_20;
        }
        object1 = null;
    label_20:
        String s2 = (String)object1;
        if(s2 == null) {
            s2 = String.valueOf(CollectionsKt___CollectionsKt.firstOrNull(this.supportedLanguages));
        }
        codeBlockItem0.setLanguageName(s2);
        return codeBlockItem0;
    }
}

