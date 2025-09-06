package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"BanParcelableUsage"})
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\r\b\u0007\u0018\u0000 \u001C2\u00020\u0001:\u0001\u001CB\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0010\u0012\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001F\u0010\u0011\u001A\u00020\u00102\u0006\u0010\u000E\u001A\u00020\b2\u0006\u0010\u000F\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0013\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0014R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001D"}, d2 = {"Landroidx/activity/result/ActivityResult;", "Landroid/os/Parcelable;", "", "resultCode", "Landroid/content/Intent;", "data", "<init>", "(ILandroid/content/Intent;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "", "toString", "()Ljava/lang/String;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "a", "I", "getResultCode", "b", "Landroid/content/Intent;", "getData", "()Landroid/content/Intent;", "Companion", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class ActivityResult implements Parcelable {
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\t\u001A\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u0012\u0004\b\u000B\u0010\f¨\u0006\r"}, d2 = {"Landroidx/activity/result/ActivityResult$Companion;", "", "", "resultCode", "", "resultCodeToString", "(I)Ljava/lang/String;", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/ActivityResult;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void getCREATOR$annotations() {
        }

        @JvmStatic
        @NotNull
        public final String resultCodeToString(int v) {
            switch(v) {
                case -1: {
                    return "RESULT_OK";
                }
                case 0: {
                    return "RESULT_CANCELED";
                }
                default: {
                    return String.valueOf(v);
                }
            }
        }
    }

    @JvmField
    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    public static final Companion Companion;
    public final int a;
    public final Intent b;

    static {
        ActivityResult.Companion = new Companion(null);
        ActivityResult.CREATOR = new ActivityResult.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public ActivityResult(int v, @Nullable Intent intent0) {
        this.a = v;
        this.b = intent0;
    }

    public ActivityResult(@NotNull Parcel parcel0) {
        Intrinsics.checkNotNullParameter(parcel0, "parcel");
        this(parcel0.readInt(), (parcel0.readInt() == 0 ? null : ((Intent)Intent.CREATOR.createFromParcel(parcel0))));
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Intent getData() {
        return this.b;
    }

    public final int getResultCode() {
        return this.a;
    }

    @JvmStatic
    @NotNull
    public static final String resultCodeToString(int v) {
        return ActivityResult.Companion.resultCodeToString(v);
    }

    @Override
    @NotNull
    public String toString() {
        return "ActivityResult{resultCode=" + ActivityResult.Companion.resultCodeToString(this.a) + ", data=" + this.b + '}';
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "dest");
        parcel0.writeInt(this.a);
        Intent intent0 = this.b;
        parcel0.writeInt((intent0 == null ? 0 : 1));
        if(intent0 != null) {
            intent0.writeToParcel(parcel0, v);
        }
    }
}

