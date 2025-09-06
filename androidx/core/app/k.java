package androidx.core.app;

import android.app.Activity;
import android.app.ActivityOptions;
import android.util.Pair;
import android.view.View;
import androidx.annotation.DoNotInline;

public abstract class k {
    @DoNotInline
    public static ActivityOptions a(Activity activity0, View view0, String s) {
        return ActivityOptions.makeSceneTransitionAnimation(activity0, view0, s);
    }

    @DoNotInline
    @SafeVarargs
    public static ActivityOptions b(Activity activity0, Pair[] arr_pair) {
        return ActivityOptions.makeSceneTransitionAnimation(activity0, arr_pair);
    }

    @DoNotInline
    public static ActivityOptions c() {
        return ActivityOptions.makeTaskLaunchBehind();
    }
}

