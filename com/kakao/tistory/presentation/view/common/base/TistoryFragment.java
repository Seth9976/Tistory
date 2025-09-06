package com.kakao.tistory.presentation.view.common.base;

import android.os.Bundle;
import androidx.compose.runtime.internal.StabilityInferred;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.ui.BaseFragment;
import com.kakao.tiara.data.ActionKind;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u00032\u00020\u0004B\u0005¢\u0006\u0002\u0010\u0005J\u0012\u0010\u0018\u001A\u00020\u00192\b\u0010\u001A\u001A\u0004\u0018\u00010\u001BH\u0016J\u0011\u0010\u001C\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u0004H\u0096\u0001J\u0011\u0010\u001E\u001A\u00020\u00192\u0006\u0010\u001D\u001A\u00020\u0004H\u0096\u0001R\u0018\u0010\u0006\u001A\u00020\u0007X\u0096\u000F¢\u0006\f\u001A\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000BR\u001A\u0010\f\u001A\u0004\u0018\u00010\rX\u0096\u000F¢\u0006\f\u001A\u0004\b\u000E\u0010\u000F\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001A\u00020\u0007X\u0096\u000F¢\u0006\f\u001A\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000BR\u001A\u0010\u0015\u001A\u0004\u0018\u00010\u0007X\u0096\u000F¢\u0006\f\u001A\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000B¨\u0006\u001F"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/base/TistoryFragment;", "VB", "Landroidx/databinding/ViewDataBinding;", "Lcom/kakao/android/base/ui/BaseFragment;", "Lcom/kakao/android/base/tiara/TiaraListener;", "()V", "action", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "actionKind", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "page", "getPage", "setPage", "section", "getSection", "setSection", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "trackPage", "tiaraListener", "updatePageInfo", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class TistoryFragment extends BaseFragment implements TiaraListener {
    public static final int $stable = 8;
    public final TiaraDelegator a;

    public TistoryFragment() {
        this.a = new TiaraDelegator();
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

    @Override  // com.kakao.android.base.ui.LayoutLessBaseFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.updatePageInfo(this);
        this.trackPage(this);
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

