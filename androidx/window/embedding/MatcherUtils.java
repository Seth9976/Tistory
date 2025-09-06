package androidx.window.embedding;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@ExperimentalWindowApi
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000E\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001J!\u0010\b\u001A\u00020\u00052\b\u0010\u0003\u001A\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\u001F\u0010\r\u001A\u00020\u00052\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\u0004\u001A\u00020\u0002H\u0000¢\u0006\u0004\b\u000B\u0010\fR\u0014\u0010\u000E\u001A\u00020\u00058\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000E\u0010\u000FR\u0014\u0010\u0011\u001A\u00020\u00108\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/window/embedding/MatcherUtils;", "", "Landroid/content/ComponentName;", "activityComponent", "ruleComponent", "", "areComponentsMatching$window_release", "(Landroid/content/ComponentName;Landroid/content/ComponentName;)Z", "areComponentsMatching", "Landroid/app/Activity;", "activity", "areActivityOrIntentComponentsMatching$window_release", "(Landroid/app/Activity;Landroid/content/ComponentName;)Z", "areActivityOrIntentComponentsMatching", "sDebugMatchers", "Z", "", "sMatchersTag", "Ljava/lang/String;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 0x30)
public final class MatcherUtils {
    @NotNull
    public static final MatcherUtils INSTANCE = null;
    public static final boolean sDebugMatchers = false;
    @NotNull
    public static final String sMatchersTag = "SplitRuleResolution";

    static {
        MatcherUtils.INSTANCE = new MatcherUtils();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static boolean a(String s, String s1) {
        if(!StringsKt__StringsKt.contains$default(s1, "*", false, 2, null)) {
            return false;
        }
        if(Intrinsics.areEqual(s1, "*")) {
            return true;
        }
        if(StringsKt__StringsKt.indexOf$default(s1, "*", 0, false, 6, null) != StringsKt__StringsKt.lastIndexOf$default(s1, "*", 0, false, 6, null) || !p.endsWith$default(s1, "*", false, 2, null)) {
            throw new IllegalArgumentException("Name pattern with a wildcard must only contain a single wildcard in the end");
        }
        String s2 = s1.substring(0, s1.length() - 1);
        Intrinsics.checkNotNullExpressionValue(s2, "this as java.lang.String…ing(startIndex, endIndex)");
        return p.startsWith$default(s, s2, false, 2, null);
    }

    public final boolean areActivityOrIntentComponentsMatching$window_release(@NotNull Activity activity0, @NotNull ComponentName componentName0) {
        Intrinsics.checkNotNullParameter(activity0, "activity");
        Intrinsics.checkNotNullParameter(componentName0, "ruleComponent");
        if(this.areComponentsMatching$window_release(activity0.getComponentName(), componentName0)) {
            return true;
        }
        Intent intent0 = activity0.getIntent();
        if(intent0 != null) {
            ComponentName componentName1 = intent0.getComponent();
            return componentName1 == null ? false : MatcherUtils.INSTANCE.areComponentsMatching$window_release(componentName1, componentName0);
        }
        return false;
    }

    public final boolean areComponentsMatching$window_release(@Nullable ComponentName componentName0, @NotNull ComponentName componentName1) {
        boolean z;
        Intrinsics.checkNotNullParameter(componentName1, "ruleComponent");
        if(componentName0 == null) {
            return Intrinsics.areEqual(componentName1.getPackageName(), "*") && Intrinsics.areEqual(componentName1.getClassName(), "*");
        }
        String s = componentName0.toString();
        Intrinsics.checkNotNullExpressionValue(s, "activityComponent.toString()");
        if(StringsKt__StringsKt.contains$default(s, "*", false, 2, null)) {
            throw new IllegalArgumentException("Wildcard can only be part of the rule.");
        }
        if(Intrinsics.areEqual(componentName0.getPackageName(), componentName1.getPackageName())) {
            z = true;
        }
        else {
            String s1 = componentName0.getPackageName();
            Intrinsics.checkNotNullExpressionValue(s1, "activityComponent.packageName");
            String s2 = componentName1.getPackageName();
            Intrinsics.checkNotNullExpressionValue(s2, "ruleComponent.packageName");
            z = MatcherUtils.a(s1, s2);
        }
        if(!Intrinsics.areEqual(componentName0.getClassName(), componentName1.getClassName())) {
            String s3 = componentName0.getClassName();
            Intrinsics.checkNotNullExpressionValue(s3, "activityComponent.className");
            String s4 = componentName1.getClassName();
            Intrinsics.checkNotNullExpressionValue(s4, "ruleComponent.className");
            return MatcherUtils.a(s3, s4) ? z : false;
        }
        return z;
    }
}

