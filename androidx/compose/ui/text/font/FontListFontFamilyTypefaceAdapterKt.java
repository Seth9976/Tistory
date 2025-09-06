package androidx.compose.ui.text.font;

import androidx.compose.ui.text.platform.SynchronizedObject;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"ui-text_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n+ 2 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/AsyncTypefaceCache\n+ 3 Synchronization.jvm.kt\nandroidx/compose/ui/text/platform/Synchronization_jvmKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,432:1\n420#2:433\n421#2,9:435\n420#2:444\n421#2,7:446\n428#2,2:454\n26#3:434\n26#3:445\n1#4:453\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapterKt\n*L\n189#1:433\n189#1:435,9\n205#1:444\n205#1:446,7\n205#1:454,2\n189#1:434\n205#1:445\n*E\n"})
public final class FontListFontFamilyTypefaceAdapterKt {
    public static final Pair access$firstImmediatelyAvailable(List list0, TypefaceRequest typefaceRequest0, AsyncTypefaceCache asyncTypefaceCache0, PlatformFontLoader platformFontLoader0, Function1 function10) {
        Object object1;
        Object object0;
        int v = list0.size();
        int v1 = 0;
        List list1 = null;
        while(v1 < v) {
            Font font0 = (Font)list0.get(v1);
            int v2 = font0.getLoadingStrategy-PKNRLFQ();
            if(FontLoadingStrategy.equals-impl0(v2, 0)) {
                SynchronizedObject synchronizedObject0 = asyncTypefaceCache0.d;
                __monitor_enter(synchronizedObject0);
                try {
                    Key asyncTypefaceCache$Key0 = new Key(font0, platformFontLoader0.getCacheKey());
                    AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)asyncTypefaceCache0.b.get(asyncTypefaceCache$Key0);
                    if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                        asyncTypefaceCache$AsyncTypefaceResult0 = (AsyncTypefaceResult)asyncTypefaceCache0.c.get(asyncTypefaceCache$Key0);
                    }
                    if(asyncTypefaceCache$AsyncTypefaceResult0 == null) {
                        goto label_22;
                    }
                    else {
                        object0 = asyncTypefaceCache$AsyncTypefaceResult0.unbox-impl();
                        goto label_19;
                    }
                    goto label_29;
                }
                catch(Throwable throwable0) {
                }
                __monitor_exit(synchronizedObject0);
                throw throwable0;
            label_19:
                __monitor_exit(synchronizedObject0);
                Font font1 = font0;
                goto label_29;
            label_22:
                __monitor_exit(synchronizedObject0);
                try {
                    object0 = platformFontLoader0.loadBlocking(font0);
                }
                catch(Exception exception0) {
                    throw new IllegalStateException("Unable to load font " + font0, exception0);
                }
                font1 = font0;
                AsyncTypefaceCache.put$default(asyncTypefaceCache0, font0, platformFontLoader0, object0, false, 8, null);
            label_29:
                if(object0 == null) {
                    throw new IllegalStateException("Unable to load font " + font1);
                }
                return TuplesKt.to(list1, FontSynthesis_androidKt.synthesizeTypeface-FxwP2eA(typefaceRequest0.getFontSynthesis-GVVA2EU(), object0, font1, typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA()));
            }
            if(FontLoadingStrategy.equals-impl0(v2, 1)) {
                SynchronizedObject synchronizedObject1 = asyncTypefaceCache0.d;
                __monitor_enter(synchronizedObject1);
                try {
                    Key asyncTypefaceCache$Key1 = new Key(font0, platformFontLoader0.getCacheKey());
                    AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult1 = (AsyncTypefaceResult)asyncTypefaceCache0.b.get(asyncTypefaceCache$Key1);
                    if(asyncTypefaceCache$AsyncTypefaceResult1 == null) {
                        asyncTypefaceCache$AsyncTypefaceResult1 = (AsyncTypefaceResult)asyncTypefaceCache0.c.get(asyncTypefaceCache$Key1);
                    }
                    if(asyncTypefaceCache$AsyncTypefaceResult1 == null) {
                        goto label_48;
                    }
                    else {
                        object1 = asyncTypefaceCache$AsyncTypefaceResult1.unbox-impl();
                        goto label_45;
                    }
                    goto label_57;
                }
                catch(Throwable throwable1) {
                }
                __monitor_exit(synchronizedObject1);
                throw throwable1;
            label_45:
                __monitor_exit(synchronizedObject1);
                Font font2 = font0;
                goto label_57;
            label_48:
                __monitor_exit(synchronizedObject1);
                try {
                    object1 = Result.constructor-impl(platformFontLoader0.loadBlocking(font0));
                }
                catch(Throwable throwable2) {
                    object1 = Result.constructor-impl(ResultKt.createFailure(throwable2));
                }
                if(Result.isFailure-impl(object1)) {
                    object1 = null;
                }
                font2 = font0;
                AsyncTypefaceCache.put$default(asyncTypefaceCache0, font0, platformFontLoader0, object1, false, 8, null);
            label_57:
                if(object1 != null) {
                    return TuplesKt.to(list1, FontSynthesis_androidKt.synthesizeTypeface-FxwP2eA(typefaceRequest0.getFontSynthesis-GVVA2EU(), object1, font2, typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA()));
                }
            }
            else {
                if(!FontLoadingStrategy.equals-impl0(v2, 2)) {
                    throw new IllegalStateException("Unknown font type " + font0);
                }
                AsyncTypefaceResult asyncTypefaceCache$AsyncTypefaceResult2 = asyncTypefaceCache0.get-1ASDuI8(font0, platformFontLoader0);
                if(asyncTypefaceCache$AsyncTypefaceResult2 == null) {
                    if(list1 == null) {
                        list1 = CollectionsKt__CollectionsKt.mutableListOf(new Font[]{font0});
                    }
                    else {
                        list1.add(font0);
                    }
                }
                else if(!AsyncTypefaceResult.isPermanentFailure-impl(asyncTypefaceCache$AsyncTypefaceResult2.unbox-impl()) && asyncTypefaceCache$AsyncTypefaceResult2.unbox-impl() != null) {
                    return TuplesKt.to(list1, FontSynthesis_androidKt.synthesizeTypeface-FxwP2eA(typefaceRequest0.getFontSynthesis-GVVA2EU(), asyncTypefaceCache$AsyncTypefaceResult2.unbox-impl(), font0, typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA()));
                }
            }
            ++v1;
        }
        return TuplesKt.to(list1, function10.invoke(typefaceRequest0));
    }
}

