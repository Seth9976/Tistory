package okhttp3.internal.http2;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import okio.BufferedSource;

public final class a implements PushObserver {
    @Override  // okhttp3.internal.http2.PushObserver
    public final boolean onData(int v, BufferedSource bufferedSource0, int v1, boolean z) {
        Intrinsics.checkNotNullParameter(bufferedSource0, "source");
        bufferedSource0.skip(((long)v1));
        return true;
    }

    @Override  // okhttp3.internal.http2.PushObserver
    public final boolean onHeaders(int v, List list0, boolean z) {
        Intrinsics.checkNotNullParameter(list0, "responseHeaders");
        return true;
    }

    @Override  // okhttp3.internal.http2.PushObserver
    public final boolean onRequest(int v, List list0) {
        Intrinsics.checkNotNullParameter(list0, "requestHeaders");
        return true;
    }

    @Override  // okhttp3.internal.http2.PushObserver
    public final void onReset(int v, ErrorCode errorCode0) {
        Intrinsics.checkNotNullParameter(errorCode0, "errorCode");
    }
}

