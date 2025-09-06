package androidx.activity;

import aa.a;
import android.view.View;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.material.BackdropScaffoldState;
import androidx.compose.material.BackdropValue;
import androidx.compose.material.BottomSheetScaffoldKt;
import androidx.compose.material.BottomSheetValue;
import androidx.compose.material.SnackbarHostState;
import androidx.compose.material3.ModalBottomSheetProperties;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.material3.SwipeToDismissBoxValue;
import androidx.compose.material3.internal.CalendarModel;
import androidx.compose.material3.internal.DateInputFormat;
import androidx.compose.material3.jd;
import androidx.compose.material3.ld;
import androidx.compose.material3.md;
import androidx.compose.material3.nd;
import androidx.compose.runtime.ComposerImpl;
import androidx.compose.runtime.MovableContentStateReference;
import androidx.compose.runtime.SlotReader;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.changelist.ChangeList;
import androidx.compose.runtime.changelist.ComposerChangeListWriter;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.DialogProperties;
import androidx.work.ExistingWorkPolicy;
import androidx.work.WorkRequest;
import androidx.work.impl.OperationImpl;
import androidx.work.impl.WorkContinuationImpl;
import androidx.work.impl.WorkManagerImpl;
import androidx.work.impl.utils.EnqueueRunnable;
import com.kakao.kandinsky.selector.MultipleImageSelectorKt;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.collections.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CoroutineScope;
import v2.o;

public final class g0 extends Lambda implements Function0 {
    public final Object A;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public g0(int v, Object object0, Object object1, Object object2, Object object3) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        super(0);
    }

    @Override  // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch(this.w) {
            case 0: {
                ((View)this.x).getViewTreeObserver().removeOnScrollChangedListener(((f0)this.y));
                ((View)this.x).removeOnLayoutChangeListener(((e0)this.z));
                ((View)this.x).removeOnAttachStateChangeListener(((PipHintTrackerKt.trackPipAnimationHintView.flow.1.attachStateChangeListener.1)this.A));
                return Unit.INSTANCE;
            }
            case 1: {
                Long long0 = (Long)this.x;
                if(long0 != null) {
                    String s = ((DateInputFormat)this.z).getPatternWithoutDelimiters();
                    String s1 = ((CalendarModel)this.y).formatWithPattern(long0.longValue(), s, ((Locale)this.A));
                    return s1 == null ? SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", TextRangeKt.TextRange(0, 0), null, 4, null), null, 2, null) : SnapshotStateKt.mutableStateOf$default(new TextFieldValue(s1, TextRangeKt.TextRange(0, 0), null, 4, null), null, 2, null);
                }
                return SnapshotStateKt.mutableStateOf$default(new TextFieldValue("", TextRangeKt.TextRange(0, 0), null, 4, null), null, 2, null);
            }
            case 2: {
                SheetState sheetState0 = (SheetState)this.x;
                if(sheetState0.getCurrentValue() == SheetValue.Expanded && sheetState0.getHasPartiallyExpandedState()) {
                    ld ld0 = new ld(((Animatable)this.z), null);
                    BuildersKt.launch$default(((CoroutineScope)this.y), null, null, ld0, 3, null);
                    md md0 = new md(sheetState0, null);
                    BuildersKt.launch$default(((CoroutineScope)this.y), null, null, md0, 3, null);
                    return Unit.INSTANCE;
                }
                nd nd0 = new nd(sheetState0, null);
                BuildersKt.launch$default(((CoroutineScope)this.y), null, null, nd0, 3, null).invokeOnCompletion(new a(((Function0)this.A), 4));
                return Unit.INSTANCE;
            }
            case 3: {
                ((jd)this.x).c(((Function0)this.y), ((ModalBottomSheetProperties)this.z), ((LayoutDirection)this.A));
                return Unit.INSTANCE;
            }
            case 4: {
                return new SwipeToDismissBoxState(((SwipeToDismissBoxValue)this.x), ((Density)this.y), ((Function1)this.z), ((Function1)this.A));
            }
            case 5: {
                List list0 = k.listOf(((WorkRequest)this.x));
                new EnqueueRunnable(new WorkContinuationImpl(((WorkManagerImpl)this.y), ((String)this.z), ExistingWorkPolicy.KEEP, list0), ((OperationImpl)this.A)).run();
                return Unit.INSTANCE;
            }
            case 6: {
                return new BackdropScaffoldState(((BackdropValue)this.x), ((AnimationSpec)this.y), ((Function1)this.z), ((SnackbarHostState)this.A));
            }
            case 7: {
                return BottomSheetScaffoldKt.BottomSheetState(((BottomSheetValue)this.x), ((Density)this.y), ((AnimationSpec)this.z), ((Function1)this.A));
            }
            case 8: {
                MultipleImageSelectorKt.access$confirmTrackerClickEvent(((String)this.x));
                ((Function1)this.y).invoke(((SnapshotStateList)this.z));
                ((Function0)this.A).invoke();
                return Unit.INSTANCE;
            }
            case 9: {
                ((o)this.x).d(((Function0)this.y), ((DialogProperties)this.z), ((LayoutDirection)this.A));
                return Unit.INSTANCE;
            }
            default: {
                ComposerImpl composerImpl0 = (ComposerImpl)this.x;
                ComposerChangeListWriter composerChangeListWriter0 = composerImpl0.N;
                SlotReader slotReader0 = (SlotReader)this.z;
                MovableContentStateReference movableContentStateReference0 = (MovableContentStateReference)this.A;
                ChangeList changeList0 = composerChangeListWriter0.getChangeList();
                try {
                    composerChangeListWriter0.setChangeList(((ChangeList)this.y));
                    SlotReader slotReader1 = composerImpl0.getReader$runtime_release();
                    int[] arr_v = composerImpl0.n;
                    IntMap intMap0 = composerImpl0.v;
                    composerImpl0.n = null;
                    composerImpl0.v = null;
                    try {
                        composerImpl0.setReader$runtime_release(slotReader0);
                        ComposerChangeListWriter composerChangeListWriter1 = composerImpl0.N;
                        try {
                            composerChangeListWriter1.setImplicitRootStart(false);
                            composerImpl0.m(movableContentStateReference0.getContent$runtime_release(), movableContentStateReference0.getLocals$runtime_release(), movableContentStateReference0.getParameter$runtime_release(), true);
                        }
                        finally {
                            composerChangeListWriter1.setImplicitRootStart(composerChangeListWriter1.getImplicitRootStart());
                        }
                    }
                    catch(Throwable throwable0) {
                        composerImpl0.setReader$runtime_release(slotReader1);
                        composerImpl0.n = arr_v;
                        composerImpl0.v = intMap0;
                        throw throwable0;
                    }
                    composerImpl0.setReader$runtime_release(slotReader1);
                    composerImpl0.n = arr_v;
                    composerImpl0.v = intMap0;
                    return Unit.INSTANCE;
                }
                finally {
                    composerChangeListWriter0.setChangeList(changeList0);
                }
            }
        }
    }
}

