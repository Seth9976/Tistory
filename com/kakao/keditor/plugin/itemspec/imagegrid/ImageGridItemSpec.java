package com.kakao.keditor.plugin.itemspec.imagegrid;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.room.a;
import com.google.android.material.datepicker.i;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemImageGridBinding;
import com.kakao.keditor.databinding.KeToolbarImageGridMenuBindingImpl;
import com.kakao.keditor.media.MediaItemDecoration;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener.DefaultImpls;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.plugin.pluginspec.imagegrid.ImageGridAdapter;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.AutoTemplateLayout.Adapter;
import com.kakao.keditor.plugin.pluginspec.imagegrid.layout.KeditorImageGridLayout;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;
import com.kakao.keditor.util.eventbus.ViewRequest;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "imageGrid")
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000E\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010\u001E\u001A\u00020\u001F2\b\u0010 \u001A\u0004\u0018\u00010!2\b\u0010\"\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010#\u001A\u00020\u001F2\u0006\u0010$\u001A\u00020%H\u0016J\b\u0010&\u001A\u00020\u0002H\u0016J\b\u0010\'\u001A\u00020(H\u0016J\b\u0010)\u001A\u00020*H\u0016J\u001C\u0010+\u001A\u00020,2\u0012\u0010-\u001A\u000E\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0002J(\u00101\u001A\u00020\u001F2\u0006\u0010\"\u001A\u00020\u00062\u0006\u0010 \u001A\u00020!2\u0006\u00102\u001A\u00020\f2\u0006\u00103\u001A\u000204H\u0016J\u001A\u00105\u001A\u00020\u001F2\b\u00106\u001A\u0004\u0018\u00010\u00062\u0006\u00107\u001A\u000208H\u0016J\u0018\u00109\u001A\u00020\u00062\u0006\u0010:\u001A\u00020;2\u0006\u0010<\u001A\u00020=H\u0016J\u0010\u0010>\u001A\u00020?2\u0006\u0010 \u001A\u00020\u0002H\u0014J,\u0010@\u001A\u00020\u00022\u0006\u0010$\u001A\u00020%2\u0006\u0010 \u001A\u00020?2\u0012\u0010A\u001A\u000E\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u0002000.H\u0014R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R\u001A\u0010\u0014\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0015\u0010\u000E\"\u0004\b\u0016\u0010\u0010R\u000E\u0010\u0017\u001A\u00020\fX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u0010\u0018\u001A\u00020\u0019X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001A\u0010\u001B\"\u0004\b\u001C\u0010\u001D\u00A8\u0006B"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "layout", "getLayout", "setLayout", "maxImageCount", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarImageGridMenuBindingImpl;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarImageGridMenuBindingImpl;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarImageGridMenuBindingImpl;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "mapToCellItem", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridCellItem;", "map", "", "", "", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onRenderingRequest", "itemView", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageGridItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageGridItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItemSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n+ 4 TextView.kt\nandroidx/core/widget/TextViewKt\n*L\n1#1,167:1\n1855#2:168\n1855#2,2:169\n1856#2:171\n1549#2:172\n1620#2,3:173\n1549#2:176\n1620#2,3:177\n136#3,12:180\n136#3,12:192\n65#4,16:204\n93#4,3:220\n*S KotlinDebug\n*F\n+ 1 ImageGridItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItemSpec\n*L\n43#1:168\n44#1:169,2\n43#1:171\n49#1:172\n49#1:173,3\n66#1:176\n66#1:177,3\n86#1:180,12\n90#1:192,12\n97#1:204,16\n97#1:220,3\n*E\n"})
public final class ImageGridItemSpec extends RootItemSpec implements HasItemDecoration {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    private int layout;
    private int maxImageCount;
    public KeToolbarImageGridMenuBindingImpl menuBinding;

    public ImageGridItemSpec() {
        this.maxImageCount = 14;
        this.layout = layout.ke_item_image_grid;
        this.contextMenulayout = layout.ke_toolbar_image_grid_menu;
    }

