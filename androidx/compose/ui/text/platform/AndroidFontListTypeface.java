package androidx.compose.ui.text.platform;

import android.content.Context;
import android.graphics.Typeface;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.font.Font;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontListFontFamily;
import androidx.compose.ui.text.font.FontLoadingStrategy;
import androidx.compose.ui.text.font.FontMatcher;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.util.ListUtilsKt;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Deprecated(message = "This is not supported after downloadable fonts.")
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001A\u00020\u0002\u0012\u0006\u0010\u0005\u001A\u00020\u0004\u0012\u001C\b\u0002\u0010\n\u001A\u0016\u0012\u0010\u0012\u000E\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0018\u00010\u0006\u0012\b\b\u0002\u0010\f\u001A\u00020\u000B¢\u0006\u0004\b\r\u0010\u000EJ*\u0010\u0016\u001A\u00020\u00132\u0006\u0010\u000F\u001A\u00020\b2\u0006\u0010\u0010\u001A\u00020\t2\u0006\u0010\u0012\u001A\u00020\u0011H\u0016ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\f\u001A\u00020\u000B8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001A\u0004\b\u0019\u0010\u001AR\u001A\u0010\u0003\u001A\u00020\u001B8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001C\u0010\u001D\u001A\u0004\b\u001E\u0010\u001F\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006 "}, d2 = {"Landroidx/compose/ui/text/platform/AndroidFontListTypeface;", "Landroidx/compose/ui/text/platform/AndroidTypeface;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "fontFamily", "Landroid/content/Context;", "context", "", "Lkotlin/Pair;", "Landroidx/compose/ui/text/font/FontWeight;", "Landroidx/compose/ui/text/font/FontStyle;", "necessaryStyles", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "<init>", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroid/content/Context;Ljava/util/List;Landroidx/compose/ui/text/font/FontMatcher;)V", "fontWeight", "fontStyle", "Landroidx/compose/ui/text/font/FontSynthesis;", "synthesis", "Landroid/graphics/Typeface;", "getNativeTypeface-PYhJU0U", "(Landroidx/compose/ui/text/font/FontWeight;II)Landroid/graphics/Typeface;", "getNativeTypeface", "a", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "Landroidx/compose/ui/text/font/FontFamily;", "c", "Landroidx/compose/ui/text/font/FontFamily;", "getFontFamily", "()Landroidx/compose/ui/text/font/FontFamily;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nAndroidFontListTypeface.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,174:1\n235#2,3:175\n33#2,4:178\n238#2,2:182\n38#2:184\n240#2:185\n151#2,3:186\n33#2,4:189\n154#2,2:193\n38#2:195\n156#2:196\n461#2,4:197\n33#2,4:201\n465#2,3:205\n38#2:208\n468#2:209\n33#2,6:211\n1#3:210\n*S KotlinDebug\n*F\n+ 1 AndroidFontListTypeface.android.kt\nandroidx/compose/ui/text/platform/AndroidFontListTypeface\n*L\n66#1:175,3\n66#1:178,4\n66#1:182,2\n66#1:184\n66#1:185\n69#1:186,3\n69#1:189,4\n69#1:193,2\n69#1:195\n69#1:196\n71#1:197,4\n71#1:201,4\n71#1:205,3\n71#1:208\n71#1:209\n76#1:211,6\n*E\n"})
public final class AndroidFontListTypeface implements AndroidTypeface {
    public static final int $stable = 8;
    public final FontMatcher a;
    public final LinkedHashMap b;
    public final FontListFontFamily c;
    public static final FontMatcher d;

    static {
        AndroidFontListTypeface.d = new FontMatcher();
    }

