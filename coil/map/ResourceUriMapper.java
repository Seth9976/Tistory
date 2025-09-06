package coil.map;

import android.content.res.Resources;
import android.net.Uri;
import coil.request.Options;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J!\u0010\b\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0007\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcoil/map/ResourceUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "map", "(Landroid/net/Uri;Lcoil/request/Options;)Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResourceUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,34:1\n1#2:35\n29#3:36\n*S KotlinDebug\n*F\n+ 1 ResourceUriMapper.kt\ncoil/map/ResourceUriMapper\n*L\n25#1:36\n*E\n"})
public final class ResourceUriMapper implements Mapper {
    @Nullable
    public Uri map(@NotNull Uri uri0, @NotNull Options options0) {
        if(Intrinsics.areEqual(uri0.getScheme(), "android.resource")) {
            String s = uri0.getAuthority();
            if(s != null && !p.isBlank(s) && uri0.getPathSegments().size() == 2) {
                String s1 = uri0.getAuthority();
                if(s1 == null) {
                    s1 = "";
                }
                Resources resources0 = options0.getContext().getPackageManager().getResourcesForApplication(s1);
                List list0 = uri0.getPathSegments();
                String s2 = (String)list0.get(0);
                int v = resources0.getIdentifier(((String)list0.get(1)), s2, s1);
                if(v == 0) {
                    throw new IllegalStateException(("Invalid android.resource URI: " + uri0).toString());
                }
                return Uri.parse(("android.resource://" + s1 + '/' + v));
            }
        }
        return null;
    }

    @Override  // coil.map.Mapper
    public Object map(Object object0, Options options0) {
        return this.map(((Uri)object0), options0);
    }
}

