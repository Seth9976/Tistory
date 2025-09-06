package okhttp3;

import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class d implements CookieJar {
    @Override  // okhttp3.CookieJar
    public final List loadForRequest(HttpUrl httpUrl0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        return CollectionsKt__CollectionsKt.emptyList();
    }

    @Override  // okhttp3.CookieJar
    public final void saveFromResponse(HttpUrl httpUrl0, List list0) {
        Intrinsics.checkNotNullParameter(httpUrl0, "url");
        Intrinsics.checkNotNullParameter(list0, "cookies");
    }
}

