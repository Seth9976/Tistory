package androidx.fragment.app;

import android.animation.Animator;
import android.content.Context;
import android.graphics.Rect;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.collection.ArrayMap;
import androidx.core.app.SharedElementCallback;
import androidx.core.os.CancellationSignal;
import androidx.core.view.OneShotPreDrawListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0003\u000E\u000F\u0010B\u000F\u0012\u0006\u0010\u0003\u001A\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001A\u00020\u000B2\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001A\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Landroidx/fragment/app/DefaultSpecialEffectsController;", "Landroidx/fragment/app/SpecialEffectsController;", "Landroid/view/ViewGroup;", "container", "<init>", "(Landroid/view/ViewGroup;)V", "", "Landroidx/fragment/app/SpecialEffectsController$Operation;", "operations", "", "isPop", "", "executeOperations", "(Ljava/util/List;Z)V", "androidx/fragment/app/i", "androidx/fragment/app/j", "androidx/fragment/app/k", "fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nDefaultSpecialEffectsController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,877:1\n288#2,2:878\n533#2,6:880\n819#2:886\n847#2,2:887\n766#2:889\n857#2,2:890\n1789#2,3:892\n819#2:895\n847#2,2:896\n1855#2,2:898\n*S KotlinDebug\n*F\n+ 1 DefaultSpecialEffectsController.kt\nandroidx/fragment/app/DefaultSpecialEffectsController\n*L\n47#1:878,2\n53#1:880,6\n312#1:886\n312#1:887,2\n315#1:889\n315#1:890,2\n317#1:892,3\n629#1:895\n629#1:896,2\n632#1:898,2\n*E\n"})
public final class DefaultSpecialEffectsController extends SpecialEffectsController {
    public static final int f;

    public DefaultSpecialEffectsController(@NotNull ViewGroup viewGroup0) {
        Intrinsics.checkNotNullParameter(viewGroup0, "container");
        super(viewGroup0);
    }

    public static void d(View view0, ArrayList arrayList0) {
        if(view0 instanceof ViewGroup) {
            if(!ViewGroupCompat.isTransitionGroup(((ViewGroup)view0))) {
                int v = ((ViewGroup)view0).getChildCount();
                for(int v1 = 0; v1 < v; ++v1) {
                    View view1 = ((ViewGroup)view0).getChildAt(v1);
                    if(view1.getVisibility() == 0) {
                        Intrinsics.checkNotNullExpressionValue(view1, "child");
                        DefaultSpecialEffectsController.d(view1, arrayList0);
                    }
                }
            }
            else if(!arrayList0.contains(view0)) {
                arrayList0.add(view0);
            }
        }
        else if(!arrayList0.contains(view0)) {
            arrayList0.add(view0);
        }
    }

    public static void e(ArrayMap arrayMap0, View view0) {
        String s = ViewCompat.getTransitionName(view0);
        if(s != null) {
            arrayMap0.put(s, view0);
        }
        if(view0 instanceof ViewGroup) {
            int v = ((ViewGroup)view0).getChildCount();
            for(int v1 = 0; v1 < v; ++v1) {
                View view1 = ((ViewGroup)view0).getChildAt(v1);
                if(view1.getVisibility() == 0) {
                    Intrinsics.checkNotNullExpressionValue(view1, "child");
                    DefaultSpecialEffectsController.e(arrayMap0, view1);
                }
            }
        }
    }

