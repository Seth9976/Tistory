package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001F\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\n\u001A\u00020\u00052\u0006\u0010\t\u001A\u00020\u0003H\u0086\u0002¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0006\u0010\fJ\u001A\u0010\u000E\u001A\u00020\u00052\b\u0010\r\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000E\u0010\u000FJ\u000F\u0010\u0011\u001A\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000F\u0010\u0014\u001A\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001A"}, d2 = {"Landroidx/window/embedding/ActivityStack;", "", "", "Landroid/app/Activity;", "activities", "", "isEmpty", "<init>", "(Ljava/util/List;Z)V", "activity", "contains", "(Landroid/app/Activity;)Z", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "getActivities$window_release", "()Ljava/util/List;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ActivityStack {
    public final List a;
    public final boolean b;

    public ActivityStack(@NotNull List list0, boolean z) {
        Intrinsics.checkNotNullParameter(list0, "activities");
        super();
        this.a = list0;
        this.b = z;
    }

    public ActivityStack(List list0, boolean z, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 2) != 0) {
            z = false;
        }
        this(list0, z);
    }

    public final boolean contains(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        return this.a.contains(activity0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        return object0 instanceof ActivityStack ? !Intrinsics.areEqual(this.a, ((ActivityStack)object0).a) && this.b != ((ActivityStack)object0).b : false;
    }

    @NotNull
    public final List getActivities$window_release() {
        return this.a;
    }

    @Override
    public int hashCode() {
        return this.a.hashCode() + this.b * 0x1F;
    }

    public final boolean isEmpty() {
        return this.b;
    }

    @Override
    @NotNull
    public String toString() {
        String s = "ActivityStack{" + ("activities=" + this.getActivities$window_release()) + ("isEmpty=" + this.b + '}');
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

