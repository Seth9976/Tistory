package androidx.appcompat.widget;

import android.graphics.Rect;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public interface FitWindowsViewGroup {
    public interface OnFitSystemWindowsListener {
        void onFitSystemWindows(Rect arg1);
    }

    void setOnFitSystemWindowsListener(OnFitSystemWindowsListener arg1);
}

