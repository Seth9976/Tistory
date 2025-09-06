package androidx.compose.material3;

import androidx.compose.material.ContentAlpha;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.MaterialTheme;
import androidx.compose.material.MaterialTheme_androidKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaverScope;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map.Entry;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.io.OnErrorAction;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p0.q4;
import wd.n;

public final class ni extends Lambda implements Function2 {
    public final int w;
    public final Function2 x;

    public ni(Function2 function20, int v) {
        this.w = v;
        this.x = function20;
        super(2);
    }

    @Override  // kotlin.jvm.functions.Function2
    public final Object invoke(Object object0, Object object1) {
        switch(this.w) {
            case 0: {
                int v = ((Number)object1).intValue();
                if((v & 3) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x800FF2D1, v, -1, "androidx.compose.material3.ScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (Scaffold.kt:209)");
                }
                this.x.invoke(((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 1: {
                int v1 = ((Number)object1).intValue();
                if((v1 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-183007468, v1, -1, "com.kakao.kandinsky.designsystem.theme.KandinskyTheme.<anonymous> (Theme.kt:16)");
                }
                ProvidedValue[] arr_providedValue = (ProvidedValue[])CollectionsKt__CollectionsKt.listOfNotNull(CompositionLocalsKt.getLocalDensity().provides(DensityKt.Density(((Density)((Composer)object0).consume(CompositionLocalsKt.getLocalDensity())).getDensity(), 1.0f))).toArray(new ProvidedValue[0]);
                CompositionLocalKt.CompositionLocalProvider(((ProvidedValue[])Arrays.copyOf(arr_providedValue, arr_providedValue.length)), this.x, ((Composer)object0), ProvidedValue.$stable);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 2: {
                List list0 = (List)this.x.invoke(((SaverScope)object0), object1);
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    Object object2 = list0.get(v3);
                    if(object2 != null && !((SaverScope)object0).canBeSaved(object2)) {
                        throw new IllegalArgumentException("item can\'t be saved");
                    }
                }
                return !list0.isEmpty() ? new ArrayList(list0) : null;
            }
            case 3: {
                ArrayList arrayList0 = new ArrayList();
                for(Object object3: ((Map)this.x.invoke(((SaverScope)object0), object1)).entrySet()) {
                    arrayList0.add(((Map.Entry)object3).getKey());
                    arrayList0.add(((Map.Entry)object3).getValue());
                }
                return arrayList0;
            }
            case 4: {
                this.x.invoke(((Number)object0).intValue(), ((Number)object1).intValue());
                return Unit.INSTANCE;
            }
            case 5: {
                this.x.invoke(((Number)object0).intValue(), object1);
                return object1;
            }
            case 6: {
                int v4 = ((Number)object1).intValue();
                if((v4 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x2DE7CEA0, v4, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:65)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getSubtitle1(), this.x, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 7: {
                int v5 = ((Number)object1).intValue();
                if((v5 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x24F609E0, v5, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:64)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getHigh(((Composer)object0), 6)), ComposableLambdaKt.composableLambda(((Composer)object0), 0x2DE7CEA0, true, new ni(this.x, 6)), ((Composer)object0), ProvidedValue.$stable | 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 8: {
                int v6 = ((Number)object1).intValue();
                if((v6 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x7E1E62FF, v6, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:75)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getBody2(), this.x, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 9: {
                int v7 = ((Number)object1).intValue();
                if((v7 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x752C9E3F, v7, -1, "androidx.compose.material.AlertDialogContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AlertDialog.kt:72)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getMedium(((Composer)object0), 6)), ComposableLambdaKt.composableLambda(((Composer)object0), 0x7E1E62FF, true, new ni(this.x, 8)), ((Composer)object0), ProvidedValue.$stable | 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 10: {
                int v8 = ((Number)object1).intValue();
                if((v8 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1654084516, v8, -1, "androidx.compose.material.TopAppBar.<anonymous>.<anonymous>.<anonymous> (AppBar.kt:121)");
                }
                CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(ContentAlpha.INSTANCE.getHigh(((Composer)object0), 6)), this.x, ((Composer)object0), ProvidedValue.$stable);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 11: {
                int v9 = ((Number)object1).intValue();
                if((v9 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0x6F544777, v9, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:99)");
                }
                TextKt.ProvideTextStyle(MaterialTheme.INSTANCE.getTypography(((Composer)object0), 6).getButton(), ComposableLambdaKt.composableLambda(((Composer)object0), 0xA28B86E8, true, new q4(this.x)), ((Composer)object0), 0x30);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            case 12: {
                int v10 = ((Number)object1).intValue();
                if((v10 & 11) == 2 && ((Composer)object0).getSkipping()) {
                    ((Composer)object0).skipToGroupEnd();
                    return Unit.INSTANCE;
                }
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(0xAD0597A, v10, -1, "androidx.compose.material.MaterialTheme.<anonymous>.<anonymous> (MaterialTheme.kt:81)");
                }
                MaterialTheme_androidKt.PlatformMaterialTheme(this.x, ((Composer)object0), 0);
                if(ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                return Unit.INSTANCE;
            }
            default: {
                Intrinsics.checkNotNullParameter(((File)object0), "f");
                Intrinsics.checkNotNullParameter(((IOException)object1), "e");
                if(this.x.invoke(((File)object0), ((IOException)object1)) != OnErrorAction.TERMINATE) {
                    return Unit.INSTANCE;
                }
                Intrinsics.checkNotNullParameter(((File)object0), "file");
                throw new n(((File)object0), null, null, 6, null);  // 初始化器: Lkotlin/io/FileSystemException;-><init>(Ljava/io/File;Ljava/io/File;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
            }
        }
    }
}

