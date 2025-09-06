package com.kakao.keditor.plugin.itemspec.contentsearch;

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
import com.kakao.keditor.databinding.KeItemContentSearchBinding;
import com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding;
import com.kakao.keditor.delegate.ImageLoader.DefaultImpls;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.exception.NotMatchedModelException;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Failed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.contentsearch.attrs.Kind;
import com.kakao.keditor.plugin.itemspec.contentsearch.entity.ContentItem;
import com.kakao.keditor.plugin.itemspec.contentsearch.util.KeItemContentSearchBindingKt;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "contentSearch")
@Metadata(d1 = {"\u0000\u008E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010#\u001A\u00020$2\b\u0010%\u001A\u0004\u0018\u00010&2\b\u0010\'\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010(\u001A\u00020$2\u0006\u0010)\u001A\u00020*H\u0016J\b\u0010+\u001A\u00020,H\u0016J\b\u0010-\u001A\u00020.H\u0016J(\u0010/\u001A\u00020$2\u0006\u0010\'\u001A\u00020\u00062\u0006\u0010%\u001A\u00020&2\u0006\u00100\u001A\u00020\f2\u0006\u00101\u001A\u000202H\u0016J\u0018\u00103\u001A\u00020\u00062\u0006\u00104\u001A\u0002052\u0006\u00106\u001A\u000207H\u0016J\u0010\u00108\u001A\u0002092\u0006\u0010%\u001A\u00020\u0002H\u0014J,\u0010:\u001A\u00020\u00022\u0006\u0010)\u001A\u00020*2\u0006\u0010%\u001A\u0002092\u0012\u0010;\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020=0<H\u0014J\u0015\u0010>\u001A\u00020$*\u00020?2\u0006\u0010%\u001A\u00020@H\u0082\u0004R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001A\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u0015X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0010R\u001A\u0010\u001D\u001A\u00020\u001EX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"\u00A8\u0006A"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/ContentSearchItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "loadImage", "Lcom/kakao/keditor/databinding/KeItemContentSearchBinding;", "Lcom/kakao/keditor/plugin/itemspec/contentsearch/entity/ContentItem;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class ContentSearchItemSpec extends RootItemSpec implements HasItemDecoration {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarSimpleAlignmentMenuBinding menuBinding;

    public ContentSearchItemSpec() {
        this.knownEnumValues = x.mapOf(new Pair[]{TuplesKt.to("kind", Kind.Companion.typeSet()), TuplesKt.to("align", Alignment.Companion.typeSet())});
        this.layout = layout.ke_item_content_search;
        this.contextMenulayout = layout.ke_toolbar_simple_alignment_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.contentsearch.ContentSearchItem");
        this.getMenuBinding().setAlignment(((ContentSearchItem)keditorItem0).getAlignment());
        this.getMenuBinding().setAlignMenuClickListener(new SimpleAlignMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onAlignmentClicked(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Alignment alignment1 = alignment0.next(Others.INSTANCE);
                ((ContentSearchItem)this).setAlignment(alignment1);
                ContentSearchItemSpec.this.getMenuBinding().setAlignment(((ContentSearchItem)this).getAlignment());
                Keditor.clickEvent$default(Keditor.INSTANCE, "contentSearch-toolbar", "alignAlignment", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(ContentSearchItemSpec.this.indexOf(this), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "contentSearch-toolbar", "remove", null, 4, null);
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

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return ContentSearchItemDecoration.INSTANCE;
    }

    private final void loadImage(KeItemContentSearchBinding keItemContentSearchBinding0, ContentItem contentItem0) {
        ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
        if(imageLoader0 != null) {
            DefaultImpls.loadImage$default(imageLoader0, KeItemContentSearchBindingKt.getImageViewBy(keItemContentSearchBinding0, contentItem0.getKind()), contentItem0.getImage(), "contentSearch", null, null, new Function0() {
                final ContentItem $item;

                {
                    this.$item = contentItem0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$item.setLoadingStatus(Succeed.INSTANCE);
                }
            }, new Function0() {
                final ContentItem $item;

                {
                    this.$item = contentItem0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$item.setLoadingStatus(Failed.INSTANCE);
                }
            }, new Function0(contentItem0) {
                final ContentItem $item;
                final KeItemContentSearchBinding $this_loadImage;

                {
                    this.$this_loadImage = keItemContentSearchBinding0;
                    this.$item = contentItem0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$this_loadImage.setContentItem(this.$item);
                }
            }, true, 24, null);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        ContentItem contentItem0 = ((ContentSearchItem)keditorItem0).getContentItem();
        KeItemContentSearchBinding keItemContentSearchBinding0 = (KeItemContentSearchBinding)DataBindingUtil.bind(view0);
        if(keItemContentSearchBinding0 != null) {
            KeItemContentSearchBindingKt.setChildVisibleBy(keItemContentSearchBinding0, contentItem0.getKind());
            keItemContentSearchBinding0.setContentItem(contentItem0);
            keItemContentSearchBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
            this.loadImage(keItemContentSearchBinding0, contentItem0);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemContentSearchBinding keItemContentSearchBinding0 = (KeItemContentSearchBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        View view0 = keItemContentSearchBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        ViewStandardKt.setShadowBlur(view0);
        Intrinsics.checkNotNull(keItemContentSearchBinding0);
        KeItemContentSearchBindingKt.applyCustomFont(keItemContentSearchBinding0);
        View view1 = keItemContentSearchBinding0.getRoot();
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
        return this.toCdmItem(((ContentSearchItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull ContentSearchItem contentSearchItem0) {
        Intrinsics.checkNotNullParameter(contentSearchItem0, "item");
        String s = contentSearchItem0.getType();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("kind", contentSearchItem0.getValueOrBypass("kind", "kind"));
        linkedHashMap0.put("align", contentSearchItem0.getValueOrBypass("align", "alignAlignment"));
        linkedHashMap0.put("data", contentSearchItem0.getData());
        return new Item(s, linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public ContentSearchItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        String s = this.popValueOrDefault(map0, "kind", "", true);
        Kind kind0 = Kind.Companion.byNameText(s);
        if(kind0 == null) {
            throw new NotMatchedModelException();
        }
        String s1 = this.popValueOrDefault(map0, "align", "alignCenter", true);
        Alignment alignment0 = Alignment.Companion.byNameText(s1, Others.INSTANCE);
        Object object0 = ItemValidatorKt.pop(map0, "data", true);
        Intrinsics.checkNotNull(object0);
        return new ContentSearchItem(kind0, alignment0, ((Map)object0));
    }
}

