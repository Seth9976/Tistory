package com.kakao.keditor.toolbar;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation.Bounds;
import android.view.WindowInsetsAnimation.Callback;
import android.view.WindowInsetsAnimation;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.activity.m;
import androidx.annotation.DrawableRes;
import androidx.annotation.IdRes;
import androidx.annotation.RequiresApi;
import androidx.annotation.StringRes;
import androidx.core.view.ViewGroupKt;
import androidx.core.view.w;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.ViewModelProvider.NewInstanceFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import com.google.android.material.datepicker.t;
import com.kakao.common.view.SoftInputKt;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.R.layout;
import com.kakao.keditor.R.string;
import com.kakao.keditor.R.styleable;
import com.kakao.keditor.databinding.KeToolbarLayoutBinding;
import com.kakao.keditor.plugin.attrs.Alignment.Left;
import com.kakao.keditor.plugin.attrs.Alignment;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.itemspec.RootItemSpec;
import com.kakao.keditor.plugin.pluginspec.PluginSpec;
import com.kakao.keditor.plugin.pluginspec.PluginSpecs;
import com.kakao.keditor.standard.ViewStandardKt;
import com.kakao.keditor.toolbar.category.OverlayCategory.MorePlugin;
import com.kakao.keditor.toolbar.category.OverlayCategory;
import com.kakao.keditor.toolbar.category.ToolbarCategory.Idle;
import com.kakao.keditor.toolbar.category.ToolbarCategory.Text;
import com.kakao.keditor.toolbar.category.ToolbarCategory;
import com.kakao.keditor.toolbar.toolbaroverlay.ExtraCandidateItem;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlay;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenu;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuCandidatesKt;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener;
import com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuItem;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.ApplyOverlayCategory;
import com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory;
import com.kakao.keditor.util.eventbus.ToolbarRequest.FocusChanged;
import com.kakao.keditor.util.eventbus.ToolbarRequest.HideSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ToolbarRequest.InitToolbar;
import com.kakao.keditor.util.eventbus.ToolbarRequest.OnToolbarExtraClicked;
import com.kakao.keditor.util.eventbus.ToolbarRequest.ShowSoftInputOverlay;
import com.kakao.keditor.util.eventbus.ToolbarRequest;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function8;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000\u00AF\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001B\u0018\u00002\u00020\u0001B\u000F\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u00A2\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u00A2\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\t\u00A2\u0006\u0002\u0010\nB)\b\u0016\u0012\u0006\u0010\u0002\u001A\u00020\u0003\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001A\u00020\t\u0012\u0006\u0010\u000B\u001A\u00020\t\u00A2\u0006\u0002\u0010\fJD\u0010E\u001A\u00020!2\u0006\u0010\u0018\u001A\u00020F2\b\b\u0001\u0010G\u001A\u00020\t2\b\b\u0001\u0010H\u001A\u00020\t2\b\b\u0001\u0010I\u001A\u00020\t2\b\b\u0001\u0010J\u001A\u00020\t2\f\u0010K\u001A\b\u0012\u0004\u0012\u00020!0LJ\u000E\u0010M\u001A\u00020!2\u0006\u0010&\u001A\u00020\'J\r\u0010N\u001A\u00020!H\u0000\u00A2\u0006\u0002\bOJ\u0015\u0010P\u001A\u00020!2\u0006\u0010Q\u001A\u000206H\u0000\u00A2\u0006\u0002\bRJ\b\u0010S\u001A\u00020!H\u0003J\b\u0010T\u001A\u00020!H\u0003J\b\u0010U\u001A\u00020!H\u0002J\b\u0010V\u001A\u00020!H\u0002J\u0006\u0010W\u001A\u00020$J\u0012\u0010X\u001A\u00020!2\b\u0010Y\u001A\u0004\u0018\u00010ZH\u0002J\u0012\u0010[\u001A\u00020!2\b\u0010\\\u001A\u0004\u0018\u00010]H\u0014J\b\u0010^\u001A\u00020!H\u0014J\u001E\u0010_\u001A\u00020!2\u0016\u0010_\u001A\u0012\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!0.j\u0002`0J\u0012\u0010`\u001A\u00020!2\b\b\u0002\u0010a\u001A\u00020$H\u0002J\r\u0010b\u001A\u00020!H\u0000\u00A2\u0006\u0002\bcJ\u0012\u0010d\u001A\u00020!2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0006H\u0002J\b\u0010e\u001A\u00020!H\u0002J\u0017\u0010f\u001A\u00020!2\b\b\u0002\u0010g\u001A\u00020$H\u0000\u00A2\u0006\u0002\bhJ\r\u0010i\u001A\u00020!H\u0000\u00A2\u0006\u0002\bjJ\u001D\u0010k\u001A\u00020!2\u0006\u0010l\u001A\u00020m2\u0006\u0010n\u001A\u00020ZH\u0000\u00A2\u0006\u0002\boJ\u001D\u0010p\u001A\u00020!2\u0006\u0010l\u001A\u00020m2\u0006\u0010n\u001A\u00020ZH\u0000\u00A2\u0006\u0002\bqR\u001A\u0010\r\u001A\u00020\u000EX\u0080.\u00A2\u0006\u000E\n\u0000\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000E\u0010\u0013\u001A\u00020\tX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010\u0014\u001A\u00020\tX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u00C1\u0001\u0010\u0015\u001A\u00B4\u0001\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001A\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001B\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001C\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001D\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001E\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001F\u0012\u0013\u0012\u00110\t\u00A2\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b( \u0012\u0004\u0012\u00020!0\u0016j\u0002`\"X\u0082\u0004\u00A2\u0006\u0002\n\u0000R\u000E\u0010#\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u000E\u0010%\u001A\u00020$X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001C\u0010&\u001A\u0004\u0018\u00010\'X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000E\u0010,\u001A\u00020\tX\u0082\u000E\u00A2\u0006\u0002\n\u0000R\"\u0010-\u001A\u0016\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020!\u0018\u00010.j\u0004\u0018\u0001`0X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0014\u00101\u001A\u0002028BX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\b3\u00104R\u000E\u00105\u001A\u000206X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u0010\u00107\u001A\u0004\u0018\u000108X\u0082\u000E\u00A2\u0006\u0002\n\u0000R\u001A\u00109\u001A\u00020:X\u0080\u000E\u00A2\u0006\u000E\n\u0000\u001A\u0004\b;\u0010<\"\u0004\b=\u0010>R\u000E\u0010?\u001A\u00020@X\u0082.\u00A2\u0006\u0002\n\u0000R\u0014\u0010A\u001A\u00020B8CX\u0082\u0004\u00A2\u0006\u0006\u001A\u0004\bC\u0010D\u00A8\u0006r"}, d2 = {"Lcom/kakao/keditor/toolbar/KeditorToolbar;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "binding", "Lcom/kakao/keditor/databinding/KeToolbarLayoutBinding;", "getBinding$keditor_release", "()Lcom/kakao/keditor/databinding/KeToolbarLayoutBinding;", "setBinding$keditor_release", "(Lcom/kakao/keditor/databinding/KeToolbarLayoutBinding;)V", "extraButtonContentDescriptionSrc", "extraButtonSrc", "frameChangedListener", "Lkotlin/Function8;", "Lkotlin/ParameterName;", "name", "oldLeft", "oldTop", "oldRight", "oldBottom", "newLeft", "newTop", "newRight", "newBottom", "", "Lcom/kakao/keditor/delegate/FrameChangedListener;", "isEnableExtraButton", "", "isEnableImageEdit", "keditorView", "Lcom/kakao/keditor/KeditorView;", "getKeditorView$keditor_release", "()Lcom/kakao/keditor/KeditorView;", "setKeditorView$keditor_release", "(Lcom/kakao/keditor/KeditorView;)V", "keditorViewId", "onExtraButtonClicked", "Lkotlin/Function1;", "Landroid/widget/ImageView;", "Lcom/kakao/keditor/toolbar/OnExtraButtonClick;", "overlayMenu", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenu;", "getOverlayMenu", "()Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlayMenu;", "previousCategory", "Lcom/kakao/keditor/toolbar/category/ToolbarCategory;", "softInputOverlay", "Lcom/kakao/keditor/toolbar/toolbaroverlay/ToolbarOverlay;", "sort", "Lcom/kakao/keditor/plugin/attrs/Alignment;", "getSort$keditor_release", "()Lcom/kakao/keditor/plugin/attrs/Alignment;", "setSort$keditor_release", "(Lcom/kakao/keditor/plugin/attrs/Alignment;)V", "viewModel", "Lcom/kakao/keditor/toolbar/KeditorToolbarViewModel;", "windowInsetsAnimationCallback", "com/kakao/keditor/toolbar/KeditorToolbar$windowInsetsAnimationCallback$1", "getWindowInsetsAnimationCallback", "()Lcom/kakao/keditor/toolbar/KeditorToolbar$windowInsetsAnimationCallback$1;", "addMoreMenu", "", "id", "imageSrc", "accessibilityDescResId", "textResId", "action", "Lkotlin/Function0;", "attachTo", "backCategory", "backCategory$keditor_release", "changeCategory", "toolbarCategory", "changeCategory$keditor_release", "doOnPrepareSoftInputHidden", "doOnPrepareSoftInputShown", "initViewModel", "initViews", "onBackPressed", "onChangeToolbarOverlayCategory", "overlayCategory", "Lcom/kakao/keditor/toolbar/category/OverlayCategory;", "onConfigurationChanged", "newConfig", "Landroid/content/res/Configuration;", "onDetachedFromWindow", "onExtraClicked", "onFocusedItemChanged", "hideInput", "openTextMenu", "openTextMenu$keditor_release", "readAttributes", "registViewRequestController", "requestHideSoftInputOverlay", "showSoftInput", "requestHideSoftInputOverlay$keditor_release", "requestHideSoftInputOverlayIfShowing", "requestHideSoftInputOverlayIfShowing$keditor_release", "requestShowSoftInputOverlay", "content", "Landroid/view/View;", "category", "requestShowSoftInputOverlay$keditor_release", "toggleSoftInputOverlay", "toggleSoftInputOverlay$keditor_release", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nKeditorToolbar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KeditorToolbar.kt\ncom/kakao/keditor/toolbar/KeditorToolbar\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,395:1\n1855#2,2:396\n1549#2:398\n1620#2,3:399\n1855#2,2:402\n1855#2,2:404\n1324#3,3:406\n*S KotlinDebug\n*F\n+ 1 KeditorToolbar.kt\ncom/kakao/keditor/toolbar/KeditorToolbar\n*L\n146#1:396,2\n152#1:398\n152#1:399,3\n263#1:402,2\n269#1:404,2\n354#1:406,3\n*E\n"})
public final class KeditorToolbar extends FrameLayout {
    public KeToolbarLayoutBinding binding;
    private int extraButtonContentDescriptionSrc;
    private int extraButtonSrc;
    @NotNull
    private final Function8 frameChangedListener;
    private boolean isEnableExtraButton;
    private boolean isEnableImageEdit;
    @Nullable
    private KeditorView keditorView;
    private int keditorViewId;
    @Nullable
    private Function1 onExtraButtonClicked;
    @NotNull
    private ToolbarCategory previousCategory;
    @Nullable
    private ToolbarOverlay softInputOverlay;
    @NotNull
    private Alignment sort;
    private KeditorToolbarViewModel viewModel;