    public static void a(ImageGridItemSpec imageGridItemSpec0, View view0, boolean z) {
        ImageGridItemSpec.onViewCreated$lambda$11(imageGridItemSpec0, view0, z);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        KeToolbarImageGridMenuBindingImpl keToolbarImageGridMenuBindingImpl0 = this.getMenuBinding();
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItem");
        keToolbarImageGridMenuBindingImpl0.setImageGrid(((ImageGridItem)keditorItem0));
        int v = this.indexOf(keditorItem0);
        this.getMenuBinding().setMediaMenuListener(new MediaMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onAlignmentChanged(@NotNull Alignment alignment0) {
                DefaultImpls.onAlignmentChanged(this, alignment0);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onEditImageClicked() {
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onEditImageGridClicked() {
                KeditorItem keditorItem0 = ImageGridItemSpec.this.getItem(this);
                EditKeditorItem pluginSpecRequest$EditKeditorItem0 = new EditKeditorItem("imageGrid", this, keditorItem0);
                KeEvent.INSTANCE.postInScope(pluginSpecRequest$EditKeditorItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "imagegrid-toolbar", "edit", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onLinkClicked() {
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onMobileStyleChangeClicked(@NotNull MobileStyle mobileStyle0) {
                DefaultImpls.onMobileStyleChangeClicked(this, mobileStyle0);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(this, false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "imagegrid-toolbar", "remove", null, 4, null);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarImageGridMenuBindingImpl)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem createKeditorItem() {
        return this.createKeditorItem();
    }

    @NotNull
    public ImageGridItem createKeditorItem() {
        return new ImageGridItem(null, null, null, 7, null);
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
    public final KeToolbarImageGridMenuBindingImpl getMenuBinding() {
        KeToolbarImageGridMenuBindingImpl keToolbarImageGridMenuBindingImpl0 = this.menuBinding;
        if(keToolbarImageGridMenuBindingImpl0 != null) {
            return keToolbarImageGridMenuBindingImpl0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return MediaItemDecoration.INSTANCE;
    }

    private final ImageGridCellItem mapToCellItem(Map map0) {
        String s;
        ImageGridCellItem imageGridCellItem0 = new ImageGridCellItem(null, 0, 0, 0.0, null, null, null, false, false, 0x1FF, null);
        Object object0 = ItemValidatorKt.pop(map0, "src", true);
        if(object0 == null) {
            s = "";
        }
        else {
            s = object0.toString();
            if(s == null) {
                s = "";
            }
        }
        imageGridCellItem0.setSrc(s);
        Object object1 = ItemValidatorKt.pop(map0, "originWidth", true);
        String s1 = null;
        Number number0 = object1 instanceof Number ? ((Number)object1) : null;
        imageGridCellItem0.setOriginWidth((number0 == null ? 0 : number0.intValue()));
        Object object2 = ItemValidatorKt.pop(map0, "originHeight", true);
        Number number1 = object2 instanceof Number ? ((Number)object2) : null;
        imageGridCellItem0.setOriginHeight((number1 == null ? 0 : number1.intValue()));
        Object object3 = ItemValidatorKt.pop(map0, "widthPercent", true);
        Double double0 = object3 instanceof Double ? ((Double)object3) : null;
        imageGridCellItem0.setWidthPercent((double0 == null ? 0.0 : ((double)double0)));
        Object object4 = ItemValidatorKt.pop$default(map0, "alt", false, 2, null);
        if(object4 != null) {
            s1 = object4.toString();
        }
        imageGridCellItem0.setAlt(s1);
        imageGridCellItem0.setBypassStored(map0);
        return imageGridCellItem0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemImageGridBinding keItemImageGridBinding0 = (KeItemImageGridBinding)DataBindingUtil.bind(view0);
        if(keItemImageGridBinding0 != null) {
            keItemImageGridBinding0.setImageGridItem(((ImageGridItem)keditorItem0));
            keItemImageGridBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
            Adapter autoTemplateLayout$Adapter0 = keItemImageGridBinding0.keImageGridLayout.getAdapter();
            ImageGridAdapter imageGridAdapter0 = autoTemplateLayout$Adapter0 instanceof ImageGridAdapter ? ((ImageGridAdapter)autoTemplateLayout$Adapter0) : null;
            if(imageGridAdapter0 != null) {
                if(!Intrinsics.areEqual(imageGridAdapter0.getImageGridItem(), keditorItem0)) {
                    imageGridAdapter0.setImageGridItem(((ImageGridItem)keditorItem0));
                    imageGridAdapter0.notifyDataSetChanged();
                }
                ((ImageGridItem)keditorItem0).consumePendingClearRepresentViewIndex(new Function1() {
                    final ImageGridAdapter $this_run;

                    {
                        this.$this_run = imageGridAdapter0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((Number)object0).intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(int v) {
                        this.$this_run.notifyItemChanged(v);
                    }
                });
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void onRenderingRequest(@Nullable View view0, @NotNull ViewRequest viewRequest0) {
        Intrinsics.checkNotNullParameter(viewRequest0, "request");
        if(viewRequest0 instanceof UpdateRepresentState) {
            KeditorItem keditorItem0 = ((UpdateRepresentState)viewRequest0).getItem();
            ImageGridItem imageGridItem0 = keditorItem0 instanceof ImageGridItem ? ((ImageGridItem)keditorItem0) : null;
            if(imageGridItem0 != null) {
                if(!((UpdateRepresentState)viewRequest0).isSet()) {
                    imageGridItem0.clearRepresentativeInternal();
                }
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(((UpdateRepresentState)viewRequest0).getPosition());
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Double double1;
        Boolean boolean0;
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        boolean z = false;
        KeItemImageGridBinding keItemImageGridBinding0 = (KeItemImageGridBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        KeditorImageGridLayout keditorImageGridLayout0 = keItemImageGridBinding0.keImageGridLayout;
        Intrinsics.checkNotNullExpressionValue(keditorImageGridLayout0, "keImageGridLayout");
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        Double double0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("representative_image_enabled")) {
            Object object1 = keditor0.getConfig().get("representative_image_enabled");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            boolean0 = (Boolean)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("representative_image_enabled");
            if(!(object0 instanceof Boolean)) {
                object0 = null;
            }
            boolean0 = (Boolean)object0;
        }
        if(boolean0 == null) {
            boolean0 = null;
        }
        if(boolean0 != null) {
            z = boolean0.booleanValue();
        }
        ImageGridAdapter imageGridAdapter0 = new ImageGridAdapter(keditorImageGridLayout0, null, false, z, 6, null);
        keItemImageGridBinding0.keImageGridLayout.setAdapter(imageGridAdapter0);
        Integer integer1 = this.getEditorId();
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer1, null) == null || !((Map)a.g(keditor0, integer1)).containsKey("image_grid_max_count")) {
            Object object3 = keditor0.getConfig().get("image_grid_max_count");
            if(!(object3 instanceof Double)) {
                object3 = null;
            }
            double1 = (Double)object3;
        }
        else {
            Object object2 = ((Map)a.g(keditor0, integer1)).get("image_grid_max_count");
            if(!(object2 instanceof Double)) {
                object2 = null;
            }
            double1 = (Double)object2;
        }
        if(double1 != null) {
            double0 = double1;
        }
        this.maxImageCount = double0 == null ? 14 : ((int)(((double)double0)));
        i i0 = new i(this, 2);
        keItemImageGridBinding0.keItemImageGridLayoutWrapper.setOnFocusChangeListener(i0);
        Intrinsics.checkNotNullExpressionValue(keItemImageGridBinding0.keItemImageGridCaptionEditText, "keItemImageGridCaptionEditText");
        EditTextStandardKt.applyCustomFont(keItemImageGridBinding0.keItemImageGridCaptionEditText);
        Intrinsics.checkNotNullExpressionValue(keItemImageGridBinding0.keItemImageGridCaptionEditText, "keItemImageGridCaptionEditText");
        com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItemSpec.onViewCreated..inlined.addTextChangedListener.default.1 imageGridItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                if(v2 == 1 && charSequence0 != null && charSequence0.length() > 0 && charSequence0.length() > v && charSequence0.charAt(v) == 10) {
                    this.keItemImageGridCaptionEditText.getText().delete(v, v + 1);
                }
                View view0 = this.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItemSpec.onViewCreated.2.1 imageGridItemSpec$onViewCreated$2$10 = new com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItemSpec.onViewCreated.2.1(charSequence0);
                ImageGridItemSpec.this.ifFoundItem(view0, imageGridItemSpec$onViewCreated$2$10);
            }
        };
        keItemImageGridBinding0.keItemImageGridCaptionEditText.addTextChangedListener(imageGridItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10);
        View view0 = keItemImageGridBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/imagegrid/ImageGridItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItemSpec.onViewCreated.2.1 extends Lambda implements Function1 {
            final CharSequence $s;

            public com.kakao.keditor.plugin.itemspec.imagegrid.ImageGridItemSpec.onViewCreated.2.1(CharSequence charSequence0) {
                this.$s = charSequence0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((ImageGridItem)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ImageGridItem imageGridItem0) {
                Intrinsics.checkNotNullParameter(imageGridItem0, "it");
                imageGridItem0.setCaption(String.valueOf(this.$s));
            }
        }

    }

    private static final void onViewCreated$lambda$11(ImageGridItemSpec imageGridItemSpec0, View view0, boolean z) {
        Intrinsics.checkNotNullParameter(imageGridItemSpec0, "this$0");
        if(z) {
            KeditorView keditorView0 = imageGridItemSpec0.findKeditorView();
            if(keditorView0 != null) {
                keditorView0.stopScroll();
            }
        }
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

    public final void setMenuBinding(@NotNull KeToolbarImageGridMenuBindingImpl keToolbarImageGridMenuBindingImpl0) {
        Intrinsics.checkNotNullParameter(keToolbarImageGridMenuBindingImpl0, "<set-?>");
        this.menuBinding = keToolbarImageGridMenuBindingImpl0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((ImageGridItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull ImageGridItem imageGridItem0) {
        Intrinsics.checkNotNullParameter(imageGridItem0, "item");
        String s = imageGridItem0.getType();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("caption", imageGridItem0.getCaption());
        ArrayList arrayList0 = new ArrayList();
        Iterable iterable0 = imageGridItem0.getImages();
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            Map map0 = x.toMutableMap(((ImageGridCellItem)object0).toMap());
            map0.putAll(((ImageGridCellItem)object0).getBypassStored());
            arrayList1.add(map0);
        }
        List list0 = CollectionsKt___CollectionsKt.toMutableList(arrayList1);
        int v = 0;
        for(Object object1: imageGridItem0.getShape()) {
            int v1 = ((Number)object1).intValue() + v;
            arrayList0.add(CollectionsKt___CollectionsKt.toMutableList(list0.subList(v, v1)));
            v = v1;
        }
        linkedHashMap0.put("images", arrayList0);
        return new Item(s, linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public ImageGridItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        ImageGridItem imageGridItem0 = new ImageGridItem(null, null, null, 7, null);
        Object object0 = ItemValidatorKt.pop$default(map0, "caption", false, 2, null);
        if(object0 == null) {
            s = "";
        }
        else {
            s = object0.toString();
            if(s == null) {
                s = "";
            }
        }
        imageGridItem0.setCaption(s);
        Object object1 = ItemValidatorKt.pop(map0, "images", true);
        Intrinsics.checkNotNull(object1, "null cannot be cast to non-null type kotlin.collections.List<kotlin.collections.List<kotlin.collections.Map<kotlin.String, kotlin.Any>>>");
        ArrayList arrayList0 = new ArrayList();
        for(Object object2: ((List)object1)) {
            for(Object object3: ((List)object2)) {
                arrayList0.add(this.mapToCellItem(x.toMutableMap(((Map)object3))));
            }
        }
        imageGridItem0.setImages(arrayList0);
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(((List)object1), 10));
        for(Object object4: ((List)object1)) {
            arrayList1.add(((List)object4).size());
        }
        imageGridItem0.setShape(arrayList1);
        return imageGridItem0;
    }
}

