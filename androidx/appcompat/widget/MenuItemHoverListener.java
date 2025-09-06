package androidx.appcompat.widget;

import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.appcompat.view.menu.MenuBuilder;

@RestrictTo({Scope.LIBRARY_GROUP_PREFIX})
public interface MenuItemHoverListener {
    void onItemHoverEnter(@NonNull MenuBuilder arg1, @NonNull MenuItem arg2);

    void onItemHoverExit(@NonNull MenuBuilder arg1, @NonNull MenuItem arg2);
}

