package com.kakao.keditor.plugin.itemspec.image;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.room.a;
import com.google.android.material.datepicker.i;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.common.view.ScreenKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.color;
import com.kakao.keditor.R.dimen;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemImageBinding;
import com.kakao.keditor.databinding.KeToolbarImageMenuBinding;
import com.kakao.keditor.delegate.ImageLoader.DefaultImpls;
import com.kakao.keditor.delegate.ImageLoader;
import com.kakao.keditor.media.MediaItemDecoration;
import com.kakao.keditor.plugin.HasItemDecoration;
import com.kakao.keditor.plugin.KeditorItemType;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.attrs.AlignmentType.Others;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Failed;
import com.kakao.keditor.plugin.attrs.LoadingStatus.OnLoading;
import com.kakao.keditor.plugin.attrs.LoadingStatus.Succeed;
import com.kakao.keditor.plugin.attrs.Style;
import com.kakao.keditor.plugin.attrs.item.Linkable;
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.attrs.item.Styled;
import com.kakao.keditor.plugin.common.LinkFormDialog;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.plugin.pluginspec.image.ImageItem;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.EditKeditorItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import com.kakao.keditor.util.eventbus.ViewRequest.RequestFocus;
import com.kakao.keditor.util.eventbus.ViewRequest.UpdateRepresentState;
import com.kakao.keditor.util.eventbus.ViewRequest;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "image")
@Metadata(d1 = {"\u0000\u00A6\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010.\u001A\u00020/2\b\u00100\u001A\u0004\u0018\u0001012\b\u00102\u001A\u0004\u0018\u00010\u0006H\u0016J\u0018\u00103\u001A\u00020\f2\u0006\u00104\u001A\u00020\f2\u0006\u00105\u001A\u00020\fH\u0002J\u0010\u00106\u001A\u00020/2\u0006\u00107\u001A\u000208H\u0016J\b\u00109\u001A\u000201H\u0016J\b\u0010:\u001A\u00020;H\u0016J\u0010\u0010<\u001A\u00020\f2\u0006\u0010=\u001A\u00020>H\u0002J\b\u0010?\u001A\u00020@H\u0016J(\u0010A\u001A\u00020/2\u0006\u00102\u001A\u00020\u00062\u0006\u00100\u001A\u0002012\u0006\u0010B\u001A\u00020\f2\u0006\u0010C\u001A\u00020DH\u0016J\u001A\u0010E\u001A\u00020/2\b\u0010F\u001A\u0004\u0018\u00010\u00062\u0006\u0010G\u001A\u00020HH\u0016J\u0018\u0010I\u001A\u00020\u00062\u0006\u0010J\u001A\u00020K2\u0006\u0010L\u001A\u00020MH\u0016J\u0010\u0010N\u001A\u00020O2\u0006\u00100\u001A\u00020\u0002H\u0014J,\u0010P\u001A\u00020\u00022\u0006\u00107\u001A\u0002082\u0006\u00100\u001A\u00020O2\u0012\u0010Q\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020S0RH\u0014J\u0015\u0010T\u001A\u00020/*\u00020U2\u0006\u00100\u001A\u00020\u0002H\u0082\u0004J$\u0010V\u001A\u00020/*\u00020U2\u0006\u0010=\u001A\u00020>2\u0006\u0010W\u001A\u00020\f2\u0006\u0010X\u001A\u00020\fH\u0002J\u0015\u0010Y\u001A\u00020/*\u00020U2\u0006\u00100\u001A\u00020\u0002H\u0082\u0004R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001A\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u0015X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0010R\u001A\u0010\u001D\u001A\u00020\u001EX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u001B\u0010#\u001A\u00020\f8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b$\u0010\u000ER\u001B\u0010\'\u001A\u00020\f8BX\u0082\u0084\u0002\u00A2\u0006\f\n\u0004\b)\u0010&\u001A\u0004\b(\u0010\u000ER\u0014\u0010*\u001A\u00020+8BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b,\u0010-\u00A8\u0006Z"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/image/ImageItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/pluginspec/image/ImageItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarImageMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarImageMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarImageMenuBinding;)V", "minHeightImageForRepresentativeButton", "getMinHeightImageForRepresentativeButton", "minHeightImageForRepresentativeButton$delegate", "Lkotlin/Lazy;", "minWidthImageForRepresentativeButton", "getMinWidthImageForRepresentativeButton", "minWidthImageForRepresentativeButton$delegate", "representativeImageEnable", "", "getRepresentativeImageEnable", "()Z", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "calculateSamplingSize", "width", "height", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "getMobileStylePadding", "mobileStyle", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onRenderingRequest", "itemView", "request", "Lcom/kakao/keditor/util/eventbus/ViewRequest;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "loadImage", "Lcom/kakao/keditor/databinding/KeItemImageBinding;", "updateLayoutParams", "originWidth", "originHeight", "updateViewAlign", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nImageItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/image/ImageItemSpec\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,356:1\n65#2,16:357\n93#2,3:373\n136#3,12:376\n136#3,12:388\n136#3,12:400\n*S KotlinDebug\n*F\n+ 1 ImageItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/image/ImageItemSpec\n*L\n142#1:357,16\n142#1:373,3\n174#1:376,12\n282#1:388,12\n283#1:400,12\n*E\n"})
public final class ImageItemSpec extends RootItemSpec implements HasItemDecoration {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[MobileStyle.values().length];
            try {
                arr_v[MobileStyle.Origin.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MobileStyle.Full.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[MobileStyle.Content.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public View contextMenuLayoutView;
    private int contextMenulayout;
    private int editorId;
    @NotNull
    private final Map knownEnumValues;
    private int layout;
    public KeToolbarImageMenuBinding menuBinding;
    @NotNull
    private final Lazy minHeightImageForRepresentativeButton$delegate;
    @NotNull
    private final Lazy minWidthImageForRepresentativeButton$delegate;

    public ImageItemSpec() {
        this.knownEnumValues = x.mapOf(new Pair[]{TuplesKt.to("style", Style.Companion.typeSet()), TuplesKt.to("mobileStyle", MobileStyle.Companion.typeSet())});
        this.layout = layout.ke_item_image;
        this.minWidthImageForRepresentativeButton$delegate = c.lazy(new Function0() {
            {
                ImageItemSpec.this = imageItemSpec0;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                Activity activity0 = ImageItemSpec.this.findActivity();
                if(activity0 != null) {
                    Resources resources0 = activity0.getResources();
                    return resources0 == null ? 0 : resources0.getDimensionPixelOffset(dimen.ke_image_min_width_for_representative_image);
                }
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.minHeightImageForRepresentativeButton$delegate = c.lazy(new Function0() {
            {
                ImageItemSpec.this = imageItemSpec0;
                super(0);
            }

            @NotNull
            public final Integer invoke() {
                Activity activity0 = ImageItemSpec.this.findActivity();
                if(activity0 != null) {
                    Resources resources0 = activity0.getResources();
                    return resources0 == null ? 0 : resources0.getDimensionPixelOffset(dimen.ke_image_min_height_for_representative_image);
                }
                return 0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.contextMenulayout = layout.ke_toolbar_image_menu;
    }

    public static void a(ImageItemSpec imageItemSpec0, View view0, boolean z) {
        ImageItemSpec.onViewCreated$lambda$10(imageItemSpec0, view0, z);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        KeToolbarImageMenuBinding keToolbarImageMenuBinding0 = this.getMenuBinding();
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.pluginspec.image.ImageItem");
        keToolbarImageMenuBinding0.setImageItem(((ImageItem)keditorItem0));
        this.getMenuBinding().setMediaMenuListener(new MediaMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onAlignmentChanged(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Alignment alignment1 = alignment0.next(Others.INSTANCE);
                if(((ImageItem)this) == null) {
                    ((ImageItem)this).setAlignment(alignment1);
                }
                else {
                    Style style0 = alignment1.toStyle();
                    ((ImageItem)this).setStyle(style0);
                }
                ImageItemSpec.this.getMenuBinding().setImageItem(((ImageItem)this));
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(ImageItemSpec.this.indexOf(this));
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "image-toolbar", "alignAlignment", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onEditImageClicked() {
                EditKeditorItem pluginSpecRequest$EditKeditorItem0 = new EditKeditorItem("image", ImageItemSpec.this.indexOf(this), this);
                KeEvent.INSTANCE.postInScope(pluginSpecRequest$EditKeditorItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "image-toolbar", "edit", null, 4, null);
                Keditor.INSTANCE.loadEventWithVersion("photos-android-0.0.0");
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onEditImageGridClicked() {
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onLinkClicked() {
                if(this instanceof Linkable && ImageItemSpec.this.findActivity() instanceof AppCompatActivity) {
                    Activity activity0 = ImageItemSpec.this.findActivity();
                    Intrinsics.checkNotNull(activity0, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
                    FragmentManager fragmentManager0 = ((AppCompatActivity)activity0).getSupportFragmentManager();
                    com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.bind.1.onLinkClicked.1.1 imageItemSpec$bind$1$onLinkClicked$1$10 = new Function2(ImageItemSpec.this) {
                        final KeditorItem $item;

                        {
                            this.$item = keditorItem0;
                            ImageItemSpec.this = imageItemSpec0;
                            super(2);
                        }

                        @Override  // kotlin.jvm.functions.Function2
                        public Object invoke(Object object0, Object object1) {
                            this.invoke(((String)object0), ((String)object1));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@Nullable String s, @NotNull String s1) {
                            Intrinsics.checkNotNullParameter(s1, "<anonymous parameter 1>");
                            ((ImageItem)this.$item).setLink(s);
                            RequestFocus viewRequest$RequestFocus0 = new RequestFocus(ImageItemSpec.this.indexOf(this.$item), false, 2, null);
                            KeEvent.INSTANCE.postInScope(viewRequest$RequestFocus0);
                        }
                    };
                    LinkFormDialog.Companion.newInstance("", ((ImageItem)this).getLink(), true, imageItemSpec$bind$1$onLinkClicked$1$10).show(fragmentManager0, "LinkFormDialog");
                }
                Keditor.clickEvent$default(Keditor.INSTANCE, "image-toolbar", "link", null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onMobileStyleChangeClicked(@NotNull MobileStyle mobileStyle0) {
                Intrinsics.checkNotNullParameter(mobileStyle0, "mobileStyle");
                KeditorItem keditorItem0 = this;
                if(keditorItem0 instanceof Styled) {
                    ((ImageItem)keditorItem0).setMobileStyle(mobileStyle0);
                }
                ImageItemSpec.this.getMenuBinding().setImageItem(((ImageItem)this));
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(ImageItemSpec.this.indexOf(this));
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                String s = mobileStyle0.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
                Keditor.INSTANCE.clickEvent("image-toolbar", "mobilestyle", s);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(ImageItemSpec.this.indexOf(this), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "image-toolbar", "remove", null, 4, null);
            }
        });
    }

    private final int calculateSamplingSize(int v, int v1) {
        int v2 = 1;
        if(v * v1 > 0xC80000) {
            while(v1 / 2 / v2 * (v / 2 / v2) > 0xC80000) {
                ++v2;
            }
        }
        return v2;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        Boolean boolean1;
        List list0;
        Intrinsics.checkNotNullParameter(context0, "context");
        Boolean boolean0 = null;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarImageMenuBinding)viewDataBinding0));
        KeToolbarImageMenuBinding keToolbarImageMenuBinding0 = this.getMenuBinding();
        Keditor keditor0 = Keditor.INSTANCE;
        KeditorView keditorView0 = this.findKeditorView();
        Integer integer0 = keditorView0 == null ? null : keditorView0.getEditorId();
        if(integer0 == null || KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("image_style")) {
            Object object1 = keditor0.getConfig().get("image_style");
            if(!(object1 instanceof List)) {
                object1 = null;
            }
            list0 = (List)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("image_style");
            if(!(object0 instanceof List)) {
                object0 = null;
            }
            list0 = (List)object0;
        }
        if(list0 == null) {
            list0 = null;
        }
        keToolbarImageMenuBinding0.setImageStyles(list0);
        KeToolbarImageMenuBinding keToolbarImageMenuBinding1 = this.getMenuBinding();
        KeditorView keditorView1 = this.findKeditorView();
        Integer integer1 = keditorView1 == null ? null : keditorView1.getEditorId();
        if(integer1 == null || KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer1, null) == null || !((Map)a.g(keditor0, integer1)).containsKey("enable_image_edit")) {
            Object object3 = keditor0.getConfig().get("enable_image_edit");
            if(!(object3 instanceof Boolean)) {
                object3 = null;
            }
            boolean1 = (Boolean)object3;
        }
        else {
            Object object2 = ((Map)a.g(keditor0, integer1)).get("enable_image_edit");
            if(!(object2 instanceof Boolean)) {
                object2 = null;
            }
            boolean1 = (Boolean)object2;
        }
        if(boolean1 != null) {
            boolean0 = boolean1;
        }
        keToolbarImageMenuBinding1.setIsEnableImageEdit((boolean0 == null ? true : boolean0.booleanValue()));
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    @NotNull
    public KeditorItem createKeditorItem() {
        return new ImageItem();
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
    public final KeToolbarImageMenuBinding getMenuBinding() {
        KeToolbarImageMenuBinding keToolbarImageMenuBinding0 = this.menuBinding;
        if(keToolbarImageMenuBinding0 != null) {
            return keToolbarImageMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    private final int getMinHeightImageForRepresentativeButton() {
        return ((Number)this.minHeightImageForRepresentativeButton$delegate.getValue()).intValue();
    }

    private final int getMinWidthImageForRepresentativeButton() {
        return ((Number)this.minWidthImageForRepresentativeButton$delegate.getValue()).intValue();
    }

    private final int getMobileStylePadding(MobileStyle mobileStyle0) {
        switch(WhenMappings.$EnumSwitchMapping$0[mobileStyle0.ordinal()]) {
            case 1: 
            case 2: {
                return 0;
            }
            case 3: {
                return (int)UnitConversionKt.dp2px(20.0f);
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    private final boolean getRepresentativeImageEnable() {
        Boolean boolean1;
        Keditor keditor0 = Keditor.INSTANCE;
        Integer integer0 = this.getEditorId();
        Boolean boolean0 = null;
        if(KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("representative_image_enabled")) {
            Object object1 = keditor0.getConfig().get("representative_image_enabled");
            if(!(object1 instanceof Boolean)) {
                object1 = null;
            }
            boolean1 = (Boolean)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("representative_image_enabled");
            if(!(object0 instanceof Boolean)) {
                object0 = null;
            }
            boolean1 = (Boolean)object0;
        }
        if(boolean1 != null) {
            boolean0 = boolean1;
        }
        return boolean0 == null ? false : boolean0.booleanValue();
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return MediaItemDecoration.INSTANCE;
    }

    private final void loadImage(KeItemImageBinding keItemImageBinding0, ImageItem imageItem0) {
        ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
        if(imageLoader0 != null) {
            Intrinsics.checkNotNullExpressionValue(keItemImageBinding0.keItemImage, "keItemImage");
            String s = imageItem0.getSrc();
            com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.loadImage.1 imageItemSpec$loadImage$10 = new Function0() {
                final ImageItem $item;

                {
                    this.$item = imageItem0;
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
            };
            com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.loadImage.2 imageItemSpec$loadImage$20 = new Function0(keItemImageBinding0) {
                final ImageItem $item;
                final KeItemImageBinding $this_loadImage;

                {
                    this.$item = imageItem0;
                    this.$this_loadImage = keItemImageBinding0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$item.setLoadingStatus(Failed.INSTANCE);
                    ColorDrawable colorDrawable0 = new ColorDrawable(this.$this_loadImage.getRoot().getContext().getResources().getColor(color.ke_gray_box_bg));
                    this.$this_loadImage.keItemImageWrapper.setForeground(colorDrawable0);
                }
            };
            com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.loadImage.3 imageItemSpec$loadImage$30 = new Function0(imageItem0) {
                final ImageItem $item;
                final KeItemImageBinding $this_loadImage;

                {
                    this.$this_loadImage = keItemImageBinding0;
                    this.$item = imageItem0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$this_loadImage.setImageItem(this.$item);
                }
            };
            DefaultImpls.loadImage$default(imageLoader0, keItemImageBinding0.keItemImage, s, "image", null, null, imageItemSpec$loadImage$10, imageItemSpec$loadImage$20, imageItemSpec$loadImage$30, true, 24, null);
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemImageBinding keItemImageBinding0 = (KeItemImageBinding)DataBindingUtil.bind(view0);
        if(keItemImageBinding0 != null) {
            keItemImageBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
            keItemImageBinding0.setImageItem(((ImageItem)keditorItem0));
            keItemImageBinding0.setPosition(v);
            keItemImageBinding0.setRepresentativeImageEnable(this.getRepresentativeImageEnable());
            Integer integer0 = ((ImageItem)keditorItem0).getWidth();
            int v1 = integer0 == null ? ((ImageItem)keditorItem0).getOriginWidth() : ((int)integer0);
            Integer integer1 = ((ImageItem)keditorItem0).getHeight();
            this.updateLayoutParams(keItemImageBinding0, ((ImageItem)keditorItem0).getMobileStyle(), v1, (integer1 == null ? ((ImageItem)keditorItem0).getOriginHeight() : ((int)integer1)));
            ((ImageItem)keditorItem0).setLoadingStatus(OnLoading.INSTANCE);
            this.updateViewAlign(keItemImageBinding0, ((ImageItem)keditorItem0));
            this.loadImage(keItemImageBinding0, ((ImageItem)keditorItem0));
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.RootItemSpec
    public void onRenderingRequest(@Nullable View view0, @NotNull ViewRequest viewRequest0) {
        Intrinsics.checkNotNullParameter(viewRequest0, "request");
        if(viewRequest0 instanceof UpdateRepresentState) {
            Keditor.clickEvent$default(Keditor.INSTANCE, "kImage", "representation", null, 4, null);
            KeditorItem keditorItem0 = ((UpdateRepresentState)viewRequest0).getItem();
            ImageItem imageItem0 = keditorItem0 instanceof ImageItem ? ((ImageItem)keditorItem0) : null;
            if(imageItem0 != null) {
                imageItem0.setRepresent(((UpdateRepresentState)viewRequest0).isSet());
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(((UpdateRepresentState)viewRequest0).getPosition());
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
            }
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemImageBinding keItemImageBinding0 = (KeItemImageBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        i i0 = new i(this, 1);
        keItemImageBinding0.keItemImageLayoutWrapper.setOnFocusChangeListener(i0);
        Intrinsics.checkNotNullExpressionValue(keItemImageBinding0.keItemImageCaptionEditText, "keItemImageCaptionEditText");
        EditTextStandardKt.applyCustomFont(keItemImageBinding0.keItemImageCaptionEditText);
        Intrinsics.checkNotNullExpressionValue(keItemImageBinding0.keItemImageCaptionEditText, "keItemImageCaptionEditText");
        com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.onViewCreated..inlined.addTextChangedListener.default.1 imageItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                if(v2 == 1 && charSequence0 != null && charSequence0.length() > 0 && charSequence0.length() > v && charSequence0.charAt(v) == 10) {
                    this.keItemImageCaptionEditText.getText().delete(v, v + 1);
                }
                View view0 = this.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.onViewCreated.2.1 imageItemSpec$onViewCreated$2$10 = new com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.onViewCreated.2.1(charSequence0);
                ImageItemSpec.this.ifFoundItem(view0, imageItemSpec$onViewCreated$2$10);
            }
        };
        keItemImageBinding0.keItemImageCaptionEditText.addTextChangedListener(imageItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10);
        View view0 = keItemImageBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/pluginspec/image/ImageItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.onViewCreated.2.1 extends Lambda implements Function1 {
            final CharSequence $s;

            public com.kakao.keditor.plugin.itemspec.image.ImageItemSpec.onViewCreated.2.1(CharSequence charSequence0) {
                this.$s = charSequence0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((ImageItem)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull ImageItem imageItem0) {
                Intrinsics.checkNotNullParameter(imageItem0, "it");
                imageItem0.setCaption(String.valueOf(this.$s));
            }
        }

    }

    private static final void onViewCreated$lambda$10(ImageItemSpec imageItemSpec0, View view0, boolean z) {
        Intrinsics.checkNotNullParameter(imageItemSpec0, "this$0");
        if(z) {
            KeditorView keditorView0 = imageItemSpec0.findKeditorView();
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

    public final void setMenuBinding(@NotNull KeToolbarImageMenuBinding keToolbarImageMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarImageMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarImageMenuBinding0;
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((ImageItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull ImageItem imageItem0) {
        Intrinsics.checkNotNullParameter(imageItem0, "item");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("src", imageItem0.getSrc());
        linkedHashMap0.put("originWidth", imageItem0.getOriginWidth());
        linkedHashMap0.put("originHeight", imageItem0.getOriginHeight());
        linkedHashMap0.put("style", imageItem0.getValueOrBypass("style", "alignStyle"));
        linkedHashMap0.put("mobileStyle", imageItem0.getValueOrBypass("mobileStyle", imageItem0.getMobileStyle().getStr()));
        Integer integer0 = imageItem0.getWidth();
        if(integer0 != null) {
            linkedHashMap0.put("width", integer0.intValue());
        }
        Integer integer1 = imageItem0.getHeight();
        if(integer1 != null) {
            linkedHashMap0.put("height", integer1.intValue());
        }
        String s = imageItem0.getLink();
        if(s != null) {
            linkedHashMap0.put("link", s);
        }
        Boolean boolean0 = imageItem0.isLinkNewWindow();
        if(boolean0 != null) {
            linkedHashMap0.put("isLinkNewWindow", boolean0);
        }
        String s1 = imageItem0.getTitle();
        if(s1 != null) {
            linkedHashMap0.put("title", s1);
        }
        String s2 = imageItem0.getAlt();
        if(s2 != null) {
            linkedHashMap0.put("alt", s2);
        }
        String s3 = imageItem0.getCaption();
        if(s3 != null) {
            linkedHashMap0.put("caption", s3);
        }
        String s4 = imageItem0.getMimeType();
        if(s4 != null) {
            linkedHashMap0.put("mimeType", s4);
        }
        return new Item("image", linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public ImageItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        ImageItem imageItem0 = new ImageItem();
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
        imageItem0.setSrc(s);
        Object object1 = ItemValidatorKt.pop(map0, "originWidth", true);
        String s1 = null;
        Number number0 = object1 instanceof Number ? ((Number)object1) : null;
        imageItem0.setOriginWidth((number0 == null ? 0 : number0.intValue()));
        Object object2 = ItemValidatorKt.pop(map0, "originHeight", true);
        Number number1 = object2 instanceof Number ? ((Number)object2) : null;
        imageItem0.setOriginHeight((number1 == null ? 0 : number1.intValue()));
        String s2 = this.popValueOrDefault(map0, "style", "alignStyle", true);
        imageItem0.setStyle(Style.Companion.byName(s2));
        Intrinsics.checkNotNullExpressionValue("widthorigin", "toLowerCase(...)");
        String s3 = this.popValueOrDefault(map0, "mobileStyle", "widthorigin", true);
        imageItem0.setMobileStyle(MobileStyle.Companion.byName(s3));
        Object object3 = ItemValidatorKt.pop$default(map0, "width", false, 2, null);
        Number number2 = object3 instanceof Number ? ((Number)object3) : null;
        imageItem0.setWidth((number2 == null ? null : number2.intValue()));
        Object object4 = ItemValidatorKt.pop$default(map0, "height", false, 2, null);
        Number number3 = object4 instanceof Number ? ((Number)object4) : null;
        imageItem0.setHeight((number3 == null ? null : number3.intValue()));
        Object object5 = ItemValidatorKt.pop$default(map0, "link", false, 2, null);
        imageItem0.setLink((object5 == null ? null : object5.toString()));
        Object object6 = ItemValidatorKt.pop$default(map0, "isLinkNewWindow", false, 2, null);
        Boolean boolean0 = object6 instanceof Boolean ? ((Boolean)object6) : null;
        if(boolean0 == null) {
            boolean0 = Boolean.FALSE;
        }
        imageItem0.setLinkNewWindow(boolean0);
        Object object7 = ItemValidatorKt.pop$default(map0, "title", false, 2, null);
        imageItem0.setTitle((object7 == null ? null : object7.toString()));
        Object object8 = ItemValidatorKt.pop$default(map0, "alt", false, 2, null);
        imageItem0.setAlt((object8 == null ? null : object8.toString()));
        Object object9 = ItemValidatorKt.pop$default(map0, "caption", false, 2, null);
        imageItem0.setCaption((object9 == null ? null : object9.toString()));
        Object object10 = ItemValidatorKt.pop$default(map0, "mimeType", false, 2, null);
        if(object10 != null) {
            s1 = object10.toString();
        }
        imageItem0.setMimeType(s1);
        imageItem0.setLocation((new Regex("https?://").containsMatchIn(imageItem0.getSrc()) ? Location.UPLOADED : Location.LOCAL));
        imageItem0.setLoadingStatus(OnLoading.INSTANCE);
        return imageItem0;
    }

    private final void updateLayoutParams(KeItemImageBinding keItemImageBinding0, MobileStyle mobileStyle0, int v, int v1) {
        int v3;
        int v2 = this.getMobileStylePadding(mobileStyle0);
        ViewParent viewParent0 = keItemImageBinding0.getRoot().getParent();
        ViewGroup viewGroup0 = viewParent0 instanceof ViewGroup ? ((ViewGroup)viewParent0) : null;
        if(viewGroup0 == null) {
            Context context0 = keItemImageBinding0.getRoot().getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            v3 = ScreenKt.getScreenWidth(context0);
        }
        else {
            v3 = viewGroup0.getWidth();
        }
        int v4 = v3 - v2 * 2;
        int v5 = v == 0 ? ((int)(((float)(v4 * 3)) / 4.0f)) : v1 * v4 / v;
        int v6 = this.calculateSamplingSize(v4, v5);
        int v7 = v4 / v6;
        int v8 = v5 / v6;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = keItemImageBinding0.keItemImage.getLayoutParams();
        viewGroup$LayoutParams0.width = v7;
        viewGroup$LayoutParams0.height = v8;
        keItemImageBinding0.keItemImage.setLayoutParams(viewGroup$LayoutParams0);
        keItemImageBinding0.keItemImageLoadingLayout.getLayoutParams().height = v5;
        keItemImageBinding0.setTooSmallToShow(v7 < this.getMinWidthImageForRepresentativeButton() || v8 < this.getMinHeightImageForRepresentativeButton());
    }

    private final void updateViewAlign(KeItemImageBinding keItemImageBinding0, ImageItem imageItem0) {
        int v = 17;
        Style style0 = imageItem0.getStyle();
        int v1 = WhenMappings.$EnumSwitchMapping$0[imageItem0.getMobileStyle().ordinal()];
        if(v1 == 1) {
            v = style0.toAlignment().toGravity();
        }
        else if(v1 != 2 && v1 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = keItemImageBinding0.keItemImageWrapper.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        ((FrameLayout.LayoutParams)viewGroup$LayoutParams0).gravity = v | 16;
        ViewGroup.LayoutParams viewGroup$LayoutParams1 = keItemImageBinding0.keItemImageCaptionEditText.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams1, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        ((LinearLayout.LayoutParams)viewGroup$LayoutParams1).gravity = v;
        keItemImageBinding0.keItemImageLayout.requestLayout();
    }
}

