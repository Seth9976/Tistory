package com.kakao.tistory.presentation.view.editor;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.activity.m;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.LifecycleOwner;
import com.kakao.android.base.tiara.TiaraListener;
import com.kakao.android.base.viewmodel.BaseViewModelLazy;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorView;
import com.kakao.tistory.presentation.R.layout;
import com.kakao.tistory.presentation.common.extension.LiveDataExtensionKt;
import com.kakao.tistory.presentation.databinding.FragmentEditorBinding;
import com.kakao.tistory.presentation.databinding.LayoutEditorTitleBinding;
import com.kakao.tistory.presentation.viewmodel.DraftViewModel;
import com.kakao.tistory.presentation.viewmodel.EditorViewModel;
import dagger.hilt.android.AndroidEntryPoint;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@AndroidEntryPoint
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u0000  2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001 B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\b\u001A\u00020\u00072\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001A\u00020\u00072\u0006\u0010\u000B\u001A\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0013\u001A\u0004\u0018\u00010\u00122\u0006\u0010\u000F\u001A\u00020\u000E2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001A\u00020\u00072\u0006\u0010\u0015\u001A\u00020\u00122\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u00072\u0006\u0010\u0018\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\tR\u001A\u0010\u001F\u001A\u00020\u001A8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001E¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorFragment;", "Lcom/kakao/tistory/presentation/view/common/base/TistoryFragment;", "Lcom/kakao/tistory/presentation/databinding/FragmentEditorBinding;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onViewStateRestored", "(Landroid/os/Bundle;)V", "Lcom/kakao/android/base/tiara/TiaraListener;", "tiaraListener", "trackPage", "(Lcom/kakao/android/base/tiara/TiaraListener;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "", "g", "I", "getLayoutResourceId", "()I", "layoutResourceId", "Companion", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nEditorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EditorFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorFragment\n+ 2 TistoryViewModelExtension.kt\ncom/kakao/android/base/viewmodel/TistoryViewModelExtensionKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,284:1\n21#2,4:285\n21#2,4:299\n1#3:289\n1#3:303\n172#4,9:290\n172#4,9:304\n*S KotlinDebug\n*F\n+ 1 EditorFragment.kt\ncom/kakao/tistory/presentation/view/editor/EditorFragment\n*L\n41#1:285,4\n42#1:299,4\n41#1:289\n42#1:303\n41#1:290,9\n42#1:304,9\n*E\n"})
public final class EditorFragment extends Hilt_EditorFragment {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001A\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001A\u00020\u00058\u0002X\u0082D¢\u0006\u0006\n\u0004\b\b\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/kakao/tistory/presentation/view/editor/EditorFragment$Companion;", "", "Lcom/kakao/tistory/presentation/view/editor/EditorFragment;", "newInstance", "()Lcom/kakao/tistory/presentation/view/editor/EditorFragment;", "", "BUNDLE_KEY_HEADER", "Ljava/lang/String;", "BUNDLE_KEY_KEDITOR", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final EditorFragment newInstance() {
            return new EditorFragment();
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final int g;
    public LayoutEditorTitleBinding h;
    public final BaseViewModelLazy i;
    public final BaseViewModelLazy j;
    public final Lazy k;
    public static final String l;
    public static final String m;

    static {
        EditorFragment.Companion = new Companion(null);
        EditorFragment.$stable = 8;
        EditorFragment.l = "BUNDLE_KEY_KEDITOR";
        EditorFragment.m = "BUNDLE_KEY_HEADER";
    }

    public EditorFragment() {
        this.g = layout.fragment_editor;
        this.i = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(EditorViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.j = new BaseViewModelLazy(this, FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(DraftViewModel.class), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.1(this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.2(null, this), new com.kakao.android.base.viewmodel.TistoryViewModelExtensionKt.getActivityViewModels..inlined.activityViewModels.default.3(this)));
        this.k = c.lazy(new v1(this));
    }

    public static final void a(EditText editText0, EditorFragment editorFragment0) {
        Intrinsics.checkNotNullParameter(editText0, "$this_apply");
        Intrinsics.checkNotNullParameter(editorFragment0, "this$0");
        editText0.setFocusableInTouchMode(true);
        editText0.requestFocus();
        Context context0 = editText0.getContext();
        LayoutEditorTitleBinding layoutEditorTitleBinding0 = null;
        Object object0 = context0 == null ? null : context0.getSystemService("input_method");
        InputMethodManager inputMethodManager0 = object0 instanceof InputMethodManager ? ((InputMethodManager)object0) : null;
        if(inputMethodManager0 != null) {
            LayoutEditorTitleBinding layoutEditorTitleBinding1 = editorFragment0.h;
            if(layoutEditorTitleBinding1 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("titleDataBinding");
            }
            else {
                layoutEditorTitleBinding0 = layoutEditorTitleBinding1;
            }
            inputMethodManager0.showSoftInput(layoutEditorTitleBinding0.editorTitle, 0);
        }
    }

    public final void a() {
        LayoutEditorTitleBinding layoutEditorTitleBinding0 = LayoutEditorTitleBinding.inflate(LayoutInflater.from(this.getContext()), ((FragmentEditorBinding)this.getDataBinding()).editorKeditorView, false);
        Intrinsics.checkNotNullExpressionValue(layoutEditorTitleBinding0, "inflate(...)");
        this.h = layoutEditorTitleBinding0;
        LayoutEditorTitleBinding layoutEditorTitleBinding1 = null;
        if(layoutEditorTitleBinding0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleDataBinding");
            layoutEditorTitleBinding0 = null;
        }
        layoutEditorTitleBinding0.setViewModel(((EditorViewModel)this.i.getValue()));
        LayoutEditorTitleBinding layoutEditorTitleBinding2 = this.h;
        if(layoutEditorTitleBinding2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleDataBinding");
            layoutEditorTitleBinding2 = null;
        }
        layoutEditorTitleBinding2.setLifecycleOwner(this.getViewLifecycleOwner());
        LayoutEditorTitleBinding layoutEditorTitleBinding3 = this.h;
        if(layoutEditorTitleBinding3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleDataBinding");
            layoutEditorTitleBinding3 = null;
        }
        EditorFragment.initView.1.1 editorFragment$initView$1$10 = new EditorFragment.initView.1.1(layoutEditorTitleBinding3.editorTitle, this);
        layoutEditorTitleBinding3.editorTitle.addTextChangedListener(editorFragment$initView$1$10);
        m m0 = new m(29, layoutEditorTitleBinding3.editorTitle, this);
        layoutEditorTitleBinding3.editorTitle.postDelayed(m0, 500L);
        KeditorView keditorView0 = ((FragmentEditorBinding)this.getDataBinding()).editorKeditorView;
        LayoutEditorTitleBinding layoutEditorTitleBinding4 = this.h;
        if(layoutEditorTitleBinding4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("titleDataBinding");
        }
        else {
            layoutEditorTitleBinding1 = layoutEditorTitleBinding4;
        }
        View view0 = layoutEditorTitleBinding1.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        keditorView0.setHeaderView(view0);
        ((FragmentEditorBinding)this.getDataBinding()).editorKeditorToolbar.onExtraClicked(z0.a);
    }

    public static final FragmentEditorBinding access$getDataBinding(EditorFragment editorFragment0) {
        return (FragmentEditorBinding)editorFragment0.getDataBinding();
    }

    public static final DraftViewModel access$getDraftViewModel(EditorFragment editorFragment0) {
        return (DraftViewModel)editorFragment0.j.getValue();
    }

    public static final EditorViewModel access$getEditorViewModel(EditorFragment editorFragment0) {
        return (EditorViewModel)editorFragment0.i.getValue();
    }

    public static final UploadProgressDialog access$getUploadProgressDialog(EditorFragment editorFragment0) {
        return (UploadProgressDialog)editorFragment0.k.getValue();
    }

    @Override  // com.kakao.android.base.ui.BaseFragment
    public int getLayoutResourceId() {
        return this.g;
    }

    @Override  // com.kakao.android.base.ui.BaseFragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        LayoutInflater layoutInflater1 = this.requireActivity().getLayoutInflater();
        Intrinsics.checkNotNullExpressionValue(layoutInflater1, "getLayoutInflater(...)");
        return super.onCreateView(layoutInflater1, viewGroup0, bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        bundle0.putString("BUNDLE_KEY_KEDITOR", ((EditorViewModel)this.i.getValue()).keditorExportToJson());
        bundle0.putString("BUNDLE_KEY_HEADER", ((String)((EditorViewModel)this.i.getValue()).getTitleString().getValue()));
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        ((FragmentEditorBinding)this.getDataBinding()).setViewModel(((EditorViewModel)this.i.getValue()));
        ((FragmentEditorBinding)this.getDataBinding()).setDraftViewModel(((DraftViewModel)this.j.getValue()));
        KeditorView keditorView0 = ((FragmentEditorBinding)this.getDataBinding()).editorKeditorView;
        Intrinsics.checkNotNullExpressionValue(keditorView0, "editorKeditorView");
        Keditor.INSTANCE.initEditorView(keditorView0);
        this.a();
        EditorViewModel editorViewModel0 = (EditorViewModel)this.i.getValue();
        KeditorView keditorView1 = ((FragmentEditorBinding)this.getDataBinding()).editorKeditorView;
        Intrinsics.checkNotNullExpressionValue(keditorView1, "editorKeditorView");
        editorViewModel0.setKediorView(keditorView1);
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getTrackPageViewEdit(), lifecycleOwner0, new h1(this));
        editorViewModel0.isShowProgress().observe(this.getViewLifecycleOwner(), new u1(new i1(this)));
        editorViewModel0.isCompleteLoad().observe(this.getViewLifecycleOwner(), new u1(new j1(this)));
        LifecycleOwner lifecycleOwner1 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner1, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getErrorNoTitle(), lifecycleOwner1, new k1(this));
        LifecycleOwner lifecycleOwner2 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner2, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowUploadLoading(), lifecycleOwner2, new l1(this));
        LifecycleOwner lifecycleOwner3 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner3, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowErrorDialog(), lifecycleOwner3, new n1(this));
        LifecycleOwner lifecycleOwner4 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner4, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getErrorDraftNoTitleOrContent(), lifecycleOwner4, new o1(this));
        LifecycleOwner lifecycleOwner5 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner5, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getLoadDraftComplete(), lifecycleOwner5, new p1(this));
        LifecycleOwner lifecycleOwner6 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner6, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getLoadDraftDuplicated(), lifecycleOwner6, new q1(this));
        LifecycleOwner lifecycleOwner7 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner7, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getRequestLoadModifiedEntry(), lifecycleOwner7, new b1(this));
        LifecycleOwner lifecycleOwner8 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner8, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getRequestLoadDraft(), lifecycleOwner8, new c1(this));
        LifecycleOwner lifecycleOwner9 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner9, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowUploadFailDialog(), lifecycleOwner9, new e1(this));
        LifecycleOwner lifecycleOwner10 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner10, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(editorViewModel0.getShowUploadFailStringDialog(), lifecycleOwner10, new g1(this));
        DraftViewModel draftViewModel0 = (DraftViewModel)this.j.getValue();
        draftViewModel0.getShowDraftBottomSheet().observe(this.getViewLifecycleOwner(), new u1(new r1(this)));
        LifecycleOwner lifecycleOwner11 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner11, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(draftViewModel0.getRequestLoadDraft(), lifecycleOwner11, new s1(this));
        LifecycleOwner lifecycleOwner12 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner12, "getViewLifecycleOwner(...)");
        LiveDataExtensionKt.observeEvent(draftViewModel0.getDeleteComplete(), lifecycleOwner12, new t1(this));
        long v = ((EditorViewModel)this.i.getValue()).getEntryId();
        EditorTiara.INSTANCE.trackPage(v);
        ((EditorViewModel)this.i.getValue()).runAutoSaving();
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewStateRestored(@Nullable Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        if(bundle0 != null) {
            String s = bundle0.getString("BUNDLE_KEY_KEDITOR");
            String s1 = "";
            if(s == null) {
                s = "";
            }
            ((EditorViewModel)this.i.getValue()).loadKeditor(s);
            String s2 = bundle0.getString("BUNDLE_KEY_HEADER");
            if(s2 != null) {
                s1 = s2;
            }
            ((EditorViewModel)this.i.getValue()).setTitleString(s1);
        }
    }

    @Override  // com.kakao.tistory.presentation.view.common.base.TistoryFragment
    public void trackPage(@NotNull TiaraListener tiaraListener0) {
        Intrinsics.checkNotNullParameter(tiaraListener0, "tiaraListener");
    }
}

