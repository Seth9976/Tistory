package androidx.appcompat.view;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.R.attr;
import androidx.appcompat.R.bool;
import androidx.appcompat.R.dimen;
import androidx.appcompat.R.styleable;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public class ActionBarPolicy {
    public Context a;

    public boolean enableHomeButtonByDefault() {
        return false;
    }

    public static ActionBarPolicy get(Context context0) {
        ActionBarPolicy actionBarPolicy0 = new ActionBarPolicy();  // 初始化器: Ljava/lang/Object;-><init>()V
        actionBarPolicy0.a = context0;
        return actionBarPolicy0;
    }

    public int getEmbeddedMenuWidthLimit() {
        return this.a.getResources().getDisplayMetrics().widthPixels / 2;
    }

    public int getMaxActionButtons() {
        Configuration configuration0 = this.a.getResources().getConfiguration();
        int v = configuration0.screenWidthDp;
        int v1 = configuration0.screenHeightDp;
        if(configuration0.smallestScreenWidthDp <= 600 && v <= 600 && (v <= 960 || v1 <= 720) && (v <= 720 || v1 <= 960)) {
            if(v < 500 && (v <= 640 || v1 <= 480) && (v <= 480 || v1 <= 640)) {
                return v < 360 ? 2 : 3;
            }
            return 4;
        }
        return 5;
    }

    public int getStackedTabMaxWidth() {
        return this.a.getResources().getDimensionPixelSize(dimen.abc_action_bar_stacked_tab_max_width);
    }

    public int getTabContainerHeight() {
        Context context0 = this.a;
        TypedArray typedArray0 = context0.obtainStyledAttributes(null, styleable.ActionBar, attr.actionBarStyle, 0);
        int v = typedArray0.getLayoutDimension(styleable.ActionBar_height, 0);
        Resources resources0 = context0.getResources();
        if(!this.hasEmbeddedTabs()) {
            v = Math.min(v, resources0.getDimensionPixelSize(dimen.abc_action_bar_stacked_max_height));
        }
        typedArray0.recycle();
        return v;
    }

    public boolean hasEmbeddedTabs() {
        return this.a.getResources().getBoolean(bool.abc_action_bar_embed_tabs);
    }

    public boolean showsOverflowMenuButton() [...] // Inlined contents
}

