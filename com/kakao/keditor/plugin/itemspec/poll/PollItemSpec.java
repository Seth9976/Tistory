package com.kakao.keditor.plugin.itemspec.poll;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.graphics.drawable.RoundedBitmapDrawable;
import androidx.core.graphics.drawable.RoundedBitmapDrawableFactory;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemPollBinding;
import com.kakao.keditor.databinding.KeItemPollSubBinding;
import com.kakao.keditor.databinding.KeToolbarPollMenuBinding;
import com.kakao.keditor.delegate.ImageLoader.DefaultImpls;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener;
import com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.e0;
import kotlin.collections.w;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "poll")
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010\'\u001A\u00020(2\b\u0010)\u001A\u0004\u0018\u00010*2\b\u0010+\u001A\u0004\u0018\u00010\u000BH\u0016J\u0010\u0010,\u001A\u00020(2\u0006\u0010-\u001A\u00020.H\u0016J\b\u0010/\u001A\u000200H\u0016J\b\u00101\u001A\u000202H\u0016J(\u00103\u001A\u00020(2\u0006\u0010+\u001A\u00020\u000B2\u0006\u0010)\u001A\u00020*2\u0006\u00104\u001A\u00020\u00112\u0006\u00105\u001A\u000206H\u0016J\u0018\u00107\u001A\u00020\u000B2\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u00020;H\u0016J\u0010\u0010<\u001A\u00020=2\u0006\u0010)\u001A\u00020\u0002H\u0014J,\u0010>\u001A\u00020\u00022\u0006\u0010-\u001A\u00020.2\u0006\u0010)\u001A\u00020=2\u0012\u0010?\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020A0@H\u0014J\u0014\u0010B\u001A\u00020(*\u00020C2\u0006\u0010D\u001A\u00020EH\u0002R\u001A\u0010\u0005\u001A\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\b\u0010\tR\u001A\u0010\n\u001A\u00020\u000BX\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\f\u0010\r\"\u0004\b\u000E\u0010\u000FR\u001A\u0010\u0010\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001A\u0010\u0016\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0017\u0010\u0013\"\u0004\b\u0018\u0010\u0015R&\u0010\u0019\u001A\u0014\u0012\u0004\u0012\u00020\u001B\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001B0\u00060\u001AX\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u001C\u0010\u001DR\u001A\u0010\u001E\u001A\u00020\u0011X\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010\u0013\"\u0004\b \u0010\u0015R\u001A\u0010!\u001A\u00020\"X\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b#\u0010$\"\u0004\b%\u0010&\u00A8\u0006F"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/poll/PollItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/poll/PollItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "childValidators", "", "Lcom/kakao/keditor/plugin/itemspec/ItemValidator;", "getChildValidators", "()Ljava/util/Set;", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarPollMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarPollMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarPollMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "convertRoundedDrawable", "Landroid/widget/ImageView;", "radius", "", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPollItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PollItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/poll/PollItemSpec\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,163:1\n1855#2,2:164\n1855#2,2:166\n*S KotlinDebug\n*F\n+ 1 PollItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/poll/PollItemSpec\n*L\n56#1:164,2\n73#1:166,2\n*E\n"})
public final class PollItemSpec extends RootItemSpec implements HasItemDecoration {
    @NotNull
    private final Set childValidators;
    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarPollMenuBinding menuBinding;

