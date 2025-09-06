package v3;

import android.content.Context;
import androidx.datastore.DataStoreFile;
import androidx.datastore.DataStoreSingletonDelegate;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import okio.Path.Companion;
import okio.Path;

public final class b extends Lambda implements Function0 {
    public final Context w;
    public final DataStoreSingletonDelegate x;

    public b(Context context0, DataStoreSingletonDelegate dataStoreSingletonDelegate0) {
        this.w = context0;
        this.x = dataStoreSingletonDelegate0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intrinsics.checkNotNullExpressionValue(this.w, "applicationContext");
        String s = this.x.a;
        String s1 = DataStoreFile.dataStoreFile(this.w, s).getAbsolutePath();
        Intrinsics.checkNotNullExpressionValue(s1, "applicationContext.dataS…le(fileName).absolutePath");
        return Companion.get$default(Path.Companion, s1, false, 1, null);
    }
}

