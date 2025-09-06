package com.kakao.keditor.plugin.itemspec.opengraph;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
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
import com.kakao.keditor.databinding.KeItemOpengraphBinding;
import com.kakao.keditor.databinding.KeToolbarSimpleAlignmentMenuBinding;
import com.kakao.keditor.delegate.ImageLoader.DefaultImpls;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.exception.NotMatchedModelException;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Completed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Failed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Ready;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.Loader;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.OpenGraphAsyncLoader;
import com.kakao.keditor.plugin.itemspec.opengraph.loader.OpenGraphLoader;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.ConvertOpenGraphToVideo;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import com.kakao.keditor.util.eventbus.ViewRequest.ReplaceItems;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "opengraph")
@Metadata(d1 = {"\u0000\u009E\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000E\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010/\u001A\u0002002\b\u00101\u001A\u0004\u0018\u0001022\b\u00103\u001A\u0004\u0018\u00010\u0006H\u0016J\u0018\u00104\u001A\u0002002\u0006\u00105\u001A\u0002062\u0006\u00101\u001A\u00020\u0002H\u0003J\u0010\u00107\u001A\u0002002\u0006\u00108\u001A\u000209H\u0016J\b\u0010:\u001A\u000202H\u0016J\b\u0010;\u001A\u00020<H\u0016J\u0010\u0010=\u001A\u00020>2\u0006\u0010?\u001A\u00020\u0002H\u0002J\b\u0010@\u001A\u00020AH\u0016J(\u0010B\u001A\u0002002\u0006\u00103\u001A\u00020\u00062\u0006\u00101\u001A\u0002022\u0006\u0010C\u001A\u00020\f2\u0006\u0010D\u001A\u00020EH\u0016J\u0018\u0010F\u001A\u0002002\u0006\u0010C\u001A\u00020\f2\u0006\u00101\u001A\u00020\u0002H\u0002J\u0018\u0010G\u001A\u00020\u00062\u0006\u0010H\u001A\u00020I2\u0006\u0010J\u001A\u00020KH\u0016J\u0010\u0010L\u001A\u00020M2\u0006\u00101\u001A\u00020\u0002H\u0014J,\u0010N\u001A\u00020\u00022\u0006\u00108\u001A\u0002092\u0006\u00101\u001A\u00020M2\u0012\u0010O\u001A\u000E\u0012\u0004\u0012\u00020\u001C\u0012\u0004\u0012\u00020Q0PH\u0014R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001E\u0010\u0011\u001A\u0004\u0018\u00010\fX\u0086\u000E\u00A2\u0006\u0010\n\u0002\u0010\u0016\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0017\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0018\u0010\u000E\"\u0004\b\u0019\u0010\u0010R&\u0010\u001A\u001A\u0014\u0012\u0004\u0012\u00020\u001C\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001C0\u001D0\u001BX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001E\u0010\u001FR\u001A\u0010 \u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b!\u0010\u000E\"\u0004\b\"\u0010\u0010R\u001C\u0010#\u001A\u0004\u0018\u00010$X\u0086\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001A\u0010)\u001A\u00020*X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.\u00A8\u0006R"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "defaultImageResource", "getDefaultImageResource", "()Ljava/lang/Integer;", "setDefaultImageResource", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "loader", "Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/Loader;", "getLoader", "()Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/Loader;", "setLoader", "(Lcom/kakao/keditor/plugin/itemspec/opengraph/loader/Loader;)V", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarSimpleAlignmentMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "bindViewInternal", "binding", "Lcom/kakao/keditor/databinding/KeItemOpengraphBinding;", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "isVideo", "", "openGraphModel", "itemDecoration", "Lcom/kakao/keditor/plugin/itemspec/opengraph/OpenGraphItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onLoaded", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class OpenGraphItemSpec extends RootItemSpec implements HasItemDecoration {
    public View contextMenuLayoutView;
    private int contextMenulayout;
    @Nullable
    private Integer defaultImageResource;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    @Nullable
    private Loader loader;
    public KeToolbarSimpleAlignmentMenuBinding menuBinding;

    public OpenGraphItemSpec() {
        this.knownEnumValues = w.mapOf(TuplesKt.to("align", Alignment.Companion.typeSet()));
        this.layout = layout.ke_item_opengraph;
        this.contextMenulayout = layout.ke_toolbar_simple_alignment_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.opengraph.OpenGraphItem");
        this.getMenuBinding().setAlignment(((OpenGraphItem)keditorItem0).getAlignment());
        this.getMenuBinding().setAlignMenuClickListener(new SimpleAlignMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onAlignmentClicked(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Alignment alignment1 = alignment0.next(Others.INSTANCE);
                ((OpenGraphItem)this).setAlignment(alignment1);
                OpenGraphItemSpec.this.getMenuBinding().setAlignment(((OpenGraphItem)this).getAlignment());
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(OpenGraphItemSpec.this.indexOf(this), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
            }
        });
    }

    @SuppressLint({"UseCompatLoadingForDrawables"})
    private final void bindViewInternal(KeItemOpengraphBinding keItemOpengraphBinding0, OpenGraphItem openGraphItem0) {
        keItemOpengraphBinding0.setItem(openGraphItem0);
        String s = openGraphItem0.getImage();
        if(s == null) {
            return;
        }
        ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
        if(imageLoader0 != null) {
            Intrinsics.checkNotNullExpressionValue(keItemOpengraphBinding0.keItemOpengraphThumbnail, "keItemOpengraphThumbnail");
            Integer integer0 = this.defaultImageResource;
            Drawable drawable0 = integer0 == null ? null : keItemOpengraphBinding0.getRoot().getContext().getDrawable(integer0.intValue());
            DefaultImpls.loadImage$default(imageLoader0, keItemOpengraphBinding0.keItemOpengraphThumbnail, s, "opengraph", null, drawable0, null, null, null, false, 488, null);
        }
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
        return new OpenGraphItem();
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

    @Nullable
    public final Integer getDefaultImageResource() {
        return this.defaultImageResource;
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

    @Nullable
    public final Loader getLoader() {
        return this.loader;
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

    // 去混淆评级： 低(26)
    private final boolean isVideo(OpenGraphItem openGraphItem0) {
        String s = openGraphItem0.getResourceType();
        String s1 = openGraphItem0.getHost();
        return (Intrinsics.areEqual(s, "video.other") || Intrinsics.areEqual(s, "video")) && (Intrinsics.areEqual(s1, "www.youtube.com") || Intrinsics.areEqual(s1, "tv.kakao.com") || Intrinsics.areEqual(s1, "vimeo.com"));
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    public ItemDecoration itemDecoration() {
        return this.itemDecoration();
    }

    @NotNull
    public OpenGraphItemDecoration itemDecoration() {
        return OpenGraphItemDecoration.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemOpengraphBinding keItemOpengraphBinding0 = (KeItemOpengraphBinding)DataBindingUtil.bind(view0);
        if(keItemOpengraphBinding0 == null) {
            return;
        }
        keItemOpengraphBinding0.keItemOpengraphThumbnail.setImageDrawable(null);
        keItemOpengraphBinding0.keItemOpengraphTitleText.setText("");
        keItemOpengraphBinding0.keItemOpengraphHostText.setText("");
        keItemOpengraphBinding0.setItem(((OpenGraphItem)keditorItem0));
        keItemOpengraphBinding0.setIsNowLoading(((OpenGraphItem)keditorItem0).isNowLoading());
        keItemOpengraphBinding0.setHasFocus(keditorState0.getFocusedItemPosition() == v);
        if(Intrinsics.areEqual(((OpenGraphItem)keditorItem0).getLoadingStatus(), Ready.INSTANCE)) {
            ((OpenGraphItem)keditorItem0).startedLoading();
            Loader loader0 = this.loader;
            if(loader0 != null) {
                if(loader0 instanceof OpenGraphAsyncLoader) {
                    ((OpenGraphAsyncLoader)loader0).loadAsync(((OpenGraphItem)keditorItem0), new Function1(keditorItem0) {
                        final KeditorItem $item;

                        {
                            OpenGraphItemSpec.this = openGraphItemSpec0;
                            this.$item = keditorItem0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((OpenGraphItem)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull OpenGraphItem openGraphItem0) {
                            Intrinsics.checkNotNullParameter(openGraphItem0, "it");
                            int v = OpenGraphItemSpec.this.indexOf(this.$item);
                            OpenGraphItemSpec openGraphItemSpec0 = OpenGraphItemSpec.this;
                            if(v >= 0) {
                                openGraphItemSpec0.onLoaded(v, openGraphItem0);
                            }
                        }
                    });
                    return;
                }
                if(loader0 instanceof OpenGraphLoader) {
                    this.onLoaded(v, ((OpenGraphLoader)loader0).load(((OpenGraphItem)keditorItem0)));
                }
            }
        }
        else {
            this.bindViewInternal(keItemOpengraphBinding0, ((OpenGraphItem)keditorItem0));
        }
    }

    private final void onLoaded(int v, OpenGraphItem openGraphItem0) {
        if(Intrinsics.areEqual(openGraphItem0.getLoadingStatus(), Failed.INSTANCE)) {
            RemoveItem viewRequest$RemoveItem0 = new RemoveItem(v, true);
            KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
            return;
        }
        openGraphItem0.setLoadingStatus(new Completed());
        if(this.hasItemSpec("video") && this.isVideo(openGraphItem0)) {
            ConvertOpenGraphToVideo pluginSpecRequest$ConvertOpenGraphToVideo0 = new ConvertOpenGraphToVideo(v, openGraphItem0);
            KeEvent.INSTANCE.postInScope(pluginSpecRequest$ConvertOpenGraphToVideo0);
            return;
        }
        ReplaceItems viewRequest$ReplaceItems0 = new ReplaceItems(v, k.listOf(openGraphItem0), v + 1, false, 8, null);
        KeEvent.INSTANCE.postInScope(viewRequest$ReplaceItems0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemOpengraphBinding keItemOpengraphBinding0 = (KeItemOpengraphBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        View view0 = keItemOpengraphBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        ViewStandardKt.setShadowBlur(view0);
        Intrinsics.checkNotNullExpressionValue(keItemOpengraphBinding0.keItemOpengraphTitleText, "keItemOpengraphTitleText");
        EditTextStandardKt.applyCustomFont(keItemOpengraphBinding0.keItemOpengraphTitleText);
        Intrinsics.checkNotNullExpressionValue(keItemOpengraphBinding0.keItemOpengraphLoading, "keItemOpengraphLoading");
        EditTextStandardKt.applyCustomFont(keItemOpengraphBinding0.keItemOpengraphLoading);
        View view1 = keItemOpengraphBinding0.getRoot();
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

    public final void setDefaultImageResource(@Nullable Integer integer0) {
        this.defaultImageResource = integer0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.KeditorBridge
    public void setEditorId(int v) {
        this.editorId = v;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void setLayout(int v) {
        this.layout = v;
    }

    public final void setLoader(@Nullable Loader loader0) {
        this.loader = loader0;
    }

    public final void setMenuBinding(@NotNull KeToolbarSimpleAlignmentMenuBinding keToolbarSimpleAlignmentMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarSimpleAlignmentMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarSimpleAlignmentMenuBinding0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((OpenGraphItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull OpenGraphItem openGraphItem0) {
        Intrinsics.checkNotNullParameter(openGraphItem0, "item");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("url", openGraphItem0.getUrl());
        linkedHashMap0.put("sourceUrl", openGraphItem0.getSourceUrl());
        linkedHashMap0.put("align", openGraphItem0.getValueOrBypass("align", "alignAlignment"));
        String s = openGraphItem0.getHost();
        String s1 = "";
        if(s == null) {
            s = "";
        }
        linkedHashMap0.put("host", s);
        linkedHashMap0.put("title", (openGraphItem0.getTitle() == null ? "" : openGraphItem0.getTitle()));
        linkedHashMap0.put("image", (openGraphItem0.getImage() == null ? "" : openGraphItem0.getImage()));
        String s2 = openGraphItem0.getDesc();
        if(s2 != null) {
            s1 = s2;
        }
        linkedHashMap0.put("desc", s1);
        return new Item("opengraph", linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public OpenGraphItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s5;
        String s4;
        String s3;
        String s2;
        String s1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        if(map0.get("sourceUrl") == null || map0.get("url") == null || map0.get("host") == null) {
            throw new NotMatchedModelException();
        }
        OpenGraphItem openGraphItem0 = new OpenGraphItem();
        Object object0 = ItemValidatorKt.pop(map0, "url", true);
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
        openGraphItem0.setUrl(s1);
        Object object1 = ItemValidatorKt.pop(map0, "host", true);
        if(object1 == null) {
            s2 = "";
        }
        else {
            s2 = object1.toString();
            if(s2 == null) {
                s2 = "";
            }
        }
        openGraphItem0.setHost(s2);
        Object object2 = ItemValidatorKt.pop(map0, "sourceUrl", true);
        if(object2 == null) {
            s3 = "";
        }
        else {
            s3 = object2.toString();
            if(s3 == null) {
                s3 = "";
            }
        }
        openGraphItem0.setSourceUrl(s3);
        Object object3 = ItemValidatorKt.pop$default(map0, "title", false, 2, null);
        if(object3 == null) {
            s4 = "";
        }
        else {
            s4 = object3.toString();
            if(s4 == null) {
                s4 = "";
            }
        }
        openGraphItem0.setTitle(s4);
        Object object4 = ItemValidatorKt.pop$default(map0, "desc", false, 2, null);
        if(object4 == null) {
            s5 = "";
        }
        else {
            s5 = object4.toString();
            if(s5 == null) {
                s5 = "";
            }
        }
        openGraphItem0.setDesc(s5);
        Object object5 = ItemValidatorKt.pop$default(map0, "image", false, 2, null);
        if(object5 != null) {
            String s6 = object5.toString();
            if(s6 != null) {
                s = s6;
            }
        }
        openGraphItem0.setImage(s);
        String s7 = this.popValueOrDefault(map0, "align", "alignCenter", true);
        openGraphItem0.setAlignment(Alignment.Companion.byNameText(s7, Others.INSTANCE));
        openGraphItem0.setLoadingStatus(Succeed.INSTANCE);
        return openGraphItem0;
    }
}

