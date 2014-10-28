/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */

package org.apache.qpid.jms.test.testpeer.describedtypes;

import org.apache.qpid.jms.test.testpeer.ListDescribedType;
import org.apache.qpid.proton.amqp.Symbol;
import org.apache.qpid.proton.amqp.UnsignedLong;

/**
 * Generated by generate-frames.xsl, which resides in this package.
 */
public class Declared extends ListDescribedType
{
    public static final Symbol DESCRIPTOR_SYMBOL = Symbol.valueOf("amqp:declared:list");
    public static final UnsignedLong DESCRIPTOR_CODE = UnsignedLong.valueOf(0x0000000000000033L);


    private static final int FIELD_TXN_ID = 0;

    public Declared(Object... fields)
    {
        super(1);
        int i = 0;
        for(Object field : fields)
        {
            getFields()[i++] = field;
        }
    }

    @Override
    public Symbol getDescriptor()
    {
        return DESCRIPTOR_SYMBOL;
    }

    public Declared setTxnId(Object o)
    {
        getFields()[FIELD_TXN_ID] = o;
        return this;
    }

}

