package io.reactivex.observers;

import a5.b;
import io.reactivex.Notification;
import io.reactivex.disposables.Disposable;
import io.reactivex.exceptions.CompositeException;
import io.reactivex.functions.Predicate;
import io.reactivex.internal.functions.Functions;
import io.reactivex.internal.functions.ObjectHelper;
import io.reactivex.internal.util.ExceptionHelper;
import io.reactivex.internal.util.VolatileSizeArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public abstract class BaseTestConsumer implements Disposable {
    // 部分失败：枚举糖化
    // 枚举按原样呈现，而不是糖化为Java 5枚举。
    public static abstract class TestWaitStrategy extends Enum implements Runnable {
        public static final enum TestWaitStrategy SLEEP_1000MS;
        public static final enum TestWaitStrategy SLEEP_100MS;
        public static final enum TestWaitStrategy SLEEP_10MS;
        public static final enum TestWaitStrategy SLEEP_1MS;
        public static final enum TestWaitStrategy SPIN;
        public static final enum TestWaitStrategy YIELD;
        public static final TestWaitStrategy[] a;

        static {
            a a0 = new a();
            TestWaitStrategy.SPIN = a0;
            io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.b b0 = new TestWaitStrategy() {
                @Override  // io.reactivex.observers.BaseTestConsumer$TestWaitStrategy
                public final void run() {
                    Thread.yield();
                }
            };
            TestWaitStrategy.YIELD = b0;
            io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.c c0 = new TestWaitStrategy() {
                @Override  // io.reactivex.observers.BaseTestConsumer$TestWaitStrategy
                public final void run() {
                    try {
                        Thread.sleep(1L);
                    }
                    catch(InterruptedException interruptedException0) {
                        throw new RuntimeException(interruptedException0);
                    }
                }
            };
            TestWaitStrategy.SLEEP_1MS = c0;
            io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.d d0 = new TestWaitStrategy() {
                @Override  // io.reactivex.observers.BaseTestConsumer$TestWaitStrategy
                public final void run() {
                    try {
                        Thread.sleep(10L);
                    }
                    catch(InterruptedException interruptedException0) {
                        throw new RuntimeException(interruptedException0);
                    }
                }
            };
            TestWaitStrategy.SLEEP_10MS = d0;
            io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.e e0 = new TestWaitStrategy() {
                @Override  // io.reactivex.observers.BaseTestConsumer$TestWaitStrategy
                public final void run() {
                    try {
                        Thread.sleep(100L);
                    }
                    catch(InterruptedException interruptedException0) {
                        throw new RuntimeException(interruptedException0);
                    }
                }
            };
            TestWaitStrategy.SLEEP_100MS = e0;
            io.reactivex.observers.BaseTestConsumer.TestWaitStrategy.f f0 = new TestWaitStrategy() {
                @Override  // io.reactivex.observers.BaseTestConsumer$TestWaitStrategy
                public final void run() {
                    try {
                        Thread.sleep(1000L);
                    }
                    catch(InterruptedException interruptedException0) {
                        throw new RuntimeException(interruptedException0);
                    }
                }
            };
            TestWaitStrategy.SLEEP_1000MS = f0;
            TestWaitStrategy.a = new TestWaitStrategy[]{a0, b0, c0, d0, e0, f0};
        }

        @Override
        public abstract void run();

        public static TestWaitStrategy valueOf(String s) {
            return (TestWaitStrategy)Enum.valueOf(TestWaitStrategy.class, s);
        }

        public static TestWaitStrategy[] values() {
            return (TestWaitStrategy[])TestWaitStrategy.a.clone();
        }
    }

    protected boolean checkSubscriptionOnce;
    protected long completions;
    protected final CountDownLatch done;
    protected final List errors;
    protected int establishedFusionMode;
    protected int initialFusionMode;
    protected Thread lastThread;
    protected CharSequence tag;
    protected boolean timeout;
    protected final List values;

    public BaseTestConsumer() {
        this.values = new VolatileSizeArrayList();
        this.errors = new VolatileSizeArrayList();
        this.done = new CountDownLatch(1);
    }

    public final BaseTestConsumer assertComplete() {
        long v = this.completions;
        if(v == 0L) {
            throw this.fail("Not completed");
        }
        if(v > 1L) {
            throw this.fail("Multiple completions: " + v);
        }
        return this;
    }

    public final BaseTestConsumer assertEmpty() {
        return this.assertSubscribed().assertNoValues().assertNoErrors().assertNotComplete();
    }

    public final BaseTestConsumer assertError(Predicate predicate0) {
        int v = this.errors.size();
        if(v == 0) {
            throw this.fail("No errors");
        }
        for(Object object0: this.errors) {
            Throwable throwable0 = (Throwable)object0;
            try {
                if(predicate0.test(throwable0)) {
                    goto label_10;
                }
                goto label_13;
            }
            catch(Exception exception0) {
                throw ExceptionHelper.wrapOrThrow(exception0);
            }
        label_10:
            if(v != 1) {
                throw this.fail("Error present but other errors as well");
            }
            return this;
        label_13:
            if(false) {
                break;
            }
        }
        throw this.fail("Error not present");
    }

    public final BaseTestConsumer assertError(Class class0) {
        return this.assertError(Functions.isInstanceOf(class0));
    }

    public final BaseTestConsumer assertError(Throwable throwable0) {
        return this.assertError(Functions.equalsWith(throwable0));
    }

    public final BaseTestConsumer assertErrorMessage(String s) {
        switch(this.errors.size()) {
            case 0: {
                throw this.fail("No errors");
            }
            case 1: {
                String s1 = ((Throwable)this.errors.get(0)).getMessage();
                if(!ObjectHelper.equals(s, s1)) {
                    throw this.fail("Error message differs; exptected: " + s + " but was: " + s1);
                }
                return this;
            }
            default: {
                throw this.fail("Multiple errors");
            }
        }
    }

    public final BaseTestConsumer assertFailure(Predicate predicate0, Object[] arr_object) {
        return this.assertSubscribed().assertValues(arr_object).assertError(predicate0).assertNotComplete();
    }

    public final BaseTestConsumer assertFailure(Class class0, Object[] arr_object) {
        return this.assertSubscribed().assertValues(arr_object).assertError(class0).assertNotComplete();
    }

    public final BaseTestConsumer assertFailureAndMessage(Class class0, String s, Object[] arr_object) {
        return this.assertSubscribed().assertValues(arr_object).assertError(class0).assertErrorMessage(s).assertNotComplete();
    }

    public final BaseTestConsumer assertNever(Predicate predicate0) {
        int v = this.values.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Object object0 = this.values.get(v1);
            try {
                if(predicate0.test(object0)) {
                    throw this.fail("Value at position " + v1 + " matches predicate " + predicate0.toString() + ", which was not expected.");
                }
            }
            catch(Exception exception0) {
                throw ExceptionHelper.wrapOrThrow(exception0);
            }
        }
        return this;
    }

    public final BaseTestConsumer assertNever(Object object0) {
        int v = this.values.size();
        int v1 = 0;
        while(v1 < v) {
            if(!ObjectHelper.equals(this.values.get(v1), object0)) {
                ++v1;
                continue;
            }
            StringBuilder stringBuilder0 = b.s(v1, "Value at position ", " is equal to ");
            stringBuilder0.append(BaseTestConsumer.valueAndClass(object0));
            stringBuilder0.append("; Expected them to be different");
            throw this.fail(stringBuilder0.toString());
        }
        return this;
    }

    public final BaseTestConsumer assertNoErrors() {
        if(this.errors.size() != 0) {
            throw this.fail("Error(s) present: " + this.errors);
        }
        return this;
    }

    public final BaseTestConsumer assertNoTimeout() {
        if(this.timeout) {
            throw this.fail("Timeout?!");
        }
        return this;
    }

    public final BaseTestConsumer assertNoValues() {
        return this.assertValueCount(0);
    }

    public final BaseTestConsumer assertNotComplete() {
        long v = this.completions;
        int v1 = Long.compare(v, 1L);
        if(v1 == 0) {
            throw this.fail("Completed!");
        }
        if(v1 > 0) {
            throw this.fail("Multiple completions: " + v);
        }
        return this;
    }

    public abstract BaseTestConsumer assertNotSubscribed();

    public final BaseTestConsumer assertNotTerminated() {
        if(this.done.getCount() == 0L) {
            throw this.fail("Subscriber terminated!");
        }
        return this;
    }

    public final BaseTestConsumer assertResult(Object[] arr_object) {
        return this.assertSubscribed().assertValues(arr_object).assertNoErrors().assertComplete();
    }

    public abstract BaseTestConsumer assertSubscribed();

    public final BaseTestConsumer assertTerminated() {
        if(this.done.getCount() != 0L) {
            throw this.fail("Subscriber still running!");
        }
        long v = this.completions;
        if(v > 1L) {
            throw this.fail("Terminated with multiple completions: " + v);
        }
        int v1 = this.errors.size();
        if(v1 > 1) {
            throw this.fail("Terminated with multiple errors: " + v1);
        }
        if(v != 0L && v1 != 0) {
            throw this.fail("Terminated with multiple completions and errors: " + v);
        }
        return this;
    }

    public final BaseTestConsumer assertTimeout() {
        if(!this.timeout) {
            throw this.fail("No timeout?!");
        }
        return this;
    }

    public final BaseTestConsumer assertValue(Predicate predicate0) {
        this.assertValueAt(0, predicate0);
        if(this.values.size() > 1) {
            throw this.fail("Value present but other values as well");
        }
        return this;
    }

    public final BaseTestConsumer assertValue(Object object0) {
        if(this.values.size() != 1) {
            throw this.fail("expected: " + BaseTestConsumer.valueAndClass(object0) + " but was: " + this.values);
        }
        Object object1 = this.values.get(0);
        if(!ObjectHelper.equals(object0, object1)) {
            throw this.fail("expected: " + BaseTestConsumer.valueAndClass(object0) + " but was: " + BaseTestConsumer.valueAndClass(object1));
        }
        return this;
    }

    public final BaseTestConsumer assertValueAt(int v, Predicate predicate0) {
        if(this.values.size() == 0) {
            throw this.fail("No values");
        }
        if(v >= this.values.size()) {
            throw this.fail("Invalid index: " + v);
        }
        try {
            if(predicate0.test(this.values.get(v))) {
                return this;
            }
        }
        catch(Exception exception0) {
            throw ExceptionHelper.wrapOrThrow(exception0);
        }
        throw this.fail("Value not present");
    }

    public final BaseTestConsumer assertValueAt(int v, Object object0) {
        int v1 = this.values.size();
        if(v1 == 0) {
            throw this.fail("No values");
        }
        if(v >= v1) {
            throw this.fail("Invalid index: " + v);
        }
        Object object1 = this.values.get(v);
        if(!ObjectHelper.equals(object0, object1)) {
            throw this.fail("expected: " + BaseTestConsumer.valueAndClass(object0) + " but was: " + BaseTestConsumer.valueAndClass(object1));
        }
        return this;
    }

    public final BaseTestConsumer assertValueCount(int v) {
        int v1 = this.values.size();
        if(v1 != v) {
            throw this.fail("Value counts differ; expected: " + v + " but was: " + v1);
        }
        return this;
    }

    public final BaseTestConsumer assertValueSequence(Iterable iterable0) {
        Iterator iterator0 = this.values.iterator();
        Iterator iterator1 = iterable0.iterator();
        int v = 0;
        while(true) {
            boolean z = iterator1.hasNext();
            boolean z1 = iterator0.hasNext();
            if(!z1 || !z) {
                break;
            }
            Object object0 = iterator1.next();
            Object object1 = iterator0.next();
            if(ObjectHelper.equals(object0, object1)) {
                ++v;
                continue;
            }
            StringBuilder stringBuilder0 = b.s(v, "Values at position ", " differ; expected: ");
            stringBuilder0.append(BaseTestConsumer.valueAndClass(object0));
            stringBuilder0.append(" but was: ");
            stringBuilder0.append(BaseTestConsumer.valueAndClass(object1));
            throw this.fail(stringBuilder0.toString());
        }
        if(z1) {
            throw this.fail("More values received than expected (" + v + ")");
        }
        if(z) {
            throw this.fail("Fewer values received than expected (" + v + ")");
        }
        return this;
    }

    public final BaseTestConsumer assertValueSequenceOnly(Iterable iterable0) {
        return this.assertSubscribed().assertValueSequence(iterable0).assertNoErrors().assertNotComplete();
    }

    public final BaseTestConsumer assertValueSet(Collection collection0) {
        if(collection0.isEmpty()) {
            this.assertNoValues();
            return this;
        }
        for(Object object0: this.values) {
            if(!collection0.contains(object0)) {
                throw this.fail("Value not in the expected collection: " + BaseTestConsumer.valueAndClass(object0));
            }
            if(false) {
                break;
            }
        }
        return this;
    }

    public final BaseTestConsumer assertValueSetOnly(Collection collection0) {
        return this.assertSubscribed().assertValueSet(collection0).assertNoErrors().assertNotComplete();
    }

    public final BaseTestConsumer assertValues(Object[] arr_object) {
        int v = this.values.size();
        if(v != arr_object.length) {
            throw this.fail("Value count differs; expected: " + arr_object.length + " " + Arrays.toString(arr_object) + " but was: " + v + " " + this.values);
        }
        int v1 = 0;
        while(v1 < v) {
            Object object0 = this.values.get(v1);
            Object object1 = arr_object[v1];
            if(ObjectHelper.equals(object1, object0)) {
                ++v1;
                continue;
            }
            StringBuilder stringBuilder0 = b.s(v1, "Values at position ", " differ; expected: ");
            stringBuilder0.append(BaseTestConsumer.valueAndClass(object1));
            stringBuilder0.append(" but was: ");
            stringBuilder0.append(BaseTestConsumer.valueAndClass(object0));
            throw this.fail(stringBuilder0.toString());
        }
        return this;
    }

    public final BaseTestConsumer assertValuesOnly(Object[] arr_object) {
        return this.assertSubscribed().assertValues(arr_object).assertNoErrors().assertNotComplete();
    }

    public final BaseTestConsumer await() throws InterruptedException {
        if(this.done.getCount() == 0L) {
            return this;
        }
        this.done.await();
        return this;
    }

    public final boolean await(long v, TimeUnit timeUnit0) throws InterruptedException {
        boolean z = this.done.getCount() == 0L || this.done.await(v, timeUnit0);
        this.timeout = !z;
        return z;
    }

    public final BaseTestConsumer awaitCount(int v) {
        return this.awaitCount(v, TestWaitStrategy.SLEEP_10MS, 5000L);
    }

    public final BaseTestConsumer awaitCount(int v, Runnable runnable0) {
        return this.awaitCount(v, runnable0, 5000L);
    }

    public final BaseTestConsumer awaitCount(int v, Runnable runnable0, long v1) {
        long v2 = System.currentTimeMillis();
        while(true) {
            if(v1 > 0L && System.currentTimeMillis() - v2 >= v1) {
                this.timeout = true;
                return this;
            }
            if(this.done.getCount() == 0L || this.values.size() >= v) {
                return this;
            }
            runnable0.run();
        }
    }

    public final BaseTestConsumer awaitDone(long v, TimeUnit timeUnit0) {
        try {
            if(!this.done.await(v, timeUnit0)) {
                this.timeout = true;
                this.dispose();
                return this;
            }
            return this;
        }
        catch(InterruptedException interruptedException0) {
            this.dispose();
            throw ExceptionHelper.wrapOrThrow(interruptedException0);
        }
    }

    public final boolean awaitTerminalEvent() {
        try {
            this.await();
            return true;
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final boolean awaitTerminalEvent(long v, TimeUnit timeUnit0) {
        try {
            return this.await(v, timeUnit0);
        }
        catch(InterruptedException unused_ex) {
            Thread.currentThread().interrupt();
            return false;
        }
    }

    public final BaseTestConsumer clearTimeout() {
        this.timeout = false;
        return this;
    }

    public final long completions() {
        return this.completions;
    }

    public final int errorCount() {
        return this.errors.size();
    }

    public final List errors() {
        return this.errors;
    }

    public final AssertionError fail(String s) {
        StringBuilder stringBuilder0 = new StringBuilder(s.length() + 0x40);
        stringBuilder0.append(s);
        stringBuilder0.append(" (latch = ");
        stringBuilder0.append(this.done.getCount());
        stringBuilder0.append(", values = ");
        stringBuilder0.append(this.values.size());
        stringBuilder0.append(", errors = ");
        stringBuilder0.append(this.errors.size());
        stringBuilder0.append(", completions = ");
        stringBuilder0.append(this.completions);
        if(this.timeout) {
            stringBuilder0.append(", timeout!");
        }
        if(this.isDisposed()) {
            stringBuilder0.append(", disposed!");
        }
        CharSequence charSequence0 = this.tag;
        if(charSequence0 != null) {
            stringBuilder0.append(", tag = ");
            stringBuilder0.append(charSequence0);
        }
        stringBuilder0.append(')');
        AssertionError assertionError0 = new AssertionError(stringBuilder0.toString());
        if(!this.errors.isEmpty()) {
            if(this.errors.size() == 1) {
                assertionError0.initCause(((Throwable)this.errors.get(0)));
                return assertionError0;
            }
            assertionError0.initCause(new CompositeException(this.errors));
        }
        return assertionError0;
    }

    public final List getEvents() {
        List list0 = new ArrayList();
        ((ArrayList)list0).add(this.values());
        ((ArrayList)list0).add(this.errors());
        ArrayList arrayList0 = new ArrayList();
        for(long v = 0L; v < this.completions; ++v) {
            arrayList0.add(Notification.createOnComplete());
        }
        ((ArrayList)list0).add(arrayList0);
        return list0;
    }

    public final boolean isTerminated() {
        return this.done.getCount() == 0L;
    }

    public final boolean isTimeout() {
        return this.timeout;
    }

    public final Thread lastThread() {
        return this.lastThread;
    }

    public static String valueAndClass(Object object0) {
        return object0 == null ? "null" : object0 + " (class: " + object0.getClass().getSimpleName() + ")";
    }

    public final int valueCount() {
        return this.values.size();
    }

    public final List values() {
        return this.values;
    }

    public final BaseTestConsumer withTag(CharSequence charSequence0) {
        this.tag = charSequence0;
        return this;
    }
}

