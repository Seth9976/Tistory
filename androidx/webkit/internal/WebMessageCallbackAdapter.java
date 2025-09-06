package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebMessageCallbackAdapter implements WebMessageCallbackBoundaryInterface {
    public final WebMessageCallbackCompat a;

    public WebMessageCallbackAdapter(@NonNull WebMessageCallbackCompat webMessagePortCompat$WebMessageCallbackCompat0) {
        this.a = webMessagePortCompat$WebMessageCallbackCompat0;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return new String[]{"WEB_MESSAGE_CALLBACK_ON_MESSAGE"};
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageCallbackBoundaryInterface
    public void onMessage(@NonNull InvocationHandler invocationHandler0, @NonNull InvocationHandler invocationHandler1) {
        if(WebMessageAdapter.webMessageCompatFromBoundaryInterface(((WebMessageBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessageBoundaryInterface.class, invocationHandler1))) != null) {
            new WebMessagePortImpl(invocationHandler0);
        }
    }
}

