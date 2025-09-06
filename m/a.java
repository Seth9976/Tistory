package m;

import android.content.Context;
import android.content.res.Configuration;
import androidx.annotation.DoNotInline;
import androidx.appcompat.view.ContextThemeWrapper;

public abstract class a {
    @DoNotInline
    public static Context a(ContextThemeWrapper contextThemeWrapper0, Configuration configuration0) {
        return contextThemeWrapper0.createConfigurationContext(configuration0);
    }
}

