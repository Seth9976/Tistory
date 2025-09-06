package androidx.navigation;

import androidx.core.app.ActivityOptionsCompat;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u001A\u001C\u0010\u0000\u001A\u00020\u00012\n\b\u0002\u0010\u0002\u001A\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u0005¨\u0006\u0006"}, d2 = {"ActivityNavigatorExtras", "Landroidx/navigation/ActivityNavigator$Extras;", "activityOptions", "Landroidx/core/app/ActivityOptionsCompat;", "flags", "", "navigation-runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityNavigatorExtrasKt {
    @NotNull
    public static final Extras ActivityNavigatorExtras(@Nullable ActivityOptionsCompat activityOptionsCompat0, int v) {
        Builder activityNavigator$Extras$Builder0 = new Builder();
        if(activityOptionsCompat0 != null) {
            activityNavigator$Extras$Builder0.setActivityOptions(activityOptionsCompat0);
        }
        activityNavigator$Extras$Builder0.addFlags(v);
        return activityNavigator$Extras$Builder0.build();
    }

    public static Extras ActivityNavigatorExtras$default(ActivityOptionsCompat activityOptionsCompat0, int v, int v1, Object object0) {
        if((v1 & 1) != 0) {
            activityOptionsCompat0 = null;
        }
        if((v1 & 2) != 0) {
            v = 0;
        }
        return ActivityNavigatorExtrasKt.ActivityNavigatorExtras(activityOptionsCompat0, v);
    }
}