    public AndroidFontListTypeface(@NotNull FontListFontFamily fontListFontFamily0, @NotNull Context context0, @Nullable List list0, @NotNull FontMatcher fontMatcher0) {
        ArrayList arrayList2;
        this.a = fontMatcher0;
        List list1 = fontListFontFamily0.getFonts();
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        for(int v2 = 0; v2 < v; ++v2) {
            Object object0 = list1.get(v2);
            if(FontLoadingStrategy.equals-impl0(((Font)object0).getLoadingStrategy-PKNRLFQ(), 0)) {
                arrayList0.add(object0);
            }
        }
        if(list0 == null) {
            arrayList2 = null;
        }
        else {
            ArrayList arrayList1 = new ArrayList(list0.size());
            int v3 = list0.size();
            for(int v4 = 0; v4 < v3; ++v4) {
                Pair pair0 = (Pair)list0.get(v4);
                arrayList1.add(((Font)CollectionsKt___CollectionsKt.firstOrNull(this.a.matchFont-RetOiIg(arrayList0, ((FontWeight)pair0.component1()), ((FontStyle)pair0.component2()).unbox-impl()))));
            }
            List list2 = ListUtilsKt.fastFilterNotNull(arrayList1);
            if(list2 == null) {
                arrayList2 = null;
            }
            else {
                HashSet hashSet0 = new HashSet(list2.size());
                arrayList2 = new ArrayList(list2.size());
                int v5 = list2.size();
                for(int v6 = 0; v6 < v5; ++v6) {
                    Object object1 = list2.get(v6);
                    if(hashSet0.add(((Font)object1))) {
                        arrayList2.add(object1);
                    }
                }
            }
        }
        if(arrayList2 != null) {
            arrayList0 = arrayList2;
        }
        if(arrayList0.isEmpty()) {
            throw new IllegalStateException("Could not match font");
        }
        LinkedHashMap linkedHashMap0 = new LinkedHashMap();
        int v7 = arrayList0.size();
        for(int v1 = 0; v1 < v7; ++v1) {
            Font font0 = (Font)arrayList0.get(v1);
            try {
                linkedHashMap0.put(font0, AndroidTypefaceCache.INSTANCE.getOrCreate(context0, font0));
            }
            catch(Exception unused_ex) {
                throw new IllegalStateException("Cannot create Typeface from " + font0);
            }
        }
        this.b = linkedHashMap0;
        this.c = fontListFontFamily0;
    }

    public AndroidFontListTypeface(FontListFontFamily fontListFontFamily0, Context context0, List list0, FontMatcher fontMatcher0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 4) != 0) {
            list0 = null;
        }
        if((v & 8) != 0) {
            fontMatcher0 = AndroidFontListTypeface.d;
        }
        this(fontListFontFamily0, context0, list0, fontMatcher0);
    }

    public static final FontMatcher access$getFontMatcher$cp() {
        return AndroidFontListTypeface.d;
    }

    @Override  // androidx.compose.ui.text.font.Typeface
    @NotNull
    public FontFamily getFontFamily() {
        return this.c;
    }

    @NotNull
    public final FontMatcher getFontMatcher() {
        return this.a;
    }

    @Override  // androidx.compose.ui.text.platform.AndroidTypeface
    @NotNull
    public Typeface getNativeTypeface-PYhJU0U(@NotNull FontWeight fontWeight0, int v, int v1) {
        LinkedHashMap linkedHashMap0 = this.b;
        ArrayList arrayList0 = new ArrayList(linkedHashMap0.keySet());
        Font font0 = (Font)CollectionsKt___CollectionsKt.firstOrNull(this.a.matchFont-RetOiIg(arrayList0, fontWeight0, v));
        if(font0 == null) {
            throw new IllegalStateException("Could not load font");
        }
        Typeface typeface0 = (Typeface)linkedHashMap0.get(font0);
        if(typeface0 == null) {
            throw new IllegalStateException("Could not load typeface");
        }
        Object object0 = FontSynthesis_androidKt.synthesizeTypeface-FxwP2eA(v1, typeface0, font0, fontWeight0, v);
        Intrinsics.checkNotNull(object0, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface)object0;
    }
}

