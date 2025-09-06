package androidx.compose.ui.tooling.animation;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.DecayAnimation;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.TargetBasedAnimation;
import androidx.compose.animation.core.Transition;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.ModifierInfo;
import androidx.compose.ui.tooling.PreviewUtils_androidKt;
import androidx.compose.ui.tooling.data.CallGroup;
import androidx.compose.ui.tooling.data.Group;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e0;
import kotlin.collections.f0;
import kotlin.collections.g0;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClasses;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001:\f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001A\u001B\u001CB#\u0012\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001B\u0010\r\u001A\u00020\f2\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\r\u0010\u000EJ\u001B\u0010\u000F\u001A\u00020\u00052\f\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u001D"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch;", "", "Lkotlin/Function0;", "Landroidx/compose/ui/tooling/animation/PreviewAnimationClock;", "clock", "", "onSeek", "<init>", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "slotTrees", "", "searchAny", "(Ljava/util/Collection;)Z", "attachAllAnimations", "(Ljava/util/Collection;)V", "AnimateContentSizeSearch", "AnimateXAsStateSearch", "AnimateXAsStateSearchInfo", "AnimatedContentSearch", "AnimatedVisibilitySearch", "DecaySearch", "InfiniteTransitionSearch", "InfiniteTransitionSearchInfo", "RememberSearch", "Search", "TargetBasedSearch", "TransitionSearch", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1747#2,2:464\n1747#2,3:466\n1749#2:469\n1855#2:470\n1855#2,2:471\n1856#2:473\n1855#2,2:474\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch\n*L\n136#1:464,2\n138#1:466,3\n136#1:469\n151#1:470\n153#1:471,2\n151#1:473\n163#1:474,2\n*E\n"})
public final class AnimationSearch {
    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006J\u0016\u0010\u0007\u001A\u00020\u00052\f\u0010\b\u001A\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0010\u0010\u000B\u001A\u00020\f2\u0006\u0010\r\u001A\u00020\nH\u0016¨\u0006\u000E"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "addAnimations", "groups", "", "Landroidx/compose/ui/tooling/data/Group;", "hasAnimation", "", "group", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1747#2,3:464\n766#2:467\n857#2,2:468\n1855#2:470\n1855#2,2:471\n1856#2:473\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateContentSizeSearch\n*L\n366#1:464,3\n376#1:467\n376#1:468,2\n378#1:470\n379#1:471,2\n378#1:473\n*E\n"})
    public static final class AnimateContentSizeSearch extends Search {
        public static final int $stable;

        public AnimateContentSizeSearch(@NotNull Function1 function10) {
            super(function10);
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                if(!((Group)object0).getModifierInfo().isEmpty()) {
                    arrayList0.add(object0);
                }
            }
            for(Object object1: arrayList0) {
                for(Object object2: ((Group)object1).getModifierInfo()) {
                    ((ModifierInfo)object2).getModifier().any(new a(this));
                }
            }
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            if(!group0.getModifierInfo().isEmpty()) {
                Iterable iterable0 = group0.getModifierInfo();
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object0: iterable0) {
                        if(((ModifierInfo)object0).getModifier().any(b.w)) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                }
            }
            return false;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B#\u0012\u001A\u0010\u0005\u001A\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\u00020\u00042\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,463:1\n1#2:464\n1#2:475\n1#2:485\n1#2:574\n1603#3,9:465\n1855#3:474\n1856#3:476\n1612#3:477\n1855#3,2:478\n1612#3:480\n288#3,2:482\n1603#3,9:487\n1855#3:496\n1856#3:499\n1612#3:500\n1603#3,9:502\n1855#3,2:511\n1612#3:513\n1603#3,9:515\n1855#3:524\n1856#3:527\n1612#3:528\n766#3:529\n857#3,2:530\n1360#3:532\n1446#3,5:533\n1360#3:538\n1446#3,5:539\n800#3,11:544\n1549#3:555\n1620#3,3:556\n800#3,11:559\n288#3,2:571\n1603#3,9:576\n1855#3:585\n1856#3:588\n1612#3:589\n1603#3,9:591\n1855#3,2:600\n1612#3:602\n1603#3,9:604\n1855#3:613\n1856#3:616\n1612#3:617\n64#4:481\n65#4:484\n49#4:486\n50#4,2:497\n54#4:501\n55#4:514\n56#4,2:525\n64#4:570\n65#4:573\n49#4:575\n50#4,2:586\n54#4:590\n55#4:603\n56#4,2:614\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearch\n*L\n318#1:475\n343#1:485\n356#1:574\n318#1:465,9\n318#1:474\n318#1:476\n318#1:477\n318#1:478,2\n318#1:480\n343#1:482,2\n343#1:487,9\n343#1:496\n343#1:499\n343#1:500\n343#1:502,9\n343#1:511,2\n343#1:513\n343#1:515,9\n343#1:524\n343#1:527\n343#1:528\n348#1:529\n348#1:530,2\n349#1:532\n349#1:533,5\n350#1:538\n350#1:539,5\n351#1:544,11\n351#1:555\n351#1:556,3\n352#1:559,11\n356#1:571,2\n356#1:576,9\n356#1:585\n356#1:588\n356#1:589\n356#1:591,9\n356#1:600,2\n356#1:602\n356#1:604,9\n356#1:613\n356#1:616\n356#1:617\n343#1:481\n343#1:484\n343#1:486\n343#1:497,2\n343#1:501\n343#1:514\n343#1:525,2\n356#1:570\n356#1:573\n356#1:575\n356#1:586,2\n356#1:590\n356#1:603\n356#1:614,2\n*E\n"})
    public static final class AnimateXAsStateSearch extends Search {
        public static final int $stable;

        public AnimateXAsStateSearch(@NotNull Function1 function10) {
            super(function10);
        }

        public static Animatable a(CallGroup callGroup0) {
            List list0;
            Object object0 = null;
            for(Object object1: callGroup0.getData()) {
                if(object1 instanceof Animatable) {
                    object0 = object1;
                    break;
                }
            }
            if(!(object0 instanceof Animatable)) {
                object0 = null;
            }
            if(((Animatable)object0) == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                list0 = k.listOf(((Animatable)object0));
                if(list0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            Iterable iterable0 = callGroup0.getChildren();
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: iterable0) {
                for(Object object3: ((Group)object2).getData()) {
                    if(!(object3 instanceof Animatable)) {
                        continue;
                    }
                    goto label_25;
                }
                object3 = null;
            label_25:
                if(!(object3 instanceof Animatable)) {
                    object3 = null;
                }
                if(((Animatable)object3) != null) {
                    arrayList0.add(((Animatable)object3));
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: iterable0) {
                Group group0 = PreviewUtils_androidKt.firstOrNull(((Group)object4), AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1.INSTANCE);
                if(group0 != null) {
                    arrayList1.add(group0);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object5: arrayList1) {
                for(Object object6: ((Group)object5).getData()) {
                    if(!(object6 instanceof Animatable)) {
                        continue;
                    }
                    goto label_48;
                }
                object6 = null;
            label_48:
                if(!(object6 instanceof Animatable)) {
                    object6 = null;
                }
                if(((Animatable)object6) != null) {
                    arrayList2.add(((Animatable)object6));
                }
            }
            return (Animatable)CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.plus(list0, CollectionsKt___CollectionsKt.plus(arrayList0, arrayList2)));
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            Set set0 = this.getAnimations();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                CallGroup callGroup0 = AnimateXAsStateSearch.d(((Group)object0));
                if(callGroup0 != null) {
                    arrayList0.add(callGroup0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                Animatable animatable0 = AnimateXAsStateSearch.a(((CallGroup)object1));
                AnimationSpec animationSpec0 = AnimateXAsStateSearch.b(((CallGroup)object1));
                MutableState mutableState0 = AnimateXAsStateSearch.c(((CallGroup)object1));
                Object object2 = null;
                if(animatable0 != null && animationSpec0 != null && mutableState0 != null) {
                    if(mutableState0.getValue() == null) {
                        mutableState0.setValue(new ToolingState(animatable0.getValue()));
                    }
                    Object object3 = mutableState0.getValue();
                    if(object3 instanceof ToolingState) {
                        object2 = (ToolingState)object3;
                    }
                    if(object2 == null) {
                        object2 = new ToolingState(animatable0.getValue());
                    }
                    object2 = new AnimateXAsStateSearchInfo(animatable0, animationSpec0, ((ToolingState)object2));
                }
                if(object2 != null) {
                    arrayList1.add(object2);
                }
            }
            set0.addAll(arrayList1);
        }

        public static AnimationSpec b(CallGroup callGroup0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: callGroup0.getChildren()) {
                if(Intrinsics.areEqual(((Group)object0).getName(), "rememberUpdatedState")) {
                    arrayList0.add(object0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                o.addAll(arrayList1, ((Group)object1).getChildren());
            }
            Iterable iterable0 = CollectionsKt___CollectionsKt.plus(arrayList0, arrayList1);
            ArrayList arrayList2 = new ArrayList();
            for(Object object2: iterable0) {
                o.addAll(arrayList2, ((Group)object2).getData());
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object3: arrayList2) {
                if(object3 instanceof State) {
                    arrayList3.add(object3);
                }
            }
            ArrayList arrayList4 = new ArrayList(l.collectionSizeOrDefault(arrayList3, 10));
            for(Object object4: arrayList3) {
                arrayList4.add(((State)object4).getValue());
            }
            ArrayList arrayList5 = new ArrayList();
            for(Object object5: arrayList4) {
                if(object5 instanceof AnimationSpec) {
                    arrayList5.add(object5);
                }
            }
            return (AnimationSpec)CollectionsKt___CollectionsKt.firstOrNull(arrayList5);
        }

        public static MutableState c(CallGroup callGroup0) {
            List list0;
            Object object0 = null;
            for(Object object1: callGroup0.getData()) {
                if(object1 instanceof MutableState) {
                    object0 = object1;
                    break;
                }
            }
            if(!(object0 instanceof MutableState)) {
                object0 = null;
            }
            if(((MutableState)object0) == null) {
                list0 = CollectionsKt__CollectionsKt.emptyList();
            }
            else {
                list0 = k.listOf(((MutableState)object0));
                if(list0 == null) {
                    list0 = CollectionsKt__CollectionsKt.emptyList();
                }
            }
            Iterable iterable0 = callGroup0.getChildren();
            ArrayList arrayList0 = new ArrayList();
            for(Object object2: iterable0) {
                for(Object object3: ((Group)object2).getData()) {
                    if(!(object3 instanceof MutableState)) {
                        continue;
                    }
                    goto label_25;
                }
                object3 = null;
            label_25:
                if(!(object3 instanceof MutableState)) {
                    object3 = null;
                }
                if(((MutableState)object3) != null) {
                    arrayList0.add(((MutableState)object3));
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object4: iterable0) {
                Group group0 = PreviewUtils_androidKt.firstOrNull(((Group)object4), AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1.INSTANCE);
                if(group0 != null) {
                    arrayList1.add(group0);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object5: arrayList1) {
                for(Object object6: ((Group)object5).getData()) {
                    if(!(object6 instanceof MutableState)) {
                        continue;
                    }
                    goto label_48;
                }
                object6 = null;
            label_48:
                if(!(object6 instanceof MutableState)) {
                    object6 = null;
                }
                if(((MutableState)object6) != null) {
                    arrayList2.add(((MutableState)object6));
                }
            }
            return (MutableState)CollectionsKt___CollectionsKt.firstOrNull(CollectionsKt___CollectionsKt.plus(list0, CollectionsKt___CollectionsKt.plus(arrayList0, arrayList2)));
        }

        public static CallGroup d(Group group0) {
            if(group0.getLocation() == null || !Intrinsics.areEqual(group0.getName(), "animateValueAsState")) {
                group0 = null;
            }
            return group0 == null || !(group0 instanceof CallGroup) ? null : ((CallGroup)group0);
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            CallGroup callGroup0 = AnimateXAsStateSearch.d(group0);
            return callGroup0 != null && AnimateXAsStateSearch.a(callGroup0) != null && AnimateXAsStateSearch.b(callGroup0) != null && AnimateXAsStateSearch.c(callGroup0) != null;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000B\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\f\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B7\u0012\u0012\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\f\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\f\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000B\u0010\fJ\u001C\u0010\r\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000EJ\u0016\u0010\u000F\u001A\b\u0012\u0004\u0012\u00028\u00000\u0007HÆ\u0003¢\u0006\u0004\b\u000F\u0010\u0010J\u0016\u0010\u0011\u001A\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012JR\u0010\u0013\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\b\u0002\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00052\u000E\b\u0002\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00072\u000E\b\u0002\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\tHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001A\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001A\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001AJ\u001A\u0010\u001D\u001A\u00020\u001C2\b\u0010\u001B\u001A\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u001D\u0010\u001ER#\u0010\u0006\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001F\u0010 \u001A\u0004\b!\u0010\u000ER\u001D\u0010\b\u001A\b\u0012\u0004\u0012\u00028\u00000\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001A\u0004\b$\u0010\u0010R\u001D\u0010\n\u001A\b\u0012\u0004\u0012\u00028\u00000\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001A\u0004\b\'\u0010\u0012¨\u0006("}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "T", "Landroidx/compose/animation/core/AnimationVector;", "V", "", "Landroidx/compose/animation/core/Animatable;", "animatable", "Landroidx/compose/animation/core/AnimationSpec;", "animationSpec", "Landroidx/compose/ui/tooling/animation/ToolingState;", "toolingState", "<init>", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "component1", "()Landroidx/compose/animation/core/Animatable;", "component2", "()Landroidx/compose/animation/core/AnimationSpec;", "component3", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "copy", "(Landroidx/compose/animation/core/Animatable;Landroidx/compose/animation/core/AnimationSpec;Landroidx/compose/ui/tooling/animation/ToolingState;)Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimateXAsStateSearchInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/animation/core/Animatable;", "getAnimatable", "b", "Landroidx/compose/animation/core/AnimationSpec;", "getAnimationSpec", "c", "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class AnimateXAsStateSearchInfo {
        public static final int $stable = 8;
        public final Animatable a;
        public final AnimationSpec b;
        public final ToolingState c;

        public AnimateXAsStateSearchInfo(@NotNull Animatable animatable0, @NotNull AnimationSpec animationSpec0, @NotNull ToolingState toolingState0) {
            this.a = animatable0;
            this.b = animationSpec0;
            this.c = toolingState0;
        }

        @NotNull
        public final Animatable component1() {
            return this.a;
        }

        @NotNull
        public final AnimationSpec component2() {
            return this.b;
        }

        @NotNull
        public final ToolingState component3() {
            return this.c;
        }

        @NotNull
        public final AnimateXAsStateSearchInfo copy(@NotNull Animatable animatable0, @NotNull AnimationSpec animationSpec0, @NotNull ToolingState toolingState0) {
            return new AnimateXAsStateSearchInfo(animatable0, animationSpec0, toolingState0);
        }

        public static AnimateXAsStateSearchInfo copy$default(AnimateXAsStateSearchInfo animationSearch$AnimateXAsStateSearchInfo0, Animatable animatable0, AnimationSpec animationSpec0, ToolingState toolingState0, int v, Object object0) {
            if((v & 1) != 0) {
                animatable0 = animationSearch$AnimateXAsStateSearchInfo0.a;
            }
            if((v & 2) != 0) {
                animationSpec0 = animationSearch$AnimateXAsStateSearchInfo0.b;
            }
            if((v & 4) != 0) {
                toolingState0 = animationSearch$AnimateXAsStateSearchInfo0.c;
            }
            return animationSearch$AnimateXAsStateSearchInfo0.copy(animatable0, animationSpec0, toolingState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof AnimateXAsStateSearchInfo)) {
                return false;
            }
            if(!Intrinsics.areEqual(this.a, ((AnimateXAsStateSearchInfo)object0).a)) {
                return false;
            }
            return Intrinsics.areEqual(this.b, ((AnimateXAsStateSearchInfo)object0).b) ? Intrinsics.areEqual(this.c, ((AnimateXAsStateSearchInfo)object0).c) : false;
        }

        @NotNull
        public final Animatable getAnimatable() {
            return this.a;
        }

        @NotNull
        public final AnimationSpec getAnimationSpec() {
            return this.b;
        }

        @NotNull
        public final ToolingState getToolingState() {
            return this.c;
        }

        @Override
        public int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() + this.a.hashCode() * 0x1F) * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "AnimateXAsStateSearchInfo(animatable=" + this.a + ", animationSpec=" + this.b + ", toolingState=" + this.c + ')';
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001F\u0012\u0016\u0010\u0005\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\u00020\u00042\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,463:1\n1603#2,9:464\n1855#2:473\n1856#2:475\n1612#2:476\n1855#2:478\n288#2:480\n289#2:482\n1856#2:483\n1612#2:484\n1855#2,2:486\n1612#2:488\n1855#2:490\n288#2:492\n289#2:494\n1856#2:495\n1612#2:496\n288#2,2:498\n1#3:474\n1#3:497\n49#4:477\n50#4:479\n51#4:481\n54#4:485\n55#4:489\n56#4:491\n57#4:493\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedContentSearch\n*L\n448#1:464,9\n448#1:473\n448#1:475\n448#1:476\n448#1:478\n448#1:480\n448#1:482\n448#1:483\n448#1:484\n448#1:486,2\n448#1:488\n448#1:490\n448#1:492\n448#1:494\n448#1:495\n448#1:496\n456#1:498,2\n448#1:474\n448#1:477\n448#1:479\n448#1:481\n448#1:485\n448#1:489\n448#1:491\n448#1:493\n*E\n"})
    public static final class AnimatedContentSearch extends Search {
        public static final int $stable;

        public AnimatedContentSearch(@NotNull Function1 function10) {
            super(function10);
        }

        public static Group a(Group group0) {
            if(group0.getLocation() == null || !Intrinsics.areEqual(group0.getName(), "AnimatedContent")) {
                group0 = null;
            }
            if(group0 != null) {
                for(Object object0: group0.getChildren()) {
                    if(Intrinsics.areEqual(((Group)object0).getName(), "updateTransition")) {
                        return object0;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return null;
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            Set set0 = this.getAnimations();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                Group group0 = AnimatedContentSearch.a(((Group)object0));
                if(group0 != null) {
                    arrayList0.add(group0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            Iterator iterator1 = arrayList0.iterator();
            while(true) {
                Object object1 = null;
                if(!iterator1.hasNext()) {
                    break;
                }
                Object object2 = iterator1.next();
                for(Object object3: ((Group)object2).getData()) {
                    if(!(object3 instanceof Transition)) {
                        continue;
                    }
                    goto label_20;
                }
                object3 = null;
            label_20:
                if(object3 instanceof Transition) {
                    object1 = object3;
                }
                if(((Transition)object1) != null) {
                    arrayList1.add(((Transition)object1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object4: arrayList0) {
                Group group1 = PreviewUtils_androidKt.firstOrNull(((Group)object4), AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1.INSTANCE);
                if(group1 != null) {
                    arrayList2.add(group1);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object5: arrayList2) {
                for(Object object6: ((Group)object5).getData()) {
                    if(!(object6 instanceof Transition)) {
                        continue;
                    }
                    goto label_43;
                }
                object6 = null;
            label_43:
                if(!(object6 instanceof Transition)) {
                    object6 = null;
                }
                if(((Transition)object6) != null) {
                    arrayList3.add(((Transition)object6));
                }
            }
            set0.addAll(CollectionsKt___CollectionsKt.plus(arrayList1, arrayList3));
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            return AnimatedContentSearch.a(group0) != null;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001F\u0012\u0016\u0010\u0005\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\u00020\u00042\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,463:1\n1603#2,9:464\n1855#2:473\n1856#2:475\n1612#2:476\n1855#2:478\n288#2:480\n289#2:482\n1856#2:483\n1612#2:484\n1855#2,2:486\n1612#2:488\n1855#2:490\n288#2:492\n289#2:494\n1856#2:495\n1612#2:496\n288#2,2:498\n1#3:474\n1#3:497\n49#4:477\n50#4:479\n51#4:481\n54#4:485\n55#4:489\n56#4:491\n57#4:493\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$AnimatedVisibilitySearch\n*L\n422#1:464,9\n422#1:473\n422#1:475\n422#1:476\n422#1:478\n422#1:480\n422#1:482\n422#1:483\n422#1:484\n422#1:486,2\n422#1:488\n422#1:490\n422#1:492\n422#1:494\n422#1:495\n422#1:496\n432#1:498,2\n422#1:474\n422#1:477\n422#1:479\n422#1:481\n422#1:485\n422#1:489\n422#1:491\n422#1:493\n*E\n"})
    public static final class AnimatedVisibilitySearch extends Search {
        public static final int $stable;

        public AnimatedVisibilitySearch(@NotNull Function1 function10) {
            super(function10);
        }

        public static Group a(Group group0) {
            if(group0.getLocation() == null || !Intrinsics.areEqual(group0.getName(), "AnimatedVisibility")) {
                group0 = null;
            }
            if(group0 != null) {
                for(Object object0: group0.getChildren()) {
                    if(Intrinsics.areEqual(((Group)object0).getName(), "updateTransition")) {
                        return object0;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return null;
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            Set set0 = this.getAnimations();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                Group group0 = AnimatedVisibilitySearch.a(((Group)object0));
                if(group0 != null) {
                    arrayList0.add(group0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            Iterator iterator1 = arrayList0.iterator();
            while(true) {
                Object object1 = null;
                if(!iterator1.hasNext()) {
                    break;
                }
                Object object2 = iterator1.next();
                for(Object object3: ((Group)object2).getData()) {
                    if(!(object3 instanceof Transition)) {
                        continue;
                    }
                    goto label_20;
                }
                object3 = null;
            label_20:
                if(object3 instanceof Transition) {
                    object1 = object3;
                }
                if(((Transition)object1) != null) {
                    arrayList1.add(((Transition)object1));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object4: arrayList0) {
                Group group1 = PreviewUtils_androidKt.firstOrNull(((Group)object4), AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1.INSTANCE);
                if(group1 != null) {
                    arrayList2.add(group1);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object5: arrayList2) {
                for(Object object6: ((Group)object5).getData()) {
                    if(!(object6 instanceof Transition)) {
                        continue;
                    }
                    goto label_43;
                }
                object6 = null;
            label_43:
                if(!(object6 instanceof Transition)) {
                    object6 = null;
                }
                if(((Transition)object6) != null) {
                    arrayList3.add(((Transition)object6));
                }
            }
            set0.addAll(CollectionsKt___CollectionsKt.plus(arrayList1, arrayList3));
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            return AnimatedVisibilitySearch.a(group0) != null;
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001A\u0010\u0003\u001A\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$DecaySearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/DecayAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class DecaySearch extends RememberSearch {
        public static final int $stable;

        public DecaySearch(@NotNull Function1 function10) {
            super(Reflection.getOrCreateKotlinClass(DecayAnimation.class), function10);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\u00020\u00042\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n+ 2 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n69#2,4:464\n73#2,2:474\n75#2:477\n69#2,4:494\n73#2,2:504\n75#2:507\n71#2,2:511\n73#2,2:519\n75#2:522\n1360#3:468\n1446#3,5:469\n288#3:476\n289#3:478\n1603#3,9:480\n1855#3:489\n1856#3:491\n1612#3:492\n1855#3:493\n1360#3:498\n1446#3,5:499\n288#3:506\n289#3:508\n1856#3:509\n1612#3:510\n1360#3:513\n1446#3,5:514\n288#3:521\n289#3:523\n1#4:479\n1#4:490\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearch\n*L\n231#1:464,4\n231#1:474,2\n231#1:477\n250#1:494,4\n250#1:504,2\n250#1:507\n271#1:511,2\n271#1:519,2\n271#1:522\n231#1:468\n231#1:469,5\n231#1:476\n231#1:478\n249#1:480,9\n249#1:489\n249#1:491\n249#1:492\n249#1:493\n250#1:498\n250#1:499,5\n250#1:506\n250#1:508\n249#1:509\n249#1:510\n271#1:513\n271#1:514,5\n271#1:521\n271#1:523\n249#1:490\n*E\n"})
    public static final class InfiniteTransitionSearch extends Search {
        public static final int $stable;

        public InfiniteTransitionSearch(@NotNull Function1 function10) {
            super(function10);
        }

        public static MutableState a(Group group0) {
            Object object3;
            Collection collection0 = group0.getData();
            Collection collection1 = group0.getChildren();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection1) {
                o.addAll(arrayList0, ((Group)object0).getChildren());
            }
            Iterable iterable0 = CollectionsKt___CollectionsKt.plus(collection1, arrayList0);
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: iterable0) {
                o.addAll(arrayList1, ((Group)object1).getData());
            }
            Object object2 = null;
            Iterator iterator2 = CollectionsKt___CollectionsKt.plus(collection0, arrayList1).iterator();
            while(true) {
                object3 = null;
                if(!iterator2.hasNext()) {
                    break;
                }
                Object object4 = iterator2.next();
                if(object4 instanceof MutableState) {
                    object2 = object4;
                    break;
                }
            }
            if(object2 instanceof MutableState) {
                object3 = object2;
            }
            return (MutableState)object3;
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            Object object4;
            Object object3;
            Set set0 = this.getAnimations();
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                CallGroup callGroup0 = InfiniteTransitionSearch.b(((Group)object0));
                if(callGroup0 != null) {
                    arrayList0.add(callGroup0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                Collection collection1 = ((CallGroup)object1).getData();
                ArrayList arrayList2 = new ArrayList();
                for(Object object2: ((CallGroup)object1).getChildren()) {
                    o.addAll(arrayList2, ((Group)object2).getData());
                }
                Iterator iterator3 = CollectionsKt___CollectionsKt.plus(collection1, arrayList2).iterator();
                do {
                    object3 = null;
                    if(!iterator3.hasNext()) {
                        goto label_26;
                    }
                    object4 = iterator3.next();
                }
                while(!(object4 instanceof InfiniteTransition));
                goto label_27;
            label_26:
                object4 = null;
            label_27:
                if(!(object4 instanceof InfiniteTransition)) {
                    object4 = null;
                }
                MutableState mutableState0 = InfiniteTransitionSearch.a(((CallGroup)object1));
                if(((InfiniteTransition)object4) != null && mutableState0 != null) {
                    if(mutableState0.getValue() == null) {
                        mutableState0.setValue(new ToolingState(0L));
                    }
                    Object object5 = mutableState0.getValue();
                    if(object5 instanceof ToolingState) {
                        object3 = (ToolingState)object5;
                    }
                    if(object3 == null) {
                        object3 = new ToolingState(0L);
                    }
                    object3 = new InfiniteTransitionSearchInfo(((InfiniteTransition)object4), ((ToolingState)object3));
                }
                if(object3 != null) {
                    arrayList1.add(object3);
                }
            }
            set0.addAll(arrayList1);
        }

        public static CallGroup b(Group group0) {
            if(group0.getLocation() == null || !Intrinsics.areEqual(group0.getName(), "rememberInfiniteTransition")) {
                group0 = null;
            }
            return group0 == null || !(group0 instanceof CallGroup) ? null : ((CallGroup)group0);
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            Object object2;
            if(InfiniteTransitionSearch.b(group0) != null) {
                Collection collection0 = group0.getData();
                ArrayList arrayList0 = new ArrayList();
                for(Object object0: group0.getChildren()) {
                    o.addAll(arrayList0, ((Group)object0).getData());
                }
                Object object1 = null;
                Iterator iterator1 = CollectionsKt___CollectionsKt.plus(collection0, arrayList0).iterator();
                while(true) {
                    object2 = null;
                    if(!iterator1.hasNext()) {
                        break;
                    }
                    Object object3 = iterator1.next();
                    if(object3 instanceof InfiniteTransition) {
                        object1 = object3;
                        break;
                    }
                }
                if(object1 instanceof InfiniteTransition) {
                    object2 = object1;
                }
                return ((InfiniteTransition)object2) != null && InfiniteTransitionSearch.a(group0) != null;
            }
            return false;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000B\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001D\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\f\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001A\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000B\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u000B\u0010\fJ*\u0010\r\u001A\u00020\u00002\b\b\u0002\u0010\u0003\u001A\u00020\u00022\u000E\b\u0002\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000EJ\u0010\u0010\u0010\u001A\u00020\u000FHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001A\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001A\u0010\u0017\u001A\u00020\u00162\b\u0010\u0015\u001A\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001A\u001A\u0004\b\u001B\u0010\nR\u001D\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\f¨\u0006\u001F"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "Landroidx/compose/animation/core/InfiniteTransition;", "infiniteTransition", "Landroidx/compose/ui/tooling/animation/ToolingState;", "", "toolingState", "<init>", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)V", "component1", "()Landroidx/compose/animation/core/InfiniteTransition;", "component2", "()Landroidx/compose/ui/tooling/animation/ToolingState;", "copy", "(Landroidx/compose/animation/core/InfiniteTransition;Landroidx/compose/ui/tooling/animation/ToolingState;)Landroidx/compose/ui/tooling/animation/AnimationSearch$InfiniteTransitionSearchInfo;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroidx/compose/animation/core/InfiniteTransition;", "getInfiniteTransition", "b", "Landroidx/compose/ui/tooling/animation/ToolingState;", "getToolingState", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class InfiniteTransitionSearchInfo {
        public static final int $stable;
        public final InfiniteTransition a;
        public final ToolingState b;

        static {
            InfiniteTransitionSearchInfo.$stable = InfiniteTransition.$stable;
        }

        public InfiniteTransitionSearchInfo(@NotNull InfiniteTransition infiniteTransition0, @NotNull ToolingState toolingState0) {
            this.a = infiniteTransition0;
            this.b = toolingState0;
        }

        @NotNull
        public final InfiniteTransition component1() {
            return this.a;
        }

        @NotNull
        public final ToolingState component2() {
            return this.b;
        }

        @NotNull
        public final InfiniteTransitionSearchInfo copy(@NotNull InfiniteTransition infiniteTransition0, @NotNull ToolingState toolingState0) {
            return new InfiniteTransitionSearchInfo(infiniteTransition0, toolingState0);
        }

        public static InfiniteTransitionSearchInfo copy$default(InfiniteTransitionSearchInfo animationSearch$InfiniteTransitionSearchInfo0, InfiniteTransition infiniteTransition0, ToolingState toolingState0, int v, Object object0) {
            if((v & 1) != 0) {
                infiniteTransition0 = animationSearch$InfiniteTransitionSearchInfo0.a;
            }
            if((v & 2) != 0) {
                toolingState0 = animationSearch$InfiniteTransitionSearchInfo0.b;
            }
            return animationSearch$InfiniteTransitionSearchInfo0.copy(infiniteTransition0, toolingState0);
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            if(!(object0 instanceof InfiniteTransitionSearchInfo)) {
                return false;
            }
            return Intrinsics.areEqual(this.a, ((InfiniteTransitionSearchInfo)object0).a) ? Intrinsics.areEqual(this.b, ((InfiniteTransitionSearchInfo)object0).b) : false;
        }

        @NotNull
        public final InfiniteTransition getInfiniteTransition() {
            return this.a;
        }

        @NotNull
        public final ToolingState getToolingState() {
            return this.b;
        }

        @Override
        public int hashCode() {
            return this.b.hashCode() + this.a.hashCode() * 0x1F;
        }

        @Override
        @NotNull
        public String toString() {
            return "InfiniteTransitionSearchInfo(infiniteTransition=" + this.a + ", toolingState=" + this.b + ')';
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0003\b\u0017\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B)\u0012\f\u0010\u0005\u001A\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u001D\u0010\u000E\u001A\u00020\u00072\f\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u000BH\u0016¢\u0006\u0004\b\u000E\u0010\u000FJ\u0017\u0010\u0012\u001A\u00020\u00112\u0006\u0010\u0010\u001A\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "", "T", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Lkotlin/reflect/KClass;", "clazz", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groups", "addAnimations", "(Ljava/util/Collection;)V", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,463:1\n766#2:464\n857#2,2:465\n1603#2,9:467\n1855#2:476\n1856#2:478\n1612#2:479\n288#2,2:480\n1#3:477\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch\n*L\n197#1:464\n197#1:465,2\n206#1:467,9\n206#1:476\n206#1:478\n206#1:479\n210#1:480,2\n206#1:477\n*E\n"})
    public static class RememberSearch extends Search {
        public static final int $stable = 8;
        public final KClass c;

        public RememberSearch(@NotNull KClass kClass0, @NotNull Function1 function10) {
            super(function10);
            this.c = kClass0;
        }

        public static Object a(Group group0, KClass kClass0) {
            Iterator iterator0 = group0.getData().iterator();
            while(true) {
                KClass kClass1 = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                if(object0 != null) {
                    kClass1 = JvmClassMappingKt.getKotlinClass(object0.getClass());
                }
                if(Intrinsics.areEqual(kClass1, kClass0)) {
                    return KClasses.safeCast(kClass0, object0);
                }
            }
            return KClasses.safeCast(kClass0, null);
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            ArrayList arrayList0 = new ArrayList();
            for(Object object0: collection0) {
                if(((Group)object0).getLocation() != null) {
                    arrayList0.add(object0);
                }
            }
            Set set0 = this.getAnimations();
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                Object object2 = RememberSearch.a(((Group)object1), this.c);
                if(object2 != null) {
                    arrayList1.add(object2);
                }
            }
            set0.addAll(CollectionsKt___CollectionsKt.toSet(arrayList1));
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            return group0.getLocation() != null && RememberSearch.a(group0, this.c) != null;
        }
    }

    @StabilityInferred(parameters = 0)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\t\n\u0002\u0010#\n\u0002\b\u0006\b\'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B\u001B\u0012\u0012\u0010\u0005\u001A\u000E\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001B\u0010\f\u001A\u00020\u000B2\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000F\u001A\u00020\u000B2\u0006\u0010\u000E\u001A\u00020\tH&¢\u0006\u0004\b\u000F\u0010\u0010J\u001D\u0010\u0011\u001A\u00020\u00042\f\u0010\n\u001A\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001A\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014R\u001D\u0010\u001A\u001A\b\u0012\u0004\u0012\u00028\u00000\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001A\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "", "T", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "", "Landroidx/compose/ui/tooling/data/Group;", "groups", "", "hasAnimations", "(Ljava/util/Collection;)Z", "group", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "addAnimations", "(Ljava/util/Collection;)V", "track", "()V", "", "b", "Ljava/util/Set;", "getAnimations", "()Ljava/util/Set;", "animations", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,463:1\n1747#2,3:464\n1855#2,2:467\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$Search\n*L\n170#1:464,3\n187#1:467,2\n*E\n"})
    public static abstract class Search {
        public static final int $stable = 8;
        public final Function1 a;
        public final LinkedHashSet b;

        public Search(@NotNull Function1 function10) {
            this.a = function10;
            this.b = new LinkedHashSet();
        }

        public void addAnimations(@NotNull Collection collection0) {
        }

        @NotNull
        public final Set getAnimations() {
            return this.b;
        }

        public abstract boolean hasAnimation(@NotNull Group arg1);

        public final boolean hasAnimations(@NotNull Collection collection0) {
            if(!(collection0 instanceof Collection) || !collection0.isEmpty()) {
                for(Object object0: collection0) {
                    if(this.hasAnimation(((Group)object0))) {
                        return true;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            return false;
        }

        public final void track() {
            for(Object object0: CollectionsKt___CollectionsKt.reversed(this.b)) {
                this.a.invoke(object0);
            }
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000\u001A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00020\u0001B!\u0012\u001A\u0010\u0003\u001A\u0016\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TargetBasedSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$RememberSearch;", "Landroidx/compose/animation/core/TargetBasedAnimation;", "trackAnimation", "Lkotlin/Function1;", "", "(Lkotlin/jvm/functions/Function1;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class TargetBasedSearch extends RememberSearch {
        public static final int $stable;

        public TargetBasedSearch(@NotNull Function1 function10) {
            super(Reflection.getOrCreateKotlinClass(TargetBasedAnimation.class), function10);
        }
    }

    @StabilityInferred(parameters = 1)
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\u001E\n\u0002\b\u0004\b\u0007\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u001F\u0012\u0016\u0010\u0005\u001A\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000B\u001A\u00020\n2\u0006\u0010\t\u001A\u00020\bH\u0016¢\u0006\u0004\b\u000B\u0010\fJ\u001D\u0010\u000F\u001A\u00020\u00042\f\u0010\u000E\u001A\b\u0012\u0004\u0012\u00020\b0\rH\u0016¢\u0006\u0004\b\u000F\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch;", "Landroidx/compose/ui/tooling/animation/AnimationSearch$Search;", "Landroidx/compose/animation/core/Transition;", "Lkotlin/Function1;", "", "trackAnimation", "<init>", "(Lkotlin/jvm/functions/Function1;)V", "Landroidx/compose/ui/tooling/data/Group;", "group", "", "hasAnimation", "(Landroidx/compose/ui/tooling/data/Group;)Z", "", "groups", "addAnimations", "(Ljava/util/Collection;)V", "ui-tooling_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nAnimationSearch.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch_androidKt\n*L\n1#1,463:1\n1603#2,9:464\n1855#2:473\n1856#2:475\n1612#2:476\n1855#2:478\n288#2:480\n289#2:482\n1856#2:483\n1612#2:484\n1855#2,2:486\n1612#2:488\n1855#2:490\n288#2:492\n289#2:494\n1856#2:495\n1612#2:496\n1#3:474\n1#3:497\n49#4:477\n50#4:479\n51#4:481\n54#4:485\n55#4:489\n56#4:491\n57#4:493\n*S KotlinDebug\n*F\n+ 1 AnimationSearch.android.kt\nandroidx/compose/ui/tooling/animation/AnimationSearch$TransitionSearch\n*L\n401#1:464,9\n401#1:473\n401#1:475\n401#1:476\n401#1:478\n401#1:480\n401#1:482\n401#1:483\n401#1:484\n401#1:486,2\n401#1:488\n401#1:490\n401#1:492\n401#1:494\n401#1:495\n401#1:496\n401#1:474\n401#1:477\n401#1:479\n401#1:481\n401#1:485\n401#1:489\n401#1:491\n401#1:493\n*E\n"})
    public static final class TransitionSearch extends Search {
        public static final int $stable;

        public TransitionSearch(@NotNull Function1 function10) {
            super(function10);
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public void addAnimations(@NotNull Collection collection0) {
            Set set0 = this.getAnimations();
            ArrayList arrayList0 = new ArrayList();
            Iterator iterator0 = collection0.iterator();
            while(true) {
                Group group0 = null;
                if(!iterator0.hasNext()) {
                    break;
                }
                Object object0 = iterator0.next();
                Group group1 = (Group)object0;
                if(group1.getLocation() != null && Intrinsics.areEqual(group1.getName(), "updateTransition")) {
                    group0 = group1;
                }
                if(group0 != null) {
                    arrayList0.add(group0);
                }
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object1: arrayList0) {
                for(Object object2: ((Group)object1).getData()) {
                    if(!(object2 instanceof Transition)) {
                        continue;
                    }
                    goto label_22;
                }
                object2 = null;
            label_22:
                if(!(object2 instanceof Transition)) {
                    object2 = null;
                }
                if(((Transition)object2) != null) {
                    arrayList1.add(((Transition)object2));
                }
            }
            ArrayList arrayList2 = new ArrayList();
            for(Object object3: arrayList0) {
                Group group2 = PreviewUtils_androidKt.firstOrNull(((Group)object3), AnimationSearch_androidKt.findRememberedData.rememberCalls.1.1.INSTANCE);
                if(group2 != null) {
                    arrayList2.add(group2);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for(Object object4: arrayList2) {
                for(Object object5: ((Group)object4).getData()) {
                    if(!(object5 instanceof Transition)) {
                        continue;
                    }
                    goto label_45;
                }
                object5 = null;
            label_45:
                if(!(object5 instanceof Transition)) {
                    object5 = null;
                }
                if(((Transition)object5) != null) {
                    arrayList3.add(((Transition)object5));
                }
            }
            set0.addAll(CollectionsKt___CollectionsKt.plus(arrayList1, arrayList3));
        }

        @Override  // androidx.compose.ui.tooling.animation.AnimationSearch$Search
        public boolean hasAnimation(@NotNull Group group0) {
            if(group0.getLocation() == null || !Intrinsics.areEqual(group0.getName(), "updateTransition")) {
                group0 = null;
            }
            return group0 != null;
        }
    }

    public static final int $stable = 8;
    public final Function0 a;
    public final Function0 b;
    public final TransitionSearch c;
    public final AnimatedContentSearch d;
    public final AnimatedVisibilitySearch e;
    public final Set f;
    public final Set g;
    public final Set h;

    public AnimationSearch(@NotNull Function0 function00, @NotNull Function0 function01) {
        this.a = function00;
        this.b = function01;
        TransitionSearch animationSearch$TransitionSearch0 = new TransitionSearch(new p2.a(this, 2));
        this.c = animationSearch$TransitionSearch0;
        AnimatedContentSearch animationSearch$AnimatedContentSearch0 = new AnimatedContentSearch(new p2.a(this, 0));
        this.d = animationSearch$AnimatedContentSearch0;
        AnimatedVisibilitySearch animationSearch$AnimatedVisibilitySearch0 = new AnimatedVisibilitySearch(new p2.a(this, 1));
        this.e = animationSearch$AnimatedVisibilitySearch0;
        Set set0 = g0.plus(g0.plus(g0.plus(f0.setOf(new Search[]{animationSearch$TransitionSearch0, animationSearch$AnimatedVisibilitySearch0}), CollectionsKt__CollectionsKt.emptyList()), f0.emptySet()), f0.emptySet());
        this.f = set0;
        Set set1 = g0.plus(set0, CollectionsKt__CollectionsKt.emptyList());
        this.g = set1;
        this.h = g0.plus(set1, e0.setOf(animationSearch$AnimatedContentSearch0));
    }

    public final void attachAllAnimations(@NotNull Collection collection0) {
        for(Object object0: collection0) {
            List list0 = PreviewUtils_androidKt.findAll(((Group)object0), p2.b.x);
            for(Object object1: this.h) {
                ((Search)object1).addAnimations(list0);
            }
            this.c.getAnimations().removeAll(this.e.getAnimations());
            this.c.getAnimations().removeAll(this.d.getAnimations());
        }
        for(Object object2: this.g) {
            ((Search)object2).track();
        }
    }

    public final boolean searchAny(@NotNull Collection collection0) {
        if(!(collection0 instanceof Collection) || !collection0.isEmpty()) {
            for(Object object0: collection0) {
                List list0 = PreviewUtils_androidKt.findAll(((Group)object0), p2.b.y);
                Iterable iterable0 = this.f;
                if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                    for(Object object1: iterable0) {
                        if(((Search)object1).hasAnimations(list0)) {
                            return true;
                        }
                        if(false) {
                            break;
                        }
                    }
                    if(false) {
                        break;
                    }
                }
            }
        }
        return false;
    }
}

