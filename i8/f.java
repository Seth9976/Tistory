package i8;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.install.InstallException;

public final class f extends e {
    @Override  // i8.e
    public final void zzb(Bundle bundle0) {
        super.zzb(bundle0);
        int v = bundle0.getInt("error.code", -2);
        TaskCompletionSource taskCompletionSource0 = this.b;
        if(v != 0) {
            taskCompletionSource0.trySetException(new InstallException(bundle0.getInt("error.code", -2)));
            return;
        }
        taskCompletionSource0.trySetResult(null);
    }
}

