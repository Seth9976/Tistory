package kotlin.reflect.jvm.internal.impl.resolve;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.LinkedList;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableDescriptor;
import kotlin.reflect.jvm.internal.impl.utils.SmartSet;
import org.jetbrains.annotations.NotNull;
import y0.y0;

@SourceDebugExtension({"SMAP\noverridingUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,84:1\n1620#2,3:85\n847#2,2:88\n*S KotlinDebug\n*F\n+ 1 overridingUtils.kt\norg/jetbrains/kotlin/resolve/OverridingUtilsKt\n*L\n40#1:85,3\n72#1:88,2\n*E\n"})
public final class OverridingUtilsKt {
    @NotNull
    public static final Collection selectMostSpecificInEachOverridableGroup(@NotNull Collection collection0, @NotNull Function1 function10) {
        Intrinsics.checkNotNullParameter(collection0, "<this>");
        Intrinsics.checkNotNullParameter(function10, "descriptorByHandle");
        if(collection0.size() <= 1) {
            return collection0;
        }
        LinkedList linkedList0 = new LinkedList(collection0);
        Collection collection1 = SmartSet.Companion.create();
        while(!linkedList0.isEmpty()) {
            Object object0 = CollectionsKt___CollectionsKt.first(linkedList0);
            SmartSet smartSet0 = SmartSet.Companion.create();
            Collection collection2 = OverridingUtil.extractMembersOverridableInBothWays(object0, linkedList0, function10, new y0(smartSet0, 6));
            Intrinsics.checkNotNullExpressionValue(collection2, "conflictedHandles = Smar…nflictedHandles.add(it) }");
            if(collection2.size() == 1 && smartSet0.isEmpty()) {
                Object object1 = CollectionsKt___CollectionsKt.single(collection2);
                Intrinsics.checkNotNullExpressionValue(object1, "overridableGroup.single()");
                ((SmartSet)collection1).add(object1);
            }
            else {
                Object object2 = OverridingUtil.selectMostSpecificMember(collection2, function10);
                Intrinsics.checkNotNullExpressionValue(object2, "selectMostSpecificMember…roup, descriptorByHandle)");
                CallableDescriptor callableDescriptor0 = (CallableDescriptor)function10.invoke(object2);
                for(Object object3: collection2) {
                    Intrinsics.checkNotNullExpressionValue(object3, "it");
                    if(!OverridingUtil.isMoreSpecific(callableDescriptor0, ((CallableDescriptor)function10.invoke(object3)))) {
                        smartSet0.add(object3);
                    }
                }
                if(!smartSet0.isEmpty()) {
                    ((AbstractCollection)collection1).addAll(smartSet0);
                }
                ((SmartSet)collection1).add(object2);
            }
        }
        return collection1;
    }
}

