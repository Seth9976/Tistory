package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class TintInfo {
    public boolean mHasTintList;
    public boolean mHasTintMode;
    public ColorStateList mTintList;
    public PorterDuff.Mode mTintMode;

}

