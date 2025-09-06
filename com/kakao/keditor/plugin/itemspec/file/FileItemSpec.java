package com.kakao.keditor.plugin.itemspec.file;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemFileBinding;
import com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.w;
import kotlin.collections.x;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "file")
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010#\u001A\u00020$2\b\u0010%\u001A\u0004\u0018\u00010&2\b\u0010\'\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010(\u001A\u00020$2\u0006\u0010)\u001A\u00020*H\u0016J\b\u0010+\u001A\u00020&H\u0016J\b\u0010,\u001A\u00020-H\u0016J\b\u0010.\u001A\u00020/H\u0016J(\u00100\u001A\u00020$2\u0006\u0010\'\u001A\u00020\u00062\u0006\u0010%\u001A\u00020&2\u0006\u00101\u001A\u00020\f2\u0006\u00102\u001A\u000203H\u0016J\u0018\u00104\u001A\u00020\u00062\u0006\u00105\u001A\u0002062\u0006\u00107\u001A\u000208H\u0016J\u0010\u00109\u001A\u00020:2\u0006\u0010%\u001A\u00020\u0002H\u0014J,\u0010;\u001A\u00020\u00022\u0006\u0010)\u001A\u00020*2\u0006\u0010%\u001A\u00020:2\u0012\u0010<\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020>0=H\u0014R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001A\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u0015X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0010R\u001A\u0010\u001D\u001A\u00020\u001EX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"\u00A8\u0006?"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/file/FileItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/file/FileItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "itemDecoration", "Lcom/kakao/keditor/plugin/itemspec/file/FileItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class FileItemSpec extends RootItemSpec implements HasItemDecoration {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarSimpleAlignmentMenuBinding menuBinding;

    public FileItemSpec() {
        this.knownEnumValues = w.mapOf(TuplesKt.to("align", Alignment.Companion.typeSet()));
        this.layout = layout.ke_item_file;
        this.contextMenulayout = layout.ke_toolbar_simple_alignment_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.file.FileItem");
        this.getMenuBinding().setAlignment(((FileItem)keditorItem0).getAlignment());
        this.getMenuBinding().setAlignMenuClickListener(new SimpleAlignMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onAlignmentClicked(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Alignment alignment1 = alignment0.next(Others.INSTANCE);
                ((FileItem)this).setAlignment(alignment1);
                FileItemSpec.this.getMenuBinding().setAlignment(((FileItem)this).getAlignment());
                Keditor.clickEvent$default(Keditor.INSTANCE, "file-toolbar", "alignAlignment", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(FileItemSpec.this.indexOf(this), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "file-toolbar", "remove", null, 4, null);
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

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @NotNull
    public KeditorItem createKeditorItem() {
        return new FileItem();
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

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    public ItemDecoration itemDecoration() {
        return this.itemDecoration();
    }

    @NotNull
    public FileItemDecoration itemDecoration() {
        return FileItemDecoration.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemFileBinding keItemFileBinding0 = (KeItemFileBinding)DataBindingUtil.bind(view0);
        if(keItemFileBinding0 != null) {
            keItemFileBinding0.setFileItem(((FileItem)keditorItem0));
            keItemFileBinding0.setHasFocus(keditorState0.getFocusedItemPosition() == v);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemFileBinding keItemFileBinding0 = (KeItemFileBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        View view0 = keItemFileBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        ViewStandardKt.setShadowBlur(view0);
        Intrinsics.checkNotNullExpressionValue(keItemFileBinding0.keItemFileName, "keItemFileName");
        EditTextStandardKt.applyCustomFont(keItemFileBinding0.keItemFileName);
        View view1 = keItemFileBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view1, "getRoot(...)");
        return view1;
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
        return this.toCdmItem(((FileItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull FileItem fileItem0) {
        Intrinsics.checkNotNullParameter(fileItem0, "item");
        Map map0 = x.mutableMapOf(new Pair[]{TuplesKt.to("src", fileItem0.getSrc()), TuplesKt.to("name", fileItem0.getName()), TuplesKt.to("size", fileItem0.getSize()), TuplesKt.to("align", "alignAlignment")});
        String s = fileItem0.getMimeType();
        if(s != null) {
            map0.put("mimeType", s);
        }
        return new Item("file", map0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public FileItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s2;
        String s1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        FileItem fileItem0 = new FileItem();
        Object object0 = ItemValidatorKt.pop(map0, "src", true);
        String s = "";
        if(object0 == null) {
            s1 = "";
        }
        else {
            s1 = object0.toString();
            if(s1 == null) {
                s1 = "";
            }
        }
        fileItem0.setSrc(s1);
        Object object1 = ItemValidatorKt.pop(map0, "name", true);
        if(object1 == null) {
            s2 = "";
        }
        else {
            s2 = object1.toString();
            if(s2 == null) {
                s2 = "";
            }
        }
        fileItem0.setName(s2);
        Object object2 = ItemValidatorKt.pop(map0, "size", true);
        Double double0 = object2 instanceof Double ? ((Double)object2) : null;
        fileItem0.setSize((double0 == null ? 0L : ((long)(((double)double0)))));
        String s3 = this.popValueOrDefault(map0, "align", "alignCenter", true);
        fileItem0.setAlignment(Alignment.Companion.byNameText(s3, Others.INSTANCE));
        Object object3 = ItemValidatorKt.pop$default(map0, "mimeType", false, 2, null);
        if(object3 != null) {
            String s4 = object3.toString();
            if(s4 != null) {
                s = s4;
            }
        }
        fileItem0.setMimeType(s);
        fileItem0.setLocation((new Regex("https?://").containsMatchIn(fileItem0.getSrc()) ? Location.UPLOADED : Location.LOCAL));
        return fileItem0;
    }
}

