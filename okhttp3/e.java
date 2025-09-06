package okhttp3;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.Intrinsics;

public final class e implements Dns {
    @Override  // okhttp3.Dns
    public final List lookup(String s) {
        Intrinsics.checkNotNullParameter(s, "hostname");
        try {
            InetAddress[] arr_inetAddress = InetAddress.getAllByName(s);
            Intrinsics.checkNotNullExpressionValue(arr_inetAddress, "getAllByName(hostname)");
            return ArraysKt___ArraysKt.toList(arr_inetAddress);
        }
        catch(NullPointerException nullPointerException0) {
            UnknownHostException unknownHostException0 = new UnknownHostException("Broken system behaviour for dns lookup of " + s);
            unknownHostException0.initCause(nullPointerException0);
            throw unknownHostException0;
        }
    }
}

