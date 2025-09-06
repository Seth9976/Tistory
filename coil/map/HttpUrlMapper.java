package coil.map;

import coil.request.Options;
import kotlin.Metadata;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0005¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\bH\u0016¨\u0006\t"}, d2 = {"Lcoil/map/HttpUrlMapper;", "Lcoil/map/Mapper;", "Lokhttp3/HttpUrl;", "", "()V", "map", "data", "options", "Lcoil/request/Options;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class HttpUrlMapper implements Mapper {
    @Override  // coil.map.Mapper
    public Object map(Object object0, Options options0) {
        return this.map(((HttpUrl)object0), options0);
    }

    @NotNull
    public String map(@NotNull HttpUrl httpUrl0, @NotNull Options options0) {
        return httpUrl0.toString();
    }
}

