package coil.util;

import androidx.annotation.MainThread;
import androidx.annotation.WorkerThread;
import coil.size.Size;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\'¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0004H\'¢\u0006\u0004\b\u0007\u0010\b\u0082\u0001\u0002\t\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000BÀ\u0006\u0001"}, d2 = {"Lcoil/util/HardwareBitmapService;", "", "Lcoil/size/Size;", "size", "", "allowHardwareMainThread", "(Lcoil/size/Size;)Z", "allowHardwareWorkerThread", "()Z", "Lcf/b;", "Lz5/d;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface HardwareBitmapService {
    @MainThread
    boolean allowHardwareMainThread(@NotNull Size arg1);

    @WorkerThread
    boolean allowHardwareWorkerThread();
}

