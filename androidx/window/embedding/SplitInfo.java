package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\u0006\u0010\u0006\u001A\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\f\u001A\u00020\u000B2\u0006\u0010\n\u001A\u00020\tH\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u001A\u0010\u000F\u001A\u00020\u000B2\b\u0010\u000E\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u000F\u0010\u0012\u001A\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u0018\u001A\u0004\b\u001C\u0010\u001AR\u0017\u0010\u0006\u001A\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010 ¨\u0006!"}, d2 = {"Landroidx/window/embedding/SplitInfo;", "", "Landroidx/window/embedding/ActivityStack;", "primaryActivityStack", "secondaryActivityStack", "", "splitRatio", "<init>", "(Landroidx/window/embedding/ActivityStack;Landroidx/window/embedding/ActivityStack;F)V", "Landroid/app/Activity;", "activity", "", "contains", "(Landroid/app/Activity;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Landroidx/window/embedding/ActivityStack;", "getPrimaryActivityStack", "()Landroidx/window/embedding/ActivityStack;", "b", "getSecondaryActivityStack", "c", "F", "getSplitRatio", "()F", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplitInfo {
    public final ActivityStack a;
    public final ActivityStack b;
    public final float c;

    public SplitInfo(@NotNull ActivityStack activityStack0, @NotNull ActivityStack activityStack1, float f) {
        Intrinsics.checkNotNullParameter(activityStack0, "primaryActivityStack");
        Intrinsics.checkNotNullParameter(activityStack1, "secondaryActivityStack");
        super();
        this.a = activityStack0;
        this.b = activityStack1;
        this.c = f;
    }

    public final boolean contains(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        return this.a.contains(activity0) || this.b.contains(activity0);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitInfo)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((SplitInfo)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SplitInfo)object0).b) ? this.c == ((SplitInfo)object0).c : false;
    }

    @NotNull
    public final ActivityStack getPrimaryActivityStack() {
        return this.a;
    }

    @NotNull
    public final ActivityStack getSecondaryActivityStack() {
        return this.b;
    }

    public final float getSplitRatio() {
        return this.c;
    }

    @Override
    public int hashCode() {
        return Float.hashCode(this.c) + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
    }

    @Override
    @NotNull
    public String toString() {
        String s = "SplitInfo:{" + ("primaryActivityStack=" + this.getPrimaryActivityStack() + ',') + ("secondaryActivityStack=" + this.getSecondaryActivityStack() + ',') + ("splitRatio=" + this.getSplitRatio() + '}');
        Intrinsics.checkNotNullExpressionValue(s, "StringBuilder().apply(builderAction).toString()");
        return s;
    }
}

