package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R.style;
import java.util.Map;

public final class p implements ColorResourcesOverride {
    @Override  // com.google.android.material.color.ColorResourcesOverride
    public final boolean applyIfPossible(Context context0, Map map0) {
        if(j.b(context0, map0)) {
            ThemeUtils.applyThemeOverlay(context0, style.ThemeOverlay_Material3_PersonalizedColors);
            return true;
        }
        return false;
    }

    @Override  // com.google.android.material.color.ColorResourcesOverride
    public final Context wrapContextIfPossible(Context context0, Map map0) {
        ContextThemeWrapper contextThemeWrapper0 = new ContextThemeWrapper(context0, style.ThemeOverlay_Material3_PersonalizedColors);
        contextThemeWrapper0.applyOverrideConfiguration(new Configuration());
        return j.b(contextThemeWrapper0, map0) ? contextThemeWrapper0 : context0;
    }
}

