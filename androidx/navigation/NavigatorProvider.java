package androidx.navigation;

import android.annotation.SuppressLint;
import androidx.annotation.CallSuper;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.x;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"TypeParameterUnusedInFormals"})
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\b\u0017\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001A\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\b\u0010\tJ%\u0010\b\u001A\u00028\u0000\"\f\b\u0000\u0010\u0005*\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\u000B\u001A\u00020\nH\u0017¢\u0006\u0004\b\b\u0010\fJ\'\u0010\u000F\u001A\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u00042\u000E\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000F\u0010\u0010J1\u0010\u000F\u001A\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u00042\u0006\u0010\u000B\u001A\u00020\n2\u000E\u0010\u000E\u001A\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0004H\u0017¢\u0006\u0004\b\u000F\u0010\u0011R%\u0010\u0015\u001A\u0016\u0012\u0004\u0012\u00020\n\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\r0\u00040\u00128G¢\u0006\u0006\u001A\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Landroidx/navigation/NavigatorProvider;", "", "<init>", "()V", "Landroidx/navigation/Navigator;", "T", "Ljava/lang/Class;", "navigatorClass", "getNavigator", "(Ljava/lang/Class;)Landroidx/navigation/Navigator;", "", "name", "(Ljava/lang/String;)Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "navigator", "addNavigator", "(Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "(Ljava/lang/String;Landroidx/navigation/Navigator;)Landroidx/navigation/Navigator;", "", "getNavigators", "()Ljava/util/Map;", "navigators", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavigatorProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavigatorProvider.kt\nandroidx/navigation/NavigatorProvider\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,178:1\n1#2:179\n*E\n"})
public class NavigatorProvider {
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0007\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\r\u001A\u00020\u00022\u0012\u0010\n\u001A\u000E\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\t0\bH\u0001¢\u0006\u0004\b\u000B\u0010\fR&\u0010\u000F\u001A\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/navigation/NavigatorProvider$Companion;", "", "", "name", "", "validateName$navigation_common_release", "(Ljava/lang/String;)Z", "validateName", "Ljava/lang/Class;", "Landroidx/navigation/Navigator;", "navigatorClass", "getNameForNavigator$navigation_common_release", "(Ljava/lang/Class;)Ljava/lang/String;", "getNameForNavigator", "", "annotationNames", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final String getNameForNavigator$navigation_common_release(@NotNull Class class0) {
            Intrinsics.checkNotNullParameter(class0, "navigatorClass");
            String s = (String)NavigatorProvider.b.get(class0);
            if(s == null) {
                Name navigator$Name0 = (Name)class0.getAnnotation(Name.class);
                s = navigator$Name0 == null ? null : navigator$Name0.value();
                if(!this.validateName$navigation_common_release(s)) {
                    throw new IllegalArgumentException(("No @Navigator.Name annotation found for " + class0.getSimpleName()).toString());
                }
                NavigatorProvider.b.put(class0, s);
            }
            Intrinsics.checkNotNull(s);
            return s;
        }

        public final boolean validateName$navigation_common_release(@Nullable String s) {
            return s != null && s.length() > 0;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final LinkedHashMap a;
    public static final LinkedHashMap b;

    static {
        NavigatorProvider.Companion = new Companion(null);
        NavigatorProvider.b = new LinkedHashMap();
    }

    public NavigatorProvider() {
        this.a = new LinkedHashMap();
    }

    @Nullable
    public final Navigator addNavigator(@NotNull Navigator navigator0) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        Class class0 = navigator0.getClass();
        return this.addNavigator(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(class0), navigator0);
    }

    @CallSuper
    @Nullable
    public Navigator addNavigator(@NotNull String s, @NotNull Navigator navigator0) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        if(!NavigatorProvider.Companion.validateName$navigation_common_release(s)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        LinkedHashMap linkedHashMap0 = this.a;
        Navigator navigator1 = (Navigator)linkedHashMap0.get(s);
        if(Intrinsics.areEqual(navigator1, navigator0)) {
            return navigator0;
        }
        if(navigator1 != null && navigator1.isAttached()) {
            throw new IllegalStateException(("Navigator " + navigator0 + " is replacing an already attached " + navigator1).toString());
        }
        if(navigator0.isAttached()) {
            throw new IllegalStateException(("Navigator " + navigator0 + " is already attached to another NavController").toString());
        }
        return (Navigator)linkedHashMap0.put(s, navigator0);
    }

    @JvmStatic
    @NotNull
    public static final String getNameForNavigator$navigation_common_release(@NotNull Class class0) {
        return NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(class0);
    }

    @NotNull
    public final Navigator getNavigator(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "navigatorClass");
        return this.getNavigator(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(class0));
    }

    @CallSuper
    @NotNull
    public Navigator getNavigator(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "name");
        if(!NavigatorProvider.Companion.validateName$navigation_common_release(s)) {
            throw new IllegalArgumentException("navigator name cannot be an empty string");
        }
        Navigator navigator0 = (Navigator)this.a.get(s);
        if(navigator0 == null) {
            throw new IllegalStateException("Could not find Navigator with name \"" + s + "\". You must call NavController.addNavigator() for each navigation type.");
        }
        return navigator0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final Map getNavigators() {
        return x.toMap(this.a);
    }
}

