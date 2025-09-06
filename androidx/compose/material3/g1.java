package androidx.compose.material3;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactory;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt.LazyLayout.3.1.1.invoke..inlined.onDispose.1;
import androidx.compose.foundation.lazy.layout.LazyLayoutPrefetchState;
import androidx.compose.foundation.lazy.layout.PrefetchHandleProvider;
import androidx.compose.foundation.lazy.layout.PrefetchScheduler;
import androidx.compose.foundation.text.selection.y;
import androidx.compose.material.SwipeableKt.rememberSwipeableStateFor.2.invoke..inlined.onDispose.1;
import androidx.compose.material.SwipeableState;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.MutableFloatState;
import androidx.compose.runtime.MutableState;
import androidx.compose.ui.focus.FocusManager;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.LayoutCoordinatesKt;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import com.kakao.editortracker.data.Action;
import com.kakao.kandinsky.textedit.TextEditorKt;
import com.kakao.kandinsky.textedit.ui.EditState;
import java.nio.file.Path;
import kotlin.Unit;
import kotlin.io.path.FileVisitorBuilder;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeAttributes;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.RawSubstitution;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.SimpleType;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import yd.k;
import yd.l;
import yd.m;

public final class g1 extends Lambda implements Function1 {
    public final Object A;
    public final int w;
    public final Object x;
    public final Object y;
    public final Object z;

    public g1(int v, Object object0, Object object1, Object object2, Object object3) {
        this.w = v;
        this.x = object0;
        this.y = object1;
        this.z = object2;
        this.A = object3;
        super(1);
    }

    @Override  // kotlin.jvm.functions.Function1
    public final Object invoke(Object object0) {
        LayoutCoordinates layoutCoordinates2;
        switch(this.w) {
            case 0: {
                Rect rect0 = LayoutCoordinatesKt.boundsInWindow(((LayoutCoordinates)object0));
                BadgeKt.access$BadgedBox$lambda$2(((MutableFloatState)this.x), rect0.getLeft());
                BadgeKt.access$BadgedBox$lambda$5(((MutableFloatState)this.y), rect0.getTop());
                LayoutCoordinates layoutCoordinates0 = ((LayoutCoordinates)object0).getParentLayoutCoordinates();
                if(layoutCoordinates0 == null) {
                    layoutCoordinates2 = null;
                }
                else {
                    LayoutCoordinates layoutCoordinates1 = layoutCoordinates0.getParentLayoutCoordinates();
                    layoutCoordinates2 = layoutCoordinates1 == null ? null : layoutCoordinates1.getParentCoordinates();
                }
                if(layoutCoordinates2 != null) {
                    Rect rect1 = LayoutCoordinatesKt.boundsInWindow(layoutCoordinates2);
                    BadgeKt.access$BadgedBox$lambda$8(((MutableFloatState)this.z), rect1.getRight());
                    BadgeKt.access$BadgedBox$lambda$11(((MutableFloatState)this.A), rect1.getTop());
                }
                return Unit.INSTANCE;
            }
            case 1: {
                Intrinsics.checkNotNullParameter(((EditState)object0), "it");
                TextEditorKt.access$stateTrackerClickEvent(((String)this.x), ((EditState)object0));
                FocusManager.clearFocus$default(((FocusManager)this.y), false, 1, null);
                TextEditorKt.access$TextEditor$lambda$13(((MutableState)this.z), false);
                TextEditorKt.access$TextEditor$lambda$5(((MutableState)this.A), ((EditState)object0));
                return Unit.INSTANCE;
            }
            case 2: {
                DisposableEffectScope disposableEffectScope0 = (DisposableEffectScope)object0;
                PrefetchHandleProvider prefetchHandleProvider0 = new PrefetchHandleProvider(((LazyLayoutItemContentFactory)this.y), ((SubcomposeLayoutState)this.z), ((PrefetchScheduler)this.A));
                ((LazyLayoutPrefetchState)this.x).setPrefetchHandleProvider$foundation_release(prefetchHandleProvider0);
                return new LazyLayoutKt.LazyLayout.3.1.1.invoke..inlined.onDispose.1(((LazyLayoutPrefetchState)this.x));
            }
            case 3: {
                Intrinsics.checkNotNullParameter(((Action)object0), "$this$click");
                ((Action)object0).setLayer1(((String)this.x));
                ((Action)object0).setLayer2(((String)this.y));
                ((Action)object0).setLayer3(((String)this.z));
                ((Action)object0).setCommand(((String)this.A));
                return Unit.INSTANCE;
            }
            case 4: {
                DisposableEffectScope disposableEffectScope1 = (DisposableEffectScope)object0;
                SwipeableState swipeableState0 = (SwipeableState)this.y;
                Object object1 = swipeableState0.getCurrentValue();
                if(!Intrinsics.areEqual(this.x, object1)) {
                    Object object2 = swipeableState0.getCurrentValue();
                    ((Function1)this.z).invoke(object2);
                    Boolean boolean0 = Boolean.valueOf(!((Boolean)((MutableState)this.A).getValue()).booleanValue());
                    ((MutableState)this.A).setValue(boolean0);
                }
                return new SwipeableKt.rememberSwipeableStateFor.2.invoke..inlined.onDispose.1();
            }
            case 5: {
                Intrinsics.checkNotNullParameter(((KotlinTypeRefiner)object0), "kotlinTypeRefiner");
                ClassDescriptor classDescriptor0 = (ClassDescriptor)this.x;
                ClassDescriptor classDescriptor1 = classDescriptor0 == null ? null : classDescriptor0;
                if(classDescriptor1 != null) {
                    ClassId classId0 = DescriptorUtilsKt.getClassId(classDescriptor1);
                    if(classId0 != null) {
                        ClassDescriptor classDescriptor2 = ((KotlinTypeRefiner)object0).findClassAcrossModuleDependencies(classId0);
                        return classDescriptor2 == null || Intrinsics.areEqual(classDescriptor2, classDescriptor0) ? null : ((SimpleType)RawSubstitution.access$eraseInflexibleBasedOnClassDescriptor(((RawSubstitution)this.y), ((SimpleType)this.z), classDescriptor2, ((JavaTypeAttributes)this.A)).getFirst());
                    }
                }
                return null;
            }
            default: {
                Intrinsics.checkNotNullParameter(((FileVisitorBuilder)object0), "$this$visitFileTree");
                ((FileVisitorBuilder)object0).onPreVisitDirectory(new k(((Function3)this.x), ((Path)this.y), ((Path)this.z), ((Function3)this.A)));
                ((FileVisitorBuilder)object0).onVisitFile(new l(((Function3)this.x), ((Path)this.y), ((Path)this.z), ((Function3)this.A)));
                ((FileVisitorBuilder)object0).onVisitFileFailed(new m(((Function3)this.A), ((Path)this.y), ((Path)this.z)));
                ((FileVisitorBuilder)object0).onPostVisitDirectory(new y(((Function3)this.A), ((Path)this.y), 12, ((Path)this.z)));
                return Unit.INSTANCE;
            }
        }
    }
}

