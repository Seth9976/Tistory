package com.kakao.tistory.presentation.view.common.base;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.activity.ComponentActivity;
import androidx.annotation.CallSuper;
import androidx.annotation.DrawableRes;
import androidx.annotation.LayoutRes;
import androidx.annotation.StringRes;
import androidx.appcompat.app.ActionBar;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.content.res.ResourcesCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.tiara.TiaraUtils;
import com.kakao.tistory.domain.entity.User;
import com.kakao.tistory.presentation.R.drawable;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.style;
import com.kakao.tistory.presentation.common.Logger;
import com.kakao.tistory.presentation.common.extension.AnimationExtensionKt;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.common.tiara.TiaraActionType;
import com.kakao.tistory.presentation.databinding.ActivityTistoryToolbarBinding;
import com.kakao.tistory.presentation.databinding.LayoutTistoryToolbarBinding;
import com.kakao.tistory.presentation.view.common.AppBarTitleVisibleViewBehavior;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType.BackBlack;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar.AppBarHomeAsUpButtonType;
import com.kakao.tistory.presentation.view.common.widget.TistoryToolbar;
import com.kakao.tistory.presentation.viewmodel.BlogSwitchViewModel;
import ic.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000B\b\'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0015\u00A2\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0004\u00A2\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000EH\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0011J\'\u0010\u0010\u001A\u00020\u00072\b\b\u0002\u0010\u000F\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0004\u00A2\u0006\u0004\b\u0010\u0010\u0014J5\u0010\u0018\u001A\u00020\u00072\n\b\u0003\u0010\u0016\u001A\u0004\u0018\u00010\u00152\n\b\u0003\u0010\u0017\u001A\u0004\u0018\u00010\u00152\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0004\u00A2\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001C\u001A\u00020\u000E2\b\u0010\u001B\u001A\u0004\u0018\u00010\u001AH\u0017\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u000F\u0010\u001E\u001A\u00020\u0007H\u0004\u00A2\u0006\u0004\b\u001E\u0010\u0004J\u0017\u0010 \u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b \u0010!J\u0019\u0010 \u001A\u00020\u00072\b\u0010#\u001A\u0004\u0018\u00010\"H\u0016\u00A2\u0006\u0004\b \u0010$J\u0015\u0010&\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u0015\u00A2\u0006\u0004\b&\u0010!J\u0017\u0010)\u001A\u00020\u00072\b\u0010(\u001A\u0004\u0018\u00010\'\u00A2\u0006\u0004\b)\u0010*J\u0017\u0010+\u001A\u00020\u00072\b\u0010(\u001A\u0004\u0018\u00010\'\u00A2\u0006\u0004\b+\u0010*J\u0017\u0010,\u001A\u00020\u00072\b\u0010(\u001A\u0004\u0018\u00010\'\u00A2\u0006\u0004\b,\u0010*J\u0017\u0010.\u001A\u00020\u00072\u0006\u0010-\u001A\u00020\u000EH\u0004\u00A2\u0006\u0004\b.\u0010\u0011J\u0017\u00100\u001A\u00020\u00072\u0006\u0010/\u001A\u00020\u0015H\u0004\u00A2\u0006\u0004\b0\u0010!J\u0017\u00102\u001A\u00020\u00072\u0006\u00101\u001A\u00020\u000EH\u0004\u00A2\u0006\u0004\b2\u0010\u0011J\u0017\u00103\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000EH\u0004\u00A2\u0006\u0004\b3\u0010\u0011J+\u00106\u001A\u00020\u00072\b\u00105\u001A\u0004\u0018\u0001042\u0010\b\u0002\u0010\u0013\u001A\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0012H\u0004\u00A2\u0006\u0004\b6\u00107J%\u00108\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000E2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00070\u0012H\u0004\u00A2\u0006\u0004\b8\u0010\u0014J\u0019\u0010:\u001A\u00020\u00072\b\b\u0002\u00109\u001A\u00020\u000EH\u0004\u00A2\u0006\u0004\b:\u0010\u0011J\u000F\u0010;\u001A\u00020\u0007H\u0004\u00A2\u0006\u0004\b;\u0010\u0004J\u001F\u0010=\u001A\u00020\u00072\u0006\u0010%\u001A\u00020\u000E2\b\b\u0002\u0010<\u001A\u00020\u000E\u00A2\u0006\u0004\b=\u0010>R\u001A\u0010C\u001A\u00020\u00158\u0014X\u0094\u0004\u00A2\u0006\f\n\u0004\b?\u0010@\u001A\u0004\bA\u0010BR!\u0010J\u001A\b\u0012\u0004\u0012\u00020E0D8DX\u0084\u0084\u0002\u00A2\u0006\f\n\u0004\bF\u0010G\u001A\u0004\bH\u0010IR\u0014\u0010L\u001A\u00020\u00158gX\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bK\u0010BR\u0014\u0010O\u001A\u00020\u000E8&X\u00A6\u0004\u00A2\u0006\u0006\u001A\u0004\bM\u0010N\u00A8\u0006P"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Lcom/kakao/tistory/presentation/databinding/ActivityTistoryToolbarBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;", "appBarHomeAsUpButtonType", "initAppBarHomeAsUp", "(Lcom/kakao/tistory/presentation/view/common/widget/TistoryToolbar$AppBarHomeAsUpButtonType;)V", "", "enabled", "updateAppBarHomeAsUpEnabled", "(Z)V", "Lkotlin/Function0;", "onClick", "(ZLkotlin/jvm/functions/Function0;)V", "", "iconNameStringId", "iconDrawableResId", "setMenuView", "(Ljava/lang/Integer;Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "Landroid/view/Menu;", "menu", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "disableAppBarBehavior", "titleId", "setTitle", "(I)V", "", "title", "(Ljava/lang/CharSequence;)V", "visibility", "updateAppbarTitleVisibility", "Landroid/view/View;", "targetView", "requestScrollToTop", "(Landroid/view/View;)V", "updateAppBarVisibleBehaviorFortNowTarget", "updateAppBarTitleVisibleBehavior", "isBlog", "updateAppBarTitleVisibleBehaviorForBlog", "topMarginDp", "updateContentTopMargin", "overlay", "setStatusBarOverlay", "updateAppBarLogoEnabled", "Lcom/kakao/tistory/domain/entity/User;", "user", "updateAppBarUserImage", "(Lcom/kakao/tistory/domain/entity/User;Lkotlin/jvm/functions/Function0;)V", "updateSearchButtonEnabled", "hideTitle", "showAppBar", "hideAppBar", "needRefresh", "updateToolbarVisibility", "(ZZ)V", "g", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Lcom/kakao/tistory/presentation/view/common/AppBarTitleVisibleViewBehavior;", "Landroid/widget/TextView;", "i", "Lkotlin/Lazy;", "getAppBarTitleVisibleViewBehavior", "()Lcom/kakao/tistory/presentation/view/common/AppBarTitleVisibleViewBehavior;", "appBarTitleVisibleViewBehavior", "getContentLayoutResourceId", "contentLayoutResourceId", "getProfileEnabled", "()Z", "profileEnabled", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryToolbarActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryToolbarActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity\n+ 2 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,353:1\n75#2,13:354\n1#3:367\n*S KotlinDebug\n*F\n+ 1 TistoryToolbarActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryToolbarActivity\n*L\n58#1:354,13\n*E\n"})
public abstract class TistoryToolbarActivity extends TistoryActivity {
    public static final int $stable = 8;
    public final int g;
    public View h;
    public final Lazy i;
    public final Lazy j;
    public final int k;
    public final int l;
    public int m;
    public final ViewModelLazy n;

