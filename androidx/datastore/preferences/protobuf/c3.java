package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

public abstract class c3 {
    public static final Class a;
    public static final w3 b;
    public static final w3 c;
    public static final x3 d;

    static {
        Class class0 = null;
        try {
            class0 = Class.forName("androidx.datastore.preferences.protobuf.GeneratedMessageV3");
        }
        catch(Throwable unused_ex) {
        }
        c3.a = class0;
        c3.b = c3.B(false);
        c3.c = c3.B(true);
        c3.d = new x3();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static Object A(Object object0, int v, List list0, EnumVerifier internal$EnumVerifier0, Object object1, w3 w30) {
        if(internal$EnumVerifier0 == null) {
            return object1;
        }
        if(list0 instanceof RandomAccess) {
            int v1 = list0.size();
            int v3 = 0;
            for(int v2 = 0; v2 < v1; ++v2) {
                Integer integer0 = (Integer)list0.get(v2);
                int v4 = (int)integer0;
                if(internal$EnumVerifier0.isInRange(v4)) {
                    if(v2 != v3) {
                        list0.set(v3, integer0);
                    }
                    ++v3;
                }
                else {
                    object1 = c3.E(object0, v, v4, object1, w30);
                }
            }
            if(v3 != v1) {
                list0.subList(v3, v1).clear();
                return object1;
            }
        }
        else {
            Iterator iterator0 = list0.iterator();
            while(iterator0.hasNext()) {
                Object object2 = iterator0.next();
                int v5 = (int)(((Integer)object2));
                if(!internal$EnumVerifier0.isInRange(v5)) {
                    object1 = c3.E(object0, v, v5, object1, w30);
                    iterator0.remove();
                }
            }
        }
        return object1;
    }

    public static w3 B(boolean z) {
        Class class0 = null;
        try {
            class0 = Class.forName("androidx.datastore.preferences.protobuf.UnknownFieldSetSchema");
        }
        catch(Throwable unused_ex) {
        }
        if(class0 == null) {
            return null;
        }
        try {
            return (w3)class0.getConstructor(Boolean.TYPE).newInstance(Boolean.valueOf(z));
        }
        catch(Throwable unused_ex) {
            return null;
        }
    }

    public static void C(w3 w30, Object object0, Object object1) {
        ((x3)w30).getClass();
        UnknownFieldSetLite unknownFieldSetLite0 = ((GeneratedMessageLite)object0).unknownFields;
        UnknownFieldSetLite unknownFieldSetLite1 = ((GeneratedMessageLite)object1).unknownFields;
        if(!UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite1)) {
            if(UnknownFieldSetLite.getDefaultInstance().equals(unknownFieldSetLite0)) {
                unknownFieldSetLite0 = UnknownFieldSetLite.d(unknownFieldSetLite0, unknownFieldSetLite1);
            }
            else {
                unknownFieldSetLite0.getClass();
                if(!unknownFieldSetLite1.equals(UnknownFieldSetLite.getDefaultInstance())) {
                    unknownFieldSetLite0.a();
                    int v = unknownFieldSetLite0.a + unknownFieldSetLite1.a;
                    unknownFieldSetLite0.b(v);
                    System.arraycopy(unknownFieldSetLite1.b, 0, unknownFieldSetLite0.b, unknownFieldSetLite0.a, unknownFieldSetLite1.a);
                    System.arraycopy(unknownFieldSetLite1.c, 0, unknownFieldSetLite0.c, unknownFieldSetLite0.a, unknownFieldSetLite1.a);
                    unknownFieldSetLite0.a = v;
                }
            }
        }
        ((GeneratedMessageLite)object0).unknownFields = unknownFieldSetLite0;
    }

    // 去混淆评级： 低(20)
    public static boolean D(Object object0, Object object1) {
        return object0 == object1 || object0 != null && object0.equals(object1);
    }

    public static Object E(Object object0, int v, int v1, Object object1, w3 w30) {
        if(object1 == null) {
            object1 = w30.a(object0);
        }
        ((x3)w30).getClass();
        ((UnknownFieldSetLite)object1).e(v << 3, ((long)v1));
        return object1;
    }

