package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.annotation.CallSuper;
import androidx.compose.material3.m;
import androidx.compose.material3.td;
import androidx.compose.ui.platform.t1;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager.OnBackStackChangedListener;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras.Empty;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.collections.x;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.c;
import p4.e;
import p4.f;

@Name("fragment")
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003>?@B\u001F\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005\u0012\u0006\u0010\b\u001A\u00020\u0007\u00A2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000E\u001A\u00020\r2\u0006\u0010\f\u001A\u00020\u000BH\u0016\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\'\u0010\u0016\u001A\u00020\r2\u0006\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u0013\u001A\u00020\u00122\u0006\u0010\f\u001A\u00020\u000BH\u0000\u00A2\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u001A\u001A\u00020\r2\u0006\u0010\u0017\u001A\u00020\u00122\u0006\u0010\u0019\u001A\u00020\u0018H\u0016\u00A2\u0006\u0004\b\u001A\u0010\u001BJ\u000F\u0010\u001C\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\b\u001C\u0010\u001DJ1\u0010\"\u001A\u00020\u00102\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0006\u0010\u001F\u001A\u00020\u001E2\b\u0010!\u001A\u0004\u0018\u00010 H\u0017\u00A2\u0006\u0004\b\"\u0010#J1\u0010*\u001A\u00020\r2\f\u0010%\u001A\b\u0012\u0004\u0012\u00020\u00120$2\b\u0010\'\u001A\u0004\u0018\u00010&2\b\u0010)\u001A\u0004\u0018\u00010(H\u0016\u00A2\u0006\u0004\b*\u0010+J\u0017\u0010-\u001A\u00020\r2\u0006\u0010,\u001A\u00020\u0012H\u0016\u00A2\u0006\u0004\b-\u0010.J\u0011\u0010/\u001A\u0004\u0018\u00010 H\u0016\u00A2\u0006\u0004\b/\u00100J\u0017\u00101\u001A\u00020\r2\u0006\u0010\u0019\u001A\u00020 H\u0016\u00A2\u0006\u0004\b1\u00102R,\u00109\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\u001E\u0012\u0004\u0012\u00020\u001804038\u0000X\u0080\u0004\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u00108R \u0010=\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120$0:8@X\u0080\u0004\u00A2\u0006\u0006\u001A\u0004\b;\u0010<\u00A8\u0006A"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "", "containerId", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "Landroidx/navigation/NavigatorState;", "state", "", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/navigation/NavBackStackEntry;", "entry", "attachClearViewModel$navigation_fragment_release", "(Landroidx/fragment/app/Fragment;Landroidx/navigation/NavBackStackEntry;Landroidx/navigation/NavigatorState;)V", "attachClearViewModel", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "createDestination", "()Landroidx/navigation/fragment/FragmentNavigator$Destination;", "", "className", "Landroid/os/Bundle;", "args", "instantiateFragment", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Ljava/lang/String;Landroid/os/Bundle;)Landroidx/fragment/app/Fragment;", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "onSaveState", "()Landroid/os/Bundle;", "onRestoreState", "(Landroid/os/Bundle;)V", "", "Lkotlin/Pair;", "g", "Ljava/util/List;", "getPendingOps$navigation_fragment_release", "()Ljava/util/List;", "pendingOps", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack$navigation_fragment_release", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "ClearEntryStateViewModel", "Destination", "Extras", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n31#2:713\n63#2,2:714\n766#3:716\n857#3,2:717\n1855#3,2:719\n518#3,7:721\n533#3,6:728\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n*E\n"})
public class FragmentNavigator extends Navigator {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000B\u001A\u00020\u0006H\u0014R&\u0010\u0003\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0086.¢\u0006\u000E\n\u0000\u001A\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "completeTransition", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "", "getCompleteTransition", "()Ljava/lang/ref/WeakReference;", "setCompleteTransition", "(Ljava/lang/ref/WeakReference;)V", "onCleared", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference completeTransition;

