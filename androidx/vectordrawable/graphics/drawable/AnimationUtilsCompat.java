package androidx.vectordrawable.graphics.drawable;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class AnimationUtilsCompat {
    public static Interpolator loadInterpolator(Context context0, int v) throws Resources.NotFoundException {
        return AnimationUtils.loadInterpolator(context0, v);
    }
}

