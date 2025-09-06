package kotlin.reflect.full;

import androidx.appcompat.view.menu.f;
import androidx.compose.foundation.text.selection.g1;
import d0.s;
import de.a;
import de.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.TypeCastException;
import kotlin.collections.k;
import kotlin.collections.l;
import kotlin.collections.x;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.KProperty0;
import kotlin.reflect.KProperty1;
import kotlin.reflect.KProperty2;
import kotlin.reflect.KType;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KClassImpl.Data;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.ConstructorDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.FunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.utils.DFS.NodeHandlerWithListResult;
import kotlin.reflect.jvm.internal.impl.utils.DFS.VisitedWithSet;
import kotlin.reflect.jvm.internal.impl.utils.DFS;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u001E\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u000B\u001A#\u0010\u0003\u001A\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0001\u001A\u0006\u0012\u0002\b\u00030\u0000H\u0007\u00A2\u0006\u0004\b\u0003\u0010\u0004\u001A#\u0010\u0006\u001A\u00020\u0002*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0005\u001A\u0006\u0012\u0002\b\u00030\u0000H\u0007\u00A2\u0006\u0004\b\u0006\u0010\u0004\u001A-\u0010\n\u001A\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\t\u001A\u0004\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\n\u0010\u000B\u001A/\u0010\f\u001A\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\t\u001A\u0004\u0018\u00010\u0007H\u0007\u00A2\u0006\u0004\b\f\u0010\u000B\u001A#\u0010\r\u001A\u00028\u0000\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0007\u00A2\u0006\u0004\b\r\u0010\u000E\"6\u0010\u0014\u001A\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000F\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001A\u0004\b\u0010\u0010\u0011\"(\u0010\u0018\u001A\b\u0012\u0002\b\u0003\u0018\u00010\u0000*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u0017\u0010\u0013\u001A\u0004\b\u0015\u0010\u0016\"$\u0010\u001B\u001A\u0004\u0018\u00010\u0007*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001A\u0010\u0013\u001A\u0004\b\u0019\u0010\u000E\"\"\u0010 \u001A\u00020\u001C*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b\u001F\u0010\u0013\u001A\u0004\b\u001D\u0010\u001E\",\u0010&\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\"0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b%\u0010\u0013\u001A\u0004\b#\u0010$\",\u0010)\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b(\u0010\u0013\u001A\u0004\b\'\u0010$\",\u0010,\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b+\u0010\u0013\u001A\u0004\b*\u0010$\",\u0010/\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b.\u0010\u0013\u001A\u0004\b-\u0010$\",\u00102\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b1\u0010\u0013\u001A\u0004\b0\u0010$\",\u00105\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b4\u0010\u0013\u001A\u0004\b3\u0010$\",\u00108\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b7\u0010\u0013\u001A\u0004\b6\u0010$\",\u0010;\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000F0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b:\u0010\u0013\u001A\u0004\b9\u0010$\",\u0010?\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\b>\u0010\u0013\u001A\u0004\b=\u0010$\">\u0010C\u001A\u0012\u0012\u000E\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030@0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bB\u0010\u0013\u001A\u0004\bA\u0010$\"B\u0010G\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030D0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bF\u0010\u0013\u001A\u0004\bE\u0010$\">\u0010J\u001A\u0012\u0012\u000E\u0012\f\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u00030@0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bI\u0010\u0013\u001A\u0004\bH\u0010$\"B\u0010M\u001A\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0002\b\u0003\u0012\u0002\b\u00030D0!\"\b\b\u0000\u0010\b*\u00020\u0007*\b\u0012\u0004\u0012\u00028\u00000\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bL\u0010\u0013\u001A\u0004\bK\u0010$\",\u0010R\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000N*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bQ\u0010\u0013\u001A\u0004\bO\u0010P\"(\u0010U\u001A\b\u0012\u0004\u0012\u00020\u001C0!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bT\u0010\u0013\u001A\u0004\bS\u0010$\",\u0010X\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00000!*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004\u00A2\u0006\f\u0012\u0004\bW\u0010\u0013\u001A\u0004\bV\u0010$\u00A8\u0006Y"}, d2 = {"Lkotlin/reflect/KClass;", "base", "", "isSubclassOf", "(Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;)Z", "derived", "isSuperclassOf", "", "T", "value", "cast", "(Lkotlin/reflect/KClass;Ljava/lang/Object;)Ljava/lang/Object;", "safeCast", "createInstance", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "Lkotlin/reflect/KFunction;", "getPrimaryConstructor", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KFunction;", "getPrimaryConstructor$annotations", "(Lkotlin/reflect/KClass;)V", "primaryConstructor", "getCompanionObject", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KClass;", "getCompanionObject$annotations", "companionObject", "getCompanionObjectInstance", "getCompanionObjectInstance$annotations", "companionObjectInstance", "Lkotlin/reflect/KType;", "getDefaultType", "(Lkotlin/reflect/KClass;)Lkotlin/reflect/KType;", "getDefaultType$annotations", "defaultType", "", "Lkotlin/reflect/KCallable;", "getDeclaredMembers", "(Lkotlin/reflect/KClass;)Ljava/util/Collection;", "getDeclaredMembers$annotations", "declaredMembers", "getFunctions", "getFunctions$annotations", "functions", "getStaticFunctions", "getStaticFunctions$annotations", "staticFunctions", "getMemberFunctions", "getMemberFunctions$annotations", "memberFunctions", "getMemberExtensionFunctions", "getMemberExtensionFunctions$annotations", "memberExtensionFunctions", "getDeclaredFunctions", "getDeclaredFunctions$annotations", "declaredFunctions", "getDeclaredMemberFunctions", "getDeclaredMemberFunctions$annotations", "declaredMemberFunctions", "getDeclaredMemberExtensionFunctions", "getDeclaredMemberExtensionFunctions$annotations", "declaredMemberExtensionFunctions", "Lkotlin/reflect/KProperty0;", "getStaticProperties", "getStaticProperties$annotations", "staticProperties", "Lkotlin/reflect/KProperty1;", "getMemberProperties", "getMemberProperties$annotations", "memberProperties", "Lkotlin/reflect/KProperty2;", "getMemberExtensionProperties", "getMemberExtensionProperties$annotations", "memberExtensionProperties", "getDeclaredMemberProperties", "getDeclaredMemberProperties$annotations", "declaredMemberProperties", "getDeclaredMemberExtensionProperties", "getDeclaredMemberExtensionProperties$annotations", "declaredMemberExtensionProperties", "", "getSuperclasses", "(Lkotlin/reflect/KClass;)Ljava/util/List;", "getSuperclasses$annotations", "superclasses", "getAllSupertypes", "getAllSupertypes$annotations", "allSupertypes", "getAllSuperclasses", "getAllSuperclasses$annotations", "allSuperclasses", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@JvmName(name = "KClasses")
@SourceDebugExtension({"SMAP\nKClasses.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,281:1\n288#2,2:282\n288#2,2:284\n800#2,11:286\n800#2,11:297\n766#2:308\n857#2,2:309\n766#2:311\n857#2,2:312\n800#2,11:314\n766#2:325\n857#2,2:326\n766#2:328\n857#2,2:329\n766#2:331\n857#2,2:332\n766#2:334\n857#2,2:335\n766#2:337\n857#2,2:338\n766#2:340\n857#2,2:341\n766#2:343\n857#2,2:344\n1603#2,9:346\n1855#2:355\n1856#2:357\n1612#2:358\n1549#2:359\n1620#2,3:360\n661#2,4:363\n1726#2,3:367\n665#2,7:370\n1549#2:377\n1620#2,3:378\n1#3:356\n*S KotlinDebug\n*F\n+ 1 KClasses.kt\nkotlin/reflect/full/KClasses\n*L\n36#1:282,2\n47#1:284,2\n89#1:286,11\n96#1:297,11\n103#1:308\n103#1:309,2\n110#1:311\n110#1:312,2\n119#1:314,11\n126#1:325\n126#1:326,2\n133#1:328\n133#1:329,2\n141#1:331\n141#1:332,2\n148#1:334\n148#1:335,2\n155#1:337\n155#1:338,2\n162#1:340\n162#1:341,2\n169#1:343\n169#1:344,2\n184#1:346,9\n184#1:355\n184#1:357\n184#1:358\n223#1:359\n223#1:360,3\n276#1:363,4\n276#1:367,3\n276#1:370,7\n200#1:377\n200#1:378,3\n184#1:356\n*E\n"})
public final class KClasses {
    public static final boolean a(KCallableImpl kCallableImpl0) {
        return kCallableImpl0.getDescriptor().getExtensionReceiverParameter() != null;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Object cast(@NotNull KClass kClass0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        if(!kClass0.isInstance(object0)) {
            throw new TypeCastException("Value cannot be cast to " + kClass0.getQualifiedName());
        }
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.cast");
        return object0;
    }

    @SinceKotlin(version = "1.1")
    @NotNull
    public static final Object createInstance(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Object object0 = null;
        boolean z = false;
        Object object1 = null;
        Iterator iterator0 = kClass0.getConstructors().iterator();
    alab1:
        while(true) {
            if(!iterator0.hasNext()) {
                goto label_18;
            }
            Object object2 = iterator0.next();
            Iterable iterable0 = ((KFunction)object2).getParameters();
            if(!(iterable0 instanceof Collection) || !((Collection)iterable0).isEmpty()) {
                for(Object object3: iterable0) {
                    if(!((KParameter)object3).isOptional()) {
                        continue alab1;
                    }
                    if(false) {
                        break;
                    }
                }
            }
            if(!z) {
                z = true;
                object1 = object2;
                continue;
            label_18:
                if(z) {
                    object0 = object1;
                }
            }
            break;
        }
        if(((KFunction)object0) == null) {
            throw new IllegalArgumentException("Class should have a single no-arg constructor: " + kClass0);
        }
        return ((KFunction)object0).callBy(x.emptyMap());
    }

    @NotNull
    public static final Collection getAllSuperclasses(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = KClasses.getAllSupertypes(kClass0);
        Collection collection0 = new ArrayList(l.collectionSizeOrDefault(iterable0, 10));
        for(Object object0: iterable0) {
            KType kType0 = (KType)object0;
            KClassifier kClassifier0 = kType0.getClassifier();
            KClass kClass1 = kClassifier0 instanceof KClass ? ((KClass)kClassifier0) : null;
            if(kClass1 == null) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + kType0);
            }
            collection0.add(kClass1);
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getAllSuperclasses$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getAllSupertypes(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Collection collection0 = kClass0.getSupertypes();
        VisitedWithSet dFS$VisitedWithSet0 = new VisitedWithSet();
        kotlin.reflect.full.KClasses.allSupertypes.2 kClasses$allSupertypes$20 = new NodeHandlerWithListResult() {  // 初始化器: Lkotlin/reflect/jvm/internal/impl/utils/DFS$NodeHandlerWithListResult;-><init>()V
            @Override  // kotlin.reflect.jvm.internal.impl.utils.DFS$AbstractNodeHandler
            public boolean beforeChildren(Object object0) {
                return this.beforeChildren(((KType)object0));
            }

            public boolean beforeChildren(@NotNull KType kType0) {
                Intrinsics.checkNotNullParameter(kType0, "current");
                ((LinkedList)this.result).add(kType0);
                return true;
            }
        };
        Object object0 = DFS.dfs(collection0, a.c, dFS$VisitedWithSet0, kClasses$allSupertypes$20);
        Intrinsics.checkNotNullExpressionValue(object0, "dfs(\n        supertypes,…        }\n        }\n    )");
        return (Collection)object0;
    }

    @SinceKotlin(version = "1.1")
    public static void getAllSupertypes$annotations(KClass kClass0) {
    }

    @Nullable
    public static final KClass getCompanionObject(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        for(Object object0: kClass0.getNestedClasses()) {
            Intrinsics.checkNotNull(((KClass)object0), "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            if(((KClassImpl)(((KClass)object0))).getDescriptor().isCompanionObject()) {
                return (KClass)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    public static void getCompanionObject$annotations(KClass kClass0) {
    }

    @Nullable
    public static final Object getCompanionObjectInstance(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        KClass kClass1 = KClasses.getCompanionObject(kClass0);
        return kClass1 == null ? null : kClass1.getObjectInstance();
    }

    @SinceKotlin(version = "1.1")
    public static void getCompanionObjectInstance$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getDeclaredFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getDeclaredMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof KFunction) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getDeclaredFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getDeclaredMemberExtensionFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getDeclaredNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KFunction) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getDeclaredMemberExtensionFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getDeclaredMemberExtensionProperties(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getDeclaredNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KProperty2) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getDeclaredMemberExtensionProperties$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getDeclaredMemberFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getDeclaredNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KFunction) {
                ((ArrayList)collection0).add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getDeclaredMemberFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getDeclaredMemberProperties(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getDeclaredNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KProperty1) {
                ((ArrayList)collection0).add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getDeclaredMemberProperties$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getDeclaredMembers(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        return ((Data)((KClassImpl)kClass0).getData().invoke()).getDeclaredMembers();
    }

    @SinceKotlin(version = "1.1")
    public static void getDeclaredMembers$annotations(KClass kClass0) {
    }

    @NotNull
    public static final KType getDefaultType(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        SimpleType simpleType0 = ((KClassImpl)kClass0).getDescriptor().getDefaultType();
        Intrinsics.checkNotNullExpressionValue(simpleType0, "this as KClassImpl<*>).descriptor.defaultType");
        return new KTypeImpl(simpleType0, new s(kClass0, 3));
    }

    @Deprecated(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    @SinceKotlin(version = "1.1")
    public static void getDefaultType$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = kClass0.getMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof KFunction) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getMemberExtensionFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getAllNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KFunction) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getMemberExtensionFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getMemberExtensionProperties(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getAllNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KProperty2) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getMemberExtensionProperties$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getMemberFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getAllNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KFunction) {
                ((ArrayList)collection0).add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getMemberFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getMemberProperties(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getAllNonStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KProperty1) {
                ((ArrayList)collection0).add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getMemberProperties$annotations(KClass kClass0) {
    }

    @Nullable
    public static final KFunction getPrimaryConstructor(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        for(Object object0: ((KClassImpl)kClass0).getConstructors()) {
            Intrinsics.checkNotNull(((KFunction)object0), "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            FunctionDescriptor functionDescriptor0 = ((KFunctionImpl)(((KFunction)object0))).getDescriptor();
            Intrinsics.checkNotNull(functionDescriptor0, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if(((ConstructorDescriptor)functionDescriptor0).isPrimary()) {
                return (KFunction)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @SinceKotlin(version = "1.1")
    public static void getPrimaryConstructor$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getStaticFunctions(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getAllStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(object0 instanceof KFunction) {
                collection0.add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getStaticFunctions$annotations(KClass kClass0) {
    }

    @NotNull
    public static final Collection getStaticProperties(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = ((Data)((KClassImpl)kClass0).getData().invoke()).getAllStaticMembers();
        Collection collection0 = new ArrayList();
        for(Object object0: iterable0) {
            if(!KClasses.a(((KCallableImpl)object0)) && ((KCallableImpl)object0) instanceof KProperty0) {
                ((ArrayList)collection0).add(object0);
            }
        }
        return collection0;
    }

    @SinceKotlin(version = "1.1")
    public static void getStaticProperties$annotations(KClass kClass0) {
    }

    @NotNull
    public static final List getSuperclasses(@NotNull KClass kClass0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Iterable iterable0 = kClass0.getSupertypes();
        List list0 = new ArrayList();
        for(Object object0: iterable0) {
            KClassifier kClassifier0 = ((KType)object0).getClassifier();
            KClass kClass1 = kClassifier0 instanceof KClass ? ((KClass)kClassifier0) : null;
            if(kClass1 != null) {
                list0.add(kClass1);
            }
        }
        return list0;
    }

    @SinceKotlin(version = "1.1")
    public static void getSuperclasses$annotations(KClass kClass0) {
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSubclassOf(@NotNull KClass kClass0, @NotNull KClass kClass1) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Intrinsics.checkNotNullParameter(kClass1, "base");
        if(!Intrinsics.areEqual(kClass0, kClass1)) {
            Boolean boolean0 = DFS.ifAny(k.listOf(kClass0), new f(d.b, 20), new g1(kClass1, 20));
            Intrinsics.checkNotNullExpressionValue(boolean0, "base: KClass<*>): Boolea…erclasses) { it == base }");
            return boolean0.booleanValue();
        }
        return true;
    }

    @SinceKotlin(version = "1.1")
    public static final boolean isSuperclassOf(@NotNull KClass kClass0, @NotNull KClass kClass1) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        Intrinsics.checkNotNullParameter(kClass1, "derived");
        return KClasses.isSubclassOf(kClass1, kClass0);
    }

    @SinceKotlin(version = "1.1")
    @Nullable
    public static final Object safeCast(@NotNull KClass kClass0, @Nullable Object object0) {
        Intrinsics.checkNotNullParameter(kClass0, "<this>");
        if(kClass0.isInstance(object0)) {
            Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.safeCast");
            return object0;
        }
        return null;
    }
}

