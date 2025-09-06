package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J\u0018\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001A\u00020\u0006H\u0016J\"\u0010\u0004\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001A\u00020\u00062\b\u0010\u0007\u001A\u0004\u0018\u00010\bH\u0016J%\u0010\t\u001A\u0012\u0012\u000E\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\n2\u0006\u0010\u000B\u001A\u00020\fH\u0016¢\u0006\u0002\u0010\r¨\u0006\u000E"}, d2 = {"androidx/compose/runtime/ParcelableSnapshotMutableState$Companion$CREATOR$1", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "createFromParcel", "parcel", "Landroid/os/Parcel;", "loader", "Ljava/lang/ClassLoader;", "newArray", "", "size", "", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ParcelableSnapshotMutableState.Companion.CREATOR.1 implements Parcelable.ClassLoaderCreator {
    @NotNull
    public ParcelableSnapshotMutableState createFromParcel(@NotNull Parcel parcel0) {
        return this.createFromParcel(parcel0, null);
    }

    @NotNull
    public ParcelableSnapshotMutableState createFromParcel(@NotNull Parcel parcel0, @Nullable ClassLoader classLoader0) {
        if(classLoader0 == null) {
            classLoader0 = ParcelableSnapshotMutableState.Companion.CREATOR.1.class.getClassLoader();
        }
        Object object0 = parcel0.readValue(classLoader0);
        int v = parcel0.readInt();
        switch(v) {
            case 0: {
                return new ParcelableSnapshotMutableState(object0, SnapshotStateKt.neverEqualPolicy());
            }
            case 1: {
                return new ParcelableSnapshotMutableState(object0, SnapshotStateKt.structuralEqualityPolicy());
            }
            case 2: {
                return new ParcelableSnapshotMutableState(object0, SnapshotStateKt.referentialEqualityPolicy());
            }
            default: {
                throw new IllegalStateException("Unsupported MutableState policy " + v + " was restored");
            }
        }
    }

    @Override  // android.os.Parcelable$Creator
    public Object createFromParcel(Parcel parcel0) {
        return this.createFromParcel(parcel0);
    }

    @Override  // android.os.Parcelable$ClassLoaderCreator
    public Object createFromParcel(Parcel parcel0, ClassLoader classLoader0) {
        return this.createFromParcel(parcel0, classLoader0);
    }

    @NotNull
    public ParcelableSnapshotMutableState[] newArray(int v) {
        return new ParcelableSnapshotMutableState[v];
    }

    @Override  // android.os.Parcelable$Creator
    public Object[] newArray(int v) {
        return this.newArray(v);
    }
}

