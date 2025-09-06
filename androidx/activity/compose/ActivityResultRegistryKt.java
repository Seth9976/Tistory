package androidx.activity.compose;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.material3.z5;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer.Companion;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import j.a;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u001AM\u0010\u0000\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001A\u000E\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u00020\b0\u0007H\u0007¢\u0006\u0002\u0010\t¨\u0006\n"}, d2 = {"rememberLauncherForActivityResult", "Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "onResult", "Lkotlin/Function1;", "", "(Landroidx/activity/result/contract/ActivityResultContract;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Landroidx/activity/compose/ManagedActivityResultLauncher;", "activity-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActivityResultRegistry.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,161:1\n955#2,6:162\n955#2,6:168\n955#2,6:174\n*S KotlinDebug\n*F\n+ 1 ActivityResultRegistry.kt\nandroidx/activity/compose/ActivityResultRegistryKt\n*L\n97#1:162,6\n98#1:168,6\n104#1:174,6\n*E\n"})
public final class ActivityResultRegistryKt {
    @Composable
    @NotNull
    public static final ManagedActivityResultLauncher rememberLauncherForActivityResult(@NotNull ActivityResultContract activityResultContract0, @NotNull Function1 function10, @Nullable Composer composer0, int v) {
        composer0.startReplaceableGroup(0xAC0BEC09);
        State state0 = SnapshotStateKt.rememberUpdatedState(activityResultContract0, composer0, v & 14);
        State state1 = SnapshotStateKt.rememberUpdatedState(function10, composer0, v >> 3 & 14);
        Object object0 = RememberSaveableKt.rememberSaveable(new Object[0], null, null, a.x, composer0, 0xC00, 6);
        ActivityResultRegistryOwner activityResultRegistryOwner0 = LocalActivityResultRegistryOwner.INSTANCE.getCurrent(composer0, 6);
        if(activityResultRegistryOwner0 == null) {
            throw new IllegalStateException("No ActivityResultRegistryOwner was provided via LocalActivityResultRegistryOwner");
        }
        ActivityResultRegistry activityResultRegistry0 = activityResultRegistryOwner0.getActivityResultRegistry();
        composer0.startReplaceableGroup(0x9C4B9E1C);
        ActivityResultLauncherHolder activityResultLauncherHolder0 = composer0.rememberedValue();
        Companion composer$Companion0 = Composer.Companion;
        if(activityResultLauncherHolder0 == composer$Companion0.getEmpty()) {
            activityResultLauncherHolder0 = new ActivityResultLauncherHolder();
            composer0.updateRememberedValue(activityResultLauncherHolder0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(-1672765850);
        ManagedActivityResultLauncher managedActivityResultLauncher0 = composer0.rememberedValue();
        if(managedActivityResultLauncher0 == composer$Companion0.getEmpty()) {
            managedActivityResultLauncher0 = new ManagedActivityResultLauncher(activityResultLauncherHolder0, state0);
            composer0.updateRememberedValue(managedActivityResultLauncher0);
        }
        composer0.endReplaceableGroup();
        composer0.startReplaceableGroup(0x9C4B9F72);
        boolean z = composer0.changed(activityResultLauncherHolder0);
        boolean z1 = composer0.changed(activityResultRegistry0);
        boolean z2 = composer0.changed(((String)object0));
        boolean z3 = composer0.changed(activityResultContract0);
        boolean z4 = composer0.changed(state1);
        z5 z50 = composer0.rememberedValue();
        if((z | z1 | z2 | z3 | z4) != 0 || z50 == composer$Companion0.getEmpty()) {
            z5 z51 = new z5(activityResultLauncherHolder0, activityResultRegistry0, ((String)object0), activityResultContract0, state1, 1);
            composer0.updateRememberedValue(z51);
            z50 = z51;
        }
        composer0.endReplaceableGroup();
        EffectsKt.DisposableEffect(activityResultRegistry0, ((String)object0), activityResultContract0, z50, composer0, v << 6 & 0x380);
        composer0.endReplaceableGroup();
        return managedActivityResultLauncher0;
    }
}

