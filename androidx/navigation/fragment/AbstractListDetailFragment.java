package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View.OnLayoutChangeListener;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.CallSuper;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.R.styleable;
import androidx.slidingpanelayout.widget.SlidingPaneLayout.LayoutParams;
import androidx.slidingpanelayout.widget.SlidingPaneLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.a;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000B\u001A\u00020\n2\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0007\u001A\u00020\u00062\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u000B\u0010\fJ+\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001A\u00020\u00112\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\t\u001A\u0004\u0018\u00010\bH&¢\u0006\u0004\b\u0014\u0010\u0013J\u000F\u0010\u0016\u001A\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u0019\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\u00112\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ!\u0010\u001B\u001A\u00020\n2\u0006\u0010\u0018\u001A\u00020\u00112\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001B\u0010\u001AJ\u0019\u0010\u001C\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bH\u0017¢\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001F\u001A\u00020\n2\u0006\u0010\u001E\u001A\u00020\bH\u0017¢\u0006\u0004\b\u001F\u0010\u001DR\u0011\u0010#\u001A\u00020 8F¢\u0006\u0006\u001A\u0004\b!\u0010\"R\u0011\u0010%\u001A\u00020\u00158F¢\u0006\u0006\u001A\u0004\b$\u0010\u0017¨\u0006\'"}, d2 = {"Landroidx/navigation/fragment/AbstractListDetailFragment;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "Landroid/os/Bundle;", "savedInstanceState", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onCreateListPaneView", "Landroidx/navigation/fragment/NavHostFragment;", "onCreateDetailPaneNavHostFragment", "()Landroidx/navigation/fragment/NavHostFragment;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onListPaneViewCreated", "onViewStateRestored", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "getSlidingPaneLayout", "()Landroidx/slidingpanelayout/widget/SlidingPaneLayout;", "slidingPaneLayout", "getDetailPaneNavHostFragment", "detailPaneNavHostFragment", "p4/a", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAbstractListDetailFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 FragmentManager.kt\nandroidx/fragment/app/FragmentManagerKt\n+ 5 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,239:1\n232#2,3:240\n1#3:243\n28#4,12:244\n65#5,4:256\n37#5:260\n53#5:261\n71#5,2:262\n*S KotlinDebug\n*F\n+ 1 AbstractListDetailFragment.kt\nandroidx/navigation/fragment/AbstractListDetailFragment\n*L\n100#1:240,3\n157#1:244,12\n164#1:256,4\n164#1:260\n164#1:261\n164#1:262,2\n*E\n"})
public abstract class AbstractListDetailFragment extends Fragment {
    public NavHostFragment A;
    public int B;
    public a z;

