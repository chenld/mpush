/*
 * (C) Copyright 2015-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Contributors:
 *   ohun@live.cn (夜色)
 */

package com.mpush.monitor.quota;

public interface MemoryQuota extends MonitorQuota {

    // Heap
    long heapMemoryCommitted();

    long heapMemoryInit();

    long heapMemoryMax();

    long heapMemoryUsed();

    // NonHeap
    long nonHeapMemoryCommitted();

    long nonHeapMemoryInit();

    long nonHeapMemoryMax();

    long nonHeapMemoryUsed();

    // PermGen
    long permGenCommitted();

    long permGenInit();

    long permGenMax();

    long permGenUsed();

    // OldGen
    long oldGenCommitted();

    long oldGenInit();

    long oldGenMax();

    long oldGenUsed();

    // EdenSpace
    long edenSpaceCommitted();

    long edenSpaceInit();

    long edenSpaceMax();

    long edenSpaceUsed();

    // Survivor
    long survivorCommitted();

    long survivorInit();

    long survivorMax();

    long survivorUsed();

}
