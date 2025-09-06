package androidx.activity.compose;

import aa.r;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.OnBackPressedDispatcherOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.LifecycleOwner;
import j.b;
import j.c;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A%\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0007¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\u0010\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00010\u0005X\u008A\u0084\u0002"}, d2 = {"BackHandler", "", "enabled", "", "onBack", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "activity-compose_release", "currentOnBack"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nBackHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt\n*L\n1#1,110:1\n955#2,6:111\n955#2,6:117\n955#2,6:124\n76#3:123\n89#4:130\n*S KotlinDebug\n*F\n+ 1 BackHandler.kt\nandroidx/activity/compose/BackHandlerKt\n*L\n86#1:111,6\n94#1:117,6\n101#1:124,6\n100#1:123\n84#1:130\n*E\n"})
public final class BackHandlerKt {
    @Composable
    public static final void BackHandler(boolean z, @NotNull Function0 function00, @Nullable Composer composer0, int v, int v1) {
        boolean z1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xEA74A72A);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(z) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v1 & 2) != 0) {
            v2 |= 0x30;
        }
        else if((v & 0x30) == 0) {
            v2 |= (composer1.changed(function00) ? 0x20 : 16);
        }
        if((v2 & 19) == 18 && composer1.getSkipping()) {
            composer1.skipToGroupEnd();
            z1 = z;
        }
        else {
            z1 = (v1 & 1) == 0 ? z : true;
            State state0 = SnapshotStateKt.rememberUpdatedState(function00, composer1, v2 >> 3 & 14);
            composer1.startReplaceableGroup(0xC61D4737);
            androidx.activity.compose.BackHandlerKt.BackHandler.backCallback.1.1 backHandlerKt$BackHandler$backCallback$1$10 = composer1.rememberedValue();
            Companion composer$Companion0 = Composer.Companion;
            if(backHandlerKt$BackHandler$backCallback$1$10 == composer$Companion0.getEmpty()) {
                backHandlerKt$BackHandler$backCallback$1$10 = new OnBackPressedCallback(z1) {
                    @Override  // androidx.activity.OnBackPressedCallback
                    public void handleOnBackPressed() {
                        BackHandlerKt.access$BackHandler$lambda$0(state0).invoke();
                    }
                };
                composer1.updateRememberedValue(backHandlerKt$BackHandler$backCallback$1$10);
            }
            composer1.endReplaceableGroup();
            composer1.startReplaceableGroup(0xC61D4847);
            boolean z2 = composer1.changed(backHandlerKt$BackHandler$backCallback$1$10);
            boolean z3 = composer1.changed(z1);
            b b0 = composer1.rememberedValue();
            if(z2 || z3 || b0 == composer$Companion0.getEmpty()) {
                b0 = new b(backHandlerKt$BackHandler$backCallback$1$10, z1, 0);
                composer1.updateRememberedValue(b0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.SideEffect(b0, composer1, 0);
            OnBackPressedDispatcherOwner onBackPressedDispatcherOwner0 = LocalOnBackPressedDispatcherOwner.INSTANCE.getCurrent(composer1, 6);
            if(onBackPressedDispatcherOwner0 == null) {
                throw new IllegalStateException("No OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner");
            }
            OnBackPressedDispatcher onBackPressedDispatcher0 = onBackPressedDispatcherOwner0.getOnBackPressedDispatcher();
            LifecycleOwner lifecycleOwner0 = (LifecycleOwner)composer1.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            composer1.startReplaceableGroup(0xC61D49B0);
            boolean z4 = composer1.changed(onBackPressedDispatcher0);
            boolean z5 = composer1.changed(lifecycleOwner0);
            boolean z6 = composer1.changed(backHandlerKt$BackHandler$backCallback$1$10);
            r r0 = composer1.rememberedValue();
            if((z4 | z5 | z6) != 0 || r0 == composer$Companion0.getEmpty()) {
                r0 = new r(onBackPressedDispatcher0, lifecycleOwner0, 10, backHandlerKt$BackHandler$backCallback$1$10);
                composer1.updateRememberedValue(r0);
            }
            composer1.endReplaceableGroup();
            EffectsKt.DisposableEffect(lifecycleOwner0, onBackPressedDispatcher0, r0, composer1, 0);
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(z1, function00, v, v1, 0));
        }
    }

    public static final Function0 access$BackHandler$lambda$0(State state0) {
        return (Function0)state0.getValue();
    }
}

