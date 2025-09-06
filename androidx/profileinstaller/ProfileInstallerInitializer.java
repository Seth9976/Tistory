package androidx.profileinstaller;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.startup.Initializer;
import java.util.Collections;
import java.util.List;
import v4.b;

public class ProfileInstallerInitializer implements Initializer {
    public static class Result {
    }

    @NonNull
    public Result create(@NonNull Context context0) {
        b.a(new r8.b(1, this, context0.getApplicationContext()));
        return new Result();
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public Object create(@NonNull Context context0) {
        return this.create(context0);
    }

    @Override  // androidx.startup.Initializer
    @NonNull
    public List dependencies() {
        return Collections.emptyList();
    }
}

