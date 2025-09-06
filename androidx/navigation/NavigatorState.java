package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ!\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n2\b\u0010\r\u001A\u0004\u0018\u00010\fH&¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001F\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0010\u001A\u00020\u00042\u0006\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J\u0017\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0017¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004H\u0017¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u0019\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\bJ\u0017\u0010\u001A\u001A\u00020\u00062\u0006\u0010\u0018\u001A\u00020\u0004H\u0017¢\u0006\u0004\b\u001A\u0010\bR*\u0010\u001E\u001A\u00020\u00112\u0006\u0010\u001B\u001A\u00020\u00118G@GX\u0086\u000E¢\u0006\u0012\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\"\u0004\b \u0010!R#\u0010(\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040#0\"8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001A\u0004\b&\u0010\'R#\u0010,\u001A\u000E\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040)0\"8\u0006¢\u0006\f\n\u0004\b*\u0010%\u001A\u0004\b+\u0010\'¨\u0006-"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "<init>", "()V", "Landroidx/navigation/NavBackStackEntry;", "backStackEntry", "", "push", "(Landroidx/navigation/NavBackStackEntry;)V", "pushWithTransition", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "arguments", "createBackStackEntry", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;)Landroidx/navigation/NavBackStackEntry;", "popUpTo", "", "saveState", "pop", "(Landroidx/navigation/NavBackStackEntry;Z)V", "popWithTransition", "onLaunchSingleTop", "onLaunchSingleTopWithTransition", "entry", "markTransitionComplete", "prepareForTransition", "<set-?>", "d", "Z", "isNavigating", "()Z", "setNavigating", "(Z)V", "Lkotlinx/coroutines/flow/StateFlow;", "", "e", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "backStack", "", "f", "getTransitionsInProgress", "transitionsInProgress", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigatorState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,217:1\n1#2:218\n1747#3,3:219\n1747#3,3:222\n959#3,7:225\n1747#3,3:232\n2624#3,3:235\n533#3,6:238\n378#3,7:244\n451#3,6:251\n*S KotlinDebug\n*F\n+ 1 NavigatorState.kt\nandroidx/navigation/NavigatorState\n*L\n76#1:219,3\n77#1:222,3\n102#1:225,7\n123#1:232,3\n124#1:235,3\n130#1:238,6\n158#1:244,7\n181#1:251,6\n*E\n"})
public abstract class NavigatorState {
    public final ReentrantLock a;
    public final MutableStateFlow b;
    public final MutableStateFlow c;
    public boolean d;
    public final StateFlow e;
    public final StateFlow f;

    public NavigatorState() {
        this.a = new ReentrantLock(true);
        MutableStateFlow mutableStateFlow0 = StateFlowKt.MutableStateFlow(CollectionsKt__CollectionsKt.emptyList());
        this.b = mutableStateFlow0;
        MutableStateFlow mutableStateFlow1 = StateFlowKt.MutableStateFlow(f0.emptySet());
        this.c = mutableStateFlow1;
        this.e = FlowKt.asStateFlow(mutableStateFlow0);
        this.f = FlowKt.asStateFlow(mutableStateFlow1);
    }

    @NotNull
    public abstract NavBackStackEntry createBackStackEntry(@NotNull NavDestination arg1, @Nullable Bundle arg2);

    @NotNull
    public final StateFlow getBackStack() {
        return this.e;
    }

