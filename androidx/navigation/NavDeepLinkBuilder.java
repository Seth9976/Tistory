package androidx.navigation;

import a5.b;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.IdRes;
import androidx.annotation.NavigationRes;
import androidx.core.app.TaskStackBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import n4.l;
import n4.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002*+B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0010\u0012\u0006\u0010\u0007\u001A\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001F\u0010\f\u001A\u00020\u00002\u0010\u0010\u000B\u001A\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001A\u00020\u00002\u0006\u0010\u000F\u001A\u00020\u000E¢\u0006\u0004\b\f\u0010\u0010J\u0017\u0010\u0013\u001A\u00020\u00002\b\b\u0001\u0010\u0012\u001A\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0013\u001A\u00020\u00002\u0006\u0010\u0016\u001A\u00020\u0015¢\u0006\u0004\b\u0013\u0010\u0017J%\u0010\u001B\u001A\u00020\u00002\b\b\u0001\u0010\u0018\u001A\u00020\u00112\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001B\u0010\u001CJ#\u0010\u001B\u001A\u00020\u00002\u0006\u0010\u001E\u001A\u00020\u001D2\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b\u001B\u0010\u001FJ%\u0010 \u001A\u00020\u00002\b\b\u0001\u0010\u0018\u001A\u00020\u00112\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b \u0010\u001CJ#\u0010 \u001A\u00020\u00002\u0006\u0010!\u001A\u00020\u001D2\n\b\u0002\u0010\u001A\u001A\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0004\b \u0010\u001FJ\u0017\u0010\"\u001A\u00020\u00002\b\u0010\u001A\u001A\u0004\u0018\u00010\u0019¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001A\u00020$¢\u0006\u0004\b%\u0010&J\r\u0010(\u001A\u00020\'¢\u0006\u0004\b(\u0010)¨\u0006,"}, d2 = {"Landroidx/navigation/NavDeepLinkBuilder;", "", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroidx/navigation/NavController;", "navController", "(Landroidx/navigation/NavController;)V", "Ljava/lang/Class;", "Landroid/app/Activity;", "activityClass", "setComponentName", "(Ljava/lang/Class;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroid/content/ComponentName;", "componentName", "(Landroid/content/ComponentName;)Landroidx/navigation/NavDeepLinkBuilder;", "", "navGraphId", "setGraph", "(I)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/navigation/NavGraph;", "navGraph", "(Landroidx/navigation/NavGraph;)Landroidx/navigation/NavDeepLinkBuilder;", "destId", "Landroid/os/Bundle;", "args", "setDestination", "(ILandroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "", "destRoute", "(Ljava/lang/String;Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "addDestination", "route", "setArguments", "(Landroid/os/Bundle;)Landroidx/navigation/NavDeepLinkBuilder;", "Landroidx/core/app/TaskStackBuilder;", "createTaskStackBuilder", "()Landroidx/core/app/TaskStackBuilder;", "Landroid/app/PendingIntent;", "createPendingIntent", "()Landroid/app/PendingIntent;", "n4/l", "n4/m", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nNavDeepLinkBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkBuilder.kt\nandroidx/navigation/NavDeepLinkBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,393:1\n1#2:394\n*E\n"})
public final class NavDeepLinkBuilder {
    public final Context a;
    public final Intent b;
    public NavGraph c;
    public final ArrayList d;
    public Bundle e;

    public NavDeepLinkBuilder(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        Intent intent0;
        super();
        this.a = context0;
        if(context0 instanceof Activity) {
            intent0 = new Intent(context0, context0.getClass());
        }
        else {
            intent0 = context0.getPackageManager().getLaunchIntentForPackage("net.daum.android.tistoryapp");
            if(intent0 == null) {
                intent0 = new Intent();
            }
        }
        intent0.addFlags(0x10008000);
        this.b = intent0;
        this.d = new ArrayList();
    }

