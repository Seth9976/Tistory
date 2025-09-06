package com.kakao.tistory.presentation.view.bottomsheet;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
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
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.FragmentBottomSheetBlogCategoryBinding;
import com.kakao.tistory.presentation.view.common.recyclerview.SimpleDividerItemDecoration;
import com.kakao.tistory.presentation.viewmodel.BlogCategoryViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import hc.a;
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
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u0000 52\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u00015B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\n\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0003H\u0096\u0001¢\u0006\u0004\b\n\u0010\tJ!\u0010\u000F\u001A\u00020\u00072\u0006\u0010\f\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010R*\u0010\u0019\u001A\u00020\u00112\u0006\u0010\u0012\u001A\u00020\u00118\u0014@VX\u0094\u000E¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R.\u0010\"\u001A\u000E\u0012\u0004\u0012\u00020\u001B\u0012\u0004\u0012\u00020\u00070\u001A8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R\u001C\u0010(\u001A\u00020#8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b$\u0010%\"\u0004\b&\u0010\'R\u001E\u0010.\u001A\u0004\u0018\u00010)8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b*\u0010+\"\u0004\b,\u0010-R\u001C\u00101\u001A\u00020#8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b/\u0010%\"\u0004\b0\u0010\'R\u001E\u00104\u001A\u0004\u0018\u00010#8\u0016@\u0016X\u0096\u000F¢\u0006\f\u001A\u0004\b2\u0010%\"\u0004\b3\u0010\'¨\u00066"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogFragment;", "Lcom/kakao/android/base/ui/bottomsheet/BaseBottomSheetDialogFragment;", "Lcom/kakao/tistory/presentation/databinding/FragmentBottomSheetBlogCategoryBinding;", "Lcom/kakao/android/base/tiara/TiaraListener;", "<init>", "()V", "tiaraListener", "", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "updatePageInfo", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "", "<set-?>", "g", "I", "getLayoutResourceId", "()I", "setLayoutResourceId", "(I)V", "layoutResourceId", "Lkotlin/Function1;", "Lcom/kakao/tistory/domain/entity/CategoryItem;", "k", "Lkotlin/jvm/functions/Function1;", "getOnSelectedItem", "()Lkotlin/jvm/functions/Function1;", "setOnSelectedItem", "(Lkotlin/jvm/functions/Function1;)V", "onSelectedItem", "", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "action", "Lcom/kakao/tiara/data/ActionKind;", "getActionKind", "()Lcom/kakao/tiara/data/ActionKind;", "setActionKind", "(Lcom/kakao/tiara/data/ActionKind;)V", "actionKind", "getPage", "setPage", "page", "getSection", "setSection", "section", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBlogCategoryDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BlogCategoryDialogFragment.kt\ncom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,130:1\n14#2,4:131\n1#3:135\n106#4,15:136\n*S KotlinDebug\n*F\n+ 1 BlogCategoryDialogFragment.kt\ncom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogFragment\n*L\n58#1:131,4\n58#1:135\n58#1:136,15\n*E\n"})
public final class BlogCategoryDialogFragment extends Hilt_BlogCategoryDialogFragment implements TiaraListener {
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J9\u0010\u000B\u001A\u00020\n2\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u00062\b\b\u0002\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\r\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000ER\u0014\u0010\u000F\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u000ER\u0014\u0010\u0010\u001A\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000E¨\u0006\u0011"}, d2 = {"Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogFragment$Companion;", "", "", "section", "page", "blogName", "", "categoryId", "", "editMode", "Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogFragment;", "newInstance", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)Lcom/kakao/tistory/presentation/view/bottomsheet/BlogCategoryDialogFragment;", "BUNDLE_BLOG_CATEGORY_BLOG_NAME", "Ljava/lang/String;", "BUNDLE_BLOG_CATEGORY_EDIT_MODE", "BUNDLE_BLOG_CATEGORY_SELECTED_ID", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final BlogCategoryDialogFragment newInstance(@Nullable String s, @NotNull String s1, @NotNull String s2, int v, boolean z) {
            Intrinsics.checkNotNullParameter(s1, "page");
            Intrinsics.checkNotNullParameter(s2, "blogName");
            BlogCategoryDialogFragment blogCategoryDialogFragment0 = new BlogCategoryDialogFragment();
            Bundle bundle0 = new Bundle();
            bundle0.putString("BUNDLE_TIARA_SECTION_TYPE", s);
            bundle0.putString("BUNDLE_TIARA_PAGE_TYPE", s1);
            bundle0.putString("BUNDLE_VIEW_TYPE", s2);
            bundle0.putInt("BUNDLE_BLOG_CATEGORY_SELECTED_ID", v);
            bundle0.putBoolean("BUNDLE_BLOG_CATEGORY_EDIT_MODE", z);
            blogCategoryDialogFragment0.setArguments(bundle0);
            return blogCategoryDialogFragment0;
        }

