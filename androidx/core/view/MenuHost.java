package androidx.core.view;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.lifecycle.Lifecycle.State;
import androidx.lifecycle.LifecycleOwner;

public interface MenuHost {
    void addMenuProvider(@NonNull MenuProvider arg1);

    void addMenuProvider(@NonNull MenuProvider arg1, @NonNull LifecycleOwner arg2);

    @SuppressLint({"LambdaLast"})
    void addMenuProvider(@NonNull MenuProvider arg1, @NonNull LifecycleOwner arg2, @NonNull State arg3);

    void invalidateMenu();

    void removeMenuProvider(@NonNull MenuProvider arg1);
}