    public NavDeepLinkBuilder(@NotNull NavController navController0) {
        Intrinsics.checkNotNullParameter(navController0, "navController");
        this(navController0.getContext());
        this.c = navController0.getGraph();
    }

    public final NavDestination a(int v) {
        ArrayDeque arrayDeque0 = new ArrayDeque();
        NavGraph navGraph0 = this.c;
        Intrinsics.checkNotNull(navGraph0);
        arrayDeque0.add(navGraph0);
        while(!arrayDeque0.isEmpty()) {
            NavDestination navDestination0 = (NavDestination)arrayDeque0.removeFirst();
            if(navDestination0.getId() == v) {
                return navDestination0;
            }
            if(navDestination0 instanceof NavGraph) {
                for(Object object0: ((NavGraph)navDestination0)) {
                    arrayDeque0.add(((NavDestination)object0));
                }
            }
        }
        return null;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@IdRes int v) {
        return NavDeepLinkBuilder.addDestination$default(this, v, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@IdRes int v, @Nullable Bundle bundle0) {
        l l0 = new l(v, bundle0);
        this.d.add(l0);
        if(this.c != null) {
            this.b();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "route");
        return NavDeepLinkBuilder.addDestination$default(this, s, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder addDestination(@NotNull String s, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(s, "route");
        l l0 = new l(NavDestination.Companion.createRoute(s).hashCode(), bundle0);
        this.d.add(l0);
        if(this.c != null) {
            this.b();
        }
        return this;
    }

    public static NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder0, int v, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.addDestination(v, bundle0);
    }

    public static NavDeepLinkBuilder addDestination$default(NavDeepLinkBuilder navDeepLinkBuilder0, String s, Bundle bundle0, int v, Object object0) {
        if((v & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.addDestination(s, bundle0);
    }

    public final void b() {
        for(Object object0: this.d) {
            int v = ((l)object0).a;
            if(this.a(v) == null) {
                StringBuilder stringBuilder0 = b.v("Navigation destination ", NavDestination.Companion.getDisplayName(this.a, v), " cannot be found in the navigation graph ");
                stringBuilder0.append(this.c);
                throw new IllegalArgumentException(stringBuilder0.toString());
            }
            if(false) {
                break;
            }
        }
    }

    @NotNull
    public final PendingIntent createPendingIntent() {
        int v;
        Bundle bundle0 = this.e;
        if(bundle0 == null) {
            v = 0;
        }
        else {
            v = 0;
            for(Object object0: bundle0.keySet()) {
                Object object1 = bundle0.get(((String)object0));
                v = v * 0x1F + (object1 == null ? 0 : object1.hashCode());
            }
        }
        for(Object object2: this.d) {
            v = v * 0x1F + ((l)object2).a;
            Bundle bundle1 = ((l)object2).b;
            if(bundle1 != null) {
                for(Object object3: bundle1.keySet()) {
                    Object object4 = bundle1.get(((String)object3));
                    v = v * 0x1F + (object4 == null ? 0 : object4.hashCode());
                }
            }
        }
        PendingIntent pendingIntent0 = this.createTaskStackBuilder().getPendingIntent(v, 0xC000000);
        Intrinsics.checkNotNull(pendingIntent0);
        return pendingIntent0;
    }

    @NotNull
    public final TaskStackBuilder createTaskStackBuilder() {
        int v;
        Context context0;
        if(this.c == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link");
        }
        ArrayList arrayList0 = this.d;
        if(arrayList0.isEmpty()) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link");
        }
        ArrayList arrayList1 = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator iterator0 = arrayList0.iterator();
        NavDestination navDestination0 = null;
        while(true) {
            boolean z = iterator0.hasNext();
            context0 = this.a;
            v = 0;
            if(!z) {
                break;
            }
            Object object0 = iterator0.next();
            l l0 = (l)object0;
            int v1 = l0.a;
            NavDestination navDestination1 = this.a(v1);
            if(navDestination1 != null) {
                int[] arr_v = navDestination1.buildDeepLinkIds(navDestination0);
                while(v < arr_v.length) {
                    arrayList1.add(((int)arr_v[v]));
                    arrayList2.add(l0.b);
                    ++v;
                }
                navDestination0 = navDestination1;
                continue;
            }
            StringBuilder stringBuilder0 = b.v("Navigation destination ", NavDestination.Companion.getDisplayName(context0, v1), " cannot be found in the navigation graph ");
            stringBuilder0.append(this.c);
            throw new IllegalArgumentException(stringBuilder0.toString());
        }
        int[] arr_v1 = CollectionsKt___CollectionsKt.toIntArray(arrayList1);
        Intent intent0 = this.b;
        intent0.putExtra("android-support-nav:controller:deepLinkIds", arr_v1);
        intent0.putParcelableArrayListExtra("android-support-nav:controller:deepLinkArgs", arrayList2);
        TaskStackBuilder taskStackBuilder0 = TaskStackBuilder.create(context0).addNextIntentWithParentStack(new Intent(intent0));
        Intrinsics.checkNotNullExpressionValue(taskStackBuilder0, "create(context).addNextI…rentStack(Intent(intent))");
        int v2 = taskStackBuilder0.getIntentCount();
        while(v < v2) {
            Intent intent1 = taskStackBuilder0.editIntentAt(v);
            if(intent1 != null) {
                intent1.putExtra("android-support-nav:controller:deepLinkIntent", intent0);
            }
            ++v;
        }
        return taskStackBuilder0;
    }

    @NotNull
    public final NavDeepLinkBuilder setArguments(@Nullable Bundle bundle0) {
        this.e = bundle0;
        this.b.putExtra("android-support-nav:controller:deepLinkExtras", bundle0);
        return this;
    }

    @NotNull
    public final NavDeepLinkBuilder setComponentName(@NotNull ComponentName componentName0) {
        Intrinsics.checkNotNullParameter(componentName0, "componentName");
        this.b.setComponent(componentName0);
        return this;
    }

    @NotNull
    public final NavDeepLinkBuilder setComponentName(@NotNull Class class0) {
        Intrinsics.checkNotNullParameter(class0, "activityClass");
        return this.setComponentName(new ComponentName(this.a, class0));
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@IdRes int v) {
        return NavDeepLinkBuilder.setDestination$default(this, v, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@IdRes int v, @Nullable Bundle bundle0) {
        this.d.clear();
        l l0 = new l(v, bundle0);
        this.d.add(l0);
        if(this.c != null) {
            this.b();
        }
        return this;
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "destRoute");
        return NavDeepLinkBuilder.setDestination$default(this, s, null, 2, null);
    }

    @JvmOverloads
    @NotNull
    public final NavDeepLinkBuilder setDestination(@NotNull String s, @Nullable Bundle bundle0) {
        Intrinsics.checkNotNullParameter(s, "destRoute");
        this.d.clear();
        l l0 = new l(NavDestination.Companion.createRoute(s).hashCode(), bundle0);
        this.d.add(l0);
        if(this.c != null) {
            this.b();
        }
        return this;
    }

    public static NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder0, int v, Bundle bundle0, int v1, Object object0) {
        if((v1 & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.setDestination(v, bundle0);
    }

    public static NavDeepLinkBuilder setDestination$default(NavDeepLinkBuilder navDeepLinkBuilder0, String s, Bundle bundle0, int v, Object object0) {
        if((v & 2) != 0) {
            bundle0 = null;
        }
        return navDeepLinkBuilder0.setDestination(s, bundle0);
    }

    @NotNull
    public final NavDeepLinkBuilder setGraph(@NavigationRes int v) {
        m m0 = new m();
        return this.setGraph(new NavInflater(this.a, m0).inflate(v));
    }

    @NotNull
    public final NavDeepLinkBuilder setGraph(@NotNull NavGraph navGraph0) {
        Intrinsics.checkNotNullParameter(navGraph0, "navGraph");
        this.c = navGraph0;
        this.b();
        return this;
    }
}

