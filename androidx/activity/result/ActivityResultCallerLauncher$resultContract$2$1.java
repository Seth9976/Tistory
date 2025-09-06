package androidx.activity.result;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0005\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001A\u00028\u00002\u0006\u0010\n\u001A\u00020\t2\b\u0010\u000B\u001A\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"androidx/activity/result/ActivityResultCallerLauncher$resultContract$2$1", "Landroidx/activity/result/contract/ActivityResultContract;", "", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lkotlin/Unit;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Ljava/lang/Object;", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityResultCallerLauncher.resultContract.2.1 extends ActivityResultContract {
    public final ActivityResultCallerLauncher b;

    public ActivityResultCallerLauncher.resultContract.2.1(ActivityResultCallerLauncher activityResultCallerLauncher0) {
        this.b = activityResultCallerLauncher0;
        super();
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Intent createIntent(Context context0, Object object0) {
        return this.createIntent(context0, ((Unit)object0));
    }

    @NotNull
    public Intent createIntent(@NotNull Context context0, @NotNull Unit unit0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(unit0, "input");
        return this.b.getCallerContract().createIntent(context0, this.b.getCallerInput());
    }

    @Override  // androidx.activity.result.contract.ActivityResultContract
    public Object parseResult(int v, @Nullable Intent intent0) {
        return this.b.getCallerContract().parseResult(v, intent0);
    }
}

