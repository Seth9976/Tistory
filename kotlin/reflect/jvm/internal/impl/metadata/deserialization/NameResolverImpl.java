package kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import java.util.LinkedList;
import java.util.List;
import kotlin.Triple;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName.Kind;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable.QualifiedName;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.QualifiedNameTable;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.StringTable;
import org.jetbrains.annotations.NotNull;

public final class NameResolverImpl implements NameResolver {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[Kind.values().length];
            try {
                arr_v[Kind.CLASS.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.PACKAGE.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[Kind.LOCAL.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public final StringTable a;
    public final QualifiedNameTable b;

    public NameResolverImpl(@NotNull StringTable protoBuf$StringTable0, @NotNull QualifiedNameTable protoBuf$QualifiedNameTable0) {
        Intrinsics.checkNotNullParameter(protoBuf$StringTable0, "strings");
        Intrinsics.checkNotNullParameter(protoBuf$QualifiedNameTable0, "qualifiedNames");
        super();
        this.a = protoBuf$StringTable0;
        this.b = protoBuf$QualifiedNameTable0;
    }

    public final Triple a(int v) {
        LinkedList linkedList0 = new LinkedList();
        LinkedList linkedList1 = new LinkedList();
        boolean z = false;
        while(v != -1) {
            QualifiedName protoBuf$QualifiedNameTable$QualifiedName0 = this.b.getQualifiedName(v);
            String s = this.a.getString(protoBuf$QualifiedNameTable$QualifiedName0.getShortName());
            Kind protoBuf$QualifiedNameTable$QualifiedName$Kind0 = protoBuf$QualifiedNameTable$QualifiedName0.getKind();
            Intrinsics.checkNotNull(protoBuf$QualifiedNameTable$QualifiedName$Kind0);
            switch(WhenMappings.$EnumSwitchMapping$0[protoBuf$QualifiedNameTable$QualifiedName$Kind0.ordinal()]) {
                case 1: {
                    linkedList1.addFirst(s);
                    break;
                }
                case 2: {
                    linkedList0.addFirst(s);
                    break;
                }
                case 3: {
                    linkedList1.addFirst(s);
                    z = true;
                }
            }
            v = protoBuf$QualifiedNameTable$QualifiedName0.getParentQualifiedName();
        }
        return new Triple(linkedList0, linkedList1, Boolean.valueOf(z));
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int v) {
        Triple triple0 = this.a(v);
        List list0 = (List)triple0.component1();
        String s = CollectionsKt___CollectionsKt.joinToString$default(((List)triple0.component2()), ".", null, null, 0, null, null, 62, null);
        return list0.isEmpty() ? s : CollectionsKt___CollectionsKt.joinToString$default(list0, "/", null, null, 0, null, null, 62, null) + '/' + s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int v) {
        String s = this.a.getString(v);
        Intrinsics.checkNotNullExpressionValue(s, "strings.getString(index)");
        return s;
    }

    @Override  // kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int v) {
        return ((Boolean)this.a(v).getThird()).booleanValue();
    }
}

