package androidx.compose.runtime;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"BanParcelableUsage"})
@StabilityInferred(parameters = 2)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u000F*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\u00020\u0003:\u0001\u000FB\u001B\u0012\u0006\u0010\u0004\u001A\u00028\u0000\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001A\u00020\tH\u0016J\u0018\u0010\n\u001A\u00020\u000B2\u0006\u0010\f\u001A\u00020\r2\u0006\u0010\u000E\u001A\u00020\tH\u0016¨\u0006\u0010"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Landroidx/compose/runtime/SnapshotMutableStateImpl;", "Landroid/os/Parcelable;", "value", "policy", "Landroidx/compose/runtime/SnapshotMutationPolicy;", "(Ljava/lang/Object;Landroidx/compose/runtime/SnapshotMutationPolicy;)V", "describeContents", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ParcelableSnapshotMutableState extends SnapshotMutableStateImpl implements Parcelable {
    @Metadata(d1 = {"\u0000\u001C\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R(\u0010\u0004\u001A\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000B\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\nR\u0014\u0010\f\u001A\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$Companion;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "", "PolicyNeverEquals", "I", "PolicyReferentialEquality", "PolicyStructuralEquality", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void getCREATOR$annotations() {
        }
    }

    public static final int $stable;
    @JvmField
    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    public static final Companion Companion;

    static {
        ParcelableSnapshotMutableState.Companion = new Companion(null);
        ParcelableSnapshotMutableState.CREATOR = new ParcelableSnapshotMutableState.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ParcelableSnapshotMutableState(Object object0, @NotNull SnapshotMutationPolicy snapshotMutationPolicy0) {
        super(object0, snapshotMutationPolicy0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        int v1;
        parcel0.writeValue(this.getValue());
        SnapshotMutationPolicy snapshotMutationPolicy0 = this.getPolicy();
        if(Intrinsics.areEqual(snapshotMutationPolicy0, SnapshotStateKt.neverEqualPolicy())) {
            v1 = 0;
        }
        else if(Intrinsics.areEqual(snapshotMutationPolicy0, SnapshotStateKt.structuralEqualityPolicy())) {
            v1 = 1;
        }
        else if(Intrinsics.areEqual(snapshotMutationPolicy0, SnapshotStateKt.referentialEqualityPolicy())) {
            v1 = 2;
        }
        else {
            throw new IllegalStateException("Only known types of MutableState\'s SnapshotMutationPolicy are supported");
        }
        parcel0.writeInt(v1);
    }
}

