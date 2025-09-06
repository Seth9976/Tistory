package com.kakao.tistory.presentation.view.common.base;

import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.activity.EdgeToEdge;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.h;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat.Builder;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.ViewModelLazy;
import androidx.webkit.internal.k;
import com.kakao.android.base.extension.LiveDataKt;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.ui.BaseDataBindingActivity;
import com.kakao.android.base.ui.dialog.BaseLoadingDialog;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tistory.presentation.R.anim;
import com.kakao.tistory.presentation.common.ActivityCommand.ShowDialogCommand;
import com.kakao.tistory.presentation.common.ActivityCommand.ShowToastCommand;
import com.kakao.tistory.presentation.common.ActivityCommand;
import com.kakao.tistory.presentation.common.utils.ToastUtils;
import com.kakao.tistory.presentation.view.common.dialog.TistoryDialog;
import com.kakao.tistory.presentation.viewmodel.SavedStateViewModel;
import com.kakao.tistory.presentation.viewmodel.ThrowableViewModel;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\'\u0018\u0000 2*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004:\u00012B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000B\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0004H\u0096\u0001¢\u0006\u0004\b\u000B\u0010\nJ\u0019\u0010\u000E\u001A\u00020\b2\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0014¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0006J\u000F\u0010\u0011\u001A\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0006R\u001B\u0010\u0017\u001A\u00020\u00128DX\u0084\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R\"\u0010\u001F\u001A\u00020\u00188\u0014@\u0014X\u0094\u000E¢\u0006\u0012\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001C\"\u0004\b\u001D\u0010\u001ER\u001C\u0010%\u001A\u00020 8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001E\u0010+\u001A\u0004\u0018\u00010&8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001C\u0010.\u001A\u00020 8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b,\u0010\"\"\u0004\b-\u0010$R\u001E\u00101\u001A\u0004\u0018\u00010 8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b/\u0010\"\"\u0004\b0\u0010$¨\u00063"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity;", "Landroidx/databinding/ViewDataBinding;", "VB", "Lcom/kakao/android/base/ui/BaseDataBindingActivity;", "Lcom/kakao/android/base/tiara/TiaraListener;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "finish", "Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "b", "Lkotlin/Lazy;", "getLoadingDialog", "()Lcom/kakao/android/base/ui/dialog/BaseLoadingDialog;", "loadingDialog", "", "f", "I", "getRequestedInsets", "()I", "setRequestedInsets", "(I)V", "requestedInsets", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nTistoryActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TistoryActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryActivity\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ActivityViewModelLazy.kt\nandroidx/activity/ActivityViewModelLazyKt\n*L\n1#1,143:1\n10#2,2:144\n10#2,2:160\n1#3:146\n1#3:162\n75#4,13:147\n75#4,13:163\n*S KotlinDebug\n*F\n+ 1 TistoryActivity.kt\ncom/kakao/tistory/presentation/view/common/base/TistoryActivity\n*L\n40#1:144,2\n42#1:160,2\n40#1:146\n42#1:162\n40#1:147,13\n42#1:163,13\n*E\n"})
public abstract class TistoryActivity extends BaseDataBindingActivity implements TiaraListener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryActivity$Companion;", "", "", "EXTRA_ACTIVITY_COMMAND", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    public static final int $stable = 0;
    @NotNull
    public static final Companion Companion = null;
    @NotNull
    public static final String EXTRA_ACTIVITY_COMMAND = "EXTRA_ACTIVITY_COMMAND";
    public final TiaraDelegator a;
    public final Lazy b;
    public final BaseViewModelLazy c;
    public final BaseViewModelLazy d;
    public boolean e;
    public int f;

    static {
        TistoryActivity.Companion = new Companion(null);
        TistoryActivity.$stable = 8;
    }

    public TistoryActivity() {
        this.a = new TiaraDelegator();
        this.b = c.lazy(new com.kakao.tistory.presentation.view.common.base.c(this));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.c = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(SavedStateViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$10, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.1(this);
        this.d = new BaseViewModelLazy(this, new ViewModelLazy(Reflection.getOrCreateKotlinClass(ThrowableViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.2(this), tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$11, new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.3(null, this)));
        this.f = 15;
    }

    public static final WindowInsetsCompat a(TistoryActivity tistoryActivity0, View view0, WindowInsetsCompat windowInsetsCompat0) {
        Intrinsics.checkNotNullParameter(tistoryActivity0, "this$0");
        Intrinsics.checkNotNullParameter(view0, "v");
        Intrinsics.checkNotNullParameter(windowInsetsCompat0, "insets");
        Insets insets0 = windowInsetsCompat0.getInsets(tistoryActivity0.getRequestedInsets());
        Intrinsics.checkNotNullExpressionValue(insets0, "getInsets(...)");
        Insets insets1 = windowInsetsCompat0.getInsets(0x8F & ~tistoryActivity0.getRequestedInsets());
        Intrinsics.checkNotNullExpressionValue(insets1, "getInsets(...)");
        view0.setPadding(insets0.left + insets1.left, insets0.top, insets0.right + insets1.right, insets0.bottom);
        return new Builder(windowInsetsCompat0).setInsets(tistoryActivity0.getRequestedInsets(), Insets.NONE).build();
    }

    public final void a() {
        ViewCompat.setOnApplyWindowInsetsListener(this.getDataBinding().getRoot(), new h(this, 17));
    }

    @Override  // com.kakao.android.base.ui.BaseActivity
    public void finish() {
        super.finish();
        if(this.e) {
            this.overridePendingTransition(anim.nothing, anim.slide_out_left);
            return;
        }
        this.overridePendingTransition(anim.nothing, anim.slide_out_up_short);
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getAction() {
        return "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public ActionKind getActionKind() {
        return this.a.getActionKind();
    }

    @NotNull
    public final BaseLoadingDialog getLoadingDialog() {
        return (BaseLoadingDialog)this.b.getValue();
    }

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getPage() {
        return "";
    }

    public int getRequestedInsets() {
        return this.f;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public String getSection() {
        return this.a.getSection();
    }

    @Override  // com.kakao.android.base.ui.BaseDataBindingActivity
    public void onCreate(@Nullable Bundle bundle0) {
        EdgeToEdge.enable$default(this, null, null, 3, null);
        super.onCreate(bundle0);
        this.a();
        Window window0 = this.getWindow();
        boolean z = false;
        if(Build.VERSION.SDK_INT >= 29) {
            k.u(window0);
        }
        else {
            window0.setNavigationBarColor(0);
        }
        Intent intent0 = this.getIntent();
        if(intent0 != null) {
            Bundle bundle1 = intent0.getExtras();
            if(bundle1 != null) {
                z = bundle1.getBoolean("isRightEnterAnim");
            }
        }
        this.e = z;
        if(z) {
            this.overridePendingTransition(anim.slide_in_left, anim.nothing);
        }
        else {
            this.overridePendingTransition(anim.slide_in_up_short, anim.nothing);
        }
        if(bundle0 == null) {
            Bundle bundle2 = this.getIntent().getExtras();
            if(bundle2 != null) {
                ActivityCommand activityCommand0 = (ActivityCommand)bundle2.getParcelable("EXTRA_ACTIVITY_COMMAND");
                if(activityCommand0 != null) {
                    if(activityCommand0 instanceof ShowDialogCommand) {
                        String s = ((ShowDialogCommand)activityCommand0).getTitle();
                        if(s != null) {
                            TistoryDialog.showOk$default(TistoryDialog.INSTANCE, this, s, ((ShowDialogCommand)activityCommand0).getMessage(), false, null, d.a, null, 88, null);
                        }
                    }
                    else {
                        if(!(activityCommand0 instanceof ShowToastCommand)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String s1 = ((ShowToastCommand)activityCommand0).getMessage();
                        if(s1 != null) {
                            ToastUtils.show$default(ToastUtils.INSTANCE, this, s1, 0, 1, 4, null);
                        }
                    }
                }
            }
        }
        ((SavedStateViewModel)this.c.getValue()).init();
        LiveDataKt.observeEvent(((ThrowableViewModel)this.d.getValue()).getShowSessionErrorDialog(), this, new b(this));
        this.updatePageInfo(this);
        this.trackPage(this);
    }

    @Override  // androidx.appcompat.app.AppCompatActivity
    public void onDestroy() {
        this.getLoadingDialog().dismiss();
        super.onDestroy();
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.a.setAction(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setActionKind(@Nullable ActionKind actionKind0) {
        this.a.setActionKind(actionKind0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.a.setPage(s);
    }

    public void setRequestedInsets(int v) {
        this.f = v;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setSection(@Nullable String s) {
        this.a.setSection(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.a.trackPage(tiaraListener0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.a.updatePageInfo(tiaraListener0);
    }
}

