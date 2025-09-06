package com.kakao.tistory.presentation.main.navigation;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/kakao/tistory/presentation/main/navigation/MainCommand;", "Landroid/os/Parcelable;", "GoMy", "GoNotification", "ShowWelcomDialog", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand$GoMy;", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand$GoNotification;", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand$ShowWelcomDialog;", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
public interface MainCommand extends Parcelable {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J \u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/main/navigation/MainCommand$GoMy;", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class GoMy implements MainCommand {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class Creator implements Parcelable.Creator {
            @NotNull
            public final GoMy createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                parcel0.readInt();
                return GoMy.INSTANCE;
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final GoMy[] newArray(int v) {
                return new GoMy[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        public static final int $stable;
        @NotNull
        public static final Parcelable.Creator CREATOR;
        @NotNull
        public static final GoMy INSTANCE;

        static {
            GoMy.INSTANCE = new GoMy();
            GoMy.CREATOR = new Creator();
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof GoMy;
        }

        @Override
        public int hashCode() {
            return 0x47EEB0A3;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoMy";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeInt(1);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\u000B\u001A\u00020\n2\b\u0010\t\u001A\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000B\u0010\fJ\u0010\u0010\r\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J \u0010\u0012\u001A\u00020\u00112\u0006\u0010\u000F\u001A\u00020\u000E2\u0006\u0010\u0010\u001A\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/kakao/tistory/presentation/main/navigation/MainCommand$GoNotification;", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class GoNotification implements MainCommand {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.main.navigation.MainCommand.GoNotification.Creator implements Parcelable.Creator {
            @NotNull
            public final GoNotification createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                parcel0.readInt();
                return GoNotification.INSTANCE;
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final GoNotification[] newArray(int v) {
                return new GoNotification[v];
            }

            @Override  // android.os.Parcelable$Creator
            public Object[] newArray(int v) {
                return this.newArray(v);
            }
        }

        public static final int $stable;
        @NotNull
        public static final Parcelable.Creator CREATOR;
        @NotNull
        public static final GoNotification INSTANCE;

        static {
            GoNotification.INSTANCE = new GoNotification();
            GoNotification.CREATOR = new com.kakao.tistory.presentation.main.navigation.MainCommand.GoNotification.Creator();
        }

        @Override  // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        // 去混淆评级： 低(20)
        @Override
        public boolean equals(@Nullable Object object0) {
            return this == object0 ? true : object0 instanceof GoNotification;
        }

        @Override
        public int hashCode() {
            return 1001333538;
        }

        @Override
        @NotNull
        public String toString() {
            return "GoNotification";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeInt(1);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001A\u0010\b\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001A\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0007J\u0010\u0010\f\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u0011\u001A\u00020\u00102\b\u0010\u000F\u001A\u0004\u0018\u00010\u000EHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001A\u00020\u00172\u0006\u0010\u0015\u001A\u00020\u00142\u0006\u0010\u0016\u001A\u00020\u000BHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001A\u0010\u001B\u001A\u0004\b\u001C\u0010\u0007¨\u0006\u001D"}, d2 = {"Lcom/kakao/tistory/presentation/main/navigation/MainCommand$ShowWelcomDialog;", "Lcom/kakao/tistory/presentation/main/navigation/MainCommand;", "", "name", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/kakao/tistory/presentation/main/navigation/MainCommand$ShowWelcomDialog;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getName", "presentation_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
    @Parcelize
    public static final class ShowWelcomDialog implements MainCommand {
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 0x30)
        public static final class com.kakao.tistory.presentation.main.navigation.MainCommand.ShowWelcomDialog.Creator implements Parcelable.Creator {
            @NotNull
            public final ShowWelcomDialog createFromParcel(@NotNull Parcel parcel0) {
                Intrinsics.checkNotNullParameter(parcel0, "parcel");
                return new ShowWelcomDialog(parcel0.readString());
            }

            @Override  // android.os.Parcelable$Creator
            public Object createFromParcel(Parcel parcel0) {
                return this.createFromParcel(parcel0);
            }

            @NotNull
            public final ShowWelcomDialog[] newArray(int v) {
                return new ShowWelcomDialog[v];
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
            ShowWelcomDialog.CREATOR = new com.kakao.tistory.presentation.main.navigation.MainCommand.ShowWelcomDialog.Creator();
        }

        public ShowWelcomDialog(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            super();
            this.a = s;
        }

        @NotNull
        public final String component1() {
            return this.a;
        }

        @NotNull
        public final ShowWelcomDialog copy(@NotNull String s) {
            Intrinsics.checkNotNullParameter(s, "name");
            return new ShowWelcomDialog(s);
        }

        public static ShowWelcomDialog copy$default(ShowWelcomDialog mainCommand$ShowWelcomDialog0, String s, int v, Object object0) {
            if((v & 1) != 0) {
                s = mainCommand$ShowWelcomDialog0.a;
            }
            return mainCommand$ShowWelcomDialog0.copy(s);
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
            return object0 instanceof ShowWelcomDialog ? Intrinsics.areEqual(this.a, ((ShowWelcomDialog)object0).a) : false;
        }

        @NotNull
        public final String getName() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }

        @Override
        @NotNull
        public String toString() {
            return "ShowWelcomDialog(name=" + this.a + ")";
        }

        @Override  // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel0, int v) {
            Intrinsics.checkNotNullParameter(parcel0, "out");
            parcel0.writeString(this.a);
        }
    }

}

