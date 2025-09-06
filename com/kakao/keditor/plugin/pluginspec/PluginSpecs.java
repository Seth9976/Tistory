package com.kakao.keditor.plugin.pluginspec;

import android.content.Context;
import com.kakao.keditor.Keditor;
import com.kakao.keditor.KeditorView;
import com.kakao.keditor.plugin.itemspec.ItemSpecs;
import com.kakao.keditor.plugin.pluginspec.paragraph.ParagraphPluginSpec;
import com.kakao.keditor.util.eventbus.KeEvent;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.CreateItem;
import com.kakao.keditor.util.eventbus.PluginSpecRequest.RunIconClick;
import com.kakao.keditor.util.eventbus.PluginSpecRequest;
import com.kakao.keditor.util.eventbus.ViewRequest.AddKeditorItems;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.l;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qd.a;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000E\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001A\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0014\u0010\u0010\u001A\u00020\u00112\f\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\u0012J\f\u0010\u0013\u001A\b\u0012\u0004\u0012\u00020\u00140\u0012J\u0010\u0010\u0015\u001A\u0004\u0018\u00010\t2\u0006\u0010\u0016\u001A\u00020\u0014J\u000E\u0010\u0017\u001A\u00020\r2\u0006\u0010\u0016\u001A\u00020\u0014J\u0016\u0010\u0018\u001A\u00020\u00112\u0006\u0010\u0019\u001A\u00020\r2\u0006\u0010\u001A\u001A\u00020\u001BJ\u000E\u0010\u001C\u001A\u00020\r2\u0006\u0010\u0016\u001A\u00020\u0014J\u000E\u0010\u001D\u001A\u00020\u0011H\u0086@¢\u0006\u0002\u0010\u001ER\u0011\u0010\u0002\u001A\u00020\u0003¢\u0006\b\n\u0000\u001A\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001A\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001A\u0004\b\n\u0010\u000BR\u0011\u0010\f\u001A\u00020\r8F¢\u0006\u0006\u001A\u0004\b\u000E\u0010\u000F¨\u0006\u001F"}, d2 = {"Lcom/kakao/keditor/plugin/pluginspec/PluginSpecs;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "plugins", "", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "getPlugins", "()Ljava/util/List;", "size", "", "getSize", "()I", "add", "", "", "allTypes", "", "byType", "type", "indexByType", "initPlugins", "editorId", "itemSpecs", "Lcom/kakao/keditor/plugin/itemspec/ItemSpecs;", "pluginId", "startFlow", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "keditor_release"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
@SourceDebugExtension({"SMAP\nPluginSpecs.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluginSpecs.kt\ncom/kakao/keditor/plugin/pluginspec/PluginSpecs\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KeEvent.kt\ncom/kakao/keditor/util/eventbus/KeEvent\n+ 5 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 6 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 7 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n*L\n1#1,98:1\n1855#2,2:99\n288#2,2:101\n350#2,7:103\n1855#2:110\n1856#2:112\n1549#2:122\n1620#2,3:123\n1#3:111\n28#4:113\n21#5:114\n23#5:118\n53#5,3:119\n50#6:115\n55#6:117\n106#7:116\n*S KotlinDebug\n*F\n+ 1 PluginSpecs.kt\ncom/kakao/keditor/plugin/pluginspec/PluginSpecs\n*L\n31#1:99,2\n42#1:101,2\n50#1:103,7\n57#1:110\n57#1:112\n92#1:122\n92#1:123,3\n74#1:113\n74#1:114\n74#1:118\n74#1:119,3\n74#1:115\n74#1:117\n74#1:116\n*E\n"})
public final class PluginSpecs {
    @NotNull
    private final Context context;
    @NotNull
    private final List plugins;

    public PluginSpecs(@NotNull Context context0) {
        Intrinsics.checkNotNullParameter(context0, "context");
        super();
        this.context = context0;
        this.plugins = CollectionsKt__CollectionsKt.mutableListOf(new PluginSpec[]{new ParagraphPluginSpec()});
    }