    public KeditorToolbar(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0);
        this.keditorViewId = -1;
        this.frameChangedListener = new Function8() {
            {
                KeditorToolbar.this = keditorToolbar0;
                super(8);
            }

            @Override  // kotlin.jvm.functions.Function8
            public Object invoke(Object object0, Object object1, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7) {
                this.invoke(((Number)object0).intValue(), ((Number)object1).intValue(), ((Number)object2).intValue(), ((Number)object3).intValue(), ((Number)object4).intValue(), ((Number)object5).intValue(), ((Number)object6).intValue(), ((Number)object7).intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                int v8 = v7 >= v3 ? 0 : 1;
                if((v3 >= v7 ? 0 : 1) != v8) {
                    if(v8 == 0) {
                        KeditorToolbar.requestHideSoftInputOverlay$keditor_release$default(KeditorToolbar.this, false, 1, null);
                        return;
                    }
                    KeditorToolbar.this.requestHideSoftInputOverlayIfShowing$keditor_release();
                }
            }
        };
        this.previousCategory = Idle.INSTANCE;
        this.extraButtonSrc = -1;
        this.extraButtonContentDescriptionSrc = -1;
        this.sort = Left.INSTANCE;
    }

    public KeditorToolbar(@NotNull Context context0, @Nullable AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0);
        this.keditorViewId = -1;
        this.frameChangedListener = new com.kakao.keditor.toolbar.KeditorToolbar.frameChangedListener.1(this);
        this.previousCategory = Idle.INSTANCE;
        this.extraButtonSrc = -1;
        this.extraButtonContentDescriptionSrc = -1;
        this.sort = Left.INSTANCE;
        this.readAttributes(attributeSet0);
    }

    public KeditorToolbar(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v);
        this.keditorViewId = -1;
        this.frameChangedListener = new com.kakao.keditor.toolbar.KeditorToolbar.frameChangedListener.1(this);
        this.previousCategory = Idle.INSTANCE;
        this.extraButtonSrc = -1;
        this.extraButtonContentDescriptionSrc = -1;
        this.sort = Left.INSTANCE;
        this.readAttributes(attributeSet0);
    }

    public KeditorToolbar(@NotNull Context context0, @Nullable AttributeSet attributeSet0, int v, int v1) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super(context0, attributeSet0, v, v1);
        this.keditorViewId = -1;
        this.frameChangedListener = new com.kakao.keditor.toolbar.KeditorToolbar.frameChangedListener.1(this);
        this.previousCategory = Idle.INSTANCE;
        this.extraButtonSrc = -1;
        this.extraButtonContentDescriptionSrc = -1;
        this.sort = Left.INSTANCE;
        this.readAttributes(attributeSet0);
    }

    public static void a(KeditorToolbar keditorToolbar0, View view0) {
        KeditorToolbar.readAttributes$lambda$5(keditorToolbar0, view0);
    }

    public final void addMoreMenu(@NotNull String s, @IdRes int v, @DrawableRes int v1, @StringRes int v2, @StringRes int v3, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(function00, "action");
        ToolbarOverlayMenuCandidatesKt.getExtraCandidates().put(s, new ExtraCandidateItem(new ToolbarOverlayMenuItem(v, v1, v2, v3, null, 16, null), function00));
    }

    public final void attachTo(@NotNull KeditorView keditorView0) {
        Intrinsics.checkNotNullParameter(keditorView0, "keditorView");
        if(this.keditorView == null) {
            this.keditorView = keditorView0;
            View view0 = this.getRootView();
            if(view0 != null) {
                view0.setWindowInsetsAnimationCallback(this.getWindowInsetsAnimationCallback());
            }
            this.softInputOverlay = new ToolbarOverlay(keditorView0.getSoftInputDetector());
            this.initViews();
            return;
        }
        Keditor.INSTANCE.log(this, "Already attached KeditorView");
    }

    public final void backCategory$keditor_release() {
        this.changeCategory$keditor_release(this.previousCategory);
    }

    public final void changeCategory$keditor_release(@NotNull ToolbarCategory toolbarCategory0) {
        ToolbarCategory toolbarCategory1;
        Intrinsics.checkNotNullParameter(toolbarCategory0, "toolbarCategory");
        Idle toolbarCategory$Idle0 = Idle.INSTANCE;
        if(Intrinsics.areEqual(toolbarCategory0, toolbarCategory$Idle0)) {
            toolbarCategory1 = toolbarCategory$Idle0;
        }
        else {
            toolbarCategory1 = this.getBinding$keditor_release().getActiveCategory();
            if(toolbarCategory1 == null) {
                toolbarCategory1 = toolbarCategory$Idle0;
            }
            Intrinsics.checkNotNull(toolbarCategory1);
        }
        this.previousCategory = toolbarCategory1;
        this.getBinding$keditor_release().setActiveCategory(toolbarCategory0);
        if(Intrinsics.areEqual(toolbarCategory0, toolbarCategory$Idle0)) {
            KeToolbarLayoutBinding keToolbarLayoutBinding0 = this.getBinding$keditor_release();
            Intrinsics.checkNotNullExpressionValue(keToolbarLayoutBinding0.keMenuRoot, "keMenuRoot");
            int v = 0;
            for(Object object0: ViewGroupKt.getChildren(keToolbarLayoutBinding0.keMenuRoot)) {
                if(v < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                }
                if(v > 0) {
                    ((View)object0).setVisibility(8);
                }
                ++v;
            }
        }
    }

    @RequiresApi(30)
    private final void doOnPrepareSoftInputHidden() {
        if(this.softInputOverlay != null && this.softInputOverlay.isShowing()) {
            this.getBinding$keditor_release().overlay.setVisibility(0);
        }
    }

    @RequiresApi(30)
    private final void doOnPrepareSoftInputShown() {
        if(Intrinsics.areEqual(this.getBinding$keditor_release().getActiveOverlayCategory(), MorePlugin.INSTANCE)) {
            this.changeCategory$keditor_release(Idle.INSTANCE);
        }
        this.onChangeToolbarOverlayCategory(null);
        ToolbarOverlay toolbarOverlay0 = this.softInputOverlay;
        if(toolbarOverlay0 != null) {
            ToolbarOverlay.dismiss$default(toolbarOverlay0, null, 1, null);
        }
        this.getBinding$keditor_release().overlay.setVisibility(8);
    }

    @NotNull
    public final KeToolbarLayoutBinding getBinding$keditor_release() {
        KeToolbarLayoutBinding keToolbarLayoutBinding0 = this.binding;
        if(keToolbarLayoutBinding0 != null) {
            return keToolbarLayoutBinding0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }

    @Nullable
    public final KeditorView getKeditorView$keditor_release() {
        return this.keditorView;
    }

    private final ToolbarOverlayMenu getOverlayMenu() {
        Context context0 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        ToolbarOverlayMenu toolbarOverlayMenu0 = new ToolbarOverlayMenu(context0, null, 0, 0, new ToolbarOverlayMenuClickedListener() {
            public void onOverlayMenuClicked(@NotNull ToolbarOverlayMenuItem toolbarOverlayMenuItem0) {
                Intrinsics.checkNotNullParameter(toolbarOverlayMenuItem0, "item");
                KeditorView keditorView0 = KeditorToolbar.this.getKeditorView$keditor_release();
                if(keditorView0 != null) {
                    PluginSpecs pluginSpecs0 = keditorView0.getPluginSpecs();
                    if(pluginSpecs0 != null) {
                        List list0 = pluginSpecs0.getPlugins();
                        if(list0 != null) {
                            for(Object object0: list0) {
                                PluginSpec pluginSpec0 = (PluginSpec)object0;
                                ToolbarOverlayMenuItem toolbarOverlayMenuItem1 = pluginSpec0.getToolbarOverlayMenuItem();
                                if(toolbarOverlayMenuItem1 != null && toolbarOverlayMenuItem1.getId() == toolbarOverlayMenuItem0.getId()) {
                                    pluginSpec0.runIconClick();
                                }
                            }
                        }
                    }
                }
                Object object1 = null;
                for(Object object2: ToolbarOverlayMenuCandidatesKt.getExtraCandidates().values()) {
                    if(((ExtraCandidateItem)object2).getMenu().getId() == toolbarOverlayMenuItem0.getId()) {
                        object1 = object2;
                        break;
                    }
                }
                if(((ExtraCandidateItem)object1) != null) {
                    Function0 function00 = ((ExtraCandidateItem)object1).getOnClickAction();
                    if(function00 != null) {
                        function00.invoke();
                    }
                }
                KeditorToolbar.this.requestHideSoftInputOverlayIfShowing$keditor_release();
            }

            @Override  // com.kakao.keditor.toolbar.toolbaroverlay.ToolbarOverlayMenuClickedListener
            public void onOverlayMenuClicked(Object object0) {
                this.onOverlayMenuClicked(((ToolbarOverlayMenuItem)object0));
            }
        }, 14, null);
        ArrayList arrayList0 = new ArrayList();
        KeditorView keditorView0 = this.keditorView;
        if(keditorView0 != null) {
            PluginSpecs pluginSpecs0 = keditorView0.getPluginSpecs();
            if(pluginSpecs0 != null) {
                List list0 = pluginSpecs0.getPlugins();
                if(list0 != null) {
                    for(Object object0: list0) {
                        PluginSpec pluginSpec0 = (PluginSpec)object0;
                        if(pluginSpec0.addToolbarOverlayMenu()) {
                            ToolbarOverlayMenuItem toolbarOverlayMenuItem0 = pluginSpec0.getToolbarOverlayMenuItem();
                            if(toolbarOverlayMenuItem0 != null) {
                                arrayList0.add(toolbarOverlayMenuItem0);
                            }
                        }
                    }
                }
            }
        }
        Iterable iterable0 = ToolbarOverlayMenuCandidatesKt.getExtraCandidates().values();
        ArrayList arrayList1 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object1: iterable0) {
            arrayList1.add(((ExtraCandidateItem)object1).getMenu());
        }
        arrayList0.addAll(arrayList1);
        toolbarOverlayMenu0.setItems(arrayList0);
        return toolbarOverlayMenu0;
    }

    @NotNull
    public final Alignment getSort$keditor_release() {
        return this.sort;
    }

    @RequiresApi(30)
    private final com.kakao.keditor.toolbar.KeditorToolbar.windowInsetsAnimationCallback.1 getWindowInsetsAnimationCallback() {
        return new WindowInsetsAnimation.Callback() {
            {
                KeditorToolbar.this = keditorToolbar0;
                super(1);
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            public void onPrepare(@NotNull WindowInsetsAnimation windowInsetsAnimation0) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimation0, "animation");
                if(windowInsetsAnimation0.getTypeMask() != 8) {
                    return;
                }
                if(!SoftInputKt.imeVisible(KeditorToolbar.this)) {
                    KeditorToolbar.this.doOnPrepareSoftInputShown();
                    return;
                }
                KeditorToolbar.this.doOnPrepareSoftInputHidden();
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            @NotNull
            public WindowInsets onProgress(@NotNull WindowInsets windowInsets0, @NotNull List list0) {
                Intrinsics.checkNotNullParameter(windowInsets0, "insets");
                Intrinsics.checkNotNullParameter(list0, "runningAnimations");
                return windowInsets0;
            }

            @Override  // android.view.WindowInsetsAnimation$Callback
            @NotNull
            public WindowInsetsAnimation.Bounds onStart(@NotNull WindowInsetsAnimation windowInsetsAnimation0, @NotNull WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds0) {
                Intrinsics.checkNotNullParameter(windowInsetsAnimation0, "animation");
                Intrinsics.checkNotNullParameter(windowInsetsAnimation$Bounds0, "bounds");
                KeditorView keditorView0 = KeditorToolbar.this.getKeditorView$keditor_release();
                if(keditorView0 != null) {
                    KeditorView keditorView1 = KeditorToolbar.this.getKeditorView$keditor_release();
                    View view0 = null;
                    Context context0 = keditorView1 == null ? null : keditorView1.getContext();
                    Activity activity0 = context0 instanceof Activity ? ((Activity)context0) : null;
                    if(activity0 != null) {
                        view0 = activity0.getCurrentFocus();
                    }
                    if(view0 instanceof EditText && ViewStandardKt.isDescendentOf(view0, keditorView0)) {
                        keditorView0.post(new m(18, ((EditText)view0), keditorView0));
                    }
                }
                WindowInsetsAnimation.Bounds windowInsetsAnimation$Bounds1 = super.onStart(windowInsetsAnimation0, windowInsetsAnimation$Bounds0);
                Intrinsics.checkNotNullExpressionValue(windowInsetsAnimation$Bounds1, "onStart(...)");
                return windowInsetsAnimation$Bounds1;
            }

            private static final void onStart$lambda$2$lambda$1(View view0, KeditorView keditorView0) {
                Intrinsics.checkNotNullParameter(keditorView0, "$this_run");
                if(!((EditText)view0).bringPointIntoView(((EditText)view0).getSelectionStart())) {
                    keditorView0.postDelayed(new w(2, view0), 200L);
                }
            }

            private static final void onStart$lambda$2$lambda$1$lambda$0(View view0) {
                ((EditText)view0).bringPointIntoView(((EditText)view0).getSelectionStart());
            }
        };
    }

    private final void initViewModel() {
        Context context0 = this.getContext();
        Intrinsics.checkNotNull(context0, "null cannot be cast to non-null type androidx.lifecycle.ViewModelStoreOwner");
        KeditorToolbarViewModel keditorToolbarViewModel0 = (KeditorToolbarViewModel)new ViewModelProvider(((ViewModelStoreOwner)context0), new NewInstanceFactory()).get(KeditorToolbarViewModel.class);
        this.viewModel = keditorToolbarViewModel0;
        if(keditorToolbarViewModel0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewModel");
            keditorToolbarViewModel0 = null;
        }
        Context context1 = this.getContext();
        Intrinsics.checkNotNull(context1, "null cannot be cast to non-null type androidx.lifecycle.LifecycleOwner");
        keditorToolbarViewModel0.getToolbarCategory().observe(((LifecycleOwner)context1), new KeditorToolbar.sam.androidx_lifecycle_Observer.0(com.kakao.keditor.toolbar.KeditorToolbar.initViewModel.1.INSTANCE));

        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u00012\u000E\u0010\u0002\u001A\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/toolbar/category/ToolbarCategory;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.toolbar.KeditorToolbar.initViewModel.1 extends Lambda implements Function1 {
            public static final com.kakao.keditor.toolbar.KeditorToolbar.initViewModel.1 INSTANCE;

            static {
                com.kakao.keditor.toolbar.KeditorToolbar.initViewModel.1.INSTANCE = new com.kakao.keditor.toolbar.KeditorToolbar.initViewModel.1();
            }

            public com.kakao.keditor.toolbar.KeditorToolbar.initViewModel.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(ToolbarCategory toolbarCategory0) {
            }
        }

    }

    private final void initViews() {
        PluginSpecs pluginSpecs0 = this.keditorView == null ? null : this.keditorView.getPluginSpecs();
        Intrinsics.checkNotNull(pluginSpecs0);
        for(Object object0: pluginSpecs0.getPlugins()) {
            View view0 = ((PluginSpec)object0).getContextMenuIcon();
            if(view0 != null) {
                this.getBinding$keditor_release().keMenuContainer.addView(view0);
            }
        }
        KeditorView keditorView0 = this.keditorView;
        if(keditorView0 != null) {
            ItemSpecs itemSpecs0 = keditorView0.getItemSpecs();
            if(itemSpecs0 != null) {
                List list0 = itemSpecs0.getItemSpecList();
                if(list0 != null) {
                    for(Object object1: list0) {
                        View view1 = ((RootItemSpec)object1).getContextMenuLayoutView();
                        view1.setVisibility(8);
                        this.getBinding$keditor_release().keMenuRoot.addView(view1);
                    }
                }
            }
        }
        this.getBinding$keditor_release().setIsEnableExtra(this.isEnableExtraButton);
        this.getBinding$keditor_release().setExtraButtonSrc(this.extraButtonSrc);
        this.getBinding$keditor_release().setExtraButtonContentDescriptionSrc(this.extraButtonContentDescriptionSrc);
    }

    public final boolean onBackPressed() {
        if(this.softInputOverlay != null && this.softInputOverlay.isShowing()) {
            this.requestHideSoftInputOverlay$keditor_release(false);
            this.backCategory$keditor_release();
            return true;
        }
        return false;
    }

    private final void onChangeToolbarOverlayCategory(OverlayCategory overlayCategory0) {
        this.getBinding$keditor_release().setActiveOverlayCategory(overlayCategory0);
        ApplyOverlayCategory pluginSpecRequest$ApplyOverlayCategory0 = new ApplyOverlayCategory(overlayCategory0);
        KeEvent.INSTANCE.postInScope(pluginSpecRequest$ApplyOverlayCategory0);
    }

    @Override  // android.view.View
    public void onConfigurationChanged(@Nullable Configuration configuration0) {
        super.onConfigurationChanged(configuration0);
        KeEvent.INSTANCE.postInScope(HideSoftInputOverlay.INSTANCE);
    }

    @Override  // android.view.ViewGroup
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.requestHideSoftInputOverlayIfShowing$keditor_release();
        this.onExtraButtonClicked = null;
    }

    public final void onExtraClicked(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "onExtraClicked");
        this.onExtraButtonClicked = function10;
    }

    private final void onFocusedItemChanged(boolean z) {
        this.requestHideSoftInputOverlayIfShowing$keditor_release();
        if(z) {
            KeditorView keditorView0 = this.keditorView;
            if(keditorView0 != null) {
                keditorView0.requestHideInput();
            }
        }
    }

    public static void onFocusedItemChanged$default(KeditorToolbar keditorToolbar0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = false;
        }
        keditorToolbar0.onFocusedItemChanged(z);
    }

    public final void openTextMenu$keditor_release() {
        this.getBinding$keditor_release().setActiveCategory(Text.INSTANCE);
        this.requestHideSoftInputOverlayIfShowing$keditor_release();
    }

    private final void readAttributes(AttributeSet attributeSet0) {
        TypedArray typedArray0 = this.getContext().obtainStyledAttributes(attributeSet0, styleable.KeditorToolbar);
        this.keditorViewId = typedArray0.getResourceId(styleable.KeditorToolbar_ke_keditor_view, -1);
        this.isEnableImageEdit = typedArray0.getBoolean(styleable.KeditorToolbar_ke_image_edit_enable, false);
        this.isEnableExtraButton = typedArray0.getBoolean(styleable.KeditorToolbar_ke_extra_button_enable, false);
        this.extraButtonSrc = typedArray0.getResourceId(styleable.KeditorToolbar_ke_extra_button_src, -1);
        this.extraButtonContentDescriptionSrc = typedArray0.getResourceId(styleable.KeditorToolbar_ke_extra_button_content_description_src, -1);
        ViewDataBinding viewDataBinding0 = DataBindingUtil.inflate(LayoutInflater.from(this.getContext()), layout.ke_toolbar_layout, this, true);
        Intrinsics.checkNotNullExpressionValue(viewDataBinding0, "inflate(...)");
        this.setBinding$keditor_release(((KeToolbarLayoutBinding)viewDataBinding0));
        KeToolbarLayoutBinding keToolbarLayoutBinding0 = this.getBinding$keditor_release();
        t t0 = new t(this, 7);
        keToolbarLayoutBinding0.keMenuMore.setOnClickListener(t0);
        this.getBinding$keditor_release().setActiveCategory(Idle.INSTANCE);
        this.initViewModel();
        this.registViewRequestController();
    }

    private static final void readAttributes$lambda$5(KeditorToolbar keditorToolbar0, View view0) {
        Intrinsics.checkNotNullParameter(keditorToolbar0, "this$0");
        ToolbarCategory toolbarCategory0 = keditorToolbar0.getBinding$keditor_release().getActiveCategory();
        Idle toolbarCategory$Idle0 = Idle.INSTANCE;
        if(Intrinsics.areEqual(toolbarCategory0, toolbarCategory$Idle0)) {
            Keditor.clickEvent$default(Keditor.INSTANCE, "toolbar", "moremenu", null, 4, null);
            OverlayCategory overlayCategory0 = keditorToolbar0.getBinding$keditor_release().getActiveOverlayCategory();
            MorePlugin overlayCategory$MorePlugin0 = MorePlugin.INSTANCE;
            if(Intrinsics.areEqual(overlayCategory0, overlayCategory$MorePlugin0)) {
                keditorToolbar0.backCategory$keditor_release();
                keditorToolbar0.requestHideSoftInputOverlayIfShowing$keditor_release();
                return;
            }
            keditorToolbar0.requestShowSoftInputOverlay$keditor_release(keditorToolbar0.getOverlayMenu(), overlayCategory$MorePlugin0);
            return;
        }
        keditorToolbar0.getBinding$keditor_release().setActiveCategory(toolbarCategory$Idle0);
    }

    private final void registViewRequestController() {
        Context context0 = this.getContext();
        LifecycleOwner lifecycleOwner0 = context0 instanceof LifecycleOwner ? ((LifecycleOwner)context0) : null;
        if(lifecycleOwner0 != null) {
            BuildersKt.launch$default(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner0), null, null, new Function2(this, null) {
                final LifecycleOwner $owner;
                int label;

                {
                    this.$owner = lifecycleOwner0;
                    KeditorToolbar.this = keditorToolbar0;
                    super(2, continuation0);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @NotNull
                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                    return new com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1(this.$owner, KeditorToolbar.this, continuation0);
                }

                @Override  // kotlin.jvm.functions.Function2
                public Object invoke(Object object0, Object object1) {
                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                }

                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                    return ((com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                }

                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Nullable
                public final Object invokeSuspend(@NotNull Object object0) {
                    Object object1 = a.getCOROUTINE_SUSPENDED();
                    switch(this.label) {
                        case 0: {
                            ResultKt.throwOnFailure(object0);
                            com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1 keditorToolbar$registViewRequestController$1$1$10 = new Function2(null) {
                                private Object L$0;
                                int label;

                                {
                                    KeditorToolbar.this = keditorToolbar0;
                                    super(2, continuation0);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @NotNull
                                public final Continuation create(@Nullable Object object0, @NotNull Continuation continuation0) {
                                    Continuation continuation1 = new com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1(KeditorToolbar.this, continuation0);
                                    continuation1.L$0 = object0;
                                    return continuation1;
                                }

                                @Override  // kotlin.jvm.functions.Function2
                                public Object invoke(Object object0, Object object1) {
                                    return this.invoke(((CoroutineScope)object0), ((Continuation)object1));
                                }

                                @Nullable
                                public final Object invoke(@NotNull CoroutineScope coroutineScope0, @Nullable Continuation continuation0) {
                                    return ((com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1)this.create(coroutineScope0, continuation0)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    Object object1 = a.getCOROUTINE_SUSPENDED();
                                    switch(this.label) {
                                        case 0: {
                                            ResultKt.throwOnFailure(object0);
                                            CoroutineScope coroutineScope0 = (CoroutineScope)this.L$0;
                                            com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.2 keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$20 = new Flow() {
                                                @Override  // kotlinx.coroutines.flow.Flow
                                                @Nullable
                                                public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                                                    com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.2.2 keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$20 = new FlowCollector() {
                                                        @Override  // kotlinx.coroutines.flow.FlowCollector
                                                        @Nullable
                                                        public final Object emit(Object object0, @NotNull Continuation continuation0) {
                                                            com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.2.2.1 keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10;
                                                            if(continuation0 instanceof com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.2.2.1) {
                                                                keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10 = (com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.2.2.1)continuation0;
                                                                int v = keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10.label;
                                                                if((v & 0x80000000) == 0) {
                                                                    keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                                                        Object L$0;
                                                                        int label;
                                                                        Object result;

                                                                        @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                        @Nullable
                                                                        public final Object invokeSuspend(@NotNull Object object0) {
                                                                            this.result = object0;
                                                                            this.label |= 0x80000000;
                                                                            return continuation0.emit(null, this);
                                                                        }
                                                                    };
                                                                }
                                                                else {
                                                                    keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10.label = v ^ 0x80000000;
                                                                }
                                                            }
                                                            else {
                                                                keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                                                    Object L$0;
                                                                    int label;
                                                                    Object result;

                                                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                    @Nullable
                                                                    public final Object invokeSuspend(@NotNull Object object0) {
                                                                        this.result = object0;
                                                                        this.label |= 0x80000000;
                                                                        return continuation0.emit(null, this);
                                                                    }
                                                                };
                                                            }
                                                            Object object1 = keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10.result;
                                                            Object object2 = a.getCOROUTINE_SUSPENDED();
                                                            switch(keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10.label) {
                                                                case 0: {
                                                                    ResultKt.throwOnFailure(object1);
                                                                    FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                                                    if(object0 == null) {
                                                                        throw new NullPointerException("null cannot be cast to non-null type com.kakao.keditor.util.eventbus.ToolbarRequest");
                                                                    }
                                                                    keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10.label = 1;
                                                                    return flowCollector0.emit(((ToolbarRequest)object0), keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$2$10) == object2 ? object2 : Unit.INSTANCE;
                                                                }
                                                                case 1: {
                                                                    ResultKt.throwOnFailure(object1);
                                                                    return Unit.INSTANCE;
                                                                }
                                                                default: {
                                                                    throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                                }
                                                            }
                                                        }
                                                    };
                                                    Object object0 = this.$this_unsafeTransform$inlined.collect(keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$2$20, continuation0);
                                                    return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                                                }
                                            };
                                            com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.1 keditorToolbar$registViewRequestController$1$1$1$10 = new FlowCollector() {
                                                @Nullable
                                                public final Object emit(@NotNull ToolbarRequest toolbarRequest0, @NotNull Continuation continuation0) {
                                                    Keditor.INSTANCE.log(KeditorToolbar.this, "ToolbarRequest : " + toolbarRequest0);
                                                    if(!(toolbarRequest0 instanceof InitToolbar)) {
                                                        if(toolbarRequest0 instanceof FocusCategory) {
                                                            ToolbarCategory toolbarCategory0 = ((FocusCategory)toolbarRequest0).getCategory();
                                                            KeditorToolbar.this.changeCategory$keditor_release(toolbarCategory0);
                                                            return Unit.INSTANCE;
                                                        }
                                                        if(toolbarRequest0 instanceof FocusChanged) {
                                                            boolean z = ((FocusChanged)toolbarRequest0).getHideInput();
                                                            KeditorToolbar.this.onFocusedItemChanged(z);
                                                            return Unit.INSTANCE;
                                                        }
                                                        if(toolbarRequest0 instanceof ShowSoftInputOverlay) {
                                                            if(((ShowSoftInputOverlay)toolbarRequest0).getNeedToggle()) {
                                                                View view0 = ((ShowSoftInputOverlay)toolbarRequest0).getOverlay();
                                                                OverlayCategory overlayCategory0 = ((ShowSoftInputOverlay)toolbarRequest0).getOverlayCategory();
                                                                KeditorToolbar.this.toggleSoftInputOverlay$keditor_release(view0, overlayCategory0);
                                                                return Unit.INSTANCE;
                                                            }
                                                            View view1 = ((ShowSoftInputOverlay)toolbarRequest0).getOverlay();
                                                            OverlayCategory overlayCategory1 = ((ShowSoftInputOverlay)toolbarRequest0).getOverlayCategory();
                                                            KeditorToolbar.this.requestShowSoftInputOverlay$keditor_release(view1, overlayCategory1);
                                                            return Unit.INSTANCE;
                                                        }
                                                        if(toolbarRequest0 instanceof HideSoftInputOverlay) {
                                                            KeditorToolbar.this.requestHideSoftInputOverlayIfShowing$keditor_release();
                                                            return Unit.INSTANCE;
                                                        }
                                                        if(toolbarRequest0 instanceof OnToolbarExtraClicked) {
                                                            Function1 function10 = KeditorToolbar.this.onExtraButtonClicked;
                                                            if(function10 != null) {
                                                                KeToolbarLayoutBinding keToolbarLayoutBinding0 = KeditorToolbar.this.getBinding$keditor_release();
                                                                Intrinsics.checkNotNullExpressionValue(keToolbarLayoutBinding0.keBtnExtra, "keBtnExtra");
                                                                function10.invoke(keToolbarLayoutBinding0.keBtnExtra);
                                                            }
                                                        }
                                                    }
                                                    else if(KeditorToolbar.this.keditorViewId != -1 && KeditorToolbar.this.getContext() instanceof Activity) {
                                                        Context context0 = KeditorToolbar.this.getContext();
                                                        Intrinsics.checkNotNull(context0, "null cannot be cast to non-null type android.app.Activity");
                                                        KeditorView keditorView0 = (KeditorView)((Activity)context0).findViewById(KeditorToolbar.this.keditorViewId);
                                                        if(keditorView0 != null) {
                                                            KeditorToolbar.this.attachTo(keditorView0);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                    return Unit.INSTANCE;
                                                }

                                                @Override  // kotlinx.coroutines.flow.FlowCollector
                                                public Object emit(Object object0, Continuation continuation0) {
                                                    return this.emit(((ToolbarRequest)object0), continuation0);
                                                }
                                            };
                                            this.label = 1;
                                            return keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$20.collect(keditorToolbar$registViewRequestController$1$1$1$10, this) == object1 ? object1 : Unit.INSTANCE;
                                        }
                                        case 1: {
                                            ResultKt.throwOnFailure(object0);
                                            return Unit.INSTANCE;
                                        }
                                        default: {
                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                        }
                                    }

                                    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "com/kakao/keditor/util/eventbus/KeEvent$subscribe$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
                                    @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
                                    public final class com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.1 implements Flow {
                                        public com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.1(Flow flow0) {
                                        }

                                        @Override  // kotlinx.coroutines.flow.Flow
                                        @Nullable
                                        public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                                            com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.1.2 keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$20 = new FlowCollector() {
                                                @Override  // kotlinx.coroutines.flow.FlowCollector
                                                @Nullable
                                                public final Object emit(Object object0, @NotNull Continuation continuation0) {
                                                    com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.1.2.1 keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10;
                                                    if(continuation0 instanceof com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.1.2.1) {
                                                        keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10 = (com.kakao.keditor.toolbar.KeditorToolbar.registViewRequestController.1.1.1.invokeSuspend..inlined.subscribe.1.2.1)continuation0;
                                                        int v = keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10.label;
                                                        if((v & 0x80000000) == 0) {
                                                            keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                                                Object L$0;
                                                                Object L$1;
                                                                int label;
                                                                Object result;

                                                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                                @Nullable
                                                                public final Object invokeSuspend(@NotNull Object object0) {
                                                                    this.result = object0;
                                                                    this.label |= 0x80000000;
                                                                    return continuation0.emit(null, this);
                                                                }
                                                            };
                                                        }
                                                        else {
                                                            keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10.label = v ^ 0x80000000;
                                                        }
                                                    }
                                                    else {
                                                        keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                                            Object L$0;
                                                            Object L$1;
                                                            int label;
                                                            Object result;

                                                            @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                                            @Nullable
                                                            public final Object invokeSuspend(@NotNull Object object0) {
                                                                this.result = object0;
                                                                this.label |= 0x80000000;
                                                                return continuation0.emit(null, this);
                                                            }
                                                        };
                                                    }
                                                    Object object1 = keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10.result;
                                                    Object object2 = a.getCOROUTINE_SUSPENDED();
                                                    switch(keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10.label) {
                                                        case 0: {
                                                            ResultKt.throwOnFailure(object1);
                                                            FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                                            if(object0 instanceof ToolbarRequest) {
                                                                keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10.label = 1;
                                                                if(flowCollector0.emit(object0, keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$2$10) == object2) {
                                                                    return object2;
                                                                }
                                                            }
                                                            return Unit.INSTANCE;
                                                        }
                                                        case 1: {
                                                            ResultKt.throwOnFailure(object1);
                                                            return Unit.INSTANCE;
                                                        }
                                                        default: {
                                                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                                                        }
                                                    }
                                                }
                                            };
                                            Object object0 = this.$this_unsafeTransform$inlined.collect(keditorToolbar$registViewRequestController$1$1$1$invokeSuspend$$inlined$subscribe$1$20, continuation0);
                                            return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
                                        }
                                    }

                                }
                            };
                            this.label = 1;
                            return RepeatOnLifecycleKt.repeatOnLifecycle(this.$owner, State.STARTED, keditorToolbar$registViewRequestController$1$1$10, this) == object1 ? object1 : Unit.INSTANCE;
                        }
                        case 1: {
                            ResultKt.throwOnFailure(object0);
                            return Unit.INSTANCE;
                        }
                        default: {
                            throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                        }
                    }
                }
            }, 3, null);
        }
    }

    public final void requestHideSoftInputOverlay$keditor_release(boolean z) {
        if(this.softInputOverlay != null && this.softInputOverlay.isShowing()) {
            this.announceForAccessibility(this.getResources().getString(string.cd_alert_list_closed));
        }
        boolean z1 = false;
        if(z) {
            Context context0 = this.getContext();
            Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
            z1 = SoftInputKt.showSoftInput$default(context0, false, 1, null);
        }
        if(!z1) {
            this.doOnPrepareSoftInputShown();
        }
    }

    public static void requestHideSoftInputOverlay$keditor_release$default(KeditorToolbar keditorToolbar0, boolean z, int v, Object object0) {
        if((v & 1) != 0) {
            z = true;
        }
        keditorToolbar0.requestHideSoftInputOverlay$keditor_release(z);
    }

    public final void requestHideSoftInputOverlayIfShowing$keditor_release() {
        if(this.softInputOverlay != null && this.softInputOverlay.isShowing()) {
            KeditorToolbar.requestHideSoftInputOverlay$keditor_release$default(this, false, 1, null);
        }
    }

    public final void requestShowSoftInputOverlay$keditor_release(@NotNull View view0, @NotNull OverlayCategory overlayCategory0) {
        Intrinsics.checkNotNullParameter(view0, "content");
        Intrinsics.checkNotNullParameter(overlayCategory0, "category");
        this.onChangeToolbarOverlayCategory(overlayCategory0);
        ToolbarOverlay toolbarOverlay0 = this.softInputOverlay;
        if(toolbarOverlay0 != null) {
            KeToolbarLayoutBinding keToolbarLayoutBinding0 = this.getBinding$keditor_release();
            Intrinsics.checkNotNullExpressionValue(keToolbarLayoutBinding0.overlay, "overlay");
            toolbarOverlay0.show(this, keToolbarLayoutBinding0.overlay, view0);
        }
        this.announceForAccessibility(this.getResources().getString(string.cd_alert_list_opened));
        Context context0 = this.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "getContext(...)");
        SoftInputKt.hideSoftInput(context0);
        this.doOnPrepareSoftInputHidden();
    }

    public final void setBinding$keditor_release(@NotNull KeToolbarLayoutBinding keToolbarLayoutBinding0) {
        Intrinsics.checkNotNullParameter(keToolbarLayoutBinding0, "<set-?>");
        this.binding = keToolbarLayoutBinding0;
    }

    public final void setKeditorView$keditor_release(@Nullable KeditorView keditorView0) {
        this.keditorView = keditorView0;
    }

    public final void setSort$keditor_release(@NotNull Alignment alignment0) {
        Intrinsics.checkNotNullParameter(alignment0, "<set-?>");
        this.sort = alignment0;
    }

    public final void toggleSoftInputOverlay$keditor_release(@NotNull View view0, @NotNull OverlayCategory overlayCategory0) {
        Intrinsics.checkNotNullParameter(view0, "content");
        Intrinsics.checkNotNullParameter(overlayCategory0, "category");
        if(Intrinsics.areEqual(this.getBinding$keditor_release().getActiveOverlayCategory(), overlayCategory0)) {
            this.requestHideSoftInputOverlayIfShowing$keditor_release();
            return;
        }
        this.requestShowSoftInputOverlay$keditor_release(view0, overlayCategory0);
    }
}

