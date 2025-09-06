package androidx.navigation;

import a5.b;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.CallSuper;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.common.R.styleable;
import androidx.navigation.serialization.RouteSerializerKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.collections.z;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.reflect.KClass;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.text.p;
import kotlin.text.q;
import kotlinx.serialization.SerializersKt;
import m0.b0;
import n4.k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u000E\n\u0002\u0010$\n\u0002\b\b\b\u0016\u0018\u0000 m2\u00020\u0001:\u0003nmoB\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000E\u0010\u0007\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006\u00A2\u0006\u0004\b\u0004\u0010\bJ\u001F\u0010\u000E\u001A\u00020\r2\u0006\u0010\n\u001A\u00020\t2\u0006\u0010\f\u001A\u00020\u000BH\u0017\u00A2\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0011\u001A\u00020\u0010H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0013\u001A\u00020\u00122\u0006\u0010\u0016\u001A\u00020\u0015H\u0016\u00A2\u0006\u0004\b\u0013\u0010\u0017J\u0015\u0010\u0019\u001A\u00020\r2\u0006\u0010\u0018\u001A\u00020\u0002\u00A2\u0006\u0004\b\u0019\u0010\u0005J\u0015\u0010\u0019\u001A\u00020\r2\u0006\u0010\u001B\u001A\u00020\u001A\u00A2\u0006\u0004\b\u0019\u0010\u001CJ\u0019\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0006\u0010\u001D\u001A\u00020\u0002H\u0007\u00A2\u0006\u0004\b\u001F\u0010 J\u0019\u0010\u001F\u001A\u0004\u0018\u00010\u001E2\u0006\u0010!\u001A\u00020\u0015H\u0017\u00A2\u0006\u0004\b\u001F\u0010\"J\u001B\u0010%\u001A\u00020$2\n\b\u0002\u0010#\u001A\u0004\u0018\u00010\u0000H\u0007\u00A2\u0006\u0004\b%\u0010&J!\u0010)\u001A\u00020\u00122\u0006\u0010\u001D\u001A\u00020\u00022\b\u0010(\u001A\u0004\u0018\u00010\'H\u0007\u00A2\u0006\u0004\b)\u0010*J\u000F\u0010+\u001A\u00020\u0012H\u0017\u00A2\u0006\u0004\b+\u0010,J\u0019\u00100\u001A\u0004\u0018\u00010/2\b\b\u0001\u0010.\u001A\u00020-\u00A2\u0006\u0004\b0\u00101J!\u00104\u001A\u00020\r2\b\b\u0001\u00102\u001A\u00020-2\b\b\u0001\u00103\u001A\u00020-\u00A2\u0006\u0004\b4\u00105J\u001F\u00104\u001A\u00020\r2\b\b\u0001\u00102\u001A\u00020-2\u0006\u00106\u001A\u00020/\u00A2\u0006\u0004\b4\u00107J\u0017\u00108\u001A\u00020\r2\b\b\u0001\u00102\u001A\u00020-\u00A2\u0006\u0004\b8\u00109J\u001D\u0010=\u001A\u00020\r2\u0006\u0010:\u001A\u00020\u00022\u0006\u0010<\u001A\u00020;\u00A2\u0006\u0004\b=\u0010>J\u0015\u0010?\u001A\u00020\r2\u0006\u0010:\u001A\u00020\u0002\u00A2\u0006\u0004\b?\u0010\u0005J\u001B\u0010A\u001A\u0004\u0018\u00010\'2\b\u0010@\u001A\u0004\u0018\u00010\'H\u0007\u00A2\u0006\u0004\bA\u0010BJ!\u0010D\u001A\u0004\u0018\u00010\u00022\u0006\u0010\n\u001A\u00020\t2\b\u0010C\u001A\u0004\u0018\u00010\'\u00A2\u0006\u0004\bD\u0010EJ\u000F\u0010F\u001A\u00020\u0002H\u0016\u00A2\u0006\u0004\bF\u0010GJ\u001A\u0010I\u001A\u00020\u00122\b\u0010H\u001A\u0004\u0018\u00010\u0001H\u0096\u0002\u00A2\u0006\u0004\bI\u0010JJ\u000F\u0010K\u001A\u00020-H\u0016\u00A2\u0006\u0004\bK\u0010LR\u0017\u0010\u0003\u001A\u00020\u00028\u0006\u00A2\u0006\f\n\u0004\bM\u0010N\u001A\u0004\bO\u0010GR.\u0010X\u001A\u0004\u0018\u00010P2\b\u0010Q\u001A\u0004\u0018\u00010P8\u0006@GX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bR\u0010S\u001A\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010`\u001A\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000E\u00A2\u0006\u0012\n\u0004\bZ\u0010[\u001A\u0004\b\\\u0010]\"\u0004\b^\u0010_R,\u0010.\u001A\u00020-2\b\b\u0001\u0010.\u001A\u00020-8G@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\ba\u0010b\u001A\u0004\bc\u0010L\"\u0004\bd\u00109R.\u0010\u001D\u001A\u0004\u0018\u00010\u00022\b\u0010\u001D\u001A\u0004\u0018\u00010\u00028\u0006@FX\u0086\u000E\u00A2\u0006\u0012\n\u0004\be\u0010N\u001A\u0004\bf\u0010G\"\u0004\bg\u0010\u0005R\u001D\u0010(\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020;0h8F\u00A2\u0006\u0006\u001A\u0004\bi\u0010jR\u0014\u0010l\u001A\u00020\u00028WX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bk\u0010G\u00A8\u0006p"}, d2 = {"Landroidx/navigation/NavDestination;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Landroidx/navigation/Navigator;", "navigator", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/net/Uri;", "deepLink", "", "hasDeepLink", "(Landroid/net/Uri;)Z", "Landroidx/navigation/NavDeepLinkRequest;", "deepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Z", "uriPattern", "addDeepLink", "Landroidx/navigation/NavDeepLink;", "navDeepLink", "(Landroidx/navigation/NavDeepLink;)V", "route", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Ljava/lang/String;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "navDeepLinkRequest", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "previousDestination", "", "buildDeepLinkIds", "(Landroidx/navigation/NavDestination;)[I", "Landroid/os/Bundle;", "arguments", "hasRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "supportsActions", "()Z", "", "id", "Landroidx/navigation/NavAction;", "getAction", "(I)Landroidx/navigation/NavAction;", "actionId", "destId", "putAction", "(II)V", "action", "(ILandroidx/navigation/NavAction;)V", "removeAction", "(I)V", "argumentName", "Landroidx/navigation/NavArgument;", "argument", "addArgument", "(Ljava/lang/String;Landroidx/navigation/NavArgument;)V", "removeArgument", "args", "addInDefaultArgs", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "bundle", "fillInLabel", "(Landroid/content/Context;Landroid/os/Bundle;)Ljava/lang/String;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "getNavigatorName", "Landroidx/navigation/NavGraph;", "<set-?>", "b", "Landroidx/navigation/NavGraph;", "getParent", "()Landroidx/navigation/NavGraph;", "setParent", "(Landroidx/navigation/NavGraph;)V", "parent", "", "d", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "label", "h", "I", "getId", "setId", "i", "getRoute", "setRoute", "", "getArguments", "()Ljava/util/Map;", "getDisplayName", "displayName", "Companion", "ClassType", "DeepLinkMatch", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Uri.kt\nandroidx/core/net/UriKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,830:1\n232#2,3:831\n1#3:834\n288#4,2:835\n1549#4:838\n1620#4,3:839\n1855#4,2:846\n1855#4,2:849\n1855#4,2:852\n29#5:837\n1224#6,2:842\n1224#6,2:844\n32#7:848\n33#7:851\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n188#1:831,3\n230#1:835,2\n453#1:838\n453#1:839,3\n693#1:846,2\n701#1:849,2\n705#1:852,2\n356#1:837\n674#1:842,2\n678#1:844,2\n698#1:848\n698#1:851\n*E\n"})
public class NavDestination {
    @Retention(RetentionPolicy.CLASS)
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0002\u0018\u00002\u00020\u0001B\f\u0012\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0003R\u0013\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0006\u001A\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/NavDestination$ClassType;", "", "value", "Lkotlin/reflect/KClass;", "()Ljava/lang/Class;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @kotlin.annotation.Retention(AnnotationRetention.BINARY)
    @kotlin.annotation.Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    public @interface ClassType {
        Class value();
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001JA\u0010\t\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0010\u0010\b\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007H\u0005¢\u0006\u0004\b\t\u0010\nJA\u0010\u000B\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\u0006\u001A\u00020\u00052\u0010\u0010\b\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0007H\u0007¢\u0006\u0004\b\u000B\u0010\nJ\u001F\u0010\u000E\u001A\u00020\u00052\u0006\u0010\u0004\u001A\u00020\u00032\u0006\u0010\r\u001A\u00020\fH\u0007¢\u0006\u0004\b\u000E\u0010\u000FJ\u0019\u0010\u0011\u001A\u00020\u00052\b\u0010\u0010\u001A\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0016\u001A\u00020\u0015\"\n\b\u0000\u0010\u0013\u0018\u0001*\u00020\u0001*\u00020\u0014H\u0087\b¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u0016\u001A\u00020\u0015\"\b\b\u0000\u0010\u0013*\u00020\u0001*\u00020\u00142\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0007¢\u0006\u0004\b\u0016\u0010\u0019R$\u0010\u001F\u001A\b\u0012\u0004\u0012\u00020\u00140\u001A*\u00020\u00148FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001D\u0010\u001E\u001A\u0004\b\u001B\u0010\u001CR$\u0010!\u001A\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Landroidx/navigation/NavDestination$Companion;", "", "C", "Landroid/content/Context;", "context", "", "name", "Ljava/lang/Class;", "expectedClassType", "parseClassFromName", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Class;", "parseClassFromNameInternal", "", "id", "getDisplayName", "(Landroid/content/Context;I)Ljava/lang/String;", "route", "createRoute", "(Ljava/lang/String;)Ljava/lang/String;", "T", "Landroidx/navigation/NavDestination;", "", "hasRoute", "(Landroidx/navigation/NavDestination;)Z", "Lkotlin/reflect/KClass;", "(Landroidx/navigation/NavDestination;Lkotlin/reflect/KClass;)Z", "Lkotlin/sequences/Sequence;", "getHierarchy", "(Landroidx/navigation/NavDestination;)Lkotlin/sequences/Sequence;", "getHierarchy$annotations", "(Landroidx/navigation/NavDestination;)V", "hierarchy", "", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @NotNull
        public final String createRoute(@Nullable String s) {
            return s == null ? "" : "android-app://androidx.navigation/" + s;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public final String getDisplayName(@NotNull Context context0, int v) {
            String s;
            Intrinsics.checkNotNullParameter(context0, "context");
            if(v <= 0xFFFFFF) {
                return String.valueOf(v);
            }
            try {
                s = context0.getResources().getResourceName(v);
            }
            catch(Resources.NotFoundException unused_ex) {
                s = String.valueOf(v);
            }
            Intrinsics.checkNotNullExpressionValue(s, "try {\n                  …tring()\n                }");
            return s;
        }

        @NotNull
        public final Sequence getHierarchy(@NotNull NavDestination navDestination0) {
            Intrinsics.checkNotNullParameter(navDestination0, "<this>");
            return SequencesKt__SequencesKt.generateSequence(navDestination0, f.w);
        }

        @JvmStatic
        public static void getHierarchy$annotations(NavDestination navDestination0) {
        }

        @JvmStatic
        public final boolean hasRoute(NavDestination navDestination0) {
            Intrinsics.checkNotNullParameter(navDestination0, "<this>");
            Intrinsics.reifiedOperationMarker(4, "T");
            return this.hasRoute(navDestination0, Reflection.getOrCreateKotlinClass(Object.class));
        }

        @JvmStatic
        public final boolean hasRoute(@NotNull NavDestination navDestination0, @NotNull KClass kClass0) {
            Intrinsics.checkNotNullParameter(navDestination0, "<this>");
            Intrinsics.checkNotNullParameter(kClass0, "route");
            return RouteSerializerKt.generateHashCode(SerializersKt.serializer(kClass0)) == navDestination0.getId();
        }

        @JvmStatic
        @NotNull
        public final Class parseClassFromName(@NotNull Context context0, @NotNull String s, @NotNull Class class0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(class0, "expectedClassType");
            String s1 = s.charAt(0) == 46 ? "net.daum.android.tistoryapp" + s : s;
            Class class1 = (Class)NavDestination.j.get(s1);
            if(class1 == null) {
                try {
                    class1 = Class.forName(s1, true, context0.getClassLoader());
                    NavDestination.j.put(s, class1);
                }
                catch(ClassNotFoundException classNotFoundException0) {
                    throw new IllegalArgumentException(classNotFoundException0);
                }
            }
            Intrinsics.checkNotNull(class1);
            if(!class0.isAssignableFrom(class1)) {
                throw new IllegalArgumentException((s1 + " must be a subclass of " + class0).toString());
            }
            return class1;
        }

        @RestrictTo({Scope.LIBRARY_GROUP})
        @JvmStatic
        @NotNull
        public final Class parseClassFromNameInternal(@NotNull Context context0, @NotNull String s, @NotNull Class class0) {
            Intrinsics.checkNotNullParameter(context0, "context");
            Intrinsics.checkNotNullParameter(s, "name");
            Intrinsics.checkNotNullParameter(class0, "expectedClassType");
            return NavDestination.parseClassFromName(context0, s, class0);
        }
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\b\u0010\u0005\u001A\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001A\u00020\u0006\u0012\u0006\u0010\t\u001A\u00020\b\u0012\u0006\u0010\n\u001A\u00020\u0006\u0012\u0006\u0010\u000B\u001A\u00020\b¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000F\u001A\u00020\b2\u0006\u0010\u000E\u001A\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u000F\u0010\u0010J\u0017\u0010\u0012\u001A\u00020\u00062\b\u0010\u0011\u001A\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001A\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001A\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001A\u0004\b\u001A\u0010\u001B¨\u0006\u001C"}, d2 = {"Landroidx/navigation/NavDestination$DeepLinkMatch;", "", "Landroidx/navigation/NavDestination;", "destination", "Landroid/os/Bundle;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;ZIZI)V", "other", "compareTo", "(Landroidx/navigation/NavDestination$DeepLinkMatch;)I", "arguments", "hasMatchingArgs", "(Landroid/os/Bundle;)Z", "a", "Landroidx/navigation/NavDestination;", "getDestination", "()Landroidx/navigation/NavDestination;", "b", "Landroid/os/Bundle;", "getMatchingArgs", "()Landroid/os/Bundle;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,830:1\n1855#2,2:831\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n128#1:831,2\n*E\n"})
    public static final class DeepLinkMatch implements Comparable {
        public final NavDestination a;
        public final Bundle b;
        public final boolean c;
        public final int d;
        public final boolean e;
        public final int f;

        public DeepLinkMatch(@NotNull NavDestination navDestination0, @Nullable Bundle bundle0, boolean z, int v, boolean z1, int v1) {
            Intrinsics.checkNotNullParameter(navDestination0, "destination");
            super();
            this.a = navDestination0;
            this.b = bundle0;
            this.c = z;
            this.d = v;
            this.e = z1;
            this.f = v1;
        }

        public int compareTo(@NotNull DeepLinkMatch navDestination$DeepLinkMatch0) {
            Intrinsics.checkNotNullParameter(navDestination$DeepLinkMatch0, "other");
            boolean z = this.c;
            if(z && !navDestination$DeepLinkMatch0.c) {
                return 1;
            }
            if(!z && navDestination$DeepLinkMatch0.c) {
                return -1;
            }
            int v = this.d - navDestination$DeepLinkMatch0.d;
            if(v > 0) {
                return 1;
            }
            if(v < 0) {
                return -1;
            }
            Bundle bundle0 = navDestination$DeepLinkMatch0.b;
            Bundle bundle1 = this.b;
            if(bundle1 != null && bundle0 == null) {
                return 1;
            }
            if(bundle1 == null && bundle0 != null) {
                return -1;
            }
            if(bundle1 != null) {
                Intrinsics.checkNotNull(bundle0);
                int v1 = bundle1.size() - bundle0.size();
                if(v1 > 0) {
                    return 1;
                }
                if(v1 < 0) {
                    return -1;
                }
            }
            boolean z1 = navDestination$DeepLinkMatch0.e;
            boolean z2 = this.e;
            if(z2 && !z1) {
                return 1;
            }
            return z2 || !z1 ? this.f - navDestination$DeepLinkMatch0.f : -1;
        }

        @Override
        public int compareTo(Object object0) {
            return this.compareTo(((DeepLinkMatch)object0));
        }

        @NotNull
        public final NavDestination getDestination() {
            return this.a;
        }

        @Nullable
        public final Bundle getMatchingArgs() {
            return this.b;
        }

        public final boolean hasMatchingArgs(@Nullable Bundle bundle0) {
            Object object2;
            if(bundle0 != null) {
                Bundle bundle1 = this.b;
                if(bundle1 != null) {
                    Set set0 = bundle1.keySet();
                    Intrinsics.checkNotNullExpressionValue(set0, "matchingArgs.keySet()");
                    for(Object object0: set0) {
                        String s = (String)object0;
                        if(!bundle0.containsKey(s)) {
                            return false;
                        }
                        NavArgument navArgument0 = (NavArgument)this.a.g.get(s);
                        Object object1 = null;
                        NavType navType0 = navArgument0 == null ? null : navArgument0.getType();
                        if(navType0 == null) {
                            object2 = null;
                        }
                        else {
                            Intrinsics.checkNotNullExpressionValue(s, "key");
                            object2 = navType0.get(bundle1, s);
                        }
                        if(navType0 != null) {
                            Intrinsics.checkNotNullExpressionValue(s, "key");
                            object1 = navType0.get(bundle0, s);
                        }
                        if(navType0 != null && !navType0.valueEquals(object2, object1)) {
                            return false;
                        }
                        if(false) {
                            break;
                        }
                    }
                    return true;
                }
            }
            return false;
        }
    }

    @NotNull
    public static final Companion Companion;
    public final String a;
    public NavGraph b;
    public String c;
    public CharSequence d;
    public final ArrayList e;
    public final SparseArrayCompat f;
    public final LinkedHashMap g;
    public int h;
    public String i;
    public static final LinkedHashMap j;

    static {
        NavDestination.Companion = new Companion(null);
        NavDestination.j = new LinkedHashMap();
    }

    public NavDestination(@NotNull Navigator navigator0) {
        Intrinsics.checkNotNullParameter(navigator0, "navigator");
        Class class0 = navigator0.getClass();
        this(NavigatorProvider.Companion.getNameForNavigator$navigation_common_release(class0));
    }

    public NavDestination(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "navigatorName");
        super();
        this.a = s;
        this.e = new ArrayList();
        this.f = new SparseArrayCompat();
        this.g = new LinkedHashMap();
    }