    public final void add(@NotNull List list0) {
        Intrinsics.checkNotNullParameter(list0, "plugins");
        for(Object object0: list0) {
            PluginSpec pluginSpec0 = (PluginSpec)object0;
            for(Object object1: this.plugins) {
                if(!Intrinsics.areEqual(((PluginSpec)object1).type(), pluginSpec0.type())) {
                    continue;
                }
                goto label_11;
            }
            object1 = null;
        label_11:
            if(((PluginSpec)object1) != null) {
                this.plugins.remove(((PluginSpec)object1));
            }
            this.plugins.add(pluginSpec0);
        }
        String s = CollectionsKt___CollectionsKt.joinToString$default(list0, null, null, null, 0, null, com.kakao.keditor.plugin.pluginspec.PluginSpecs.add.2.INSTANCE, 0x1F, null);
        Keditor.INSTANCE.log(this, "Added plugins " + s);

        @Metadata(d1 = {"\u0000\u000E\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001A\u00020\u00012\u0006\u0010\u0002\u001A\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/kakao/keditor/plugin/pluginspec/PluginSpec;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 0x30)
        final class com.kakao.keditor.plugin.pluginspec.PluginSpecs.add.2 extends Lambda implements Function1 {
            public static final com.kakao.keditor.plugin.pluginspec.PluginSpecs.add.2 INSTANCE;

            static {
                com.kakao.keditor.plugin.pluginspec.PluginSpecs.add.2.INSTANCE = new com.kakao.keditor.plugin.pluginspec.PluginSpecs.add.2();
            }

            public com.kakao.keditor.plugin.pluginspec.PluginSpecs.add.2() {
                super(1);
            }

            @NotNull
            public final CharSequence invoke(@NotNull PluginSpec pluginSpec0) {
                Intrinsics.checkNotNullParameter(pluginSpec0, "it");
                return pluginSpec0.type();
            }

            @Override  // kotlin.jvm.functions.Function1
            public Object invoke(Object object0) {
                return this.invoke(((PluginSpec)object0));
            }
        }

    }

    @NotNull
    public final List allTypes() {
        List list0 = new ArrayList(l.collectionSizeOrDefault(this.plugins, 10));
        for(Object object0: this.plugins) {
            list0.add(((PluginSpec)object0).type());
        }
        return list0;
    }

    @Nullable
    public final PluginSpec byType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        for(Object object0: this.plugins) {
            if(((PluginSpec)object0).typeOf(s)) {
                return (PluginSpec)object0;
            }
            if(false) {
                break;
            }
        }
        return null;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final List getPlugins() {
        return this.plugins;
    }

    public final int getSize() {
        return this.plugins.size();
    }

    public final int indexByType(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        int v = 0;
        Iterator iterator0 = this.plugins.iterator();
        while(true) {
            if(!iterator0.hasNext()) {
                v = -1;
                break;
            }
            Object object0 = iterator0.next();
            if(Intrinsics.areEqual(((PluginSpec)object0).type(), s)) {
                break;
            }
            ++v;
        }
        return v == -1 ? this.indexByType("unsupported") : v;
    }

    public final void initPlugins(int v, @NotNull ItemSpecs itemSpecs0) {
        Intrinsics.checkNotNullParameter(itemSpecs0, "itemSpecs");
        for(Object object0: this.plugins) {
            ((PluginSpec)object0).setEditorId(v);
            ((PluginSpec)object0).initPluginSpec(this.context, itemSpecs0);
        }
    }

    public final int pluginId(@NotNull String s) {
        Intrinsics.checkNotNullParameter(s, "type");
        return this.indexByType(s);
    }

    @Nullable
    public final Object startFlow(@NotNull Continuation continuation0) {
        Object object0 = new Flow() {
            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.2.2 pluginSpecs$startFlow$$inlined$subscribe$2$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.2.2.1 pluginSpecs$startFlow$$inlined$subscribe$2$2$10;
                        if(continuation0 instanceof com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.2.2.1) {
                            pluginSpecs$startFlow$$inlined$subscribe$2$2$10 = (com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.2.2.1)continuation0;
                            int v = pluginSpecs$startFlow$$inlined$subscribe$2$2$10.label;
                            if((v & 0x80000000) == 0) {
                                pluginSpecs$startFlow$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                pluginSpecs$startFlow$$inlined$subscribe$2$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            pluginSpecs$startFlow$$inlined$subscribe$2$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = pluginSpecs$startFlow$$inlined$subscribe$2$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(pluginSpecs$startFlow$$inlined$subscribe$2$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                if(object0 == null) {
                                    throw new NullPointerException("null cannot be cast to non-null type com.kakao.keditor.util.eventbus.PluginSpecRequest");
                                }
                                pluginSpecs$startFlow$$inlined$subscribe$2$2$10.label = 1;
                                return flowCollector0.emit(((PluginSpecRequest)object0), pluginSpecs$startFlow$$inlined$subscribe$2$2$10) == object2 ? object2 : Unit.INSTANCE;
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(pluginSpecs$startFlow$$inlined$subscribe$2$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }.collect(new FlowCollector() {
            @Nullable
            public final Object emit(@NotNull PluginSpecRequest pluginSpecRequest0, @NotNull Continuation continuation0) {
                Unit unit0;
                Keditor.INSTANCE.log(PluginSpecs.this, "PluginSpecRequest : " + pluginSpecRequest0);
                PluginSpec pluginSpec0 = PluginSpecs.this.byType(pluginSpecRequest0.getRequestType());
                if(pluginSpec0 == null) {
                    unit0 = null;
                }
                else {
                    KeditorView keditorView0 = pluginSpec0.findKeditorView();
                    if(keditorView0 != null && keditorView0.isReadOnly()) {
                        return Unit.INSTANCE;
                    }
                    if(pluginSpecRequest0 instanceof CreateItem) {
                        AddKeditorItems viewRequest$AddKeditorItems0 = new AddKeditorItems(pluginSpec0.createKeditorItems(pluginSpecRequest0.getFocusedPosition()), 0, false, false, 14, null);
                        KeEvent.INSTANCE.postInScope(viewRequest$AddKeditorItems0);
                    }
                    else if(pluginSpecRequest0 instanceof RunIconClick) {
                        pluginSpec0.runIconClick();
                    }
                    else {
                        pluginSpec0.onRequest(pluginSpecRequest0);
                    }
                    unit0 = Unit.INSTANCE;
                }
                if(unit0 == null) {
                    for(Object object0: PluginSpecs.this.getPlugins()) {
                        KeditorView keditorView1 = ((PluginSpec)object0).findKeditorView();
                        if(keditorView1 != null && keditorView1.isReadOnly()) {
                            return Unit.INSTANCE;
                        }
                        ((PluginSpec)object0).onRequest(pluginSpecRequest0);
                    }
                }
                return Unit.INSTANCE;
            }

            @Override  // kotlinx.coroutines.flow.FlowCollector
            public Object emit(Object object0, Continuation continuation0) {
                return this.emit(((PluginSpecRequest)object0), continuation0);
            }
        }, continuation0);
        return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;

        @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001F\u0010\u0002\u001A\u00020\u00032\f\u0010\u0004\u001A\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007¸\u0006\n"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/Flow;", "collect", "", "collector", "Lkotlinx/coroutines/flow/FlowCollector;", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core", "kotlinx/coroutines/flow/FlowKt__EmittersKt$unsafeTransform$$inlined$unsafeFlow$1", "kotlinx/coroutines/flow/FlowKt__TransformKt$filter$$inlined$unsafeTransform$1", "com/kakao/keditor/util/eventbus/KeEvent$subscribe$$inlined$filter$1"}, k = 1, mv = {1, 9, 0}, xi = 0x30)
        @SourceDebugExtension({"SMAP\nSafeCollector.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1\n+ 2 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n*L\n1#1,112:1\n51#2,5:113\n*E\n"})
        public final class com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.1 implements Flow {
            public com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.1(Flow flow0) {
            }

            @Override  // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector0, @NotNull Continuation continuation0) {
                com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.1.2 pluginSpecs$startFlow$$inlined$subscribe$1$20 = new FlowCollector() {
                    @Override  // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(Object object0, @NotNull Continuation continuation0) {
                        com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.1.2.1 pluginSpecs$startFlow$$inlined$subscribe$1$2$10;
                        if(continuation0 instanceof com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.1.2.1) {
                            pluginSpecs$startFlow$$inlined$subscribe$1$2$10 = (com.kakao.keditor.plugin.pluginspec.PluginSpecs.startFlow..inlined.subscribe.1.2.1)continuation0;
                            int v = pluginSpecs$startFlow$$inlined$subscribe$1$2$10.label;
                            if((v & 0x80000000) == 0) {
                                pluginSpecs$startFlow$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                                pluginSpecs$startFlow$$inlined$subscribe$1$2$10.label = v ^ 0x80000000;
                            }
                        }
                        else {
                            pluginSpecs$startFlow$$inlined$subscribe$1$2$10 = new ContinuationImpl(/*ERROR_MISSING_ARG_1/*) {
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
                        Object object1 = pluginSpecs$startFlow$$inlined$subscribe$1$2$10.result;
                        Object object2 = a.getCOROUTINE_SUSPENDED();
                        switch(pluginSpecs$startFlow$$inlined$subscribe$1$2$10.label) {
                            case 0: {
                                ResultKt.throwOnFailure(object1);
                                FlowCollector flowCollector0 = this.$this_unsafeFlow;
                                if(object0 instanceof PluginSpecRequest) {
                                    pluginSpecs$startFlow$$inlined$subscribe$1$2$10.label = 1;
                                    if(flowCollector0.emit(object0, pluginSpecs$startFlow$$inlined$subscribe$1$2$10) == object2) {
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
                Object object0 = this.$this_unsafeTransform$inlined.collect(pluginSpecs$startFlow$$inlined$subscribe$1$20, continuation0);
                return object0 == a.getCOROUTINE_SUSPENDED() ? object0 : Unit.INSTANCE;
            }
        }

    }
}

