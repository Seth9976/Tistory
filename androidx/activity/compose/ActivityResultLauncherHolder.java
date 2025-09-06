package androidx.activity.compose;

import androidx.activity.result.ActivityResultLauncher;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001F\u0010\t\u001A\u00020\b2\u0006\u0010\u0005\u001A\u00028\u00002\b\u0010\u0007\u001A\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000B\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\u0004R*\u0010\u0013\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\f8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b\r\u0010\u000E\u001A\u0004\b\u000F\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Landroidx/activity/compose/ActivityResultLauncherHolder;", "I", "", "<init>", "()V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "launch", "(Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "Landroidx/activity/result/ActivityResultLauncher;", "a", "Landroidx/activity/result/ActivityResultLauncher;", "getLauncher", "()Landroidx/activity/result/ActivityResultLauncher;", "setLauncher", "(Landroidx/activity/result/ActivityResultLauncher;)V", "launcher", "activity-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityResultLauncherHolder {
    public static final int $stable = 8;
    public ActivityResultLauncher a;

    @Nullable
    public final ActivityResultLauncher getLauncher() {
        return this.a;
    }

    public final void launch(Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
        Unit unit0;
        ActivityResultLauncher activityResultLauncher0 = this.a;
        if(activityResultLauncher0 == null) {
            unit0 = null;
        }
        else {
            activityResultLauncher0.launch(object0, activityOptionsCompat0);
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }

    public final void setLauncher(@Nullable ActivityResultLauncher activityResultLauncher0) {
        this.a = activityResultLauncher0;
    }

    public final void unregister() {
        Unit unit0;
        ActivityResultLauncher activityResultLauncher0 = this.a;
        if(activityResultLauncher0 == null) {
            unit0 = null;
        }
        else {
            activityResultLauncher0.unregister();
            unit0 = Unit.INSTANCE;
        }
        if(unit0 == null) {
            throw new IllegalStateException("Launcher has not been initialized");
        }
    }
}

