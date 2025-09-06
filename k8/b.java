package k8;

import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateManagerKtxKt;
import com.google.android.play.core.ktx.AppUpdateResult.Downloaded;
import com.google.android.play.core.ktx.AppUpdateResult.InProgress;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.channels.ProducerScope;

public final class b implements InstallStateUpdatedListener {
    public final ProducerScope a;
    public final AppUpdateManager b;

    public b(ProducerScope producerScope0, AppUpdateManager appUpdateManager0) {
        this.a = producerScope0;
        this.b = appUpdateManager0;
    }

    @Override  // com.google.android.play.core.listener.StateUpdatedListener
    public final void onStateUpdate(Object object0) {
        Intrinsics.checkNotNullParameter(((InstallState)object0), "installState");
        int v = ((InstallState)object0).installStatus();
        ProducerScope producerScope0 = this.a;
        if(v == 11) {
            AppUpdateManagerKtxKt.tryOffer(producerScope0, new Downloaded(this.b));
            return;
        }
        AppUpdateManagerKtxKt.tryOffer(producerScope0, new InProgress(((InstallState)object0)));
    }
}

