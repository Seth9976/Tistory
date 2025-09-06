package androidx.webkit.internal;

import androidx.annotation.NonNull;
import androidx.webkit.ScriptHandler;
import java.lang.reflect.InvocationHandler;
import org.chromium.support_lib_boundary.ScriptHandlerBoundaryInterface;
import org.chromium.support_lib_boundary.util.BoundaryInterfaceReflectionUtil;

public class ScriptHandlerImpl implements ScriptHandler {
    public final ScriptHandlerBoundaryInterface a;

    public ScriptHandlerImpl(ScriptHandlerBoundaryInterface scriptHandlerBoundaryInterface0) {
        this.a = scriptHandlerBoundaryInterface0;
    }

    @Override  // androidx.webkit.ScriptHandler
    public void remove() {
        this.a.remove();
    }

    @NonNull
    public static ScriptHandlerImpl toScriptHandler(@NonNull InvocationHandler invocationHandler0) {
        return new ScriptHandlerImpl(((ScriptHandlerBoundaryInterface)BoundaryInterfaceReflectionUtil.castToSuppLibClass(ScriptHandlerBoundaryInterface.class, invocationHandler0)));
    }
}

