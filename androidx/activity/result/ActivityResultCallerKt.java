package androidx.activity.result;

import androidx.activity.result.contract.ActivityResultContract;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001AV\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001A\u0002H\u00032\u0017\u0010\t\u001A\u0013\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u000B\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\f\u001A^\u0010\u0000\u001A\b\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0003\"\u0004\b\u0001\u0010\u0004*\u00020\u00052\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u00072\u0006\u0010\b\u001A\u0002H\u00032\u0006\u0010\r\u001A\u00020\u000E2\u0017\u0010\t\u001A\u0013\u0012\t\u0012\u0007H\u0004¢\u0006\u0002\b\u000B\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0002\u0010\u000F¨\u0006\u0010"}, d2 = {"registerForActivityResult", "Landroidx/activity/result/ActivityResultLauncher;", "", "I", "O", "Landroidx/activity/result/ActivityResultCaller;", "contract", "Landroidx/activity/result/contract/ActivityResultContract;", "input", "callback", "Lkotlin/Function1;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "registry", "Landroidx/activity/result/ActivityResultRegistry;", "(Landroidx/activity/result/ActivityResultCaller;Landroidx/activity/result/contract/ActivityResultContract;Ljava/lang/Object;Landroidx/activity/result/ActivityResultRegistry;Lkotlin/jvm/functions/Function1;)Landroidx/activity/result/ActivityResultLauncher;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityResultCallerKt {
    @NotNull
    public static final ActivityResultLauncher registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller0, @NotNull ActivityResultContract activityResultContract0, Object object0, @NotNull ActivityResultRegistry activityResultRegistry0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(activityResultCaller0, "<this>");
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(activityResultRegistry0, "registry");
        Intrinsics.checkNotNullParameter(function10, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller0.registerForActivityResult(activityResultContract0, activityResultRegistry0, new a(function10, 0)), activityResultContract0, object0);
    }

    @NotNull
    public static final ActivityResultLauncher registerForActivityResult(@NotNull ActivityResultCaller activityResultCaller0, @NotNull ActivityResultContract activityResultContract0, Object object0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(activityResultCaller0, "<this>");
        Intrinsics.checkNotNullParameter(activityResultContract0, "contract");
        Intrinsics.checkNotNullParameter(function10, "callback");
        return new ActivityResultCallerLauncher(activityResultCaller0.registerForActivityResult(activityResultContract0, new a(function10, 1)), activityResultContract0, object0);
    }
}

