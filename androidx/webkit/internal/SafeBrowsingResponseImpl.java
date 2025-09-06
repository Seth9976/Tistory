package androidx.webkit.internal;

import android.webkit.SafeBrowsingResponse;
import androidx.annotation.NonNull;
import androidx.webkit.SafeBrowsingResponseCompat;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import org.chromium.support_lib_boundary.SafeBrowsingResponseBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class SafeBrowsingResponseImpl extends SafeBrowsingResponseCompat {
    public SafeBrowsingResponse a;
    public SafeBrowsingResponseBoundaryInterface b;

    public SafeBrowsingResponseImpl(@NonNull SafeBrowsingResponse safeBrowsingResponse0) {
        this.a = safeBrowsingResponse0;
    }

    public SafeBrowsingResponseImpl(@NonNull InvocationHandler invocationHandler0) {
        this.b = (SafeBrowsingResponseBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler0);
    }

    public final SafeBrowsingResponseBoundaryInterface a() {
        if(this.b == null) {
            InvocationHandler invocationHandler0 = WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(this.a);
            this.b = (SafeBrowsingResponseBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(SafeBrowsingResponseBoundaryInterface.class, invocationHandler0);
        }
        return this.b;
    }

    public final SafeBrowsingResponse b() {
        if(this.a == null) {
            this.a = WebViewGlueCommunicator.getCompatConverter().convertSafeBrowsingResponse(Proxy.getInvocationHandler(this.b));
        }
        return this.a;
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.SafeBrowsingResponseCompat
    public void backToSafety(boolean z) {
        ApiHelperForOMR1.backToSafety(this.b(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.SafeBrowsingResponseCompat
    public void proceed(boolean z) {
        ApiHelperForOMR1.proceed(this.b(), z);
    }

    // 去混淆评级： 低(20)
    @Override  // androidx.webkit.SafeBrowsingResponseCompat
    public void showInterstitial(boolean z) {
        ApiHelperForOMR1.showInterstitial(this.b(), z);
    }
}

