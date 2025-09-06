package kotlin.reflect.jvm.internal.impl.load.java;

import a5.b;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.reflect.jvm.internal.impl.util.capitalizeDecapitalize.CapitalizeDecapitalizeKt;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@SourceDebugExtension({"SMAP\npropertiesConventionUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,102:1\n766#2:103\n857#2,2:104\n*S KotlinDebug\n*F\n+ 1 propertiesConventionUtil.kt\norg/jetbrains/kotlin/load/java/PropertiesConventionUtilKt\n*L\n90#1:103\n90#1:104,2\n*E\n"})
public final class PropertiesConventionUtilKt {
    public static Name a(Name name0, String s, String s1, int v) {
        if((v & 8) != 0) {
            s1 = null;
        }
        if(!name0.isSpecial()) {
            String s2 = name0.getIdentifier();
            Intrinsics.checkNotNullExpressionValue(s2, "methodName.identifier");
            if(p.startsWith$default(s2, s, false, 2, null) && s2.length() != s.length()) {
                int v1 = s2.charAt(s.length());
                if(97 > v1 || v1 >= 0x7B) {
                    if(s1 != null) {
                        StringBuilder stringBuilder0 = b.t(s1);
                        stringBuilder0.append(StringsKt__StringsKt.removePrefix(s2, s));
                        return Name.identifier(stringBuilder0.toString());
                    }
                    if((v & 4) != 0) {
                        String s3 = CapitalizeDecapitalizeKt.decapitalizeSmartForCompiler(StringsKt__StringsKt.removePrefix(s2, s), true);
                        return Name.isValidIdentifier(s3) ? Name.identifier(s3) : null;
                    }
                    return name0;
                }
            }
        }
        return null;
    }

    @NotNull
    public static final List getPropertyNamesCandidatesByAccessorName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "name");
        String s = name0.asString();
        Intrinsics.checkNotNullExpressionValue(s, "name.asString()");
        if(JvmAbi.isGetterName(s)) {
            return CollectionsKt__CollectionsKt.listOfNotNull(PropertiesConventionUtilKt.propertyNameByGetMethodName(name0));
        }
        return JvmAbi.isSetterName(s) ? PropertiesConventionUtilKt.propertyNamesBySetMethodName(name0) : BuiltinSpecialProperties.INSTANCE.getPropertyNameCandidatesBySpecialGetterName(name0);
    }

    @Nullable
    public static final Name propertyNameByGetMethodName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "methodName");
        Name name1 = PropertiesConventionUtilKt.a(name0, "get", null, 12);
        return name1 == null ? PropertiesConventionUtilKt.a(name0, "is", null, 8) : name1;
    }

    @Nullable
    public static final Name propertyNameBySetMethodName(@NotNull Name name0, boolean z) {
        Intrinsics.checkNotNullParameter(name0, "methodName");
        return z ? PropertiesConventionUtilKt.a(name0, "set", "is", 4) : PropertiesConventionUtilKt.a(name0, "set", null, 4);
    }

    @NotNull
    public static final List propertyNamesBySetMethodName(@NotNull Name name0) {
        Intrinsics.checkNotNullParameter(name0, "methodName");
        return CollectionsKt__CollectionsKt.listOfNotNull(new Name[]{PropertiesConventionUtilKt.propertyNameBySetMethodName(name0, false), PropertiesConventionUtilKt.propertyNameBySetMethodName(name0, true)});
    }
}

