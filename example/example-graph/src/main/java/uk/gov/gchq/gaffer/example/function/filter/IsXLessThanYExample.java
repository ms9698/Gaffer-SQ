/*
 * Copyright 2016 Crown Copyright
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package uk.gov.gchq.gaffer.example.function.filter;

import uk.gov.gchq.gaffer.function.filter.IsXLessThanY;

public class IsXLessThanYExample extends FilterFunctionExample {
    public static void main(final String[] args) {
        new IsXLessThanYExample().run();
    }

    public IsXLessThanYExample() {
        super(IsXLessThanY.class);
    }

    public void runExamples() {
        isXLessThanY();
    }

    public void isXLessThanY() {
        // ---------------------------------------------------------
        final IsXLessThanY function = new IsXLessThanY();
        // ---------------------------------------------------------

        runExample(function,
                new Comparable[]{1, 5},
                new Comparable[]{5, 5},
                new Comparable[]{10, 5},
                new Comparable[]{1L, 5},
                new Comparable[]{1L, 5L},
                new Comparable[]{5L, 5L},
                new Comparable[]{10L, 5L},
                new Comparable[]{1, 5L},
                new Comparable[]{"bcd", "cde"},
                new Comparable[]{"bcd", "abc"},
                new Comparable[]{"1", 5}
        );
    }
}
