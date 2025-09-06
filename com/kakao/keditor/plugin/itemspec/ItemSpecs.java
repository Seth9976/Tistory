package com.kakao.keditor.plugin.itemspec;

import android.content.Context;
import com.kakao.keditor.BR;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorItem;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.plugin.itemspec.paragraph.ParagraphItemSpec;
import com.kakao.keditor.plugin.itemspec.paragraph.TextItem;
import com.kakao.keditor.plugin.itemspec.unsupport.UnsupportItemSpec;
import com.kakao.keditor.toolbar.category.ToolbarCategory.Idle;
import com.kakao.keditor.util.eventbus.ItemSpecRequest.FocusCategory;
import com.kakao.keditor.util.eventbus.ItemSpecRequest.UpdateItemSpec;
import com.kakao.keditor.util.eventbus.ItemSpecRequest;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.ViewRequest.RefreshAll;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000E\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000B\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0010\u001A\u00020\u00112\u0010\u0010\u0012\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0013J\u0012\u0010\u0014\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0015\u001A\u00020\rJ\u0012\u0010\u0016\u001A\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0017\u001A\u00020\u0018J6\u0010\u0019\u001A\u00020\u0011\"\f\b\u0000\u0010\u001A*\u0006\u0012\u0002\b\u00030\u001B2\f\u0010\u001C\u001A\b\u0012\u0004\u0012\u0002H\u001A0\u001D2\u0010\u0010\u0007\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u001B0\u0013H\u0002J\u000E\u0010\u001E\u001A\u00020\u001F2\u0006\u0010\u0017\u001A\u00020\u0018J\u000E\u0010 \u001A\u00020\r2\u0006\u0010\u0017\u001A\u00020\u0018J\u000E\u0010!\u001A\u00020\u00112\u0006\u0010\"\u001A\u00020\rJ\u000E\u0010#\u001A\u00020\u0011H\u0086@¢\u0006\u0002\u0010$R\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u001B\u0010\u0007\u001A\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\f\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006%"}, d2 = {"Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "itemSpecList", "", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "getItemSpecList", "()Ljava/util/List;", "size", "", "getSize", "()I", "add", "", "itemSpecs", "", "byIndex", "index", "byType", "type", "", "handleUpdateItemSpec", "T", "Lcom/kakao/keditor/plugin/itemspec/ItemSpec;", "request", "Lcom/kakao/keditor/util/eventbus/ItemSpecRequest$UpdateItemSpec;", "hasType", "", "indexByType", "initItemSpecs", "editorId", "startFlow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nItemSpecs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ItemSpecs.kt\ncom/kakao/keditor/plugin/itemspec/ItemSpecs\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KeEvent.kt\ncom/kakao/keditor/util/eventbus/KeEvent\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,121:1\n1855#2,2:122\n288#2,2:124\n288#2,2:126\n350#2,7:128\n350#2,7:135\n1855#2:142\n1856#2:144\n1#3:143\n28#4:145\n21#5:146\n23#5:150\n53#5,3:151\n50#6:147\n55#6:149\n106#7:148\n*S KotlinDebug\n*F\n+ 1 ItemSpecs.kt\ncom/kakao/keditor/plugin/itemspec/ItemSpecs\n*L\n35#1:122,2\n46#1:124,2\n53#1:126,2\n68#1:128,7\n70#1:135,7\n75#1:142\n75#1:144\n90#1:145\n90#1:146\n90#1:150\n90#1:151,3\n90#1:147\n90#1:149\n90#1:148\n*E\n"})
public final class ItemSpecs {
    @NotNull
    private final Context context;
    @NotNull
    private final List itemSpecList;

    public ItemSpecs(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.context = context0;
        this.itemSpecList = CollectionsKt__CollectionsKt.mutableListOf(new RootItemSpec[]{new ParagraphItemSpec(), new UnsupportItemSpec()});
    }

    public final void add(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "itemSpecs");
        for(Object object0: list0) {
            RootItemSpec rootItemSpec0 = (RootItemSpec)object0;
            for(Object object1: this.itemSpecList) {
                if(!Intrinsics.areEqual(((RootItemSpec)object1).type(), rootItemSpec0.type())) {
                    continue;
                }
                goto label_11;
            }
            object1 = null;
        label_11:
            if(((RootItemSpec)object1) != null) {
                this.itemSpecList.remove(((RootItemSpec)object1));
            }
            this.itemSpecList.add(rootItemSpec0);
        }
        String s = CollectionsKt___CollectionsKt.joinToString$default(list0, null, null, null, 0, null, com.kakao.keditor.plugin.itemspec.ItemSpecs.add.2.INSTANCE, 0x1F, null);
        Keditor.INSTANCE.log(this, "Added itemSpecs " + s);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\n\u0010\u0002\u001A\u0006\u0012\u0002\b\u00030\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/itemspec/RootItemSpec;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.itemspec.ItemSpecs.add.2 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.itemspec.ItemSpecs.add.2 INSTANCE;

            static {
                com.kakao.keditor.plugin.itemspec.ItemSpecs.add.2.INSTANCE = new com.kakao.keditor.plugin.itemspec.ItemSpecs.add.2();
            }

            public com.kakao.keditor.plugin.itemspec.ItemSpecs.add.2() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull RootItemSpec rootItemSpec0) {
                Intrinsics.checkNotNullParameter(rootItemSpec0, "it");
                return rootItemSpec0.type();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((RootItemSpec)object0));
            }
        }

    }

    @NotNull
    public final RootItemSpec byIndex(int v) {
        return v < 0 && v >= this.getSize() ? new UnsupportItemSpec() : ((RootItemSpec)this.itemSpecList.get(v));
    }

    @NotNull
    public final RootItemSpec byType(@NotNull String s) {
        Object object0 = null;
        Intrinsics.checkNotNullParameter(s, "type");
        for(Object object1: this.itemSpecList) {
            if(((RootItemSpec)object1).typeOf(s)) {
                object0 = object1;
                break;
            }
        }
        return ((RootItemSpec)object0) == null ? new UnsupportItemSpec() : ((RootItemSpec)object0);
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List getItemSpecList() {
        return this.itemSpecList;
    }

    public final int getSize() {
        return this.itemSpecList.size();
    }

    private final void handleUpdateItemSpec(UpdateItemSpec itemSpecRequest$UpdateItemSpec0, List list0) {
        ItemSpec itemSpec0 = (ItemSpec)CollectionsKt___CollectionsKt.firstOrNull(q.filterIsInstance(list0, JvmClassMappingKt.getJavaClass(itemSpecRequest$UpdateItemSpec0.getType())));
        if(itemSpec0 != null) {
            itemSpecRequest$UpdateItemSpec0.getUpdate().invoke(itemSpec0);
            KeEvent.INSTANCE.postInScope(RefreshAll.INSTANCE);
        }
    }

    public final boolean hasType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        for(Object object0: this.itemSpecList) {
            if(((RootItemSpec)object0).typeOf(s)) {
                return object0 != null;
            }
            if(false) {
                break;
            }
        }
        return false;
    }

    public final int indexByType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        int v = 0;
        int v1 = 0;
        Iterator iterator0 = this.itemSpecList.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v1 = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(((RootItemSpec)object0).typeOf(s)) {
                break;
            }
            ++v1;
        }
        if(v1 == -1) {
            for(Object object1: this.itemSpecList) {
                if(((RootItemSpec)object1).typeOf("unsupported")) {
                    return v;
                }
                ++v;
            }
            return -1;
        }
        return v1;
    }

    public final void initItemSpecs(int v) {
        for(Object object0: this.itemSpecList) {
            ((RootItemSpec)object0).setEditorId(v);
            ((RootItemSpec)object0).createContextMenu(this.context);
        }
    }

    @Nullable
    public final Object startFlow(@NotNull Continuation continuation0) {
        Object object0 = new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.2.2 itemSpecs$startFlow$$inlined$subscribe$2$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.2.2.1 itemSpecs$startFlow$$inlined$subscribe$2$2$10;
                        if(continuation0 instanceof com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.2.2.1) {
                            itemSpecs$startFlow$$inlined$subscribe$2$2$10 = (com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.2.2.1)continuation0;
                            int v = itemSpecs$startFlow$$inlined$subscribe$2$2$10.label;
                            if((v & 0x80000000) == 0) {
                                itemSpecs$startFlow$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                itemSpecs$startFlow$$inlined$subscribe$2$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            itemSpecs$startFlow$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = itemSpecs$startFlow$$inlined$subscribe$2$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(itemSpecs$startFlow$$inlined$subscribe$2$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                if(object0 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.kakao.keditor.util.eventbus.ItemSpecRequest");
                                }
                                itemSpecs$startFlow$$inlined$subscribe$2$2$10.label = 1;
                                return flowCollector0.emit(((ItemSpecRequest)object0), itemSpecs$startFlow$$inlined$subscribe$2$2$10) == object2 ? object2 : Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(itemSpecs$startFlow$$inlined$subscribe$2$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }.collect(new FlowCollector() {
            @Nullable
            public final Object emit(@NotNull ItemSpecRequest itemSpecRequest0, @NotNull Continuation continuation0) {
                String s1;
                Keditor.INSTANCE.log(ItemSpecs.this, "ItemSpecRequest : " + itemSpecRequest0);
                if(itemSpecRequest0 instanceof FocusCategory) {
                    for(Object object0: ItemSpecs.this.getItemSpecList()) {
                        RootItemSpec rootItemSpec0 = (RootItemSpec)object0;
                        KeditorView keditorView0 = rootItemSpec0.findKeditorView();
                        if(keditorView0 != null && keditorView0.isReadOnly()) {
                            return Unit.INSTANCE;
                        }
                        KeditorItem keditorItem0 = ((FocusCategory)itemSpecRequest0).getItem();
                        if(keditorItem0 == null) {
                            s1 = "";
                        }
                        else {
                            String s = keditorItem0.getType();
                            if(s != null) {
                                s1 = s;
                            }
                        }
                        boolean z = rootItemSpec0.typeOf(s1);
                        rootItemSpec0.getContextMenuBinding().setVariable(BR.displayMenu, Boxing.boxBoolean(z));
                        if(z) {
                            rootItemSpec0.bind(((FocusCategory)itemSpecRequest0).getItem(), (((FocusCategory)itemSpecRequest0).getItem() instanceof TextItem ? ((FocusCategory)itemSpecRequest0).getView() : null));
                        }
                    }
                    if(((FocusCategory)itemSpecRequest0).getItem() == null) {
                        com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory toolbarRequest$FocusCategory0 = new com.kakao.keditor.util.eventbus.ToolbarRequest.FocusCategory(Idle.INSTANCE);
                        KeEvent.INSTANCE.postInScope(toolbarRequest$FocusCategory0);
                        return Unit.INSTANCE;
                    }
                }
                else if(itemSpecRequest0 instanceof UpdateItemSpec) {
                    ItemSpecs.this.handleUpdateItemSpec(((UpdateItemSpec)itemSpecRequest0), ItemSpecs.this.getItemSpecList());
                }
                return Unit.INSTANCE;
            }

            @Override  // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object object0, Continuation continuation0) {
                return this.emit(((ItemSpecRequest)object0), continuation0);
            }
        }, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "com/kakao/keditor/util/eventbus/KeEvent$subscribe$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.1 implements Flow {
            public com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.1(Flow flow0) {
            }

            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.1.2 itemSpecs$startFlow$$inlined$subscribe$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.1.2.1 itemSpecs$startFlow$$inlined$subscribe$1$2$10;
                        if(continuation0 instanceof com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.1.2.1) {
                            itemSpecs$startFlow$$inlined$subscribe$1$2$10 = (com.kakao.keditor.plugin.itemspec.ItemSpecs.startFlow..inlined.subscribe.1.2.1)continuation0;
                            int v = itemSpecs$startFlow$$inlined$subscribe$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                itemSpecs$startFlow$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                    Object L$0;
                                    Object L$1;
                                    int label;
                                    Object result;

                                    @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @Nullable
                                    public final Object invokeSuspend(@NotNull Object object0) {
                                        this.result = object0;
                                        this.label |= 0x80000000;
                                        return continuation0.emit(null, this);
                                    }
                                };
                            }
                            else {
                                itemSpecs$startFlow$$inlined$subscribe$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            itemSpecs$startFlow$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
                                Object L$0;
                                Object L$1;
                                int label;
                                Object result;

                                @Override  // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                @Nullable
                                public final Object invokeSuspend(@NotNull Object object0) {
                                    this.result = object0;
                                    this.label |= 0x80000000;
                                    return continuation0.emit(null, this);
                                }
                            };
                        }
                        Object object1 = itemSpecs$startFlow$$inlined$subscribe$1$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(itemSpecs$startFlow$$inlined$subscribe$1$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                if(object0 instanceof ItemSpecRequest) {
                                    itemSpecs$startFlow$$inlined$subscribe$1$2$10.label = 1;
                                    if(flowCollector0.emit(object0, itemSpecs$startFlow$$inlined$subscribe$1$2$10) == object2) {
                                        return object2;
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            case 1: {
                                ResultKt.throwOnFailure(object1);
                                return Unit.INSTANCE;
                            }
                            default: {
                                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
                            }
                        }
                    }
                };
                Object object0 = this.$this_unsafeTransform$inlined.collect(itemSpecs$startFlow$$inlined$subscribe$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }

    }
}

