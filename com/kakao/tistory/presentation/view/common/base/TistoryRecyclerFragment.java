package com.kakao.tistory.presentation.view.common.base;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.kakao.android.base.databinding.FragmentRecyclerViewBinding;
import com.kakao.android.base.exception.BaseExceptionView;
import com.kakao.android.base.exception.IBaseExceptionView;
import com.kakao.android.base.model.ErrorModel;
import com.kakao.android.base.network.NetworkCheckImpl;
import com.kakao.android.base.network.NetworkCheckInterface;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.ui.recyclerview.BaseRecyclerFragment;
import com.kakao.tiara.data.ActionKind;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\b\'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007\u00A2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0002H\u0096\u0001\u00A2\u0006\u0004\b\n\u0010\tJ@\u0010\u0012\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\u000E\b\u0002\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00070\u000F2\u000E\b\u0002\u0010\u0011\u001A\b\u0012\u0004\u0012\u00020\u00070\u000FH\u0096\u0001\u00A2\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0016\u001A\u00020\u00072\b\u0010\u0015\u001A\u0004\u0018\u00010\u0014H\u0016\u00A2\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001B\u001A\u00020\u0007\"\b\b\u0000\u0010\u0019*\u00020\u00182\u0006\u0010\u001A\u001A\u00028\u0000H\u0014\u00A2\u0006\u0004\b\u001B\u0010\u001CJ\u000F\u0010\u001D\u001A\u00020\u0007H&\u00A2\u0006\u0004\b\u001D\u0010\u0005J\u0017\u0010 \u001A\u00020\u00072\u0006\u0010\u001F\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\b \u0010!J\u000F\u0010\"\u001A\u00020\u0007H\u0016\u00A2\u0006\u0004\b\"\u0010\u0005R\u001C\u0010(\u001A\u00020#8\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001E\u0010.\u001A\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001C\u00101\u001A\u00020#8\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b/\u0010%\"\u0004\b0\u0010\'R\u001E\u00104\u001A\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000F\u00A2\u0006\f\u001A\u0004\b2\u0010%\"\u0004\b3\u0010\'R\u001A\u00107\u001A\b\u0012\u0004\u0012\u000206058\u0016X\u0096\u0005\u00A2\u0006\u0006\u001A\u0004\b7\u00108\u00A8\u00069"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryRecyclerFragment;", "Lcom/kakao/android/base/ui/recyclerview/BaseRecyclerFragment;", "Lcom/kakao/android/base/tiara/TiaraListener;", "Lcom/kakao/android/base/network/NetworkCheckInterface;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroid/content/Context;", "context", "Landroidx/lifecycle/LifecycleOwner;", "owner", "Lkotlin/Function0;", "onConnected", "onUnconnected", "initNetworkCheck", "(Landroid/content/Context;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Lcom/kakao/android/base/exception/IBaseExceptionView;", "T", "view", "initExceptionView", "(Lcom/kakao/android/base/exception/IBaseExceptionView;)V", "refresh", "Lcom/kakao/android/base/model/ErrorModel;", "errorModel", "showExceptionView", "(Lcom/kakao/android/base/model/ErrorModel;)V", "hideExceptionView", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Landroidx/lifecycle/LiveData;", "", "isNetworkConnected", "()Landroidx/lifecycle/LiveData;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TistoryRecyclerFragment extends BaseRecyclerFragment implements NetworkCheckInterface, TiaraListener {
    public static final int $stable = 8;
    public final TiaraDelegator a;
    public final NetworkCheckImpl b;
    public BaseExceptionView c;

    public TistoryRecyclerFragment() {
        this.a = new TiaraDelegator();
        this.b = new NetworkCheckImpl();
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

    // 去混淆评级： 低(20)
    @Override  // com.kakao.android.base.tiara.TiaraListener
    @NotNull
    public String getPage() {
        return "";
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    @Nullable
    public String getSection() {
        return this.a.getSection();
    }

    public void hideExceptionView() {
        BaseExceptionView baseExceptionView0 = this.c;
        if(baseExceptionView0 != null) {
            baseExceptionView0.hide();
        }
    }

    public void initExceptionView(@NotNull IBaseExceptionView iBaseExceptionView0) {
        Intrinsics.checkNotNullParameter(iBaseExceptionView0, "view");
        if(this.c == null) {
            BaseExceptionView baseExceptionView0 = new BaseExceptionView(iBaseExceptionView0, new t(this));
            View view0 = ((FragmentRecyclerViewBinding)this.getDataBinding()).getRoot();
            Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type android.view.ViewGroup");
            baseExceptionView0.init(((ViewGroup)view0));
            baseExceptionView0.hide();
            this.c = baseExceptionView0;
        }
    }

    @Override  // com.kakao.android.base.network.NetworkCheckInterface
    public void initNetworkCheck(@NotNull Context context0, @NotNull LifecycleOwner lifecycleOwner0, @NotNull Function0 function00, @NotNull Function0 function01) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(lifecycleOwner0, "owner");
        Intrinsics.checkNotNullParameter(function00, "onConnected");
        Intrinsics.checkNotNullParameter(function01, "onUnconnected");
        this.b.initNetworkCheck(context0, lifecycleOwner0, function00, function01);
    }

    @Override  // com.kakao.android.base.network.NetworkCheckInterface
    @NotNull
    public LiveData isNetworkConnected() {
        return this.b.isNetworkConnected();
    }

    @Override  // com.kakao.android.base.ui.LayoutLessBaseFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.updatePageInfo(this);
        this.trackPage(this);
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        this.initNetworkCheck(context0, this, new u(this), new v(this));
    }

    public abstract void refresh();

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

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setSection(@Nullable String s) {
        this.a.setSection(s);
    }

    public void showExceptionView(@NotNull ErrorModel errorModel0) {
        Intrinsics.checkNotNullParameter(errorModel0, "errorModel");
        BaseExceptionView baseExceptionView0 = this.c;
        if(baseExceptionView0 != null) {
            baseExceptionView0.show(errorModel0);
        }
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

