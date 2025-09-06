package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import ve.b;

@SourceDebugExtension({"SMAP\nSignatureBuildingComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,39:1\n11335#2:40\n11670#2,3:41\n11670#2,3:46\n37#3,2:44\n*S KotlinDebug\n*F\n+ 1 SignatureBuildingComponents.kt\norg/jetbrains/kotlin/load/kotlin/SignatureBuildingComponents\n*L\n20#1:40\n20#1:41,3\n25#1:46,3\n20#1:44,2\n*E\n"})
public final class SignatureBuildingComponents {
    @NotNull
    public static final SignatureBuildingComponents INSTANCE;

    static {
        SignatureBuildingComponents.INSTANCE = new SignatureBuildingComponents();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static final String access$escapeClassName(SignatureBuildingComponents signatureBuildingComponents0, String s) {
        signatureBuildingComponents0.getClass();
        return s.length() <= 1 ? s : "L" + s + ';';
    }

    @NotNull
    public final String[] constructors(@NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(arr_s, "signatures");
        ArrayList arrayList0 = new ArrayList(arr_s.length);
        for(int v = 0; v < arr_s.length; ++v) {
            arrayList0.add("<init>(" + arr_s[v] + ")V");
        }
        return (String[])arrayList0.toArray(new String[0]);
    }

    @NotNull
    public final Set inClass(@NotNull String s, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(s, "internalName");
        Intrinsics.checkNotNullParameter(arr_s, "signatures");
        Set set0 = new LinkedHashSet();
        for(int v = 0; v < arr_s.length; ++v) {
            set0.add(s + '.' + arr_s[v]);
        }
        return set0;
    }

    @NotNull
    public final Set inJavaLang(@NotNull String s, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_s, "signatures");
        return this.inClass(this.javaLang(s), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @NotNull
    public final Set inJavaUtil(@NotNull String s, @NotNull String[] arr_s) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(arr_s, "signatures");
        return this.inClass(this.javaUtil(s), ((String[])Arrays.copyOf(arr_s, arr_s.length)));
    }

    @NotNull
    public final String javaFunction(@NotNull String s) [...] // 潜在的解密器

    @NotNull
    public final String javaLang(@NotNull String s) [...] // 潜在的解密器

    @NotNull
    public final String javaUtil(@NotNull String s) [...] // 潜在的解密器

    @NotNull
    public final String jvmDescriptor(@NotNull String s, @NotNull List list0, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "name");
        Intrinsics.checkNotNullParameter(list0, "parameters");
        Intrinsics.checkNotNullParameter(s1, "ret");
        StringBuilder stringBuilder0 = new StringBuilder();
        stringBuilder0.append(s);
        stringBuilder0.append('(');
        stringBuilder0.append(CollectionsKt___CollectionsKt.joinToString$default(list0, "", null, null, 0, null, b.w, 30, null));
        stringBuilder0.append(')');
        if(s1.length() > 1) {
            s1 = "L" + s1 + ';';
        }
        stringBuilder0.append(s1);
        return stringBuilder0.toString();
    }

    @NotNull
    public final String signature(@NotNull String s, @NotNull String s1) {
        Intrinsics.checkNotNullParameter(s, "internalName");
        Intrinsics.checkNotNullParameter(s1, "jvmDescriptor");
        return s + '.' + s1;
    }
}

