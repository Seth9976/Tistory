package coil.map;

import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.net.Uri;
import androidx.annotation.DrawableRes;
import coil.request.Options;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\t\u001A\u0004\u0018\u00010\u00032\b\b\u0001\u0010\u0006\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcoil/map/ResourceIntMapper;", "Lcoil/map/Mapper;", "", "Landroid/net/Uri;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "map", "(ILcoil/request/Options;)Landroid/net/Uri;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nResourceIntMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n+ 2 Uri.kt\nandroidx/core/net/UriKt\n*L\n1#1,26:1\n29#2:27\n*S KotlinDebug\n*F\n+ 1 ResourceIntMapper.kt\ncoil/map/ResourceIntMapper\n*L\n15#1:27\n*E\n"})
public final class ResourceIntMapper implements Mapper {
    @Nullable
    public Uri map(@DrawableRes int v, @NotNull Options options0) {
        Context context0 = options0.getContext();
        try {
            if(context0.getResources().getResourceEntryName(v) != null) {
                return Uri.parse(("android.resource://net.daum.android.tistoryapp" + '/' + v));
            }
        }
        catch(Resources.NotFoundException unused_ex) {
        }
        return null;
    }

    @Override  // coil.map.Mapper
    public Object map(Object object0, Options options0) {
        return this.map(((Number)object0).intValue(), options0);
    }
}

