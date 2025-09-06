package androidx.paging.compose;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t4.g;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00022\u0006\u0010\u0004\u001A\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\n\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t2\u0006\u0010\b\u001A\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"androidx/paging/compose/PagingPlaceholderKey$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lt4/g;", "Landroid/os/Parcel;", "parcel", "createFromParcel", "(Landroid/os/Parcel;)Lt4/g;", "", "size", "", "newArray", "(I)[Lt4/g;", "paging-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class PagingPlaceholderKey.Companion.CREATOR.1 implements Parcelable.Creator {
    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.createFromParcel(parcel0);
    }

    @NotNull
    public g createFromParcel(@NotNull Parcel parcel0) {
        Intrinsics.checkNotNullParameter(parcel0, "parcel");
        return new g(parcel0.readInt());
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int v) {
        return this.newArray(v);
    }

    @NotNull
    public g[] newArray(int v) {
        return new g[v];
    }
}

