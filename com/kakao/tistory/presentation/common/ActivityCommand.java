package com.kakao.tistory.presentation.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/kakao/tistory/presentation/common/ActivityCommand;", "Landroid/os/Parcelable;", "ShowDialogCommand", "ShowToastCommand", "Lcom/kakao/tistory/presentation/common/ActivityCommand$ShowDialogCommand;", "Lcom/kakao/tistory/presentation/common/ActivityCommand$ShowToastCommand;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public abstract class ActivityCommand implements Parcelable {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001F\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0007\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ(\u0010\n\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000BJ\u0010\u0010\f\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\bJ\u0010\u0010\u000E\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u000E\u0010\u000FJ\u001A\u0010\u0013\u001A\u00020\u00122\b\u0010\u0011\u001A\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000FJ \u0010\u001A\u001A\u00020\u00192\u0006\u0010\u0017\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\rHÖ\u0001¢\u0006\u0004\b\u001A\u0010\u001BR\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\bR\u0019\u0010\u0004\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001D\u001A\u0004\b \u0010\b¨\u0006!"}, d2 = {"Lcom/kakao/tistory/presentation/common/ActivityCommand$ShowDialogCommand;", "Lcom/kakao/tistory/presentation/common/ActivityCommand;", "", "title", "message", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/ActivityCommand$ShowDialogCommand;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getTitle", "b", "getMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class ShowDialogCommand extends ActivityCommand {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class Creator implements Parcelable.Creator {
            @NotNull
            public final ShowDialogCommand createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                return new ShowDialogCommand(parcel0.readString(), parcel0.readString());
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final ShowDialogCommand[] newArray(int v) {
                return new ShowDialogCommand[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        public static final int $stable;
        @NotNull
        public static final Parcelable.Creator CREATOR;
        public final String a;
        public final String b;

        static {
            ShowDialogCommand.CREATOR = new Creator();
        }

        public ShowDialogCommand() {
            this(null, null, 3, null);
        }

        public ShowDialogCommand(@Nullable String s, @Nullable String s1) {
            super(null);
            this.a = s;
            this.b = s1;
        }

        public ShowDialogCommand(String s, String s1, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = null;
            }
            if((v & 2) != 0) {
                s1 = null;
            }
            this(s, s1);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @Nullable
        public final String component2() {
            return this.b;
        }

        @NotNull
        public final ShowDialogCommand copy(@Nullable String s, @Nullable String s1) {
            return new ShowDialogCommand(s, s1);
        }

        public static ShowDialogCommand copy$default(ShowDialogCommand activityCommand$ShowDialogCommand0, String s, String s1, int v, Object object0) {
            if((v & 1) != 0) {
                s = activityCommand$ShowDialogCommand0.a;
            }
            if((v & 2) != 0) {
                s1 = activityCommand$ShowDialogCommand0.b;
            }
            return activityCommand$ShowDialogCommand0.copy(s, s1);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof ShowDialogCommand)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((ShowDialogCommand)object0).a) ? Intrinsics.areEqual(this.b, ((ShowDialogCommand)object0).b) : false;
        }

        @Nullable
        public final String getMessage() {
            return this.b;
        }

        @Nullable
        public final String getTitle() {
            return this.a;
        }

        @Override
        public int hashCode() {
            int v = 0;
            int v1 = this.a == null ? 0 : this.a.hashCode();
            String s = this.b;
            if(s != null) {
                v = s.hashCode();
            }
            return v1 * 0x1F + v;
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowDialogCommand(title=" + this.a + ", message=" + this.b + ")";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeString(this.a);
            parcel0.writeString(this.b);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001A\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001C\u0010\b\u001A\u00020\u00002\n\b\u0002\u0010\u0003\u001A\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001A\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u0007¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/common/ActivityCommand$ShowToastCommand;", "Lcom/kakao/tistory/presentation/common/ActivityCommand;", "", "message", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/common/ActivityCommand$ShowToastCommand;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getMessage", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class ShowToastCommand extends ActivityCommand {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.common.ActivityCommand.ShowToastCommand.Creator implements Parcelable.Creator {
            @NotNull
            public final ShowToastCommand createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                return new ShowToastCommand(parcel0.readString());
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final ShowToastCommand[] newArray(int v) {
                return new ShowToastCommand[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        public static final int $stable;
        @NotNull
        public static final Parcelable.Creator CREATOR;
        public final String a;

        static {
            ShowToastCommand.CREATOR = new com.kakao.tistory.presentation.common.ActivityCommand.ShowToastCommand.Creator();
        }

        public ShowToastCommand() {
            this(null, 1, null);
        }

        public ShowToastCommand(@Nullable String s) {
            super(null);
            this.a = s;
        }

        public ShowToastCommand(String s, int v, DefaultConstructorMarker defaultConstructorMarker0) {
            if((v & 1) != 0) {
                s = null;
            }
            this(s);
        }

        @Nullable
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final ShowToastCommand copy(@Nullable String s) {
            return new ShowToastCommand(s);
        }

        public static ShowToastCommand copy$default(ShowToastCommand activityCommand$ShowToastCommand0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = activityCommand$ShowToastCommand0.a;
            }
            return activityCommand$ShowToastCommand0.copy(s);
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof ShowToastCommand ? Intrinsics.areEqual(this.a, ((ShowToastCommand)object0).a) : false;
        }

        @Nullable
        public final String getMessage() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a == null ? 0 : this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowToastCommand(message=" + this.a + ")";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeString(this.a);
        }
    }

    public static final int $stable;

    public ActivityCommand(DefaultConstructorMarker defaultConstructorMarker0) {
    }
}

