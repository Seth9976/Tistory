package androidx.paging;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\u001A6\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00032\b\b\u0002\u0010\u0005\u001A\u00020\u00062\b\b\u0002\u0010\u0007\u001A\u00020\u00032\b\b\u0002\u0010\b\u001A\u00020\u0003¨\u0006\t"}, d2 = {"Config", "Landroidx/paging/PagedList$Config;", "pageSize", "", "prefetchDistance", "enablePlaceholders", "", "initialLoadSizeHint", "maxSize", "paging-common_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
public final class PagedListConfigKt {
    public static final Config Config(int v, int v1, boolean z, int v2, int v3) {
        return new Builder().setPageSize(v).setPrefetchDistance(v1).setEnablePlaceholders(z).setInitialLoadSizeHint(v2).setMaxSize(v3).build();
    }

    public static Config Config$default(int v, int v1, boolean z, int v2, int v3, int v4, Object object0) {
        if((v4 & 2) != 0) {
            v1 = v;
        }
        if((v4 & 4) != 0) {
            z = true;
        }
        if((v4 & 8) != 0) {
            v2 = v * 3;
        }
        if((v4 & 16) != 0) {
            v3 = 0x7FFFFFFF;
        }
        return PagedListConfigKt.Config(v, v1, z, v2, v3);
    }
}

