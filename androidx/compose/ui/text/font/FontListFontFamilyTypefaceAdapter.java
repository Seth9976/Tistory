package androidx.compose.ui.text.font;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.platform.DispatcherKt;
import i2.i;
import i2.m;
import i2.n;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u001A2\u00020\u0001:\u0001\u001AB\u001B\u0012\b\b\u0002\u0010\u0003\u001A\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001A\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\r\u001A\u00020\f2\u0006\u0010\t\u001A\u00020\b2\u0006\u0010\u000B\u001A\u00020\nH\u0086@¢\u0006\u0004\b\r\u0010\u000EJI\u0010\u0018\u001A\u0004\u0018\u00010\u00172\u0006\u0010\u0010\u001A\u00020\u000F2\u0006\u0010\u0011\u001A\u00020\n2\u0012\u0010\u0014\u001A\u000E\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u00122\u0012\u0010\u0016\u001A\u000E\u0012\u0004\u0012\u00020\u000F\u0012\u0004\u0012\u00020\u00150\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001B"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "asyncTypefaceCache", "Lkotlin/coroutines/CoroutineContext;", "injectedContext", "<init>", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "Landroidx/compose/ui/text/font/FontFamily;", "family", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "resourceLoader", "", "preload", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/compose/ui/text/font/TypefaceRequest;", "typefaceRequest", "platformFontLoader", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "onAsyncCompletion", "", "createDefaultTypeface", "Landroidx/compose/ui/text/font/TypefaceResult;", "resolve", "(Landroidx/compose/ui/text/font/TypefaceRequest;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/text/font/TypefaceResult;", "Companion", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,432:1\n235#2,3:433\n33#2,4:436\n238#2,2:440\n38#2:442\n240#2:443\n151#2,3:444\n33#2,4:447\n154#2,2:451\n38#2:453\n156#2:454\n461#2,4:455\n33#2,4:459\n465#2,3:463\n38#2:466\n468#2:467\n33#2,6:468\n48#3,4:474\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n72#1:433,3\n72#1:436,4\n72#1:440,2\n72#1:442\n72#1:443\n73#1:444,3\n73#1:447,4\n73#1:451,2\n73#1:453\n73#1:454\n74#1:455,4\n74#1:459,4\n74#1:463,3\n74#1:466\n74#1:467\n78#1:468,6\n159#1:474,4\n*E\n"})
public final class FontListFontFamilyTypefaceAdapter implements FontFamilyTypefaceAdapter {
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001R\u0017\u0010\u0003\u001A\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\b\u001A\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001A\u0004\b\n\u0010\u000B¨\u0006\f"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "Landroidx/compose/ui/text/font/FontMatcher;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "DropExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getDropExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 0x30)
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker0) {
        }

        @NotNull
        public final CoroutineExceptionHandler getDropExceptionHandler() {
            return FontListFontFamilyTypefaceAdapter.d;
        }

        @NotNull
        public final FontMatcher getFontMatcher() {
            return FontListFontFamilyTypefaceAdapter.c;
        }
    }

    public static final int $stable;
    @NotNull
    public static final Companion Companion;
    public final AsyncTypefaceCache a;
    public final CoroutineScope b;
    public static final FontMatcher c;
    public static final FontListFontFamilyTypefaceAdapter.special..inlined.CoroutineExceptionHandler.1 d;

    static {
        FontListFontFamilyTypefaceAdapter.Companion = new Companion(null);
        FontListFontFamilyTypefaceAdapter.$stable = 8;
        FontListFontFamilyTypefaceAdapter.c = new FontMatcher();
        FontListFontFamilyTypefaceAdapter.d = new FontListFontFamilyTypefaceAdapter.special..inlined.CoroutineExceptionHandler.1(CoroutineExceptionHandler.Key);
    }

    public FontListFontFamilyTypefaceAdapter() {
        this(null, null, 3, null);
    }

    public FontListFontFamilyTypefaceAdapter(@NotNull AsyncTypefaceCache asyncTypefaceCache0, @NotNull CoroutineContext coroutineContext0) {
        this.a = asyncTypefaceCache0;
        this.b = CoroutineScopeKt.CoroutineScope(FontListFontFamilyTypefaceAdapter.d.plus(DispatcherKt.getFontCacheManagementDispatcher()).plus(coroutineContext0).plus(SupervisorKt.SupervisorJob(((Job)coroutineContext0.get(Job.Key)))));
    }

    public FontListFontFamilyTypefaceAdapter(AsyncTypefaceCache asyncTypefaceCache0, CoroutineContext coroutineContext0, int v, DefaultConstructorMarker defaultConstructorMarker0) {
        if((v & 1) != 0) {
            asyncTypefaceCache0 = new AsyncTypefaceCache();
        }
        if((v & 2) != 0) {
            coroutineContext0 = EmptyCoroutineContext.INSTANCE;
        }
        this(asyncTypefaceCache0, coroutineContext0);
    }

    @Nullable
    public final Object preload(@NotNull FontFamily fontFamily0, @NotNull PlatformFontLoader platformFontLoader0, @NotNull Continuation continuation0) {
        if(!(fontFamily0 instanceof FontListFontFamily)) {
            return Unit.INSTANCE;
        }
        List list0 = ((FontListFontFamily)fontFamily0).getFonts();
        List list1 = ((FontListFontFamily)fontFamily0).getFonts();
        ArrayList arrayList0 = new ArrayList(list1.size());
        int v = list1.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = list1.get(v1);
            if(FontLoadingStrategy.equals-impl0(((Font)object0).getLoadingStrategy-PKNRLFQ(), 2)) {
                arrayList0.add(object0);
            }
        }
        ArrayList arrayList1 = new ArrayList(arrayList0.size());
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            Font font0 = (Font)arrayList0.get(v3);
            arrayList1.add(TuplesKt.to(font0.getWeight(), FontStyle.box-impl(font0.getStyle-_-LCdwA())));
        }
        HashSet hashSet0 = new HashSet(arrayList1.size());
        ArrayList arrayList2 = new ArrayList(arrayList1.size());
        int v4 = arrayList1.size();
        for(int v5 = 0; v5 < v4; ++v5) {
            Object object1 = arrayList1.get(v5);
            if(hashSet0.add(((Pair)object1))) {
                arrayList2.add(object1);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int v6 = arrayList2.size();
        for(int v7 = 0; v7 < v6; ++v7) {
            Pair pair0 = (Pair)arrayList2.get(v7);
            Object object2 = pair0.component1();
            int v8 = ((FontStyle)pair0.component2()).unbox-impl();
            List list2 = (List)FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(FontListFontFamilyTypefaceAdapter.c.matchFont-RetOiIg(list0, ((FontWeight)object2), v8), new TypefaceRequest(fontFamily0, ((FontWeight)object2), v8, 1, platformFontLoader0.getCacheKey(), null), this.a, platformFontLoader0, i.w).component1();
            if(list2 != null) {
                arrayList3.add(CollectionsKt___CollectionsKt.first(list2));
            }
        }
        Object object3 = CoroutineScopeKt.coroutineScope(new m(arrayList3, this, platformFontLoader0, null), continuation0);
        return object3 == a.getCOROUTINE_SUSPENDED() ? object3 : Unit.INSTANCE;
    }

    @Override  // androidx.compose.ui.text.font.FontFamilyTypefaceAdapter
    @Nullable
    public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest0, @NotNull PlatformFontLoader platformFontLoader0, @NotNull Function1 function10, @NotNull Function1 function11) {
        if(!(typefaceRequest0.getFontFamily() instanceof FontListFontFamily)) {
            return null;
        }
        List list0 = ((FontListFontFamily)typefaceRequest0.getFontFamily()).getFonts();
        Pair pair0 = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(FontListFontFamilyTypefaceAdapter.c.matchFont-RetOiIg(list0, typefaceRequest0.getFontWeight(), typefaceRequest0.getFontStyle-_-LCdwA()), typefaceRequest0, this.a, platformFontLoader0, function11);
        Object object0 = pair0.component1();
        Object object1 = pair0.component2();
        if(((List)object0) == null) {
            return new Immutable(object1, false, 2, null);
        }
        AsyncFontListLoader asyncFontListLoader0 = new AsyncFontListLoader(((List)object0), object1, typefaceRequest0, this.a, function10, platformFontLoader0);
        n n0 = new n(asyncFontListLoader0, null);
        BuildersKt.launch$default(this.b, null, CoroutineStart.UNDISPATCHED, n0, 1, null);
        return new Async(asyncFontListLoader0);
    }
}

