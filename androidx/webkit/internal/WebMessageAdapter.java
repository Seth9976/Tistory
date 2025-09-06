package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import java.lang.reflect.InvocationHandler;
import java.util.Objects;
import org.chromium.support_lib_boundary.WebMessageBoundaryInterface;
import org.chromium.support_lib_boundary.WebMessagePayloadBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class WebMessageAdapter implements WebMessageBoundaryInterface {
    public final WebMessageCompat a;
    public static final String[] b;

    static {
        WebMessageAdapter.b = new String[]{"WEB_MESSAGE_ARRAY_BUFFER"};
    }

    public WebMessageAdapter(@NonNull WebMessageCompat webMessageCompat0) {
        this.a = webMessageCompat0;
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    @Deprecated
    public String getData() {
        return this.a.getData();
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler getMessagePayload() {
        WebMessageCompat webMessageCompat0 = this.a;
        switch(webMessageCompat0.getType()) {
            case 0: {
                return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessagePayloadAdapter(webMessageCompat0.getData()));
            }
            case 1: {
                byte[] arr_b = webMessageCompat0.getArrayBuffer();
                Objects.requireNonNull(arr_b);
                return BoundaryInterfaceReflectionUtil.createInvocationHandlerFor(new WebMessagePayloadAdapter(arr_b));
            }
            default: {
                throw new IllegalStateException("Unknown web message payload type: " + webMessageCompat0.getType());
            }
        }
    }

    @Override  // org.chromium.support_lib_boundary.WebMessageBoundaryInterface
    @Nullable
    public InvocationHandler[] getPorts() {
        WebMessagePortCompat[] arr_webMessagePortCompat = this.a.getPorts();
        if(arr_webMessagePortCompat == null) {
            return null;
        }
        InvocationHandler[] arr_invocationHandler = new InvocationHandler[arr_webMessagePortCompat.length];
        for(int v = 0; v < arr_webMessagePortCompat.length; ++v) {
            arr_invocationHandler[v] = arr_webMessagePortCompat[v].getInvocationHandler();
        }
        return arr_invocationHandler;
    }

    @Override  // org.chromium.support_lib_boundary.FeatureFlagHolderBoundaryInterface
    @NonNull
    public String[] getSupportedFeatures() {
        return WebMessageAdapter.b;
    }

    // 去混淆评级： 低(20)
    public static boolean isMessagePayloadTypeSupportedByWebView(int v) {
        return v == 0 || v == 1 && WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView();
    }

    @Nullable
    public static WebMessageCompat webMessageCompatFromBoundaryInterface(@NonNull WebMessageBoundaryInterface webMessageBoundaryInterface0) {
        InvocationHandler[] arr_invocationHandler = webMessageBoundaryInterface0.getPorts();
        WebMessagePortCompat[] arr_webMessagePortCompat = new WebMessagePortCompat[arr_invocationHandler.length];
        for(int v = 0; v < arr_invocationHandler.length; ++v) {
            arr_webMessagePortCompat[v] = new WebMessagePortImpl(arr_invocationHandler[v]);
        }
        if(WebViewFeatureInternal.WEB_MESSAGE_ARRAY_BUFFER.isSupportedByWebView()) {
            InvocationHandler invocationHandler0 = webMessageBoundaryInterface0.getMessagePayload();
            WebMessagePayloadBoundaryInterface webMessagePayloadBoundaryInterface0 = (WebMessagePayloadBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(WebMessagePayloadBoundaryInterface.class, invocationHandler0);
            switch(webMessagePayloadBoundaryInterface0.getType()) {
                case 0: {
                    return new WebMessageCompat(webMessagePayloadBoundaryInterface0.getAsString(), arr_webMessagePortCompat);
                }
                case 1: {
                    return new WebMessageCompat(webMessagePayloadBoundaryInterface0.getAsArrayBuffer(), arr_webMessagePortCompat);
                }
                default: {
                    return null;
                }
            }
        }
        return new WebMessageCompat(webMessageBoundaryInterface0.getData(), arr_webMessagePortCompat);
    }
}

