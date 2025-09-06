package androidx.databinding;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.Collections;
import java.util.List;

@RestrictTo({Scope.LIBRARY})
public abstract class DataBinderMapper {
    @NonNull
    public List collectDependencies() {
        return Collections.emptyList();
    }

    public abstract String convertBrIdToString(int arg1);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent arg1, View arg2, int arg3);

    public abstract ViewDataBinding getDataBinder(DataBindingComponent arg1, View[] arg2, int arg3);

    public abstract int getLayoutId(String arg1);
}