    public TistoryToolbarActivity() {
        this.g = layout.activity_tistory_toolbar;
        this.i = c.lazy(new w(this));
        this.j = c.lazy(new h0(this));
        this.k = 1;
        this.l = 2;
        this.m = 0;
        com.kakao.tistory.presentation.view.common.base.TistoryToolbarActivity.special..inlined.viewModels.default.1 tistoryToolbarActivity$special$$inlined$viewModels$default$10 = new Function0() {
            public final ComponentActivity a;

            {
                this.a = componentActivity0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                return this.a.getDefaultViewModelProviderFactory();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        };
        this.n = new ViewModelLazy(Reflection.getOrCreateKotlinClass(BlogSwitchViewModel.class), new Function0() {
            public final ComponentActivity a;

            {
                this.a = componentActivity0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                return this.a.getViewModelStore();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, tistoryToolbarActivity$special$$inlined$viewModels$default$10, new Function0(this) {
            public final Function0 a;
            public final ComponentActivity b;

            {
                this.a = function00;
                this.b = componentActivity0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                Function0 function00 = this.a;
                if(function00 != null) {
                    CreationExtras creationExtras0 = (CreationExtras)function00.invoke();
                    return creationExtras0 == null ? this.b.getDefaultViewModelCreationExtras() : creationExtras0;
                }
                return this.b.getDefaultViewModelCreationExtras();
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
    }

    public static View a(ViewGroup viewGroup0) {
        if(viewGroup0 != null && !(viewGroup0 instanceof RecyclerView) && !(viewGroup0 instanceof WebView)) {
            int v = viewGroup0.getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view0 = viewGroup0.getChildAt(v1);
                if((view0 instanceof RecyclerView ? true : view0 instanceof WebView)) {
                    return view0;
                }
                if(view0 instanceof ViewGroup) {
                    return TistoryToolbarActivity.a(((ViewGroup)view0));
                }
            }
            return null;
        }
        return viewGroup0;
    }

    public static final void a(TistoryToolbarActivity tistoryToolbarActivity0, View view0) {
        Intrinsics.checkNotNullParameter(tistoryToolbarActivity0, "this$0");
        String s = tistoryToolbarActivity0.getSection();
        String s1 = tistoryToolbarActivity0.getPage();
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, s, s1, TiaraActionType.CLICK_APP_BAR_TITLE, null, null, null, null, null, 0xF8, null);
        View view1 = tistoryToolbarActivity0.getAppBarTitleVisibleViewBehavior().getBehaviorTargetView();
        if(view1 == null) {
            view1 = tistoryToolbarActivity0.h;
            if(view1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("commonContentView");
                view1 = null;
            }
        }
        tistoryToolbarActivity0.requestScrollToTop(view1);
    }

    public static final int access$getANIM_STATE_NONE$p(TistoryToolbarActivity tistoryToolbarActivity0) {
        tistoryToolbarActivity0.getClass();
        return 0;
    }

    public static final BlogSwitchViewModel access$getBlogSwitchViewModel(TistoryToolbarActivity tistoryToolbarActivity0) {
        return (BlogSwitchViewModel)tistoryToolbarActivity0.n.getValue();
    }

    public static final ActivityTistoryToolbarBinding access$getDataBinding(TistoryToolbarActivity tistoryToolbarActivity0) {
        return (ActivityTistoryToolbarBinding)tistoryToolbarActivity0.getDataBinding();
    }

    public static final void b(TistoryToolbarActivity tistoryToolbarActivity0, View view0) {
        Intrinsics.checkNotNullParameter(tistoryToolbarActivity0, "this$0");
        String s = tistoryToolbarActivity0.getSection();
        String s1 = tistoryToolbarActivity0.getPage();
        TiaraUtils.trackClick$default(TiaraUtils.INSTANCE, s, s1, TiaraActionType.CLICK_APP_BAR_TISTORY_LOGO, null, null, null, null, null, 0xF8, null);
        View view1 = tistoryToolbarActivity0.getAppBarTitleVisibleViewBehavior().getBehaviorTargetView();
        if(view1 == null) {
            view1 = tistoryToolbarActivity0.h;
            if(view1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("commonContentView");
                view1 = null;
            }
        }
        tistoryToolbarActivity0.requestScrollToTop(view1);
    }

    public final void b() {
        TistoryToolbar tistoryToolbar0 = (TistoryToolbar)this.j.getValue();
        tistoryToolbar0.init(this, this.getProfileEnabled(), ((BlogSwitchViewModel)this.n.getValue()));
        this.setSupportActionBar(tistoryToolbar0);
        ActionBar actionBar0 = this.getSupportActionBar();
        if(actionBar0 != null) {
            actionBar0.setDisplayHomeAsUpEnabled(false);
        }
        ActionBar actionBar1 = this.getSupportActionBar();
        if(actionBar1 != null) {
            actionBar1.setDisplayShowTitleEnabled(false);
        }
        this.initAppBarHomeAsUp(BackBlack.INSTANCE);
        TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = textView0.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((LayoutParams)viewGroup$LayoutParams0).setBehavior(this.getAppBarTitleVisibleViewBehavior());
        textView0.setOnClickListener(new a(this, 0));
        LayoutTistoryToolbarBinding layoutTistoryToolbarBinding0 = ((TistoryToolbar)this.j.getValue()).getDataBinding();
        a a0 = new a(this, 1);
        layoutTistoryToolbarBinding0.commonAppBarLogoImage.setOnClickListener(a0);
        ((ActivityTistoryToolbarBinding)this.getDataBinding()).blogSwitchDialog.setContent(ComposableLambdaKt.composableLambdaInstance(101907653, true, new a0(this)));
    }

    public final void disableAppBarBehavior() {
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((LayoutParams)viewGroup$LayoutParams0).setBehavior(null);
    }

    @NotNull
    public final AppBarTitleVisibleViewBehavior getAppBarTitleVisibleViewBehavior() {
        return (AppBarTitleVisibleViewBehavior)this.i.getValue();
    }

    @LayoutRes
    public abstract int getContentLayoutResourceId();

    @Override  // com.kakao.android.base.ui.BaseActivity
    public int getLayoutResourceId() {
        return this.g;
    }

    public abstract boolean getProfileEnabled();

    public final void hideAppBar() {
        ActionBar actionBar0 = this.getSupportActionBar();
        if(actionBar0 != null) {
            actionBar0.hide();
        }
        TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
        Intrinsics.checkNotNullExpressionValue(textView0, "commonAppBarTitle");
        if(textView0.getVisibility() == 0) {
            if(this.m != this.k) {
                goto label_9;
            }
        }
        else if(this.m == this.l) {
        label_9:
            TextView textView1 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
            Intrinsics.checkNotNullExpressionValue(textView1, "commonAppBarTitle");
            AnimationExtensionKt.animHide(textView1, new x(this), new y(this), 4);
        }
    }

    public final void initAppBarHomeAsUp(@NotNull AppBarHomeAsUpButtonType tistoryToolbar$AppBarHomeAsUpButtonType0) {
        Intrinsics.checkNotNullParameter(tistoryToolbar$AppBarHomeAsUpButtonType0, "appBarHomeAsUpButtonType");
        ((TistoryToolbar)this.j.getValue()).initAppBarHomeAsUp(tistoryToolbar$AppBarHomeAsUpButtonType0);
        this.updateAppBarHomeAsUpEnabled(true);
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryActivity
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.b();
        ViewStub viewStub0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonContentViewStub.getViewStub();
        if(viewStub0 != null) {
            viewStub0.setLayoutResource(this.getContentLayoutResourceId());
            View view0 = viewStub0.inflate();
            Intrinsics.checkNotNullExpressionValue(view0, "inflate(...)");
            this.h = view0;
        }
        int v = this.getPackageManager().getActivityInfo(this.getComponentName(), 0).getThemeResource();
        if(v != style.AppTheme_FullScreen && v != style.AppTheme_FullScreen_NoStatusBar) {
            Logger.INSTANCE.log("AppTheme : Else");
            ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonContainer.setFitsSystemWindows(true);
        }
        else {
            Logger.INSTANCE.log("AppTheme : FullScreen");
        }
        this.updateContentTopMargin(((TistoryToolbar)this.j.getValue()).getToolbarHeight());
        BlogSwitchViewModel blogSwitchViewModel0 = (BlogSwitchViewModel)this.n.getValue();
        LiveDataExtensionKt.observeEvent(blogSwitchViewModel0.getGoToSettingListActivity(), this, new b0(this));
        LiveDataExtensionKt.observeEvent(blogSwitchViewModel0.getGoToMain(), this, new c0(this));
    }

    @Override  // android.app.Activity
    @CallSuper
    public boolean onCreateOptionsMenu(@Nullable Menu menu0) {
        return super.onCreateOptionsMenu(menu0);
    }

    public final void requestScrollToTop(@Nullable View view0) {
        View view1 = TistoryToolbarActivity.a((view0 instanceof ViewGroup ? ((ViewGroup)view0) : null));
        if(view1 instanceof RecyclerView) {
            ((RecyclerView)view1).smoothScrollToPosition(0);
            AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior0 = this.getAppBarTitleVisibleViewBehavior();
            TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
            Intrinsics.checkNotNullExpressionValue(textView0, "commonAppBarTitle");
            appBarTitleVisibleViewBehavior0.hide(textView0);
            return;
        }
        if(view1 instanceof WebView) {
            ((WebView)view1).scrollTo(0, 0);
            AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior1 = this.getAppBarTitleVisibleViewBehavior();
            TextView textView1 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
            Intrinsics.checkNotNullExpressionValue(textView1, "commonAppBarTitle");
            appBarTitleVisibleViewBehavior1.hide(textView1);
        }
    }

    public final void setMenuView(@StringRes @Nullable Integer integer0, @DrawableRes @Nullable Integer integer1, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        ((TistoryToolbar)this.j.getValue()).setMenuView(integer0, integer1, function00);
    }

    public static void setMenuView$default(TistoryToolbarActivity tistoryToolbarActivity0, Integer integer0, Integer integer1, Function0 function00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setMenuView");
        }
        if((v & 1) != 0) {
            integer0 = null;
        }
        if((v & 2) != 0) {
            integer1 = null;
        }
        tistoryToolbarActivity0.setMenuView(integer0, integer1, function00);
    }

    public final void setStatusBarOverlay(boolean z) {
        if(z) {
            this.updateContentTopMargin(0);
            return;
        }
        this.updateContentTopMargin(((TistoryToolbar)this.j.getValue()).getToolbarHeight());
    }

    @Override  // android.app.Activity
    public void setTitle(int v) {
        TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
        textView0.setText(v);
        textView0.setVisibility(4);
    }

    @Override  // android.app.Activity
    public void setTitle(@Nullable CharSequence charSequence0) {
        TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
        textView0.setText(charSequence0);
        textView0.setVisibility(4);
    }

    public final void showAppBar(boolean z) {
        if(z) {
            ActionBar actionBar0 = this.getSupportActionBar();
            if(actionBar0 != null) {
                actionBar0.setBackgroundDrawable(ResourcesCompat.getDrawable(this.getResources(), drawable.bg_fff, null));
            }
            ActionBar actionBar1 = this.getSupportActionBar();
            if(actionBar1 != null) {
                actionBar1.show();
            }
            TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
            Intrinsics.checkNotNullExpressionValue(textView0, "commonAppBarTitle");
            if(textView0.getVisibility() == 0) {
                if(this.m != this.k) {
                    goto label_13;
                }
                return;
            }
            if(this.m == this.l) {
            label_13:
                TextView textView1 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
                Intrinsics.checkNotNullExpressionValue(textView1, "commonAppBarTitle");
                AnimationExtensionKt.animHide(textView1, new d0(this), new e0(this), 4);
            }
        }
        else {
            ActionBar actionBar2 = this.getSupportActionBar();
            if(actionBar2 != null) {
                actionBar2.setBackgroundDrawable(ResourcesCompat.getDrawable(this.getResources(), drawable.bg_fff_border_bottom_gray4_05dp, null));
            }
            ActionBar actionBar3 = this.getSupportActionBar();
            if(actionBar3 != null) {
                actionBar3.show();
            }
            TextView textView2 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
            Intrinsics.checkNotNullExpressionValue(textView2, "commonAppBarTitle");
            if(textView2.getVisibility() != 0) {
                if(this.m != this.l) {
                    goto label_29;
                }
            }
            else if(this.m == this.k) {
            label_29:
                TextView textView3 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
                Intrinsics.checkNotNullExpressionValue(textView3, "commonAppBarTitle");
                AnimationExtensionKt.animShow(textView3, new f0(this), new g0(this));
            }
        }
    }

    public static void showAppBar$default(TistoryToolbarActivity tistoryToolbarActivity0, boolean z, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showAppBar");
        }
        if((v & 1) != 0) {
            z = false;
        }
        tistoryToolbarActivity0.showAppBar(z);
    }

    public final void updateAppBarHomeAsUpEnabled(boolean z) {
        ((TistoryToolbar)this.j.getValue()).updateAppBarHomeAsUpEnabled(z, new i0(this));
    }

    public final void updateAppBarHomeAsUpEnabled(boolean z, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        ((TistoryToolbar)this.j.getValue()).updateAppBarHomeAsUpEnabled(z, function00);
    }

    public static void updateAppBarHomeAsUpEnabled$default(TistoryToolbarActivity tistoryToolbarActivity0, boolean z, Function0 function00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAppBarHomeAsUpEnabled");
        }
        if((v & 1) != 0) {
            z = true;
        }
        tistoryToolbarActivity0.updateAppBarHomeAsUpEnabled(z, function00);
    }

    public final void updateAppBarLogoEnabled(boolean z) {
        this.getAppBarTitleVisibleViewBehavior().setAppBarLogoEnabled(z);
    }

    public final void updateAppBarTitleVisibleBehavior(@Nullable View view0) {
        View view1 = TistoryToolbarActivity.a((view0 instanceof ViewGroup ? ((ViewGroup)view0) : null));
        if(view1 != null && view1 instanceof RecyclerView) {
            AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior0 = this.getAppBarTitleVisibleViewBehavior();
            TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
            Intrinsics.checkNotNullExpressionValue(textView0, "commonAppBarTitle");
            AppBarTitleVisibleViewBehavior.showOrHide$default(appBarTitleVisibleViewBehavior0, ((RecyclerView)view1), textView0, 0, true, null, 20, null);
        }
    }

    public final void updateAppBarTitleVisibleBehaviorForBlog(boolean z) {
        this.getAppBarTitleVisibleViewBehavior().setBlog(z);
    }

    public final void updateAppBarUserImage(@Nullable User user0, @Nullable Function0 function00) {
        ((TistoryToolbar)this.j.getValue()).updateAppBarUserImage(user0, function00);
    }

    public static void updateAppBarUserImage$default(TistoryToolbarActivity tistoryToolbarActivity0, User user0, Function0 function00, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateAppBarUserImage");
        }
        if((v & 2) != 0) {
            function00 = null;
        }
        tistoryToolbarActivity0.updateAppBarUserImage(user0, function00);
    }

