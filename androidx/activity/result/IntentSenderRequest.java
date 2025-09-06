package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"BanParcelableUsage"})
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000 \"2\u00020\u0001:\u0002#\"B1\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001A\u00020\u0006\u0012\b\b\u0002\u0010\b\u001A\u00020\u0006¢\u0006\u0004\b\t\u0010\nB\u0011\b\u0010\u0012\u0006\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\t\u0010\rJ\u000F\u0010\u000E\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u001F\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0010\u001A\u00020\u000B2\u0006\u0010\u0011\u001A\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001A\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0017\u0010\u0007\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u000FR\u0017\u0010\b\u001A\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001E\u001A\u0004\b!\u0010\u000F¨\u0006$"}, d2 = {"Landroidx/activity/result/IntentSenderRequest;", "Landroid/os/Parcelable;", "Landroid/content/IntentSender;", "intentSender", "Landroid/content/Intent;", "fillInIntent", "", "flagsMask", "flagsValues", "<init>", "(Landroid/content/IntentSender;Landroid/content/Intent;II)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "describeContents", "()I", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Landroid/content/IntentSender;", "getIntentSender", "()Landroid/content/IntentSender;", "b", "Landroid/content/Intent;", "getFillInIntent", "()Landroid/content/Intent;", "c", "I", "getFlagsMask", "d", "getFlagsValues", "Companion", "Builder", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class IntentSenderRequest implements Parcelable {
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0015B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00002\b\u0010\n\u001A\u0004\u0018\u00010\t¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u0010\u001A\u00020\u00002\u0006\u0010\u000E\u001A\u00020\r2\u0006\u0010\u000F\u001A\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0013\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder;", "", "Landroid/content/IntentSender;", "intentSender", "<init>", "(Landroid/content/IntentSender;)V", "Landroid/app/PendingIntent;", "pendingIntent", "(Landroid/app/PendingIntent;)V", "Landroid/content/Intent;", "fillInIntent", "setFillInIntent", "(Landroid/content/Intent;)Landroidx/activity/result/IntentSenderRequest$Builder;", "", "values", "mask", "setFlags", "(II)Landroidx/activity/result/IntentSenderRequest$Builder;", "Landroidx/activity/result/IntentSenderRequest;", "build", "()Landroidx/activity/result/IntentSenderRequest;", "Flag", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Builder {
        @Retention(RetentionPolicy.SOURCE)
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\b\u0083\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Builder$Flag;", "", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        @kotlin.annotation.Retention(AnnotationRetention.SOURCE)
        @interface Flag {
        }

        public final IntentSender a;
        public Intent b;
        public int c;
        public int d;

        public Builder(@NotNull PendingIntent pendingIntent0) {
            Intrinsics.checkNotNullParameter(pendingIntent0, "pendingIntent");
            IntentSender intentSender0 = pendingIntent0.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender0, "pendingIntent.intentSender");
            this(intentSender0);
        }

        public Builder(@NotNull IntentSender intentSender0) {
            Intrinsics.checkNotNullParameter(intentSender0, "intentSender");
            super();
            this.a = intentSender0;
        }

        @NotNull
        public final IntentSenderRequest build() {
            return new IntentSenderRequest(this.a, this.b, this.c, this.d);
        }

        @NotNull
        public final Builder setFillInIntent(@Nullable Intent intent0) {
            this.b = intent0;
            return this;
        }

        @NotNull
        public final Builder setFlags(int v, int v1) {
            this.d = v;
            this.c = v1;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u0012\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/activity/result/IntentSenderRequest$Companion;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/activity/result/IntentSenderRequest;", "CREATOR", "Landroid/os/Parcelable$Creator;", "getCREATOR$annotations", "()V", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        public static void getCREATOR$annotations() {
        }
    }

    @JvmField
    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    public static final Companion Companion;
    public final IntentSender a;
    public final Intent b;
    public final int c;
    public final int d;

    static {
        IntentSenderRequest.Companion = new Companion(null);
        IntentSenderRequest.CREATOR = new IntentSenderRequest.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public IntentSenderRequest(@NotNull IntentSender intentSender0, @Nullable Intent intent0, int v, int v1) {
        Intrinsics.checkNotNullParameter(intentSender0, "intentSender");
        super();
        this.a = intentSender0;
        this.b = intent0;
        this.c = v;
        this.d = v1;
    }

    public IntentSenderRequest(IntentSender intentSender0, Intent intent0, int v, int v1, int v2, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v2 & 2) != 0) {
            intent0 = null;
        }
        if((v2 & 4) != 0) {
            v = 0;
        }
        if((v2 & 8) != 0) {
            v1 = 0;
        }
        this(intentSender0, intent0, v, v1);
    }

    public IntentSenderRequest(@NotNull Parcel parcel0) {
        Intrinsics.checkNotNullParameter(parcel0, "parcel");
        Parcelable parcelable0 = parcel0.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(parcelable0);
        this(((IntentSender)parcelable0), ((Intent)parcel0.readParcelable(Intent.class.getClassLoader())), parcel0.readInt(), parcel0.readInt());
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Intent getFillInIntent() {
        return this.b;
    }

    public final int getFlagsMask() {
        return this.c;
    }

    public final int getFlagsValues() {
        return this.d;
    }

    @NotNull
    public final IntentSender getIntentSender() {
        return this.a;
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "dest");
        parcel0.writeParcelable(this.a, v);
        parcel0.writeParcelable(this.b, v);
        parcel0.writeInt(this.c);
        parcel0.writeInt(this.d);
    }
}

