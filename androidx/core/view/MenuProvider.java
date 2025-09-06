package androidx.core.view;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.annotation.NonNull;

public interface MenuProvider {
    void onCreateMenu(@NonNull Menu arg1, @NonNull MenuInflater arg2);

    default void onMenuClosed(@NonNull Menu menu0) {
    }

    boolean onMenuItemSelected(@NonNull MenuItem arg1);

    default void onPrepareMenu(@NonNull Menu menu0) {
    }
}

