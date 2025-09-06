package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements FitWindowsViewGroup {
    public OnFitSystemWindowsListener a;

    public FitWindowsLinearLayout(@NonNull Context context0) {
        super(context0);
    }

    public FitWindowsLinearLayout(@NonNull Context context0, @Nullable AttributeSet attributeSet0) {
        super(context0, attributeSet0);
    }

    @Override  // android.view.View
    public boolean fitSystemWindows(Rect rect0) {
        OnFitSystemWindowsListener fitWindowsViewGroup$OnFitSystemWindowsListener0 = this.a;
        if(fitWindowsViewGroup$OnFitSystemWindowsListener0 != null) {
            fitWindowsViewGroup$OnFitSystemWindowsListener0.onFitSystemWindows(rect0);
        }
        return super.fitSystemWindows(rect0);
    }

    @Override  // androidx.appcompat.widget.FitWindowsViewGroup
    public void setOnFitSystemWindowsListener(OnFitSystemWindowsListener fitWindowsViewGroup$OnFitSystemWindowsListener0) {
        this.a = fitWindowsViewGroup$OnFitSystemWindowsListener0;
    }
}

