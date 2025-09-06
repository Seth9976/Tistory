package androidx.compose.material.internal;

import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable.PlacementScope;
import androidx.compose.ui.layout.Placeable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001A\u00020\u0001*\u00020\u00022\f\u0010\u0003\u001A\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001A\u00020\u0007H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"<anonymous>", "Landroidx/compose/ui/layout/MeasureResult;", "Landroidx/compose/ui/layout/MeasureScope;", "measurables", "", "Landroidx/compose/ui/layout/Measurable;", "constraints", "Landroidx/compose/ui/unit/Constraints;", "measure-3p2s80s", "(Landroidx/compose/ui/layout/MeasureScope;Ljava/util/List;J)Landroidx/compose/ui/layout/MeasureResult;"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,464:1\n151#2,3:465\n33#2,4:468\n154#2,2:472\n38#2:474\n156#2:475\n*S KotlinDebug\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1\n*L\n189#1:465,3\n189#1:468,4\n189#1:472,2\n189#1:474\n189#1:475\n*E\n"})
public final class ExposedDropdownMenuPopup_androidKt.SimpleStack.1 implements MeasurePolicy {
    public static final ExposedDropdownMenuPopup_androidKt.SimpleStack.1 INSTANCE;

    static {
        ExposedDropdownMenuPopup_androidKt.SimpleStack.1.INSTANCE = new ExposedDropdownMenuPopup_androidKt.SimpleStack.1();
    }

    @Override  // androidx.compose.ui.layout.MeasurePolicy
    @NotNull
    public final MeasureResult measure-3p2s80s(@NotNull MeasureScope measureScope0, @NotNull List list0, long v) {
        switch(list0.size()) {
            case 0: {
                return MeasureScope.layout$default(measureScope0, 0, 0, null, androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1.1.INSTANCE, 4, null);
            }
            case 1: {
                Placeable placeable1 = ((Measurable)list0.get(0)).measure-BRTryo0(v);
                return MeasureScope.layout$default(measureScope0, placeable1.getWidth(), placeable1.getHeight(), null, new Function1() {
                    public final Placeable w;

                    {
                        this.w = placeable0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((PlacementScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull PlacementScope placeable$PlacementScope0) {
                        PlacementScope.placeRelative$default(placeable$PlacementScope0, this.w, 0, 0, 0.0f, 4, null);
                    }
                }, 4, null);
            }
            default: {
                ArrayList arrayList0 = new ArrayList(list0.size());
                int v2 = list0.size();
                for(int v3 = 0; v3 < v2; ++v3) {
                    arrayList0.add(((Measurable)list0.get(v3)).measure-BRTryo0(v));
                }
                int v4 = CollectionsKt__CollectionsKt.getLastIndex(arrayList0);
                if(v4 >= 0) {
                    int v5 = 0;
                    int v6 = 0;
                    for(int v1 = 0; true; ++v1) {
                        Placeable placeable0 = (Placeable)arrayList0.get(v1);
                        v5 = Math.max(v5, placeable0.getWidth());
                        v6 = Math.max(v6, placeable0.getHeight());
                        if(v1 == v4) {
                            break;
                        }
                    }
                    return MeasureScope.layout$default(measureScope0, v5, v6, null, new Function1() {
                        public final List w;

                        {
                            this.w = list0;
                            super(1);
                        }

                        @Override  // kotlin.jvm.functions.Function1
                        public Object invoke(Object object0) {
                            this.invoke(((PlacementScope)object0));
                            return Unit.INSTANCE;
                        }

                        public final void invoke(@NotNull PlacementScope placeable$PlacementScope0) {
                            List list0 = this.w;
                            int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
                            if(v >= 0) {
                                for(int v1 = 0; true; ++v1) {
                                    PlacementScope.placeRelative$default(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                                    if(v1 == v) {
                                        break;
                                    }
                                }
                            }
                        }
                    }, 4, null);
                }
                return MeasureScope.layout$default(measureScope0, 0, 0, null, new Function1() {
                    public final List w;

                    {
                        this.w = list0;
                        super(1);
                    }

                    @Override  // kotlin.jvm.functions.Function1
                    public Object invoke(Object object0) {
                        this.invoke(((PlacementScope)object0));
                        return Unit.INSTANCE;
                    }

                    public final void invoke(@NotNull PlacementScope placeable$PlacementScope0) {
                        List list0 = this.w;
                        int v = CollectionsKt__CollectionsKt.getLastIndex(list0);
                        if(v >= 0) {
                            for(int v1 = 0; true; ++v1) {
                                PlacementScope.placeRelative$default(placeable$PlacementScope0, ((Placeable)list0.get(v1)), 0, 0, 0.0f, 4, null);
                                if(v1 == v) {
                                    break;
                                }
                            }
                        }
                    }
                }, 4, null);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/compose/ui/layout/Placeable$PlacementScope;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nExposedDropdownMenuPopup.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExposedDropdownMenuPopup.android.kt\nandroidx/compose/material/internal/ExposedDropdownMenuPopup_androidKt$SimpleStack$1$1\n*L\n1#1,464:1\n*E\n"})
        public final class androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1.1 extends Lambda implements Function1 {
            public static final androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1.1 INSTANCE;

            static {
                androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1.1.INSTANCE = new androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1.1();
            }

            public androidx.compose.material.internal.ExposedDropdownMenuPopup_androidKt.SimpleStack.1.1() {
                super(1);
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return Unit.INSTANCE;
            }

            public final void invoke(@NotNull PlacementScope placeable$PlacementScope0) {
            }
        }

    }
}

