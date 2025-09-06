package androidx.startup;

import android.content.Context;
import androidx.annotation.NonNull;
import java.util.List;

public interface Initializer {
    @NonNull
    Object create(@NonNull Context arg1);

    @NonNull
    List dependencies();
}

