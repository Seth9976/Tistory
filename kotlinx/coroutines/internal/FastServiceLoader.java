package kotlinx.coroutines.internal;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ServiceLoader;
import java.util.Set;
import java.util.jar.JarFile;
import java.util.zip.ZipEntry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.collections.o;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt__StringsKt;
import kotlin.text.p;
import md.b;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001J\u0015\u0010\u0006\u001A\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J1\u0010\u000E\u001A\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u00072\f\u0010\t\u001A\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000B\u001A\u00020\nH\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000F"}, d2 = {"Lkotlinx/coroutines/internal/FastServiceLoader;", "", "", "Lkotlinx/coroutines/internal/MainDispatcherFactory;", "loadMainDispatcherFactory$kotlinx_coroutines_core", "()Ljava/util/List;", "loadMainDispatcherFactory", "S", "Ljava/lang/Class;", "service", "Ljava/lang/ClassLoader;", "loader", "loadProviders$kotlinx_coroutines_core", "(Ljava/lang/Class;Ljava/lang/ClassLoader;)Ljava/util/List;", "loadProviders", "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFastServiceLoader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,161:1\n77#1,5:162\n77#1,5:168\n131#1,13:183\n1#2:167\n1360#3:173\n1446#3,5:174\n1549#3:179\n1620#3,3:180\n1064#4,2:196\n*S KotlinDebug\n*F\n+ 1 FastServiceLoader.kt\nkotlinx/coroutines/internal/FastServiceLoader\n*L\n60#1:162,5\n61#1:168,5\n117#1:183,13\n99#1:173\n99#1:174,5\n101#1:179\n101#1:180,3\n153#1:196,2\n*E\n"})
public final class FastServiceLoader {
    @NotNull
    public static final FastServiceLoader INSTANCE;

    static {
        FastServiceLoader.INSTANCE = new FastServiceLoader();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static List a(BufferedReader bufferedReader0) {
        LinkedHashSet linkedHashSet0 = new LinkedHashSet();
        while(true) {
            String s = bufferedReader0.readLine();
            if(s == null) {
                return CollectionsKt___CollectionsKt.toList(linkedHashSet0);
            }
            String s1 = StringsKt__StringsKt.trim(StringsKt__StringsKt.substringBefore$default(s, "#", null, 2, null)).toString();
            for(int v = 0; v < s1.length(); ++v) {
                int v1 = s1.charAt(v);
                if(v1 != 46 && !Character.isJavaIdentifierPart(((char)v1))) {
                    throw new IllegalArgumentException(("Illegal service provider class name: " + s1).toString());
                }
            }
            if(s1.length() > 0) {
                linkedHashSet0.add(s1);
            }
        }
    }

    @NotNull
    public final List loadMainDispatcherFactory$kotlinx_coroutines_core() {
        MainDispatcherFactory mainDispatcherFactory1;
        List list0;
        Class class0;
        try {
            class0 = MainDispatcherFactory.class;
            list0 = new ArrayList(2);
            MainDispatcherFactory mainDispatcherFactory0 = null;
            try {
                mainDispatcherFactory1 = null;
                mainDispatcherFactory1 = (MainDispatcherFactory)class0.cast(Class.forName("kotlinx.coroutines.android.AndroidDispatcherFactory", true, class0.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            }
            catch(ClassNotFoundException unused_ex) {
            }
            if(mainDispatcherFactory1 != null) {
                ((ArrayList)list0).add(mainDispatcherFactory1);
            }
            try {
                mainDispatcherFactory0 = (MainDispatcherFactory)class0.cast(Class.forName("kotlinx.coroutines.test.internal.TestMainDispatcherFactory", true, class0.getClassLoader()).getDeclaredConstructor(null).newInstance(null));
            }
            catch(ClassNotFoundException unused_ex) {
            }
            if(mainDispatcherFactory0 != null) {
                ((ArrayList)list0).add(mainDispatcherFactory0);
                return list0;
            }
        }
        catch(Throwable unused_ex) {
            ClassLoader classLoader0 = class0.getClassLoader();
            try {
                return this.loadProviders$kotlinx_coroutines_core(class0, classLoader0);
            }
            catch(Throwable unused_ex) {
                return CollectionsKt___CollectionsKt.toList(ServiceLoader.load(class0, classLoader0));
            }
        }
        return list0;
    }

    @NotNull
    public final List loadProviders$kotlinx_coroutines_core(@NotNull Class class0, @NotNull ClassLoader classLoader0) {
        List list1;
        List list0;
        ArrayList arrayList0 = Collections.list(classLoader0.getResources("META-INF/services/" + class0.getName()));
        Intrinsics.checkNotNullExpressionValue(arrayList0, "list(this)");
        ArrayList arrayList1 = new ArrayList();
        for(Object object0: arrayList0) {
            URL uRL0 = (URL)object0;
            FastServiceLoader.INSTANCE.getClass();
            String s = uRL0.toString();
            if(p.startsWith$default(s, "jar", false, 2, null)) {
                String s1 = StringsKt__StringsKt.substringBefore$default(StringsKt__StringsKt.substringAfter$default(s, "jar:file:", null, 2, null), '!', null, 2, null);
                String s2 = StringsKt__StringsKt.substringAfter$default(s, "!/", null, 2, null);
                JarFile jarFile0 = new JarFile(s1, false);
                try {
                    BufferedReader bufferedReader0 = new BufferedReader(new InputStreamReader(jarFile0.getInputStream(new ZipEntry(s2)), "UTF-8"));
                    try {
                        list0 = FastServiceLoader.a(bufferedReader0);
                    }
                    catch(Throwable throwable1) {
                        CloseableKt.closeFinally(bufferedReader0, throwable1);
                        throw throwable1;
                    }
                    CloseableKt.closeFinally(bufferedReader0, null);
                }
                catch(Throwable throwable0) {
                    try {
                        jarFile0.close();
                    }
                    catch(Throwable throwable2) {
                        b.addSuppressed(throwable0, throwable2);
                        throw throwable0;
                    }
                    throw throwable0;
                }
                jarFile0.close();
            }
            else {
                BufferedReader bufferedReader1 = new BufferedReader(new InputStreamReader(uRL0.openStream()));
                try {
                    list1 = FastServiceLoader.a(bufferedReader1);
                }
                catch(Throwable throwable3) {
                    CloseableKt.closeFinally(bufferedReader1, throwable3);
                    throw throwable3;
                }
                CloseableKt.closeFinally(bufferedReader1, null);
                list0 = list1;
            }
            o.addAll(arrayList1, list0);
        }
        Set set0 = CollectionsKt___CollectionsKt.toSet(arrayList1);
        if(set0.isEmpty()) {
            throw new IllegalArgumentException("No providers were loaded with FastServiceLoader");
        }
        List list2 = new ArrayList(l.collectionSizeOrDefault(set0, 10));
        for(Object object1: set0) {
            FastServiceLoader.INSTANCE.getClass();
            Class class1 = Class.forName(((String)object1), false, classLoader0);
            if(!class0.isAssignableFrom(class1)) {
                throw new IllegalArgumentException(("Expected service of class " + class0 + ", but found " + class1).toString());
            }
            ((ArrayList)list2).add(class0.cast(class1.getDeclaredConstructor(null).newInstance(null)));
        }
        return list2;
    }
}

