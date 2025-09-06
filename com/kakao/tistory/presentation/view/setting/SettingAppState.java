package com.kakao.tistory.presentation.view.setting;

import android.app.Activity;
import android.content.Context;
import androidx.compose.runtime.Stable;
import com.kakao.tistory.presentation.common.network.NetworkConnection;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Stable
@Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001A\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001A\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000B\u0010\f\u001A\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Lcom/kakao/tistory/presentation/view/setting/SettingAppState;", "", "Landroid/content/Context;", "context", "Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "networkChecker", "<init>", "(Landroid/content/Context;Lcom/kakao/tistory/presentation/common/network/NetworkConnection;)V", "", "navigateToPop", "()V", "a", "Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "getNetworkChecker", "()Lcom/kakao/tistory/presentation/common/network/NetworkConnection;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class SettingAppState {
    public static final int $stable;
    public final NetworkConnection a;
    public final Activity b;

    public SettingAppState(@NotNull Context context0, @NotNull NetworkConnection networkConnection0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(networkConnection0, "networkChecker");
        super();
        this.a = networkConnection0;
        this.b = context0 instanceof Activity ? ((Activity)context0) : null;
    }

    public SettingAppState(Context context0, NetworkConnection networkConnection0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            networkConnection0 = new NetworkConnection(context0);
        }
        this(context0, networkConnection0);
    }

    @NotNull
    public final NetworkConnection getNetworkChecker() {
        return this.a;
    }

    public final void navigateToPop() {
        Activity activity0 = this.b;
        if(activity0 != null) {
            activity0.finish();
        }
    }
}

