package androidx.navigation;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.SequencesKt___SequencesKt;
import n4.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0011\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002-.B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001A\u00020\b2\u0006\u0010\u0007\u001A\u00020\u0006H\u0017¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00028\u0000H&¢\u0006\u0004\b\u000B\u0010\fJ1\u0010\u0014\u001A\u00020\b2\f\u0010\u000F\u001A\b\u0012\u0004\u0012\u00020\u000E0\r2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001A\u00020\b2\u0006\u0010\u0016\u001A\u00020\u000EH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u0014\u001A\u0004\u0018\u00010\u00012\u0006\u0010\u0019\u001A\u00028\u00002\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A2\b\u0010\u0011\u001A\u0004\u0018\u00010\u00102\b\u0010\u0013\u001A\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u001CJ\u001F\u0010 \u001A\u00020\b2\u0006\u0010\u001D\u001A\u00020\u000E2\u0006\u0010\u001F\u001A\u00020\u001EH\u0016¢\u0006\u0004\b \u0010!J\u000F\u0010 \u001A\u00020\u001EH\u0016¢\u0006\u0004\b \u0010\"J\u0011\u0010#\u001A\u0004\u0018\u00010\u001AH\u0016¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001A\u00020\b2\u0006\u0010\u001F\u001A\u00020\u001AH\u0016¢\u0006\u0004\b%\u0010&R$\u0010*\u001A\u00020\u001E2\u0006\u0010\'\u001A\u00020\u001E8\u0006@BX\u0086\u000E¢\u0006\f\n\u0004\b(\u0010)\u001A\u0004\b*\u0010\"R\u0014\u0010\u0007\u001A\u00020\u00068DX\u0084\u0004¢\u0006\u0006\u001A\u0004\b+\u0010,¨\u0006/"}, d2 = {"Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "D", "", "<init>", "()V", "Landroidx/navigation/NavigatorState;", "state", "", "onAttach", "(Landroidx/navigation/NavigatorState;)V", "createDestination", "()Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/NavBackStackEntry;", "entries", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "navigate", "(Ljava/util/List;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)V", "backStackEntry", "onLaunchSingleTop", "(Landroidx/navigation/NavBackStackEntry;)V", "destination", "Landroid/os/Bundle;", "args", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "popUpTo", "", "savedState", "popBackStack", "(Landroidx/navigation/NavBackStackEntry;Z)V", "()Z", "onSaveState", "()Landroid/os/Bundle;", "onRestoreState", "(Landroid/os/Bundle;)V", "<set-?>", "b", "Z", "isAttached", "getState", "()Landroidx/navigation/NavigatorState;", "Extras", "Name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,242:1\n1313#2,2:243\n*S KotlinDebug\n*F\n+ 1 Navigator.kt\nandroidx/navigation/Navigator\n*L\n136#1:243,2\n*E\n"})
public abstract class Navigator {
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Extras {
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001A\u00020\u0003R\u000F\u0010\u0002\u001A\u00020\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", "value", "", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.RUNTIME)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    public @interface Name {
        String value();
    }

    public NavigatorState a;
    public boolean b;

    @NotNull
    public abstract NavDestination createDestination();

    @NotNull
    public final NavigatorState getState() {
        NavigatorState navigatorState0 = this.a;
        if(navigatorState0 == null) {
            throw new IllegalStateException("You cannot access the Navigator\'s state until the Navigator is attached");
        }
        return navigatorState0;
    }

    public final boolean isAttached() {
        return this.b;
    }

    @Nullable
    public NavDestination navigate(@NotNull NavDestination navDestination0, @Nullable Bundle bundle0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        return navDestination0;
    }

    public void navigate(@NotNull List list0, @Nullable NavOptions navOptions0, @Nullable Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(list0, "entries");
        for(Object object0: SequencesKt___SequencesKt.filterNotNull(SequencesKt___SequencesKt.map(CollectionsKt___CollectionsKt.asSequence(list0), new h(this, navOptions0, navigator$Extras0)))) {
            this.getState().push(((NavBackStackEntry)object0));
        }
    }

    @CallSuper
    public void onAttach(@NotNull NavigatorState navigatorState0) {
        Intrinsics.checkNotNullParameter(navigatorState0, "state");
        this.a = navigatorState0;
        this.b = true;
    }

    public void onLaunchSingleTop(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "backStackEntry");
        NavDestination navDestination0 = navBackStackEntry0.getDestination();
        if(navDestination0 == null) {
            navDestination0 = null;
        }
        if(navDestination0 == null) {
            return;
        }
        this.navigate(navDestination0, null, NavOptionsBuilderKt.navOptions(a.K), null);
        this.getState().onLaunchSingleTop(navBackStackEntry0);
    }

    public void onRestoreState(@NotNull Bundle bundle0) {
        Intrinsics.checkNotNullParameter(bundle0, "savedState");
    }

    @Nullable
    public Bundle onSaveState() {
        return null;
    }

    public void popBackStack(@NotNull NavBackStackEntry navBackStackEntry0, boolean z) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "popUpTo");
        List list0 = (List)this.getState().getBackStack().getValue();
        if(!list0.contains(navBackStackEntry0)) {
            throw new IllegalStateException(("popBackStack was called with " + navBackStackEntry0 + " which does not exist in back stack " + list0).toString());
        }
        ListIterator listIterator0 = list0.listIterator(list0.size());
        NavBackStackEntry navBackStackEntry1 = null;
        while(this.popBackStack()) {
            navBackStackEntry1 = (NavBackStackEntry)listIterator0.previous();
            if(Intrinsics.areEqual(navBackStackEntry1, navBackStackEntry0)) {
                break;
            }
        }
        if(navBackStackEntry1 != null) {
            this.getState().pop(navBackStackEntry1, z);
        }
    }

    public boolean popBackStack() {
        return true;
    }
}

