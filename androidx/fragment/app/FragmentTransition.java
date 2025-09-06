package androidx.fragment.app;

import android.view.View;
import androidx.collection.ArrayMap;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001J)\u0010\u0005\u001A\u0004\u0018\u00010\u0003*\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001A\u00020\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\n\u001A\u00020\t*\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\n\u0010\u000BJC\u0010\u0013\u001A\u00020\t2\u0006\u0010\r\u001A\u00020\f2\u0006\u0010\u000E\u001A\u00020\f2\u0006\u0010\u0010\u001A\u00020\u000F2\u0012\u0010\u0011\u001A\u000E\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00022\u0006\u0010\u0012\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0019\u001A\u00020\t2\f\u0010\u0016\u001A\b\u0012\u0004\u0012\u00020\u00070\u00152\u0006\u0010\u0018\u001A\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001AJ\u000F\u0010\u001B\u001A\u00020\u000FH\u0007¢\u0006\u0004\b\u001B\u0010\u001CR\u0016\u0010\u001E\u001A\u0004\u0018\u00010\u001D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001E\u0010\u001FR\u0016\u0010 \u001A\u0004\u0018\u00010\u001D8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u001F¨\u0006!"}, d2 = {"Landroidx/fragment/app/FragmentTransition;", "", "Landroidx/collection/ArrayMap;", "", "value", "findKeyForValue", "(Landroidx/collection/ArrayMap;Ljava/lang/String;)Ljava/lang/String;", "Landroid/view/View;", "namedViews", "", "retainValues", "(Landroidx/collection/ArrayMap;Landroidx/collection/ArrayMap;)V", "Landroidx/fragment/app/Fragment;", "inFragment", "outFragment", "", "isPop", "sharedElements", "isStart", "callSharedElementStartEnd", "(Landroidx/fragment/app/Fragment;Landroidx/fragment/app/Fragment;ZLandroidx/collection/ArrayMap;Z)V", "", "views", "", "visibility", "setViewVisibility", "(Ljava/util/List;I)V", "supportsTransition", "()Z", "Landroidx/fragment/app/FragmentTransitionImpl;", "PLATFORM_IMPL", "Landroidx/fragment/app/FragmentTransitionImpl;", "SUPPORT_IMPL", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFragmentTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,122:1\n515#2:123\n500#2,6:124\n125#3:130\n152#3,3:131\n125#3:134\n152#3,3:135\n125#3:138\n152#3,3:139\n1855#4,2:142\n*S KotlinDebug\n*F\n+ 1 FragmentTransition.kt\nandroidx/fragment/app/FragmentTransition\n*L\n50#1:123\n50#1:124,6\n53#1:130\n53#1:131,3\n98#1:134\n98#1:135,3\n99#1:138\n99#1:139,3\n113#1:142,2\n*E\n"})
public final class FragmentTransition {
    @NotNull
    public static final FragmentTransition INSTANCE;
    @JvmField
    @Nullable
    public static final FragmentTransitionImpl PLATFORM_IMPL;
    @JvmField
    @Nullable
    public static final FragmentTransitionImpl SUPPORT_IMPL;

    static {
        FragmentTransition.INSTANCE = new FragmentTransition();  // 初始化器: Ljava/lang/Object;-><init>()V
        FragmentTransition.PLATFORM_IMPL = new u1();  // 初始化器: Landroidx/fragment/app/FragmentTransitionImpl;-><init>()V
        FragmentTransitionImpl fragmentTransitionImpl0 = null;
        try {
            Intrinsics.checkNotNull(FragmentTransitionSupport.class, "null cannot be cast to non-null type java.lang.Class<androidx.fragment.app.FragmentTransitionImpl>");
            fragmentTransitionImpl0 = new FragmentTransitionSupport();
        }
        catch(Exception unused_ex) {
        }
        FragmentTransition.SUPPORT_IMPL = fragmentTransitionImpl0;
    }

    @JvmStatic
    public static final void callSharedElementStartEnd(@NotNull Fragment fragment0, @NotNull Fragment fragment1, boolean z, @NotNull ArrayMap arrayMap0, boolean z1) {
        Intrinsics.checkNotNullParameter(fragment0, "inFragment");
        Intrinsics.checkNotNullParameter(fragment1, "outFragment");
        Intrinsics.checkNotNullParameter(arrayMap0, "sharedElements");
        if((z ? fragment1.getEnterTransitionCallback() : fragment0.getEnterTransitionCallback()) != null) {
            ArrayList arrayList0 = new ArrayList(arrayMap0.size());
            for(Object object0: arrayMap0.entrySet()) {
                arrayList0.add(((View)((Map.Entry)object0).getValue()));
            }
            ArrayList arrayList1 = new ArrayList(arrayMap0.size());
            for(Object object1: arrayMap0.entrySet()) {
                arrayList1.add(((String)((Map.Entry)object1).getKey()));
            }
            if(z1) {
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final String findKeyForValue(@NotNull ArrayMap arrayMap0, @NotNull String s) {
        Intrinsics.checkNotNullParameter(arrayMap0, "<this>");
        Intrinsics.checkNotNullParameter(s, "value");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: arrayMap0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            if(Intrinsics.areEqual(map$Entry0.getValue(), s)) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        ArrayList arrayList0 = new ArrayList(linkedHashMap0.size());
        for(Object object1: linkedHashMap0.entrySet()) {
            arrayList0.add(((String)((Map.Entry)object1).getKey()));
        }
        return (String)CollectionsKt___CollectionsKt.firstOrNull(arrayList0);
    }

    @JvmStatic
    public static final void retainValues(@NotNull ArrayMap arrayMap0, @NotNull ArrayMap arrayMap1) {
        Intrinsics.checkNotNullParameter(arrayMap0, "<this>");
        Intrinsics.checkNotNullParameter(arrayMap1, "namedViews");
        for(int v = arrayMap0.size() - 1; -1 < v; --v) {
            if(!arrayMap1.containsKey(((String)arrayMap0.valueAt(v)))) {
                arrayMap0.removeAt(v);
            }
        }
    }

    @JvmStatic
    public static final void setViewVisibility(@NotNull List list0, int v) {
        Intrinsics.checkNotNullParameter(list0, "views");
        for(Object object0: list0) {
            ((View)object0).setVisibility(v);
        }
    }

    @JvmStatic
    public static final boolean supportsTransition() [...] // 潜在的解密器
}

