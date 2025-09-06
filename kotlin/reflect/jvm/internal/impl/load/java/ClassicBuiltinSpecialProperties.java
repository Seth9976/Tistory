package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Collection;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.builtins.KotlinBuiltIns;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import oe.c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nClassicBuiltinSpecialProperties.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,36:1\n1#2:37\n1747#3,3:38\n*S KotlinDebug\n*F\n+ 1 ClassicBuiltinSpecialProperties.kt\norg/jetbrains/kotlin/load/java/ClassicBuiltinSpecialProperties\n*L\n33#1:38,3\n*E\n"})
public final class ClassicBuiltinSpecialProperties {
    @NotNull
    public static final ClassicBuiltinSpecialProperties INSTANCE;

    static {
        ClassicBuiltinSpecialProperties.INSTANCE = new ClassicBuiltinSpecialProperties();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @Nullable
    public final String getBuiltinSpecialPropertyGetterName(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "<this>");
        KotlinBuiltIns.isBuiltIn(callableMemberDescriptor0);
        CallableMemberDescriptor callableMemberDescriptor1 = DescriptorUtilsKt.firstOverridden$default(DescriptorUtilsKt.getPropertyIfAccessor(callableMemberDescriptor0), false, c.w, 1, null);
        if(callableMemberDescriptor1 == null) {
            return null;
        }
        Name name0 = (Name)BuiltinSpecialProperties.INSTANCE.getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP().get(DescriptorUtilsKt.getFqNameSafe(callableMemberDescriptor1));
        return name0 == null ? null : name0.asString();
    }

    public final boolean hasBuiltinSpecialPropertyFqName(@NotNull CallableMemberDescriptor callableMemberDescriptor0) {
        Intrinsics.checkNotNullParameter(callableMemberDescriptor0, "callableMemberDescriptor");
        BuiltinSpecialProperties builtinSpecialProperties0 = BuiltinSpecialProperties.INSTANCE;
        if(!builtinSpecialProperties0.getSPECIAL_SHORT_NAMES().contains(callableMemberDescriptor0.getName())) {
            return false;
        }
        if(CollectionsKt___CollectionsKt.contains(builtinSpecialProperties0.getSPECIAL_FQ_NAMES(), DescriptorUtilsKt.fqNameOrNull(callableMemberDescriptor0)) && callableMemberDescriptor0.getValueParameters().isEmpty()) {
            return true;
        }
        if(KotlinBuiltIns.isBuiltIn(callableMemberDescriptor0)) {
            Collection collection0 = callableMemberDescriptor0.getOverriddenDescriptors();
            Intrinsics.checkNotNullExpressionValue(collection0, "overriddenDescriptors");
            if(!collection0.isEmpty()) {
                for(Object object0: collection0) {
                    Intrinsics.checkNotNullExpressionValue(((CallableMemberDescriptor)object0), "it");
                    if(ClassicBuiltinSpecialProperties.INSTANCE.hasBuiltinSpecialPropertyFqName(((CallableMemberDescriptor)object0))) {
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

