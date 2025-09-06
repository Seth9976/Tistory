package com.kakao.tistory.presentation.view.bottomsheet;

import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.kakao.android.base.tiara.TiaraDelegator;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.tiara.data.ActionKind;
import com.kakao.tistory.presentation.R.dimen;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.R.string;
import com.kakao.tistory.presentation.databinding.FragmentBottomSheetBlogCategoryBinding;
import com.kakao.tistory.presentation.viewmodel.DaumCategoryViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import hc.d;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000F\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R*\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00118\u0014@VX\u0094\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R0\u0010\"\u001A\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u001B\u0012\u0004\u0012\u00020\u00070\u001A8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001C\u0010(\u001A\u00020#8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001E\u0010.\u001A\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001C\u00101\u001A\u00020#8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b/\u0010%\"\u0004\b0\u0010\'R\u001E\u00104\u001A\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b2\u0010%\"\u0004\b3\u0010\'¨\u00066"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogFragment;", "Lcom/kakao/android/base/ui/bottomsheet/BaseBottomSheetDialogFragment;", "Lcom/kakao/tistory/presentation/databinding/FragmentBottomSheetBlogCategoryBinding;", "Lcom/kakao/android/base/tiara/TiaraListener;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "<set-?>", "g", "I", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "layoutResourceId", "Lkotlin/Function1;", "Lcom/kakao/tistory/domain/entity/entry/DaumLikeItem;", "i", "Lkotlin/jvm/functions/Function1;", "getOnSelectedItem", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedItem", "(Lkotlin/jvm/functions/Function1;)V", "onSelectedItem", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDaumCategoryDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DaumCategoryDialogFragment.kt\ncom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,106:1\n14#2,4:107\n1#3:111\n106#4,15:112\n*S KotlinDebug\n*F\n+ 1 DaumCategoryDialogFragment.kt\ncom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogFragment\n*L\n46#1:107,4\n46#1:111\n46#1:112,15\n*E\n"})
public final class DaumCategoryDialogFragment extends Hilt_DaumCategoryDialogFragment implements TiaraListener {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogFragment$Companion;", "", "", "categoryId", "Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogFragment;", "newInstance", "(I)Lcom/kakao/tistory/presentation/view/bottomsheet/DaumCategoryDialogFragment;", "", "BUNDLE_BLOG_CATEGORY_SELECTED_ID", "Ljava/lang/String;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final DaumCategoryDialogFragment newInstance(int v) {
            DaumCategoryDialogFragment daumCategoryDialogFragment0 = new DaumCategoryDialogFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putInt("BUNDLE_BLOG_CATEGORY_SELECTED_ID", v);
            daumCategoryDialogFragment0.setArguments(bundle0);
            return daumCategoryDialogFragment0;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TiaraDelegator f;
    public int g;
    public int h;
    public Function1 i;
    public final BaseViewModelLazy j;
    public DaumCategoryDialogAdapter k;

    static {
        DaumCategoryDialogFragment.Companion = new Companion(null);
        DaumCategoryDialogFragment.$stable = 8;
    }

    public DaumCategoryDialogFragment() {
        this.f = new TiaraDelegator();
        this.g = layout.fragment_bottom_sheet_blog_category;
        this.h = -3;
        this.i = s.a;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.j = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DaumCategoryViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
    }

    public static final void a(DaumCategoryDialogFragment daumCategoryDialogFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(daumCategoryDialogFragment0, "this$0");
        if(daumCategoryDialogFragment0.getContext() != null) {
            RelativeLayout relativeLayout0 = ((FragmentBottomSheetBlogCategoryBinding)daumCategoryDialogFragment0.getDataBinding()).blogCategoryLoadingView;
            Intrinsics.checkNotNull(boolean0);
            relativeLayout0.setVisibility((boolean0.booleanValue() ? 0 : 8));
        }
    }

    public static final void a(DaumCategoryDialogFragment daumCategoryDialogFragment0, List list0) {
        Intrinsics.checkNotNullParameter(daumCategoryDialogFragment0, "this$0");
        if(list0 != null) {
            DaumCategoryDialogAdapter daumCategoryDialogAdapter0 = daumCategoryDialogFragment0.k;
            if(daumCategoryDialogAdapter0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("daumCategoryDialogAdapter");
                daumCategoryDialogAdapter0 = null;
            }
            daumCategoryDialogAdapter0.setItems(list0);
        }
    }

    public static final void a(Function1 function10, Object object0) {
        Intrinsics.checkNotNullParameter(function10, "$tmp0");
        function10.invoke(object0);
    }

    public final void a() {
        this.k = new DaumCategoryDialogAdapter();
        RecyclerView recyclerView0 = ((FragmentBottomSheetBlogCategoryBinding)this.getDataBinding()).blogCategoryDialogRecyclerView;
        recyclerView0.setLayoutManager(new LinearLayoutManager(recyclerView0.getContext()));
        recyclerView0.setItemAnimator(new DefaultItemAnimator());
        DaumCategoryDialogAdapter daumCategoryDialogAdapter0 = this.k;
        if(daumCategoryDialogAdapter0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("daumCategoryDialogAdapter");
            daumCategoryDialogAdapter0 = null;
        }
        daumCategoryDialogAdapter0.setSelectedCategoryId(this.h);
        Disposable disposable0 = daumCategoryDialogAdapter0.onItemClick().subscribeOn(Schedulers.io()).subscribe(new d(new r(this), 0));
        Intrinsics.checkNotNullExpressionValue(disposable0, "subscribe(...)");
        this.addDisposable(disposable0);
        recyclerView0.setAdapter(daumCategoryDialogAdapter0);
    }

    public final void b() {
        DaumCategoryViewModel daumCategoryViewModel0 = (DaumCategoryViewModel)this.j.getValue();
        daumCategoryViewModel0.isShowProgress().observe(this.getViewLifecycleOwner(), new hc.c(this, 0));
        daumCategoryViewModel0.getCategories().observe(this.getViewLifecycleOwner(), new hc.c(this, 1));
        ((DaumCategoryViewModel)this.j.getValue()).getCategories();
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
        return this.f.getActionKind();
    }

    @Override  // com.kakao.android.base.ui.bottomsheet.BaseBottomSheetDialogFragment
    public int getLayoutResourceId() {
        return this.g;
    }

    @NotNull
    public final Function1 getOnSelectedItem() {
        return this.i;
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
        return this.f.getSection();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        this.h = bundle1 == null ? -3 : bundle1.getInt("BUNDLE_BLOG_CATEGORY_SELECTED_ID");
        ((FragmentBottomSheetBlogCategoryBinding)this.getDataBinding()).blogCategoryDialogTitleText.setText(this.getString(string.label_editor_setting_daum_like_category));
        this.a();
        this.b();
        this.setBottomSheetMinimumHeight(this.getResources().getDimensionPixelSize(dimen.editor_setting_category_minimum_height_top_padding));
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setAction(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.f.setAction(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setActionKind(@Nullable ActionKind actionKind0) {
        this.f.setActionKind(actionKind0);
    }

    public void setLayoutResourceId(int v) {
        this.g = v;
    }

    public final void setOnSelectedItem(@NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(function10, "<set-?>");
        this.i = function10;
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setPage(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "<set-?>");
        this.f.setPage(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void setSection(@Nullable String s) {
        this.f.setSection(s);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.f.trackPage(tiaraListener0);
    }

    @Override  // com.kakao.android.base.tiara.TiaraListener
    public void updatePageInfo(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
        this.f.updatePageInfo(tiaraListener0);
    }
}