    public static void F(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeBoolList(v, list0, z);
        }
    }

    public static void G(int v, List list0, Writer writer0) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeBytesList(v, list0);
        }
    }

    public static void H(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeDoubleList(v, list0, z);
        }
    }

    public static void I(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeEnumList(v, list0, z);
        }
    }

    public static void J(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFixed32List(v, list0, z);
        }
    }

    public static void K(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFixed64List(v, list0, z);
        }
    }

    public static void L(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeFloatList(v, list0, z);
        }
    }

    public static void M(int v, List list0, Writer writer0, Schema schema0) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeGroupList(v, list0, schema0);
        }
    }

    public static void N(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeInt32List(v, list0, z);
        }
    }

    public static void O(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeInt64List(v, list0, z);
        }
    }

    public static void P(int v, List list0, Writer writer0, Schema schema0) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeMessageList(v, list0, schema0);
        }
    }

    public static void Q(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSFixed32List(v, list0, z);
        }
    }

    public static void R(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSFixed64List(v, list0, z);
        }
    }

    public static void S(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSInt32List(v, list0, z);
        }
    }

    public static void T(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeSInt64List(v, list0, z);
        }
    }

    public static void U(int v, List list0, Writer writer0) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeStringList(v, list0);
        }
    }

    public static void V(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeUInt32List(v, list0, z);
        }
    }

    public static void W(int v, List list0, Writer writer0, boolean z) {
        if(list0 != null && !list0.isEmpty()) {
            writer0.writeUInt64List(v, list0, z);
        }
    }

    public static int a(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeBoolSize(v, true) * v1;
    }

    public static int b(List list0) {
        return list0.size();
    }

    public static int c(int v, List list0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.computeTagSize(v) * v1;
        for(int v2 = 0; v2 < list0.size(); ++v2) {
            v3 += CodedOutputStream.computeBytesSizeNoTag(((ByteString)list0.get(v2)));
        }
        return v3;
    }

    public static int d(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeTagSize(v) * v1 + c3.e(list0);
    }

    public static int e(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof m1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeEnumSizeNoTag(((m1)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeEnumSizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int f(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeFixed32Size(v, 0) * v1;
    }

    public static int g(List list0) {
        return list0.size() * 4;
    }

    public static int h(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeFixed64Size(v, 0L) * v1;
    }

    public static int i(List list0) {
        return list0.size() * 8;
    }

    public static int j(int v, List list0, Schema schema0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            v3 += CodedOutputStream.a(v, ((MessageLite)list0.get(v2)), schema0);
        }
        return v3;
    }

    public static int k(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeTagSize(v) * v1 + c3.l(list0);
    }

    public static int l(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof m1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeInt32SizeNoTag(((m1)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeInt32SizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int m(int v, List list0) {
        return list0.size() == 0 ? 0 : CodedOutputStream.computeTagSize(v) * list0.size() + c3.n(list0);
    }

    public static int n(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof z1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeInt64SizeNoTag(((z1)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeInt64SizeNoTag(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int o(int v, Object object0, Schema schema0) {
        if(object0 instanceof LazyFieldLite) {
            return CodedOutputStream.computeLazyFieldSize(v, ((LazyFieldLite)object0));
        }
        int v1 = ((AbstractMessageLite)(((MessageLite)object0))).b(schema0);
        return CodedOutputStream.computeUInt32SizeNoTag(v1) + v1 + CodedOutputStream.computeTagSize(v);
    }

    public static int p(int v, List list0, Schema schema0) {
        int v1 = list0.size();
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.computeTagSize(v) * v1;
        for(int v2 = 0; v2 < v1; ++v2) {
            Object object0 = list0.get(v2);
            if(object0 instanceof LazyFieldLite) {
                v3 = CodedOutputStream.computeLazyFieldSizeNoTag(((LazyFieldLite)object0)) + v3;
            }
            else {
                int v4 = ((AbstractMessageLite)(((MessageLite)object0))).b(schema0);
                v3 = CodedOutputStream.computeUInt32SizeNoTag(v4) + v4 + v3;
            }
        }
        return v3;
    }

    public static int q(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeTagSize(v) * v1 + c3.r(list0);
    }

    public static int r(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof m1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeSInt32SizeNoTag(((m1)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeSInt32SizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int s(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeTagSize(v) * v1 + c3.t(list0);
    }

    public static int t(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof z1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeSInt64SizeNoTag(((z1)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeSInt64SizeNoTag(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int u(int v, List list0) {
        int v1 = list0.size();
        int v2 = 0;
        if(v1 == 0) {
            return 0;
        }
        int v3 = CodedOutputStream.computeTagSize(v) * v1;
        if(list0 instanceof LazyStringList) {
            while(v2 < v1) {
                Object object0 = ((LazyStringList)list0).getRaw(v2);
                v3 = (object0 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object0)) : CodedOutputStream.computeStringSizeNoTag(((String)object0))) + v3;
                ++v2;
            }
            return v3;
        }
        while(v2 < v1) {
            Object object1 = list0.get(v2);
            v3 = (object1 instanceof ByteString ? CodedOutputStream.computeBytesSizeNoTag(((ByteString)object1)) : CodedOutputStream.computeStringSizeNoTag(((String)object1))) + v3;
            ++v2;
        }
        return v3;
    }

    public static int v(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeTagSize(v) * v1 + c3.w(list0);
    }

    public static int w(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof m1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeUInt32SizeNoTag(((m1)list0).getInt(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeUInt32SizeNoTag(((int)(((Integer)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static int x(int v, List list0) {
        int v1 = list0.size();
        return v1 == 0 ? 0 : CodedOutputStream.computeTagSize(v) * v1 + c3.y(list0);
    }

    public static int y(List list0) {
        int v2;
        int v = list0.size();
        int v1 = 0;
        if(v == 0) {
            return 0;
        }
        if(list0 instanceof z1) {
            v2 = 0;
            while(v1 < v) {
                v2 += CodedOutputStream.computeUInt64SizeNoTag(((z1)list0).getLong(v1));
                ++v1;
            }
            return v2;
        }
        v2 = 0;
        while(v1 < v) {
            v2 += CodedOutputStream.computeUInt64SizeNoTag(((long)(((Long)list0.get(v1)))));
            ++v1;
        }
        return v2;
    }

    public static Object z(Object object0, int v, AbstractList abstractList0, EnumLiteMap internal$EnumLiteMap0, Object object1, w3 w30) {
        if(internal$EnumLiteMap0 == null) {
            return object1;
        }
        int v1 = abstractList0.size();
        int v3 = 0;
        for(int v2 = 0; v2 < v1; ++v2) {
            Integer integer0 = (Integer)abstractList0.get(v2);
            int v4 = (int)integer0;
            if(internal$EnumLiteMap0.findValueByNumber(v4) == null) {
                object1 = c3.E(object0, v, v4, object1, w30);
            }
            else {
                if(v2 != v3) {
                    abstractList0.set(v3, integer0);
                }
                ++v3;
            }
        }
        if(v3 != v1) {
            abstractList0.subList(v3, v1).clear();
        }
        return object1;
    }
}

