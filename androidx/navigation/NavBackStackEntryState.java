package androidx.navigation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.Parcelable;
import androidx.lifecycle.Lifecycle.State;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"BanParcelableUsage"})
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u0000 .2\u00020\u0001:\u0001.B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ/\u0010\u0011\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001F\u0010\u0019\u001A\u00020\u00182\u0006\u0010\u0016\u001A\u00020\u00062\u0006\u0010\u0017\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010 \u001A\u00020\u001B8\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001FR\u0017\u0010$\u001A\u00020\u00138\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u0015R\u0019\u0010*\u001A\u0004\u0018\u00010%8\u0006¢\u0006\f\n\u0004\b&\u0010\'\u001A\u0004\b(\u0010)R\u0017\u0010-\u001A\u00020%8\u0006¢\u0006\f\n\u0004\b+\u0010\'\u001A\u0004\b,\u0010)¨\u0006/"}, d2 = {"Landroidx/navigation/NavBackStackEntryState;", "Landroid/os/Parcelable;", "Landroidx/navigation/NavBackStackEntry;", "entry", "<init>", "(Landroidx/navigation/NavBackStackEntry;)V", "Landroid/os/Parcel;", "inParcel", "(Landroid/os/Parcel;)V", "Landroid/content/Context;", "context", "Landroidx/navigation/NavDestination;", "destination", "Landroidx/lifecycle/Lifecycle$State;", "hostLifecycleState", "Landroidx/navigation/NavControllerViewModel;", "viewModel", "instantiate", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavControllerViewModel;)Landroidx/navigation/NavBackStackEntry;", "", "describeContents", "()I", "parcel", "i", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "a", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "id", "b", "I", "getDestinationId", "destinationId", "Landroid/os/Bundle;", "c", "Landroid/os/Bundle;", "getArgs", "()Landroid/os/Bundle;", "args", "d", "getSavedState", "savedState", "Companion", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavBackStackEntryState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavBackStackEntryState.kt\nandroidx/navigation/NavBackStackEntryState\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,90:1\n1#2:91\n*E\n"})
public final class NavBackStackEntryState implements Parcelable {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001R\u001A\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavBackStackEntryState$Companion;", "", "Landroid/os/Parcelable$Creator;", "Landroidx/navigation/NavBackStackEntryState;", "CREATOR", "Landroid/os/Parcelable$Creator;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }
    }

    @JvmField
    @NotNull
    public static final Parcelable.Creator CREATOR;
    @NotNull
    public static final Companion Companion;
    public final String a;
    public final int b;
    public final Bundle c;
    public final Bundle d;

    static {
        NavBackStackEntryState.Companion = new Companion(null);
        NavBackStackEntryState.CREATOR = new NavBackStackEntryState.Companion.CREATOR.1();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public NavBackStackEntryState(@NotNull Parcel parcel0) {
        Intrinsics.checkNotNullParameter(parcel0, "inParcel");
        super();
        String s = parcel0.readString();
        Intrinsics.checkNotNull(s);
        this.a = s;
        this.b = parcel0.readInt();
        this.c = parcel0.readBundle(NavBackStackEntryState.class.getClassLoader());
        Bundle bundle0 = parcel0.readBundle(NavBackStackEntryState.class.getClassLoader());
        Intrinsics.checkNotNull(bundle0);
        this.d = bundle0;
    }

    public NavBackStackEntryState(@NotNull NavBackStackEntry navBackStackEntry0) {
        Intrinsics.checkNotNullParameter(navBackStackEntry0, "entry");
        super();
        this.a = navBackStackEntry0.getId();
        this.b = navBackStackEntry0.getDestination().getId();
        this.c = navBackStackEntry0.getArguments();
        Bundle bundle0 = new Bundle();
        this.d = bundle0;
        navBackStackEntry0.saveState(bundle0);
    }

    @Override  // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Nullable
    public final Bundle getArgs() {
        return this.c;
    }

    public final int getDestinationId() {
        return this.b;
    }

    @NotNull
    public final String getId() {
        return this.a;
    }

    @NotNull
    public final Bundle getSavedState() {
        return this.d;
    }

    @NotNull
    public final NavBackStackEntry instantiate(@NotNull Context context0, @NotNull NavDestination navDestination0, @NotNull State lifecycle$State0, @Nullable NavControllerViewModel navControllerViewModel0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(navDestination0, "destination");
        Intrinsics.checkNotNullParameter(lifecycle$State0, "hostLifecycleState");
        Bundle bundle0 = this.c;
        if(bundle0 != null) {
            bundle0.setClassLoader(context0.getClassLoader());
            return NavBackStackEntry.Companion.create(context0, navDestination0, bundle0, lifecycle$State0, navControllerViewModel0, this.a, this.d);
        }
        return NavBackStackEntry.Companion.create(context0, navDestination0, null, lifecycle$State0, navControllerViewModel0, this.a, this.d);
    }

    @Override  // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel0, int v) {
        Intrinsics.checkNotNullParameter(parcel0, "parcel");
        parcel0.writeString(this.a);
        parcel0.writeInt(this.b);
        parcel0.writeBundle(this.c);
        parcel0.writeBundle(this.d);
    }
}

