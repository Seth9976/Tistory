package kotlin.reflect.jvm;

import ee.a;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.reflect.jvm.internal.EmptyContainerForLocal;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.SimpleFunctionDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.TypeTable;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmMetadataVersion;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmNameResolver;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.JvmProtoBufUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001A \u0010\u0000\u001A\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007¨\u0006\u0004"}, d2 = {"reflect", "Lkotlin/reflect/KFunction;", "R", "Lkotlin/Function;", "kotlin-reflection"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nreflectLambda.kt\nKotlin\n*S Kotlin\n*F\n+ 1 reflectLambda.kt\nkotlin/reflect/jvm/ReflectLambdaKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,79:1\n1#2:80\n*E\n"})
public final class ReflectLambdaKt {
    @ExperimentalReflectionOnLambdas
    @Nullable
    public static final KFunction reflect(@NotNull Function function0) {
        Intrinsics.checkNotNullParameter(function0, "<this>");
        Metadata metadata0 = (Metadata)function0.getClass().getAnnotation(Metadata.class);
        if(metadata0 == null) {
            return null;
        }
        String[] arr_s = metadata0.d1();
        if(arr_s.length == 0) {
            arr_s = null;
        }
        if(arr_s == null) {
            return null;
        }
        Pair pair0 = JvmProtoBufUtil.readFunctionDataFrom(arr_s, metadata0.d2());
        Object object0 = pair0.component2();
        JvmMetadataVersion jvmMetadataVersion0 = new JvmMetadataVersion(metadata0.mv(), (metadata0.xi() & 8) != 0);
        Class class0 = function0.getClass();
        TypeTable protoBuf$TypeTable0 = ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function)object0).getTypeTable();
        Intrinsics.checkNotNullExpressionValue(protoBuf$TypeTable0, "proto.typeTable");
        SimpleFunctionDescriptor simpleFunctionDescriptor0 = (SimpleFunctionDescriptor)UtilKt.deserializeToDescriptor(class0, ((kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Function)object0), ((JvmNameResolver)pair0.component1()), new kotlin.reflect.jvm.internal.impl.metadata.deserialization.TypeTable(protoBuf$TypeTable0), jvmMetadataVersion0, a.a);
        return new KFunctionImpl(EmptyContainerForLocal.INSTANCE, simpleFunctionDescriptor0);
    }
}

