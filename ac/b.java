package ac;

import android.content.Context;
import androidx.datastore.preferences.PreferenceDataStoreFile;
import androidx.navigation.compose.NavHostControllerKt;
import coil.util.-Utils;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class b extends Lambda implements Function0 {
    public final int w;
    public final Context x;

    public b(Context context0, int v) {
        this.w = v;
        this.x = context0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                return PreferenceDataStoreFile.preferencesDataStoreFile(this.x, "Blog");
            }
            case 1: {
                return PreferenceDataStoreFile.preferencesDataStoreFile(this.x, "home");
            }
            case 2: {
                return NavHostControllerKt.access$createNavController(this.x);
            }
            default: {
                return -Utils.getSafeCacheDir(this.x);
            }
        }
    }
}

