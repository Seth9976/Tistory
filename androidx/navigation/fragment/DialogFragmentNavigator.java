package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle.Event;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination.ClassType;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator.Extras;
import androidx.navigation.Navigator.Name;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p4.b;

@Name("dialog")
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%B\u0017\u0012\u0006\u0010\u0004\u001A\u00020\u0003\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001A\u00020\r2\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\t0\u00122\b\u0010\u0015\u001A\u0004\u0018\u00010\u00142\b\u0010\u0017\u001A\u0004\u0018\u00010\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001B\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\tH\u0016¢\u0006\u0004\b\u001B\u0010\u001CJ\u0017\u0010\u001F\u001A\u00020\r2\u0006\u0010\u001E\u001A\u00020\u001DH\u0016¢\u0006\u0004\b\u001F\u0010 R \u0010$\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00120!8@X\u0080\u0004¢\u0006\u0006\u001A\u0004\b\"\u0010#¨\u0006&"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroid/content/Context;", "context", "Landroidx/fragment/app/FragmentManager;", "fragmentManager", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;)V", "Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "savedState", "", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "createDestination", "()Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroidx/navigation/NavigatorState;", "state", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack$navigation_fragment_release", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "Destination", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class DialogFragmentNavigator extends Navigator {
    @ClassType(DialogFragment.class)
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\b\u001A\u00020\u0007¢\u0006\u0004\b\u0005\u0010\tJ\u001F\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u000B\u001A\u00020\n2\u0006\u0010\r\u001A\u00020\fH\u0017¢\u0006\u0004\b\u000F\u0010\u0010J\u0015\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0018\u001A\u00020\u00172\b\u0010\u0016\u001A\u0004\u0018\u00010\u0015H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000F\u0010\u001B\u001A\u00020\u001AH\u0016¢\u0006\u0004\b\u001B\u0010\u001CR\u0011\u0010\u0012\u001A\u00020\u00118F¢\u0006\u0006\u001A\u0004\b\u001D\u0010\u001E¨\u0006\u001F"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/FloatingWindow;", "Landroidx/navigation/Navigator;", "fragmentNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "className", "setClassName", "(Ljava/lang/String;)Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "getClassName", "()Ljava/lang/String;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nDialogFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,319:1\n1#2:320\n232#3,3:321\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigator.kt\nandroidx/navigation/fragment/DialogFragmentNavigator$Destination\n*L\n283#1:321,3\n*E\n"})
    public static class Destination extends NavDestination implements FloatingWindow {
        public String k;

        public Destination(@NotNull Navigator navigator0) {
            Intrinsics.checkNotNullParameter(navigator0, "fragmentNavigator");
            super(navigator0);
        }

        public Destination(@NotNull NavigatorProvider navigatorProvider0) {
            Intrinsics.checkNotNullParameter(navigatorProvider0, "navigatorProvider");
            this(navigatorProvider0.getNavigator(DialogFragmentNavigator.class));
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
                throw new IllegalStateException("DialogFragment class was not set");
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
            TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.DialogFragmentNavigator);
            Intrinsics.checkNotNullExpressionValue(typedArray0, "context.resources.obtain….DialogFragmentNavigator)");
            String s = typedArray0.getString(styleable.DialogFragmentNavigator_android_name);
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
    }

    public final Context c;
    public final FragmentManager d;
    public final LinkedHashSet e;
    public final androidx.navigation.fragment.DialogFragmentNavigator.observer.1 f;
    public final LinkedHashMap g;

    public DialogFragmentNavigator(@NotNull Context context0, @NotNull FragmentManager fragmentManager0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(fragmentManager0, "fragmentManager");
        super();
        this.c = context0;
        this.d = fragmentManager0;
        this.e = new LinkedHashSet();
        this.f = new LifecycleEventObserver() {
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
            public final class WhenMappings {
                public static final int[] $EnumSwitchMapping$0;

                static {
                    int[] arr_v = new int[Event.values().length];
                    try {
                        arr_v[Event.ON_CREATE.ordinal()] = 1;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_RESUME.ordinal()] = 2;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_STOP.ordinal()] = 3;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    try {
                        arr_v[Event.ON_DESTROY.ordinal()] = 4;
                    }
                    catch(NoSuchFieldError unused_ex) {
                    }
                    WhenMappings.$EnumSwitchMapping$0 = arr_v;
                }
            }

            public final DialogFragmentNavigator a;

            {
                this.a = dialogFragmentNavigator0;
            }

            @Override  // androidx.lifecycle.LifecycleEventObserver
            public void onStateChanged(@NotNull LifecycleOwner lifecycleOwner0, @NotNull Event lifecycle$Event0) {
                Object object0 = null;
                Intrinsics.checkNotNullParameter(lifecycleOwner0, "source");
                Intrinsics.checkNotNullParameter(lifecycle$Event0, "event");
                int v = WhenMappings.$EnumSwitchMapping$0[lifecycle$Event0.ordinal()];
                DialogFragmentNavigator dialogFragmentNavigator0 = this.a;
                if(v == 1) {
                    Iterable iterable0 = (Iterable)dialogFragmentNavigator0.getState().getBackStack().getValue();
                    if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                        for(Object object3: iterable0) {
                            if(Intrinsics.areEqual(((NavBackStackEntry)object3).getId(), ((DialogFragment)lifecycleOwner0).getTag())) {
                                return;
                            }
                            if(false) {
                                break;
                            }
                        }
                    }
                    ((DialogFragment)lifecycleOwner0).dismiss();
                }
                else {
                    switch(v) {
                        case 2: {
                            for(Object object2: ((Iterable)dialogFragmentNavigator0.getState().getTransitionsInProgress().getValue())) {
                                if(Intrinsics.areEqual(((NavBackStackEntry)object2).getId(), ((DialogFragment)lifecycleOwner0).getTag())) {
                                    object0 = object2;
                                }
                            }
                            if(((NavBackStackEntry)object0) != null) {
                                dialogFragmentNavigator0.getState().markTransitionComplete(((NavBackStackEntry)object0));
                                return;
                            }
                            break;
                        }
                        case 3: {
                            if(!((DialogFragment)lifecycleOwner0).requireDialog().isShowing()) {
                                int v1 = -1;
                                List list0 = (List)dialogFragmentNavigator0.getState().getBackStack().getValue();
                                ListIterator listIterator0 = list0.listIterator(list0.size());
                                while(listIterator0.hasPrevious()) {
                                    if(Intrinsics.areEqual(((NavBackStackEntry)listIterator0.previous()).getId(), ((DialogFragment)lifecycleOwner0).getTag())) {
                                        v1 = listIterator0.nextIndex();
                                        break;
                                    }
                                }
                                NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)CollectionsKt___CollectionsKt.getOrNull(list0, v1);
                                if(!Intrinsics.areEqual(CollectionsKt___CollectionsKt.lastOrNull(list0), navBackStackEntry0)) {
                                    Log.i("DialogFragmentNavigator", "Dialog " + ((DialogFragment)lifecycleOwner0) + " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog");
                                }
                                if(navBackStackEntry0 != null) {
                                    dialogFragmentNavigator0.b(v1, navBackStackEntry0, false);
                                    return;
                                }
                            }
                            break;
                        }
                        case 4: {
                            for(Object object1: ((Iterable)dialogFragmentNavigator0.getState().getTransitionsInProgress().getValue())) {
                                if(Intrinsics.areEqual(((NavBackStackEntry)object1).getId(), ((DialogFragment)lifecycleOwner0).getTag())) {
                                    object0 = object1;
                                }
                            }
                            if(((NavBackStackEntry)object0) != null) {
                                dialogFragmentNavigator0.getState().markTransitionComplete(((NavBackStackEntry)object0));
                            }
                            ((DialogFragment)lifecycleOwner0).getLifecycle().removeObserver(this);
                        }
                    }
                }
            }
        };
        this.g = new LinkedHashMap();
    }

    public final DialogFragment a(NavBackStackEntry navBackStackEntry0) {
        NavDestination navDestination0 = navBackStackEntry0.getDestination();
        Intrinsics.checkNotNull(navDestination0, "null cannot be cast to non-null type androidx.navigation.fragment.DialogFragmentNavigator.Destination");
        String s = ((Destination)navDestination0).getClassName();
        Context context0 = this.c;
        if(s.charAt(0) == 46) {
            s = "net.daum.android.tistoryapp" + s;
        }
        Fragment fragment0 = this.d.getFragmentFactory().instantiate(context0.getClassLoader(), s);
        Intrinsics.checkNotNullExpressionValue(fragment0, "fragmentManager.fragment…t.classLoader, className)");
        Class class0 = fragment0.getClass();
        if(!DialogFragment.class.isAssignableFrom(class0)) {
            throw new IllegalArgumentException(("Dialog destination " + ((Destination)navDestination0).getClassName() + " is not an instance of DialogFragment").toString());
        }
        ((DialogFragment)fragment0).setArguments(navBackStackEntry0.getArguments());
        ((DialogFragment)fragment0).getLifecycle().addObserver(this.f);
        this.g.put(navBackStackEntry0.getId(), ((DialogFragment)fragment0));
        return (DialogFragment)fragment0;
    }

    public final void b(int v, NavBackStackEntry navBackStackEntry0, boolean z) {
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)CollectionsKt___CollectionsKt.getOrNull(((List)this.getState().getBackStack().getValue()), v - 1);
        boolean z1 = CollectionsKt___CollectionsKt.contains(((Iterable)this.getState().getTransitionsInProgress().getValue()), navBackStackEntry1);
        this.getState().popWithTransition(navBackStackEntry0, z);
        if(navBackStackEntry1 != null && !z1) {
            this.getState().markTransitionComplete(navBackStackEntry1);
        }
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

    @Override  // androidx.navigation.Navigator
    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(list0, "entries");
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for(Object object0: list0) {
            this.a(((NavBackStackEntry)object0)).show(fragmentManager0, ((NavBackStackEntry)object0).getId());
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)CollectionsKt___CollectionsKt.lastOrNull(((List)this.getState().getBackStack().getValue()));
            boolean z = CollectionsKt___CollectionsKt.contains(((Iterable)this.getState().getTransitionsInProgress().getValue()), navBackStackEntry0);
            this.getState().pushWithTransition(((NavBackStackEntry)object0));
            if(navBackStackEntry0 != null && !z) {
                this.getState().markTransitionComplete(navBackStackEntry0);
            }
        }
    }

    @Override  // androidx.navigation.Navigator
    public void onAttach(@NotNull NavigatorState navigatorState0) {
        FragmentManager fragmentManager0;
        Intrinsics.checkNotNullParameter(navigatorState0, "state");
        super.onAttach(navigatorState0);
        Iterator iterator0 = ((List)navigatorState0.getBackStack().getValue()).iterator();
        while(true) {
            boolean z = iterator0.hasNext();
            fragmentManager0 = this.d;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            NavBackStackEntry navBackStackEntry0 = (NavBackStackEntry)object0;
            DialogFragment dialogFragment0 = (DialogFragment)fragmentManager0.findFragmentByTag(navBackStackEntry0.getId());
            if(dialogFragment0 != null) {
                Lifecycle lifecycle0 = dialogFragment0.getLifecycle();
                if(lifecycle0 != null) {
                    lifecycle0.addObserver(this.f);
                    continue;
                }
            }
            this.e.add(navBackStackEntry0.getId());
        }
        fragmentManager0.addFragmentOnAttachListener(new b(this));
    }

    @Override  // androidx.navigation.Navigator
    public void onLaunchSingleTop(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        DialogFragment dialogFragment0 = (DialogFragment)this.g.get(navBackStackEntry0.getId());
        if(dialogFragment0 == null) {
            Fragment fragment0 = fragmentManager0.findFragmentByTag(navBackStackEntry0.getId());
            dialogFragment0 = fragment0 instanceof DialogFragment ? ((DialogFragment)fragment0) : null;
        }
        if(dialogFragment0 != null) {
            dialogFragment0.getLifecycle().removeObserver(this.f);
            dialogFragment0.dismiss();
        }
        this.a(navBackStackEntry0).show(fragmentManager0, navBackStackEntry0.getId());
        this.getState().onLaunchSingleTopWithTransition(navBackStackEntry0);
    }

    @Override  // androidx.navigation.Navigator
    public void popBackStack(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        FragmentManager fragmentManager0 = this.d;
        if(fragmentManager0.isStateSaved()) {
            Log.i("DialogFragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List list0 = (List)this.getState().getBackStack().getValue();
        int v = list0.indexOf(navBackStackEntry0);
        for(Object object0: CollectionsKt___CollectionsKt.reversed(list0.subList(v, list0.size()))) {
            Fragment fragment0 = fragmentManager0.findFragmentByTag(((NavBackStackEntry)object0).getId());
            if(fragment0 != null) {
                ((DialogFragment)fragment0).dismiss();
            }
        }
        this.b(v, navBackStackEntry0, z);
    }
}

