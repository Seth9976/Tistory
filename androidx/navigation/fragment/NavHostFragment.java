package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.annotation.CallSuper;
import androidx.annotation.NavigationRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.R.styleable;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.g;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000E\b\u0016\u0018\u0000 12\u00020\u00012\u00020\u0002:\u00011B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u0005H\u0017¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001A\u00020\u00072\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001A\u00020\u00072\u0006\u0010\u000F\u001A\u00020\u000EH\u0015¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001A\u00020\u00072\u0006\u0010\u0013\u001A\u00020\u0012H\u0015¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00170\u0016H\u0015¢\u0006\u0004\b\u0018\u0010\u0019J-\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\u001B\u001A\u00020\u001A2\b\u0010\u001D\u001A\u0004\u0018\u00010\u001C2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u001F\u0010 J!\u0010\"\u001A\u00020\u00072\u0006\u0010!\u001A\u00020\u001E2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\"\u0010#J)\u0010&\u001A\u00020\u00072\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010%\u001A\u00020$2\b\u0010\u000B\u001A\u0004\u0018\u00010\nH\u0017¢\u0006\u0004\b&\u0010\'J\u0017\u0010)\u001A\u00020\u00072\u0006\u0010(\u001A\u00020\nH\u0017¢\u0006\u0004\b)\u0010\rJ\u000F\u0010*\u001A\u00020\u0007H\u0016¢\u0006\u0004\b*\u0010\u0004R\u001B\u0010\u000F\u001A\u00020\u000E8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b+\u0010,\u001A\u0004\b-\u0010.R\u0011\u0010\u0013\u001A\u00020\u00128F¢\u0006\u0006\u001A\u0004\b/\u00100¨\u00062"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "<init>", "()V", "Landroid/content/Context;", "context", "", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroidx/navigation/NavHostController;", "navHostController", "onCreateNavHostController", "(Landroidx/navigation/NavHostController;)V", "Landroidx/navigation/NavController;", "navController", "onCreateNavController", "(Landroidx/navigation/NavController;)V", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "createFragmentNavigator", "()Landroidx/navigation/Navigator;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Landroid/util/AttributeSet;", "attrs", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onDestroyView", "z", "Lkotlin/Lazy;", "getNavHostController$navigation_fragment_release", "()Landroidx/navigation/NavHostController;", "getNavController", "()Landroidx/navigation/NavController;", "Companion", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,393:1\n176#2,2:394\n1#3:396\n232#4,3:397\n232#4,3:400\n*S KotlinDebug\n*F\n+ 1 NavHostFragment.kt\nandroidx/navigation/fragment/NavHostFragment\n*L\n203#1:394,2\n273#1:397,3\n280#1:400,3\n*E\n"})
public class NavHostFragment extends Fragment implements NavHost {
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\f\u001A\u00020\u000B2\b\b\u0001\u0010\b\u001A\u00020\u00072\n\b\u0002\u0010\n\u001A\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000F\u001A\u00020\u000E8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010R\u0014\u0010\u0011\u001A\u00020\u000E8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0010R\u0014\u0010\u0012\u001A\u00020\u000E8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010R\u0014\u0010\u0013\u001A\u00020\u000E8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$Companion;", "", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/navigation/NavController;", "findNavController", "(Landroidx/fragment/app/Fragment;)Landroidx/navigation/NavController;", "", "graphResId", "Landroid/os/Bundle;", "startDestinationArgs", "Landroidx/navigation/fragment/NavHostFragment;", "create", "(ILandroid/os/Bundle;)Landroidx/navigation/fragment/NavHostFragment;", "", "KEY_DEFAULT_NAV_HOST", "Ljava/lang/String;", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final NavHostFragment create(@NavigationRes int v) {
            return Companion.create$default(this, v, null, 2, null);
        }

        @JvmOverloads
        @JvmStatic
        @NotNull
        public final NavHostFragment create(@NavigationRes int v, @Nullable Bundle bundle0) {
            Bundle bundle1;
            if(v == 0) {
                bundle1 = null;
            }
            else {
                bundle1 = new Bundle();
                bundle1.putInt("android-support-nav:fragment:graphId", v);
            }
            if(bundle0 != null) {
                if(bundle1 == null) {
                    bundle1 = new Bundle();
                }
                bundle1.putBundle("android-support-nav:fragment:startDestinationArgs", bundle0);
            }
            NavHostFragment navHostFragment0 = new NavHostFragment();
            if(bundle1 != null) {
                navHostFragment0.setArguments(bundle1);
            }
            return navHostFragment0;
        }

        public static NavHostFragment create$default(Companion navHostFragment$Companion0, int v, Bundle bundle0, int v1, Object object0) {
            if((v1 & 2) != 0) {
                bundle0 = null;
            }
            return navHostFragment$Companion0.create(v, bundle0);
        }

