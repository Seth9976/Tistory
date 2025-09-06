package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000E\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0004\u001A\u00020\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001D\u0010\r\u001A\u00020\f2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u000B\u001A\u00020\t¢\u0006\u0004\b\r\u0010\u000EJ\u001D\u0010\u0011\u001A\u00020\f2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0010\u001A\u00020\u000F¢\u0006\u0004\b\u0011\u0010\u0012J\u001A\u0010\u0014\u001A\u00020\f2\b\u0010\u0013\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000F\u0010\u0017\u001A\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000F\u0010\u0019\u001A\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\u001AR\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001B\u0010\u001C\u001A\u0004\b\u001D\u0010\u001ER\u0017\u0010\u0004\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001F\u0010\u001C\u001A\u0004\b \u0010\u001ER\u0019\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001A\u0004\b#\u0010\u001A¨\u0006$"}, d2 = {"Landroidx/window/embedding/SplitPairFilter;", "", "Landroid/content/ComponentName;", "primaryActivityName", "secondaryActivityName", "", "secondaryActivityIntentAction", "<init>", "(Landroid/content/ComponentName;Landroid/content/ComponentName;Ljava/lang/String;)V", "Landroid/app/Activity;", "primaryActivity", "secondaryActivity", "", "matchesActivityPair", "(Landroid/app/Activity;Landroid/app/Activity;)Z", "Landroid/content/Intent;", "secondaryActivityIntent", "matchesActivityIntentPair", "(Landroid/app/Activity;Landroid/content/Intent;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/content/ComponentName;", "getPrimaryActivityName", "()Landroid/content/ComponentName;", "b", "getSecondaryActivityName", "c", "Ljava/lang/String;", "getSecondaryActivityIntentAction", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class SplitPairFilter {
    public final ComponentName a;
    public final ComponentName b;
    public final String c;

    public SplitPairFilter(@NotNull ComponentName componentName0, @NotNull ComponentName componentName1, @Nullable String s) {
        Intrinsics.checkNotNullParameter(componentName0, "primaryActivityName");
        Intrinsics.checkNotNullParameter(componentName1, "secondaryActivityName");
        super();
        this.a = componentName0;
        this.b = componentName1;
        this.c = s;
        String s1 = componentName0.getPackageName();
        Intrinsics.checkNotNullExpressionValue(s1, "primaryActivityName.packageName");
        String s2 = componentName0.getClassName();
        Intrinsics.checkNotNullExpressionValue(s2, "primaryActivityName.className");
        String s3 = componentName1.getPackageName();
        Intrinsics.checkNotNullExpressionValue(s3, "secondaryActivityName.packageName");
        String s4 = componentName1.getClassName();
        Intrinsics.checkNotNullExpressionValue(s4, "secondaryActivityName.className");
        if(s1.length() == 0 || s3.length() == 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if(s2.length() == 0 || s4.length() == 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if(StringsKt__StringsKt.contains$default(s1, "*", false, 2, null) && StringsKt__StringsKt.indexOf$default(s1, "*", 0, false, 6, null) != s1.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if(StringsKt__StringsKt.contains$default(s2, "*", false, 2, null) && StringsKt__StringsKt.indexOf$default(s2, "*", 0, false, 6, null) != s2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
        if(StringsKt__StringsKt.contains$default(s3, "*", false, 2, null) && StringsKt__StringsKt.indexOf$default(s3, "*", 0, false, 6, null) != s3.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if(StringsKt__StringsKt.contains$default(s4, "*", false, 2, null) && StringsKt__StringsKt.indexOf$default(s4, "*", 0, false, 6, null) != s4.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof SplitPairFilter)) {
            return false;
        }
        if(!Intrinsics.areEqual(this.a, ((SplitPairFilter)object0).a)) {
            return false;
        }
        return Intrinsics.areEqual(this.b, ((SplitPairFilter)object0).b) ? Intrinsics.areEqual(this.c, ((SplitPairFilter)object0).c) : false;
    }

    @NotNull
    public final ComponentName getPrimaryActivityName() {
        return this.a;
    }

    @Nullable
    public final String getSecondaryActivityIntentAction() {
        return this.c;
    }

    @NotNull
    public final ComponentName getSecondaryActivityName() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        int v1 = this.b.hashCode();
        return this.c == null ? (v1 + v * 0x1F) * 0x1F : (v1 + v * 0x1F) * 0x1F + this.c.hashCode();
    }

    public final boolean matchesActivityIntentPair(@NotNull Activity activity0, @NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(activity0, "primaryActivity");
        Intrinsics.checkNotNullParameter(intent0, "secondaryActivityIntent");
        ComponentName componentName0 = activity0.getComponentName();
        return MatcherUtils.INSTANCE.areComponentsMatching$window_release(componentName0, this.a) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(intent0.getComponent(), this.b) && (this.c == null || Intrinsics.areEqual(this.c, intent0.getAction()));
    }

    public final boolean matchesActivityPair(@NotNull Activity activity0, @NotNull Activity activity1) {
        Intrinsics.checkNotNullParameter(activity0, "primaryActivity");
        Intrinsics.checkNotNullParameter(activity1, "secondaryActivity");
        boolean z = MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity0.getComponentName(), this.a) && MatcherUtils.INSTANCE.areComponentsMatching$window_release(activity1.getComponentName(), this.b);
        if(activity1.getIntent() != null) {
            if(z) {
                Intent intent0 = activity1.getIntent();
                Intrinsics.checkNotNullExpressionValue(intent0, "secondaryActivity.intent");
                return this.matchesActivityIntentPair(activity0, intent0);
            }
            return false;
        }
        return z;
    }

    @Override
    @NotNull
    public String toString() {
        return "SplitPairFilter{primaryActivityName=" + this.a + ", secondaryActivityName=" + this.b + ", secondaryActivityAction=" + this.c + '}';
    }
}

