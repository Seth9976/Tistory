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
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\u000B\u0010\fJ\u0015\u0010\u000F\u001A\u00020\n2\u0006\u0010\u000E\u001A\u00020\r¢\u0006\u0004\b\u000F\u0010\u0010J\u001A\u0010\u0012\u001A\u00020\n2\b\u0010\u0011\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000F\u0010\u0015\u001A\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000F\u0010\u0017\u001A\u00020\u0004H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\u001CR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001F\u0010\u0018¨\u0006 "}, d2 = {"Landroidx/window/embedding/ActivityFilter;", "", "Landroid/content/ComponentName;", "componentName", "", "intentAction", "<init>", "(Landroid/content/ComponentName;Ljava/lang/String;)V", "Landroid/content/Intent;", "intent", "", "matchesIntent", "(Landroid/content/Intent;)Z", "Landroid/app/Activity;", "activity", "matchesActivity", "(Landroid/app/Activity;)Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Landroid/content/ComponentName;", "getComponentName", "()Landroid/content/ComponentName;", "b", "Ljava/lang/String;", "getIntentAction", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class ActivityFilter {
    public final ComponentName a;
    public final String b;

    public ActivityFilter(@NotNull ComponentName componentName0, @Nullable String s) {
        Intrinsics.checkNotNullParameter(componentName0, "componentName");
        super();
        this.a = componentName0;
        this.b = s;
        String s1 = componentName0.getPackageName();
        Intrinsics.checkNotNullExpressionValue(s1, "componentName.packageName");
        String s2 = componentName0.getClassName();
        Intrinsics.checkNotNullExpressionValue(s2, "componentName.className");
        if(s1.length() <= 0) {
            throw new IllegalArgumentException("Package name must not be empty");
        }
        if(s2.length() <= 0) {
            throw new IllegalArgumentException("Activity class name must not be empty.");
        }
        if(StringsKt__StringsKt.contains$default(s1, "*", false, 2, null) && StringsKt__StringsKt.indexOf$default(s1, "*", 0, false, 6, null) != s1.length() - 1) {
            throw new IllegalArgumentException("Wildcard in package name is only allowed at the end.");
        }
        if(StringsKt__StringsKt.contains$default(s2, "*", false, 2, null) && StringsKt__StringsKt.indexOf$default(s2, "*", 0, false, 6, null) != s2.length() - 1) {
            throw new IllegalArgumentException("Wildcard in class name is only allowed at the end.");
        }
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(!(object0 instanceof ActivityFilter)) {
            return false;
        }
        return Intrinsics.areEqual(this.a, ((ActivityFilter)object0).a) ? Intrinsics.areEqual(this.b, ((ActivityFilter)object0).b) : false;
    }

    @NotNull
    public final ComponentName getComponentName() {
        return this.a;
    }

    @Nullable
    public final String getIntentAction() {
        return this.b;
    }

    @Override
    public int hashCode() {
        int v = this.a.hashCode();
        return this.b == null ? v * 0x1F : v * 0x1F + this.b.hashCode();
    }

    public final boolean matchesActivity(@NotNull Activity activity0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        if(MatcherUtils.INSTANCE.areActivityOrIntentComponentsMatching$window_release(activity0, this.a)) {
            String s = this.b;
            if(s != null) {
                Intent intent0 = activity0.getIntent();
                return Intrinsics.areEqual(s, (intent0 == null ? null : intent0.getAction()));
            }
            return true;
        }
        return false;
    }

    public final boolean matchesIntent(@NotNull Intent intent0) {
        Intrinsics.checkNotNullParameter(intent0, "intent");
        ComponentName componentName0 = intent0.getComponent();
        return MatcherUtils.INSTANCE.areComponentsMatching$window_release(componentName0, this.a) && (this.b == null || Intrinsics.areEqual(this.b, intent0.getAction()));
    }

    @Override
    @NotNull
    public String toString() {
        return "ActivityFilter(componentName=" + this.a + ", intentAction=" + this.b + ')';
    }
}

