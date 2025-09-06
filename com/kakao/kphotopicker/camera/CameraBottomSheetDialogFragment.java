package com.kakao.kphotopicker.camera;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModelProvider.Factory;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.recyclerview.widget.RecyclerView.ItemDecoration;
import androidx.recyclerview.widget.RecyclerView.LayoutParams;
import androidx.recyclerview.widget.RecyclerView.State;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.kakao.kphotopicker.R.drawable;
import com.kakao.kphotopicker.R.style;
import com.kakao.kphotopicker.databinding.KphotopickerFragmentCameraBottomSheetBinding;
import kb.a;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001A\u00020\u00062\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\b\u0010\f\u001A\u0004\u0018\u00010\u000B2\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000E\u0010\u000F¨\u0006\u0010"}, d2 = {"Lcom/kakao/kphotopicker/camera/CameraBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "<init>", "()V", "Landroid/os/Bundle;", "savedInstanceState", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "kphotopicker_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nCameraBottomSheetDialogFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CameraBottomSheetDialogFragment.kt\ncom/kakao/kphotopicker/camera/CameraBottomSheetDialogFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,67:1\n172#2,9:68\n*S KotlinDebug\n*F\n+ 1 CameraBottomSheetDialogFragment.kt\ncom/kakao/kphotopicker/camera/CameraBottomSheetDialogFragment\n*L\n18#1:68,9\n*E\n"})
public final class CameraBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public final Lazy A;
    public final Lazy B;

    public CameraBottomSheetDialogFragment() {
        this.A = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(CameraBottomSheetViewModel.class), new Function0() {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final ViewModelStore invoke() {
                ViewModelStore viewModelStore0 = this.w.requireActivity().getViewModelStore();
                Intrinsics.checkNotNullExpressionValue(viewModelStore0, "requireActivity().viewModelStore");
                return viewModelStore0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, new Function0(this) {
            public final Function0 w;
            public final Fragment x;

            {
                this.w = function00;
                this.x = fragment0;
                super(0);
            }

            @NotNull
            public final CreationExtras invoke() {
                CreationExtras creationExtras0;
                Function0 function00 = this.w;
                if(function00 == null) {
                    creationExtras0 = this.x.requireActivity().getDefaultViewModelCreationExtras();
                    Intrinsics.checkNotNullExpressionValue(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                }
                else {
                    creationExtras0 = (CreationExtras)function00.invoke();
                    if(creationExtras0 == null) {
                        creationExtras0 = this.x.requireActivity().getDefaultViewModelCreationExtras();
                        Intrinsics.checkNotNullExpressionValue(creationExtras0, "requireActivity().defaultViewModelCreationExtras");
                        return creationExtras0;
                    }
                }
                return creationExtras0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        }, new Function0() {
            public final Fragment w;

            {
                this.w = fragment0;
                super(0);
            }

            @NotNull
            public final Factory invoke() {
                Factory viewModelProvider$Factory0 = this.w.requireActivity().getDefaultViewModelProviderFactory();
                Intrinsics.checkNotNullExpressionValue(viewModelProvider$Factory0, "requireActivity().defaultViewModelProviderFactory");
                return viewModelProvider$Factory0;
            }

            @Override  // kotlin.jvm.functions.Function0
            public Object invoke() {
                return this.invoke();
            }
        });
        this.B = c.lazy(new a(this, 2));
    }

    public static final CameraBottomSheetViewModel access$getCameraBottomSheetViewModel(CameraBottomSheetDialogFragment cameraBottomSheetDialogFragment0) {
        return (CameraBottomSheetViewModel)cameraBottomSheetDialogFragment0.A.getValue();
    }

    @Override  // androidx.fragment.app.DialogFragment
    public void onCreate(@Nullable Bundle bundle0) {
        super.onCreate(bundle0);
        this.setStyle(2, style.Theme_Kphotopicker_BottomSheetDialog);
    }

    @Override  // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        KphotopickerFragmentCameraBottomSheetBinding kphotopickerFragmentCameraBottomSheetBinding0 = KphotopickerFragmentCameraBottomSheetBinding.inflate(layoutInflater0);
        Intrinsics.checkNotNullExpressionValue(kphotopickerFragmentCameraBottomSheetBinding0, "inflate(...)");
        CameraListAdapter cameraListAdapter0 = (CameraListAdapter)this.B.getValue();
        kphotopickerFragmentCameraBottomSheetBinding0.cameraList.setAdapter(cameraListAdapter0);
        com.kakao.kphotopicker.camera.CameraBottomSheetDialogFragment.onCreateView.1.1 cameraBottomSheetDialogFragment$onCreateView$1$10 = new ItemDecoration() {
            public final Drawable m;

            {
                this.m = ContextCompat.getDrawable(recyclerView0.getContext(), drawable.kphotopicker_divider_bottom_sheet);
            }

            @Override  // androidx.recyclerview.widget.RecyclerView$ItemDecoration
            public void onDrawOver(@NotNull Canvas canvas0, @NotNull RecyclerView recyclerView0, @NotNull State recyclerView$State0) {
                Intrinsics.checkNotNullParameter(canvas0, "c");
                Intrinsics.checkNotNullParameter(recyclerView0, "parent");
                Intrinsics.checkNotNullParameter(recyclerView$State0, "state");
                Drawable drawable0 = this.m;
                if(drawable0 != null) {
                    int v = recyclerView0.getPaddingLeft();
                    int v1 = recyclerView0.getWidth();
                    int v2 = recyclerView0.getPaddingRight();
                    int v3 = recyclerView0.getChildCount();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        View view0 = recyclerView0.getChildAt(v4);
                        int v5 = view0.getBottom();
                        ViewGroup.LayoutParams viewGroup$LayoutParams0 = view0.getLayoutParams();
                        Intrinsics.checkNotNull(viewGroup$LayoutParams0, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        int v6 = v5 + ((LayoutParams)viewGroup$LayoutParams0).bottomMargin;
                        drawable0.setBounds(v, v6, v1 - v2, drawable0.getIntrinsicHeight() + v6);
                        drawable0.draw(canvas0);
                    }
                }
            }
        };
        kphotopickerFragmentCameraBottomSheetBinding0.cameraList.addItemDecoration(cameraBottomSheetDialogFragment$onCreateView$1$10);
        View view0 = kphotopickerFragmentCameraBottomSheetBinding0.getRoot();
        Intrinsics.checkNotNullExpressionValue(view0, "getRoot(...)");
        return view0;
    }
}

