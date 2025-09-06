package w3;

import androidx.datastore.core.MultiProcessCoordinator;
import java.io.File;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

public final class g0 extends Lambda implements Function0 {
    public final int w;
    public final MultiProcessCoordinator x;

    public g0(MultiProcessCoordinator multiProcessCoordinator0, int v) {
        this.w = v;
        this.x = multiProcessCoordinator0;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        if(this.w != 0) {
            File file0 = MultiProcessCoordinator.access$fileWithSuffix(this.x, this.x.d);
            MultiProcessCoordinator.access$createIfNotExists(this.x, file0);
            return file0;
        }
        File file1 = MultiProcessCoordinator.access$fileWithSuffix(this.x, this.x.e);
        MultiProcessCoordinator.access$createIfNotExists(this.x, file1);
        return file1;
    }
}

