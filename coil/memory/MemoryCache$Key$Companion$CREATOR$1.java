package coil.memory;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0005H\u0016J\u001D\u0010\u0006\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001A\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000B"}, d2 = {"coil/memory/MemoryCache$Key$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcoil/memory/MemoryCache$Key;", "createFromParcel", "parcel", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcoil/memory/MemoryCache$Key;", "coil-base_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public final class MemoryCache.Key.Companion.CREATOR.1 implements Parcelable.Creator {
    @NotNull
    public Key createFromParcel(@NotNull Parcel parcel0) {
        String s = parcel0.readString();
        Intrinsics.checkNotNull(s);
        int v = parcel0.readInt();
        LinkedHashMap linkedHashMap0 = new LinkedHashMap(v);
        for(int v1 = 0; v1 < v; ++v1) {
            String s1 = parcel0.readString();
            Intrinsics.checkNotNull(s1);
            String s2 = parcel0.readString();
            Intrinsics.checkNotNull(s2);
            linkedHashMap0.put(s1, s2);
        }
        return new Key(s, linkedHashMap0);
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.createFromParcel(parcel0);
    }

    @NotNull
    public Key[] newArray(int v) {
        return new Key[v];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int v) {
        return this.newArray(v);
    }
}

