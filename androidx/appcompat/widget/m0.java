package androidx.appcompat.widget;

import android.content.res.Resources.Theme;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.util.ObjectsCompat;

public abstract class m0 {
    @DoNotInline
    public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter0, @Nullable Resources.Theme resources$Theme0) {
        if(!ObjectsCompat.equals(themedSpinnerAdapter0.getDropDownViewTheme(), resources$Theme0)) {
            themedSpinnerAdapter0.setDropDownViewTheme(resources$Theme0);
        }
    }
}

