package androidx.room;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.CompositionScopedCoroutineScopeCanceller;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateMapKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode.Companion;
import com.google.android.gms.internal.measurement.zzbl;
import com.google.android.gms.internal.measurement.zzh;
import com.google.android.gms.internal.measurement.zzjm;
import com.google.android.gms.internal.measurement.zzkm;
import com.google.android.gms.measurement.internal.zzfr;
import com.google.firebase.encoders.FieldDescriptor.Builder;
import com.google.firebase.encoders.FieldDescriptor;
import com.google.firebase.encoders.proto.AtProtobuf;
import com.kakao.keditor.Keditor;
import com.kakao.tistory.j;
import com.kakao.tistory.k;
import dagger.internal.DoubleCheck;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import javax.inject.Provider;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KMutableProperty1;
import kotlin.reflect.jvm.internal.impl.metadata.deserialization.Flags.BooleanFlagField;
import kotlin.reflect.jvm.internal.impl.types.model.SimpleTypeMarker;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.CoroutineScope;

public abstract class a {
    public static void A(zzfr zzfr0, String s) {
        zzfr0.zzay().zzk().zza(s);
    }

    public static void B(zzfr zzfr0, String s) {
        zzfr0.zzay().zzj().zza(s);
    }

    public static String C(int v) {
        switch(v) {
            case 1: {
                return "INITIALIZE";
            }
            case 2: {
                return "RESOURCE_CACHE";
            }
            case 3: {
                return "DATA_CACHE";
            }
            case 4: {
                return "SOURCE";
            }
            case 5: {
                return "ENCODE";
            }
            case 6: {
                return "FINISHED";
            }
            default: {
                return "null";
            }
        }
    }

    public static String D(int v) {
        switch(v) {
            case 1: {
                return "RED";
            }
            case 2: {
                return "GREEN";
            }
            case 3: {
                return "BLUE";
            }
            default: {
                return "null";
            }
        }
    }

    public static int a(int v, int v1, int v2) {
        return zzjm.zzA(v) + v1 + v2;
    }

    public static int b(int v, int v1, int v2, int v3) {
        return zzjm.zzA(v) + v1 + v2 + v3;
    }

    public static int c(Number number0, Modifier modifier0, String s, Composer composer0, int v) {
        Intrinsics.checkNotNullParameter(modifier0, s);
        composer0.startReplaceGroup(v);
        return number0.intValue();
    }

    public static CompositionScopedCoroutineScopeCanceller d(CoroutineScope coroutineScope0, Composer composer0) {
        CompositionScopedCoroutineScopeCanceller compositionScopedCoroutineScopeCanceller0 = new CompositionScopedCoroutineScopeCanceller(coroutineScope0);
        composer0.updateRememberedValue(compositionScopedCoroutineScopeCanceller0);
        return compositionScopedCoroutineScopeCanceller0;
    }

    public static FieldDescriptor e(int v, Builder fieldDescriptor$Builder0) {
        return fieldDescriptor$Builder0.withProperty(AtProtobuf.builder().tag(v).build()).build();
    }

    public static Object f(zzbl zzbl0, int v, List list0, int v1) {
        zzh.zzh(zzbl0.name(), v, list0);
        return list0.get(v1);
    }

    public static Object g(Keditor keditor0, Integer integer0) {
        Object object0 = keditor0.getLocalConfigs().get(integer0);
        Intrinsics.checkNotNull(object0);
        return object0;
    }

    public static String h(float f, String s, StringBuilder stringBuilder0) {
        stringBuilder0.append(f);
        stringBuilder0.append(s);
        return stringBuilder0.toString();
    }

    public static String i(int v, int v1, String s, String s1) [...] // Inlined contents

    public static String j(String s, String s1) [...] // Inlined contents

    public static String k(Locale locale0, String s, String s1, Locale locale1, String s2) [...] // 潜在的解密器

    public static StringBuilder l(String s, SimpleTypeMarker simpleTypeMarker0, String s1) {
        StringBuilder stringBuilder0 = new StringBuilder(s);
        stringBuilder0.append(simpleTypeMarker0);
        stringBuilder0.append(s1);
        return stringBuilder0;
    }

    public static ArrayList m(LinkedHashMap linkedHashMap0, Object object0) {
        ArrayList arrayList0 = new ArrayList();
        linkedHashMap0.put(object0, arrayList0);
        return arrayList0;
    }

    public static Iterator n(Iterable iterable0, String s, Function1 function10, String s1) {
        Intrinsics.checkNotNullParameter(iterable0, s);
        Intrinsics.checkNotNullParameter(function10, s1);
        return iterable0.iterator();
    }

    public static Iterator o(Sequence sequence0, String s, Function1 function10, String s1) {
        Intrinsics.checkNotNullParameter(sequence0, s);
        Intrinsics.checkNotNullParameter(function10, s1);
        return sequence0.iterator();
    }

    public static Provider p(k k0, int v) {
        return DoubleCheck.provider(new j(k0, v));
    }

    public static KotlinNothingValueException q() {
        SnapshotStateMapKt.unsupported();
        return new KotlinNothingValueException();
    }

    public static Function2 r(Companion composeUiNode$Companion0, Composer composer0, MeasurePolicy measurePolicy0, Composer composer1, CompositionLocalMap compositionLocalMap0) {
        Updater.set-impl(composer0, measurePolicy0, composeUiNode$Companion0.getSetMeasurePolicy());
        Updater.set-impl(composer1, compositionLocalMap0, composeUiNode$Companion0.getSetResolvedCompositionLocals());
        return composeUiNode$Companion0.getSetCompositeKeyHash();
    }

    public static KMutableProperty1 s(Class class0, String s, String s1, int v) {
        return Reflection.mutableProperty1(new MutablePropertyReference1Impl(class0, s, s1, v));
    }

    public static void t(int v, Composer composer0, int v1, Function2 function20) {
        composer0.updateRememberedValue(v);
        composer0.apply(v1, function20);
    }

    public static void u(zzkm zzkm0) {
        if(zzkm0 != null) {
            throw new ClassCastException();
        }
    }

    public static void v(zzfr zzfr0, String s) {
        zzfr0.zzay().zzd().zza(s);
    }

    public static void w(StringBuilder stringBuilder0, String s, String s1, String s2, String s3) {
        stringBuilder0.append(s);
        stringBuilder0.append(s1);
        stringBuilder0.append(s2);
        stringBuilder0.append(s3);
    }

    public static boolean x(Composer composer0) {
        composer0.endReplaceGroup();
        composer0.endNode();
        return ComposerKt.isTraceInProgress();
    }

    public static boolean y(BooleanFlagField flags$BooleanFlagField0, int v, String s) {
        Boolean boolean0 = flags$BooleanFlagField0.get(v);
        Intrinsics.checkNotNullExpressionValue(boolean0, s);
        return boolean0.booleanValue();
    }

    public static String z(String s, String s1) [...] // Inlined contents
}

