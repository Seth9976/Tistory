package androidx.viewbinding;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.Nullable;

public class ViewBindings {
    @Nullable
    public static View findChildViewById(View view0, @IdRes int v) {
        if(!(view0 instanceof ViewGroup)) {
            return null;
        }
        int v1 = ((ViewGroup)view0).getChildCount();
        for(int v2 = 0; v2 < v1; ++v2) {
            View view1 = ((ViewGroup)view0).getChildAt(v2).findViewById(v);
            if(view1 != null) {
                return view1;
            }
        }
        return null;
    }
}

