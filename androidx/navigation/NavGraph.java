package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.IdRes;
import androidx.annotation.RestrictTo.Scope;
import androidx.annotation.RestrictTo;
import androidx.collection.SparseArrayCompat;
import androidx.collection.SparseArrayKt;
import androidx.navigation.common.R.styleable;
import androidx.navigation.serialization.RouteSerializerKt;
import b0.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.text.p;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001C\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u001E\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0007\n\u0002\u0010)\n\u0002\b\u000F\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 \\2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001\\B\u0017\u0012\u000E\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003\u00A2\u0006\u0004\b\u0005\u0010\u0006J\u001F\u0010\f\u001A\u00020\u000B2\u0006\u0010\b\u001A\u00020\u00072\u0006\u0010\n\u001A\u00020\tH\u0016\u00A2\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u000F\u001A\u00020\u000EH\u0017\u00A2\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001A\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001A\u00020\u000EH\u0007\u00A2\u0006\u0004\b\u0014\u0010\u0012J\u0015\u0010\u0016\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0001\u00A2\u0006\u0004\b\u0016\u0010\u0017J\u001D\u0010\u001A\u001A\u00020\u000B2\u000E\u0010\u0019\u001A\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0018\u00A2\u0006\u0004\b\u001A\u0010\u001BJ!\u0010\u001A\u001A\u00020\u000B2\u0012\u0010\u0019\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00010\u001C\"\u00020\u0001\u00A2\u0006\u0004\b\u001A\u0010\u001DJ\u0019\u0010 \u001A\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001F\u001A\u00020\u001E\u00A2\u0006\u0004\b \u0010!J-\u0010%\u001A\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001F\u001A\u00020\u001E2\b\u0010\"\u001A\u0004\u0018\u00010\u00012\u0006\u0010$\u001A\u00020#H\u0007\u00A2\u0006\u0004\b%\u0010&J\u0019\u0010 \u001A\u0004\u0018\u00010\u00012\b\u0010(\u001A\u0004\u0018\u00010\'\u00A2\u0006\u0004\b \u0010)J\u001A\u0010 \u001A\u0004\u0018\u00010\u0001\"\u0006\b\u0000\u0010*\u0018\u0001H\u0086\b\u00A2\u0006\u0004\b \u0010+J\u001F\u0010 \u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010*2\b\u0010(\u001A\u0004\u0018\u00018\u0000\u00A2\u0006\u0004\b \u0010,J!\u0010 \u001A\u0004\u0018\u00010\u00012\u0006\u0010(\u001A\u00020\'2\u0006\u0010-\u001A\u00020#H\u0007\u00A2\u0006\u0004\b \u0010.J\u0016\u00100\u001A\b\u0012\u0004\u0012\u00020\u00010/H\u0086\u0002\u00A2\u0006\u0004\b0\u00101J\u0015\u00103\u001A\u00020\u000B2\u0006\u00102\u001A\u00020\u0000\u00A2\u0006\u0004\b3\u00104J\u0015\u00105\u001A\u00020\u000B2\u0006\u0010\u0015\u001A\u00020\u0001\u00A2\u0006\u0004\b5\u0010\u0017J\r\u00106\u001A\u00020\u000B\u00A2\u0006\u0004\b6\u00107J\u000F\u00108\u001A\u00020\u001EH\u0007\u00A2\u0006\u0004\b8\u00109J\u0015\u0010;\u001A\u00020\u000B2\u0006\u0010:\u001A\u00020\u001E\u00A2\u0006\u0004\b;\u0010<J\u0015\u0010;\u001A\u00020\u000B2\u0006\u0010=\u001A\u00020\'\u00A2\u0006\u0004\b;\u0010>J\u001C\u0010;\u001A\u00020\u000B\"\n\b\u0000\u0010*\u0018\u0001*\u00020?H\u0086\b\u00A2\u0006\u0004\b;\u00107J\u001F\u0010;\u001A\u00020\u000B\"\b\b\u0000\u0010**\u00020?2\u0006\u0010=\u001A\u00028\u0000\u00A2\u0006\u0004\b;\u0010@J7\u0010;\u001A\u00020\u000B\"\u0004\b\u0000\u0010*2\f\u0010B\u001A\b\u0012\u0004\u0012\u00028\u00000A2\u0012\u0010D\u001A\u000E\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\'0CH\u0007\u00A2\u0006\u0004\b;\u0010EJ\u000F\u0010F\u001A\u00020\'H\u0016\u00A2\u0006\u0004\bF\u0010GJ\u001A\u0010H\u001A\u00020#2\b\u00102\u001A\u0004\u0018\u00010?H\u0096\u0002\u00A2\u0006\u0004\bH\u0010IJ\u000F\u0010J\u001A\u00020\u001EH\u0016\u00A2\u0006\u0004\bJ\u00109R\u001D\u0010\u0019\u001A\b\u0012\u0004\u0012\u00020\u00010K8G\u00A2\u0006\f\n\u0004\bL\u0010M\u001A\u0004\bN\u0010OR.\u0010T\u001A\u0004\u0018\u00010\'2\b\u0010=\u001A\u0004\u0018\u00010\'8\u0006@BX\u0086\u000E\u00A2\u0006\u0012\n\u0004\bP\u0010Q\u001A\u0004\bR\u0010G\"\u0004\bS\u0010>R$\u0010W\u001A\u00020\u001E2\u0006\u0010:\u001A\u00020\u001E8G@BX\u0086\u000E\u00A2\u0006\f\u001A\u0004\bU\u00109\"\u0004\bV\u0010<R\u0014\u0010Y\u001A\u00020\'8WX\u0096\u0004\u00A2\u0006\u0006\u001A\u0004\bX\u0010GR\u0011\u0010[\u001A\u00020\'8G\u00A2\u0006\u0006\u001A\u0004\bZ\u0010G\u00A8\u0006]"}, d2 = {"Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "", "Landroidx/navigation/Navigator;", "navGraphNavigator", "<init>", "(Landroidx/navigation/Navigator;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "onInflate", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroidx/navigation/NavDeepLinkRequest;", "navDeepLinkRequest", "Landroidx/navigation/NavDestination$DeepLinkMatch;", "matchDeepLink", "(Landroidx/navigation/NavDeepLinkRequest;)Landroidx/navigation/NavDestination$DeepLinkMatch;", "request", "matchDeepLinkExcludingChildren", "node", "addDestination", "(Landroidx/navigation/NavDestination;)V", "", "nodes", "addDestinations", "(Ljava/util/Collection;)V", "", "([Landroidx/navigation/NavDestination;)V", "", "resId", "findNode", "(I)Landroidx/navigation/NavDestination;", "lastVisited", "", "searchChildren", "findNodeComprehensive", "(ILandroidx/navigation/NavDestination;Z)Landroidx/navigation/NavDestination;", "", "route", "(Ljava/lang/String;)Landroidx/navigation/NavDestination;", "T", "()Landroidx/navigation/NavDestination;", "(Ljava/lang/Object;)Landroidx/navigation/NavDestination;", "searchParents", "(Ljava/lang/String;Z)Landroidx/navigation/NavDestination;", "", "iterator", "()Ljava/util/Iterator;", "other", "addAll", "(Landroidx/navigation/NavGraph;)V", "remove", "clear", "()V", "getStartDestination", "()I", "startDestId", "setStartDestination", "(I)V", "startDestRoute", "(Ljava/lang/String;)V", "", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "(Lkotlinx/serialization/KSerializer;Lkotlin/jvm/functions/Function1;)V", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Landroidx/collection/SparseArrayCompat;", "k", "Landroidx/collection/SparseArrayCompat;", "getNodes", "()Landroidx/collection/SparseArrayCompat;", "n", "Ljava/lang/String;", "getStartDestinationRoute", "b", "startDestinationRoute", "getStartDestinationId", "a", "startDestinationId", "getDisplayName", "displayName", "getStartDestDisplayName", "startDestDisplayName", "Companion", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,590:1\n232#2,3:591\n1603#3,9:594\n1855#3:603\n1856#3:605\n1612#3:606\n1#4:604\n1#4:607\n179#5,2:608\n1224#5,2:611\n22#6:610\n56#6,4:613\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n61#1:591,3\n73#1:594,9\n73#1:603\n73#1:605\n73#1:606\n73#1:604\n237#1:608,2\n476#1:611,2\n474#1:610\n481#1:613,4\n*E\n"})
public class NavGraph extends NavDestination implements Iterable, KMappedMarker {
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0004\u001A\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/navigation/NavGraph$Companion;", "", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavDestination;", "findStartDestination", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDestination;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @JvmStatic
        @NotNull
        public final NavDestination findStartDestination(@NotNull NavGraph navGraph0) {
            Intrinsics.checkNotNullParameter(navGraph0, "<this>");
            return (NavDestination)SequencesKt___SequencesKt.last(SequencesKt__SequencesKt.generateSequence(navGraph0.findNode(navGraph0.getStartDestinationId()), g.w));
        }
    }

    @NotNull
    public static final Companion Companion;
    public final SparseArrayCompat k;
    public int l;
    public String m;
    public String n;

    static {
        NavGraph.Companion = new Companion(null);
    }

    public NavGraph(@NotNull Navigator navigator0) {
        Intrinsics.checkNotNullParameter(navigator0, "navGraphNavigator");
        super(navigator0);
        this.k = new SparseArrayCompat();
    }

    public final void a(int v) {
        if(v == this.getId()) {
            throw new IllegalArgumentException(("Start destination " + v + " cannot use the same id as the graph " + this).toString());
        }
        if(this.n != null) {
            this.b(null);
        }
        this.l = v;
        this.m = null;
    }

    public final void addAll(@NotNull NavGraph navGraph0) {
        Intrinsics.checkNotNullParameter(navGraph0, "other");
        Iterator iterator0 = navGraph0.iterator();
        while(iterator0.hasNext()) {
            Object object0 = iterator0.next();
            iterator0.remove();
            this.addDestination(((NavDestination)object0));
        }
    }

    public final void addDestination(@NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navDestination0, "node");
        int v = navDestination0.getId();
        String s = navDestination0.getRoute();
        if(v == 0 && s == null) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.");
        }
        if(this.getRoute() != null && Intrinsics.areEqual(s, this.getRoute())) {
            throw new IllegalArgumentException(("Destination " + navDestination0 + " cannot have the same route as graph " + this).toString());
        }
        if(v == this.getId()) {
            throw new IllegalArgumentException(("Destination " + navDestination0 + " cannot have the same id as graph " + this).toString());
        }
        SparseArrayCompat sparseArrayCompat0 = this.k;
        NavDestination navDestination1 = (NavDestination)sparseArrayCompat0.get(v);
        if(navDestination1 == navDestination0) {
            return;
        }
        if(navDestination0.getParent() != null) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.");
        }
        if(navDestination1 != null) {
            navDestination1.setParent(null);
        }
        navDestination0.setParent(this);
        sparseArrayCompat0.put(navDestination0.getId(), navDestination0);
    }

    public final void addDestinations(@NotNull Collection collection0) {
        Intrinsics.checkNotNullParameter(collection0, "nodes");
        for(Object object0: collection0) {
            NavDestination navDestination0 = (NavDestination)object0;
            if(navDestination0 != null) {
                this.addDestination(navDestination0);
            }
        }
    }

    public final void addDestinations(@NotNull NavDestination[] arr_navDestination) {
        Intrinsics.checkNotNullParameter(arr_navDestination, "nodes");
        for(int v = 0; v < arr_navDestination.length; ++v) {
            this.addDestination(arr_navDestination[v]);
        }
    }

    public final void b(String s) {
        int v;
        if(s == null) {
            v = 0;
        }
        else {
            if(Intrinsics.areEqual(s, this.getRoute())) {
                throw new IllegalArgumentException(("Start destination " + s + " cannot use the same route as the graph " + this).toString());
            }
            if(p.isBlank(s)) {
                throw new IllegalArgumentException("Cannot have an empty start destination route");
            }
            v = NavDestination.Companion.createRoute(s).hashCode();
        }
        this.l = v;
        this.n = s;
    }

    public final void clear() {
        Iterator iterator0 = this.iterator();
        while(iterator0.hasNext()) {
            iterator0.next();
            iterator0.remove();
        }
    }

    @Override  // androidx.navigation.NavDestination
    public boolean equals(@Nullable Object object0) {
        if(this == object0) {
            return true;
        }
        if(object0 != null && object0 instanceof NavGraph && super.equals(object0)) {
            SparseArrayCompat sparseArrayCompat0 = this.k;
            SparseArrayCompat sparseArrayCompat1 = ((NavGraph)object0).k;
            if(sparseArrayCompat0.size() == sparseArrayCompat1.size() && this.getStartDestinationId() == ((NavGraph)object0).getStartDestinationId()) {
                for(Object object1: SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(sparseArrayCompat0))) {
                    if(Intrinsics.areEqual(((NavDestination)object1), sparseArrayCompat1.get(((NavDestination)object1).getId()))) {
                        continue;
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final NavDestination findNode() {
        Intrinsics.reifiedOperationMarker(6, "T");
        return this.findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer(null)));
    }

    @Nullable
    public final NavDestination findNode(@IdRes int v) {
        return this.findNodeComprehensive(v, this, false);
    }

    @Nullable
    public final NavDestination findNode(@Nullable Object object0) {
        return object0 == null ? null : this.findNode(RouteSerializerKt.generateHashCode(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(object0.getClass()))));
    }

    @Nullable
    public final NavDestination findNode(@Nullable String s) {
        return s == null || p.isBlank(s) ? null : this.findNode(s, true);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNode(@NotNull String s, boolean z) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(s, "route");
        for(Object object1: SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(this.k))) {
            if(p.equals$default(((NavDestination)object1).getRoute(), s, false, 2, null) || ((NavDestination)object1).matchDeepLink(s) != null) {
                object0 = object1;
                break;
            }
        }
        if(((NavDestination)object0) == null) {
            if(z && this.getParent() != null) {
                NavGraph navGraph0 = this.getParent();
                Intrinsics.checkNotNull(navGraph0);
                return navGraph0.findNode(s);
            }
            return null;
        }
        return (NavDestination)object0;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final NavDestination findNodeComprehensive(@IdRes int v, @Nullable NavDestination navDestination0, boolean z) {
        SparseArrayCompat sparseArrayCompat0 = this.k;
        NavDestination navDestination1 = (NavDestination)sparseArrayCompat0.get(v);
        if(navDestination1 != null) {
            return navDestination1;
        }
        if(z) {
            navDestination1 = null;
            for(Object object0: SequencesKt__SequencesKt.asSequence(SparseArrayKt.valueIterator(sparseArrayCompat0))) {
                NavDestination navDestination2 = (NavDestination)object0;
                NavDestination navDestination3 = !(navDestination2 instanceof NavGraph) || Intrinsics.areEqual(navDestination2, navDestination0) ? null : ((NavGraph)navDestination2).findNodeComprehensive(v, this, true);
                if(navDestination3 != null) {
                    navDestination1 = navDestination3;
                    break;
                }
            }
        }
        if(navDestination1 == null) {
            if(this.getParent() != null && !Intrinsics.areEqual(this.getParent(), navDestination0)) {
                NavGraph navGraph0 = this.getParent();
                Intrinsics.checkNotNull(navGraph0);
                return navGraph0.findNodeComprehensive(v, this, z);
            }
            return null;
        }
        return navDestination1;
    }

    @JvmStatic
    @NotNull
    public static final NavDestination findStartDestination(@NotNull NavGraph navGraph0) {
        return NavGraph.Companion.findStartDestination(navGraph0);
    }

    @Override  // androidx.navigation.NavDestination
    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public String getDisplayName() {
        return this.getId() == 0 ? "the root navigation" : super.getDisplayName();
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final SparseArrayCompat getNodes() {
        return this.k;
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @NotNull
    public final String getStartDestDisplayName() {
        if(this.m == null) {
            this.m = this.n == null ? String.valueOf(this.l) : this.n;
        }
        String s = this.m;
        Intrinsics.checkNotNull(s);
        return s;
    }

    @IdRes
    @Deprecated(message = "Use getStartDestinationId instead.", replaceWith = @ReplaceWith(expression = "startDestinationId", imports = {}))
    public final int getStartDestination() {
        return this.getStartDestinationId();
    }

    @IdRes
    public final int getStartDestinationId() {
        return this.l;
    }

    @Nullable
    public final String getStartDestinationRoute() {
        return this.n;
    }

    @Override  // androidx.navigation.NavDestination
    public int hashCode() {
        int v = this.getStartDestinationId();
        SparseArrayCompat sparseArrayCompat0 = this.k;
        int v1 = sparseArrayCompat0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            v = (v * 0x1F + sparseArrayCompat0.keyAt(v2)) * 0x1F + ((NavDestination)sparseArrayCompat0.valueAt(v2)).hashCode();
        }
        return v;
    }

    @Override
    @NotNull
    public final Iterator iterator() {
        return new Object() {
            public int a;
            public boolean b;
            public final NavGraph c;

            {
                this.c = navGraph0;
                this.a = -1;
            }

            @Override
            public boolean hasNext() {
                return this.a + 1 < this.c.getNodes().size();
            }

            @NotNull
            public NavDestination next() {
                if(!this.hasNext()) {
                    throw new NoSuchElementException();
                }
                this.b = true;
                int v = this.a + 1;
                this.a = v;
                Object object0 = this.c.getNodes().valueAt(v);
                Intrinsics.checkNotNullExpressionValue(object0, "nodes.valueAt(++index)");
                return (NavDestination)object0;
            }

            @Override
            public Object next() {
                return this.next();
            }

            @Override
            public void remove() {
                if(!this.b) {
                    throw new IllegalStateException("You must call next() before you can remove an element");
                }
                SparseArrayCompat sparseArrayCompat0 = this.c.getNodes();
                ((NavDestination)sparseArrayCompat0.valueAt(this.a)).setParent(null);
                sparseArrayCompat0.removeAt(this.a);
                --this.a;
                this.b = false;
            }
        };
    }

    @Override  // androidx.navigation.NavDestination
    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public DeepLinkMatch matchDeepLink(@NotNull NavDeepLinkRequest navDeepLinkRequest0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "navDeepLinkRequest");
        DeepLinkMatch navDestination$DeepLinkMatch0 = super.matchDeepLink(navDeepLinkRequest0);
        ArrayList arrayList0 = new ArrayList();
        for(Object object0: this) {
            DeepLinkMatch navDestination$DeepLinkMatch1 = ((NavDestination)object0).matchDeepLink(navDeepLinkRequest0);
            if(navDestination$DeepLinkMatch1 != null) {
                arrayList0.add(navDestination$DeepLinkMatch1);
            }
        }
        return (DeepLinkMatch)CollectionsKt___CollectionsKt.maxOrNull(CollectionsKt__CollectionsKt.listOfNotNull(new DeepLinkMatch[]{navDestination$DeepLinkMatch0, ((DeepLinkMatch)CollectionsKt___CollectionsKt.maxOrNull(arrayList0))}));
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    @Nullable
    public final DeepLinkMatch matchDeepLinkExcludingChildren(@NotNull NavDeepLinkRequest navDeepLinkRequest0) {
        Intrinsics.checkNotNullParameter(navDeepLinkRequest0, "request");
        return super.matchDeepLink(navDeepLinkRequest0);
    }

    @Override  // androidx.navigation.NavDestination
    public void onInflate(@NotNull Context context0, @NotNull AttributeSet attributeSet0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intrinsics.checkNotNullParameter(attributeSet0, "attrs");
        super.onInflate(context0, attributeSet0);
        TypedArray typedArray0 = context0.getResources().obtainAttributes(attributeSet0, styleable.NavGraphNavigator);
        Intrinsics.checkNotNullExpressionValue(typedArray0, "context.resources.obtain…leable.NavGraphNavigator)");
        this.a(typedArray0.getResourceId(styleable.NavGraphNavigator_startDestination, 0));
        this.m = NavDestination.Companion.getDisplayName(context0, this.l);
        typedArray0.recycle();
    }

    public final void remove(@NotNull NavDestination navDestination0) {
        Intrinsics.checkNotNullParameter(navDestination0, "node");
        SparseArrayCompat sparseArrayCompat0 = this.k;
        int v = sparseArrayCompat0.indexOfKey(navDestination0.getId());
        if(v >= 0) {
            ((NavDestination)sparseArrayCompat0.valueAt(v)).setParent(null);
            sparseArrayCompat0.removeAt(v);
        }
    }

    public final void setStartDestination() {
        Intrinsics.reifiedOperationMarker(6, "T");
        this.setStartDestination(SerializersKt.serializer(null), androidx.navigation.NavGraph.setStartDestination.1.INSTANCE);

        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001A\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "startDestination", "Landroidx/navigation/NavDestination;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$setStartDestination$1\n*L\n1#1,590:1\n*E\n"})
        public final class androidx.navigation.NavGraph.setStartDestination.1 extends Lambda implements Function1 {
            public static final androidx.navigation.NavGraph.setStartDestination.1 INSTANCE;

            static {
                androidx.navigation.NavGraph.setStartDestination.1.INSTANCE = new androidx.navigation.NavGraph.setStartDestination.1();
            }

            public androidx.navigation.NavGraph.setStartDestination.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((NavDestination)object0));
            }

            @NotNull
            public final String invoke(@NotNull NavDestination navDestination0) {
                Intrinsics.checkNotNullParameter(navDestination0, "startDestination");
                String s = navDestination0.getRoute();
                Intrinsics.checkNotNull(s);
                return s;
            }
        }

    }

    public final void setStartDestination(int v) {
        this.a(v);
    }

    public final void setStartDestination(@NotNull Object object0) {
        Intrinsics.checkNotNullParameter(object0, "startDestRoute");
        this.setStartDestination(SerializersKt.serializer(Reflection.getOrCreateKotlinClass(object0.getClass())), new f(object0, 6));
    }

    public final void setStartDestination(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "startDestRoute");
        this.b(s);
    }

    @RestrictTo({Scope.LIBRARY_GROUP})
    public final void setStartDestination(@NotNull KSerializer kSerializer0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(kSerializer0, "serializer");
        Intrinsics.checkNotNullParameter(function10, "parseRoute");
        int v = RouteSerializerKt.generateHashCode(kSerializer0);
        NavDestination navDestination0 = this.findNode(v);
        if(navDestination0 == null) {
            throw new IllegalStateException(("Cannot find startDestination " + kSerializer0.getDescriptor().getSerialName() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
        this.b(((String)function10.invoke(navDestination0)));
        this.l = v;
    }

    @Override  // androidx.navigation.NavDestination
    @NotNull
    public String toString() {
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(super.toString());
        NavDestination navDestination0 = this.findNode(this.n);
        if(navDestination0 == null) {
            navDestination0 = this.findNode(this.getStartDestinationId());
        }
        stringBuilder0.append(" startDestination=");
        if(navDestination0 == null) {
            String s = this.n;
            if(s == null) {
                String s1 = this.m;
                if(s1 == null) {
                    stringBuilder0.append("0x" + Integer.toHexString(this.l));
                }
                else {
                    stringBuilder0.append(s1);
                }
            }
            else {
                stringBuilder0.append(s);
            }
        }
        else {
            stringBuilder0.append("{");
            stringBuilder0.append(navDestination0.toString());
            stringBuilder0.append("}");
        }
        String s2 = stringBuilder0.toString();
        Intrinsics.checkNotNullExpressionValue(s2, "sb.toString()");
        return s2;
    }
}

