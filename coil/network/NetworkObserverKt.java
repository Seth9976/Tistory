package coil.network;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.core.content.ContextCompat;
import coil.util.-Contexts;
import coil.util.-Logs;
import coil.util.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001A)\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0001\u001A\u00020\u00002\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroid/content/Context;", "context", "Lcoil/network/NetworkObserver$Listener;", "listener", "Lcoil/util/Logger;", "logger", "Lcoil/network/NetworkObserver;", "NetworkObserver", "(Landroid/content/Context;Lcoil/network/NetworkObserver$Listener;Lcoil/util/Logger;)Lcoil/network/NetworkObserver;", "coil-base_release"}, k = 2, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNetworkObserver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n+ 3 Logs.kt\ncoil/util/-Logs\n*L\n1#1,112:1\n31#2:113\n21#3,4:114\n*S KotlinDebug\n*F\n+ 1 NetworkObserver.kt\ncoil/network/NetworkObserverKt\n*L\n26#1:113\n28#1:114,4\n*E\n"})
public final class NetworkObserverKt {
    @NotNull
    public static final NetworkObserver NetworkObserver(@NotNull Context context0, @NotNull Listener networkObserver$Listener0, @Nullable Logger logger0) {
        ConnectivityManager connectivityManager0 = (ConnectivityManager)ContextCompat.getSystemService(context0, ConnectivityManager.class);
        if(connectivityManager0 != null && -Contexts.isPermissionGranted(context0, "android.permission.ACCESS_NETWORK_STATE")) {
            try {
                return new a(connectivityManager0, networkObserver$Listener0);
            }
            catch(Exception exception0) {
                if(logger0 != null) {
                    -Logs.log(logger0, "NetworkObserver", new RuntimeException("Failed to register network observer.", exception0));
                }
                return new EmptyNetworkObserver();
            }
        }
        if(logger0 != null && logger0.getLevel() <= 5) {
            logger0.log("NetworkObserver", 5, "Unable to register network observer.", null);
        }
        return new EmptyNetworkObserver();
    }
}

