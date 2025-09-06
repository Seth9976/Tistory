package com.kakao.keditor.plugin.itemspec.video;

import android.content.Context;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.room.a;
import com.google.android.material.datepicker.i;
import com.kakao.common.util.UnitConversionKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorState;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.cdm.CDM.Item;
import com.kakao.keditor.databinding.KeItemVideoBinding;
import com.kakao.keditor.databinding.KeToolbarVideoMenuBinding;
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
import com.kakao.keditor.plugin.attrs.item.Location;
import com.kakao.keditor.plugin.attrs.item.MobileStyle;
import com.kakao.keditor.plugin.attrs.item.Styled;
import com.kakao.keditor.plugin.itemspec.ItemValidatorKt;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener;
import com.kakao.keditor.standard.EditTextStandardKt;
import com.kakao.keditor.standard.KeditorStandardKt;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshPosition;
import com.kakao.keditor.util.eventbus.ViewRequest.RemoveItem;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@KeditorItemType(type = "video")
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010\"\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0005\u00A2\u0006\u0002\u0010\u0004J\u001C\u0010#\u001A\u00020$2\b\u0010%\u001A\u0004\u0018\u00010&2\b\u0010\'\u001A\u0004\u0018\u00010\u0006H\u0016J\u0010\u0010(\u001A\u00020$2\u0006\u0010)\u001A\u00020*H\u0016J\b\u0010+\u001A\u00020\u0002H\u0016J\b\u0010,\u001A\u00020-H\u0016J\u0010\u0010.\u001A\u00020\f2\u0006\u0010/\u001A\u000200H\u0002J\b\u00101\u001A\u000202H\u0016J(\u00103\u001A\u00020$2\u0006\u0010\'\u001A\u00020\u00062\u0006\u0010%\u001A\u00020&2\u0006\u00104\u001A\u00020\f2\u0006\u00105\u001A\u000206H\u0016J\u0018\u00107\u001A\u00020\u00062\u0006\u00108\u001A\u0002092\u0006\u0010:\u001A\u00020;H\u0016J\u0010\u0010<\u001A\u00020=2\u0006\u0010%\u001A\u00020\u0002H\u0014J,\u0010>\u001A\u00020\u00022\u0006\u0010)\u001A\u00020*2\u0006\u0010%\u001A\u00020=2\u0012\u0010?\u001A\u000E\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020A0@H\u0014J\u0015\u0010B\u001A\u00020$*\u00020C2\u0006\u0010%\u001A\u00020\u0002H\u0082\u0004J\u0015\u0010D\u001A\u00020$*\u00020C2\u0006\u0010%\u001A\u00020\u0002H\u0082\u0004J\f\u0010E\u001A\u00020$*\u00020CH\u0002J\u0017\u0010F\u001A\u00020$*\u00020C2\b\u0010G\u001A\u0004\u0018\u00010\u0016H\u0082\u0004J\u0015\u0010H\u001A\u00020$*\u00020C2\u0006\u0010/\u001A\u000200H\u0082\u0004R\u001A\u0010\u0005\u001A\u00020\u0006X\u0096.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001A\u0010\u000B\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\r\u0010\u000E\"\u0004\b\u000F\u0010\u0010R\u001A\u0010\u0011\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u0012\u0010\u000E\"\u0004\b\u0013\u0010\u0010R&\u0010\u0014\u001A\u0014\u0012\u0004\u0012\u00020\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00170\u0015X\u0096\u0004\u00A2\u0006\b\n\u0000\u001A\u0004\b\u0018\u0010\u0019R\u001A\u0010\u001A\u001A\u00020\fX\u0096\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001B\u0010\u000E\"\u0004\b\u001C\u0010\u0010R\u001A\u0010\u001D\u001A\u00020\u001EX\u0086.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"\u00A8\u0006I"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/video/VideoItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "Lcom/kakao/keditor/plugin/itemspec/video/VideoItem;", "Lcom/kakao/keditor/plugin/HasItemDecoration;", "()V", "contextMenuLayoutView", "Landroid/view/View;", "getContextMenuLayoutView", "()Landroid/view/View;", "setContextMenuLayoutView", "(Landroid/view/View;)V", "contextMenulayout", "", "getContextMenulayout", "()I", "setContextMenulayout", "(I)V", "editorId", "getEditorId", "setEditorId", "knownEnumValues", "", "", "", "getKnownEnumValues", "()Ljava/util/Map;", "layout", "getLayout", "setLayout", "menuBinding", "Lcom/kakao/keditor/databinding/KeToolbarVideoMenuBinding;", "getMenuBinding", "()Lcom/kakao/keditor/databinding/KeToolbarVideoMenuBinding;", "setMenuBinding", "(Lcom/kakao/keditor/databinding/KeToolbarVideoMenuBinding;)V", "bind", "", "item", "Lcom/kakao/keditor/KeditorItem;", "view", "createContextMenu", "context", "Landroid/content/Context;", "createKeditorItem", "getContextMenuBinding", "Landroidx/databinding/ViewDataBinding;", "getMobileStylePadding", "mobileStyle", "Lcom/kakao/keditor/plugin/attrs/item/MobileStyle;", "itemDecoration", "Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;", "onItemBound", "position", "editorState", "Lcom/kakao/keditor/KeditorState;", "onViewCreated", "parent", "Landroid/view/ViewGroup;", "layoutInflater", "Landroid/view/LayoutInflater;", "toCdmItem", "Lcom/kakao/keditor/cdm/CDM$Item;", "toKeditorItem", "attr", "", "", "loadImage", "Lcom/kakao/keditor/databinding/KeItemVideoBinding;", "loadingLayout", "showCaptionText", "updateCaption", "caption", "updateMobileStyle", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nVideoItemSpec.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VideoItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/video/VideoItemSpec\n+ 2 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 3 Keditor.kt\ncom/kakao/keditor/Keditor\n*L\n1#1,230:1\n65#2,16:231\n93#2,3:247\n136#3,12:250\n*S KotlinDebug\n*F\n+ 1 VideoItemSpec.kt\ncom/kakao/keditor/plugin/itemspec/video/VideoItemSpec\n*L\n111#1:231,16\n111#1:247,3\n191#1:250,12\n*E\n"})
public final class VideoItemSpec extends RootItemSpec implements HasItemDecoration {
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[MobileStyle.values().length];
            try {
                arr_v[MobileStyle.Full.ordinal()] = 1;
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
    public KeToolbarVideoMenuBinding menuBinding;

    public VideoItemSpec() {
        this.knownEnumValues = x.mapOf(new Pair[]{TuplesKt.to("style", Style.Companion.typeSet()), TuplesKt.to("mobileStyle", MobileStyle.Companion.typeSet())});
        this.layout = layout.ke_item_video;
        this.contextMenulayout = layout.ke_toolbar_video_menu;
    }

    public static void a(VideoItemSpec videoItemSpec0, View view0, boolean z) {
        VideoItemSpec.onViewCreated$lambda$7(videoItemSpec0, view0, z);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void bind(@Nullable KeditorItem keditorItem0, @Nullable View view0) {
        KeToolbarVideoMenuBinding keToolbarVideoMenuBinding0 = this.getMenuBinding();
        Intrinsics.checkNotNull(keditorItem0, "null cannot be cast to non-null type com.kakao.keditor.plugin.itemspec.video.VideoItem");
        keToolbarVideoMenuBinding0.setVideoItem(((VideoItem)keditorItem0));
        this.getMenuBinding().setMediaMenuListener(new MediaMenuClickListener() {
            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onAlignmentChanged(@NotNull Alignment alignment0) {
                Intrinsics.checkNotNullParameter(alignment0, "alignment");
                Others alignmentType$Others0 = Others.INSTANCE;
                Alignment alignment1 = alignment0.next(alignmentType$Others0);
                if(((VideoItem)this) == null) {
                    ((VideoItem)this).setAlignment(alignment1);
                }
                else {
                    Style style0 = alignment1.toStyle();
                    ((VideoItem)this).setStyle(style0);
                }
                VideoItemSpec.this.getMenuBinding().setVideoItem(((VideoItem)this));
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(VideoItemSpec.this.indexOf(this));
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                String s = ((VideoItem)this).getAlignment().toCdmValue(alignmentType$Others0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "video-toolbar", s, null, 4, null);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onEditImageClicked() {
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onEditImageGridClicked() {
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onLinkClicked() {
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onMobileStyleChangeClicked(@NotNull MobileStyle mobileStyle0) {
                Intrinsics.checkNotNullParameter(mobileStyle0, "mobileStyle");
                KeditorItem keditorItem0 = this;
                if(keditorItem0 instanceof Styled) {
                    ((VideoItem)keditorItem0).setMobileStyle(mobileStyle0);
                }
                VideoItemSpec.this.getMenuBinding().setVideoItem(((VideoItem)this));
                RefreshPosition viewRequest$RefreshPosition0 = new RefreshPosition(VideoItemSpec.this.indexOf(this));
                KeEvent.INSTANCE.postInScope(viewRequest$RefreshPosition0);
                String s = mobileStyle0.name().toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(s, "toLowerCase(...)");
                Keditor.INSTANCE.clickEvent("video-toolbar", "mobilestyle", s);
            }

            @Override  // com.kakao.keditor.plugin.itemspec.menulistener.MediaMenuClickListener
            public void onRemoveMenuClicked() {
                RemoveItem viewRequest$RemoveItem0 = new RemoveItem(VideoItemSpec.this.indexOf(this), false, 2, null);
                KeEvent.INSTANCE.postInScope(viewRequest$RemoveItem0);
                Keditor.clickEvent$default(Keditor.INSTANCE, "video-toolbar", "remove", null, 4, null);
            }
        });
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ContextMenuHandler
    public void createContextMenu(@NotNull Context context0) {
        List list1;
        Intrinsics.checkNotNullParameter(context0, "context");
        List list0 = null;
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(context0), this.getContextMenulayout(), null, false);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setMenuBinding(((KeToolbarVideoMenuBinding)viewDataBinding0));
        KeToolbarVideoMenuBinding keToolbarVideoMenuBinding0 = this.getMenuBinding();
        Keditor keditor0 = Keditor.INSTANCE;
        KeditorView keditorView0 = this.findKeditorView();
        Integer integer0 = keditorView0 == null ? null : keditorView0.getEditorId();
        if(integer0 == null || KeditorStandardKt.getOr(keditor0.getLocalConfigs(), integer0, null) == null || !((Map)a.g(keditor0, integer0)).containsKey("video_style")) {
            Object object1 = keditor0.getConfig().get("video_style");
            if(!(object1 instanceof List)) {
                object1 = null;
            }
            list1 = (List)object1;
        }
        else {
            Object object0 = ((Map)a.g(keditor0, integer0)).get("video_style");
            if(!(object0 instanceof List)) {
                object0 = null;
            }
            list1 = (List)object0;
        }
        if(list1 != null) {
            list0 = list1;
        }
        keToolbarVideoMenuBinding0.setVideoStyles(list0);
        View view0 = this.getMenuBinding().getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        this.setContextMenuLayoutView(view0);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem createKeditorItem() {
        return this.createKeditorItem();
    }

    @NotNull
    public VideoItem createKeditorItem() {
        return new VideoItem();
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
    public final KeToolbarVideoMenuBinding getMenuBinding() {
        KeToolbarVideoMenuBinding keToolbarVideoMenuBinding0 = this.menuBinding;
        if(keToolbarVideoMenuBinding0 != null) {
            return keToolbarVideoMenuBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("menuBinding");
        return null;
    }

    private final int getMobileStylePadding(MobileStyle mobileStyle0) {
        return WhenMappings.$EnumSwitchMapping$0[mobileStyle0.ordinal()] == 1 ? 0 : UnitConversionKt.dp2pxRoundDown(20.0f);
    }

    @Override  // com.kakao.keditor.plugin.HasItemDecoration
    @NotNull
    public ItemDecoration itemDecoration() {
        return MediaItemDecoration.INSTANCE;
    }

    private final void loadImage(KeItemVideoBinding keItemVideoBinding0, VideoItem videoItem0) {
        ImageLoader imageLoader0 = Keditor.INSTANCE.getImageLoader();
        if(imageLoader0 != null) {
            Intrinsics.checkNotNullExpressionValue(keItemVideoBinding0.keItemVideo, "keItemVideo");
            String s = videoItem0.getThumbnail().length() <= 0 ? videoItem0.getUrl() : videoItem0.getThumbnail();
            DefaultImpls.loadImage$default(imageLoader0, keItemVideoBinding0.keItemVideo, s, "video", null, null, new Function0() {
                final VideoItem $item;

                {
                    this.$item = videoItem0;
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
                final VideoItem $item;

                {
                    this.$item = videoItem0;
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
            }, new Function0(videoItem0) {
                final VideoItem $item;
                final KeItemVideoBinding $this_loadImage;

                {
                    this.$this_loadImage = keItemVideoBinding0;
                    this.$item = videoItem0;
                    super(0);
                }

                @Override  // kotlin.jvm.functions.Function0
                public Object invoke() {
                    this.invoke();
                    return Unit.INSTANCE;
                }

                public final void invoke() {
                    this.$this_loadImage.setVideoItem(this.$item);
                }
            }, true, 24, null);
        }
    }

    private final void loadingLayout(KeItemVideoBinding keItemVideoBinding0, VideoItem videoItem0) {
        int v = this.getMobileStylePadding(videoItem0.getMobileStyle());
        KeditorView keditorView0 = this.findKeditorView();
        int v1 = keditorView0 == null ? -(v * 2) : keditorView0.getMeasuredWidth();
        keItemVideoBinding0.keItemVideoLoadingLayout.getLayoutParams().height = videoItem0.getOriginWidth() <= 0 || videoItem0.getOriginHeight() <= 0 ? v1 * 3 / 4 : videoItem0.getOriginHeight() * v1 / videoItem0.getOriginWidth();
        videoItem0.setLoadingStatus(OnLoading.INSTANCE);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    public void onItemBound(@NotNull View view0, @NotNull KeditorItem keditorItem0, int v, @NotNull KeditorState keditorState0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        Intrinsics.checkNotNullParameter(keditorItem0, "item");
        Intrinsics.checkNotNullParameter(keditorState0, "editorState");
        KeItemVideoBinding keItemVideoBinding0 = (KeItemVideoBinding)DataBindingUtil.bind(view0);
        if(keItemVideoBinding0 != null) {
            keItemVideoBinding0.setVideoItem(((VideoItem)keditorItem0));
            keItemVideoBinding0.setHasFocus(v == keditorState0.getFocusedItemPosition());
            this.loadingLayout(keItemVideoBinding0, ((VideoItem)keditorItem0));
            this.loadImage(keItemVideoBinding0, ((VideoItem)keditorItem0));
            this.updateMobileStyle(keItemVideoBinding0, ((VideoItem)keditorItem0).getMobileStyle());
            this.updateCaption(keItemVideoBinding0, ((VideoItem)keditorItem0).getCaption());
        }
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ItemViewHandler
    @NotNull
    public View onViewCreated(@NotNull ViewGroup viewGroup0, @NotNull LayoutInflater layoutInflater0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "parent");
        Intrinsics.checkNotNullParameter(layoutInflater0, "layoutInflater");
        KeItemVideoBinding keItemVideoBinding0 = (KeItemVideoBinding)DataBindingUtil.inflate(layoutInflater0, this.getLayout(), viewGroup0, false);
        i i0 = new i(this, 3);
        keItemVideoBinding0.keItemVideoLayoutWrapper.setOnFocusChangeListener(i0);
        Intrinsics.checkNotNullExpressionValue(keItemVideoBinding0.keItemVideoCaptionEditText, "keItemVideoCaptionEditText");
        EditTextStandardKt.applyCustomFont(keItemVideoBinding0.keItemVideoCaptionEditText);
        Intrinsics.checkNotNullExpressionValue(keItemVideoBinding0.keItemVideoCaptionEditText, "keItemVideoCaptionEditText");
        com.kakao.keditor.plugin.itemspec.video.VideoItemSpec.onViewCreated..inlined.addTextChangedListener.default.1 videoItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10 = new TextWatcher() {
            @Override  // android.text.TextWatcher
            public void afterTextChanged(@Nullable Editable editable0) {
            }

            @Override  // android.text.TextWatcher
            public void beforeTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
            }

            @Override  // android.text.TextWatcher
            public void onTextChanged(@Nullable CharSequence charSequence0, int v, int v1, int v2) {
                if(v2 == 1 && charSequence0 != null && charSequence0.length() > 0 && charSequence0.length() > v && charSequence0.charAt(v) == 10) {
                    this.keItemVideoCaptionEditText.getText().delete(v, v + 1);
                }
                View view0 = this.getRoot();
                Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
                com.kakao.keditor.plugin.itemspec.video.VideoItemSpec.onViewCreated.2.1 videoItemSpec$onViewCreated$2$10 = new com.kakao.keditor.plugin.itemspec.video.VideoItemSpec.onViewCreated.2.1(charSequence0);
                VideoItemSpec.this.ifFoundItem(view0, videoItemSpec$onViewCreated$2$10);
            }
        };
        keItemVideoBinding0.keItemVideoCaptionEditText.addTextChangedListener(videoItemSpec$onViewCreated$$inlined$addTextChangedListener$default$10);
        View view0 = keItemVideoBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/video/VideoItem;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.video.VideoItemSpec.onViewCreated.2.1 extends Lambda implements Function1 {
            final CharSequence $s;

            public com.kakao.keditor.plugin.itemspec.video.VideoItemSpec.onViewCreated.2.1(CharSequence charSequence0) {
                this.$s = charSequence0;
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                this.invoke(((VideoItem)object0));
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull VideoItem videoItem0) {
                Intrinsics.checkNotNullParameter(videoItem0, "it");
                videoItem0.setCaption(String.valueOf(this.$s));
            }
        }

    }

    private static final void onViewCreated$lambda$7(VideoItemSpec videoItemSpec0, View view0, boolean z) {
        Intrinsics.checkNotNullParameter(videoItemSpec0, "this$0");
        if(z) {
            KeditorView keditorView0 = videoItemSpec0.findKeditorView();
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

    public final void setMenuBinding(@NotNull KeToolbarVideoMenuBinding keToolbarVideoMenuBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarVideoMenuBinding0, "<set-?>");
        this.menuBinding = keToolbarVideoMenuBinding0;
    }

    private final void showCaptionText(KeItemVideoBinding keItemVideoBinding0) {
        boolean z;
        int v = 0;
        if(keItemVideoBinding0.getHasFocus()) {
            z = true;
        }
        else {
            Editable editable0 = keItemVideoBinding0.keItemVideoCaptionEditText.getText();
            Intrinsics.checkNotNullExpressionValue(editable0, "getText(...)");
            z = editable0.length() == 0 ? false : true;
        }
        EditText editText0 = keItemVideoBinding0.keItemVideoCaptionEditText;
        if(!z) {
            v = 8;
        }
        editText0.setVisibility(v);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public Item toCdmItem(KeditorItem keditorItem0) {
        return this.toCdmItem(((VideoItem)keditorItem0));
    }

    @NotNull
    public Item toCdmItem(@NotNull VideoItem videoItem0) {
        Intrinsics.checkNotNullParameter(videoItem0, "item");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        linkedHashMap0.put("url", videoItem0.getUrl());
        linkedHashMap0.put("thumbnail", videoItem0.getThumbnail());
        linkedHashMap0.put("originWidth", videoItem0.getOriginWidth());
        linkedHashMap0.put("originHeight", videoItem0.getOriginHeight());
        linkedHashMap0.put("style", videoItem0.getValueOrBypass("style", "alignStyle"));
        linkedHashMap0.put("mobileStyle", videoItem0.getValueOrBypass("mobileStyle", videoItem0.getMobileStyle().getStr()));
        linkedHashMap0.put("host", (videoItem0.getHost() == null ? "local" : videoItem0.getHost()));
        Integer integer0 = videoItem0.getWidth();
        if(integer0 != null) {
            linkedHashMap0.put("width", integer0.intValue());
        }
        Integer integer1 = videoItem0.getHeight();
        if(integer1 != null) {
            linkedHashMap0.put("height", integer1.intValue());
        }
        String s = videoItem0.getCaption();
        if(s != null) {
            linkedHashMap0.put("caption", s);
        }
        String s1 = videoItem0.getService();
        if(s1 != null) {
            linkedHashMap0.put("service", s1);
        }
        String s2 = videoItem0.getTitle();
        if(s2 != null) {
            linkedHashMap0.put("title", s2);
        }
        return new Item("video", linkedHashMap0, null, 4, null);
    }

    @Override  // com.kakao.keditor.plugin.itemspec.ModelConverter
    public KeditorItem toKeditorItem(Context context0, Item cDM$Item0, Map map0) {
        return this.toKeditorItem(context0, cDM$Item0, map0);
    }

    @NotNull
    public VideoItem toKeditorItem(@NotNull Context context0, @NotNull Item cDM$Item0, @NotNull Map map0) {
        String s1;
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(cDM$Item0, "item");
        Intrinsics.checkNotNullParameter(map0, "attr");
        VideoItem videoItem0 = new VideoItem();
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
        videoItem0.setUrl(s1);
        Object object1 = ItemValidatorKt.pop(map0, "thumbnail", true);
        if(object1 != null) {
            String s2 = object1.toString();
            if(s2 != null) {
                s = s2;
            }
        }
        videoItem0.setThumbnail(s);
        Object object2 = ItemValidatorKt.pop(map0, "originWidth", true);
        String s3 = null;
        Number number0 = object2 instanceof Number ? ((Number)object2) : null;
        videoItem0.setOriginWidth((number0 == null ? 0 : number0.intValue()));
        Object object3 = ItemValidatorKt.pop(map0, "originHeight", true);
        Number number1 = object3 instanceof Number ? ((Number)object3) : null;
        videoItem0.setOriginHeight((number1 == null ? 0 : number1.intValue()));
        Object object4 = ItemValidatorKt.pop$default(map0, "width", false, 2, null);
        Number number2 = object4 instanceof Number ? ((Number)object4) : null;
        videoItem0.setWidth((number2 == null ? null : number2.intValue()));
        Object object5 = ItemValidatorKt.pop$default(map0, "height", false, 2, null);
        Number number3 = object5 instanceof Number ? ((Number)object5) : null;
        videoItem0.setHeight((number3 == null ? null : number3.intValue()));
        String s4 = this.popValueOrDefault(map0, "style", "alignStyle", true);
        videoItem0.setStyle(Style.Companion.byName(s4));
        Intrinsics.checkNotNullExpressionValue("widthorigin", "toLowerCase(...)");
        String s5 = this.popValueOrDefault(map0, "mobileStyle", "widthorigin", true);
        videoItem0.setMobileStyle(MobileStyle.Companion.byName(s5));
        Object object6 = ItemValidatorKt.pop$default(map0, "caption", false, 2, null);
        videoItem0.setCaption((object6 == null ? null : object6.toString()));
        Object object7 = ItemValidatorKt.pop$default(map0, "title", false, 2, null);
        videoItem0.setTitle((object7 == null ? null : object7.toString()));
        videoItem0.setLocation((new Regex("https?://").containsMatchIn(videoItem0.getUrl()) ? Location.UPLOADED : Location.LOCAL));
        videoItem0.setLoadingStatus(OnLoading.INSTANCE);
        Object object8 = ItemValidatorKt.pop(map0, "host", true);
        videoItem0.setHost$keditor_release((object8 == null ? null : object8.toString()));
        Object object9 = ItemValidatorKt.pop$default(map0, "service", false, 2, null);
        if(object9 != null) {
            s3 = object9.toString();
        }
        videoItem0.setService$keditor_release(s3);
        return videoItem0;
    }

    private final void updateCaption(KeItemVideoBinding keItemVideoBinding0, String s) {
        EditText editText0 = keItemVideoBinding0.keItemVideoCaptionEditText;
        if(s == null) {
            s = "";
        }
        editText0.setText(s);
        this.showCaptionText(keItemVideoBinding0);
    }

    private final void updateMobileStyle(KeItemVideoBinding keItemVideoBinding0, MobileStyle mobileStyle0) {
        int v = this.getMobileStylePadding(mobileStyle0);
        keItemVideoBinding0.keItemVideoLayout.setPadding(v, 0, v, 0);
    }
}

