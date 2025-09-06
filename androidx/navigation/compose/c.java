package androidx.navigation.compose;

import aa.r;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.navigation.NavBackStackEntry;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

public final class c extends Lambda implements Function2 {
    public final Destination A;
    public final NavBackStackEntry w;
    public final DialogNavigator x;
    public final SaveableStateHolder y;
    public final SnapshotStateList z;

    public c(NavBackStackEntry navBackStackEntry0, DialogNavigator dialogNavigator0, SaveableStateHolder saveableStateHolder0, SnapshotStateList snapshotStateList0, Destination dialogNavigator$Destination0) {
        this.w = navBackStackEntry0;
        this.x = dialogNavigator0;
        this.y = saveableStateHolder0;
        this.z = snapshotStateList0;
        this.A = dialogNavigator$Destination0;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        int v = ((Number)object1).intValue();
        if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
            ((Composer)object0).skipToGroupEnd();
            return Unit.INSTANCE;
        }
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(0x43541EBC, v, -1, "androidx.navigation.compose.DialogHost.<anonymous>.<anonymous> (DialogHost.kt:55)");
        }
        NavBackStackEntry navBackStackEntry0 = this.w;
        boolean z = ((Composer)object0).changedInstance(navBackStackEntry0);
        DialogNavigator dialogNavigator0 = this.x;
        boolean z1 = ((Composer)object0).changed(dialogNavigator0);
        r r0 = ((Composer)object0).rememberedValue();
        if(z || z1 || r0 == Composer.Companion.getEmpty()) {
            r0 = new r(this.z, navBackStackEntry0, 15, dialogNavigator0);
            ((Composer)object0).updateRememberedValue(r0);
        }
        EffectsKt.DisposableEffect(navBackStackEntry0, r0, ((Composer)object0), 0);
        ComposableLambda composableLambda0 = ComposableLambdaKt.rememberComposableLambda(0xE256C04C, true, new b(this.A, navBackStackEntry0), ((Composer)object0), 54);
        NavBackStackEntryProviderKt.LocalOwnersProvider(navBackStackEntry0, this.y, composableLambda0, ((Composer)object0), 0x180);
        if(ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return Unit.INSTANCE;
    }
}