    public final void addArgument(@NotNull String s, @NotNull NavArgument navArgument0) {
        Intrinsics.checkNotNullParameter(s, "argumentName");
        Intrinsics.checkNotNullParameter(navArgument0, "argument");
        this.g.put(s, navArgument0);
    }

    public final void addDeepLink(@NotNull NavDeepLink navDeepLink0) {
        Intrinsics.checkNotNullParameter(navDeepLink0, "navDeepLink");
        b0 b00 = new b0(navDeepLink0, 4);
        List list0 = NavArgumentKt.missingRequiredArguments(this.g, b00);
        if(!list0.isEmpty()) {
            throw new IllegalArgumentException(("Deep link " + navDeepLink0.getUriPattern() + " can\'t be used to open destination " + this + ".\nFollowing required arguments are missing: " + list0).toString());
        }
        this.e.add(navDeepLink0);
    }

    public final void addDeepLink(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "uriPattern");
        this.addDeepLink(new Builder().setUriPattern(s).build());
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final Bundle addInDefaultArgs(@Nullable Bundle bundle0) {
        LinkedHashMap linkedHashMap0 = this.g;
        if(bundle0 == null && linkedHashMap0.isEmpty()) {
            return null;
        }
        Bundle bundle1 = new Bundle();
        for(Object object0: linkedHashMap0.entrySet()) {
            String s = (String)((Map.Entry)object0).getKey();
            ((NavArgument)((Map.Entry)object0).getValue()).putDefaultValue(s, bundle1);
        }
        if(bundle0 != null) {
            bundle1.putAll(bundle0);
            for(Object object1: linkedHashMap0.entrySet()) {
                String s1 = (String)((Map.Entry)object1).getKey();
                NavArgument navArgument0 = (NavArgument)((Map.Entry)object1).getValue();
                if(!navArgument0.isDefaultValueUnknown$navigation_common_release() && !navArgument0.verify(s1, bundle1)) {
                    StringBuilder stringBuilder0 = b.v("Wrong argument type for \'", s1, "\' in argument bundle. ");
                    stringBuilder0.append("nav_type");
                    stringBuilder0.append(" expected.");
                    throw new IllegalArgumentException(stringBuilder0.toString().toString());
                }
                if(false) {
                    break;
                }
            }
        }
        return bundle1;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmOverloads
    @NotNull
    public final int[] buildDeepLinkIds() {
        return NavDestination.buildDeepLinkIds$default(this, null, 1, null);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmOverloads
    @NotNull
    public final int[] buildDeepLinkIds(@Nullable NavDestination navDestination0) {
        ArrayDeque arrayDeque0 = new ArrayDeque();
        for(NavDestination navDestination1 = this; true; navDestination1 = navGraph0) {
            Intrinsics.checkNotNull(navDestination1);
            NavGraph navGraph0 = navDestination1.b;
            if((navDestination0 == null ? null : navDestination0.b) != null) {
                NavGraph navGraph1 = navDestination0.b;
                Intrinsics.checkNotNull(navGraph1);
                if(navGraph1.findNode(navDestination1.h) == navDestination1) {
                    arrayDeque0.addFirst(navDestination1);
                    break;
                }
            }
            if(navGraph0 == null || navGraph0.getStartDestinationId() != navDestination1.h) {
                arrayDeque0.addFirst(navDestination1);
            }
            if(Intrinsics.areEqual(navGraph0, navDestination0) || navGraph0 == null) {
                break;
            }
        }
        Iterable iterable0 = CollectionsKt___CollectionsKt.toList(arrayDeque0);
        ArrayList arrayList0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            arrayList0.add(((NavDestination)object0).h);
        }
        return CollectionsKt___CollectionsKt.toIntArray(arrayList0);
    }

    public static int[] buildDeepLinkIds$default(NavDestination navDestination0, NavDestination navDestination1, int v, Object object0) {
        if(object0 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if((v & 1) != 0) {
            navDestination1 = null;
        }
        return navDestination0.buildDeepLinkIds(navDestination1);
    }

    @Override
    public boolean equals(@Nullable Object object0) {
        boolean z1;
        if(this == object0) {
            return true;
        }
        if(object0 != null && object0 instanceof NavDestination) {
            boolean z = Intrinsics.areEqual(this.e, ((NavDestination)object0).e);
            SparseArrayCompat sparseArrayCompat0 = this.f;
            SparseArrayCompat sparseArrayCompat1 = ((NavDestination)object0).f;
            if(sparseArrayCompat0.size() == sparseArrayCompat1.size()) {
                z1 = true;
                Iterator iterator0 = SequencesKt__SequencesKt.asSequence(SparseArrayKt.keyIterator(sparseArrayCompat0)).iterator();
                while(true) {
                    if(!iterator0.hasNext()) {
                        goto label_14;
                    }
                    Object object1 = iterator0.next();
                    int v = ((Number)object1).intValue();
                    if(!Intrinsics.areEqual(sparseArrayCompat0.get(v), sparseArrayCompat1.get(v))) {
                        break;
                    }
                }
            }
            z1 = false;
        label_14:
            LinkedHashMap linkedHashMap0 = this.g;
            LinkedHashMap linkedHashMap1 = ((NavDestination)object0).g;
            if(linkedHashMap0.size() == linkedHashMap1.size()) {
                for(Object object2: z.asSequence(linkedHashMap0)) {
                    if(!linkedHashMap1.containsKey(((Map.Entry)object2).getKey()) || !Intrinsics.areEqual(linkedHashMap1.get(((Map.Entry)object2).getKey()), ((Map.Entry)object2).getValue())) {
                        return this.h == ((NavDestination)object0).h && Intrinsics.areEqual(this.i, ((NavDestination)object0).i) && z && z1 && false;
                    }
                }
                return this.h == ((NavDestination)object0).h && Intrinsics.areEqual(this.i, ((NavDestination)object0).i) && z && z1;
            }
            return this.h == ((NavDestination)object0).h && Intrinsics.areEqual(this.i, ((NavDestination)object0).i) && z && z1 && false;
        }
        return false;
    }

    @Nullable
    public final String fillInLabel(@NotNull Context context0, @Nullable Bundle bundle0) {
        NavType navType0;
        Intrinsics.checkNotNullParameter(context0, "context");
        CharSequence charSequence0 = this.d;
        if(charSequence0 == null) {
            return null;
        }
        Matcher matcher0 = Pattern.compile("\\{(.+?)\\}").matcher(charSequence0);
        StringBuffer stringBuffer0 = new StringBuffer();
        while(matcher0.find()) {
            String s = matcher0.group(1);
            if(bundle0 == null || !bundle0.containsKey(s)) {
                throw new IllegalArgumentException("Could not find \"" + s + "\" in " + bundle0 + " to fill label \"" + charSequence0 + '\"');
            }
            matcher0.appendReplacement(stringBuffer0, "");
            if(s == null) {
                navType0 = null;
            }
            else {
                NavArgument navArgument0 = (NavArgument)this.g.get(s);
                if(navArgument0 != null) {
                    navType0 = navArgument0.getType();
                }
            }
            if(Intrinsics.areEqual(navType0, NavType.ReferenceType)) {
                String s1 = context0.getString(bundle0.getInt(s));
                Intrinsics.checkNotNullExpressionValue(s1, "context.getString(bundle.getInt(argName))");
                stringBuffer0.append(s1);
            }
            else {
                stringBuffer0.append(String.valueOf(bundle0.get(s)));
            }
        }
        matcher0.appendTail(stringBuffer0);
        return stringBuffer0.toString();
    }

    @Nullable
    public final NavAction getAction(@IdRes int v) {
        NavAction navAction0 = this.f.isEmpty() ? null : ((NavAction)this.f.get(v));
        if(navAction0 == null) {
            return this.b == null ? null : this.b.getAction(v);
        }
        return navAction0;
    }

    @NotNull
    public final Map getArguments() {
        return x.toMap(this.g);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @NotNull
    public static final String getDisplayName(@NotNull Context context0, int v) {
        return NavDestination.Companion.getDisplayName(context0, v);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        return this.c == null ? String.valueOf(this.h) : this.c;
    }

    @NotNull
    public static final Sequence getHierarchy(@NotNull NavDestination navDestination0) {
        return NavDestination.Companion.getHierarchy(navDestination0);
    }

    @IdRes
    public final int getId() {
        return this.h;
    }

    @Nullable
    public final CharSequence getLabel() {
        return this.d;
    }

    @NotNull
    public final String getNavigatorName() {
        return this.a;
    }

    @Nullable
    public final NavGraph getParent() {
        return this.b;
    }

    @Nullable
    public final String getRoute() {
        return this.i;
    }

    public boolean hasDeepLink(@NotNull Uri uri0) {
        Intrinsics.checkNotNullParameter(uri0, "deepLink");
        return this.hasDeepLink(new NavDeepLinkRequest(uri0, null, null));
    }

    public boolean hasDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "deepLinkRequest");
        return this.matchDeepLink(navDeepLinkRequest0) != null;
    }

    @JvmStatic
    public static final boolean hasRoute(@NotNull NavDestination navDestination0, @NotNull KClass kClass0) {
        return NavDestination.Companion.hasRoute(navDestination0, kClass0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final boolean hasRoute(@NotNull String s, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(s, "route");
        if(Intrinsics.areEqual(this.i, s)) {
            return true;
        }
        DeepLinkMatch navDestination$DeepLinkMatch0 = this.matchDeepLink(s);
        return Intrinsics.areEqual(this, (navDestination$DeepLinkMatch0 == null ? null : navDestination$DeepLinkMatch0.getDestination())) ? navDestination$DeepLinkMatch0.hasMatchingArgs(bundle0) : false;
    }

    @Override
    public int hashCode() {
        int v = this.h * 0x1F + (this.i == null ? 0 : this.i.hashCode());
        for(Object object0: this.e) {
            String s = ((NavDeepLink)object0).getUriPattern();
            String s1 = ((NavDeepLink)object0).getAction();
            String s2 = ((NavDeepLink)object0).getMimeType();
            v = ((v * 0x1F + (s == null ? 0 : s.hashCode())) * 0x1F + (s1 == null ? 0 : s1.hashCode())) * 0x1F + (s2 == null ? 0 : s2.hashCode());
        }
        Iterator iterator1 = SparseArrayKt.valueIterator(this.f);
        while(iterator1.hasNext()) {
            Object object1 = iterator1.next();
            NavAction navAction0 = (NavAction)object1;
            NavOptions navOptions0 = navAction0.getNavOptions();
            int v1 = (navAction0.getDestinationId() + v * 0x1F) * 0x1F + (navOptions0 == null ? 0 : navOptions0.hashCode());
            Bundle bundle0 = navAction0.getDefaultArguments();
            if(bundle0 != null) {
                Set set0 = bundle0.keySet();
                if(set0 != null) {
                    Intrinsics.checkNotNullExpressionValue(set0, "keySet()");
                    for(Object object2: set0) {
                        Bundle bundle1 = navAction0.getDefaultArguments();
                        Intrinsics.checkNotNull(bundle1);
                        Object object3 = bundle1.get(((String)object2));
                        v1 = v1 * 0x1F + (object3 == null ? 0 : object3.hashCode());
                    }
                }
            }
            v = v1;
        }
        LinkedHashMap linkedHashMap0 = this.g;
        for(Object object4: linkedHashMap0.keySet()) {
            Object object5 = linkedHashMap0.get(((String)object4));
            v = q.c(v * 0x1F, 0x1F, ((String)object4)) + (object5 == null ? 0 : object5.hashCode());
        }
        return v;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "navDeepLinkRequest");
        ArrayList arrayList0 = this.e;
        if(arrayList0.isEmpty()) {
            return null;
        }
        DeepLinkMatch navDestination$DeepLinkMatch0 = null;
        for(Object object0: arrayList0) {
            NavDeepLink navDeepLink0 = (NavDeepLink)object0;
            Uri uri0 = navDeepLinkRequest0.getUri();
            Bundle bundle0 = uri0 == null ? null : navDeepLink0.getMatchingArguments(uri0, this.g);
            int v = navDeepLink0.calculateMatchingPathSegments$navigation_common_release(uri0);
            String s = navDeepLinkRequest0.getAction();
            boolean z = s != null && Intrinsics.areEqual(s, navDeepLink0.getAction());
            String s1 = navDeepLinkRequest0.getMimeType();
            int v1 = s1 == null ? -1 : navDeepLink0.getMimeTypeMatchRating(s1);
            if(bundle0 != null || (z || v1 > -1) && NavArgumentKt.missingRequiredArguments(this.g, new k(1, navDeepLink0.getMatchingPathAndQueryArgs$navigation_common_release(uri0, this.g))).isEmpty()) {
                DeepLinkMatch navDestination$DeepLinkMatch1 = new DeepLinkMatch(this, bundle0, navDeepLink0.isExactDeepLink(), v, z, v1);
                if(navDestination$DeepLinkMatch0 == null || navDestination$DeepLinkMatch1.compareTo(navDestination$DeepLinkMatch0) > 0) {
                    navDestination$DeepLinkMatch0 = navDestination$DeepLinkMatch1;
                }
            }
        }
        return navDestination$DeepLinkMatch0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final DeepLinkMatch matchDeepLink(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "route");
        Uri uri0 = Uri.parse(NavDestination.Companion.createRoute(s));
        Intrinsics.checkExpressionValueIsNotNull(uri0, "Uri.parse(this)");
        NavDeepLinkRequest navDeepLinkRequest0 = androidx.navigation.NavDeepLinkRequest.Builder.Companion.fromUri(uri0).build();
        return this instanceof NavGraph ? ((NavGraph)this).matchDeepLinkExcludingChildren(navDeepLinkRequest0) : this.matchDeepLink(navDeepLinkRequest0);
    }

    @CallSuper
    public void onInflate(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.Navigator);
        Intrinsics.checkNotNullExpressionValue(typedArray0, "context.resources.obtain…s, R.styleable.Navigator)");
        this.setRoute(typedArray0.getString(styleable.Navigator_route));
        if(typedArray0.hasValue(styleable.Navigator_android_id)) {
            this.setId(typedArray0.getResourceId(styleable.Navigator_android_id, 0));
            this.c = NavDestination.Companion.getDisplayName(context0, this.h);
        }
        this.d = typedArray0.getText(styleable.Navigator_android_label);
        typedArray0.recycle();
    }

    @JvmStatic
    @NotNull
    public static final Class parseClassFromName(@NotNull Context context0, @NotNull String s, @NotNull Class class0) {
        return NavDestination.Companion.parseClassFromName(context0, s, class0);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @JvmStatic
    @NotNull
    public static final Class parseClassFromNameInternal(@NotNull Context context0, @NotNull String s, @NotNull Class class0) {
        return NavDestination.Companion.parseClassFromNameInternal(context0, s, class0);
    }

    public final void putAction(@IdRes int v, @IdRes int v1) {
        this.putAction(v, new NavAction(v1, null, null, 6, null));
    }

    public final void putAction(@IdRes int v, @NotNull NavAction navAction0) {
        Intrinsics.checkNotNullParameter(navAction0, "action");
        if(!this.supportsActions()) {
            throw new UnsupportedOperationException("Cannot add action " + v + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
        if(v == 0) {
            throw new IllegalArgumentException("Cannot have an action with actionId 0");
        }
        this.f.put(v, navAction0);
    }

    public final void removeAction(@IdRes int v) {
        this.f.remove(v);
    }

    public final void removeArgument(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "argumentName");
        this.g.remove(s);
    }

    public final void setId(@IdRes int v) {
        this.h = v;
        this.c = null;
    }

    public final void setLabel(@Nullable CharSequence charSequence0) {
        this.d = charSequence0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setParent(@Nullable NavGraph navGraph0) {
        this.b = navGraph0;
    }

    public final void setRoute(@Nullable String s) {
        if(s == null) {
            this.setId(0);
        }
        else if(!p.isBlank(s)) {
            String s1 = NavDestination.Companion.createRoute(s);
            this.setId(s1.hashCode());
            this.addDeepLink(s1);
        }
        else {
            throw new IllegalArgumentException("Cannot have an empty route");
        }
        Object object0 = null;
        ArrayList arrayList0 = this.e;
        for(Object object1: arrayList0) {
            if(Intrinsics.areEqual(((NavDeepLink)object1).getUriPattern(), NavDestination.Companion.createRoute(this.i))) {
                object0 = object1;
                break;
            }
        }
        TypeIntrinsics.asMutableCollection(arrayList0).remove(object0);
        this.i = s;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean supportsActions() {
        return true;
    }

    @Override
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(this.getClass().getSimpleName());
        stringBuilder0.append("(");
        String s = this.c;
        if(s == null) {
            stringBuilder0.append("0x");
            stringBuilder0.append(Integer.toHexString(this.h));
        }
        else {
            stringBuilder0.append(s);
        }
        stringBuilder0.append(")");
        if(this.i != null && !p.isBlank(this.i)) {
            stringBuilder0.append(" route=");
            stringBuilder0.append(this.i);
        }
        if(this.d != null) {
            stringBuilder0.append(" label=");
            stringBuilder0.append(this.d);
        }
        String s1 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s1, "sb.toString()");
        return s1;
    }
}

