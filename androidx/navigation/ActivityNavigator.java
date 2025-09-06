package androidx.navigation;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.content.ContextCompat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.c;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.p;
import n4.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Name("activity")
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0017\u0018\u0000 \u001A2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001A\u001B\u001CB\u000F\u0012\u0006\u0010\u0004\u001A\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000F\u0010\u0007\u001A\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000F\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000BJ7\u0010\u0014\u001A\u0004\u0018\u00010\u00132\u0006\u0010\f\u001A\u00020\u00022\b\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u0010\u0010\u001A\u0004\u0018\u00010\u000F2\b\u0010\u0012\u001A\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001A\u00020\u00038\u0007¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001D"}, d2 = {"Landroidx/navigation/ActivityNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "createDestination", "()Landroidx/navigation/ActivityNavigator$Destination;", "", "popBackStack", "()Z", "destination", "Landroid/os/Bundle;", "args", "Landroidx/navigation/NavOptions;", "navOptions", "Landroidx/navigation/Navigator$Extras;", "navigatorExtras", "Landroidx/navigation/NavDestination;", "navigate", "(Landroidx/navigation/ActivityNavigator$Destination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "c", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "Companion", "Destination", "Extras", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,499:1\n179#2,2:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator\n*L\n45#1:500,2\n*E\n"})
public class ActivityNavigator extends Navigator {
    @Metadata(d1 = {"\u0000\u001E\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000E\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000B\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000B\u0010\tR\u0014\u0010\f\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001A\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u000E"}, d2 = {"Landroidx/navigation/ActivityNavigator$Companion;", "", "Landroid/app/Activity;", "activity", "", "applyPopAnimationsToPendingTransition", "(Landroid/app/Activity;)V", "", "EXTRA_NAV_CURRENT", "Ljava/lang/String;", "EXTRA_NAV_SOURCE", "EXTRA_POP_ENTER_ANIM", "EXTRA_POP_EXIT_ANIM", "LOG_TAG", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        public final void applyPopAnimationsToPendingTransition(@NotNull Activity activity0) {
            Intrinsics.checkNotNullParameter(activity0, "activity");
            Intent intent0 = activity0.getIntent();
            if(intent0 == null) {
                return;
            }
            int v = intent0.getIntExtra("android-support-navigation:ActivityNavigator:popEnterAnim", -1);
            int v1 = intent0.getIntExtra("android-support-navigation:ActivityNavigator:popExitAnim", -1);
            if(v != -1 || v1 != -1) {
                if(v == -1) {
                    v = 0;
                }
                if(v1 == -1) {
                    v1 = 0;
                }
                activity0.overridePendingTransition(v, v1);
            }
        }
    }

    @ClassType(Activity.class)
    @Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0015\b\u0017\u0018\u00002\u00020\u0001B\u0017\u0012\u000E\u0010\u0003\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u00A2\u0006\u0004\b\u0004\u0010\bJ\u0017\u0010\u000B\u001A\u00020\u00002\b\u0010\n\u001A\u0004\u0018\u00010\t\u00A2\u0006\u0004\b\u000B\u0010\fJ\u0017\u0010\u000F\u001A\u00020\u00002\b\u0010\u000E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u000F\u0010\u0010J\u001F\u0010\u0016\u001A\u00020\u00152\u0006\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0014\u001A\u00020\u0013H\u0017\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001A\u00020\u00002\b\u0010\u0018\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u0019\u0010\u0010J\u0017\u0010\u001C\u001A\u00020\u00002\b\u0010\u001B\u001A\u0004\u0018\u00010\u001A\u00A2\u0006\u0004\b\u001C\u0010\u001DJ\u0017\u0010\u001F\u001A\u00020\u00002\b\u0010\u001E\u001A\u0004\u0018\u00010\r\u00A2\u0006\u0004\b\u001F\u0010\u0010J\u0017\u0010\"\u001A\u00020\u00002\b\u0010!\u001A\u0004\u0018\u00010 \u00A2\u0006\u0004\b\"\u0010#J\u000F\u0010%\u001A\u00020$H\u0017\u00A2\u0006\u0004\b%\u0010&J\u000F\u0010\'\u001A\u00020\rH\u0016\u00A2\u0006\u0004\b\'\u0010(J\u001A\u0010+\u001A\u00020$2\b\u0010*\u001A\u0004\u0018\u00010)H\u0096\u0002\u00A2\u0006\u0004\b+\u0010,J\u000F\u0010.\u001A\u00020-H\u0016\u00A2\u0006\u0004\b.\u0010/R(\u0010\n\u001A\u0004\u0018\u00010\t2\b\u00100\u001A\u0004\u0018\u00010\t8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b1\u00102\u001A\u0004\b3\u00104R(\u0010\u000E\u001A\u0004\u0018\u00010\r2\b\u00100\u001A\u0004\u0018\u00010\r8\u0006@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b5\u00106\u001A\u0004\b7\u0010(R(\u00108\u001A\u0004\u0018\u00010\r2\b\u00100\u001A\u0004\u0018\u00010\r8F@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b8\u00106\u001A\u0004\b9\u0010(R(\u0010:\u001A\u0004\u0018\u00010\u001A2\b\u00100\u001A\u0004\u0018\u00010\u001A8F@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b:\u0010;\u001A\u0004\b<\u0010=R(\u0010\u001E\u001A\u0004\u0018\u00010\r2\b\u00100\u001A\u0004\u0018\u00010\r8F@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b\u001E\u00106\u001A\u0004\b>\u0010(R(\u0010!\u001A\u0004\u0018\u00010 2\b\u00100\u001A\u0004\u0018\u00010 8F@BX\u0086\u000E\u00A2\u0006\f\n\u0004\b!\u0010?\u001A\u0004\b@\u0010A\u00A8\u0006B"}, d2 = {"Landroidx/navigation/ActivityNavigator$Destination;", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/Navigator;", "activityNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroidx/navigation/NavigatorProvider;", "navigatorProvider", "(Landroidx/navigation/NavigatorProvider;)V", "Landroid/content/Intent;", "intent", "setIntent", "(Landroid/content/Intent;)Landroidx/navigation/ActivityNavigator$Destination;", "", "dataPattern", "setDataPattern", "(Ljava/lang/String;)Landroidx/navigation/ActivityNavigator$Destination;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "packageName", "setTargetPackage", "Landroid/content/ComponentName;", "name", "setComponentName", "(Landroid/content/ComponentName;)Landroidx/navigation/ActivityNavigator$Destination;", "action", "setAction", "Landroid/net/Uri;", "data", "setData", "(Landroid/net/Uri;)Landroidx/navigation/ActivityNavigator$Destination;", "", "supportsActions", "()Z", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "<set-?>", "k", "Landroid/content/Intent;", "getIntent", "()Landroid/content/Intent;", "l", "Ljava/lang/String;", "getDataPattern", "targetPackage", "getTargetPackage", "component", "Landroid/content/ComponentName;", "getComponent", "()Landroid/content/ComponentName;", "getAction", "Landroid/net/Uri;", "getData", "()Landroid/net/Uri;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nActivityNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n*L\n1#1,499:1\n232#2,3:500\n*S KotlinDebug\n*F\n+ 1 ActivityNavigator.kt\nandroidx/navigation/ActivityNavigator$Destination\n*L\n256#1:500,3\n*E\n"})
    public static class Destination extends NavDestination {
        public Intent k;
        public String l;

        public Destination(@NotNull Navigator navigator0) {
            Intrinsics.checkNotNullParameter(navigator0, "activityNavigator");
            super(navigator0);
        }

        public Destination(@NotNull NavigatorProvider navigatorProvider0) {
            Intrinsics.checkNotNullParameter(navigatorProvider0, "navigatorProvider");
            this(navigatorProvider0.getNavigator(ActivityNavigator.class));
        }

        public static String a(Context context0, String s) {
            if(s != null) {
                Intrinsics.checkNotNullExpressionValue("net.daum.android.tistoryapp", "context.packageName");
                return p.replace$default(s, "${applicationId}", "net.daum.android.tistoryapp", false, 4, null);
            }
            return null;
        }

        @Override  // androidx.navigation.NavDestination
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(object0 != null && object0 instanceof Destination && super.equals(object0)) {
                Intent intent0 = this.k;
                return intent0 == null ? ((Destination)object0).k == null && Intrinsics.areEqual(this.l, ((Destination)object0).l) : intent0.filterEquals(((Destination)object0).k) && Intrinsics.areEqual(this.l, ((Destination)object0).l);
            }
            return false;
        }

        @Nullable
        public final String getAction() {
            return this.k == null ? null : this.k.getAction();
        }

        @Nullable
        public final ComponentName getComponent() {
            return this.k == null ? null : this.k.getComponent();
        }

        @Nullable
        public final Uri getData() {
            return this.k == null ? null : this.k.getData();
        }

        @Nullable
        public final String getDataPattern() {
            return this.l;
        }

        @Nullable
        public final Intent getIntent() {
            return this.k;
        }

        @Nullable
        public final String getTargetPackage() {
            return this.k == null ? null : this.k.getPackage();
        }

        @Override  // androidx.navigation.NavDestination
        public int hashCode() {
            int v = super.hashCode();
            int v1 = 0;
            int v2 = this.k == null ? 0 : this.k.filterHashCode();
            String s = this.l;
            if(s != null) {
                v1 = s.hashCode();
            }
            return (v * 0x1F + v2) * 0x1F + v1;
        }

        @Override  // androidx.navigation.NavDestination
        @CallSuper
        public void onInflate(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
            super.onInflate(context0, attributeSet0);
            TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.ActivityNavigator);
            Intrinsics.checkNotNullExpressionValue(typedArray0, "context.resources.obtain…leable.ActivityNavigator)");
            this.setTargetPackage(Destination.a(context0, typedArray0.getString(styleable.ActivityNavigator_targetPackage)));
            String s = typedArray0.getString(styleable.ActivityNavigator_android_name);
            if(s != null) {
                if(s.charAt(0) == 46) {
                    s = "net.daum.android.tistoryapp" + s;
                }
                this.setComponentName(new ComponentName(context0, s));
            }
            this.setAction(typedArray0.getString(styleable.ActivityNavigator_action));
            String s1 = Destination.a(context0, typedArray0.getString(styleable.ActivityNavigator_data));
            if(s1 != null) {
                this.setData(Uri.parse(s1));
            }
            this.setDataPattern(Destination.a(context0, typedArray0.getString(styleable.ActivityNavigator_dataPattern)));
            typedArray0.recycle();
        }

        @NotNull
        public final Destination setAction(@Nullable String s) {
            if(this.k == null) {
                this.k = new Intent();
            }
            Intent intent0 = this.k;
            Intrinsics.checkNotNull(intent0);
            intent0.setAction(s);
            return this;
        }

        @NotNull
        public final Destination setComponentName(@Nullable ComponentName componentName0) {
            if(this.k == null) {
                this.k = new Intent();
            }
            Intent intent0 = this.k;
            Intrinsics.checkNotNull(intent0);
            intent0.setComponent(componentName0);
            return this;
        }

        @NotNull
        public final Destination setData(@Nullable Uri uri0) {
            if(this.k == null) {
                this.k = new Intent();
            }
            Intent intent0 = this.k;
            Intrinsics.checkNotNull(intent0);
            intent0.setData(uri0);
            return this;
        }

        @NotNull
        public final Destination setDataPattern(@Nullable String s) {
            this.l = s;
            return this;
        }

        @NotNull
        public final Destination setIntent(@Nullable Intent intent0) {
            this.k = intent0;
            return this;
        }

        @NotNull
        public final Destination setTargetPackage(@Nullable String s) {
            if(this.k == null) {
                this.k = new Intent();
            }
            Intent intent0 = this.k;
            Intrinsics.checkNotNull(intent0);
            intent0.setPackage(s);
            return this;
        }

        @Override  // androidx.navigation.NavDestination
        @RestrictTo({Scope.LIBRARY_GROUP})
        public boolean supportsActions() {
            return false;
        }

        @Override  // androidx.navigation.NavDestination
        @NotNull
        public String toString() {
            ComponentName componentName0 = this.getComponent();
            StringBuilder stringBuilder0 = new StringBuilder();
            stringBuilder0.append(super.toString());
            if(componentName0 == null) {
                String s = this.getAction();
                if(s != null) {
                    stringBuilder0.append(" action=");
                    stringBuilder0.append(s);
                }
            }
            else {
                stringBuilder0.append(" class=");
                stringBuilder0.append(componentName0.getClassName());
            }
            String s1 = stringBuilder0.toString();
            Intrinsics.checkNotNullExpressionValue(s1, "sb.toString()");
            return s1;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0010B\u001B\b\u0000\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000BR\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u0011"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "", "flags", "Landroidx/core/app/ActivityOptionsCompat;", "activityOptions", "<init>", "(ILandroidx/core/app/ActivityOptionsCompat;)V", "a", "I", "getFlags", "()I", "b", "Landroidx/core/app/ActivityOptionsCompat;", "getActivityOptions", "()Landroidx/core/app/ActivityOptionsCompat;", "Builder", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Extras implements androidx.navigation.Navigator.Extras {
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001A\u00020\u00002\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001A\u00020\u00002\u0006\u0010\t\u001A\u00020\b¢\u0006\u0004\b\n\u0010\u000BJ\r\u0010\r\u001A\u00020\f¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/navigation/ActivityNavigator$Extras$Builder;", "", "<init>", "()V", "", "flags", "addFlags", "(I)Landroidx/navigation/ActivityNavigator$Extras$Builder;", "Landroidx/core/app/ActivityOptionsCompat;", "activityOptions", "setActivityOptions", "(Landroidx/core/app/ActivityOptionsCompat;)Landroidx/navigation/ActivityNavigator$Extras$Builder;", "Landroidx/navigation/ActivityNavigator$Extras;", "build", "()Landroidx/navigation/ActivityNavigator$Extras;", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Builder {
            public int a;
            public ActivityOptionsCompat b;

            @NotNull
            public final Builder addFlags(int v) {
                this.a |= v;
                return this;
            }

            @NotNull
            public final Extras build() {
                return new Extras(this.a, this.b);
            }

            @NotNull
            public final Builder setActivityOptions(@NotNull ActivityOptionsCompat activityOptionsCompat0) {
                Intrinsics.checkNotNullParameter(activityOptionsCompat0, "activityOptions");
                this.b = activityOptionsCompat0;
                return this;
            }
        }

        public final int a;
        public final ActivityOptionsCompat b;

        public Extras(int v, @Nullable ActivityOptionsCompat activityOptionsCompat0) {
            this.a = v;
            this.b = activityOptionsCompat0;
        }

        @Nullable
        public final ActivityOptionsCompat getActivityOptions() {
            return this.b;
        }

        public final int getFlags() {
            return this.a;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final Context c;
    public final Activity d;

    static {
        ActivityNavigator.Companion = new Companion(null);
    }

    public ActivityNavigator(@NotNull Context context0) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.c = context0;
        for(Object object1: SequencesKt__SequencesKt.generateSequence(context0, a.x)) {
            if(((Context)object1) instanceof Activity) {
                object0 = object1;
                break;
            }
        }
        this.d = (Activity)object0;
    }

    @JvmStatic
    public static final void applyPopAnimationsToPendingTransition(@NotNull Activity activity0) {
        ActivityNavigator.Companion.applyPopAnimationsToPendingTransition(activity0);
    }

    @NotNull
    public Destination createDestination() {
        return new Destination(this);
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination createDestination() {
        return this.createDestination();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Context getContext() {
        return this.c;
    }

    @Nullable
    public NavDestination navigate(@NotNull Destination activityNavigator$Destination0, @Nullable Bundle bundle0, @Nullable NavOptions navOptions0, @Nullable androidx.navigation.Navigator.Extras navigator$Extras0) {
        Intrinsics.checkNotNullParameter(activityNavigator$Destination0, "destination");
        if(activityNavigator$Destination0.getIntent() == null) {
            throw new IllegalStateException(("Destination " + activityNavigator$Destination0.getId() + " does not have an Intent set.").toString());
        }
        Intent intent0 = new Intent(activityNavigator$Destination0.getIntent());
        if(bundle0 != null) {
            intent0.putExtras(bundle0);
            String s = activityNavigator$Destination0.getDataPattern();
            if(s != null && s.length() != 0) {
                StringBuffer stringBuffer0 = new StringBuffer();
                Matcher matcher0 = Pattern.compile("\\{(.+?)\\}").matcher(s);
                while(matcher0.find()) {
                    String s1 = matcher0.group(1);
                    if(!bundle0.containsKey(s1)) {
                        throw new IllegalArgumentException("Could not find " + s1 + " in " + bundle0 + " to fill data pattern " + s);
                    }
                    matcher0.appendReplacement(stringBuffer0, "");
                    stringBuffer0.append(Uri.encode(String.valueOf(bundle0.get(s1))));
                }
                matcher0.appendTail(stringBuffer0);
                intent0.setData(Uri.parse(stringBuffer0.toString()));
            }
        }
        if(navigator$Extras0 instanceof Extras) {
            intent0.addFlags(((Extras)navigator$Extras0).getFlags());
        }
        Activity activity0 = this.d;
        if(activity0 == null) {
            intent0.addFlags(0x10000000);
        }
        if(navOptions0 != null && navOptions0.shouldLaunchSingleTop()) {
            intent0.addFlags(0x20000000);
        }
        if(activity0 != null) {
            Intent intent1 = activity0.getIntent();
            if(intent1 != null) {
                int v = intent1.getIntExtra("android-support-navigation:ActivityNavigator:current", 0);
                if(v != 0) {
                    intent0.putExtra("android-support-navigation:ActivityNavigator:source", v);
                }
            }
        }
        intent0.putExtra("android-support-navigation:ActivityNavigator:current", activityNavigator$Destination0.getId());
        Context context0 = this.c;
        Resources resources0 = context0.getResources();
        if(navOptions0 != null) {
            int v1 = navOptions0.getPopEnterAnim();
            int v2 = navOptions0.getPopExitAnim();
            if((v1 <= 0 || !Intrinsics.areEqual(resources0.getResourceTypeName(v1), "animator")) && (v2 <= 0 || !Intrinsics.areEqual(resources0.getResourceTypeName(v2), "animator"))) {
                intent0.putExtra("android-support-navigation:ActivityNavigator:popEnterAnim", v1);
                intent0.putExtra("android-support-navigation:ActivityNavigator:popExitAnim", v2);
            }
            else {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring popEnter resource " + resources0.getResourceName(v1) + " and popExit resource " + resources0.getResourceName(v2) + " when launching " + activityNavigator$Destination0);
            }
        }
        if(navigator$Extras0 instanceof Extras) {
            ActivityOptionsCompat activityOptionsCompat0 = ((Extras)navigator$Extras0).getActivityOptions();
            if(activityOptionsCompat0 == null) {
                context0.startActivity(intent0);
            }
            else {
                ContextCompat.startActivity(context0, intent0, activityOptionsCompat0.toBundle());
            }
        }
        else {
            context0.startActivity(intent0);
        }
        if(navOptions0 != null && activity0 != null) {
            int v3 = navOptions0.getEnterAnim();
            int v4 = navOptions0.getExitAnim();
            if(v3 > 0 && Intrinsics.areEqual(resources0.getResourceTypeName(v3), "animator") || v4 > 0 && Intrinsics.areEqual(resources0.getResourceTypeName(v4), "animator")) {
                Log.w("ActivityNavigator", "Activity destinations do not support Animator resource. Ignoring enter resource " + resources0.getResourceName(v3) + " and exit resource " + resources0.getResourceName(v4) + "when launching " + activityNavigator$Destination0);
                return null;
            }
            if(v3 >= 0 || v4 >= 0) {
                activity0.overridePendingTransition(c.coerceAtLeast(v3, 0), c.coerceAtLeast(v4, 0));
            }
        }
        return null;
    }

    @Override  // androidx.navigation.Navigator
    public NavDestination navigate(NavDestination navDestination0, Bundle bundle0, NavOptions navOptions0, androidx.navigation.Navigator.Extras navigator$Extras0) {
        return this.navigate(((Destination)navDestination0), bundle0, navOptions0, navigator$Extras0);
    }

    @Override  // androidx.navigation.Navigator
    public boolean popBackStack() {
        Activity activity0 = this.d;
        if(activity0 != null) {
            activity0.finish();
            return true;
        }
        return false;
    }
}

