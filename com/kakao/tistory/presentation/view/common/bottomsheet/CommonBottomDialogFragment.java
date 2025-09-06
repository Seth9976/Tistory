package com.kakao.tistory.presentation.view.common.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView.LayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.databinding.FragmentBaseBottomRecyclerDialogBinding;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.ui.bottomsheet.BaseBottomRecyclerDialogFragment;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tistory.presentation.view.common.recyclerview.SimpleDividerItemDecoration;
import hc.d;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0017\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\t\u0010\bJ\u000F\u0010\u000B\u001A\u00020\nH\u0014¢\u0006\u0004\b\u000B\u0010\fJ!\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u001B\u001A\b\u0012\u0004\u0012\u00020\u00140\u00138\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001AR.\u0010#\u001A\u000E\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00060\u001C8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 \"\u0004\b!\u0010\"R\u001C\u0010)\u001A\u00020$8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001E\u0010/\u001A\u0004\u0018\u00010*8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001C\u00102\u001A\u00020$8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b0\u0010&\"\u0004\b1\u0010(R\u001E\u00105\u001A\u0004\u0018\u00010$8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b3\u0010&\"\u0004\b4\u0010(¨\u00067"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogFragment;", "Lcom/kakao/android/base/ui/bottomsheet/BaseBottomRecyclerDialogFragment;", "Lcom/kakao/android/base/tiara/TiaraListener;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroidx/recyclerview/widget/LinearLayoutManager;", "createLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "Lcom/kakao/tistory/domain/entity/SortItem;", "c", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "items", "Lkotlin/Function1;", "d", "Lkotlin/jvm/functions/Function1;", "getOnSelectedItem", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedItem", "(Lkotlin/jvm/functions/Function1;)V", "onSelectedItem", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public class CommonBottomDialogFragment extends BaseBottomRecyclerDialogFragment implements TiaraListener {
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/common/bottomsheet/CommonBottomDialogFragment;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CommonBottomDialogFragment newInstance() {
            return new CommonBottomDialogFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TiaraDelegator a;
    public final Lazy b;
    public List c;
    public Function1 d;

    static {
        CommonBottomDialogFragment.Companion = new Companion(null);
        CommonBottomDialogFragment.$stable = 8;
    }

    public CommonBottomDialogFragment() {
        this.a = new TiaraDelegator();
        this.b = c.lazy(new e(this));
        this.c = new ArrayList();
        this.d = f.a;
    }

    public static final void a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public static final CommonBottomDialogAdapter access$getBottomCommonDialogAdapter(CommonBottomDialogFragment commonBottomDialogFragment0) {
        return (CommonBottomDialogAdapter)commonBottomDialogFragment0.b.getValue();
    }

    @NotNull
    public LinearLayoutManager createLayoutManager() {
        return new LinearLayoutManager(this.getContext());
    }

    @Override  // com.kakao.android.base.ui.bottomsheet.BaseBottomRecyclerDialogFragment
    public LayoutManager createLayoutManager() {
        return this.createLayoutManager();
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
    public final List getItems() {
        return this.c;
    }

    @NotNull
    public final Function1 getOnSelectedItem() {
        return this.d;
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

    @Override  // com.kakao.android.base.ui.bottomsheet.BaseBottomRecyclerDialogFragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        RecyclerView recyclerView0 = ((FragmentBaseBottomRecyclerDialogBinding)this.getDataBinding()).bottomDialogRecyclerView;
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
        SimpleDividerItemDecoration simpleDividerItemDecoration0 = new SimpleDividerItemDecoration(context0, 0, true, false, 10, null);
        simpleDividerItemDecoration0.setCheckNeedDivider(new g(this));
        recyclerView0.addItemDecoration(simpleDividerItemDecoration0);
        CommonBottomDialogAdapter commonBottomDialogAdapter0 = (CommonBottomDialogAdapter)this.b.getValue();
        commonBottomDialogAdapter0.setItems(this.c);
        Disposable disposable0 = commonBottomDialogAdapter0.onItemClick().subscribeOn(Schedulers.io()).subscribe(new d(new h(this), 5));
        Intrinsics.checkNotNullExpressionValue(disposable0, "subscribe(...)");
        this.addDisposable(disposable0);
        recyclerView0.setAdapter(commonBottomDialogAdapter0);
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

    public final void setItems(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "<set-?>");
        this.c = list0;
    }

    public final void setOnSelectedItem(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.d = function10;
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