        @JvmStatic
        @NotNull
        public final NavController findNavController(@NotNull Fragment fragment0) {
            Intrinsics.checkNotNullParameter(fragment0, "fragment");
            for(Fragment fragment1 = fragment0; fragment1 != null; fragment1 = fragment1.getParentFragment()) {
                if(fragment1 instanceof NavHostFragment) {
                    return ((NavHostFragment)fragment1).getNavHostController$navigation_fragment_release();
                }
                Fragment fragment2 = fragment1.getParentFragmentManager().getPrimaryNavigationFragment();
                if(fragment2 instanceof NavHostFragment) {
                    return ((NavHostFragment)fragment2).getNavHostController$navigation_fragment_release();
                }
            }
            View view0 = null;
            View view1 = fragment0.getView();
            if(view1 != null) {
                return Navigation.findNavController(view1);
            }
            DialogFragment dialogFragment0 = fragment0 instanceof DialogFragment ? ((DialogFragment)fragment0) : null;
            if(dialogFragment0 != null) {
                Dialog dialog0 = dialogFragment0.getDialog();
                if(dialog0 != null) {
                    Window window0 = dialog0.getWindow();
                    if(window0 != null) {
                        view0 = window0.getDecorView();
                    }
                }
            }
            if(view0 == null) {
                throw new IllegalStateException("Fragment " + fragment0 + " does not have a NavController set");
            }
            return Navigation.findNavController(view0);
        }
    }

    public View A;
    public int B;
    public boolean C;
    @NotNull
    public static final Companion Companion = null;
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    public final Lazy z;

    static {
        NavHostFragment.Companion = new Companion(null);
    }

    public NavHostFragment() {
        this.z = c.lazy(new g(this));
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final NavHostFragment create(@NavigationRes int v) {
        return NavHostFragment.Companion.create(v);
    }

    @JvmOverloads
    @JvmStatic
    @NotNull
    public static final NavHostFragment create(@NavigationRes int v, @Nullable Bundle bundle0) {
        return NavHostFragment.Companion.create(v, bundle0);
    }

    @Deprecated(message = "Use {@link #onCreateNavController(NavController)}")
    @NotNull
    public Navigator createFragmentNavigator() {
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext()");
        FragmentManager fragmentManager0 = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager0, "childFragmentManager");
        int v = this.getId();
        return new FragmentNavigator(context0, fragmentManager0, (v != -1 && v != 0 ? this.getId() : id.nav_host_fragment_container));
    }

    @JvmStatic
    @NotNull
    public static final NavController findNavController(@NotNull Fragment fragment0) {
        return NavHostFragment.Companion.findNavController(fragment0);
    }

    @Override  // androidx.navigation.NavHost
    @NotNull
    public final NavController getNavController() {
        return this.getNavHostController$navigation_fragment_release();
    }

    @NotNull
    public final NavHostController getNavHostController$navigation_fragment_release() {
        return (NavHostController)this.z.getValue();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onAttach(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super.onAttach(context0);
        if(this.C) {
            this.getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(@Nullable Bundle bundle0) {
        this.getNavHostController$navigation_fragment_release();
        if(bundle0 != null && bundle0.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.C = true;
            this.getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
        super.onCreate(bundle0);
    }

    @CallSuper
    @Deprecated(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    public void onCreateNavController(@NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(navController0, "navController");
        Context context0 = this.requireContext();
        Intrinsics.checkNotNullExpressionValue(context0, "requireContext()");
        FragmentManager fragmentManager0 = this.getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(fragmentManager0, "childFragmentManager");
        navController0.getNavigatorProvider().addNavigator(new DialogFragmentNavigator(context0, fragmentManager0));
        navController0.getNavigatorProvider().addNavigator(this.createFragmentNavigator());
    }

    @CallSuper
    public void onCreateNavHostController(@NotNull NavHostController navHostController0) {
        Intrinsics.checkNotNullParameter(navHostController0, "navHostController");
        this.onCreateNavController(navHostController0);
    }

    @Override  // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NotNull LayoutInflater layoutInflater0, @Nullable ViewGroup viewGroup0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(layoutInflater0, "inflater");
        Context context0 = layoutInflater0.getContext();
        Intrinsics.checkNotNullExpressionValue(context0, "inflater.context");
        View view0 = new FragmentContainerView(context0);
        int v = this.getId();
        view0.setId((v != -1 && v != 0 ? this.getId() : id.nav_host_fragment_container));
        return view0;
    }

    @Override  // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        View view0 = this.A;
        if(view0 != null && Navigation.findNavController(view0) == this.getNavHostController$navigation_fragment_release()) {
            Navigation.setViewNavController(view0, null);
        }
        this.A = null;
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
        TypedArray typedArray1 = context0.obtainStyledAttributes(attributeSet0, androidx.navigation.fragment.R.styleable.NavHostFragment);
        Intrinsics.checkNotNullExpressionValue(typedArray1, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if(typedArray1.getBoolean(androidx.navigation.fragment.R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.C = true;
        }
        typedArray1.recycle();
    }

    @Override  // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "outState");
        super.onSaveInstanceState(bundle0);
        if(this.C) {
            bundle0.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override  // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view0, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(view0, "view");
        super.onViewCreated(view0, bundle0);
        if(!(view0 instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view0 + " is not a ViewGroup").toString());
        }
        Navigation.setViewNavController(view0, this.getNavHostController$navigation_fragment_release());
        if(view0.getParent() != null) {
            ViewParent viewParent0 = view0.getParent();
            Intrinsics.checkNotNull(viewParent0, "null cannot be cast to non-null type android.view.View");
            this.A = (View)viewParent0;
            Intrinsics.checkNotNull(((View)viewParent0));
            if(((View)viewParent0).getId() == this.getId()) {
                View view1 = this.A;
                Intrinsics.checkNotNull(view1);
                Navigation.setViewNavController(view1, this.getNavHostController$navigation_fragment_release());
            }
        }
    }
}