    @NotNull
    public final NavHostFragment getDetailPaneNavHostFragment() {
        NavHostFragment navHostFragment0 = this.A;
        if(navHostFragment0 == null) {
            throw new IllegalStateException(("Fragment " + this + " was called before onCreateView().").toString());
        }
        Intrinsics.checkNotNull(navHostFragment0, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        return navHostFragment0;
    }

    @NotNull
    public final SlidingPaneLayout getSlidingPaneLayout() {
        View view0 = this.requireView();
        Intrinsics.checkNotNull(view0, "null cannot be cast to non-null type androidx.slidingpanelayout.widget.SlidingPaneLayout");
        return (SlidingPaneLayout)view0;
    }

    @NotNull
    public NavHostFragment onCreateDetailPaneNavHostFragment() {
        int v = this.B;
        return v == 0 ? new NavHostFragment() : Companion.create$default(NavHostFragment.Companion, v, null, 2, null);
    }

    @NotNull
    public abstract View onCreateListPaneView(@NotNull LayoutInflater arg1, @Nullable ViewGroup arg2, @Nullable Bundle arg3);

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        NavHostFragment navHostFragment0;
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        if(bundle0 != null) {
            this.B = bundle0.getInt("android-support-nav:fragment:graphId");
        }
        View view0 = new SlidingPaneLayout(layoutInflater0.getContext());
        view0.setId(id.sliding_pane_layout);
        View view1 = this.onCreateListPaneView(layoutInflater0, ((ViewGroup)view0), bundle0);
        if(!Intrinsics.areEqual(view1, view0) && !Intrinsics.areEqual(view1.getParent(), view0)) {
            ((ViewGroup)view0).addView(view1);
        }
        Context context0 = layoutInflater0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "inflater.context");
        FragmentContainerView fragmentContainerView0 = new FragmentContainerView(context0);
        fragmentContainerView0.setId(id.sliding_pane_detail_container);
        LayoutParams slidingPaneLayout$LayoutParams0 = new LayoutParams(layoutInflater0.getContext().getResources().getDimensionPixelSize(dimen.sliding_pane_detail_pane_width), -1);
        slidingPaneLayout$LayoutParams0.weight = 1.0f;
        ((ViewGroup)view0).addView(fragmentContainerView0, slidingPaneLayout$LayoutParams0);
        Fragment fragment0 = this.getChildFragmentManager().findFragmentById(id.sliding_pane_detail_container);
        boolean z = true;
        if(fragment0 == null) {
            navHostFragment0 = this.onCreateDetailPaneNavHostFragment();
            FragmentManager fragmentManager0 = this.getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(fragmentManager0, "childFragmentManager");
            FragmentTransaction fragmentTransaction0 = fragmentManager0.beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransaction0, "beginTransaction()");
            fragmentTransaction0.setReorderingAllowed(true);
            fragmentTransaction0.add(id.sliding_pane_detail_container, navHostFragment0);
            fragmentTransaction0.commit();
        }
        else {
            navHostFragment0 = (NavHostFragment)fragment0;
        }
        this.A = navHostFragment0;
        this.z = new a(((SlidingPaneLayout)view0));
        if(!ViewCompat.isLaidOut(view0) || view0.isLayoutRequested()) {
            view0.addOnLayoutChangeListener(new View.OnLayoutChangeListener() {
                @Override  // android.view.View$OnLayoutChangeListener
                public void onLayoutChange(@NotNull View view0, int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
                    Intrinsics.checkParameterIsNotNull(view0, "view");
                    view0.removeOnLayoutChangeListener(this);
                    OnBackPressedCallback onBackPressedCallback0 = ((SlidingPaneLayout)view0).z;
                    Intrinsics.checkNotNull(onBackPressedCallback0);
                    onBackPressedCallback0.setEnabled(this.b.isSlideable() && this.b.isOpen());
                }
            });
        }
        else {
            OnBackPressedCallback onBackPressedCallback0 = this.z;
            Intrinsics.checkNotNull(onBackPressedCallback0);
            if(!((SlidingPaneLayout)view0).isSlideable() || !((SlidingPaneLayout)view0).isOpen()) {
                z = false;
            }
            onBackPressedCallback0.setEnabled(z);
        }
        OnBackPressedDispatcher onBackPressedDispatcher0 = this.requireActivity().getOnBackPressedDispatcher();
        LifecycleOwner lifecycleOwner0 = this.getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(lifecycleOwner0, "viewLifecycleOwner");
        a a0 = this.z;
        Intrinsics.checkNotNull(a0);
        onBackPressedDispatcher0.addCallback(lifecycleOwner0, a0);
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onInflate(@NotNull Context context0, @NotNull AttributeSet attributeSet0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super.onInflate(context0, attributeSet0, bundle0);
        TypedArray typedArray0 = context0.obtainStyledAttributes(attributeSet0, styleable.NavHost);
        Intrinsics.checkNotNullExpressionValue(typedArray0, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int v = typedArray0.getResourceId(styleable.NavHost_navGraph, 0);
        if(v != 0) {
            this.B = v;
        }
        typedArray0.recycle();
    }

    public void onListPaneViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        int v = this.B;
        if(v != 0) {
            bundle0.putInt("android-support-nav:fragment:graphId", v);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public final void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        View view1 = this.getSlidingPaneLayout().getChildAt(0);
        Intrinsics.checkNotNullExpressionValue(view1, "listPaneView");
        this.onListPaneViewCreated(view1, bundle0);
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onViewStateRestored(@Nullable Bundle bundle0) {
        super.onViewStateRestored(bundle0);
        a a0 = this.z;
        Intrinsics.checkNotNull(a0);
        a0.setEnabled(this.getSlidingPaneLayout().isSlideable() && this.getSlidingPaneLayout().isOpen());
    }
}