        public static BlogCategoryDialogFragment newInstance$default(Companion blogCategoryDialogFragment$Companion0, String s, String s1, String s2, int v, boolean z, int v1, Object object0) {
            if((v1 & 16) != 0) {
                z = false;
            }
            return blogCategoryDialogFragment$Companion0.newInstance(s, s1, s2, v, z);
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final TiaraDelegator f;
    public int g;
    public String h;
    public int i;
    public boolean j;
    public Function1 k;
    public final BaseViewModelLazy l;
    public BlogCategoryDialogAdapter m;

    static {
        BlogCategoryDialogFragment.Companion = new Companion(null);
        BlogCategoryDialogFragment.$stable = 8;
    }

    public BlogCategoryDialogFragment() {
        this.f = new TiaraDelegator();
        this.g = layout.fragment_bottom_sheet_blog_category;
        this.i = -3;
        this.k = i.a;
        com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4 tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40 = new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.4(new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels.2(this));
        Lazy lazy0 = c.lazy(LazyThreadSafetyMode.NONE, tistoryViewModelExtensionKt$getViewModels$$inlined$viewModels$default$40);
        this.l = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(BlogCategoryViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.5(lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.6(null, lazy0), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getViewModels..inlined.viewModels.default.7(this, lazy0)));
    }

    public static final void a(BlogCategoryDialogFragment blogCategoryDialogFragment0, Boolean boolean0) {
        Intrinsics.checkNotNullParameter(blogCategoryDialogFragment0, "this$0");
        if(blogCategoryDialogFragment0.getContext() != null) {
            RelativeLayout relativeLayout0 = ((FragmentBottomSheetBlogCategoryBinding)blogCategoryDialogFragment0.getDataBinding()).blogCategoryLoadingView;
            Intrinsics.checkNotNull(boolean0);
            relativeLayout0.setVisibility((boolean0.booleanValue() ? 0 : 8));
        }
    }

    public static final void a(BlogCategoryDialogFragment blogCategoryDialogFragment0, List list0) {
        Intrinsics.checkNotNullParameter(blogCategoryDialogFragment0, "this$0");
        if(list0 != null) {
            BlogCategoryDialogAdapter blogCategoryDialogAdapter0 = blogCategoryDialogFragment0.m;
            if(blogCategoryDialogAdapter0 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("blogCategoryDialogAdapter");
                blogCategoryDialogAdapter0 = null;
            }
            blogCategoryDialogAdapter0.setItems(list0);
        }
    }

    public final void a() {
        BlogCategoryViewModel blogCategoryViewModel0 = (BlogCategoryViewModel)this.l.getValue();
        blogCategoryViewModel0.setEditMode(this.j);
        blogCategoryViewModel0.isShowProgress().observe(this.getViewLifecycleOwner(), new a(this, 0));
        blogCategoryViewModel0.getCategories().observe(this.getViewLifecycleOwner(), new a(this, 1));
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(blogCategoryViewModel0.getSelectedCategoryItem(), lifecycleOwner0, new h(this));
        String s = this.h;
        if(s != null) {
            ((BlogCategoryViewModel)this.l.getValue()).getCategories(s);
        }
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
        return this.k;
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
        SimpleDividerItemDecoration simpleDividerItemDecoration0;
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        Bundle bundle1 = this.getArguments();
        if(bundle1 != null) {
            this.setSection(bundle1.getString("BUNDLE_TIARA_SECTION_TYPE"));
            String s = bundle1.getString("BUNDLE_TIARA_PAGE_TYPE");
            if(s == null) {
                s = "미정";
            }
            else {
                Intrinsics.checkNotNull(s);
            }
            this.setPage(s);
        }
        Bundle bundle2 = this.getArguments();
        BlogCategoryDialogAdapter blogCategoryDialogAdapter0 = null;
        this.h = bundle2 == null ? null : bundle2.getString("BUNDLE_VIEW_TYPE");
        Bundle bundle3 = this.getArguments();
        this.i = bundle3 == null ? -3 : bundle3.getInt("BUNDLE_BLOG_CATEGORY_SELECTED_ID");
        Bundle bundle4 = this.getArguments();
        boolean z = bundle4 == null ? false : bundle4.getBoolean("BUNDLE_BLOG_CATEGORY_EDIT_MODE");
        this.j = z;
        if(z) {
            ((FragmentBottomSheetBlogCategoryBinding)this.getDataBinding()).blogCategoryDialogTitleText.setText(this.getString(string.label_blog_category_select));
        }
        this.m = new BlogCategoryDialogAdapter(new g(((BlogCategoryViewModel)this.l.getValue())));
        RecyclerView recyclerView0 = ((FragmentBottomSheetBlogCategoryBinding)this.getDataBinding()).blogCategoryDialogRecyclerView;
        recyclerView0.setLayoutManager(new LinearLayoutManager(recyclerView0.getContext()));
        recyclerView0.setItemAnimator(new DefaultItemAnimator());
        BlogCategoryDialogAdapter blogCategoryDialogAdapter1 = this.m;
        if(blogCategoryDialogAdapter1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("blogCategoryDialogAdapter");
        }
        else {
            blogCategoryDialogAdapter0 = blogCategoryDialogAdapter1;
        }
        blogCategoryDialogAdapter0.setSelectedCategoryId(this.i);
        recyclerView0.setAdapter(blogCategoryDialogAdapter0);
        if(this.j) {
            Context context0 = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(context0, "requireContext(...)");
            simpleDividerItemDecoration0 = new SimpleDividerItemDecoration(context0, 0, true, false, 10, null);
        }
        else {
            Context context1 = this.requireContext();
            Intrinsics.checkNotNullExpressionValue(context1, "requireContext(...)");
            simpleDividerItemDecoration0 = new BlogCategoryDividerItemDecoration(context1);
        }
        recyclerView0.addItemDecoration(simpleDividerItemDecoration0);
        this.a();
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
        this.k = function10;
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

