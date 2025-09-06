package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;

public class ActivityOptionsCompat {
    public static final String EXTRA_USAGE_TIME_REPORT = "android.activity.usage_time";
    public static final String EXTRA_USAGE_TIME_REPORT_PACKAGES = "android.usage_time_packages";

    @Nullable
    public Rect getLaunchBounds() {
        return null;
    }

    @NonNull
    public static ActivityOptionsCompat makeBasic() {
        return new j(l.a());
    }

    @NonNull
    public static ActivityOptionsCompat makeClipRevealAnimation(@NonNull View view0, int v, int v1, int v2, int v3) {
        return new j(l.b(view0, v, v1, v2, v3));
    }

    @NonNull
    public static ActivityOptionsCompat makeCustomAnimation(@NonNull Context context0, int v, int v1) {
        return new j(ActivityOptions.makeCustomAnimation(context0, v, v1));
    }

    @NonNull
    public static ActivityOptionsCompat makeScaleUpAnimation(@NonNull View view0, int v, int v1, int v2, int v3) {
        return new j(ActivityOptions.makeScaleUpAnimation(view0, v, v1, v2, v3));
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity0, @NonNull View view0, @NonNull String s) {
        return new j(k.a(activity0, view0, s));
    }

    @NonNull
    public static ActivityOptionsCompat makeSceneTransitionAnimation(@NonNull Activity activity0, @Nullable Pair[] arr_pair) {
        if(arr_pair != null) {
            android.util.Pair[] arr_pair1 = new android.util.Pair[arr_pair.length];
            for(int v = 0; v < arr_pair.length; ++v) {
                Pair pair0 = arr_pair[v];
                arr_pair1[v] = android.util.Pair.create(((View)pair0.first), ((String)pair0.second));
            }
            return new j(k.b(activity0, arr_pair1));
        }
        return new j(k.b(activity0, null));
    }

    @NonNull
    public static ActivityOptionsCompat makeTaskLaunchBehind() {
        return new j(k.c());
    }

    @NonNull
    public static ActivityOptionsCompat makeThumbnailScaleUpAnimation(@NonNull View view0, @NonNull Bitmap bitmap0, int v, int v1) {
        return new j(ActivityOptions.makeThumbnailScaleUpAnimation(view0, bitmap0, v, v1));
    }

    public void requestUsageTimeReport(@NonNull PendingIntent pendingIntent0) {
    }

    @NonNull
    public ActivityOptionsCompat setLaunchBounds(@Nullable Rect rect0) {
        return this;
    }

    @NonNull
    public ActivityOptionsCompat setShareIdentityEnabled(boolean z) {
        return this;
    }

    @Nullable
    public Bundle toBundle() {
        return null;
    }

    public void update(@NonNull ActivityOptionsCompat activityOptionsCompat0) {
    }
}

