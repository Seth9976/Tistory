package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public abstract class FragmentContainer {
    @NonNull
    @Deprecated
    public Fragment instantiate(@NonNull Context context0, @NonNull String s, @Nullable Bundle bundle0) {
        return Fragment.instantiate(context0, s, bundle0);
    }

    @Nullable
    public abstract View onFindViewById(@IdRes int arg1);

    public abstract boolean onHasView();
}

