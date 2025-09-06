package androidx.compose.ui.tooling;

import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001A\u00020\u000B\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001A\u00020\u00042\u0012\u0010\u0007\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001A\u00028\u00002\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000E"}, d2 = {"androidx/compose/ui/tooling/ComposeViewAdapter$FakeActivityResultRegistryOwner$1$activityResultRegistry$1", "Landroidx/activity/result/ActivityResultRegistry;", "I", "O", "", "requestCode", "Landroidx/activity/result/contract/ActivityResultContract;", "contract", "input", "Landroidx/core/app/ActivityOptionsCompat;", "options", "", "onLaunch", "(ILandroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/core/app/ActivityOptionsCompat;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ComposeViewAdapter.FakeActivityResultRegistryOwner.1.activityResultRegistry.1 extends ActivityResultRegistry {
    @Override  // androidx.activity.result.ActivityResultRegistry
    public void onLaunch(int v, @NotNull ActivityResultContract activityResultContract0, Object object0, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
        throw new IllegalStateException("Calling launch() is not supported in Preview");
    }
}

