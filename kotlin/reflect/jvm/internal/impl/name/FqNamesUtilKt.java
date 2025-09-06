package kotlin.reflect.jvm.internal.impl.name;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.p;
import l1.a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\nFqNamesUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,86:1\n515#2:87\n500#2,6:88\n1#3:94\n*S KotlinDebug\n*F\n+ 1 FqNamesUtil.kt\norg/jetbrains/kotlin/name/FqNamesUtilKt\n*L\n73#1:87\n73#1:88,6\n*E\n"})
public final class FqNamesUtilKt {
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[a.d(3).length];
            try {
                arr_v[0] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[2] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[1] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    @Nullable
    public static final Object findValueForMostSpecificFqname(@NotNull FqName fqName0, @NotNull Map map0) {
        Intrinsics.checkNotNullParameter(fqName0, "<this>");
        Intrinsics.checkNotNullParameter(map0, "values");
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        for(Object object0: map0.entrySet()) {
            Map.Entry map$Entry0 = (Map.Entry)object0;
            FqName fqName1 = (FqName)map$Entry0.getKey();
            if(Intrinsics.areEqual(fqName0, fqName1) || FqNamesUtilKt.isChildOf(fqName0, fqName1)) {
                linkedHashMap0.put(map$Entry0.getKey(), map$Entry0.getValue());
            }
        }
        if(linkedHashMap0.isEmpty()) {
            linkedHashMap0 = null;
        }
        if(linkedHashMap0 == null) {
            return null;
        }
        Iterator iterator1 = linkedHashMap0.entrySet().iterator();
        if(!iterator1.hasNext()) {
            return null;
        }
        Object object1 = iterator1.next();
        if(iterator1.hasNext()) {
            int v = FqNamesUtilKt.tail(((FqName)((Map.Entry)object1).getKey()), fqName0).asString().length();
            while(true) {
                Object object2 = iterator1.next();
                int v1 = FqNamesUtilKt.tail(((FqName)((Map.Entry)object2).getKey()), fqName0).asString().length();
                if(v > v1) {
                    object1 = object2;
                    v = v1;
                }
                if(!iterator1.hasNext()) {
                    break;
                }
            }
        }
        return ((Map.Entry)object1) == null ? null : ((Map.Entry)object1).getValue();
    }

    public static final boolean isChildOf(@NotNull FqName fqName0, @NotNull FqName fqName1) {
        Intrinsics.checkNotNullParameter(fqName0, "<this>");
        Intrinsics.checkNotNullParameter(fqName1, "packageName");
        return Intrinsics.areEqual(FqNamesUtilKt.parentOrNull(fqName0), fqName1);
    }

    public static final boolean isSubpackageOf(@NotNull FqName fqName0, @NotNull FqName fqName1) {
        Intrinsics.checkNotNullParameter(fqName0, "<this>");
        Intrinsics.checkNotNullParameter(fqName1, "packageName");
        if(!Intrinsics.areEqual(fqName0, fqName1) && !fqName1.isRoot()) {
            String s = fqName0.asString();
            Intrinsics.checkNotNullExpressionValue(s, "this.asString()");
            String s1 = fqName1.asString();
            Intrinsics.checkNotNullExpressionValue(s1, "packageName.asString()");
            return p.startsWith$default(s, s1, false, 2, null) && s.charAt(s1.length()) == 46;
        }
        return true;
    }

    public static final boolean isValidJavaFqName(@Nullable String s) {
        if(s == null) {
            return false;
        }
        int v1 = 1;
        for(int v = 0; v < s.length(); ++v) {
            int v2 = s.charAt(v);
            switch(a.c(v1)) {
                case 1: {
                    if(v2 == 46) {
                        v1 = 3;
                    }
                    else if(!Character.isJavaIdentifierPart(((char)v2))) {
                        return false;
                    }
                    break;
                }
                case 0: 
                case 2: {
                    if(!Character.isJavaIdentifierStart(((char)v2))) {
                        return false;
                    }
                    v1 = 2;
                }
            }
        }
        return v1 != 3;
    }

    @Nullable
    public static final FqName parentOrNull(@NotNull FqName fqName0) {
        Intrinsics.checkNotNullParameter(fqName0, "<this>");
        return fqName0.isRoot() ? null : fqName0.parent();
    }

    @NotNull
    public static final FqName tail(@NotNull FqName fqName0, @NotNull FqName fqName1) {
        Intrinsics.checkNotNullParameter(fqName0, "<this>");
        Intrinsics.checkNotNullParameter(fqName1, "prefix");
        if(FqNamesUtilKt.isSubpackageOf(fqName0, fqName1) && !fqName1.isRoot()) {
            if(Intrinsics.areEqual(fqName0, fqName1)) {
                Intrinsics.checkNotNullExpressionValue(FqName.ROOT, "ROOT");
                return FqName.ROOT;
            }
            String s = fqName0.asString();
            Intrinsics.checkNotNullExpressionValue(s, "asString()");
            String s1 = s.substring(fqName1.asString().length() + 1);
            Intrinsics.checkNotNullExpressionValue(s1, "this as java.lang.String).substring(startIndex)");
            return new FqName(s1);
        }
        return fqName0;
    }
}

