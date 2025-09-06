package androidx.webkit;

import android.os.Handler;
import android.webkit.WebMessagePort;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.lang.reflect.InvocationHandler;

public abstract class WebMessagePortCompat {
    public static abstract class WebMessageCallbackCompat {
        public void onMessage(@NonNull WebMessagePortCompat webMessagePortCompat0, @Nullable WebMessageCompat webMessageCompat0) {
        }
    }

    public abstract void close();

    @NonNull
    @RequiresApi(23)
    @RestrictTo({Scope.LIBRARY})
    public abstract WebMessagePort getFrameworkPort();

    @NonNull
    @RestrictTo({Scope.LIBRARY})
    public abstract InvocationHandler getInvocationHandler();

    public abstract void postMessage(@NonNull WebMessageCompat arg1);

    public abstract void setWebMessageCallback(@Nullable Handler arg1, @NonNull WebMessageCallbackCompat arg2);

    public abstract void setWebMessageCallback(@NonNull WebMessageCallbackCompat arg1);
}

