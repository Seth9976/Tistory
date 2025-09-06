package androidx.compose.ui.text.font;

import a5.b;
import androidx.compose.runtime.Immutable;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.o;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.SpreadBuilder;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import wb.a;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000E\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001:\u0005\u0007\u001F !\u001EJ\u001D\u0010\u0007\u001A\u00020\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000F\u001A\u00020\u00062\u0006\u0010\f\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000EJ\u0015\u0010\u0010\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0010\u0010\nJ\u0015\u0010\u0011\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0011\u0010\nJ\u0015\u0010\u0013\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001A\u00020\u00062\u0006\u0010\u0005\u001A\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0014J4\u0010\u001E\u001A\u00020\u001B2\u0006\u0010\u0013\u001A\u00020\u00162\u0006\u0010\u0018\u001A\u00020\u00172\u0012\u0010\u001A\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00060\u0019\"\u00020\u0006ø\u0001\u0000¢\u0006\u0004\b\u001C\u0010\u001D\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\""}, d2 = {"Landroidx/compose/ui/text/font/FontVariation;", "", "", "name", "", "value", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "Setting", "(Ljava/lang/String;F)Landroidx/compose/ui/text/font/FontVariation$Setting;", "italic", "(F)Landroidx/compose/ui/text/font/FontVariation$Setting;", "Landroidx/compose/ui/unit/TextUnit;", "textSize", "opticalSizing--R2X_6o", "(J)Landroidx/compose/ui/text/font/FontVariation$Setting;", "opticalSizing", "slant", "width", "", "weight", "(I)Landroidx/compose/ui/text/font/FontVariation$Setting;", "grade", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "style", "", "settings", "Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings-6EWAqTQ", "(Landroidx/compose/ui/text/font/FontWeight;I[Landroidx/compose/ui/text/font/FontVariation$Setting;)Landroidx/compose/ui/text/font/FontVariation$Settings;", "Settings", "androidx/compose/ui/text/font/e", "androidx/compose/ui/text/font/f", "androidx/compose/ui/text/font/g", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
public final class FontVariation {
    @Immutable
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0002\b\u0003\n\u0002\u0010\u000E\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001A\u00020\u00042\b\u0010\u0003\u001A\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001A\u00020\u00078&X¦\u0004¢\u0006\u0006\u001A\u0004\b\b\u0010\tR\u0014\u0010\u000E\u001A\u00020\u000B8&X¦\u0004¢\u0006\u0006\u001A\u0004\b\f\u0010\r\u0082\u0001\u0003\u000F\u0010\u0011ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0012À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Setting;", "", "Landroidx/compose/ui/unit/Density;", "density", "", "toVariationValue", "(Landroidx/compose/ui/unit/Density;)F", "", "getNeedsDensity", "()Z", "needsDensity", "", "getAxisName", "()Ljava/lang/String;", "axisName", "Landroidx/compose/ui/text/font/e;", "Landroidx/compose/ui/text/font/f;", "Landroidx/compose/ui/text/font/g;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public interface Setting {
        @NotNull
        String getAxisName();

        boolean getNeedsDensity();

        float toVariationValue(@Nullable Density arg1);
    }

    @Immutable
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000B\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001B\u0012\u0012\u0010\u0004\u001A\n\u0012\u0006\b\u0001\u0012\u00020\u00030\u0002\"\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001A\u0010\t\u001A\u00020\b2\b\u0010\u0007\u001A\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000F\u0010\f\u001A\u00020\u000BH\u0016¢\u0006\u0004\b\f\u0010\rR\u001D\u0010\u0004\u001A\b\u0012\u0004\u0012\u00020\u00030\u000E8\u0006¢\u0006\f\n\u0004\b\u000F\u0010\u0010\u001A\u0004\b\u0011\u0010\u0012R\u001A\u0010\u0017\u001A\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001A\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontVariation$Settings;", "", "", "Landroidx/compose/ui/text/font/FontVariation$Setting;", "settings", "<init>", "([Landroidx/compose/ui/text/font/FontVariation$Setting;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "a", "Ljava/util/List;", "getSettings", "()Ljava/util/List;", "b", "Z", "getNeedsDensity$ui_text_release", "()Z", "needsDensity", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    @SourceDebugExtension({"SMAP\nFontVariation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,373:1\n10783#2:374\n11008#2,3:375\n11011#2,3:385\n361#3,7:378\n76#4:388\n96#4,5:389\n101#5,2:394\n33#5,6:396\n103#5:402\n*S KotlinDebug\n*F\n+ 1 FontVariation.kt\nandroidx/compose/ui/text/font/FontVariation$Settings\n*L\n52#1:374\n52#1:375,3\n52#1:385,3\n52#1:378,7\n53#1:388\n53#1:389,5\n60#1:394,2\n60#1:396,6\n60#1:402\n*E\n"})
    public static final class Settings {
        public static final int $stable;
        public final ArrayList a;
        public final boolean b;

        public Settings(@NotNull Setting[] arr_fontVariation$Setting) {
            LinkedHashMap linkedHashMap0 = new LinkedHashMap();
            boolean z = false;
            for(int v = 0; v < arr_fontVariation$Setting.length; ++v) {
                Setting fontVariation$Setting0 = arr_fontVariation$Setting[v];
                String s = fontVariation$Setting0.getAxisName();
                ArrayList arrayList0 = linkedHashMap0.get(s);
                if(arrayList0 == null) {
                    arrayList0 = new ArrayList();
                    linkedHashMap0.put(s, arrayList0);
                }
                arrayList0.add(fontVariation$Setting0);
            }
            ArrayList arrayList1 = new ArrayList();
            for(Object object0: linkedHashMap0.entrySet()) {
                String s1 = (String)((Map.Entry)object0).getKey();
                List list0 = (List)((Map.Entry)object0).getValue();
                if(list0.size() == 1) {
                    o.addAll(arrayList1, list0);
                    continue;
                }
                StringBuilder stringBuilder0 = b.v("\'", s1, "\' must be unique. Actual [ [");
                throw new IllegalArgumentException(a.b(']', CollectionsKt___CollectionsKt.joinToString$default(list0, null, null, null, 0, null, null, 0x3F, null), stringBuilder0).toString());
            }
            ArrayList arrayList2 = new ArrayList(arrayList1);
            this.a = arrayList2;
            int v1 = arrayList2.size();
            for(int v2 = 0; v2 < v1; ++v2) {
                if(((Setting)arrayList2.get(v2)).getNeedsDensity()) {
                    z = true;
                    break;
                }
            }
            this.b = z;
        }

        @Override
        public boolean equals(@Nullable Object object0) {
            if(this == object0) {
                return true;
            }
            return object0 instanceof Settings ? Intrinsics.areEqual(this.a, ((Settings)object0).a) : false;
        }

        public final boolean getNeedsDensity$ui_text_release() {
            return this.b;
        }

        @NotNull
        public final List getSettings() {
            return this.a;
        }

        @Override
        public int hashCode() {
            return this.a.hashCode();
        }
    }

    public static final int $stable;
    @NotNull
    public static final FontVariation INSTANCE;

    static {
        FontVariation.INSTANCE = new FontVariation();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    @NotNull
    public final Setting Setting(@NotNull String s, float f) {
        if(s.length() != 4) {
            throw new IllegalArgumentException(("Name must be exactly four characters. Actual: \'" + s + '\'').toString());
        }
        return new e(s, f);
    }

    @NotNull
    public final Settings Settings-6EWAqTQ(@NotNull FontWeight fontWeight0, int v, @NotNull Setting[] arr_fontVariation$Setting) {
        SpreadBuilder spreadBuilder0 = new SpreadBuilder(3);
        spreadBuilder0.add(this.weight(fontWeight0.getWeight()));
        spreadBuilder0.add(this.italic(((float)v)));
        spreadBuilder0.addSpread(arr_fontVariation$Setting);
        return new Settings(((Setting[])spreadBuilder0.toArray(new Setting[spreadBuilder0.size()])));
    }

    @NotNull
    public final Setting grade(int v) {
        if(-1000 > v || v >= 1001) {
            throw new IllegalArgumentException("\'GRAD\' must be in -1000..1000");
        }
        return new f("GRAD", v);
    }

    @NotNull
    public final Setting italic(float f) {
        if(0.0f > f || f > 1.0f) {
            throw new IllegalArgumentException(("\'ital\' must be in 0.0f..1.0f. Actual: " + f).toString());
        }
        return new e("ital", f);
    }

    @NotNull
    public final Setting opticalSizing--R2X_6o(long v) {
        if(!TextUnit.isSp-impl(v)) {
            throw new IllegalArgumentException("\'opsz\' must be provided in sp units");
        }
        return new g(v);
    }

    @NotNull
    public final Setting slant(float f) {
        if(-90.0f > f || f > 90.0f) {
            throw new IllegalArgumentException(("\'slnt\' must be in -90f..90f. Actual: " + f).toString());
        }
        return new e("slnt", f);
    }

    @NotNull
    public final Setting weight(int v) {
        if(1 > v || v >= 1001) {
            throw new IllegalArgumentException(("\'wght\' value must be in [1, 1000]. Actual: " + v).toString());
        }
        return new f("wght", v);
    }

    @NotNull
    public final Setting width(float f) {
        if(f <= 0.0f) {
            throw new IllegalArgumentException(("\'wdth\' must be strictly > 0.0f. Actual: " + f).toString());
        }
        return new e("wdth", f);
    }
}

