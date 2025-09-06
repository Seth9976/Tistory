package androidx.fragment.app.strictmode;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.ViewGroup;
import androidx.activity.m;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.f0;
import kotlin.collections.x;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000B\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000B\bÆ\u0002\u0018\u00002\u00020\u0001:\u0003,-.J\u001F\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000B\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\b\u0010\n\u001A\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000B\u0010\fJ\'\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\r\u001A\u00020\u00022\u0006\u0010\u000F\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0013J\u001F\u0010\u0017\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0016\u001A\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\'\u0010\u001C\u001A\u00020\u00062\u0006\u0010\u0019\u001A\u00020\u00022\u0006\u0010\u001A\u001A\u00020\u00022\u0006\u0010\u001B\u001A\u00020\u000EH\u0007¢\u0006\u0004\b\u001C\u0010\u0011J\u0017\u0010\u001D\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u001D\u0010\u0013J\u0017\u0010\u001E\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u0002H\u0007¢\u0006\u0004\b\u001E\u0010\u0013J\u001F\u0010\u001F\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\n\u001A\u00020\tH\u0007¢\u0006\u0004\b\u001F\u0010\fJ\u0017\u0010\"\u001A\u00020\u00062\u0006\u0010!\u001A\u00020 H\u0007¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001A\u00020$8\u0006@\u0006X\u0086\u000E¢\u0006\u0012\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode;", "", "Landroidx/fragment/app/Fragment;", "fragment", "", "previousFragmentId", "", "onFragmentReuse", "(Landroidx/fragment/app/Fragment;Ljava/lang/String;)V", "Landroid/view/ViewGroup;", "container", "onFragmentTagUsage", "(Landroidx/fragment/app/Fragment;Landroid/view/ViewGroup;)V", "expectedParentFragment", "", "containerId", "onWrongNestedHierarchy", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;I)V", "onSetRetainInstanceUsage", "(Landroidx/fragment/app/Fragment;)V", "onGetRetainInstanceUsage", "", "isVisibleToUser", "onSetUserVisibleHint", "(Landroidx/fragment/app/Fragment;Z)V", "violatingFragment", "targetFragment", "requestCode", "onSetTargetFragmentUsage", "onGetTargetFragmentUsage", "onGetTargetFragmentRequestCodeUsage", "onWrongFragmentContainer", "Landroidx/fragment/app/strictmode/Violation;", "violation", "onPolicyViolation", "(Landroidx/fragment/app/strictmode/Violation;)V", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "a", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "getDefaultPolicy", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "setDefaultPolicy", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;)V", "defaultPolicy", "Flag", "OnViolationListener", "Policy", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FragmentStrictMode {
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000B"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "", "PENALTY_LOG", "PENALTY_DEATH", "DETECT_FRAGMENT_REUSE", "DETECT_FRAGMENT_TAG_USAGE", "DETECT_WRONG_NESTED_HIERARCHY", "DETECT_RETAIN_INSTANCE_USAGE", "DETECT_SET_USER_VISIBLE_HINT", "DETECT_TARGET_FRAGMENT_USAGE", "DETECT_WRONG_FRAGMENT_CONTAINER", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static enum Flag {
        PENALTY_LOG,
        PENALTY_DEATH,
        DETECT_FRAGMENT_REUSE,
        DETECT_FRAGMENT_TAG_USAGE,
        DETECT_WRONG_NESTED_HIERARCHY,
        DETECT_RETAIN_INSTANCE_USAGE,
        DETECT_SET_USER_VISIBLE_HINT,
        DETECT_TARGET_FRAGMENT_USAGE,
        DETECT_WRONG_FRAGMENT_CONTAINER;

    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001A\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "", "onViolation", "", "violation", "Landroidx/fragment/app/strictmode/Violation;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface OnViolationListener {
        void onViolation(@NotNull Violation arg1);
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000E\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 \u001C2\u00020\u0001:\u0002\u001D\u001CBC\b\u0000\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001A\u0004\u0018\u00010\u0005\u0012 \u0010\f\u001A\u001C\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\n0\t0\u0007¢\u0006\u0004\b\r\u0010\u000ER \u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001C\u0010\u0006\u001A\u0004\u0018\u00010\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016R4\u0010\u001B\u001A\u001C\u0012\u0004\u0012\u00020\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\u000B0\n0\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001A¨\u0006\u001E"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Flag;", "flags", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "listener", "", "", "", "Ljava/lang/Class;", "Landroidx/fragment/app/strictmode/Violation;", "allowedViolations", "<init>", "(Ljava/util/Set;Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;Ljava/util/Map;)V", "a", "Ljava/util/Set;", "getFlags$fragment_release", "()Ljava/util/Set;", "b", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "getListener$fragment_release", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "c", "Ljava/util/Map;", "getMAllowedViolations$fragment_release", "()Ljava/util/Map;", "mAllowedViolations", "Companion", "Builder", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Policy {
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000F\u0010\u0004\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u000F\u0010\u0006\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\t\u001A\u00020\u00002\u0006\u0010\b\u001A\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\u000B\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u000B\u0010\u0005J\u000F\u0010\f\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0005J\u000F\u0010\r\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0005J\u000F\u0010\u000E\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u000E\u0010\u0005J\u000F\u0010\u000F\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u000F\u0010\u0005J\u000F\u0010\u0010\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0005J\u000F\u0010\u0011\u001A\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0005J/\u0010\u0017\u001A\u00020\u00002\u000E\u0010\u0014\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u00122\u000E\u0010\u0016\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\'\u0010\u0017\u001A\u00020\u00002\u0006\u0010\u0014\u001A\u00020\u00192\u000E\u0010\u0016\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u001AJ\r\u0010\u001C\u001A\u00020\u001B¢\u0006\u0004\b\u001C\u0010\u001D¨\u0006\u001E"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "<init>", "()V", "penaltyLog", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "penaltyDeath", "Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;", "listener", "penaltyListener", "(Landroidx/fragment/app/strictmode/FragmentStrictMode$OnViolationListener;)Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "detectFragmentReuse", "detectFragmentTagUsage", "detectWrongNestedHierarchy", "detectRetainInstanceUsage", "detectSetUserVisibleHint", "detectTargetFragmentUsage", "detectWrongFragmentContainer", "Ljava/lang/Class;", "Landroidx/fragment/app/Fragment;", "fragmentClass", "Landroidx/fragment/app/strictmode/Violation;", "violationClass", "allowViolation", "(Ljava/lang/Class;Ljava/lang/Class;)Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Builder;", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "build", "()Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Builder {
            public final LinkedHashSet a;
            public OnViolationListener b;
            public final LinkedHashMap c;

            public Builder() {
                this.a = new LinkedHashSet();
                this.c = new LinkedHashMap();
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder allowViolation(@NotNull Class class0, @NotNull Class class1) {
                Intrinsics.checkNotNullParameter(class0, "fragmentClass");
                Intrinsics.checkNotNullParameter(class1, "violationClass");
                String s = class0.getName();
                Intrinsics.checkNotNullExpressionValue(s, "fragmentClassString");
                return this.allowViolation(s, class1);
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder allowViolation(@NotNull String s, @NotNull Class class0) {
                Intrinsics.checkNotNullParameter(s, "fragmentClass");
                Intrinsics.checkNotNullParameter(class0, "violationClass");
                LinkedHashMap linkedHashMap0 = this.c;
                Set set0 = (Set)linkedHashMap0.get(s);
                if(set0 == null) {
                    set0 = new LinkedHashSet();
                }
                set0.add(class0);
                linkedHashMap0.put(s, set0);
                return this;
            }

            @NotNull
            public final Policy build() {
                LinkedHashSet linkedHashSet0 = this.a;
                if(this.b == null && !linkedHashSet0.contains(Flag.PENALTY_DEATH)) {
                    this.penaltyLog();
                }
                return new Policy(linkedHashSet0, this.b, this.c);
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectFragmentReuse() {
                this.a.add(Flag.DETECT_FRAGMENT_REUSE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectFragmentTagUsage() {
                this.a.add(Flag.DETECT_FRAGMENT_TAG_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectRetainInstanceUsage() {
                this.a.add(Flag.DETECT_RETAIN_INSTANCE_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectSetUserVisibleHint() {
                this.a.add(Flag.DETECT_SET_USER_VISIBLE_HINT);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectTargetFragmentUsage() {
                this.a.add(Flag.DETECT_TARGET_FRAGMENT_USAGE);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectWrongFragmentContainer() {
                this.a.add(Flag.DETECT_WRONG_FRAGMENT_CONTAINER);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder detectWrongNestedHierarchy() {
                this.a.add(Flag.DETECT_WRONG_NESTED_HIERARCHY);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder penaltyDeath() {
                this.a.add(Flag.PENALTY_DEATH);
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder penaltyListener(@NotNull OnViolationListener fragmentStrictMode$OnViolationListener0) {
                Intrinsics.checkNotNullParameter(fragmentStrictMode$OnViolationListener0, "listener");
                this.b = fragmentStrictMode$OnViolationListener0;
                return this;
            }

            @SuppressLint({"BuilderSetStyle"})
            @NotNull
            public final Builder penaltyLog() {
                this.a.add(Flag.PENALTY_LOG);
                return this;
            }
        }

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001A\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy$Companion;", "", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "LAX", "Landroidx/fragment/app/strictmode/FragmentStrictMode$Policy;", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
        public static final class Companion {
            public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
            }
        }

        @NotNull
        public static final Companion Companion;
        @JvmField
        @NotNull
        public static final Policy LAX;
        public final Set a;
        public final OnViolationListener b;
        public final LinkedHashMap c;

        static {
            Policy.Companion = new Companion(null);
            Policy.LAX = new Policy(f0.emptySet(), null, x.emptyMap());
        }

        public Policy(@NotNull Set set0, @Nullable OnViolationListener fragmentStrictMode$OnViolationListener0, @NotNull Map map0) {
            Intrinsics.checkNotNullParameter(set0, "flags");
            Intrinsics.checkNotNullParameter(map0, "allowedViolations");
            super();
            this.a = set0;
            this.b = fragmentStrictMode$OnViolationListener0;
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            for(Object object0: map0.entrySet()) {
                linkedHashMap0.put(((String)((Map.Entry)object0).getKey()), ((Set)((Map.Entry)object0).getValue()));
            }
            this.c = linkedHashMap0;
        }

        @NotNull
        public final Set getFlags$fragment_release() {
            return this.a;
        }

        @Nullable
        public final OnViolationListener getListener$fragment_release() {
            return this.b;
        }

        @NotNull
        public final Map getMAllowedViolations$fragment_release() {
            return this.c;
        }
    }

    @NotNull
    public static final FragmentStrictMode INSTANCE;
    public static Policy a;

    static {
        FragmentStrictMode.INSTANCE = new FragmentStrictMode();  // 初始化器: Ljava/lang/Object;-><init>()V
        FragmentStrictMode.a = Policy.LAX;
    }

    public static Policy a(Fragment fragment0) {
        while(fragment0 != null) {
            if(fragment0.isAdded()) {
                FragmentManager fragmentManager0 = fragment0.getParentFragmentManager();
                Intrinsics.checkNotNullExpressionValue(fragmentManager0, "declaringFragment.parentFragmentManager");
                if(fragmentManager0.getStrictModePolicy() != null) {
                    Policy fragmentStrictMode$Policy0 = fragmentManager0.getStrictModePolicy();
                    Intrinsics.checkNotNull(fragmentStrictMode$Policy0);
                    return fragmentStrictMode$Policy0;
                }
            }
            fragment0 = fragment0.getParentFragment();
        }
        return FragmentStrictMode.a;
    }

    public static void b(Policy fragmentStrictMode$Policy0, Violation violation0) {
        Fragment fragment0 = violation0.getFragment();
        String s = fragment0.getClass().getName();
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.PENALTY_LOG)) {
            Log.d("FragmentStrictMode", "Policy violation in " + s, violation0);
        }
        if(fragmentStrictMode$Policy0.getListener$fragment_release() != null) {
            FragmentStrictMode.d(fragment0, new m(20, fragmentStrictMode$Policy0, violation0));
        }
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.PENALTY_DEATH)) {
            FragmentStrictMode.d(fragment0, new m(21, s, violation0));
        }
    }

    public static void c(Violation violation0) {
        if(FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "StrictMode violation in " + violation0.getFragment().getClass().getName(), violation0);
        }
    }

    public static void d(Fragment fragment0, Runnable runnable0) {
        if(fragment0.isAdded()) {
            Handler handler0 = fragment0.getParentFragmentManager().getHost().getHandler();
            Intrinsics.checkNotNullExpressionValue(handler0, "fragment.parentFragmentManager.host.handler");
            if(Intrinsics.areEqual(handler0.getLooper(), Looper.myLooper())) {
                runnable0.run();
                return;
            }
            handler0.post(runnable0);
            return;
        }
        runnable0.run();
    }

    public static boolean e(Policy fragmentStrictMode$Policy0, Class class0, Class class1) {
        Set set0 = (Set)fragmentStrictMode$Policy0.getMAllowedViolations$fragment_release().get(class0.getName());
        if(set0 == null) {
            return true;
        }
        return Intrinsics.areEqual(class1.getSuperclass(), Violation.class) || !CollectionsKt___CollectionsKt.contains(set0, class1.getSuperclass()) ? !set0.contains(class1) : false;
    }

    @NotNull
    public final Policy getDefaultPolicy() {
        return FragmentStrictMode.a;
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onFragmentReuse(@NotNull Fragment fragment0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(s, "previousFragmentId");
        FragmentReuseViolation fragmentReuseViolation0 = new FragmentReuseViolation(fragment0, s);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(fragmentReuseViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_REUSE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), FragmentReuseViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, fragmentReuseViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onFragmentTagUsage(@NotNull Fragment fragment0, @Nullable ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        FragmentTagUsageViolation fragmentTagUsageViolation0 = new FragmentTagUsageViolation(fragment0, viewGroup0);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(fragmentTagUsageViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_FRAGMENT_TAG_USAGE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), FragmentTagUsageViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, fragmentTagUsageViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onGetRetainInstanceUsage(@NotNull Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        GetRetainInstanceUsageViolation getRetainInstanceUsageViolation0 = new GetRetainInstanceUsageViolation(fragment0);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(getRetainInstanceUsageViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), GetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, getRetainInstanceUsageViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onGetTargetFragmentRequestCodeUsage(@NotNull Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        GetTargetFragmentRequestCodeUsageViolation getTargetFragmentRequestCodeUsageViolation0 = new GetTargetFragmentRequestCodeUsageViolation(fragment0);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(getTargetFragmentRequestCodeUsageViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), GetTargetFragmentRequestCodeUsageViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, getTargetFragmentRequestCodeUsageViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onGetTargetFragmentUsage(@NotNull Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        GetTargetFragmentUsageViolation getTargetFragmentUsageViolation0 = new GetTargetFragmentUsageViolation(fragment0);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(getTargetFragmentUsageViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), GetTargetFragmentUsageViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, getTargetFragmentUsageViolation0);
        }
    }

    @VisibleForTesting
    public final void onPolicyViolation(@NotNull Violation violation0) {
        Intrinsics.checkNotNullParameter(violation0, "violation");
        FragmentStrictMode.c(violation0);
        Fragment fragment0 = violation0.getFragment();
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), violation0.getClass())) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, violation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onSetRetainInstanceUsage(@NotNull Fragment fragment0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        SetRetainInstanceUsageViolation setRetainInstanceUsageViolation0 = new SetRetainInstanceUsageViolation(fragment0);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(setRetainInstanceUsageViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_RETAIN_INSTANCE_USAGE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), SetRetainInstanceUsageViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, setRetainInstanceUsageViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onSetTargetFragmentUsage(@NotNull Fragment fragment0, @NotNull Fragment fragment1, int v) {
        Intrinsics.checkNotNullParameter(fragment0, "violatingFragment");
        Intrinsics.checkNotNullParameter(fragment1, "targetFragment");
        SetTargetFragmentUsageViolation setTargetFragmentUsageViolation0 = new SetTargetFragmentUsageViolation(fragment0, fragment1, v);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(setTargetFragmentUsageViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_TARGET_FRAGMENT_USAGE) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), SetTargetFragmentUsageViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, setTargetFragmentUsageViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onSetUserVisibleHint(@NotNull Fragment fragment0, boolean z) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        SetUserVisibleHintViolation setUserVisibleHintViolation0 = new SetUserVisibleHintViolation(fragment0, z);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(setUserVisibleHintViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_SET_USER_VISIBLE_HINT) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), SetUserVisibleHintViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, setUserVisibleHintViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onWrongFragmentContainer(@NotNull Fragment fragment0, @NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        WrongFragmentContainerViolation wrongFragmentContainerViolation0 = new WrongFragmentContainerViolation(fragment0, viewGroup0);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(wrongFragmentContainerViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_WRONG_FRAGMENT_CONTAINER) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), WrongFragmentContainerViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, wrongFragmentContainerViolation0);
        }
    }

    @RestrictTo({Scope.LIBRARY})
    @JvmStatic
    public static final void onWrongNestedHierarchy(@NotNull Fragment fragment0, @NotNull Fragment fragment1, int v) {
        Intrinsics.checkNotNullParameter(fragment0, "fragment");
        Intrinsics.checkNotNullParameter(fragment1, "expectedParentFragment");
        WrongNestedHierarchyViolation wrongNestedHierarchyViolation0 = new WrongNestedHierarchyViolation(fragment0, fragment1, v);
        FragmentStrictMode.INSTANCE.getClass();
        FragmentStrictMode.c(wrongNestedHierarchyViolation0);
        Policy fragmentStrictMode$Policy0 = FragmentStrictMode.a(fragment0);
        if(fragmentStrictMode$Policy0.getFlags$fragment_release().contains(Flag.DETECT_WRONG_NESTED_HIERARCHY) && FragmentStrictMode.e(fragmentStrictMode$Policy0, fragment0.getClass(), WrongNestedHierarchyViolation.class)) {
            FragmentStrictMode.b(fragmentStrictMode$Policy0, wrongNestedHierarchyViolation0);
        }
    }

    public final void setDefaultPolicy(@NotNull Policy fragmentStrictMode$Policy0) {
        Intrinsics.checkNotNullParameter(fragmentStrictMode$Policy0, "<set-?>");
        FragmentStrictMode.a = fragmentStrictMode$Policy0;
    }
}