    @Override  // androidx.fragment.app.SpecialEffectsController
    public void executeOperations(@NotNull List list0, boolean z) {
        Operation specialEffectsController$Operation10;
        Operation specialEffectsController$Operation8;
        Operation specialEffectsController$Operation7;
        View view13;
        View view12;
        Object object19;
        Iterator iterator11;
        Object object15;
        Object object14;
        ArrayList arrayList10;
        List list3;
        LinkedHashMap linkedHashMap1;
        List list2;
        Operation specialEffectsController$Operation3;
        Operation specialEffectsController$Operation2;
        ArrayList arrayList4;
        boolean z1;
        Object object1;
        Intrinsics.checkNotNullParameter(list0, "operations");
        for(Object object0: list0) {
            View view0 = ((Operation)object0).getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view0, "operation.fragment.mView");
            if(State.Companion.asOperationState(view0) != State.VISIBLE || ((Operation)object0).getFinalState() == State.VISIBLE) {
                continue;
            }
            goto label_9;
        }
        object0 = null;
    label_9:
        Operation specialEffectsController$Operation0 = (Operation)object0;
        ListIterator listIterator0 = list0.listIterator(list0.size());
        while(listIterator0.hasPrevious()) {
            object1 = listIterator0.previous();
            View view1 = ((Operation)object1).getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view1, "operation.fragment.mView");
            if(State.Companion.asOperationState(view1) == State.VISIBLE || ((Operation)object1).getFinalState() != State.VISIBLE) {
                continue;
            }
            goto label_18;
        }
        object1 = null;
    label_18:
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Executing operations from " + specialEffectsController$Operation0 + " to " + ((Operation)object1));
        }
        ArrayList arrayList0 = new ArrayList();
        ArrayList arrayList1 = new ArrayList();
        List list1 = CollectionsKt___CollectionsKt.toMutableList(list0);
        Fragment fragment0 = ((Operation)CollectionsKt___CollectionsKt.last(list0)).getFragment();
        for(Object object2: list0) {
            ((Operation)object2).getFragment().mAnimationInfo.b = fragment0.mAnimationInfo.b;
            ((Operation)object2).getFragment().mAnimationInfo.c = fragment0.mAnimationInfo.c;
            ((Operation)object2).getFragment().mAnimationInfo.d = fragment0.mAnimationInfo.d;
            ((Operation)object2).getFragment().mAnimationInfo.e = fragment0.mAnimationInfo.e;
        }
        for(Object object3: list0) {
            Operation specialEffectsController$Operation1 = (Operation)object3;
            CancellationSignal cancellationSignal0 = new CancellationSignal();
            specialEffectsController$Operation1.markStartedSpecialEffect(cancellationSignal0);
            arrayList0.add(new i(specialEffectsController$Operation1, cancellationSignal0, z));
            CancellationSignal cancellationSignal1 = new CancellationSignal();
            specialEffectsController$Operation1.markStartedSpecialEffect(cancellationSignal1);
            if(!z) {
                if(specialEffectsController$Operation1 == ((Operation)object1)) {
                    z1 = true;
                }
            }
            else if(specialEffectsController$Operation1 == specialEffectsController$Operation0) {
                z1 = true;
            }
            else {
                z1 = false;
            }
            arrayList1.add(new k(specialEffectsController$Operation1, cancellationSignal1, z, z1));
            specialEffectsController$Operation1.addCompletionListener(new e(list1, specialEffectsController$Operation1, 0, this));
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        ArrayList arrayList2 = new ArrayList();
        for(Object object4: arrayList1) {
            if(!((k)object4).b()) {
                arrayList2.add(object4);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for(Object object5: arrayList2) {
            if(((k)object5).c() != null) {
                arrayList3.add(object5);
            }
        }
        FragmentTransitionImpl fragmentTransitionImpl0 = null;
        for(Object object6: arrayList3) {
            k k0 = (k)object6;
            FragmentTransitionImpl fragmentTransitionImpl1 = k0.c();
            if(fragmentTransitionImpl0 != null && fragmentTransitionImpl1 != fragmentTransitionImpl0) {
                throw new IllegalArgumentException(("Mixing framework transitions and AndroidX transitions is not allowed. Fragment " + k0.a.getFragment() + " returned Transition " + k0.c + " which uses a different Transition type than other Fragments.").toString());
            }
            fragmentTransitionImpl0 = fragmentTransitionImpl1;
        }
        if(fragmentTransitionImpl0 == null) {
            for(Object object7: arrayList1) {
                linkedHashMap0.put(((k)object7).a, Boolean.FALSE);
                ((k)object7).a();
            }
            arrayList4 = arrayList0;
            specialEffectsController$Operation2 = specialEffectsController$Operation0;
            specialEffectsController$Operation3 = (Operation)object1;
            list2 = list1;
            linkedHashMap1 = linkedHashMap0;
        }
        else {
            View view2 = new View(this.getContainer().getContext());
            Rect rect0 = new Rect();
            ArrayList arrayList5 = new ArrayList();
            ArrayList arrayList6 = new ArrayList();
            ArrayMap arrayMap0 = new ArrayMap();
            arrayList4 = arrayList0;
            Object object8 = null;
            View view3 = null;
            boolean z2 = false;
            for(Object object9: arrayList1) {
                Object object10 = ((k)object9).e;
                if(object10 == null || specialEffectsController$Operation0 == null || ((Operation)object1) == null) {
                label_240:
                    arrayList10 = arrayList1;
                    list3 = list1;
                }
                else {
                    Object object11 = fragmentTransitionImpl0.wrapTransitionInSet(fragmentTransitionImpl0.cloneTransition(object10));
                    ArrayList arrayList7 = ((Operation)object1).getFragment().getSharedElementSourceNames();
                    list3 = list1;
                    Intrinsics.checkNotNullExpressionValue(arrayList7, "lastIn.fragment.sharedElementSourceNames");
                    ArrayList arrayList8 = specialEffectsController$Operation0.getFragment().getSharedElementSourceNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList8, "firstOut.fragment.sharedElementSourceNames");
                    ArrayList arrayList9 = specialEffectsController$Operation0.getFragment().getSharedElementTargetNames();
                    arrayList10 = arrayList1;
                    Intrinsics.checkNotNullExpressionValue(arrayList9, "firstOut.fragment.sharedElementTargetNames");
                    int v = arrayList9.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        int v2 = arrayList7.indexOf(arrayList9.get(v1));
                        if(v2 != -1) {
                            arrayList7.set(v2, arrayList8.get(v1));
                        }
                    }
                    ArrayList arrayList11 = ((Operation)object1).getFragment().getSharedElementTargetNames();
                    Intrinsics.checkNotNullExpressionValue(arrayList11, "lastIn.fragment.sharedElementTargetNames");
                    Pair pair0 = z ? TuplesKt.to(specialEffectsController$Operation0.getFragment().getEnterTransitionCallback(), ((Operation)object1).getFragment().getExitTransitionCallback()) : TuplesKt.to(specialEffectsController$Operation0.getFragment().getExitTransitionCallback(), ((Operation)object1).getFragment().getEnterTransitionCallback());
                    SharedElementCallback sharedElementCallback0 = (SharedElementCallback)pair0.component1();
                    SharedElementCallback sharedElementCallback1 = (SharedElementCallback)pair0.component2();
                    int v3 = arrayList7.size();
                    for(int v4 = 0; v4 < v3; ++v4) {
                        arrayMap0.put(((String)arrayList7.get(v4)), ((String)arrayList11.get(v4)));
                    }
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", ">>> entering view names <<<");
                        for(Object object12: arrayList11) {
                            Log.v("FragmentManager", "Name: " + ((String)object12));
                        }
                        Log.v("FragmentManager", ">>> exiting view names <<<");
                        for(Object object13: arrayList7) {
                            Log.v("FragmentManager", "Name: " + ((String)object13));
                        }
                    }
                    ArrayMap arrayMap1 = new ArrayMap();
                    View view4 = specialEffectsController$Operation0.getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view4, "firstOut.fragment.mView");
                    DefaultSpecialEffectsController.e(arrayMap1, view4);
                    arrayMap1.retainAll(arrayList7);
                    if(sharedElementCallback0 == null) {
                    label_171:
                        object14 = object11;
                        arrayMap0.retainAll(arrayMap1.keySet());
                    }
                    else {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Executing exit callback for operation " + specialEffectsController$Operation0);
                        }
                        int v5 = arrayList7.size() - 1;
                        if(v5 >= 0) {
                            while(true) {
                                String s = (String)arrayList7.get(v5);
                                View view5 = (View)arrayMap1.get(s);
                                if(view5 == null) {
                                    arrayMap0.remove(s);
                                    object14 = object11;
                                }
                                else {
                                    object14 = object11;
                                    if(!Intrinsics.areEqual(s, ViewCompat.getTransitionName(view5))) {
                                        String s1 = (String)arrayMap0.remove(s);
                                        arrayMap0.put(ViewCompat.getTransitionName(view5), s1);
                                    }
                                }
                                if(v5 - 1 < 0) {
                                    goto label_173;
                                }
                                --v5;
                                object11 = object14;
                            }
                        }
                        else {
                            object14 = object11;
                            goto label_173;
                        }
                        goto label_171;
                    }
                label_173:
                    ArrayMap arrayMap2 = new ArrayMap();
                    View view6 = ((Operation)object1).getFragment().mView;
                    Intrinsics.checkNotNullExpressionValue(view6, "lastIn.fragment.mView");
                    DefaultSpecialEffectsController.e(arrayMap2, view6);
                    arrayMap2.retainAll(arrayList11);
                    arrayMap2.retainAll(arrayMap0.values());
                    if(sharedElementCallback1 == null) {
                        FragmentTransition.retainValues(arrayMap0, arrayMap2);
                    }
                    else {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "Executing enter callback for operation " + ((Operation)object1));
                        }
                        int v6 = arrayList11.size() - 1;
                        if(v6 >= 0) {
                            while(true) {
                                String s2 = (String)arrayList11.get(v6);
                                View view7 = (View)arrayMap2.get(s2);
                                if(view7 == null) {
                                    Intrinsics.checkNotNullExpressionValue(s2, "name");
                                    String s3 = FragmentTransition.findKeyForValue(arrayMap0, s2);
                                    if(s3 != null) {
                                        arrayMap0.remove(s3);
                                    }
                                }
                                else if(!Intrinsics.areEqual(s2, ViewCompat.getTransitionName(view7))) {
                                    Intrinsics.checkNotNullExpressionValue(s2, "name");
                                    String s4 = FragmentTransition.findKeyForValue(arrayMap0, s2);
                                    if(s4 != null) {
                                        arrayMap0.put(s4, ViewCompat.getTransitionName(view7));
                                    }
                                }
                                if(v6 - 1 < 0) {
                                    break;
                                }
                                --v6;
                            }
                        }
                    }
                    Set set0 = arrayMap0.keySet();
                    Intrinsics.checkNotNullExpressionValue(set0, "sharedElementNameMapping.keys");
                    Set set1 = arrayMap1.entrySet();
                    Intrinsics.checkNotNullExpressionValue(set1, "entries");
                    o.retainAll(set1, new l(set0, 0));
                    Collection collection0 = arrayMap0.values();
                    Intrinsics.checkNotNullExpressionValue(collection0, "sharedElementNameMapping.values");
                    Set set2 = arrayMap2.entrySet();
                    Intrinsics.checkNotNullExpressionValue(set2, "entries");
                    o.retainAll(set2, new l(collection0, 0));
                    if(arrayMap0.isEmpty()) {
                        arrayList5.clear();
                        arrayList6.clear();
                        list1 = list3;
                        arrayList1 = arrayList10;
                        object8 = null;
                        continue;
                    }
                    else {
                        FragmentTransition.callSharedElementStartEnd(((Operation)object1).getFragment(), specialEffectsController$Operation0.getFragment(), z, arrayMap1, true);
                        OneShotPreDrawListener.add(this.getContainer(), new h(((Operation)object1), specialEffectsController$Operation0, z, arrayMap2));
                        arrayList5.addAll(arrayMap1.values());
                        if(arrayList7.isEmpty()) {
                            object15 = object14;
                        }
                        else {
                            View view8 = (View)arrayMap1.get(((String)arrayList7.get(0)));
                            object15 = object14;
                            fragmentTransitionImpl0.setEpicenter(object15, view8);
                            view3 = view8;
                        }
                        arrayList6.addAll(arrayMap2.values());
                        if(!arrayList11.isEmpty()) {
                            View view9 = (View)arrayMap2.get(((String)arrayList11.get(0)));
                            if(view9 != null) {
                                OneShotPreDrawListener.add(this.getContainer(), new e(fragmentTransitionImpl0, view9, 1, rect0));
                                z2 = true;
                            }
                        }
                        fragmentTransitionImpl0.setSharedElementTargets(object15, view2, arrayList5);
                        fragmentTransitionImpl0.scheduleRemoveTargets(object15, null, null, null, null, object15, arrayList6);
                        linkedHashMap0.put(specialEffectsController$Operation0, Boolean.TRUE);
                        linkedHashMap0.put(((Operation)object1), Boolean.TRUE);
                        object8 = object15;
                        goto label_242;
                    }
                    goto label_240;
                }
            label_242:
                list1 = list3;
                arrayList1 = arrayList10;
            }
            View view10 = view3;
            list2 = list1;
            linkedHashMap1 = linkedHashMap0;
            ArrayList arrayList12 = new ArrayList();
            Object object16 = null;
            Object object17 = null;
            Iterator iterator10 = arrayList1.iterator();
            while(iterator10.hasNext()) {
                Object object18 = iterator10.next();
                k k1 = (k)object18;
                boolean z3 = k1.b();
                Operation specialEffectsController$Operation4 = k1.a;
                if(z3) {
                    iterator11 = iterator10;
                    linkedHashMap1.put(specialEffectsController$Operation4, Boolean.FALSE);
                    k1.a();
                }
                else {
                    iterator11 = iterator10;
                    object19 = fragmentTransitionImpl0.cloneTransition(k1.c);
                    boolean z4 = object8 != null && (specialEffectsController$Operation4 == specialEffectsController$Operation0 || specialEffectsController$Operation4 == ((Operation)object1));
                    if(object19 != null) {
                        goto label_271;
                    }
                    else if(!z4) {
                        linkedHashMap1.put(specialEffectsController$Operation4, Boolean.FALSE);
                        k1.a();
                    }
                }
                iterator10 = iterator11;
                continue;
            label_271:
                ArrayList arrayList13 = new ArrayList();
                View view11 = specialEffectsController$Operation4.getFragment().mView;
                Intrinsics.checkNotNullExpressionValue(view11, "operation.fragment.mView");
                DefaultSpecialEffectsController.d(view11, arrayList13);
                if(z4) {
                    if(specialEffectsController$Operation4 == specialEffectsController$Operation0) {
                        arrayList13.removeAll(CollectionsKt___CollectionsKt.toSet(arrayList5));
                    }
                    else {
                        arrayList13.removeAll(CollectionsKt___CollectionsKt.toSet(arrayList6));
                    }
                }
                if(arrayList13.isEmpty()) {
                    fragmentTransitionImpl0.addTarget(object19, view2);
                    view12 = view2;
                }
                else {
                    fragmentTransitionImpl0.addTargets(object19, arrayList13);
                    fragmentTransitionImpl0.scheduleRemoveTargets(object19, object19, arrayList13, null, null, null, null);
                    view12 = view2;
                    if(specialEffectsController$Operation4.getFinalState() == State.GONE) {
                        list2.remove(specialEffectsController$Operation4);
                        ArrayList arrayList14 = new ArrayList(arrayList13);
                        arrayList14.remove(specialEffectsController$Operation4.getFragment().mView);
                        fragmentTransitionImpl0.scheduleHideFragmentView(object19, specialEffectsController$Operation4.getFragment().mView, arrayList14);
                        OneShotPreDrawListener.add(this.getContainer(), new r(arrayList13, 1));
                    }
                }
                if(specialEffectsController$Operation4.getFinalState() == State.VISIBLE) {
                    arrayList12.addAll(arrayList13);
                    if(z2) {
                        fragmentTransitionImpl0.setEpicenter(object19, rect0);
                    }
                    view13 = view10;
                }
                else {
                    view13 = view10;
                    fragmentTransitionImpl0.setEpicenter(object19, view13);
                }
                linkedHashMap1.put(specialEffectsController$Operation4, Boolean.TRUE);
                if(k1.d) {
                    object16 = fragmentTransitionImpl0.mergeTransitionsTogether(object16, object19, null);
                }
                else {
                    object17 = fragmentTransitionImpl0.mergeTransitionsTogether(object17, object19, null);
                }
                iterator10 = iterator11;
                view10 = view13;
                view2 = view12;
            }
            specialEffectsController$Operation3 = (Operation)object1;
            Object object20 = fragmentTransitionImpl0.mergeTransitionsInSequence(object16, object17, object8);
            if(object20 == null) {
                specialEffectsController$Operation2 = specialEffectsController$Operation0;
            }
            else {
                ArrayList arrayList15 = new ArrayList();
                for(Object object21: arrayList1) {
                    if(!((k)object21).b()) {
                        arrayList15.add(object21);
                    }
                }
                for(Object object22: arrayList15) {
                    k k2 = (k)object22;
                    Operation specialEffectsController$Operation5 = k2.a;
                    if(k2.c == null && (object8 == null || specialEffectsController$Operation5 != specialEffectsController$Operation0 && specialEffectsController$Operation5 != specialEffectsController$Operation3)) {
                    }
                    else if(ViewCompat.isLaidOut(this.getContainer())) {
                        b2 b20 = new b2(k2, specialEffectsController$Operation5, 2);
                        fragmentTransitionImpl0.setListenerForTransitionEnd(specialEffectsController$Operation5.getFragment(), object20, k2.b, b20);
                    }
                    else {
                        if(FragmentManager.isLoggingEnabled(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Container " + this.getContainer() + " has not been laid out. Completing operation " + specialEffectsController$Operation5);
                        }
                        k2.a();
                    }
                }
                Operation specialEffectsController$Operation6 = specialEffectsController$Operation3;
                if(ViewCompat.isLaidOut(this.getContainer())) {
                    FragmentTransition.setViewVisibility(arrayList12, 4);
                    ArrayList arrayList16 = new ArrayList();
                    int v7 = arrayList6.size();
                    for(int v8 = 0; v8 < v7; ++v8) {
                        View view14 = (View)arrayList6.get(v8);
                        arrayList16.add(ViewCompat.getTransitionName(view14));
                        ViewCompat.setTransitionName(view14, null);
                    }
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", ">>>>> Beginning transition <<<<<");
                        Log.v("FragmentManager", ">>>>> SharedElementFirstOutViews <<<<<");
                        for(Object object23: arrayList5) {
                            Intrinsics.checkNotNullExpressionValue(object23, "sharedElementFirstOutViews");
                            Log.v("FragmentManager", "View: " + ((View)object23) + " Name: " + ViewCompat.getTransitionName(((View)object23)));
                        }
                        Log.v("FragmentManager", ">>>>> SharedElementLastInViews <<<<<");
                        for(Object object24: arrayList6) {
                            Intrinsics.checkNotNullExpressionValue(object24, "sharedElementLastInViews");
                            Log.v("FragmentManager", "View: " + ((View)object24) + " Name: " + ViewCompat.getTransitionName(((View)object24)));
                        }
                    }
                    fragmentTransitionImpl0.beginDelayedTransition(this.getContainer(), object20);
                    ViewGroup viewGroup0 = this.getContainer();
                    int v9 = arrayList6.size();
                    ArrayList arrayList17 = new ArrayList();
                    int v10 = 0;
                    while(v10 < v9) {
                        View view15 = (View)arrayList5.get(v10);
                        String s5 = ViewCompat.getTransitionName(view15);
                        arrayList17.add(s5);
                        if(s5 == null) {
                            specialEffectsController$Operation7 = specialEffectsController$Operation0;
                            specialEffectsController$Operation8 = specialEffectsController$Operation6;
                        }
                        else {
                            specialEffectsController$Operation8 = specialEffectsController$Operation6;
                            ViewCompat.setTransitionName(view15, null);
                            String s6 = (String)arrayMap0.get(s5);
                            int v11 = 0;
                            while(true) {
                                specialEffectsController$Operation7 = specialEffectsController$Operation0;
                                if(v11 >= v9) {
                                    break;
                                }
                                if(s6.equals(arrayList16.get(v11))) {
                                    ViewCompat.setTransitionName(((View)arrayList6.get(v11)), s5);
                                    break;
                                }
                                ++v11;
                                specialEffectsController$Operation0 = specialEffectsController$Operation7;
                            }
                        }
                        ++v10;
                        specialEffectsController$Operation0 = specialEffectsController$Operation7;
                        specialEffectsController$Operation6 = specialEffectsController$Operation8;
                    }
                    specialEffectsController$Operation2 = specialEffectsController$Operation0;
                    specialEffectsController$Operation3 = specialEffectsController$Operation6;
                    OneShotPreDrawListener.add(viewGroup0, new v1(v9, arrayList6, arrayList16, arrayList5, arrayList17));
                    FragmentTransition.setViewVisibility(arrayList12, 0);
                    fragmentTransitionImpl0.swapSharedElementTargets(object8, arrayList5, arrayList6);
                }
                else {
                    specialEffectsController$Operation2 = specialEffectsController$Operation0;
                    specialEffectsController$Operation3 = specialEffectsController$Operation6;
                }
            }
        }
        boolean z5 = linkedHashMap1.containsValue(Boolean.TRUE);
        Context context0 = this.getContainer().getContext();
        ArrayList arrayList18 = new ArrayList();
        boolean z6 = false;
        for(Object object25: arrayList4) {
            i i0 = (i)object25;
            if(i0.b()) {
                i0.a();
            }
            else {
                Intrinsics.checkNotNullExpressionValue(context0, "context");
                g0 g00 = i0.c(context0);
                if(g00 == null) {
                    i0.a();
                }
                else {
                    Animator animator0 = g00.b;
                    if(animator0 == null) {
                        arrayList18.add(i0);
                    }
                    else {
                        Operation specialEffectsController$Operation9 = i0.a;
                        Fragment fragment1 = specialEffectsController$Operation9.getFragment();
                        if(Intrinsics.areEqual(linkedHashMap1.get(specialEffectsController$Operation9), Boolean.TRUE)) {
                            if(FragmentManager.isLoggingEnabled(2)) {
                                Log.v("FragmentManager", "Ignoring Animator set on " + fragment1 + " as this Fragment was involved in a Transition.");
                            }
                            i0.a();
                        }
                        else {
                            boolean z7 = specialEffectsController$Operation9.getFinalState() == State.GONE;
                            if(z7) {
                                list2.remove(specialEffectsController$Operation9);
                            }
                            View view16 = fragment1.mView;
                            this.getContainer().startViewTransition(view16);
                            animator0.addListener(new DefaultSpecialEffectsController.startAnimations.1(this, view16, z7, specialEffectsController$Operation9, i0));
                            animator0.setTarget(view16);
                            animator0.start();
                            if(FragmentManager.isLoggingEnabled(2)) {
                                specialEffectsController$Operation10 = specialEffectsController$Operation9;
                                Log.v("FragmentManager", "Animator from operation " + specialEffectsController$Operation10 + " has started.");
                            }
                            else {
                                specialEffectsController$Operation10 = specialEffectsController$Operation9;
                            }
                            f f0 = new f(animator0, specialEffectsController$Operation10);
                            i0.b.setOnCancelListener(f0);
                            z6 = true;
                        }
                    }
                }
            }
        }
        for(Object object26: arrayList18) {
            i i1 = (i)object26;
            Operation specialEffectsController$Operation11 = i1.a;
            Fragment fragment2 = specialEffectsController$Operation11.getFragment();
            if(z5) {
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Transitions.");
                }
                i1.a();
            }
            else if(z6) {
                if(FragmentManager.isLoggingEnabled(2)) {
                    Log.v("FragmentManager", "Ignoring Animation set on " + fragment2 + " as Animations cannot run alongside Animators.");
                }
                i1.a();
            }
            else {
                View view17 = fragment2.mView;
                Intrinsics.checkNotNullExpressionValue(context0, "context");
                g0 g01 = i1.c(context0);
                if(g01 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                Animation animation0 = g01.a;
                if(animation0 == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                if(specialEffectsController$Operation11.getFinalState() == State.REMOVED) {
                    this.getContainer().startViewTransition(view17);
                    h0 h00 = new h0(animation0, this.getContainer(), view17);
                    h00.setAnimationListener(new DefaultSpecialEffectsController.startAnimations.3(view17, i1, this, specialEffectsController$Operation11));
                    view17.startAnimation(h00);
                    if(FragmentManager.isLoggingEnabled(2)) {
                        Log.v("FragmentManager", "Animation from operation " + specialEffectsController$Operation11 + " has started.");
                    }
                }
                else {
                    view17.startAnimation(animation0);
                    i1.a();
                }
                g g0 = new g(view17, i1, this, specialEffectsController$Operation11);
                i1.b.setOnCancelListener(g0);
            }
        }
        for(Object object27: list2) {
            View view18 = ((Operation)object27).getFragment().mView;
            Intrinsics.checkNotNullExpressionValue(view18, "view");
            ((Operation)object27).getFinalState().applyState(view18);
        }
        list2.clear();
        if(FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Completed executing operations from " + specialEffectsController$Operation2 + " to " + specialEffectsController$Operation3);
        }
    }
}

