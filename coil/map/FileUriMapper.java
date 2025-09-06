package coil.map;

import android.net.Uri;
import coil.request.Options;
import coil.util.-Utils;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001A\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001A\u00020\u00022\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000B"}, d2 = {"Lcoil/map/FileUriMapper;", "Lcoil/map/Mapper;", "Landroid/net/Uri;", "Ljava/io/File;", "<init>", "()V", "data", "Lcoil/request/Options;", "options", "map", "(Landroid/net/Uri;Lcoil/request/Options;)Ljava/io/File;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFileUriMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FileUriMapper.kt\ncoil/map/FileUriMapper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,29:1\n1#2:30\n*E\n"})
public final class FileUriMapper implements Mapper {
    @Nullable
    public File map(@NotNull Uri uri0, @NotNull Options options0) {
        if(!-Utils.isAssetUri(uri0)) {
            String s = uri0.getScheme();
            if(s == null || Intrinsics.areEqual(s, "file")) {
                String s1 = uri0.getPath();
                if(s1 == null) {
                    s1 = "";
                }
                if(StringsKt__StringsKt.startsWith$default(s1, '/', false, 2, null) && -Utils.getFirstPathSegment(uri0) != null) {
                    if(Intrinsics.areEqual(uri0.getScheme(), "file")) {
                        String s2 = uri0.getPath();
                        return s2 == null ? null : new File(s2);
                    }
                    return new File(uri0.toString());
                }
            }
        }
        return null;
    }

    @Override  // coil.map.Mapper
    public Object map(Object object0, Options options0) {
        return this.map(((Uri)object0), options0);
    }
}

