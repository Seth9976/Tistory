package androidx.core.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public interface TintableCheckedTextView {
    @Nullable
    ColorStateList getSupportCheckMarkTintList();

    @Nullable
    PorterDuff.Mode getSupportCheckMarkTintMode();

    void setSupportCheckMarkTintList(@Nullable ColorStateList arg1);

    void setSupportCheckMarkTintMode(@Nullable PorterDuff.Mode arg1);
}