    public final void updateAppBarVisibleBehaviorFortNowTarget(@Nullable View view0) {
        if(view0 != null) {
            this.getAppBarTitleVisibleViewBehavior().updateNowTarget(view0);
        }
    }

    public final void updateAppbarTitleVisibility(int v) {
        ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle.setVisibility(v);
    }

    public final void updateContentTopMargin(int v) {
        View view0 = this.h;
        View view1 = null;
        if(view0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commonContentView");
            view0 = null;
        }
        View view2 = this.h;
        if(view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("commonContentView");
        }
        else {
            view1 = view2;
        }
        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view1.getLayoutParams();
        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.coordinatorlayout.widget.CoordinatorLayout.LayoutParams");
        ((LayoutParams)viewGroup$LayoutParams0).topMargin = v;
        view0.setLayoutParams(((LayoutParams)viewGroup$LayoutParams0));
    }

    public final void updateSearchButtonEnabled(boolean z, @NotNull Function0 function00) {
        Intrinsics.checkNotNullParameter(function00, "onClick");
        ((TistoryToolbar)this.j.getValue()).updateSearchButtonEnabled(z, function00);
    }

    public final void updateToolbarVisibility(boolean z, boolean z1) {
        if(z1) {
            AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior0 = this.getAppBarTitleVisibleViewBehavior();
            CoordinatorLayout coordinatorLayout0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonContainer;
            Intrinsics.checkNotNullExpressionValue(coordinatorLayout0, "commonContainer");
            appBarTitleVisibleViewBehavior0.setupView(coordinatorLayout0);
        }
        AppBarTitleVisibleViewBehavior appBarTitleVisibleViewBehavior1 = this.getAppBarTitleVisibleViewBehavior();
        TextView textView0 = ((ActivityTistoryToolbarBinding)this.getDataBinding()).commonAppBarTitle;
        Intrinsics.checkNotNull(textView0);
        AppBarTitleVisibleViewBehavior.showOrHide$default(appBarTitleVisibleViewBehavior1, null, textView0, 0, z1, Boolean.valueOf(z), 5, null);
    }

    public static void updateToolbarVisibility$default(TistoryToolbarActivity tistoryToolbarActivity0, boolean z, boolean z1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateToolbarVisibility");
        }
        if((v & 2) != 0) {
            z1 = false;
        }
        tistoryToolbarActivity0.updateToolbarVisibility(z, z1);
    }
}