        @NotNull
        public final WeakReference getCompleteTransition() {
            WeakReference weakReference0 = this.completeTransition;
            if(weakReference0 != null) {
                return weakReference0;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }

        @Override  // androidx.lifecycle.ViewModel
        public void onCleared() {
            super.onCleared();
            Function0 function00 = (Function0)this.getCompleteTransition().get();
            if(function00 != null) {
                function00.invoke();
            }
        }

        public final void setCompleteTransition(@NotNull WeakReference weakReference0) {
            Intrinsics.checkNotNullParameter(weakReference0, "<set-?>");
            this.completeTransition = weakReference0;
        }
    }

    @ClassType(Fragment.class)
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0017¢\u0006\u0004\b\u000E\u0010\u000FJ\u0015\u0010\u0012\u001A\u00020\u00002\u0006\u0010\u0011\u001A\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0014\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001A\u0010\u0019\u001A\u00020\u00182\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001C\u001A\u00020\u001BH\u0016¢\u0006\u0004\b\u001C\u0010\u001DR\u0011\u0010\u0011\u001A\u00020\u00108F¢\u0006\u0006\u001A\u0004\b\u001E\u0010\u0015¨\u0006\u001F"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "setClassName", "(Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$Destination;", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getClassName", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n232#2,3:713\n1#3:716\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n570#1:713,3\n*E\n"})
    public static class Destination extends NavDestination {
        public String k;

        public Destination(@NotNull Navigator navigator0) {
            Intrinsics.checkNotNullParameter(navigator0, "fragmentNavigator");
            super(navigator0);
        }

        public Destination(@NotNull NavigatorProvider navigatorProvider0) {
            Intrinsics.checkNotNullParameter(navigatorProvider0, "navigatorProvider");
            this(navigatorProvider0.getNavigator(FragmentNavigator.class));
        }

        // 去混淆评级： 低(40)
        @Override  // androidx.navigation.NavDestination
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 != null && object0 instanceof Destination && (super.equals(object0) && Intrinsics.areEqual(this.k, ((Destination)object0).k));
        }

        @NotNull
        public final String getClassName() {
            String s = this.k;
            if(s == null) {
                throw new IllegalStateException("Fragment class was not set");
            }
            Intrinsics.checkNotNull(s, "null cannot be cast to non-null type kotlin.String");
            return s;
        }

        @Override  // androidx.navigation.NavDestination
        public int hashCode() {
            int v = super.hashCode();
            return this.k == null ? v * 0x1F : v * 0x1F + this.k.hashCode();
        }

        @Override  // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
            super.onInflate(context0, attributeSet0);
            TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.FragmentNavigator);
            Intrinsics.checkNotNullExpressionValue(typedArray0, "context.resources.obtain…leable.FragmentNavigator)");
            String s = typedArray0.getString(styleable.FragmentNavigator_android_name);
            if(s != null) {
                this.setClassName(s);
            }
            typedArray0.recycle();
        }

        @NotNull
        public final Destination setClassName(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "className");
            this.k = s;
            return this;
        }

        @Override  // androidx.navigation.NavDestination
        @NotNull
        public String toString() {
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(super.toString());
            stringBuilder0.append(" class=");
            String s = this.k;
            if(s == null) {
                stringBuilder0.append("null");
            }
            else {
                stringBuilder0.append(s);
            }
            String s1 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "sb.toString()");
            return s1;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u001D\b\u0000\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001D\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028F¢\u0006\u0006\u001A\u0004\b\b\u0010\t¨\u0006\u000B"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "", "Landroid/view/View;", "", "sharedElements", "<init>", "(Ljava/util/Map;)V", "getSharedElements", "()Ljava/util/Map;", "Builder", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Extras implements androidx.navigation.Navigator.Extras {
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001A\u00020\u00002\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u001D\u0010\f\u001A\u00020\u00002\u0006\u0010\n\u001A\u00020\u00052\u0006\u0010\u000B\u001A\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "<init>", "()V", "", "Landroid/view/View;", "", "sharedElements", "addSharedElements", "(Ljava/util/Map;)Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "sharedElement", "name", "addSharedElement", "(Landroid/view/View;Ljava/lang/String;)Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "build", "()Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Builder {
            public final LinkedHashMap a;

            public Builder() {
                this.a = new LinkedHashMap();
            }

            @NotNull
            public final Builder addSharedElement(@NotNull View view0, @NotNull String s) {
                Intrinsics.checkNotNullParameter(view0, "sharedElement");
                Intrinsics.checkNotNullParameter(s, "name");
                this.a.put(view0, s);
                return this;
            }

            @NotNull
            public final Builder addSharedElements(@NotNull Map map0) {
                Intrinsics.checkNotNullParameter(map0, "sharedElements");
                for(Object object0: map0.entrySet()) {
                    this.addSharedElement(((View)((Map.Entry)object0).getKey()), ((String)((Map.Entry)object0).getValue()));
                }
                return this;
            }

            @NotNull
            public final Extras build() {
                return new Extras(this.a);
            }
        }

        public final LinkedHashMap a;

        public Extras(@NotNull Map map0) {
            Intrinsics.checkNotNullParameter(map0, "sharedElements");
            super();
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            this.a = linkedHashMap0;
            linkedHashMap0.putAll(map0);
        }

        @NotNull
        public final Map getSharedElements() {
            return x.toMap(this.a);
        }
    }

    public final Context c;
    public final FragmentManager d;
    public final int e;
    public final LinkedHashSet f;
    public final ArrayList g;
    public final t1 h;
    public final e i;

    public FragmentNavigator(@NotNull Context context0, @NotNull FragmentManager fragmentManager0, int v) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(fragmentManager0, "fragmentManager");
        super();
        this.c = context0;
        this.d = fragmentManager0;
        this.e = v;
        this.f = new LinkedHashSet();
        this.g = new ArrayList();
        this.h = new t1(this, 4);
        this.i = new e(this);
    }

    public static void a(FragmentNavigator fragmentNavigator0, String s, boolean z, int v) {
        boolean z1 = false;
        if((v & 2) != 0) {
            z = false;
        }
        if((v & 4) != 0) {
            z1 = true;
        }
        ArrayList arrayList0 = fragmentNavigator0.g;
        if(z1) {
            o.removeAll(arrayList0, new m(s, 18));
        }
        arrayList0.add(TuplesKt.to(s, Boolean.valueOf(z)));
    }

    public static final boolean access$isLoggingEnabled(FragmentNavigator fragmentNavigator0, int v) {
        fragmentNavigator0.getClass();
        return FragmentNavigator.c(v);
    }

    public final void attachClearViewModel$navigation_fragment_release(@NotNull Fragment fragment0, @NotNull NavBackStackEntry navBackStackEntry0, @NotNull NavigatorState navigatorState0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        Intrinsics.checkNotNullParameter(navigatorState0, "state");
        ViewModelStore viewModelStore0 = fragment0.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore0, "fragment.viewModelStore");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder0 = new InitializerViewModelFactoryBuilder();
        initializerViewModelFactoryBuilder0.addInitializer(Reflection.getOrCreateKotlinClass(ClearEntryStateViewModel.class), a.w);
        ((ClearEntryStateViewModel)new ViewModelProvider(viewModelStore0, initializerViewModelFactoryBuilder0.build(), Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference(new td(navBackStackEntry0, navigatorState0, this, fragment0)));
    }

    public final FragmentTransaction b(NavBackStackEntry navBackStackEntry0, NavOptions navOptions0) {
        NavDestination navDestination0 = navBackStackEntry0.getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundle0 = navBackStackEntry0.getArguments();
        String s = ((Destination)navDestination0).getClassName();
        int v = 0;
        Context context0 = this.c;
        if(s.charAt(0) == 46) {
            s = "net.daum.android.tistoryapp" + s;
        }
        Fragment fragment0 = this.d.getFragmentFactory().instantiate(context0.getClassLoader(), s);
        Intrinsics.checkNotNullExpressionValue(fragment0, "fragmentManager.fragment…t.classLoader, className)");
        fragment0.setArguments(bundle0);
        FragmentTransaction fragmentTransaction0 = this.d.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(fragmentTransaction0, "fragmentManager.beginTransaction()");
        int v1 = navOptions0 == null ? -1 : navOptions0.getEnterAnim();
        int v2 = navOptions0 == null ? -1 : navOptions0.getExitAnim();
        int v3 = navOptions0 == null ? -1 : navOptions0.getPopEnterAnim();
        int v4 = navOptions0 == null ? -1 : navOptions0.getPopExitAnim();
        if(v1 != -1 || v2 != -1 || v3 != -1 || v4 != -1) {
            if(v1 == -1) {
                v1 = 0;
            }
            if(v2 == -1) {
                v2 = 0;
            }
            if(v3 == -1) {
                v3 = 0;
            }
            if(v4 != -1) {
                v = v4;
            }
            fragmentTransaction0.setCustomAnimations(v1, v2, v3, v);
        }
        fragmentTransaction0.replace(this.e, fragment0, navBackStackEntry0.getId());
        fragmentTransaction0.setPrimaryNavigationFragment(fragment0);
        fragmentTransaction0.setReorderingAllowed(true);
        return fragmentTransaction0;
    }

    // 去混淆评级： 低(20)
    public static boolean c(int v) {
        return Log.isLoggable("FragmentManager", v) || Log.isLoggable("FragmentNavigator", v);
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @NotNull
    public Destination createDestination() {
        return new Destination(this);
    }

    @NotNull
    public final StateFlow getBackStack$navigation_fragment_release() {
        return this.getState().getBackStack();
    }

    @NotNull
    public final List getPendingOps$navigation_fragment_release() {
        return this.g;
    }

    @Deprecated(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    @NotNull
    public Fragment instantiateFragment(@NotNull Context context0, @NotNull FragmentManager fragmentManager0, @NotNull String s, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(fragmentManager0, "fragmentManager");
        Intrinsics.checkNotNullParameter(s, "className");
        Fragment fragment0 = fragmentManager0.getFragmentFactory().instantiate(context0.getClassLoader(), s);
        Intrinsics.checkNotNullExpressionValue(fragment0, "fragmentManager.fragment…t.classLoader, className)");
        return fragment0;
    }

    @Override  // androidx.navigation.Navigator
    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable androidx.navigation.Navigator.Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(list0, "entries");
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for(Object object0: list0) {
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
            boolean z = ((List)this.getState().getBackStack().getValue()).isEmpty();
            if(navOptions0 != null && !z && navOptions0.shouldRestoreState() && this.f.remove(navBackStackEntry0.getId())) {
                fragmentManager0.restoreBackStack(navBackStackEntry0.getId());
            }
            else {
                FragmentTransaction fragmentTransaction0 = this.b(navBackStackEntry0, navOptions0);
                if(!z) {
                    NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)CollectionsKt___CollectionsKt.lastOrNull(((List)this.getState().getBackStack().getValue()));
                    if(navBackStackEntry1 != null) {
                        FragmentNavigator.a(this, navBackStackEntry1.getId(), false, 6);
                    }
                    FragmentNavigator.a(this, navBackStackEntry0.getId(), false, 6);
                    fragmentTransaction0.addToBackStack(navBackStackEntry0.getId());
                }
                if(navigator$Extras0 instanceof Extras) {
                    for(Object object1: ((Extras)navigator$Extras0).getSharedElements().entrySet()) {
                        fragmentTransaction0.addSharedElement(((View)((Map.Entry)object1).getKey()), ((String)((Map.Entry)object1).getValue()));
                    }
                }
                fragmentTransaction0.commit();
                if(FragmentNavigator.c(2)) {
                    Log.v("FragmentNavigator", "Calling pushWithTransition via navigate() on entry " + navBackStackEntry0);
                }
            }
            this.getState().pushWithTransition(navBackStackEntry0);
        }
    }

    @Override  // androidx.navigation.Navigator
    public void onAttach(@NotNull NavigatorState navigatorState0) {
        Intrinsics.checkNotNullParameter(navigatorState0, "state");
        super.onAttach(navigatorState0);
        if(FragmentNavigator.c(2)) {
            Log.v("FragmentNavigator", "onAttach");
        }
        c c0 = new c(navigatorState0, this);
        this.d.addFragmentOnAttachListener(c0);
        androidx.navigation.fragment.FragmentNavigator.onAttach.2 fragmentNavigator$onAttach$20 = new OnBackStackChangedListener() {
            public final NavigatorState a;
            public final FragmentNavigator b;

            {
                NavigatorState navigatorState0 = this;  // 捕获的参数 （可能与外部方法变量命名冲突；考虑手动重命名）
                this.a = navigatorState0;
                this.b = fragmentNavigator0;
            }

            @Override  // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
            public void onBackStackChangeCommitted(@NotNull Fragment fragment0, boolean z) {
                Object object1;
                Object object0 = null;
                Intrinsics.checkNotNullParameter(fragment0, "fragment");
                NavigatorState navigatorState0 = this.a;
                List list0 = CollectionsKt___CollectionsKt.plus(((Collection)navigatorState0.getBackStack().getValue()), ((Iterable)navigatorState0.getTransitionsInProgress().getValue()));
                ListIterator listIterator0 = list0.listIterator(list0.size());
                while(true) {
                    object1 = null;
                    if(!listIterator0.hasPrevious()) {
                        break;
                    }
                    Object object2 = listIterator0.previous();
                    if(Intrinsics.areEqual(((NavBackStackEntry)object2).getId(), fragment0.getTag())) {
                        object0 = object2;
                        break;
                    }
                }
                boolean z1 = true;
                FragmentNavigator fragmentNavigator0 = this.b;
                boolean z2 = z && fragmentNavigator0.getPendingOps$navigation_fragment_release().isEmpty() && fragment0.isRemoving();
                for(Object object3: fragmentNavigator0.getPendingOps$navigation_fragment_release()) {
                    if(Intrinsics.areEqual(((Pair)object3).getFirst(), fragment0.getTag())) {
                        object1 = object3;
                        break;
                    }
                    if(false) {
                        break;
                    }
                }
                if(((Pair)object1) != null) {
                    fragmentNavigator0.getPendingOps$navigation_fragment_release().remove(((Pair)object1));
                }
                if(!z2 && FragmentNavigator.access$isLoggingEnabled(fragmentNavigator0, 2)) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment0 + " associated with entry " + ((NavBackStackEntry)object0));
                }
                if(((Pair)object1) == null || !((Boolean)((Pair)object1).getSecond()).booleanValue()) {
                    z1 = false;
                }
                if(!z && !z1 && ((NavBackStackEntry)object0) == null) {
                    throw new IllegalArgumentException(("The fragment " + fragment0 + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
                }
                if(((NavBackStackEntry)object0) != null) {
                    fragmentNavigator0.attachClearViewModel$navigation_fragment_release(fragment0, ((NavBackStackEntry)object0), navigatorState0);
                    if(z2) {
                        if(FragmentNavigator.access$isLoggingEnabled(fragmentNavigator0, 2)) {
                            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment0 + " popping associated entry " + ((NavBackStackEntry)object0) + " via system back");
                        }
                        navigatorState0.popWithTransition(((NavBackStackEntry)object0), false);
                    }
                }
            }

            @Override  // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
            public void onBackStackChangeStarted(@NotNull Fragment fragment0, boolean z) {
                Intrinsics.checkNotNullParameter(fragment0, "fragment");
                if(z) {
                    Object object0 = null;
                    NavigatorState navigatorState0 = this.a;
                    List list0 = (List)navigatorState0.getBackStack().getValue();
                    ListIterator listIterator0 = list0.listIterator(list0.size());
                    while(listIterator0.hasPrevious()) {
                        Object object1 = listIterator0.previous();
                        if(Intrinsics.areEqual(((NavBackStackEntry)object1).getId(), fragment0.getTag())) {
                            object0 = object1;
                            break;
                        }
                    }
                    if(FragmentNavigator.access$isLoggingEnabled(this.b, 2)) {
                        Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment0 + " associated with entry " + ((NavBackStackEntry)object0));
                    }
                    if(((NavBackStackEntry)object0) != null) {
                        navigatorState0.prepareForTransition(((NavBackStackEntry)object0));
                    }
                }
            }

            @Override  // androidx.fragment.app.FragmentManager$OnBackStackChangedListener
            public void onBackStackChanged() {
            }
        };
        this.d.addOnBackStackChangedListener(fragmentNavigator$onAttach$20);
    }

    @Override  // androidx.navigation.Navigator
    public void onLaunchSingleTop(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction fragmentTransaction0 = this.b(navBackStackEntry0, null);
        List list0 = (List)this.getState().getBackStack().getValue();
        if(list0.size() > 1) {
            NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)CollectionsKt___CollectionsKt.getOrNull(list0, CollectionsKt__CollectionsKt.getLastIndex(list0) - 1);
            if(navBackStackEntry1 != null) {
                FragmentNavigator.a(this, navBackStackEntry1.getId(), false, 6);
            }
            FragmentNavigator.a(this, navBackStackEntry0.getId(), true, 4);
            fragmentManager0.popBackStack(navBackStackEntry0.getId(), 1);
            FragmentNavigator.a(this, navBackStackEntry0.getId(), false, 2);
            fragmentTransaction0.addToBackStack(navBackStackEntry0.getId());
        }
        fragmentTransaction0.commit();
        this.getState().onLaunchSingleTop(navBackStackEntry0);
    }

    @Override  // androidx.navigation.Navigator
    public void onRestoreState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "savedState");
        ArrayList arrayList0 = bundle0.getStringArrayList("androidx-nav-fragment:navigator:savedIds");
        if(arrayList0 != null) {
            this.f.clear();
            o.addAll(this.f, arrayList0);
        }
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.navigation.Navigator
    @Nullable
    public Bundle onSaveState() {
        return this.f.isEmpty() ? null : BundleKt.bundleOf(new Pair[]{TuplesKt.to("androidx-nav-fragment:navigator:savedIds", new ArrayList(this.f))});
    }

    @Override  // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0.isStateSaved()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list0 = (List)this.getState().getBackStack().getValue();
        int v = list0.indexOf(navBackStackEntry0);
        List list1 = list0.subList(v, list0.size());
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)CollectionsKt___CollectionsKt.first(list0);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry)CollectionsKt___CollectionsKt.getOrNull(list0, v - 1);
        if(navBackStackEntry2 != null) {
            FragmentNavigator.a(this, navBackStackEntry2.getId(), false, 6);
        }
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: list1) {
            if(SequencesKt___SequencesKt.contains(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(this.g), f.w), ((NavBackStackEntry)object0).getId()) || !Intrinsics.areEqual(((NavBackStackEntry)object0).getId(), navBackStackEntry1.getId())) {
                arrayList0.add(object0);
            }
        }
        for(Object object1: arrayList0) {
            FragmentNavigator.a(this, ((NavBackStackEntry)object1).getId(), true, 4);
        }
        if(z) {
            for(Object object2: CollectionsKt___CollectionsKt.reversed(list1)) {
                NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry)object2;
                if(Intrinsics.areEqual(navBackStackEntry3, navBackStackEntry1)) {
                    Log.i("FragmentNavigator", "FragmentManager cannot save the state of the initial destination " + navBackStackEntry3);
                }
                else {
                    fragmentManager0.saveBackStack(navBackStackEntry3.getId());
                    this.f.add(navBackStackEntry3.getId());
                }
            }
        }
        else {
            fragmentManager0.popBackStack(navBackStackEntry0.getId(), 1);
        }
        if(FragmentNavigator.c(2)) {
            Log.v("FragmentNavigator", "Calling popWithTransition via popBackStack() on entry " + navBackStackEntry0 + " with savedState " + z);
        }
        this.getState().popWithTransition(navBackStackEntry0, z);
    }
}

