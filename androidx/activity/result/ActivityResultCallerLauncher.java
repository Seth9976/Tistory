package androidx.activity.result;

import a2.b;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import md.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\b\u0012\u0004\u0012\u00020\u00040\u0003B1\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001A\u00028\u0000¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000E\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\u00042\b\u0010\r\u001A\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0010\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R#\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001A\u00028\u00008\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019R&\u0010\u001C\u001A\u000E\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001A\u0010\u0013\u001A\u0004\b\u001B\u0010\u0015¨\u0006\u001D"}, d2 = {"Landroidx/activity/result/ActivityResultCallerLauncher;", "I", "O", "Landroidx/activity/result/ActivityResultLauncher;", "", "launcher", "Landroidx/activity/result/contract/ActivityResultContract;", "callerContract", "callerInput", "<init>", "(Landroidx/activity/result/ActivityResultLauncher;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;)V", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "launch", "(Lkotlin/Unit;Landroidx/core/app/ActivityOptionsCompat;)V", "unregister", "()V", "b", "Landroidx/activity/result/contract/ActivityResultContract;", "getCallerContract", "()Landroidx/activity/result/contract/ActivityResultContract;", "c", "Ljava/lang/Object;", "getCallerInput", "()Ljava/lang/Object;", "e", "getContract", "contract", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityResultCallerLauncher extends ActivityResultLauncher {
    public final ActivityResultLauncher a;
    public final ActivityResultContract b;
    public final Object c;
    public final Lazy d;
    public final ActivityResultContract e;

    public ActivityResultCallerLauncher(@NotNull ActivityResultLauncher activityResultLauncher0, @NotNull ActivityResultContract activityResultContract0, Object object0) {
        Intrinsics.checkNotNullParameter(activityResultLauncher0, "launcher");
        Intrinsics.checkNotNullParameter(activityResultContract0, "callerContract");
        super();
        this.a = activityResultLauncher0;
        this.b = activityResultContract0;
        this.c = object0;
        Lazy lazy0 = c.lazy(new b(this, 2));
        this.d = lazy0;
        this.e = (ActivityResultContract)lazy0.getValue();
    }

    @NotNull
    public final ActivityResultContract getCallerContract() {
        return this.b;
    }

    public final Object getCallerInput() {
        return this.c;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    @NotNull
    public ActivityResultContract getContract() {
        return this.e;
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void launch(Object object0, ActivityOptionsCompat activityOptionsCompat0) {
        this.launch(((Unit)object0), activityOptionsCompat0);
    }

    public void launch(@NotNull Unit unit0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
        Intrinsics.checkNotNullParameter(unit0, "input");
        this.a.launch(this.c, activityOptionsCompat0);
    }

    @Override  // androidx.activity.result.ActivityResultLauncher
    public void unregister() {
        this.a.unregister();
    }
}

