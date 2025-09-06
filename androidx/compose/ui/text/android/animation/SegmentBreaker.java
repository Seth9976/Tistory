package androidx.compose.ui.text.android.animation;

import android.text.Layout;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.android.LayoutCompat_androidKt;
import androidx.compose.ui.text.android.LayoutHelper;
import java.text.Bidi;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.k;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J#\u0010\b\u001A\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ+\u0010\r\u001A\b\u0012\u0004\u0012\u00020\f0\u00062\u0006\u0010\u0003\u001A\u00020\u00022\u0006\u0010\u0005\u001A\u00020\u00042\u0006\u0010\u000B\u001A\u00020\n¢\u0006\u0004\b\r\u0010\u000E¨\u0006\u000F"}, d2 = {"Landroidx/compose/ui/text/android/animation/SegmentBreaker;", "", "Landroidx/compose/ui/text/android/LayoutHelper;", "layoutHelper", "Landroidx/compose/ui/text/android/animation/SegmentType;", "segmentType", "", "", "breakOffsets", "(Landroidx/compose/ui/text/android/LayoutHelper;Landroidx/compose/ui/text/android/animation/SegmentType;)Ljava/util/List;", "", "dropSpaces", "Landroidx/compose/ui/text/android/animation/Segment;", "breakSegments", "(Landroidx/compose/ui/text/android/LayoutHelper;Landroidx/compose/ui/text/android/animation/SegmentType;Z)Ljava/util/List;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nSegmentBreaker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SegmentBreaker.android.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n+ 2 ListUtils.android.kt\nandroidx/compose/ui/text/android/ListUtils_androidKt\n*L\n1#1,308:1\n33#2,6:309\n74#2,11:315\n74#2,11:326\n*S KotlinDebug\n*F\n+ 1 SegmentBreaker.android.kt\nandroidx/compose/ui/text/android/animation/SegmentBreaker\n*L\n61#1:309,6\n221#1:315,11\n270#1:326,11\n*E\n"})
public final class SegmentBreaker {
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 0x30)
    public final class WhenMappings {
        public static final int[] $EnumSwitchMapping$0;

        static {
            int[] arr_v = new int[SegmentType.values().length];
            try {
                arr_v[SegmentType.Document.ordinal()] = 1;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.Paragraph.ordinal()] = 2;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.Line.ordinal()] = 3;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.Word.ordinal()] = 4;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            try {
                arr_v[SegmentType.Character.ordinal()] = 5;
            }
            catch(NoSuchFieldError unused_ex) {
            }
            WhenMappings.$EnumSwitchMapping$0 = arr_v;
        }
    }

    public static final int $stable;
    @NotNull
    public static final SegmentBreaker INSTANCE;

    static {
        SegmentBreaker.INSTANCE = new SegmentBreaker();  // 初始化器: Ljava/lang/Object;-><init>()V
    }

    public static List a(CharSequence charSequence0, BreakIterator breakIterator0) {
        CharSequenceCharacterIterator charSequenceCharacterIterator0 = new CharSequenceCharacterIterator(charSequence0, 0, charSequence0.length());
        List list0 = CollectionsKt__CollectionsKt.mutableListOf(new Integer[]{0});
        breakIterator0.setText(charSequenceCharacterIterator0);
        while(breakIterator0.next() != -1) {
            list0.add(breakIterator0.current());
        }
        return list0;
    }

    @NotNull
    public final List breakOffsets(@NotNull LayoutHelper layoutHelper0, @NotNull SegmentType segmentType0) {
        Layout layout0 = layoutHelper0.getLayout();
        CharSequence charSequence0 = layout0.getText();
        int v = 0;
        switch(WhenMappings.$EnumSwitchMapping$0[segmentType0.ordinal()]) {
            case 1: {
                return CollectionsKt__CollectionsKt.listOf(new Integer[]{0, charSequence0.length()});
            }
            case 2: {
                List list2 = CollectionsKt__CollectionsKt.mutableListOf(new Integer[]{0});
                int v9 = layoutHelper0.getParagraphCount();
                while(v < v9) {
                    list2.add(layoutHelper0.getParagraphEnd(v));
                    ++v;
                }
                return list2;
            }
            case 3: {
                List list1 = CollectionsKt__CollectionsKt.mutableListOf(new Integer[]{0});
                int v8 = layout0.getLineCount();
                while(v < v8) {
                    list1.add(layout0.getLineEnd(v));
                    ++v;
                }
                return list1;
            }
            case 4: {
                List list0 = SegmentBreaker.a(layoutHelper0.getLayout().getText(), BreakIterator.getLineInstance(Locale.getDefault()));
                TreeSet treeSet0 = new TreeSet();
                int v1 = list0.size();
                for(int v2 = 0; v2 < v1; ++v2) {
                    treeSet0.add(((Number)list0.get(v2)).intValue());
                }
                int v3 = layoutHelper0.getParagraphCount();
                for(int v4 = 0; v4 < v3; ++v4) {
                    Bidi bidi0 = layoutHelper0.analyzeBidi(v4);
                    if(bidi0 != null) {
                        int v5 = layoutHelper0.getParagraphStart(v4);
                        int v6 = bidi0.getRunCount();
                        for(int v7 = 0; v7 < v6; ++v7) {
                            treeSet0.add(((int)(bidi0.getRunStart(v7) + v5)));
                        }
                    }
                }
                return CollectionsKt___CollectionsKt.toList(treeSet0);
            }
            case 5: {
                return SegmentBreaker.a(charSequence0, BreakIterator.getCharacterInstance(Locale.getDefault()));
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    @NotNull
    public final List breakSegments(@NotNull LayoutHelper layoutHelper0, @NotNull SegmentType segmentType0, boolean z) {
        List list1;
    alab1:
        switch(WhenMappings.$EnumSwitchMapping$0[segmentType0.ordinal()]) {
            case 1: {
                return k.listOf(new Segment(0, layoutHelper0.getLayout().getText().length(), 0, 0, layoutHelper0.getLayout().getWidth(), layoutHelper0.getLayout().getHeight()));
            }
            case 2: {
                list1 = new ArrayList();
                Layout layout3 = layoutHelper0.getLayout();
                int v19 = layoutHelper0.getParagraphCount();
                for(int v20 = 0; true; ++v20) {
                    if(v20 >= v19) {
                        break alab1;
                    }
                    int v21 = layoutHelper0.getParagraphStart(v20);
                    int v22 = layoutHelper0.getParagraphEnd(v20);
                    int v23 = LayoutCompat_androidKt.getLineForOffset(layout3, v21, false);
                    int v24 = LayoutCompat_androidKt.getLineForOffset(layout3, v22, true);
                    ((ArrayList)list1).add(new Segment(v21, v22, 0, layout3.getLineTop(v23), layout3.getWidth(), layout3.getLineBottom(v24)));
                }
            }
            case 3: {
                list1 = new ArrayList();
                Layout layout1 = layoutHelper0.getLayout();
                int v10 = layoutHelper0.getLayout().getLineCount();
                for(int v11 = 0; v11 < v10; ++v11) {
                    ((ArrayList)list1).add(new Segment(layout1.getLineStart(v11), layout1.getLineEnd(v11), (z ? ((int)(((float)Math.ceil(layout1.getLineLeft(v11))))) : 0), layout1.getLineTop(v11), (z ? ((int)(((float)Math.ceil(layout1.getLineRight(v11))))) : layout1.getWidth()), layout1.getLineBottom(v11)));
                }
                return list1;
            }
            case 4: {
                Layout layout0 = layoutHelper0.getLayout();
                int v = (int)(((float)Math.ceil(layout0.getPaint().measureText(" "))));
                List list0 = this.breakOffsets(layoutHelper0, SegmentType.Word);
                switch(list0.size()) {
                    case 0: 
                    case 1: {
                        return CollectionsKt__CollectionsKt.emptyList();
                    }
                    default: {
                        ArrayList arrayList0 = new ArrayList();
                        Object object0 = list0.get(0);
                        int v1 = CollectionsKt__CollectionsKt.getLastIndex(list0);
                        for(int v2 = 0; v2 < v1; ++v2) {
                            Object object1 = list0.get(v2 + 1);
                            int v3 = ((Number)object1).intValue();
                            int v4 = ((Number)object0).intValue();
                            int v5 = LayoutCompat_androidKt.getLineForOffset(layout0, v4, false);
                            boolean z2 = layout0.getParagraphDirection(v5) == -1;
                            boolean z3 = layout0.isRtlCharAt(v4);
                            int v6 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v4, z3 == z2, false))));
                            int v7 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v3, z3 == z2, true))));
                            int v8 = Math.min(v6, v7);
                            int v9 = Math.max(v6, v7);
                            if(z && v3 != 0 && layout0.getText().charAt(v3 - 1) == 0x20 && layout0.getLineEnd(v5) != v3) {
                                if(z3) {
                                    v8 += v;
                                }
                                else {
                                    v9 -= v;
                                }
                            }
                            arrayList0.add(new Segment(v4, v3, v8, layout0.getLineTop(v5), v9, layout0.getLineBottom(v5)));
                            object0 = object1;
                        }
                        return arrayList0;
                    }
                }
            }
            case 5: {
                list1 = new ArrayList();
                List list2 = this.breakOffsets(layoutHelper0, SegmentType.Character);
                switch(list2.size()) {
                    case 0: 
                    case 1: {
                        break alab1;
                    }
                    default: {
                        ArrayList arrayList1 = new ArrayList();
                        Object object2 = list2.get(0);
                        int v12 = CollectionsKt__CollectionsKt.getLastIndex(list2);
                        int v13 = 0;
                        for(boolean z1 = true; v13 < v12; z1 = true) {
                            ++v13;
                            Object object3 = list2.get(v13);
                            int v14 = ((Number)object3).intValue();
                            int v15 = ((Number)object2).intValue();
                            Layout layout2 = layoutHelper0.getLayout();
                            if(!z || v14 != v15 + 1 || !layoutHelper0.isLineEndSpace(layout2.getText().charAt(v15))) {
                                int v16 = LayoutCompat_androidKt.getLineForOffset(layout2, v15, false);
                                boolean z4 = layout2.getParagraphDirection(v16) == -1;
                                boolean z5 = layout2.isRtlCharAt(v15);
                                if(z5 != z4) {
                                    z1 = false;
                                }
                                int v17 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v15, z1, false))));
                                int v18 = (int)(((float)Math.ceil(layoutHelper0.getHorizontalPosition(v14, z5 == z4, true))));
                                ((ArrayList)list1).add(new Segment(v15, v14, Math.min(v17, v18), layout2.getLineTop(v16), Math.max(v17, v18), layout2.getLineBottom(v16)));
                            }
                            arrayList1.add(Unit.INSTANCE);
                            object2 = object3;
                        }
                        return list1;
                    }
                }
            }
            default: {
                throw new NoWhenBranchMatchedException();
            }
        }
        return list1;
    }
}

