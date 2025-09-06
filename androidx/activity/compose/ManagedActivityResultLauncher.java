package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Deprecated;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003B1\b\u0000\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0018\u0010\b\u001A\u0014\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0017¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00028\u00002\b\u0010\u0010\u001A\u0004\u0018\u00010\u000FH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/compose/ManagedActivityResultLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "Landroidx/activity/compose/ActivityResultLauncherHolder;", "launcher", "Landroidx/compose/runtime/State;", "Landroidx/activity/result/contract/ActivityResultContract;", "currentContract", "<init>", "(Landroidx/activity/compose/ActivityResultLauncherHolder;Landroidx/compose/runtime/State;)V", "", "unregister", "()V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "getContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "contract", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ManagedActivityResultLauncher extends ActivityResultLauncher {
    public static final int $stable = 8;
    public final ActivityResultLauncherHolder a;
    public final State b;

    public ManagedActivityResultLauncher(@NotNull ActivityResultLauncherHolder activityResultLauncherHolder0, @NotNull State state0) {
        this.a = activityResultLauncherHolder0;
        this.b = state0;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    @NotNull
    public ActivityResultContract getContract() {
        return (ActivityResultContract)this.b.getValue();
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void launch(Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
        this.a.launch(object0, activityOptionsCompat0);
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    @Deprecated(message = "Registration is automatically handled by rememberLauncherForActivityResult")
    public void unregister() {
        throw new UnsupportedOperationException("Registration is automatically handled by rememberLauncherForActivityResult");
    }
}

