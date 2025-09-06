package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollableDefaults;
import androidx.compose.foundation.layout.Arrangement.Vertical;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Alignment.Horizontal;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import b0.b;
import b0.c;
import b0.d;
import b0.e;
import java.util.List;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u008C\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001Al\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0002\u0010\u0014\u001Av\u0010\u0000\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\n\u001A\u00020\u000B2\b\b\u0002\u0010\f\u001A\u00020\r2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0015\u001A\u00020\t2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0002\u0010\u0016\u001Al\u0010\u0017\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0002\u0010\u001C\u001Av\u0010\u0017\u001A\u00020\u00012\b\b\u0002\u0010\u0002\u001A\u00020\u00032\b\b\u0002\u0010\u0004\u001A\u00020\u00052\b\b\u0002\u0010\u0006\u001A\u00020\u00072\b\b\u0002\u0010\b\u001A\u00020\t2\b\b\u0002\u0010\u0018\u001A\u00020\u00192\b\b\u0002\u0010\u001A\u001A\u00020\u001B2\b\b\u0002\u0010\u000E\u001A\u00020\u000F2\b\b\u0002\u0010\u0015\u001A\u00020\t2\u0017\u0010\u0010\u001A\u0013\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00010\u0011\u00A2\u0006\u0002\b\u0013H\u0007\u00A2\u0006\u0002\u0010\u001D\u001A\u00A9\u0001\u0010\u001E\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0 2%\b\n\u0010!\u001A\u001F\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001A\u001F\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010\'\u001A-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0086\b\u00A2\u0006\u0002\u0010+\u001A\u0082\u0001\u0010\u001E\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0 2%\b\n\u0010!\u001A\u001F\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010\'\u001A-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0087\b\u00A2\u0006\u0002\u0010,\u001A\u00A9\u0001\u0010\u001E\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0-2%\b\n\u0010!\u001A\u001F\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u00112%\b\n\u0010&\u001A\u001F\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0\u001123\b\u0004\u0010\'\u001A-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0086\b\u00A2\u0006\u0002\u0010.\u001A\u0082\u0001\u0010\u001E\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0-2%\b\n\u0010!\u001A\u001F\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010\u001123\b\u0004\u0010\'\u001A-\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u00010(\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0087\b\u00A2\u0006\u0002\u0010/\u001A\u00E8\u0001\u00100\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0 2:\b\n\u0010!\u001A4\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001A4\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010\'\u001AB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0086\b\u00A2\u0006\u0002\u00104\u001A\u00AC\u0001\u00100\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0 2:\b\n\u0010!\u001A4\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010\'\u001AB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0087\b\u00A2\u0006\u0002\u00105\u001A\u00E8\u0001\u00100\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0-2:\b\n\u0010!\u001A4\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2:\b\u0006\u0010&\u001A4\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0006\u0012\u0004\u0018\u00010%0(2H\b\u0004\u0010\'\u001AB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0086\b\u00A2\u0006\u0002\u00106\u001A\u00AC\u0001\u00100\u001A\u00020\u0001\"\u0004\b\u0000\u0010\u001F*\u00020\u00122\f\u0010\u001E\u001A\b\u0012\u0004\u0012\u0002H\u001F0-2:\b\n\u0010!\u001A4\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020%\u0018\u00010(2H\b\u0004\u0010\'\u001AB\u0012\u0004\u0012\u00020)\u0012\u0013\u0012\u001101\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b(2\u0012\u0013\u0012\u0011H\u001F\u00A2\u0006\f\b\"\u0012\b\b#\u0012\u0004\b\b($\u0012\u0004\u0012\u00020\u000103\u00A2\u0006\u0002\b*\u00A2\u0006\u0002\b\u0013H\u0087\b\u00A2\u0006\u0002\u00107\u00A8\u00068"}, d2 = {"LazyColumn", "", "modifier", "Landroidx/compose/ui/Modifier;", "state", "Landroidx/compose/foundation/lazy/LazyListState;", "contentPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "reverseLayout", "", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Vertical;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Horizontal;", "flingBehavior", "Landroidx/compose/foundation/gestures/FlingBehavior;", "content", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/LazyListScope;", "Lkotlin/ExtensionFunctionType;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "userScrollEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Vertical;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "LazyRow", "horizontalArrangement", "Landroidx/compose/foundation/layout/Arrangement$Horizontal;", "verticalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/layout/Arrangement$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/FlingBehavior;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "items", "T", "", "key", "Lkotlin/ParameterName;", "name", "item", "", "contentType", "itemContent", "Lkotlin/Function2;", "Landroidx/compose/foundation/lazy/LazyItemScope;", "Landroidx/compose/runtime/Composable;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "itemsIndexed", "", "index", "Lkotlin/Function3;", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;[Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "(Landroidx/compose/foundation/lazy/LazyListScope;Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function5;)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,433:1\n143#1,12:434\n179#1,12:446\n215#1,12:458\n251#1,12:470\n148#2:482\n148#2:483\n148#2:484\n148#2:485\n*S KotlinDebug\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt\n*L\n161#1:434,12\n197#1:446,12\n233#1:458,12\n269#1:470,12\n303#1:482\n359#1:483\n387#1:484\n413#1:485\n*E\n"})
public final class LazyDslKt {
    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final void LazyColumn(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, Vertical arrangement$Vertical0, Horizontal alignment$Horizontal0, FlingBehavior flingBehavior0, Function1 function10, Composer composer0, int v, int v1) {
        FlingBehavior flingBehavior1;
        Horizontal alignment$Horizontal2;
        boolean z2;
        PaddingValues paddingValues2;
        Modifier modifier1;
        Modifier modifier3;
        boolean z3;
        FlingBehavior flingBehavior2;
        Horizontal alignment$Horizontal1;
        int v4;
        Vertical arrangement$Vertical1;
        boolean z1;
        PaddingValues paddingValues1;
        int v3;
        LazyListState lazyListState1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0xDE6BE73B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            if((v1 & 2) == 0) {
                lazyListState1 = lazyListState0;
                v3 = composer1.changed(lazyListState1) ? 0x20 : 16;
            }
            else {
                lazyListState1 = lazyListState0;
                v3 = 16;
            }
            v2 |= v3;
        }
        else {
            lazyListState1 = lazyListState0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            paddingValues1 = paddingValues0;
        }
        else if((v & 0x180) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.changed(paddingValues1) ? 0x100 : 0x80);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                arrangement$Vertical1 = arrangement$Vertical0;
                v4 = composer1.changed(arrangement$Vertical1) ? 0x4000 : 0x2000;
            }
            else {
                arrangement$Vertical1 = arrangement$Vertical0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            arrangement$Vertical1 = arrangement$Vertical0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            alignment$Horizontal1 = alignment$Horizontal0;
        }
        else if((0x30000 & v) == 0) {
            alignment$Horizontal1 = alignment$Horizontal0;
            v2 |= (composer1.changed(alignment$Horizontal1) ? 0x20000 : 0x10000);
        }
        else {
            alignment$Horizontal1 = alignment$Horizontal0;
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                modifier0 = modifier2;
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                    lazyListState1 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
                }
                if((v1 & 4) != 0) {
                    paddingValues1 = PaddingKt.PaddingValues-0680j_4(0.0f);
                }
                if((v1 & 8) != 0) {
                    z1 = false;
                }
                if((v1 & 16) != 0) {
                    arrangement$Vertical1 = z1 ? Arrangement.INSTANCE.getBottom() : Arrangement.INSTANCE.getTop();
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    alignment$Horizontal1 = Alignment.Companion.getStart();
                }
                if((v1 & 0x40) == 0) {
                label_107:
                    modifier3 = modifier0;
                    z3 = z1;
                    alignment$Horizontal2 = alignment$Horizontal1;
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    z3 = z1;
                    alignment$Horizontal2 = alignment$Horizontal1;
                    modifier3 = modifier0;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                goto label_107;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0xDE6BE73B, v2, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:393)");
            }
            LazyDslKt.LazyColumn(modifier3, lazyListState1, paddingValues1, z3, arrangement$Vertical1, alignment$Horizontal2, flingBehavior2, true, function10, composer1, v2 & 14 | 0xC00000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2 | v2 << 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues2 = paddingValues1;
            flingBehavior1 = flingBehavior2;
            z2 = z3;
            modifier1 = modifier3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            paddingValues2 = paddingValues1;
            z2 = z1;
            alignment$Horizontal2 = alignment$Horizontal1;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new c(modifier1, lazyListState1, paddingValues2, z2, arrangement$Vertical1, alignment$Horizontal2, flingBehavior1, function10, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyColumn(@Nullable Modifier modifier0, @Nullable LazyListState lazyListState0, @Nullable PaddingValues paddingValues0, boolean z, @Nullable Vertical arrangement$Vertical0, @Nullable Horizontal alignment$Horizontal0, @Nullable FlingBehavior flingBehavior0, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        boolean z3;
        FlingBehavior flingBehavior1;
        Horizontal alignment$Horizontal1;
        Vertical arrangement$Vertical1;
        boolean z2;
        PaddingValues paddingValues1;
        LazyListState lazyListState1;
        Modifier modifier1;
        FlingBehavior flingBehavior2;
        Vertical arrangement$Vertical2;
        boolean z5;
        boolean z4;
        int v2;
        Composer composer1 = composer0.startRestartGroup(-740714857);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(lazyListState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(arrangement$Vertical0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(alignment$Horizontal0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                z5 = false;
                if((v1 & 2) == 0) {
                    lazyListState1 = lazyListState0;
                }
                else {
                    lazyListState1 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
                    v2 &= 0xFFFFFF8F;
                }
                paddingValues1 = (v1 & 4) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 8) == 0) {
                    z5 = z;
                }
                if((v1 & 16) == 0) {
                    arrangement$Vertical2 = arrangement$Vertical0;
                }
                else {
                    arrangement$Vertical2 = z5 ? Arrangement.INSTANCE.getBottom() : Arrangement.INSTANCE.getTop();
                    v2 &= 0xFFFF1FFF;
                }
                alignment$Horizontal1 = (v1 & 0x20) == 0 ? alignment$Horizontal0 : Alignment.Companion.getStart();
                if((v1 & 0x40) == 0) {
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                z4 = (v1 & 0x80) == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                lazyListState1 = lazyListState0;
                z4 = z1;
                paddingValues1 = paddingValues0;
                z5 = z;
                arrangement$Vertical2 = arrangement$Vertical0;
                alignment$Horizontal1 = alignment$Horizontal0;
                flingBehavior2 = flingBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-740714857, v2, -1, "androidx.compose.foundation.lazy.LazyColumn (LazyDsl.kt:366)");
            }
            LazyListKt.LazyList(modifier1, lazyListState1, paddingValues1, z5, true, flingBehavior2, z4, 0, alignment$Horizontal1, arrangement$Vertical2, null, null, function10, composer1, v2 & 14 | 0x6000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0x70000 & v2 >> 3 | v2 >> 3 & 0x380000 | v2 << 9 & 0xE000000 | v2 << 15 & 0x70000000, v2 >> 18 & 0x380, 3200);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z5;
            arrangement$Vertical1 = arrangement$Vertical2;
            flingBehavior1 = flingBehavior2;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            lazyListState1 = lazyListState0;
            paddingValues1 = paddingValues0;
            z2 = z;
            arrangement$Vertical1 = arrangement$Vertical0;
            alignment$Horizontal1 = alignment$Horizontal0;
            flingBehavior1 = flingBehavior0;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new b(modifier1, lazyListState1, paddingValues1, z2, arrangement$Vertical1, alignment$Horizontal1, flingBehavior1, z3, function10, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final void LazyRow(Modifier modifier0, LazyListState lazyListState0, PaddingValues paddingValues0, boolean z, androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, androidx.compose.ui.Alignment.Vertical alignment$Vertical0, FlingBehavior flingBehavior0, Function1 function10, Composer composer0, int v, int v1) {
        FlingBehavior flingBehavior1;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical2;
        boolean z2;
        PaddingValues paddingValues2;
        Modifier modifier1;
        Modifier modifier3;
        boolean z3;
        FlingBehavior flingBehavior2;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        int v4;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        boolean z1;
        PaddingValues paddingValues1;
        int v3;
        LazyListState lazyListState1;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x185083DF);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            if((v1 & 2) == 0) {
                lazyListState1 = lazyListState0;
                v3 = composer1.changed(lazyListState1) ? 0x20 : 16;
            }
            else {
                lazyListState1 = lazyListState0;
                v3 = 16;
            }
            v2 |= v3;
        }
        else {
            lazyListState1 = lazyListState0;
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
            paddingValues1 = paddingValues0;
        }
        else if((v & 0x180) == 0) {
            paddingValues1 = paddingValues0;
            v2 |= (composer1.changed(paddingValues1) ? 0x100 : 0x80);
        }
        else {
            paddingValues1 = paddingValues0;
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
            z1 = z;
        }
        else if((v & 0xC00) == 0) {
            z1 = z;
            v2 |= (composer1.changed(z1) ? 0x800 : 0x400);
        }
        else {
            z1 = z;
        }
        if((v & 0x6000) == 0) {
            if((v1 & 16) == 0) {
                arrangement$Horizontal1 = arrangement$Horizontal0;
                v4 = composer1.changed(arrangement$Horizontal1) ? 0x4000 : 0x2000;
            }
            else {
                arrangement$Horizontal1 = arrangement$Horizontal0;
                v4 = 0x2000;
            }
            v2 |= v4;
        }
        else {
            arrangement$Horizontal1 = arrangement$Horizontal0;
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
            alignment$Vertical1 = alignment$Vertical0;
        }
        else if((0x30000 & v) == 0) {
            alignment$Vertical1 = alignment$Vertical0;
            v2 |= (composer1.changed(alignment$Vertical1) ? 0x20000 : 0x10000);
        }
        else {
            alignment$Vertical1 = alignment$Vertical0;
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x800000 : 0x400000);
        }
        if((v2 & 0x492493) != 4793490 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                Modifier modifier2 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                modifier0 = modifier2;
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                    lazyListState1 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
                }
                if((v1 & 4) != 0) {
                    paddingValues1 = PaddingKt.PaddingValues-0680j_4(0.0f);
                }
                if((v1 & 8) != 0) {
                    z1 = false;
                }
                if((v1 & 16) != 0) {
                    arrangement$Horizontal1 = z1 ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart();
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x20) != 0) {
                    alignment$Vertical1 = Alignment.Companion.getTop();
                }
                if((v1 & 0x40) == 0) {
                label_107:
                    modifier3 = modifier0;
                    z3 = z1;
                    alignment$Vertical2 = alignment$Vertical1;
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    v2 &= 0xFFC7FFFF;
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    z3 = z1;
                    alignment$Vertical2 = alignment$Vertical1;
                    modifier3 = modifier0;
                }
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                goto label_107;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x185083DF, v2, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:419)");
            }
            LazyDslKt.LazyRow(modifier3, lazyListState1, paddingValues1, z3, arrangement$Horizontal1, alignment$Vertical2, flingBehavior2, true, function10, composer1, v2 & 14 | 0xC00000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0xE000 & v2 | 0x70000 & v2 | 0x380000 & v2 | v2 << 3 & 0xE000000, 0);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            paddingValues2 = paddingValues1;
            flingBehavior1 = flingBehavior2;
            z2 = z3;
            modifier1 = modifier3;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            paddingValues2 = paddingValues1;
            z2 = z1;
            alignment$Vertical2 = alignment$Vertical1;
            flingBehavior1 = flingBehavior0;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new e(modifier1, lazyListState1, paddingValues2, z2, arrangement$Horizontal1, alignment$Vertical2, flingBehavior1, function10, v, v1));
        }
    }

    @Composable
    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    public static final void LazyRow(@Nullable Modifier modifier0, @Nullable LazyListState lazyListState0, @Nullable PaddingValues paddingValues0, boolean z, @Nullable androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal0, @Nullable androidx.compose.ui.Alignment.Vertical alignment$Vertical0, @Nullable FlingBehavior flingBehavior0, boolean z1, @NotNull Function1 function10, @Nullable Composer composer0, int v, int v1) {
        boolean z3;
        FlingBehavior flingBehavior1;
        androidx.compose.ui.Alignment.Vertical alignment$Vertical1;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal1;
        boolean z2;
        PaddingValues paddingValues1;
        LazyListState lazyListState1;
        Modifier modifier1;
        FlingBehavior flingBehavior2;
        androidx.compose.foundation.layout.Arrangement.Horizontal arrangement$Horizontal2;
        boolean z5;
        boolean z4;
        int v2;
        Composer composer1 = composer0.startRestartGroup(0x99394F3B);
        if((v1 & 1) == 0) {
            v2 = (v & 6) == 0 ? (composer1.changed(modifier0) ? 4 : 2) | v : v;
        }
        else {
            v2 = v | 6;
        }
        if((v & 0x30) == 0) {
            v2 |= ((v1 & 2) != 0 || !composer1.changed(lazyListState0) ? 16 : 0x20);
        }
        if((v1 & 4) != 0) {
            v2 |= 0x180;
        }
        else if((v & 0x180) == 0) {
            v2 |= (composer1.changed(paddingValues0) ? 0x100 : 0x80);
        }
        if((v1 & 8) != 0) {
            v2 |= 0xC00;
        }
        else if((v & 0xC00) == 0) {
            v2 |= (composer1.changed(z) ? 0x800 : 0x400);
        }
        if((v & 0x6000) == 0) {
            v2 |= ((v1 & 16) != 0 || !composer1.changed(arrangement$Horizontal0) ? 0x2000 : 0x4000);
        }
        if((v1 & 0x20) != 0) {
            v2 |= 0x30000;
        }
        else if((0x30000 & v) == 0) {
            v2 |= (composer1.changed(alignment$Vertical0) ? 0x20000 : 0x10000);
        }
        if((0x180000 & v) == 0) {
            v2 |= ((v1 & 0x40) != 0 || !composer1.changed(flingBehavior0) ? 0x80000 : 0x100000);
        }
        if((v1 & 0x80) != 0) {
            v2 |= 0xC00000;
        }
        else if((v & 0xC00000) == 0) {
            v2 |= (composer1.changed(z1) ? 0x800000 : 0x400000);
        }
        if((v1 & 0x100) != 0) {
            v2 |= 0x6000000;
        }
        else if((v & 0x6000000) == 0) {
            v2 |= (composer1.changedInstance(function10) ? 0x4000000 : 0x2000000);
        }
        if((v2 & 0x2492493) != 0x2492492 || !composer1.getSkipping()) {
            composer1.startDefaults();
            if((v & 1) == 0 || composer1.getDefaultsInvalid()) {
                modifier1 = (v1 & 1) == 0 ? modifier0 : Modifier.Companion;
                z5 = false;
                if((v1 & 2) == 0) {
                    lazyListState1 = lazyListState0;
                }
                else {
                    lazyListState1 = LazyListStateKt.rememberLazyListState(0, 0, composer1, 0, 3);
                    v2 &= 0xFFFFFF8F;
                }
                paddingValues1 = (v1 & 4) == 0 ? paddingValues0 : PaddingKt.PaddingValues-0680j_4(0.0f);
                if((v1 & 8) == 0) {
                    z5 = z;
                }
                if((v1 & 16) == 0) {
                    arrangement$Horizontal2 = arrangement$Horizontal0;
                }
                else {
                    arrangement$Horizontal2 = z5 ? Arrangement.INSTANCE.getEnd() : Arrangement.INSTANCE.getStart();
                    v2 &= 0xFFFF1FFF;
                }
                alignment$Vertical1 = (v1 & 0x20) == 0 ? alignment$Vertical0 : Alignment.Companion.getTop();
                if((v1 & 0x40) == 0) {
                    flingBehavior2 = flingBehavior0;
                }
                else {
                    flingBehavior2 = ScrollableDefaults.INSTANCE.flingBehavior(composer1, 6);
                    v2 &= 0xFFC7FFFF;
                }
                z4 = (v1 & 0x80) == 0 ? z1 : true;
            }
            else {
                composer1.skipToGroupEnd();
                if((v1 & 2) != 0) {
                    v2 &= 0xFFFFFF8F;
                }
                if((v1 & 16) != 0) {
                    v2 &= 0xFFFF1FFF;
                }
                if((v1 & 0x40) != 0) {
                    v2 &= 0xFFC7FFFF;
                }
                modifier1 = modifier0;
                lazyListState1 = lazyListState0;
                z4 = z1;
                paddingValues1 = paddingValues0;
                z5 = z;
                arrangement$Horizontal2 = arrangement$Horizontal0;
                alignment$Vertical1 = alignment$Vertical0;
                flingBehavior2 = flingBehavior0;
            }
            composer1.endDefaults();
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(0x99394F3B, v2, -1, "androidx.compose.foundation.lazy.LazyRow (LazyDsl.kt:310)");
            }
            LazyListKt.LazyList(modifier1, lazyListState1, paddingValues1, z5, false, flingBehavior2, z4, 0, null, null, alignment$Vertical1, arrangement$Horizontal2, function10, composer1, v2 & 14 | 0x6000 | v2 & 0x70 | v2 & 0x380 | v2 & 0x1C00 | 0x70000 & v2 >> 3 | v2 >> 3 & 0x380000, v2 >> 15 & 14 | v2 >> 9 & 0x70 | v2 >> 18 & 0x380, 0x380);
            if(ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            z2 = z5;
            arrangement$Horizontal1 = arrangement$Horizontal2;
            flingBehavior1 = flingBehavior2;
            z3 = z4;
        }
        else {
            composer1.skipToGroupEnd();
            modifier1 = modifier0;
            lazyListState1 = lazyListState0;
            paddingValues1 = paddingValues0;
            z2 = z;
            arrangement$Horizontal1 = arrangement$Horizontal0;
            alignment$Vertical1 = alignment$Vertical0;
            flingBehavior1 = flingBehavior0;
            z3 = z1;
        }
        ScopeUpdateScope scopeUpdateScope0 = composer1.endRestartGroup();
        if(scopeUpdateScope0 != null) {
            scopeUpdateScope0.updateScope(new d(modifier1, lazyListState1, paddingValues1, z2, arrangement$Horizontal1, alignment$Vertical1, flingBehavior1, z3, function10, v, v1));
        }
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void items(@NotNull LazyListScope lazyListScope0, @NotNull List list0, @Nullable Function1 function10, @NotNull Function1 function11, @NotNull Function4 function40) {
        lazyListScope0.items(list0.size(), (function10 == null ? null : new Function1(function10, list0) {
            public final Function1 w;
            public final List x;

            {
                this.w = function10;
                this.x = list0;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }), new Function1(function11, list0) {
            public final Function1 w;
            public final List x;

            {
                this.w = function10;
                this.x = list0;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new Function4(function40, list0) {
            public final Function4 w;
            public final List x;

            {
                this.w = function40;
                this.x = list0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xDA480CDF, v2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:152)");
                }
                Object object0 = this.x.get(v);
                this.w.invoke(lazyItemScope0, object0, composer0, ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final void items(LazyListScope lazyListScope0, List list0, Function1 function10, Function4 function40) {
        lazyListScope0.items(list0.size(), (function10 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.items.2(function10, list0)), new androidx.compose.foundation.lazy.LazyDslKt.items.3(androidx.compose.foundation.lazy.LazyDslKt.items.1.INSTANCE, list0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new androidx.compose.foundation.lazy.LazyDslKt.items.4(function40, list0)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void items(@NotNull LazyListScope lazyListScope0, @NotNull Object[] arr_object, @Nullable Function1 function10, @NotNull Function1 function11, @NotNull Function4 function40) {
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = function10 == null ? null : new Function1(function10, arr_object) {
            public final Function1 w;
            public final Object[] x;

            {
                this.w = function10;
                this.x = arr_object;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                return this.w.invoke(this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new Function1(function11, arr_object) {
            public final Function1 w;
            public final Object[] x;

            {
                this.w = function10;
                this.x = arr_object;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                return this.w.invoke(this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new Function4(function40, arr_object) {
            public final Function4 w;
            public final Object[] x;

            {
                this.w = function40;
                this.x = arr_object;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1043393750, v2, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:224)");
                }
                this.w.invoke(lazyItemScope0, this.x[v], composer0, ((int)(v2 & 14)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        lazyListScope0.items(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final void items(LazyListScope lazyListScope0, Object[] arr_object, Function1 function10, Function4 function40) {
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = function10 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.items.6(function10, arr_object);
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new androidx.compose.foundation.lazy.LazyDslKt.items.7(androidx.compose.foundation.lazy.LazyDslKt.items.5.INSTANCE, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt.items.8(function40, arr_object));
        lazyListScope0.items(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);
    }

    public static void items$default(LazyListScope lazyListScope0, List list0, Function1 function10, Function1 function11, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.2 lazyDslKt$items$20 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.LazyDslKt.items.1.INSTANCE;
        }
        int v1 = list0.size();
        if(function10 != null) {
            lazyDslKt$items$20 = new androidx.compose.foundation.lazy.LazyDslKt.items.2(function10, list0);
        }
        lazyListScope0.items(v1, lazyDslKt$items$20, new androidx.compose.foundation.lazy.LazyDslKt.items.3(function11, list0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new androidx.compose.foundation.lazy.LazyDslKt.items.4(function40, list0)));

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$1\n*L\n1#1,433:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.items.1 extends Lambda implements Function1 {
            public static final androidx.compose.foundation.lazy.LazyDslKt.items.1 INSTANCE;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.items.1.INSTANCE = new androidx.compose.foundation.lazy.LazyDslKt.items.1();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.items.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }

            @Nullable
            public final Void invoke(Object object0) [...] // Inlined contents
        }

    }

    public static void items$default(LazyListScope lazyListScope0, List list0, Function1 function10, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.2 lazyDslKt$items$20 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        androidx.compose.foundation.lazy.LazyDslKt.items.1 lazyDslKt$items$10 = androidx.compose.foundation.lazy.LazyDslKt.items.1.INSTANCE;
        int v1 = list0.size();
        if(function10 != null) {
            lazyDslKt$items$20 = new androidx.compose.foundation.lazy.LazyDslKt.items.2(function10, list0);
        }
        lazyListScope0.items(v1, lazyDslKt$items$20, new androidx.compose.foundation.lazy.LazyDslKt.items.3(lazyDslKt$items$10, list0), ComposableLambdaKt.composableLambdaInstance(0xDA480CDF, true, new androidx.compose.foundation.lazy.LazyDslKt.items.4(function40, list0)));
    }

    public static void items$default(LazyListScope lazyListScope0, Object[] arr_object, Function1 function10, Function1 function11, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        if((v & 4) != 0) {
            function11 = androidx.compose.foundation.lazy.LazyDslKt.items.5.INSTANCE;
        }
        if(function10 != null) {
            lazyDslKt$items$60 = new androidx.compose.foundation.lazy.LazyDslKt.items.6(function10, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new androidx.compose.foundation.lazy.LazyDslKt.items.7(function11, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt.items.8(function40, arr_object));
        lazyListScope0.items(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);

        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "T", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$items$5\n*L\n1#1,433:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.items.5 extends Lambda implements Function1 {
            public static final androidx.compose.foundation.lazy.LazyDslKt.items.5 INSTANCE;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.items.5.INSTANCE = new androidx.compose.foundation.lazy.LazyDslKt.items.5();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.items.5() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return null;
            }

            @Nullable
            public final Void invoke(Object object0) [...] // Inlined contents
        }

    }

    public static void items$default(LazyListScope lazyListScope0, Object[] arr_object, Function1 function10, Function4 function40, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.items.6 lazyDslKt$items$60 = null;
        if((v & 2) != 0) {
            function10 = null;
        }
        androidx.compose.foundation.lazy.LazyDslKt.items.5 lazyDslKt$items$50 = androidx.compose.foundation.lazy.LazyDslKt.items.5.INSTANCE;
        if(function10 != null) {
            lazyDslKt$items$60 = new androidx.compose.foundation.lazy.LazyDslKt.items.6(function10, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.items.7 lazyDslKt$items$70 = new androidx.compose.foundation.lazy.LazyDslKt.items.7(lazyDslKt$items$50, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new androidx.compose.foundation.lazy.LazyDslKt.items.8(function40, arr_object));
        lazyListScope0.items(arr_object.length, lazyDslKt$items$60, lazyDslKt$items$70, composableLambda0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void itemsIndexed(@NotNull LazyListScope lazyListScope0, @NotNull List list0, @Nullable Function2 function20, @NotNull Function2 function21, @NotNull Function5 function50) {
        lazyListScope0.items(list0.size(), (function20 == null ? null : new Function1(function20, list0) {
            public final Function2 w;
            public final List x;

            {
                this.w = function20;
                this.x = list0;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }), new Function1(function21, list0) {
            public final Function2 w;
            public final List x;

            {
                this.w = function20;
                this.x = list0;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                Object object0 = this.x.get(v);
                return this.w.invoke(v, object0);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new Function4(function50, list0) {
            public final Function5 w;
            public final List x;

            {
                this.w = function50;
                this.x = list0;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xBEF78951, v2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:188)");
                }
                Object object0 = this.x.get(v);
                this.w.invoke(lazyItemScope0, v, object0, composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final void itemsIndexed(LazyListScope lazyListScope0, List list0, Function2 function20, Function5 function50) {
        lazyListScope0.items(list0.size(), (function20 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2(function20, list0)), new Function1(list0) {
            public final List w;

            {
                this.w = list0;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                this.w.get(v);
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        }, ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.4(function50, list0)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void itemsIndexed(@NotNull LazyListScope lazyListScope0, @NotNull Object[] arr_object, @Nullable Function2 function20, @NotNull Function2 function21, @NotNull Function5 function50) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = function20 == null ? null : new Function1(function20, arr_object) {
            public final Function2 w;
            public final Object[] x;

            {
                this.w = function20;
                this.x = arr_object;
                super(1);
            }

            @NotNull
            public final Object invoke(int v) {
                return this.w.invoke(v, this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.7 lazyDslKt$itemsIndexed$70 = new Function1(function21, arr_object) {
            public final Function2 w;
            public final Object[] x;

            {
                this.w = function20;
                this.x = arr_object;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                return this.w.invoke(v, this.x[v]);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(1600639390, true, new Function4(function50, arr_object) {
            public final Function5 w;
            public final Object[] x;

            {
                this.w = function50;
                this.x = arr_object;
                super(4);
            }

            @Override  // kotlin.jvm.functions.Function4
            public Object invoke(Object object0, Object object1, Object object2, Object object3) {
                this.invoke(((LazyItemScope)object0), ((Number)object1).intValue(), ((Composer)object2), ((Number)object3).intValue());
                return Unit.INSTANCE;
            }

            @Composable
            public final void invoke(@NotNull LazyItemScope lazyItemScope0, int v, @Nullable Composer composer0, int v1) {
                int v2 = (v1 & 6) == 0 ? (composer0.changed(lazyItemScope0) ? 4 : 2) | v1 : v1;
                if((v1 & 0x30) == 0) {
                    v2 |= (composer0.changed(v) ? 0x20 : 16);
                }
                if((v2 & 0x93) == 0x92 && composer0.getSkipping()) {
                    composer0.skipToGroupEnd();
                    return;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1600639390, v2, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:260)");
                }
                this.w.invoke(lazyItemScope0, v, this.x[v], composer0, ((int)(v2 & 0x7E)));
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
        lazyListScope0.items(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$70, composableLambda0);
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Use the non deprecated overload")
    public static final void itemsIndexed(LazyListScope lazyListScope0, Object[] arr_object, Function2 function20, Function5 function50) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = function20 == null ? null : new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6(function20, arr_object);
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.2 lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20 = new Function1(arr_object) {
            public final Object[] w;

            {
                this.w = arr_object;
                super(1);
            }

            @Nullable
            public final Object invoke(int v) {
                Object object0 = this.w[v];
                return null;
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((Number)object0).intValue());
            }
        };
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.8(function50, arr_object));
        lazyListScope0.items(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20, composableLambda0);
    }

    public static void itemsIndexed$default(LazyListScope lazyListScope0, List list0, Function2 function20, Function2 function21, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2 lazyDslKt$itemsIndexed$20 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if((v & 4) != 0) {
            function21 = androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1.INSTANCE;
        }
        int v1 = list0.size();
        if(function20 != null) {
            lazyDslKt$itemsIndexed$20 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2(function20, list0);
        }
        lazyListScope0.items(v1, lazyDslKt$itemsIndexed$20, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.3(function21, list0), ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.4(function50, list0)));

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$1\n*L\n1#1,433:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1 extends Lambda implements Function2 {
            public static final androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1 INSTANCE;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1.INSTANCE = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.1() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Number)object0).intValue(), object1);
            }

            @Nullable
            public final Void invoke(int v, Object object0) {
                return null;
            }
        }

    }

    public static void itemsIndexed$default(LazyListScope lazyListScope0, List list0, Function2 function20, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2 lazyDslKt$itemsIndexed$20 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        int v1 = list0.size();
        if(function20 != null) {
            lazyDslKt$itemsIndexed$20 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.2(function20, list0);
        }
        lazyListScope0.items(v1, lazyDslKt$itemsIndexed$20, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.1(list0), ComposableLambdaKt.composableLambdaInstance(0xBEF78951, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.4(function50, list0)));
    }

    public static void itemsIndexed$default(LazyListScope lazyListScope0, Object[] arr_object, Function2 function20, Function2 function21, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if((v & 4) != 0) {
            function21 = androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5.INSTANCE;
        }
        if(function20 != null) {
            lazyDslKt$itemsIndexed$60 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6(function20, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.7 lazyDslKt$itemsIndexed$70 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.7(function21, arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.8(function50, arr_object));
        lazyListScope0.items(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$70, composableLambda0);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0000\u001A\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001A\u00020\u00042\u0006\u0010\u0005\u001A\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "T", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "invoke", "(ILjava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {1, 8, 0}, xi = 0xB0)
        @SourceDebugExtension({"SMAP\nLazyDsl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyDsl.kt\nandroidx/compose/foundation/lazy/LazyDslKt$itemsIndexed$5\n*L\n1#1,433:1\n*E\n"})
        public final class androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5 extends Lambda implements Function2 {
            public static final androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5 INSTANCE;

            static {
                androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5.INSTANCE = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5();
            }

            public androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.5() {
                super(2);
            }

            @Override  // kotlin.jvm.functions.Function2
            public Object invoke(Object object0, Object object1) {
                return this.invoke(((Number)object0).intValue(), object1);
            }

            @Nullable
            public final Void invoke(int v, Object object0) {
                return null;
            }
        }

    }

    public static void itemsIndexed$default(LazyListScope lazyListScope0, Object[] arr_object, Function2 function20, Function5 function50, int v, Object object0) {
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6 lazyDslKt$itemsIndexed$60 = null;
        if((v & 2) != 0) {
            function20 = null;
        }
        if(function20 != null) {
            lazyDslKt$itemsIndexed$60 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.6(function20, arr_object);
        }
        androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.2 lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20 = new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed..inlined.itemsIndexed.default.2(arr_object);
        ComposableLambda composableLambda0 = ComposableLambdaKt.composableLambdaInstance(1600639390, true, new androidx.compose.foundation.lazy.LazyDslKt.itemsIndexed.8(function50, arr_object));
        lazyListScope0.items(arr_object.length, lazyDslKt$itemsIndexed$60, lazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$20, composableLambda0);
    }
}

