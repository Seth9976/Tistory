package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000B\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J.\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u00072\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\f\u0010\rJ.\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u000E2\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u000FJ4\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\u0010\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\n\u001A\u00020\u000Bø\u0001\u0000¢\u0006\u0004\b\f\u0010\u0011JF\u0010\u0012\u001A\b\u0012\u0004\u0012\u00020\u00050\u0004*\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001A\u00020\t2\u0006\u0010\u0013\u001A\u00020\u00142\n\b\u0002\u0010\u0015\u001A\u0004\u0018\u00010\t2\n\b\u0002\u0010\u0016\u001A\u0004\u0018\u00010\tH\u0080\b¢\u0006\u0002\b\u0017\u0082\u0002\u0007\n\u0005\b¡\u001E0\u0001¨\u0006\u0018"}, d2 = {"Landroidx/compose/ui/text/font/FontMatcher;", "", "()V", "matchFont", "", "Landroidx/compose/ui/text/font/Font;", "fontFamily", "Landroidx/compose/ui/text/font/FontFamily;", "fontWeight", "Landroidx/compose/ui/text/font/FontWeight;", "fontStyle", "Landroidx/compose/ui/text/font/FontStyle;", "matchFont-RetOiIg", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "Landroidx/compose/ui/text/font/FontListFontFamily;", "(Landroidx/compose/ui/text/font/FontListFontFamily;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "fontList", "(Ljava/util/List;Landroidx/compose/ui/text/font/FontWeight;I)Ljava/util/List;", "filterByClosestWeight", "preferBelow", "", "minSearchRange", "maxSearchRange", "filterByClosestWeight$ui_text_release", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontMatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,166:1\n102#1,34:190\n102#1,34:235\n108#1,28:280\n108#1,28:319\n235#2,3:167\n33#2,4:170\n238#2,2:174\n38#2:176\n240#2:177\n235#2,3:178\n33#2,4:181\n238#2,2:185\n38#2:187\n240#2:188\n235#2,3:224\n33#2,4:227\n238#2,2:231\n38#2:233\n240#2:234\n235#2,3:269\n33#2,4:272\n238#2,2:276\n38#2:278\n240#2:279\n235#2,3:308\n33#2,4:311\n238#2,2:315\n38#2:317\n240#2:318\n235#2,3:347\n33#2,4:350\n238#2,2:354\n38#2:356\n240#2:357\n235#2,3:358\n33#2,4:361\n238#2,2:365\n38#2:367\n240#2:368\n235#2,3:369\n33#2,4:372\n238#2,2:376\n38#2:378\n240#2:379\n1#3:189\n*S KotlinDebug\n*F\n+ 1 FontMatcher.kt\nandroidx/compose/ui/text/font/FontMatcher\n*L\n65#1:190,34\n71#1:235,34\n80#1:280,28\n87#1:319,28\n49#1:167,3\n49#1:170,4\n49#1:174,2\n49#1:176\n49#1:177\n57#1:178,3\n57#1:181,4\n57#1:185,2\n57#1:187\n57#1:188\n65#1:224,3\n65#1:227,4\n65#1:231,2\n65#1:233\n65#1:234\n71#1:269,3\n71#1:272,4\n71#1:276,2\n71#1:278\n71#1:279\n80#1:308,3\n80#1:311,4\n80#1:315,2\n80#1:317\n80#1:318\n87#1:347,3\n87#1:350,4\n87#1:354,2\n87#1:356\n87#1:357\n135#1:358,3\n135#1:361,4\n135#1:365,2\n135#1:367\n135#1:368\n135#1:369,3\n135#1:372,4\n135#1:376,2\n135#1:378\n135#1:379\n*E\n"})
public final class FontMatcher {
    public static final int $stable;

    @NotNull
    public final List filterByClosestWeight$ui_text_release(@NotNull List list0, @NotNull FontWeight fontWeight0, boolean z, @Nullable FontWeight fontWeight1, @Nullable FontWeight fontWeight2) {
        int v = list0.size();
        FontWeight fontWeight3 = null;
        FontWeight fontWeight4 = null;
        for(int v2 = 0; v2 < v; ++v2) {
            FontWeight fontWeight5 = ((Font)list0.get(v2)).getWeight();
            if((fontWeight1 == null || fontWeight5.compareTo(fontWeight1) >= 0) && (fontWeight2 == null || fontWeight5.compareTo(fontWeight2) <= 0)) {
                if(fontWeight5.compareTo(fontWeight0) >= 0) {
                    if(fontWeight5.compareTo(fontWeight0) <= 0) {
                        fontWeight3 = fontWeight5;
                        fontWeight4 = fontWeight3;
                        break;
                    }
                    else if(fontWeight4 == null || fontWeight5.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeight5;
                    }
                }
                else if(fontWeight3 == null || fontWeight5.compareTo(fontWeight3) > 0) {
                    fontWeight3 = fontWeight5;
                }
            }
        }
        if(!z) {
            if(fontWeight4 != null) {
                fontWeight3 = fontWeight4;
            }
        }
        else if(fontWeight3 == null) {
            fontWeight3 = fontWeight4;
        }
        List list1 = new ArrayList(list0.size());
        int v3 = list0.size();
        for(int v1 = 0; v1 < v3; ++v1) {
            Object object0 = list0.get(v1);
            if(Intrinsics.areEqual(((Font)object0).getWeight(), fontWeight3)) {
                list1.add(object0);
            }
        }
        return list1;
    }

    public static List filterByClosestWeight$ui_text_release$default(FontMatcher fontMatcher0, List list0, FontWeight fontWeight0, boolean z, FontWeight fontWeight1, FontWeight fontWeight2, int v, Object object0) {
        FontWeight fontWeight3 = null;
        if((v & 4) != 0) {
            fontWeight1 = null;
        }
        if((v & 8) != 0) {
            fontWeight2 = null;
        }
        int v1 = list0.size();
        FontWeight fontWeight4 = null;
        for(int v3 = 0; v3 < v1; ++v3) {
            FontWeight fontWeight5 = ((Font)list0.get(v3)).getWeight();
            if((fontWeight1 == null || fontWeight5.compareTo(fontWeight1) >= 0) && (fontWeight2 == null || fontWeight5.compareTo(fontWeight2) <= 0)) {
                if(fontWeight5.compareTo(fontWeight0) >= 0) {
                    if(fontWeight5.compareTo(fontWeight0) <= 0) {
                        fontWeight3 = fontWeight5;
                        fontWeight4 = fontWeight3;
                        break;
                    }
                    else if(fontWeight4 == null || fontWeight5.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeight5;
                    }
                }
                else if(fontWeight3 == null || fontWeight5.compareTo(fontWeight3) > 0) {
                    fontWeight3 = fontWeight5;
                }
            }
        }
        if(!z) {
            if(fontWeight4 != null) {
                fontWeight3 = fontWeight4;
            }
        }
        else if(fontWeight3 == null) {
            fontWeight3 = fontWeight4;
        }
        List list1 = new ArrayList(list0.size());
        int v4 = list0.size();
        for(int v2 = 0; v2 < v4; ++v2) {
            Object object1 = list0.get(v2);
            if(Intrinsics.areEqual(((Font)object1).getWeight(), fontWeight3)) {
                list1.add(object1);
            }
        }
        return list1;
    }

    @NotNull
    public final List matchFont-RetOiIg(@NotNull FontFamily fontFamily0, @NotNull FontWeight fontWeight0, int v) {
        if(!(fontFamily0 instanceof FontListFontFamily)) {
            throw new IllegalArgumentException("Only FontFamily instances that presents a list of Fonts can be used");
        }
        return this.matchFont-RetOiIg(((FontListFontFamily)fontFamily0), fontWeight0, v);
    }

    @NotNull
    public final List matchFont-RetOiIg(@NotNull FontListFontFamily fontListFontFamily0, @NotNull FontWeight fontWeight0, int v) {
        return this.matchFont-RetOiIg(fontListFontFamily0.getFonts(), fontWeight0, v);
    }

    @NotNull
    public final List matchFont-RetOiIg(@NotNull List list0, @NotNull FontWeight fontWeight0, int v) {
        List list2;
        List list1 = new ArrayList(list0.size());
        int v1 = list0.size();
        int v2 = 0;
        for(int v3 = 0; v3 < v1; ++v3) {
            Object object0 = list0.get(v3);
            if(Intrinsics.areEqual(((Font)object0).getWeight(), fontWeight0) && FontStyle.equals-impl0(((Font)object0).getStyle-_-LCdwA(), v)) {
                list1.add(object0);
            }
        }
        if(!list1.isEmpty()) {
            return list1;
        }
        ArrayList arrayList0 = new ArrayList(list0.size());
        int v4 = list0.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Object object1 = list0.get(v5);
            if(FontStyle.equals-impl0(((Font)object1).getStyle-_-LCdwA(), v)) {
                arrayList0.add(object1);
            }
        }
        if(!arrayList0.isEmpty()) {
            list0 = arrayList0;
        }
        Companion fontWeight$Companion0 = FontWeight.Companion;
        FontWeight fontWeight1 = null;
        if(fontWeight0.compareTo(fontWeight$Companion0.getW400()) < 0) {
            int v6 = list0.size();
            FontWeight fontWeight2 = null;
            int v7 = 0;
            while(v7 < v6) {
                FontWeight fontWeight3 = ((Font)list0.get(v7)).getWeight();
                if(fontWeight3.compareTo(fontWeight0) >= 0) {
                    if(fontWeight3.compareTo(fontWeight0) <= 0) {
                        goto label_40;
                    }
                    else if(fontWeight2 == null || fontWeight3.compareTo(fontWeight2) < 0) {
                        fontWeight2 = fontWeight3;
                    }
                }
                else if(fontWeight1 == null || fontWeight3.compareTo(fontWeight1) > 0) {
                    fontWeight1 = fontWeight3;
                }
                ++v7;
                continue;
            label_40:
                fontWeight2 = fontWeight3;
                fontWeight1 = fontWeight2;
                if(true) {
                    break;
                }
            }
            if(fontWeight1 != null) {
                fontWeight2 = fontWeight1;
            }
            list2 = new ArrayList(list0.size());
            int v8 = list0.size();
            while(v2 < v8) {
                Object object2 = list0.get(v2);
                if(Intrinsics.areEqual(((Font)object2).getWeight(), fontWeight2)) {
                    list2.add(object2);
                }
                ++v2;
            }
            return list2;
        }
        if(fontWeight0.compareTo(fontWeight$Companion0.getW500()) > 0) {
            int v9 = list0.size();
            FontWeight fontWeight4 = null;
            int v10 = 0;
            while(v10 < v9) {
                FontWeight fontWeight5 = ((Font)list0.get(v10)).getWeight();
                if(fontWeight5.compareTo(fontWeight0) >= 0) {
                    if(fontWeight5.compareTo(fontWeight0) <= 0) {
                        goto label_69;
                    }
                    else if(fontWeight4 == null || fontWeight5.compareTo(fontWeight4) < 0) {
                        fontWeight4 = fontWeight5;
                    }
                }
                else if(fontWeight1 == null || fontWeight5.compareTo(fontWeight1) > 0) {
                    fontWeight1 = fontWeight5;
                }
                ++v10;
                continue;
            label_69:
                fontWeight4 = fontWeight5;
                fontWeight1 = fontWeight4;
                if(true) {
                    break;
                }
            }
            if(fontWeight4 == null) {
                fontWeight4 = fontWeight1;
            }
            list2 = new ArrayList(list0.size());
            int v11 = list0.size();
            while(v2 < v11) {
                Object object3 = list0.get(v2);
                if(Intrinsics.areEqual(((Font)object3).getWeight(), fontWeight4)) {
                    list2.add(object3);
                }
                ++v2;
            }
            return list2;
        }
        FontWeight fontWeight6 = fontWeight$Companion0.getW500();
        int v12 = list0.size();
        FontWeight fontWeight7 = null;
        FontWeight fontWeight8 = null;
        for(int v13 = 0; v13 < v12; ++v13) {
            FontWeight fontWeight9 = ((Font)list0.get(v13)).getWeight();
            if(fontWeight6 == null || fontWeight9.compareTo(fontWeight6) <= 0) {
                if(fontWeight9.compareTo(fontWeight0) >= 0) {
                    if(fontWeight9.compareTo(fontWeight0) <= 0) {
                        fontWeight7 = fontWeight9;
                        fontWeight8 = fontWeight7;
                        break;
                    }
                    else if(fontWeight8 == null || fontWeight9.compareTo(fontWeight8) < 0) {
                        fontWeight8 = fontWeight9;
                    }
                }
                else if(fontWeight7 == null || fontWeight9.compareTo(fontWeight7) > 0) {
                    fontWeight7 = fontWeight9;
                }
            }
        }
        if(fontWeight8 != null) {
            fontWeight7 = fontWeight8;
        }
        ArrayList arrayList1 = new ArrayList(list0.size());
        int v14 = list0.size();
        for(int v15 = 0; v15 < v14; ++v15) {
            Object object4 = list0.get(v15);
            if(Intrinsics.areEqual(((Font)object4).getWeight(), fontWeight7)) {
                arrayList1.add(object4);
            }
        }
        if(arrayList1.isEmpty()) {
            FontWeight fontWeight10 = FontWeight.Companion.getW500();
            int v16 = list0.size();
            FontWeight fontWeight11 = null;
            for(int v17 = 0; v17 < v16; ++v17) {
                FontWeight fontWeight12 = ((Font)list0.get(v17)).getWeight();
                if(fontWeight10 == null || fontWeight12.compareTo(fontWeight10) >= 0) {
                    if(fontWeight12.compareTo(fontWeight0) >= 0) {
                        if(fontWeight12.compareTo(fontWeight0) <= 0) {
                            fontWeight1 = fontWeight12;
                            fontWeight11 = fontWeight1;
                            break;
                        }
                        else if(fontWeight11 == null || fontWeight12.compareTo(fontWeight11) < 0) {
                            fontWeight11 = fontWeight12;
                        }
                    }
                    else if(fontWeight1 == null || fontWeight12.compareTo(fontWeight1) > 0) {
                        fontWeight1 = fontWeight12;
                    }
                }
            }
            if(fontWeight11 != null) {
                fontWeight1 = fontWeight11;
            }
            list2 = new ArrayList(list0.size());
            int v18 = list0.size();
            while(v2 < v18) {
                Object object5 = list0.get(v2);
                if(Intrinsics.areEqual(((Font)object5).getWeight(), fontWeight1)) {
                    list2.add(object5);
                }
                ++v2;
            }
            return list2;
        }
        return arrayList1;
    }
}

