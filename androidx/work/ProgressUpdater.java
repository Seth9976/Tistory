package androidx.work;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.UUID;

public interface ProgressUpdater {
    @NonNull
    ListenableFuture updateProgress(@NonNull Context arg1, @NonNull UUID arg2, @NonNull Data arg3);
}