    public PollItemSpec() {
        this.childValidators = e0.setOf(PollSubItemSpec.INSTANCE);
        this.knownEnumValues = w.mapOf(TuplesKt.to("align", Alignment.Companion.typeSet()));
        this.layout = layout.ke_item_poll;
        this.contextMenulayout = layout.ke_toolbar_poll_menu;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.poll.PollItem");
        int v = this.indexOf(keditorItem0);
        this.getMenuBinding().setAlignment(((PollItem)keditorItem0).getAlignment());
        this.getMenuBinding().setCodeMenuListener(new CodeMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener
            public void onItemEditClicked() {
                KeditorItem keditorItem0 = PollItemSpec.this.getItem(this);
                EditKeditorItem pluginSpecRequest$EditKeditorItem0 = new EditKeditorItem("poll", this, keditorItem0);
                KeEvent.INSTANCE.postInScope(pluginSpecRequest$EditKeditorItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "poll-toolbar", "edit", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.CodeMenuClickListener
            public void onRemoveMenuClicked() {
            }
        });
        this.getMenuBinding().setAlignMenuClickListener(new SimpleAlignMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onAlignmentClicked(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Alignment alignment1 = alignment0.next(Others.INSTANCE);
                ((PollItem)this).setAlignment(alignment1);
                v.getMenuBinding().setAlignment(((PollItem)this).getAlignment());
                Keditor.clickEvent$default(Keditor.INSTANCE, "poll-toolbar", "alignAlignment", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.SimpleAlignMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(this.$currentPosition, false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "poll-toolbar", "remove", null, 4, null);
            }
        });
    }

    private final void convertRoundedDrawable(ImageView imageView0, float f) {
        imageView0.post(new a(imageView0, f, 0));
    }

    private static final void convertRoundedDrawable$lambda$11(ImageView imageView0, float f) {
        Intrinsics.checkNotNullParameter(imageView0, "$this_convertRoundedDrawable");
        Drawable drawable0 = imageView0.getDrawable();
        if(drawable0 != null && drawable0 instanceof BitmapDrawable) {
            RoundedBitmapDrawable roundedBitmapDrawable0 = RoundedBitmapDrawableFactory.create(imageView0.getContext().getResources(), ((BitmapDrawable)drawable0).getBitmap());
            roundedBitmapDrawable0.setCornerRadius(UnitConversionKt.dp2px(f));
            Intrinsics.checkNotNullExpressionValue(roundedBitmapDrawable0, "apply(...)");
            imageView0.setImageDrawable(roundedBitmapDrawable0);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarPollMenuBinding)viewDataBinding0));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemSpec
    @NotNull
    public Set getChildValidators() {
        return this.childValidators;
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
    public final KeToolbarPollMenuBinding getMenuBinding() {
        KeToolbarPollMenuBinding keToolbarPollMenuBinding0 = this.menuBinding;
        if(keToolbarPollMenuBinding0 != null) {
            return keToolbarPollMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return PollItemDecoration.INSTANCE;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemPollBinding keItemPollBinding0 = (KeItemPollBinding)DataBindingUtil.bind(view0);
        if(keItemPollBinding0 != null) {
            keItemPollBinding0.setPollItem(((PollItem)keditorItem0));
            keItemPollBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
            if(keItemPollBinding0.kePluginPollItemOptionSelect.getChildCount() > 0) {
                keItemPollBinding0.kePluginPollItemOptionSelect.removeAllViews();
            }
            for(Object object0: ((PollItem)keditorItem0).getSubItems()) {
                PollSubItem pollSubItem0 = (PollSubItem)object0;
                KeItemPollSubBinding keItemPollSubBinding0 = (KeItemPollSubBinding)DataBindingUtil.inflate(LayoutInflater.from(view0.getContext()), layout.ke_item_poll_sub, keItemPollBinding0.kePluginPollItemOptionSelect, true);
                keItemPollSubBinding0.setPollSubItem(pollSubItem0);
                ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
                if(imageLoader0 != null) {
                    Intrinsics.checkNotNullExpressionValue(keItemPollSubBinding0.kePluginPollItemImage, "kePluginPollItemImage");
                    com.kakao.keditor.plugin.itemspec.poll.PollItemSpec.onItemBound.1.1 pollItemSpec$onItemBound$1$10 = new Function0(keItemPollSubBinding0) {
                        final KeItemPollSubBinding $binding;

                        {
                            PollItemSpec.this = pollItemSpec0;
                            this.$binding = keItemPollSubBinding0;
                            super(0);
                        }

                        @Override  // kotlin.jvm.functions.Function0
                        public Object invoke() {
                            this.invoke();
                            return Unit.INSTANCE;
                        }

                        public final void invoke() {
                            Intrinsics.checkNotNullExpressionValue(this.$binding.kePluginPollItemImage, "kePluginPollItemImage");
                            PollItemSpec.this.convertRoundedDrawable(this.$binding.kePluginPollItemImage, 2.0f);
                        }
                    };
                    DefaultImpls.loadImage$default(imageLoader0, keItemPollSubBinding0.kePluginPollItemImage, pollSubItem0.getImage(), "poll", null, null, pollItemSpec$onItemBound$1$10, null, null, false, 472, null);
                }
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemPollBinding keItemPollBinding0 = (KeItemPollBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        Intrinsics.checkNotNullExpressionValue(keItemPollBinding0.kePluginPollTitle, "kePluginPollTitle");
        EditTextStandardKt.applyCustomFont(keItemPollBinding0.kePluginPollTitle);
        Intrinsics.checkNotNullExpressionValue(keItemPollBinding0.kePluginPollType, "kePluginPollType");
        EditTextStandardKt.applyCustomFont(keItemPollBinding0.kePluginPollType);
        View view0 = keItemPollBinding0.getRoot();
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

    public final void setMenuBinding(@NotNull KeToolbarPollMenuBinding keToolbarPollMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarPollMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarPollMenuBinding0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((PollItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull PollItem pollItem0) {
        Intrinsics.checkNotNullParameter(pollItem0, "item");
        String s = pollItem0.getType();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("id", pollItem0.getId());
        linkedHashMap0.put("selectCount", pollItem0.getSelectCount());
        linkedHashMap0.put("title", pollItem0.getTitle());
        linkedHashMap0.put("startDate", pollItem0.getStartDate());
        linkedHashMap0.put("endDate", pollItem0.getEndDate());
        linkedHashMap0.put("editable", Boolean.valueOf(pollItem0.getEditable()));
        linkedHashMap0.put("align", pollItem0.getValueOrBypass("align", "alignAlignment"));
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: pollItem0.getSubItems()) {
            arrayList0.add(PollSubItemSpec.INSTANCE.convertToCdmItem(((PollSubItem)object0)));
        }
        return new Item(s, linkedHashMap0, arrayList0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public PollItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        boolean z;
        String s3;
        String s2;
        String s1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        PollItem pollItem0 = new PollItem();
        Double double0 = null;
        Object object0 = ItemValidatorKt.pop$default(map0, "id", false, 2, null);
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
        pollItem0.setId(s1);
        Object object1 = ItemValidatorKt.pop(map0, "selectCount", true);
        if(object1 instanceof Double) {
            double0 = (Double)object1;
        }
        pollItem0.setSelectCount((double0 == null ? 1 : ((int)(((double)double0)))));
        Object object2 = ItemValidatorKt.pop(map0, "title", true);
        if(object2 == null) {
            s2 = "";
        }
        else {
            s2 = object2.toString();
            if(s2 == null) {
                s2 = "";
            }
        }
        pollItem0.setTitle(s2);
        Object object3 = ItemValidatorKt.pop(map0, "startDate", true);
        if(object3 == null) {
            s3 = "";
        }
        else {
            s3 = object3.toString();
            if(s3 == null) {
                s3 = "";
            }
        }
        pollItem0.setStartDate(s3);
        Object object4 = ItemValidatorKt.pop(map0, "endDate", true);
        if(object4 != null) {
            String s4 = object4.toString();
            if(s4 != null) {
                s = s4;
            }
        }
        pollItem0.setEndDate(s);
        Object object5 = ItemValidatorKt.pop(map0, "editable", true);
        if(object5 == null) {
            z = true;
        }
        else {
            String s5 = object5.toString();
            z = s5 == null ? true : Boolean.parseBoolean(s5);
        }
        pollItem0.setEditable(z);
        String s6 = this.popValueOrDefault(map0, "align", "alignCenter", true);
        pollItem0.setAlignment(Alignment.Companion.byNameText(s6, Others.INSTANCE));
        List list0 = cDM$Item0.getChildren();
        if(list0 != null) {
            for(Object object6: list0) {
                pollItem0.getSubItems().add(PollSubItemSpec.INSTANCE.convertToKeditorItem(context0, ((Item)object6)));
            }
        }
        return pollItem0;
    }
}