    @NotNull
    public final StateFlow getTransitionsInProgress() {
        return this.f;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean isNavigating() {
        return this.d;
    }

    public void markTransitionComplete(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        Set set0 = g0.minus(((Set)this.c.getValue()), navBackStackEntry0);
        this.c.setValue(set0);
    }

    @CallSuper
    public void onLaunchSingleTop(@NotNull NavBackStackEntry navBackStackEntry0) {
        int v = -1;
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        ReentrantLock reentrantLock0 = this.a;
        reentrantLock0.lock();
        try {
            List list0 = CollectionsKt___CollectionsKt.toMutableList(((Collection)this.e.getValue()));
            ListIterator listIterator0 = list0.listIterator(list0.size());
            while(listIterator0.hasPrevious()) {
                if(Intrinsics.areEqual(((NavBackStackEntry)listIterator0.previous()).getId(), navBackStackEntry0.getId())) {
                    v = listIterator0.nextIndex();
                    break;
                }
            }
            list0.set(v, navBackStackEntry0);
            this.b.setValue(list0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    @CallSuper
    public void onLaunchSingleTopWithTransition(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        List list0 = (List)this.e.getValue();
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)listIterator0.previous();
            if(Intrinsics.areEqual(navBackStackEntry1.getId(), navBackStackEntry0.getId())) {
                Set set0 = g0.plus(g0.plus(((Set)this.c.getValue()), navBackStackEntry1), navBackStackEntry0);
                this.c.setValue(set0);
                this.onLaunchSingleTop(navBackStackEntry0);
                return;
            }
            if(false) {
                break;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void pop(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        ReentrantLock reentrantLock0 = this.a;
        reentrantLock0.lock();
        try {
            MutableStateFlow mutableStateFlow0 = this.b;
            Iterable iterable0 = (Iterable)mutableStateFlow0.getValue();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: iterable0) {
                if(Intrinsics.areEqual(((NavBackStackEntry)object0), navBackStackEntry0)) {
                    break;
                }
                arrayList0.add(object0);
            }
            mutableStateFlow0.setValue(arrayList0);
        }
        finally {
            reentrantLock0.unlock();
        }
    }

    public void popWithTransition(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        MutableStateFlow mutableStateFlow0 = this.c;
        Iterable iterable0 = (Iterable)mutableStateFlow0.getValue();
        StateFlow stateFlow0 = this.e;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
        alab1:
            for(Object object0: iterable0) {
                if(((NavBackStackEntry)object0) == navBackStackEntry0) {
                    Iterable iterable1 = (Iterable)stateFlow0.getValue();
                    if(!(iterable1 instanceof Collection) || !((Collection)iterable1).isEmpty()) {
                        for(Object object1: iterable1) {
                            if(((NavBackStackEntry)object1) != navBackStackEntry0) {
                                continue;
                            }
                            break alab1;
                        }
                    }
                    return;
                }
                if(false) {
                    break;
                }
            }
        }
        Object object2 = null;
        mutableStateFlow0.setValue(g0.plus(((Set)mutableStateFlow0.getValue()), navBackStackEntry0));
        List list0 = (List)stateFlow0.getValue();
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            Object object3 = listIterator0.previous();
            if(!Intrinsics.areEqual(((NavBackStackEntry)object3), navBackStackEntry0) && ((List)stateFlow0.getValue()).lastIndexOf(((NavBackStackEntry)object3)) < ((List)stateFlow0.getValue()).lastIndexOf(navBackStackEntry0)) {
                object2 = object3;
                break;
            }
        }
        if(((NavBackStackEntry)object2) != null) {
            mutableStateFlow0.setValue(g0.plus(((Set)mutableStateFlow0.getValue()), ((NavBackStackEntry)object2)));
        }
        this.pop(navBackStackEntry0, z);
    }

    @CallSuper
    public void prepareForTransition(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        Set set0 = g0.plus(((Set)this.c.getValue()), navBackStackEntry0);
        this.c.setValue(set0);
    }

    public void push(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        this.a.lock();
        try {
            List list0 = CollectionsKt___CollectionsKt.plus(((Collection)this.b.getValue()), navBackStackEntry0);
            this.b.setValue(list0);
        }
        finally {
            this.a.unlock();
        }
    }

    public void pushWithTransition(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        MutableStateFlow mutableStateFlow0 = this.c;
        Iterable iterable0 = (Iterable)mutableStateFlow0.getValue();
        StateFlow stateFlow0 = this.e;
        if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
        alab1:
            for(Object object0: iterable0) {
                if(((NavBackStackEntry)object0) == navBackStackEntry0) {
                    Iterable iterable1 = (Iterable)stateFlow0.getValue();
                    if(iterable1 instanceof Collection && ((Collection)iterable1).isEmpty()) {
                        break;
                    }
                    Iterator iterator1 = iterable1.iterator();
                    while(true) {
                        if(!iterator1.hasNext()) {
                            break alab1;
                        }
                        Object object1 = iterator1.next();
                        if(((NavBackStackEntry)object1) != navBackStackEntry0) {
                            continue;
                        }
                        return;
                    }
                }
                if(false) {
                    break;
                }
            }
        }
        NavBackStackEntry navBackStackEntry1 = (NavBackStackEntry)CollectionsKt___CollectionsKt.lastOrNull(((List)stateFlow0.getValue()));
        if(navBackStackEntry1 != null) {
            mutableStateFlow0.setValue(g0.plus(((Set)mutableStateFlow0.getValue()), navBackStackEntry1));
        }
        mutableStateFlow0.setValue(g0.plus(((Set)mutableStateFlow0.getValue()), navBackStackEntry0));
        this.push(navBackStackEntry0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setNavigating(boolean z) {
        this.d = z;
    }
}

